package it.unibo.generator

import it.unibo.fPML.*
import it.unibo.validation.utilitiesFunctions.Others
import it.unibo.validation.utilitiesFunctions.GetReturnType
import it.unibo.fPML.LiftPureFunction
import it.unibo.fPML.PrimitivePureFunction

class ValuePureFunctionCommonGenerator {
	
	TypeGenerator typeGenerator = new TypeGenerator
	
	def String compile(Expression e) {
		switch e {
			IntegerType: '''«e.value»'''
			UnitType: "Unit.unit()"
			StringType: '''"«e.value»"'''
      		BooleanType: '''«e.value»'''
			DataType: '''new «typeGenerator.compileType(e)»(«compileAdtValue((e as DataValue).value, (e as DataValue).type.content)»)'''
			PureFunctionType: return e.compile 
			PureSumValue:  {
				if (e.sumAdtElement1 == null) return '''Either.right(«e.sumAdtElement2.compile»)'''
				return '''Either.left(«e.sumAdtElement1.compile»)'''
			}
			PureValueRef: '''PureValue.«e.value.name»()'''
			PureProdValue: '''P.p(«e.prodAdtElement1.compile», «e.prodAdtElement2.compile»)'''
		}	
	}
	
	def compileAdtValue(Expression v, Type d) {
		switch v {
			IntegerType: return v.value
			StringType: return '''"«v.value»"'''
      		BooleanType: return v.value
			UnitType: return '''Unit.unit()'''
			DataType: return '''new «typeGenerator.compileType(v)»(«compileAdtValue((v as DataValue).value, (v as DataValue).type.content)»)'''
			PureSumValue: {
				if (v.sumAdtElement1 == null) return '''Either.right(«compileAdtValue(v.sumAdtElement2, Others.getElement2ValueTypeFromPureAlgebraicType(d as PureAlgebraicType))»)'''
				return '''Either.left(«compileAdtValue(v.sumAdtElement1, ((d as PureAlgebraicType).pureAdtElement1))»)'''
			}
			PureProdValue: return '''P.p(«compileAdtValue(v.prodAdtElement1,(d as PureAlgebraicType).pureAdtElement1)»,«compileAdtValue(v.prodAdtElement2, Others.getElement2ValueTypeFromPureAlgebraicType(d as PureAlgebraicType))»)'''
			PureValueRef: if ( v.value instanceof PureValue ) return '''PureValue.«(v.value as PureValue).name»()''' else return '''PureFunctionDefinitions::«(v.value as PureFunctionDefinition).name»'''
			PureFunctionType: return v.compile
		}
	}
	
		def String compile(PureFunctionType pft) '''
	«IF (pft.value.functionBody instanceof CompositionFunctionBodyPure) && pft.value.arg != null»
		new F<«typeGenerator.compile(pft.value.arg.type)»,«typeGenerator.compile(GetReturnType.pureFunctionDefinition(pft.value))»>() {
				@Override
				public «typeGenerator.compile(GetReturnType.pureFunctionDefinition(pft.value))» f(«typeGenerator.compile(pft.value.arg.type)» «pft.value.arg.name») {
					 return «compile(pft.value.functionBody, pft.value.arg.name, true)»;
				}
		}
	«ELSEIF (pft.value.functionBody instanceof EmptyFunctionBody)»
		new F<() {
					@Override
					public Object f(Object «pft.value.arg.name») {
						throw new UnsupportedOperationException("TODO");
					}
			}
	«ELSE»
	«compile(pft.value.functionBody, "", true)»
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
			Expression: result = initialElement.compile
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
			Expression: compile(pf)
		}
	}
	
	def compilePrimitiveCall(PrimitivePureFunction purePrimitive, String acc, String argName , boolean outsideCalls){
		switch purePrimitive {
			IntToString: "Primitives.intToString(" + acc + ")"
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
			ExtractPure: acc + ".getValue()"
		}
	}
	
	def String compileApplyFFactor(ApplyFFactor r,  String argName, boolean outsideCalls) {
		switch r.valueReference {
			PureValue: return compileCall(r.valueReference as PureValue, argName, argName, outsideCalls)
			Argument: return Others.getArgumentName(r.valueReference as Argument)
			default: return compile(r.valueExpression)
		}
	}
	
	def String compilePureFunctionRef(PureFunction pf) {
		switch pf {
			PureValue: '''PureValue::«pf.name»'''
			PureFunctionDefinition: '''PureFunctionDefinitions::«pf.name»'''
	//		PrimitivePureFunction: compilePrimitivePureFunctionRef(pf) CANNOT HAPPEN, DOES NOT HAVE NAME REFERENCE
			PureArgument: pf.name
			Expression: compile(pf)
		}
	}
}