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
					return ( «typeGenerator.compile(pf.higherOrderArg.arg2)» ) -> «compileIO((pf.functionBody as CompositionFunctionBodyEffect), pf.arg)»;
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
	
	def compileIO(CompositionFunctionBodyEffect cfbe, EffectFullArgument arg) '''
		«val firstElementCompiled = compileIO(Others.getFirstFunctionDefinitionFromCompositionBodyEffectFull(cfbe), arg.name)»
		«val Function2<String, CompositionFunctionBodyEffectFullFactor, String>  f = [String acc, CompositionFunctionBodyEffectFullFactor x | compileIO(Others.getFunctionDefinitionFromEffectFullFactor(x), acc) + "\n\t"]»
		«cfbe.functionChain.fold(firstElementCompiled + "\n\t", f) »'''
	
	
	def compileIO(EffectFullReference e, String valueName){
		switch e {
			IntToString: '''IOFunctions.map(«valueName» ,Primitives::intToString)'''
      		IntPow: '''IOFunctions.map(«valueName»,Primitives::intPow) '''
			Plus: '''IOFunctions.map(«valueName», Primitives::plus)'''
			Minus: '''IOFunctions.map(«valueName», Primitives::minus)'''
			Times: '''IOFunctions.map(«valueName», Primitives::times)'''
			Mod: '''IOFunctions.map(«valueName», Primitives::mod)'''
			PrimitivePrint: '''IOFunctions.bind(«valueName», PrimitivesEffectFull::primitivePrint)'''
			PrimitiveRandom: '''IOFunctions.bind(«valueName», PrimitivesEffectFull::primitiveRandom)'''
	//		ApplyFIO: '''IOFunctions.bind(«valueName», PrimitivesEffectFull::ApplyFIO(«e.value.compileIO»))'''
			ApplyF: '''«valueName».f(«pureFunctionGenerator.compile(e.value,"", true)»)'''
			PureValue: return '''IOFunctions.unit(Value.«(e as PureValue).name»())'''
			PureFunctionDefinition: return '''IOFunctions.map(«valueName», PureFunctionDefinitions::«(e as PureFunctionDefinition).name»)'''
      		EffectFullArgument: return '''IOFunctions.unit(«(e as EffectFullArgument).name»)'''
			EffectFullFunctionDefinition: return '''IOFunctions.bind(«valueName», EffectFullFunctionDefinitions::«(e as EffectFullFunctionDefinition).name»)''' 
		}
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
			PrimitiveRandom: '''.bind(PrimitivesEffectFull::primitiveRandom)'''
			ApplyFIO: '''.bind(PrimitivesEffectFull::ApplyFIO(«Others.getValueFromApplyFIOFactor(e.value).compileIOWalkthorugh»))'''
			ApplyF: '''.map((«typeGenerator.compile(e.functionType)» f) -> f.f(«pureFunctionGenerator.compile(e.value, "", true)»))'''
			PureValue: return '''.append(IOFunctions.unit(Value.«(e as PureValue).name»()))'''
			PureFunctionDefinition: return '''.map(PureFunctionDefinitions::«(e as PureFunctionDefinition).name»)'''
      		EffectFullArgument: return '''.append(IOFunctions.unit(«(e as EffectFullArgument).name»))'''
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