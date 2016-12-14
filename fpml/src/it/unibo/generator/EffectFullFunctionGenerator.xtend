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
			public static «typeGenerator.compile(pf.returnType)» «pf.name» («typeGenerator.compile(Others.getArgumentType(pf.arg))» «Others.getArgumentName(pf.arg)»){
				«IF pf.functionBody instanceof EmptyFunctionBody»
				throw new UnsupportedOperationException("TODO");
				«ELSEIF pf.functionBody instanceof CompositionFunctionBodyEffect»
					«IF pf.higherOrderArg == null»
					return «commonEffectFullFunctions.compileIO((pf.functionBody as CompositionFunctionBodyEffect), pf.arg)»;
					«ELSE»
					return () -> { return ( «typeGenerator.compile(Others.getArgumentType(pf.higherOrderArg.arg2))» «Others.getArgumentName(pf.higherOrderArg.arg2)») -> «commonEffectFullFunctions.compileIO((pf.functionBody as CompositionFunctionBodyEffect), pf.arg)»; };
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
				.safe().run().on((IOException e) -> { e.printStackTrace(); return Unit.unit(); });
				«ENDIF»
			}'''
		}
	}

	////////////////////////////////////////////////////////////////////////////////
	// IOWalkthrough
	///////////////////////////////////////////////////////////////////////////////

	def compileIOWalkthrough(CompositionFunctionBodyEffect cfbe) '''
		«val firstElementCompiled = Others.getFirstFunctionDefinitionFromCompositionBodyEffectFull(cfbe).compileIOWalkthrough»
		«val Function2<String, CompositionFunctionBodyEffectFullFactor, String>  f = [String acc, CompositionFunctionBodyEffectFullFactor x | acc + x.compileIOWalkThough + "\n\t"]»
		«cfbe.functionChain.fold(firstElementCompiled + "\n\t", f) »'''
	
	def compileIOWalkThough(CompositionFunctionBodyEffectFullFactor f) {
		val e = Others.getFunctionDefinitionFromEffectFullFactor(f)
		return e.compileIOWalkthrough	
	}	
	
	def compileIOWalkthrough(EffectFullBodyContent e){
		switch e {
			EffectFullFunction: compileIOWalkthrough(e)
			EffectFullPrimitive: compileIOWalkthrough(e)
			EffectFullExpression: '''.append(«commonEffectFullFunctions.compile(e)»)'''
		}
	}
	
	def compileIOWalkthrough(EffectFullPrimitive efp){
		switch efp {
			PrimitiveEffectFullFunction: compileIOWalkthrough(efp)
			PrimitiveEffectFullValue: compileIOWalkthrough(efp)
		}
	}
	
	def compileIOWalkthrough(EffectFullFunction eff){
		switch eff {
			EffectFullValue: '''.append(EffectFullValue.«eff.name»())'''
			EffectFullFunctionDefinition: return '''.bind(EffectFullFunctionDefinitions::«(eff as EffectFullFunctionDefinition).name»)'''
			PrimitiveEffectFullFunction: compileIOWalkthrough(eff)
		 	EffectFullArgument: '''.append(IOFunctions.unit(«(eff as EffectFullArgument).name»))'''
		}
	}
	
	def compileIOWalkthrough(PrimitiveEffectFullFunction pef){
		switch pef {
			PrimitivePrint: '''.bind(PrimitivesEffectFull::primitivePrint)'''
      		LeftAlgebraicIO: '''.bind(PrimitivesEffectFull::leftAlgebricIO)'''
      		RightAlgebraicIO:'''.bind(PrimitivesEffectFull::rightAlgebricIO)'''
      		ApplyFIO: '''.bind((«typeGenerator.compile(pef.functionType)» f) -> f.f(IOFunctions.runSafe(«commonEffectFullFunctions.compileIO(Others.getValueFromApplyFIOFactor(pef.value), null)»)))'''
			PrimitiveReturn: ''''''
			ExtractEffectFull: '''.bind((IEffectFullData«typeGenerator.compile(pef.data.content)» d) -> d.getValue())'''
			LiftPureFunction: compileIOWalkthrough(pef)
			LiftEffectFullFunction: compileIOWalkthrough(pef)
			IsLeftEffectFull: '''.bind(PrimitivesEffectFull::isLeft)'''
			IsRightEffectFull: '''.bind(PrimitivesEffectFull::isRight)'''
      		EffectFullIf: '''.bind((Boolean c) -> «IF (pef.then instanceof IOType)» «ELSE» IOFunctions.unit(«ENDIF»PrimtivesEffectFull.effectFullIf(c,«commonEffectFullFunctions.compile(pef.then)» ,«commonEffectFullFunctions.compile(pef.^else)»«IF (pef.then instanceof IOType)» «ELSE» )«ENDIF»)'''
      		EffectFullEitherIf: '''.bind((Boolean c) -> IOFuncions.unit(PrimtivesEffectFull.effectFullIfEither(c,«commonEffectFullFunctions.compile(pef.then)» ,«commonEffectFullFunctions.compile(pef.^else)»))'''
          	GetLine: '''.append(PrimitivesEffectFull::getLine)'''
		}
	}
	
	def compileIOWalkthrough(LiftEffectFullFunction lef) {
		switch lef {
			PrimitiveEffectFullFunction: compileIOWalkthrough(lef as PrimitiveEffectFullFunction)
			EffectFullFunction: compileIOWalkthrough(lef as EffectFullFunction)
		}
	}
	
	def compileIOWalkthrough(LiftPureFunction function) {
		val innerFunction = Others.getPureFunctionFromLiftPureFunction(function)
		switch innerFunction {
			PrimitivePureFunction: compileIOWalkthrough(innerFunction as PrimitivePureFunction)
			PureFunction: compileIOWalkthrough(innerFunction as PureFunction)
		}
	}
	
	def compileIOWalkthrough(PrimitiveEffectFullValue pev) {
		switch pev {
			PrimitiveRandom: '''.append(PrimitivesEffectFull.primitiveRandom())'''
			PrimitiveTime: '''.append(PrimitivesEffectFull.primitiveTime())'''
		}	
	}
	
	def compileIOWalkthrough(PrimitivePureFunction ppf){
		switch ppf {
			IntToString: '''.map(Primitives::intToString)'''
			IntPow: '''.map(Primitives::intPow)'''
			Plus: ".map(Primitives::plus)"
			Minus: ".map(Primitives::minus)"
			Times: ".map(Primitives::times)"
			Mod: ".map(Primitives::mod)"
			ApplyF: '''.map((«typeGenerator.compile(ppf.functionType)» f) -> f.f(«commonPureFunctions.compileApplyFFactor(ppf.value, "", true)»))''' 
			LeftAlgebraic: ".map(Primitives::leftAlgebraic)" 
			RightAlgebraic: ".map(Primitives::rightAlgebric)"
			Equals: '''.map(Primitives::equalsCurryng)'''
			MinorEquals: '''.map(Primitives::minorEquals)'''
			MajorEquals: '''.map(Primitives::majorEquals)'''
			Minor: '''.map(Primitives::minor)'''
			Major: '''.map(Primitives::major)'''
			LogicAnd: '''.map(Primitives::logicAnd)'''
			LogicOr: '''.map(Primitives::logicOr)'''
      LogicNot: '''.map(Primitives::logicNot)'''
			ExtractPure: '''.bind((IPureData<«typeGenerator.compile(ppf.data.content)»> d) -> d.getValue())'''
			IsLeftPure: '''.map(Primitives::isLeft)'''
			IsRightPure: '''.map(Primitives::isRight)'''
			PureIf: '''.map((Boolean c) -> Primitives.pureIf(c, «commonPureFunctions.compile(ppf.then)», «commonPureFunctions.compile(ppf.^else)»))'''
      		PureEitherIf: '''.map((Boolean c) -> Primitives.pureIfEither(c, «commonPureFunctions.compile(ppf.then)», «commonPureFunctions.compile(ppf.^else)»))'''
		}
	}
	
	def compileIOWalkthrough(PureFunction pf) {
		switch pf {
			// PrimitivePureFunction in previous liftpurefunction switch
			PureArgument: '''.append(«pf.name»)'''
			Expression: '''.append(«commonPureFunctions.compile(pf)»)'''
			PureValue: return '''.append(IOFunctions.unit(PureValue.«(pf as PureValue).name»()))'''
			PureLambda: {
				if (pf.arg == null)
					'''.bind(() -> «commonPureFunctions.compile(pf.functionBody,"" , true)»)'''
				else
					'''.bind((«typeGenerator.compile(pf.arg.type)» «pf.arg.name») -> «commonPureFunctions.compile(pf.functionBody, pf.arg.name, true)»)'''
			}
			PureFunctionDefinition: return '''.map(PureFunctionDefinitions::«(pf as PureFunctionDefinition).name»)'''
		}
	}
	
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////
	// Main
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
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