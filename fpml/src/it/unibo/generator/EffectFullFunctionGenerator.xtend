package it.unibo.generator

import it.unibo.fPML.*
import org.eclipse.xtext.xbase.lib.Functions.Function2
import it.unibo.validation.utilitiesFunctions.Others
import it.unibo.validation.utilitiesFunctions.GetReturnType

class EffectFullFunctionGenerator {
	
	val typeGenerator = new TypeGenerator
	val commonPureFunctions = new ValuePureFunctionCommonGenerator
	val commonEffectFullFunctions = new ValueEffectFullFunctionCommonGenerator
	
	def compile(EffectFullFunctionBlock effb) '''
	    package «FPMLGenerator.basePackageJava»Effectfull;
	    		
	    import «FPMLGenerator.basePackageJava»Pure.Data.*;
	    import fj.data.*;
	    import fj.*;
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
			public static «typeGenerator.compile(pf.returnType)» «pf.name» («typeGenerator.compile(Others.getArgumentType(pf.arg))»){
				«IF pf.functionBody instanceof EmptyFunctionBody»
				throw new UnsupportedOperationException("TODO");
				«ELSEIF pf.functionBody instanceof CompositionFunctionBodyEffect»
					«IF pf.higherOrderArg == null»
					return «commonEffectFullFunctions.compileIO((pf.functionBody as CompositionFunctionBodyEffect), pf.arg)»;
					«ELSE»
					return () -> { return ( «typeGenerator.compile(Others.getArgumentType(pf.higherOrderArg.arg2))» ) -> «commonEffectFullFunctions.compileIO((pf.functionBody as CompositionFunctionBodyEffect), pf.arg)»; };
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
	
	def compileIOWalkthorugh(EffectFullBodyContent e){
		switch e {
			IntToString: '''.map(Primitives::intToString)'''
      		IntPow: '''.map(Primitives::intPow) '''
			Plus: ".map(Primitives::plus)"
			Minus: ".map(Primitives::minus)"
			Times: ".map(Primitives::times)"
      		LeftPair: ".map(Primitives::leftPair)"
      		RightPair: ".map(Primitives::rightPair)"
      		Mod: ".map(Primitives::mod)"
			PrimitivePrint: '''.bind(PrimitivesEffectFull::primitivePrint)'''
      		LeftPairIO: '''.bind(PrimitivesEffectFull::leftPairIO)'''
      		RightPairIO:'''.bind(PrimitivesEffectFull::rightPairIO)'''
			PrimitiveRandom: '''.append(PrimitivesEffectFull.primitiveRandom())'''
      		PrimitiveTime: '''.append(PrimitivesEffectFull.primitiveTime())'''
      		PrimitiveReturn: ''''''
      		ExtractPure: '''.bind((IPureData<«typeGenerator.compile(e.data.content)»> d) -> d.getValue())'''
			ApplyFIO: '''.bind((«typeGenerator.compile(e.functionType)» f) -> f.f(IOFunctions.runSafe(«commonEffectFullFunctions.compileIO(Others.getValueFromApplyFIOFactor(e.value), null)»)))'''
			ApplyF: '''.map((«typeGenerator.compile(e.functionType)» f) -> f.f(«commonPureFunctions.compileApplyFFactor(e.value, "", true)»))'''
			PureValue: return '''.append(IOFunctions.unit(PureValue.«(e as PureValue).name»()))'''
			PureFunctionDefinition: return '''.map(PureFunctionDefinitions::«(e as PureFunctionDefinition).name»)'''
      		EffectFullArgument: return '''.append(IOFunctions.unit(«(e as EffectFullArgument).name»))'''
      		EffectFullValue: return '''.append(EffectFullValue.«e.name»())'''
			EffectFullFunctionDefinition: return '''.bind(EffectFullFunctionDefinitions::«(e as EffectFullFunctionDefinition).name»)''' 
			EffectFullExpression: return '''.append(«commonEffectFullFunctions.compile(e)»)'''
			ExtractEffectFull: '''.bind((IEffectFullData«typeGenerator.compile(e.data.content)» d) -> d.getValue())'''
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