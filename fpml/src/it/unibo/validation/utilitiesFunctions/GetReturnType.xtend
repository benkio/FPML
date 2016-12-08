package it.unibo.validation.utilitiesFunctions

import it.unibo.fPML.*
import it.unibo.fPML.EffectFullArgument
import org.eclipse.xtext.EcoreUtil2
import java.util.List
import it.unibo.fPML.EffectFullExpression
import org.eclipse.emf.ecore.util.EcoreUtil
import it.unibo.fPML.EffectFullPrimitive

class GetReturnType {
	
	def static Type function(Function f){
		switch f {
			EffectFullFunction: effectFullFunction(f) 
			PureFunction: pureFunction(f)
		}
	}
	
	def static ValueType pureFunction(PureFunction f){
		switch f {
			PureValue: expression(f.value)
			PureFunctionDefinition: pureFunctionDefinition(f)
			PrimitivePureFunction: primitivePureFunction(f)
			PureArgument: f.type
			Expression: expression(f)
		}
	}	
	
	def static ValueType pureFunctionDefinition(PureFunctionDefinition f){
		switch f {
			PureValue: expression(f.value)
			PureLambda: functionBodyPure(f.functionBody, f.arg, f.higherOrderArg, f.returnType)
			PureFunctionDefinition: functionBodyPure(f.functionBody, f.arg, f.higherOrderArg, f.returnType)
		}
	}
	
	def static ValueType expression(Expression expression) {
		switch expression {
			IntegerType: return FPMLFactory.eINSTANCE.createIntegerType
			StringType: return FPMLFactory.eINSTANCE.createStringType
      		BooleanType: return FPMLFactory.eINSTANCE.createBooleanType
			DataValue: return expression
			PureFunctionType: {
				if (expression.value instanceof PureLambda){
					functionBodyPure(expression.value.functionBody, expression.value.arg, null, expression.value.returnType)
				}else
					expression
				}
       		UnitType: expression
       		PureValueRef: expression(expression.value.value)
			PureSumValue: Others.createPureAlgebraicType(expression(expression.sumAdtElement1), expression(expression.sumAdtElement2), true)
			PureProdValue: Others.createPureAlgebraicType(expression(expression.prodAdtElement1), expression(expression.prodAdtElement2), false)
		}
	}
	
	def static ValueType functionBodyPure(FunctionBodyPure pure, Argument arg1, AdditionalPureArgument arg2, ValueType returnType) {
		switch pure {
			EmptyFunctionBody: returnType
			CompositionFunctionBodyPure: compositionFunctionBodyPure(pure, arg1, arg2)
		}
	}
	
	def static ValueType compositionFunctionBodyPure(CompositionFunctionBodyPure pure, Argument arg1, AdditionalPureArgument arg2) {
		var first = Others.getFirstFunctionDefinitionFromCompositionBodyPure(pure)
		var chain = pure.functionChain.map[x | Others.getFunctionDefinitionFromPureFactor(x)]
		pureFunctionChain(chain,first, arg1, arg2)
	}
	
	def static ValueType pureFunctionChain(List<PureFunction> definitions, PureFunction first ,Argument argument, AdditionalPureArgument argument2) {
		if (argument2 != null && !(argument2.arg2.type instanceof VoidType)) { //HigherOrder
			val functionType = FPMLFactory.eINSTANCE.createPureFunctionType
			functionType.argType = EcoreUtil.copy(argument2.arg2.type)
			functionType.returnType = EcoreUtil.copy(pureFunctionChain(definitions, first, argument, null))
			return functionType
		} else { //Normal single argument function
			val firstFunctionReturnType = pureFunction(first)
			if (definitions.size == 0)
				return firstFunctionReturnType
			else {
				return pureFunctionChain(definitions.tail.toList, definitions.head ,argument, null)
			}
		}
	}
	
	def static ValueType primitivePureFunction(PrimitivePureFunction f) {
		switch f {
			IntToString: return FPMLFactory.eINSTANCE.createStringType
			IntPow: return FPMLFactory.eINSTANCE.createIntegerType
			Plus: return Others.createFuntionType(EcoreUtil.copy(f.type) as ValueType, EcoreUtil.copy(f.type) as ValueType)
			Minus: return Others.createFuntionType(FPMLFactory.eINSTANCE.createIntegerType, FPMLFactory.eINSTANCE.createIntegerType)
			Times: return Others.createFuntionType(FPMLFactory.eINSTANCE.createIntegerType, FPMLFactory.eINSTANCE.createIntegerType)
			Mod: return Others.createFuntionType(FPMLFactory.eINSTANCE.createIntegerType, FPMLFactory.eINSTANCE.createIntegerType)
			ApplyF: return f.functionType.returnType
      		LeftPair: return f.type.pureAdtElement1
      		RightPair: return Others.getElement2ValueTypeFromPureAlgebraicType(EcoreUtil.copy(f.type))
      		Equals: return Others.createFuntionType(EcoreUtil.copy(f.type) as ValueType, FPMLFactory.eINSTANCE.createBooleanType)
      		MinorEquals: return Others.createFuntionType(FPMLFactory.eINSTANCE.createIntegerType, FPMLFactory.eINSTANCE.createBooleanType)
      		MajorEquals: return Others.createFuntionType(FPMLFactory.eINSTANCE.createIntegerType, FPMLFactory.eINSTANCE.createBooleanType)
      		Minor: return Others.createFuntionType(FPMLFactory.eINSTANCE.createIntegerType, FPMLFactory.eINSTANCE.createBooleanType)
      		Major: return Others.createFuntionType(FPMLFactory.eINSTANCE.createIntegerType, FPMLFactory.eINSTANCE.createBooleanType)
      		LogicAnd: return Others.createFuntionType(FPMLFactory.eINSTANCE.createBooleanType, FPMLFactory.eINSTANCE.createBooleanType) 
      		LogicOr: return Others.createFuntionType(FPMLFactory.eINSTANCE.createBooleanType, FPMLFactory.eINSTANCE.createBooleanType)
      		ExtractPure: return f.data.content
		}
	}
	
	def static Type effectFullFunction(EffectFullFunction function) {
		switch function {
			EffectFullValue: effectFullExpression(function.value)
			EffectFullFunctionDefinition: effectFullFunctionDefinition(function)
			PrimitiveEffectFullFunction: primitiveEffectFullFunction(function)
			EffectFullExpression: effectFullExpression(function)
		}
	}
	
	def static Type effectFullFunctionDefinition(EffectFullFunctionDefinition definition) {
		functionBodyEffectFull(definition.functionBody, definition.arg, definition.higherOrderArg, definition.returnType)
	}
	
	def static Type functionBodyEffectFull(FunctionBodyEffectFull full, Argument argument, AdditionalEffectFullArgument argument2, IOType type) {
		switch full {
			EmptyFunctionBody: type
			CompositionFunctionBodyEffect: compositionFunctionBodyEffectFull(full, argument, argument2)
		}
	}
	
	def static Type compositionFunctionBodyEffectFull(CompositionFunctionBodyEffect effect, Argument argument, AdditionalEffectFullArgument argument2) {
		var first = Others.getFirstFunctionDefinitionFromCompositionBodyEffectFull(effect)
		var chain = effect.functionChain.map[x | Others.getFunctionDefinitionFromEffectFullFactor(x)]
		effectFullFunctionChain(chain, first, argument, argument2)
	}
	
	def static Type effectFullFunctionChain(List<EffectFullBodyContent> references, EffectFullBodyContent first, Argument argument, AdditionalEffectFullArgument argument2) {
		if (argument2 != null 
			&& (argument2.arg2 instanceof EffectFullArgument 
				&& !((argument2.arg2 as EffectFullArgument).type instanceof VoidType) )
		) { //HigherOrder
			val returnFunctionType = EcoreUtil2.copy(effectFullFunctionChain(references, first, argument, null))
			val functionType = FPMLFactory.eINSTANCE.createEffectFullFunctionType
			functionType.argType = EcoreUtil.copy(Others.getArgumentType(argument2.arg2))
			if (returnFunctionType instanceof IOType)
				functionType.returnType = returnFunctionType
			else 
				functionType.returnType = Others.IOWrap(FPMLFactory.eINSTANCE.createVoidType)
			return Others.IOWrap(functionType)
		} else { //Normal single argument function
			val firstFunctionReturnType = effectFullBodyContent(first)
			if (references.size == 0)
					return firstFunctionReturnType
			else {
				return effectFullFunctionChain(references.tail.toList, references.head ,argument, null)
			}
		}
	}
	
	def static Type effectFullBodyContent(EffectFullBodyContent efbc) {
		switch efbc {
			EffectFullExpression: effectFullExpression(efbc)
			EffectFullFunction: effectFullFunction(efbc)
			EffectFullPrimitive: effectFullPrimitive(efbc)
		}
	}
	
	def static effectFullPrimitive(EffectFullPrimitive primitive) {
		switch primitive {
			PrimitiveEffectFullFunction: primitiveEffectFullFunction(primitive)
			PrimitiveEffectFullValue: primitiveEffectFullValue(primitive)
		}
	}
	
	def static primitiveEffectFullValue(PrimitiveEffectFullValue value) {
		switch value {
			PrimitiveRandom: return Others.IOWrap(FPMLFactory.eINSTANCE.createIntegerType)
     		PrimitiveTime: return Others.IOWrap(FPMLFactory.eINSTANCE.createStringType)
		}
	}
	
	def static Type effectFullExpression(EffectFullExpression expression) {
		switch expression {
			IOExpression: {
				return Others.IOWrap(expression(expression.innerValue))
			}
			IOPureFunction: pureFunction(expression.pureFunction)
			EffectFullFunctionType:{
				if (expression.value instanceof EffectFullLambda){
					var EffectFullArgument arg = FPMLFactory.eINSTANCE.createEffectFullArgument
					arg.type = Others.IOWrap(FPMLFactory.eINSTANCE.createUnitType)
					if (expression.value.arg != null) arg.type = Others.IOWrap(Others.getArgumentType(expression.value.arg))
					functionBodyEffectFull(expression.value.functionBody, arg, null, expression.value.returnType)
				}else
					expression
				} 
			EffectFullDataValue: expression
			RecursiveEffectFullExpression: {
				return Others.IOWrap(effectFullExpression(expression.innerValue as EffectFullExpression))
			}
			EffectFullProdValue: Others.createEffectFullAlgebraicType(effectFullExpression(expression.prodAdtElement1), effectFullExpression(expression.prodAdtElement2), false)
			EffectFullSumValue: Others.createEffectFullAlgebraicType(effectFullExpression(expression.sumAdtElement1), effectFullExpression(expression.sumAdtElement2), true)
			EffectFullValueRef: effectFullExpression(expression.value.value)
		}
	}
	
	def static Type pritiveFunction(PrimitiveFunction function) {
		switch function {
			PrimitiveEffectFullFunction: primitiveEffectFullFunction(function)
			PrimitivePureFunction: primitivePureFunction(function)
		}
	}
	
	def static primitiveEffectFullFunction(PrimitiveEffectFullFunction function) {
		switch function {
			PrimitivePrint: Others.IOWrap(FPMLFactory.eINSTANCE.createUnitType)
  			ApplyFIO: function.functionType.returnType
			PrimitiveReturn: Others.IOWrap(function.type)
			LeftPairIO: function.type.effectFullAdtElement1
			RightPairIO: Others.getElement2ValueTypeFromEffectFullAlgebraicType(function.type)
			ExtractEffectFull: function.data.content
		}
	}
	
	def static Type mainFunc(MainFunc m) {
		val ioType = Others.IOWrap(FPMLFactory.eINSTANCE.createUnitType)
		var addictionalEffectFullArgument = FPMLFactory.eINSTANCE.createAdditionalEffectFullArgument
		addictionalEffectFullArgument.arg2 = Others.createVoidEffectFullArgument
		functionBodyEffectFull(m.functionBody, Others.createUnitEffectFullArgument, addictionalEffectFullArgument, ioType)
	}
}