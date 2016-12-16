package it.unibo.generator

import it.unibo.fPML.*
import it.unibo.validation.utilitiesFunctions.Others
import it.unibo.validation.utilitiesFunctions.GetReturnType
import it.unibo.fPML.LiftPureFunction
import it.unibo.fPML.PrimitivePureFunction

class ValuePureFunctionCommonGenerator {
	
	TypeGenerator typeGenerator = new TypeGenerator
	
	def String compile(Expression e, boolean functionTypeExec) {
		switch e {
			IntegerType: '''«e.value»'''
			UnitType: "Unit.unit()"
			StringType: '''"«e.value»"'''
      		BooleanType: '''«e.value»'''
			DataType: '''new «typeGenerator.compileType(e)»(«compileAdtValue((e as DataValue).value, (e as DataValue).type.content, functionTypeExec)»)'''
			PureFunctionType: return compile(e, functionTypeExec) 
			PureSumValue: {
				if (e.pureAdtElement1 != null) {
					val sumElement1 = Others.getInnerElementFromPureExpressionAndPureFunctionReference(e.sumAdtElement1)
					var String sumElement1Type 
					if (sumElement1 instanceof Expression) sumElement1Type = compile((sumElement1 as Expression), functionTypeExec) else sumElement1Type = compilePureFunctionRef(sumElement1 as PureFunction) 
					return '''Either.left(«sumElement1Type»)'''
				}else {
					val sumElement2 = Others.getInnerElementFromPureExpressionAndPureFunctionReference(e.sumAdtElement2)
					var String sumElement2Type
					if (sumElement2 instanceof Expression) sumElement2Type = compile((sumElement2 as Expression), functionTypeExec) else sumElement2Type = compilePureFunctionRef(sumElement2 as PureFunction)
					return '''Either.right(«sumElement2Type»)'''
				}
			}
			PureValueRef: '''PureValue.«e.value.name»()'''
			PureProdValue: {
				val prodElement1 = Others.getInnerElementFromPureExpressionAndPureFunctionReference(e.prodAdtElement1)
				val prodElement2 = Others.getInnerElementFromPureExpressionAndPureFunctionReference(e.prodAdtElement2)
				var String prodElement1Type 
				var String prodElement2Type
				if (prodElement1 instanceof Expression) prodElement1Type = compile((prodElement1 as Expression), functionTypeExec) else prodElement1Type = compilePureFunctionRef(prodElement1 as PureFunction) 
				if (prodElement2 instanceof Expression) prodElement2Type = compile((prodElement2 as Expression), functionTypeExec) else prodElement2Type = compilePureFunctionRef(prodElement2 as PureFunction)
				'''P.p(«prodElement1Type», «prodElement2Type»)'''
				}
		}	
	}
	
	def String compileAdtValue(PureExpressionAndPureFunctionReference vr, Type d, boolean functionTypeExec) {
		val v = Others.getInnerElementFromPureExpressionAndPureFunctionReference(vr)
		switch v {
			IntegerType: return '''«v.value»'''
			StringType: return '''"«v.value»"'''
      		BooleanType: return '''«v.value»'''
			UnitType: return '''Unit.unit()'''
			DataType: return '''new «typeGenerator.compileType(v)»(«compileAdtValue((v as DataValue).value, (v as DataValue).type.content, functionTypeExec)»)'''
			PureSumValue: {
				if (v.sumAdtElement1 == null) return '''Either.right(«compileAdtValue(v.sumAdtElement2, Others.getElement2ValueTypeFromPureAlgebraicType(d as PureAlgebraicType), functionTypeExec)»)'''
				return '''Either.left(«compileAdtValue(v.sumAdtElement1, ((d as PureAlgebraicType).pureAdtElement1), functionTypeExec)»)'''
			}
			PureProdValue: return '''P.p(«compileAdtValue(v.prodAdtElement1,(d as PureAlgebraicType).pureAdtElement1, functionTypeExec)»,«compileAdtValue(v.prodAdtElement2, Others.getElement2ValueTypeFromPureAlgebraicType(d as PureAlgebraicType), functionTypeExec)»)'''
			PureValueRef: if ( v.value instanceof PureValue ) return '''PureValue.«(v.value as PureValue).name»()''' else return '''PureFunctionDefinitions::«(v.value as PureFunctionDefinition).name»'''
			PureFunctionType: return compile(v, functionTypeExec)
			PureFunction: compilePureFunctionRef(v)
		}
	}
	
	def String compile(PureFunctionType pft, boolean call) '''
		«IF (pft.value.functionBody instanceof CompositionFunctionBodyPure) && pft.value.arg != null»
			new F<«typeGenerator.compile(pft.value.arg.type)»,«typeGenerator.compile(GetReturnType.pureFunctionDefinition(pft.value))»>() {
					@Override
					public «typeGenerator.compile(GetReturnType.pureFunctionDefinition(pft.value))» f(«typeGenerator.compile(pft.value.arg.type)» «pft.value.arg.name») {
						 return «compile(pft.value.functionBody, pft.value.arg.name, true)»;
					}
			}
		«ELSEIF (pft.value.functionBody instanceof EmptyFunctionBody)»
			new F<Object>() {
						@Override
						public Object f(Object «pft.value.arg.name») {
							throw new UnsupportedOperationException("TODO");
						}
				}«IF (call)».f()«ENDIF»
		«ELSE»
			new F0<«typeGenerator.compile(GetReturnType.pureFunctionDefinition(pft.value))»>() {
					@Override
					public «typeGenerator.compile(GetReturnType.pureFunctionDefinition(pft.value))» f() {
						return «compile(pft.value.functionBody, "", true)»;
					}
				}«IF (call)».f()«ENDIF»
		«ENDIF»
		'''
		
	
	def String compile(FunctionBodyPure pf, String argName, boolean outSideCall) {
		switch pf { 
			EmptyFunctionBody: '''null''' //cannot throw exception because the return is outside and cannot use throw with return. 
			CompositionFunctionBodyPure: compileCompositionFunctionBodyPure(pf, argName, outSideCall)
		}
	}

	def String compileCompositionFunctionBodyPure(CompositionFunctionBodyPure cfbp, String argName, boolean outsideCalls) {
		var result = argName
		val initialElement = Others.getFirstFunctionDefinitionFromCompositionBodyPure(cfbp)
		switch initialElement {
			PureValue: result = "PureValue." + (initialElement as PureValue).name + "()"
			PureLambda: result = "(" + typeGenerator.compile(initialElement.arg) + ") -> return " + initialElement.functionBody.compile(argName,outsideCalls) + ";"
			PrimitivePureFunction: result = compilePrimitiveCall(initialElement, argName, argName, outsideCalls)
			PureFunctionDefinition: result = compileCall(initialElement, argName, argName, outsideCalls)
			Expression: result = compile(initialElement, true)
			Argument: result = Others.getArgumentName(initialElement)
		}
		for (f : cfbp.functionChain){
			result = compileCall( Others.getFunctionDefinitionFromPureFactor(f), result, argName , outsideCalls)
		}
		return result
	} 
	
	def String compileCall(PureFunction pf, String acc, String argName, boolean outsideCalls) {
		switch pf {
			PureValue: return "PureValue." + (pf as PureValue).name + "()"
			PureLambda: return "(" + typeGenerator.compile(pf.higherOrderArg.arg2) + ") -> return " + pf.functionBody.compile(argName,outsideCalls) + ";"
			PrimitivePureFunction: return compilePrimitiveCall(pf, acc, argName, outsideCalls)
			PureFunctionDefinition: {
				if (!outsideCalls)
					return pf.name + "(" + acc + ")"
				else 
					return "PureFunctionDefinitions." + pf.name + "(" + acc + ")"	
			}
			Expression: compile(pf, true)
		}
	}
	
	def compilePrimitiveCall(PrimitivePureFunction purePrimitive, String acc, String argName , boolean outsideCalls){
		switch purePrimitive {
			IntToString: "Primitives.intToString(" + acc + ")"
			BoolToString: "Primitives.boolToString(" + acc + ")"
      		IntPow: "Primitives.intPow(" + acc + ")"
			Plus: "Primitives.plus(" + acc + ")"
			Minus: "Primitives.minus(" + acc + ")"
			Times: "Primitives.times(" + acc + ")"
			Mod: "Primitives.mod(" + acc + ")"
      		LeftAlgebraic: "Primitives.leftAlgebraic(" + acc + ")"
      		RightAlgebraic: "Primitives.rightAlgebraic(" + acc + ")"
			ApplyF: acc + ".f(" + compileApplyFFactor(purePrimitive.value, argName, outsideCalls) + ")"		
			Equals: "Primitives.equalsCurrying(" + acc + ")"
			MinorEquals: "Primitives.minorEquals(" + acc + ")"
			MajorEquals: "Primitives.majorEquals(" + acc + ")" 
			Minor: "Primitives.minor(" + acc + ")"
			Major: "Primitives.major(" + acc + ")"
			LogicAnd: "Primitives.logicAnd(" + acc + ")"
			LogicOr: "Primitives.logicOr(" + acc + ")"
      LogicNot: "Primitives.logicNot(" + acc + ")"
			ExtractPure: acc + ".getValue()"
			IsLeftPure: "Primitives.isLeft(" + acc +")"
			IsRightPure: "Primitives.isRight("+ acc +")"
			PureReturn: acc
			PureIf: "Primitives.<«typeGenerator.compile(GetReturnType.pureFunction(Others.getFunctionFromPureIfBody(purePrimitive.then)))»>pureIf(" + acc + ", " + compileCall(Others.getFunctionFromPureIfBody(purePrimitive.then), acc, argName, outsideCalls) 
											   + ", " + compileCall(Others.getFunctionFromPureIfBody(purePrimitive.^else), acc, argName, outsideCalls) 
											   + ")"
    		PureEitherIf: "Primitives.pureIfEither(" + acc + ", " + compileCall(Others.getFunctionFromPureIfBody(purePrimitive.then), acc, argName, outsideCalls) 
											   + ", " + compileCall(Others.getFunctionFromPureIfBody(purePrimitive.^else), acc, argName, outsideCalls) 
											   + ")"
		}
	}
	
	def String compileApplyFFactor(ApplyFFactor r,  String argName, boolean outsideCalls) {
		switch r.valueReference {
			PureValue: return compileCall(r.valueReference as PureValue, argName, argName, outsideCalls)
			Argument: return Others.getArgumentName(r.valueReference as Argument)
			default: return compile(r.valueExpression, true)
		}
	}
	
	def String compilePureFunctionRef(PureFunction pf) {
		switch pf {
			PureValue: '''PureValue::«pf.name»'''
			PureFunctionDefinition: '''PureFunctionDefinitions::«pf.name»'''
	//		PrimitivePureFunction: compilePrimitivePureFunctionRef(pf) CANNOT HAPPEN, DOES NOT HAVE NAME REFERENCE
			PureArgument: pf.name
			Expression: compile(pf, true)
		}
	}
	
	def String compile(PureIfBody pib) {
		val content = Others.getFunctionFromPureIfBody(pib)
		switch content {
			Expression: compile(content as Expression, false)
			PureFunction: {
				switch content {
					PureValue: content.name
					PureFunctionDefinition: compilePureFunctionRef(content as PureFunctionDefinition)
					PrimitivePureFunction: compilePureFunctionRef(content as PrimitivePureFunction)
					PureArgument: content.name
				}
			}
		}
	}
}