package it.unibo.generator

import it.unibo.fPML.*
import it.unibo.validation.utilitiesFunctions.Others
import it.unibo.validation.utilitiesFunctions.GetReturnType
import it.unibo.fPML.EffectFullFunction

class ValueEffectFullFunctionCommonGenerator {
	
	val typeGenerator = new TypeGenerator
	val commonFunctions = new ValuePureFunctionCommonGenerator
	
	def String compile(EffectFullExpression e, boolean functionTypeExec) {
		switch e {
			EffectFullFunctionType: return compile(e,functionTypeExec) 
			EffectFullDataValue: '''new «e.type.name»(«compileAdtValue(e.value,e.type.content, functionTypeExec)»)'''
			EffectFullProdValue: {
				val prodElement1 = Others.getInnerElementFromEffectFullExpressionAndEffectFullFunctionReference(e.prodAdtElement1)
				val prodElement2 = Others.getInnerElementFromEffectFullExpressionAndEffectFullFunctionReference(e.prodAdtElement2)
				var String prodElement1Type 
				var String prodElement2Type
				if (prodElement1 instanceof Expression) prodElement1Type = compile(prodElement1 as EffectFullExpression, false) else prodElement1Type = compileEffectFullFunctionRef(prodElement1 as EffectFullFunction) 
				if (prodElement2 instanceof Expression) prodElement2Type = compile(prodElement2 as EffectFullExpression, false) else prodElement2Type = compileEffectFullFunctionRef(prodElement2 as EffectFullFunction)
				'''P.p(«prodElement1Type», «prodElement2Type»)'''
			}
			EffectFullSumValue: {
				if (e.sumAdtElement1 != null){
		    		val sumElement1 = Others.getInnerElementFromEffectFullExpressionAndEffectFullFunctionReference(e.sumAdtElement1)
					var String sumElement1Type 
					if (sumElement1 instanceof Expression) sumElement1Type = compile(sumElement1 as EffectFullExpression, false) else sumElement1Type = compileEffectFullFunctionRef(sumElement1 as EffectFullFunction) 	
		    		return '''Either.left(«sumElement1Type»)'''
		    	}
		    	else {
		    		val sumElement2 = Others.getInnerElementFromEffectFullExpressionAndEffectFullFunctionReference(e.sumAdtElement2)
		    		var String sumElement2Type
		    		if (sumElement2 instanceof Expression) sumElement2Type = compile(sumElement2 as EffectFullExpression, false) else sumElement2Type = compileEffectFullFunctionRef(sumElement2 as EffectFullFunction)
		    		return '''Either.right(«sumElement2Type»)'''
		    	}
			}
			EffectFullValueRef: '''EffectFullValue.«e.value.name»()'''
			IOExpression: return "IOFunctions.unit(" + commonFunctions.compile((e.innerValue as Expression), false) + ")"
			IOEffectFullExpression: return "IOFunctions.unit(" + compile((e.innerValue as EffectFullExpression), false) + ")"
			IOPureFunction: '''IOFunctions.unit(«commonFunctions.compilePureFunctionRef(Others.getPureFunctionFromIOPureFunction(e))»)'''
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
	
	def compileAdtValue(EffectFullExpressionAndEffectFullFunctionReference vr, Type d, boolean functionTypeExec) {
		val v = Others.getInnerElementFromEffectFullExpressionAndEffectFullFunctionReference(vr)
		switch v {
			EffectFullSumValue: {
				if (v.sumAdtElement1 == null) return '''Either.right(«compileAdtValue(v.sumAdtElement2, Others.getElement2ValueTypeFromEffectFullAlgebraicType(d as EffectFullAlgebraicType), functionTypeExec)»)'''
				return '''Either.left(«compileAdtValue(v.sumAdtElement1, ((d as EffectFullAlgebraicType).effectFullAdtElement1), functionTypeExec)»)'''
			}
			EffectFullProdValue: return '''P.p(«compileAdtValue(v.prodAdtElement1,((d as EffectFullAlgebraicType).effectFullAdtElement1), functionTypeExec)»,«compileAdtValue(v.prodAdtElement2, Others.getElement2ValueTypeFromEffectFullAlgebraicType(d as EffectFullAlgebraicType), functionTypeExec)»)'''
			EffectFullValueRef: if ( v.value instanceof EffectFullValue ) return '''EffectFullValue.«(v.value as EffectFullValue).name»()''' else return '''EffectFullFunctionDefinitions::«(v.value as EffectFullFunctionDefinition).name»'''
			EffectFullFunctionType: {
				if (d instanceof EffectFullFunctionType)
					return compile(v, functionTypeExec)
				else if (d instanceof IOType)
					return '''IOFunctions.unit(«compile(v,functionTypeExec)»)'''
			}
			EffectFullDataValue: return compile(v as EffectFullExpression, functionTypeExec)
			IOExpression: '''IOFunctions.unit(«commonFunctions.compileAdtValue(Others.createPureExpressionAndPureFunctionReference(v.innerValue as Expression), (d as IOType).type, false)»)'''
			IOEffectFullExpression: '''IOFunctions.unit(«compileAdtValue(Others.createEffectFullExpressionAndEffectFullFunctionReference(v.innerValue as EffectFullExpression), ((d as IOType).type as EffectFullType), functionTypeExec)»)'''
			IOPureFunction: '''IOFunctions.unit(«commonFunctions.compilePureFunctionRef(Others.getPureFunctionFromIOPureFunction(v))»)'''
			IOEffectFullFunction: '''IOFunctions.unit(«compileEffectFullFunctionRef(Others.getEffectFullFunctionFromIOEffectFullFunction(v))»)'''
		}
	}
	
	def String compile(EffectFullFunctionType pft, boolean call) '''
	«IF (pft.value.functionBody instanceof EmptyFunctionBody)»
		new F<Object>() {
						@Override
						public Object f(Object «Others.getArgumentName(pft.value.arg)») {
							throw new UnsupportedOperationException("TODO");
						}
				}«IF (call)».f()«ENDIF»
	«ELSEIF (pft.value.functionBody instanceof CompositionFunctionBodyEffect && pft.value.arg != null)»
	new «typeGenerator.compile(((Others.createTypeOfEffectFullFunction(pft.value) as EffectFullFunctionType).returnType as IOType).type)»() {
				@Override
				public «typeGenerator.compile((((Others.createTypeOfEffectFullFunction(pft.value) as EffectFullFunctionType).returnType as IOType).type as EffectFullFunctionType).returnType)» f() {
					return IOFunctions.unit((«typeGenerator.compile(Others.getArgumentType(pft.value.arg))» «Others.getArgumentName(pft.value.arg)») -> «compileIO((pft.value.functionBody as CompositionFunctionBodyEffect), pft.value.arg)»);
				}
		}
	«ELSEIF (pft.value.functionBody instanceof CompositionFunctionBodyEffect && pft.value.arg == null)»
		new «typeGenerator.compile((Others.createTypeOfEffectFullFunction(pft.value) as EffectFullFunctionType))»() {
					@Override
					public «typeGenerator.compile(
						(
							(Others.createTypeOfEffectFullFunction(pft.value)
								as EffectFullFunctionType
							).returnType as IOType
						)
					)» f() {
						return «compileIO((pft.value.functionBody as CompositionFunctionBodyEffect), null)»;
					}
			}«IF (call)».f()«ENDIF»
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
			EffectFullExpression: valueEmbellishment(valueName, compile(e, true))
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
			Random: valueEmbellishment(acc,"PrimitivesEffectFull.primitiveRandom()")
      		Time: valueEmbellishment(acc,"PrimitivesEffectFull.primitiveTime()")
		}
	}
	
	def String compileIO(EffectFullFunction eff, String acc) {
		switch eff {
			EffectFullValue: compileIOEffectFullReference('''EffectFullValue.«(eff as EffectFullValue).name»()''', acc, !(GetReturnType.effectFullBodyContent(eff) instanceof IOType))
			EffectFullFunctionDefinition: if (Others.getArgumentType(eff.arg) instanceof UnitType) '''IOFunctions.bind(«acc»,ignored -> EffectFullFunctionDefinitions.«(eff as EffectFullFunctionDefinition).name»(Unit.unit()))'''
										  else '''IOFunctions.bind(«acc», EffectFullFunctionDefinitions::«(eff as EffectFullFunctionDefinition).name»)'''
			PrimitiveEffectFullFunction: compileIO(eff, acc)
			EffectFullArgument: compileIOEffectFullReference((eff as EffectFullArgument).name, acc, !(eff.type instanceof IOType))
		}
	}
	
	def String compileIO(PrimitiveEffectFullFunction peff, String acc) {
		switch peff {
			Print: '''IOFunctions.bind(«acc», PrimitivesEffectFull::primitivePrint)'''
      		LeftAlgebraicIO: '''IOFunctions.bind(«acc», PrimitivesEffectFull:leftAlgebraicIO)'''
      		RightAlgebraicIO: '''IOFunctions.bind(«acc», PrimitivesEffectFull:rightAlgebraicIO)'''
			ApplyFIO: '''IOFunctions.bind(«acc», («typeGenerator.compile(peff.functionType)» f) -> f.f(«IF (!(peff.functionType.argType instanceof UnitType))»IOFunctions.runSafe(«compileIO(Others.getValueFromApplyFIOFactor(peff.value), null)»)«ENDIF»))'''
			EffectFullReturn: '''«acc»'''
			ExtractEffectFull: '''IOFunctions.bind(«acc», («peff.data.name» d) -> «IF (peff.data.content instanceof IOType)» d.getValue() «ELSE» IOFunctions.unit(d.getValue())) «ENDIF»'''
			LiftPureFunction: compileIO(Others.getPureFunctionFromLiftPureFunction(peff), acc)
			LiftEffectFullFunction: compileIO(Others.getEffectFullFunctionFromLiftEffectFullFunction(peff), acc)
			IsLeftEffectFull: '''IOFuctions.bind(«acc», PrimitivesEffectFull::isLeft)'''
			IsRightEffectFull: '''IOFunctions.bind(«acc», PrimitivesEffectFull::isRight)'''
			EffectFullIf:'''IOFunctions.bind(«acc», (Boolean c) -> «IF (peff.then instanceof IOType)» «ELSE» IOFunctions.unit(«ENDIF»PrimitivesEffectFull.<«typeGenerator.compile(GetReturnType.effectFullIfBody(peff.then))»>effectFullIf(c, «peff.then.compile» , «peff.^else.compile»))«IF (peff.then instanceof IOType)» «ELSE»)«ENDIF»'''
			EffectFullEitherIf: '''IOFunctions.bind(«acc», (Boolean c) -> IOFunctions.unit(PrimitivesEffectFull.effectFullIfEither(c, «peff.then.compile» , «peff.^else.compile»)))'''
      		GetLineStdIn: '''IOFunctions.append(«acc», PrimitivesEffectFull.getLineStdIn())'''
			GetIntStdIn: '''IOFunctions.append(«acc», PrimitivesEffectFull.getIntStdIn())'''
		}
	}
	
	def String compileIO(PureFunction pf, String acc){
		switch pf {
			PureValue: valueEmbellishment(acc, '''IOFunctions.unit(PureValue.«(pf as PureValue).name»())''')
			PureFunctionDefinition: '''IOFunctions.map(«acc», PureFunctionDefinitions::«(pf as PureFunctionDefinition).name»)'''
			PrimitivePureFunction: compileIO(pf, acc)
			PureArgument: valueEmbellishment(acc, '''IOFunctions.unit(«pf.name»)''')
			Expression: valueEmbellishment(acc, '''IOFuncitons.unit(«commonFunctions.compile(pf, true)»)''')
		}
	}
	
	def String compileIO(PrimitivePureFunction ppf, String acc) {
		switch ppf {
			IntToString: '''IOFunctions.map(«acc» ,Primitives::intToString)'''
			BoolToString: '''IOFunctions.map(«acc» ,Primitives::boolToString)''' 
      		IntPow: '''IOFunctions.map(«acc»,Primitives::intPow) '''
			Plus: '''IOFunctions.map(«acc», Primitives::plus)'''
			Minus: '''IOFunctions.map(«acc», Primitives::minus)'''
			Times: '''IOFunctions.map(«acc», Primitives::times)'''
		  	LeftAlgebraic: '''IOFunctions.map(«acc», Primitives::leftAlgebraic)'''
 			RightAlgebraic: '''IOFunctions.map(«acc», Primitives::rightAlgebraic)'''
      		Mod: '''IOFunctions.map(«acc», Primitives::mod)'''
   			ApplyF: '''IOFunctions.unit(IOFunctions.runSafe(«acc»).f(«commonFunctions.compileApplyFFactor(ppf.value,"", true)»))'''
			ExtractPure: '''IOFunctions.bind(«acc», («ppf.data.name» d) ->  IOFunctions.unit(d.getValue()))'''
			Equals: '''IOFunctions.map(«acc», Primitives::equalsCurrying)'''
			MinorEquals: '''IOFunctions.map(«acc», Primitives::minorEquals)'''
			MajorEquals: '''IOFunctions.map(«acc», Primitives::majorEquals)'''
			Minor: '''IOFunctions.map(«acc», Primitives::minor)'''
			Major: '''IOFunctions.map(«acc», Primitives::major)'''
			LogicAnd: '''IOFunctions.map(«acc», Primitives::logicAnd)'''
			LogicOr: '''IOFunctions.map(«acc», Primitives::logicOr)'''
     		LogicNot: '''IOFunctions.map(«acc», Primitives::logicNot)'''
			IsLeftPure: '''IOFuncitons.map(«acc», Primitives::isLeft)'''
			IsRightPure: '''IOFunctions.map(«acc», Primitives::isRight)'''
			PureIf: '''IOFunctions.map(«acc», (Boolean c) -> Primitives.pureIf(c, «commonFunctions.compile(ppf.then)» , «commonFunctions.compile(ppf.^else)»))'''
			PureEitherIf: '''IOFunctions.map(«acc», (Boolean c) -> Primitives.pureIfEither(c, «commonFunctions.compile(ppf.then)» , «commonFunctions.compile(ppf.^else)»))'''
			PureReturn: acc
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
		val content = Others.getFunctionFromEffectFullIfBody(pib)
		switch content {
			EffectFullExpression: compile(content as EffectFullExpression, false)
			EffectFullFunction: {
				switch content {
					EffectFullValue: content.name
					EffectFullFunctionDefinition: compileEffectFullFunctionRef(content as EffectFullFunctionDefinition)
					PrimitiveEffectFullFunction: compileEffectFullFunctionRef(content as PrimitiveEffectFullFunction)
					EffectFullArgument: content.name
				}
			}
		}
	}
}