package it.unibo.generator

import it.unibo.fPML.*
import org.eclipse.xtext.xbase.lib.Functions.Function2
import it.unibo.validation.utilitiesFunctions.Others

class EffectFullFunctionGenerator {
	
	val typeGenerator = new TypeGenerator
	val pureFunctionGenerator = new PureFunctionGenerator
	
	def compile(EffectFullFunctionBlock effb) '''
	    package «FPMLGenerator.basePackageJava»Effectfull;
	    		
	    import «FPMLGenerator.basePackageJava»Pure.Data.*;
	    import fj.data.*;
	    import fj.F;
	    import fj.Unit;
	    import «FPMLGenerator.basePackageJava»Effectfull.Data.*;
	    import «FPMLGenerator.basePackageJava»Pure.*;
	    
	    public class EffectFullFunctionDefinitions {
	    	«FOR f:effb.features»
	    		«f.compile»
	    	«ENDFOR»
	    }'''
	    
	def compile(EffectFullFunctionDefinition pf) {
		if (pf.name != "main") {
			return '''
			public static «typeGenerator.compile(pf.returnType)» «pf.name» («typeGenerator.compile(pf.arg)»){
				«IF pf.functionBody instanceof EmptyFunctionBody»
				throw new UnsupportedOperationException("TODO");
				«ELSEIF pf.functionBody instanceof CompositionFunctionBodyEffect»
					«IF pf.higherOrderArg == null»
					return «compileIO((pf.functionBody as CompositionFunctionBodyEffect), pf.arg)»;
					«ELSE»
					return IOFunctions.unit(( «typeGenerator.compile(pf.higherOrderArg.arg2)» ) -> «compileIO((pf.functionBody as CompositionFunctionBodyEffect), pf.arg)»);
					«ENDIF»
				«ENDIF»
			}'''
		}else {
			return '''
			public static void «pf.name»(String[] args){
				«IF pf.functionBody instanceof EmptyFunctionBody»
				throw new UnsupportedOperationException("TODO");
				«ELSEIF pf.functionBody instanceof CompositionFunctionBodyEffect»
				IOW.lift(IOFunctions.ioUnit)«(pf.functionBody as CompositionFunctionBodyEffect).compileIOWalkthrough»
				«ENDIF»
				.safe().run().on((IOException e) -> { e.printStackTrace(); return Unit.unit(); });
			}'''
		}
	}

	//////////////////////////////////////////////////////////////////////////////////
	// IO Functions
	//////////////////////////////////////////////////////////////////////////////////
	
	def compileIO(CompositionFunctionBodyEffect cfbe, EffectFullArgument arg) {
		var String argName = ""
		if (arg != null){
			argName = "IOFunctions.unit(" + arg.name + ")"
 		}
		var String result = compileIO(Others.getFirstFunctionDefinitionFromCompositionBodyEffectFull(cfbe), argName).toString
		for (CompositionFunctionBodyEffectFullFactor cfbef: cfbe.functionChain){
			result += "\n\t"
			result = compileIO(Others.getFunctionDefinitionFromEffectFullFactor(cfbef), result.toString).toString
		}
		return result;
	}
	
	
	def compileIO(EffectFullReference e, String valueName){
		switch e {
			IntToString: '''IOFunctions.map(«valueName» ,Primitives::intToString)'''
      		IntPow: '''IOFunctions.map(«valueName»,Primitives::intPow) '''
			Plus: '''IOFunctions.map(«valueName», Primitives::plus)'''
			Minus: '''IOFunctions.map(«valueName», Primitives::minus)'''
			Times: '''IOFunctions.map(«valueName», Primitives::times)'''
			Mod: '''IOFunctions.map(«valueName», Primitives::mod)'''
			PrimitivePrint: '''IOFunctions.bind(«valueName», PrimitivesEffectFull::primitivePrint)'''
			PrimitiveRandom: valueEmbellishment(valueName,"PrimitivesEffectFull.primitiveRandom()")
      		PrimitiveTime: valueEmbellishment(valueName,"PrimitivesEffectFull.primitiveTime()")
      		PrimitiveReturn: '''«valueName»'''
			ApplyFIO: '''IOFunctions.bind(«valueName», («typeGenerator.compile(e.functionType)» f) -> f.f(IOFunctions.runSafe(«compileIO(Others.getValueFromApplyFIOFactor(e.value), null)»)))'''
			ApplyF: '''IOFunctions.unit(IOFunctions.runSafe(«valueName»).f(«pureFunctionGenerator.compile(e.value,"", true)»))'''
			PureValue: valueEmbellishment(valueName,'''IOFunctions.unit(PureValue.«(e as PureValue).name»())''')
			EffectFullValue: valueEmbellishment(valueName,'''EffectFullValue.«(e as EffectFullValue).name»()''')
			PureFunctionDefinition: return '''IOFunctions.map(«valueName», PureFunctionDefinitions::«(e as PureFunctionDefinition).name»)'''
      		EffectFullArgument: valueEmbellishment(valueName,'''IOFunctions.unit(«(e as EffectFullArgument).name»)''')
      		EffectFullFunctionDefinition: return '''IOFunctions.bind(«valueName», EffectFullFunctionDefinitions::«(e as EffectFullFunctionDefinition).name»)''' 
		}
	}

	def valueEmbellishment(String inputChain, String valueCompiled){
		if (inputChain.isNullOrEmpty) {
			return valueCompiled;
		}else
			return '''IOFunctions.as(«inputChain»,«valueCompiled»)'''
	}


	////////////////////////////////////////////////////////////////////////////////
	// IOWalkthrough
	///////////////////////////////////////////////////////////////////////////////

	def compileIOWalkthrough(CompositionFunctionBodyEffect cfbe) '''
		«val firstElementCompiled = Others.getFirstFunctionDefinitionFromCompositionBodyEffectFull(cfbe).compileIOWalkthorugh»
		«val Function2<String, CompositionFunctionBodyEffectFullFactor, String>  f = [String acc, CompositionFunctionBodyEffectFullFactor x | acc + x.compileIOWalkThough + "\n\t"]»
		«cfbe.functionChain.fold(firstElementCompiled + "\n\t", f) »'''
	
	def compileIOWalkThough(CompositionFunctionBodyEffectFullFactor f) {
		val e = Others.getFunctionDefinitionFromEffectFullFactor(f)
		return e.compileIOWalkthorugh	
	}	
	
	def compileIOWalkthorugh(EffectFullReference e){
		switch e {
			IntToString: '''.map(Primitives::intToString)'''
      		IntPow: '''.map(Primitives::intPow) '''
			Plus: ".map(Primitives::plus)"
			Minus: ".map(Primitives::minus)"
			Times: ".map(Primitives::times)"
			Mod: ".map(Primitives::mod)"
			PrimitivePrint: '''.bind(PrimitivesEffectFull::primitivePrint)'''
			PrimitiveRandom: '''.append(PrimitivesEffectFull.primitiveRandom())'''
      		PrimitiveTime: '''.append(PrimitivesEffectFull.primitiveTime())'''
      		PrimitiveReturn: ''''''
			ApplyFIO: '''.bind((«typeGenerator.compile(e.functionType)» f) -> f.f(IOFunctions.runSafe(«compileIO(Others.getValueFromApplyFIOFactor(e.value), null)»)))'''
			ApplyF: '''.map((«typeGenerator.compile(e.functionType)» f) -> f.f(«pureFunctionGenerator.compile(e.value, "", true)»))'''
			PureValue: return '''.append(IOFunctions.unit(PureValue.«(e as PureValue).name»()))'''
			PureFunctionDefinition: return '''.map(PureFunctionDefinitions::«(e as PureFunctionDefinition).name»)'''
      		EffectFullArgument: return '''.append(IOFunctions.unit(«(e as EffectFullArgument).name»))'''
      		EffectFullValue: return '''.append(EffectFullValue.«e.name»())'''
			EffectFullFunctionDefinition: return '''.bind(EffectFullFunctionDefinitions::«(e as EffectFullFunctionDefinition).name»)''' 
		}
	}
	
	def compile(MainFunc mf)'''
		package «FPMLGenerator.basePackageJava»Effectfull;
		
		import «FPMLGenerator.basePackageJava»Pure.Data.*;
		import fj.data.*;
		import java.io.IOException;
		import fj.Unit;
		import fj.F;
		import «FPMLGenerator.basePackageJava»Effectfull.Data.*;
		import «FPMLGenerator.basePackageJava»Pure.*;
		
		public class EntryPoint {
			«compileMain(mf)»
		}'''
	
	def compileMain(MainFunc mf){
		val effectFullMainReturnType = FPMLFactory.eINSTANCE.createIOType()
		effectFullMainReturnType.type = FPMLFactory.eINSTANCE.createUnitType()
		val effectFullMain = FPMLFactory.eINSTANCE.createEffectFullFunctionDefinition()
		effectFullMain.functionBody = mf.functionBody
		effectFullMain.returnType = effectFullMainReturnType
		effectFullMain.name = "main"
		effectFullMain.compile
	}
}