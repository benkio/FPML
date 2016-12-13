package it.unibo.generator

import it.unibo.fPML.*
import it.unibo.validation.utilitiesFunctions.Others
import it.unibo.validation.utilitiesFunctions.GetReturnType
import it.unibo.fPML.EffectFullFunction

class ValueEffectFullFunctionCommonGenerator {
	
	val typeGenerator = new TypeGenerator
	val commonFunctions = new ValuePureFunctionCommonGenerator
	val commonPureFunctions = new ValuePureFunctionCommonGenerator
	
	def String compile(EffectFullExpression e) {
		switch e {
			EffectFullFunctionType: return e.compile 
			EffectFullDataValue: '''new «e.type.name»(«compileAdtValue(e.value,e.type.content)»)'''
			EffectFullProdValue: '''P.p(«e.prodAdtElement1.compile», «e.prodAdtElement2.compile»)'''
			EffectFullSumValue: {
				if (e.sumAdtElement1 == null) return '''Either.right(«e.sumAdtElement2.compile»)'''
				return '''Either.left(«e.sumAdtElement1.compile»)'''
			}
			EffectFullValueRef: '''EffectFullValue.«e.value.name»()'''
			IOExpression: return "IOFunctions.unit(" + commonFunctions.compile(e.innerValue as Expression) + ")"
			IOEffectFullExpression: return "IOFunctions.unit(" + (e.innerValue as EffectFullExpression).compile + ")"
			IOPureFunction: '''IOFunctions.unit(«commonPureFunctions.compilePureFunctionRef(Others.getPureFunctionFromIOPureFunction(e))»)'''
			IOEffectFullFunction: '''IOFunctions.unit(«compileEffectFullFunctionRef(Others.getEffectFullFunctionFromIOEffectFullFunction(e))»)'''
		}	
	}
	
	def String compileEffectFullFunctionRef(EffectFullFunction function) {
		switch function {
			// PrimitiveEffectFullFunction: cannot happen because hasn't the reference, the name. 
			EffectFullValue: '''EffectFullValue::«(function as EffectFullValue).name»'''
			EffectFullFunctionDefinition: '''EffectFullFunctionDefinitions::«function.name»'''
			EffectFullArgument: (function as EffectFullArgument).name
		}
	}
	
	def compileAdtValue(EffectFullExpression v, Type d) {
		switch v {
			EffectFullSumValue: {
				if (v.sumAdtElement1 == null) return '''Either.right(«compileAdtValue(v.sumAdtElement2, Others.getElement2ValueTypeFromEffectFullAlgebraicType(d as EffectFullAlgebraicType))»)'''
				return '''Either.left(«compileAdtValue(v.sumAdtElement1, ((d as EffectFullAlgebraicType).effectFullAdtElement1))»)'''
			}
			EffectFullProdValue: return '''P.p(«compileAdtValue(v.prodAdtElement1,(d as EffectFullAlgebraicType).effectFullAdtElement1)»,«compileAdtValue(v.prodAdtElement2, Others.getElement2ValueTypeFromEffectFullAlgebraicType(d as EffectFullAlgebraicType))»)'''
			EffectFullValueRef: if ( v.value instanceof EffectFullValue ) return '''EffectFullValue.«(v.value as EffectFullValue).name»()''' else return '''EffectFullFunctionDefinitions::«(v.value as EffectFullFunctionDefinition).name»'''
			EffectFullFunctionType: {
				if (d instanceof EffectFullFunctionType)
					return v.compile
				else if (d instanceof IOType)
					return '''IOFunctions.unit(«v.compile»)'''
			}
			EffectFullDataValue: return compile(v as EffectFullExpression)
			IOExpression: '''IOFunctions.unit(«commonFunctions.compileAdtValue(v.innerValue as Expression, (d as IOType).type)»)'''
			IOEffectFullExpression: '''IOFunctions.unit(«compileAdtValue(v.innerValue as EffectFullExpression, (d as IOType).type as EffectFullType)»)'''
			IOPureFunction: '''IOFunctions.unit(«commonPureFunctions.compilePureFunctionRef(Others.getPureFunctionFromIOPureFunction(v))»)'''
			IOEffectFullFunction: '''IOFunctions.unit(«compileEffectFullFunctionRef(Others.getEffectFullFunctionFromIOEffectFullFunction(v))»)'''
		}
	}
	
	def String compile(EffectFullFunctionType pft) '''
	«IF (pft.value.functionBody instanceof EmptyFunctionBody)»
		new F<Object>() {
						@Override
						public Object f(Object «Others.getArgumentName(pft.value.arg)») {
							throw new UnsupportedOperationException("TODO");
						}
				}
	«ELSEIF (pft.value.functionBody instanceof CompositionFunctionBodyEffect && pft.value.arg != null)»
	new F<«typeGenerator.compile(Others.getArgumentType(pft.value.arg))»,«typeGenerator.compile(GetReturnType.effectFullFunctionDefinition(pft.value))»>() {
				@Override
				public «typeGenerator.compile(GetReturnType.effectFullFunctionDefinition(pft.value))» f(«typeGenerator.compile(Others.getArgumentType(pft.value.arg))» «Others.getArgumentName(pft.value.arg)») {
					return «compileIO((pft.value.functionBody as CompositionFunctionBodyEffect), pft.value.arg)»;
				}
		}
	«ELSEIF (pft.value.functionBody instanceof CompositionFunctionBodyEffect && pft.value.arg == null)»
		new F0<«typeGenerator.compile(GetReturnType.effectFullFunctionDefinition(pft.value))»>() {
					@Override
					public «typeGenerator.compile(GetReturnType.effectFullFunctionDefinition(pft.value))» f() {
						return «compileIO((pft.value.functionBody as CompositionFunctionBodyEffect), null)»;
					}
			}.f()
	«ENDIF»
	'''
	
	//////////////////////////////////////////////////////////////////////////////////
	// IO Functions
	//////////////////////////////////////////////////////////////////////////////////
	
	def compileIO(CompositionFunctionBodyEffect cfbe, Argument arg) {
		var String argName = ""
		if (arg != null){
			argName = "IOFunctions.unit(" + Others.getArgumentName(arg) + ")"
 		}
		var String result = compileIO(Others.getFirstFunctionDefinitionFromCompositionBodyEffectFull(cfbe), argName).toString
		for (CompositionFunctionBodyEffectFullFactor cfbef: cfbe.functionChain){
			result += "\n\t"
			result = compileIO(Others.getFunctionDefinitionFromEffectFullFactor(cfbef), result.toString).toString
		}
		return result;
	}
	
	
	def String compileIO(EffectFullBodyContent e, String valueName){
		switch e {
			EffectFullExpression: valueEmbellishment(valueName, compile(e))
			EffectFullFunction: compileIO(e as EffectFullFunction, valueName)
			EffectFullPrimitive: compileIO(e as EffectFullPrimitive, valueName)
		}
	}
	
	def String compileIO(EffectFullPrimitive effp, String acc) {
		switch effp {
			PrimitiveEffectFullFunction: compileIO(effp, acc)
			PrimitiveEffectFullValue: compileIO(effp, acc)
		}
	}

	def String compileIO(PrimitiveEffectFullValue pefv, String acc) {
		switch pefv {
			PrimitiveRandom: valueEmbellishment(acc,"PrimitivesEffectFull.primitiveRandom()")
      		PrimitiveTime: valueEmbellishment(acc,"PrimitivesEffectFull.primitiveTime()")
		}
	}
	
	def String compileIO(EffectFullFunction eff, String acc) {
		switch eff {
			EffectFullValue: compileIOEffectFullReference('''EffectFullValue.«(eff as EffectFullValue).name»()''', acc, !(GetReturnType.effectFullBodyContent(eff) instanceof IOType))
			EffectFullFunctionDefinition: '''IOFunctions.bind(«acc», EffectFullFunctionDefinitions::«(eff as EffectFullFunctionDefinition).name»)'''
			PrimitiveEffectFullFunction: compileIO(eff, acc)
			EffectFullArgument: compileIOEffectFullReference((eff as EffectFullArgument).name, acc, !(eff.type instanceof IOType))
		}
	}
	
	def String compileIO(PrimitiveEffectFullFunction peff, String acc) {
		switch peff {
			PrimitivePrint: '''IOFunctions.bind(«acc», PrimitivesEffectFull::primitivePrint)'''
      		LeftAlgebraicIO: '''IOFunctions.bind(«acc», PrimitivesEffectFull:leftAlgebraicIO)'''
      		RightAlgebraicIO: '''IOFunctions.bind(«acc», PrimitivesEffectFull:rightAlgebraicIO)'''
			ApplyFIO: '''IOFunctions.bind(«acc», («typeGenerator.compile(peff.functionType)» f) -> f.f(IOFunctions.runSafe(«compileIO(Others.getValueFromApplyFIOFactor(peff.value), null)»)))'''
			PrimitiveReturn: '''«acc»'''
			ExtractEffectFull: '''IOFunctions.bind(«acc», («peff.data.name» d) -> «IF (peff.data.content instanceof IOType)» d.getValue() «ELSE» IOFunctions.unit(d.getValue())) «ENDIF»'''
			LiftPureFunction: compileIO(Others.getPureFunctionFromLiftPureFunction(peff), acc)
			LiftEffectFullFunction: compileIO(Others.getEffectFullFunctionFromLiftEffectFullFunction(peff), acc)
			IsLeftEffectFull: '''IOFuctions.bind(«acc», PrimitivesEffectFull::isLeft)'''
			IsRightEffectFull: '''IOFunctions.bind(«acc», PrimitivesEffectFull::isRight)'''
			EffectFullIf:'''IOFunctions.bind(«acc», (Boolean c) -> PrimitivesEffectFull.effectFullIf(c, «peff.then.compile» , «peff.^else.compile»))'''
			EffectFullEitherIf: '''IOFunctions.bind(«acc», (Boolean c) -> PrimitivesEffectFull.effectFullIfEither(c, «peff.then.compile» , «peff.^else.compile»))'''
		}
	}
	
	def String compileIO(PureFunction pf, String acc){
		switch pf {
			PureValue: valueEmbellishment(acc, '''IOFunctions.unit(PureValue.«(pf as PureValue).name»())''')
			PureFunctionDefinition: '''IOFunctions.map(«acc», PureFunctionDefinitions::«(pf as PureFunctionDefinition).name»)'''
			PrimitivePureFunction: compileIO(pf, acc)
			PureArgument: valueEmbellishment(acc, '''IOFunctions.unit(«pf.name»)''')
			Expression: valueEmbellishment(acc, '''IOFuncitons.unit(«commonPureFunctions.compile(pf)»)''')
		}
	}
	
	def String compileIO(PrimitivePureFunction ppf, String acc) {
		switch ppf {
			IntToString: '''IOFunctions.map(«acc» ,Primitives::intToString)'''
      		IntPow: '''IOFunctions.map(«acc»,Primitives::intPow) '''
			Plus: '''IOFunctions.map(«acc», Primitives::plus)'''
			Minus: '''IOFunctions.map(«acc», Primitives::minus)'''
			Times: '''IOFunctions.map(«acc», Primitives::times)'''
		  	LeftAlgebraic: '''IOFunctions.map(«acc», Primitives::leftAlgebraic)'''
 			RightAlgebraic: '''IOFunctions.map(«acc», Primitives::rightAlgebraic)'''
      		Mod: '''IOFunctions.map(«acc», Primitives::mod)'''
   			ApplyF: '''IOFunctions.unit(IOFunctions.runSafe(«acc»).f(«commonPureFunctions.compileApplyFFactor(ppf.value,"", true)»))'''
			ExtractPure: '''IOFunctions.bind(«acc», («ppf.data.name» d) ->  IOFunctions.unit(d.getValue()))'''
			Equals: '''IOFunctions.map(«acc», Primitives::equalsCurrying)'''
			MinorEquals: '''IOFunctions.map(«acc», Primitives::minorEquals)'''
			MajorEquals: '''IOFunctions.map(«acc», Primitives::majorEquals)'''
			Minor: '''IOFunctions.map(«acc», Primitives::minor)'''
			Major: '''IOFunctions.map(«acc», Primitives::major)'''
			LogicAnd: '''IOFunctions.map(«acc», Primitives::logicAnd)'''
			LogicOr: '''IOFunctions.map(«acc», Primitives::logicOr)'''
			IsLeftPure: '''IOFuncitons.map(«acc», Primitives::isLeft)'''
			IsRightPure: '''IOFunctions.map(«acc», Primitives::isRight)'''
			PureIf: '''IOFunctions.map(«acc», (Boolean c) -> Primitives.pureIf(c, «commonPureFunctions.compile(ppf.then)» , «commonPureFunctions.compile(ppf.^else)»))'''
			PureEitherIf: '''IOFunctions.map(«acc», (Boolean c) -> Primitives.pureIfEither(c, «commonPureFunctions.compile(ppf.then)» , «commonPureFunctions.compile(ppf.^else)»))'''
		}
	}
	
	def compileIOEffectFullReference(String effectFullReferenceCompiled, String valueName, boolean unitWrap){
		if (unitWrap)
			return valueEmbellishment(valueName,'''IOFunctions.unit(«effectFullReferenceCompiled»)''')
		else
			return valueEmbellishment(valueName,effectFullReferenceCompiled)
	}

	def valueEmbellishment(String inputChain, String valueCompiled){
		if (inputChain.isNullOrEmpty) {
			return valueCompiled;
		}else
			return '''IOFunctions.left(«valueCompiled»,«inputChain»)'''
	}

	def String compile(EffectFullIfBody pib) {
		switch pib {
			EffectFullExpression: compile(pib as EffectFullExpression)
			EffectFullFunction: {
				switch pib {
					EffectFullValue: pib.name
					EffectFullFunctionDefinition: compileEffectFullFunctionRef(pib as EffectFullFunctionDefinition)
					PrimitiveEffectFullFunction: compileEffectFullFunctionRef(pib as PrimitiveEffectFullFunction)
					EffectFullArgument: pib.name
				}
			}
		}
	}
}