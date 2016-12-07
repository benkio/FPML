package it.unibo.validation.utilitiesFunctions

import it.unibo.fPML.*
import it.unibo.fPML.EffectFullArgument
import org.eclipse.xtext.EcoreUtil2
import java.util.List
import it.unibo.fPML.EffectFullExpression
import org.eclipse.emf.ecore.util.EcoreUtil

class GetReturnType {
	
	def static Type function(Function f){
		switch f {
			EffectFullFunction: effectFullFunction(f) 
			PureFunction: pureFunction(f)
		}
	}
	
	def static ValueType pureFunction(PureFunction f){
		switch f {
			PureFunctionDefinition: pureFunctionDefinition(f)
			PrimitivePureFunction: primitivePureFunction(f)
			Argument: f.type
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
			Plus: return Others.createIntIntFuntionType
			Minus: return Others.createIntIntFuntionType
			Times: return Others.createIntIntFuntionType
			Mod: return Others.createIntIntFuntionType
			ApplyF: return f.functionType.returnType
      		LeftPair: return f.type.pureAdtElement1
      		RightPair: return Others.getElement2ValueTypeFromPureAlgebraicType(f.type)
		}
	}
	
	def static Type effectFullFunction(EffectFullFunction function) {
		switch function {
			EffectFullFunctionDefinition: effectFullFunctionDefinition(function)
			PrimitiveEffectFullFunction: primitiveEffectFullFunction(function)
		}
	}
	
	def static Type effectFullFunctionDefinition(EffectFullFunctionDefinition definition) {
		functionBodyEffectFull(definition.functionBody, definition.arg, definition.higherOrderArg, definition.returnType)
	}
	
	def static Type functionBodyEffectFull(FunctionBodyEffectFull full, EffectFullArgument argument, AdditionalEffectFullArgument argument2, IOType type) {
		switch full {
			EmptyFunctionBody: type
			CompositionFunctionBodyEffect: compositionFunctionBodyEffectFull(full, argument, argument2)
		}
	}
	
	def static Type compositionFunctionBodyEffectFull(CompositionFunctionBodyEffect effect, EffectFullArgument argument, AdditionalEffectFullArgument argument2) {
		var first = Others.getFirstFunctionDefinitionFromCompositionBodyEffectFull(effect)
		var chain = effect.functionChain.map[x | Others.getFunctionDefinitionFromEffectFullFactor(x)]
		effectFullFunctionChain(chain, first, argument, argument2)
	}
	
	def static Type effectFullFunctionChain(List<EffectFullReference> references, EffectFullReference first, EffectFullArgument argument, AdditionalEffectFullArgument argument2) {
		if (argument2 != null && !(argument2.arg2.type instanceof VoidType)) { //HigherOrder
			val returnFunctionType = EcoreUtil2.copy(effectFullFunctionChain(references, first, argument, null))
			val functionType = FPMLFactory.eINSTANCE.createEffectFullFunctionType
			functionType.argType = EcoreUtil.copy(argument2.arg2.type)
			if (returnFunctionType instanceof IOType)
				functionType.returnType = returnFunctionType
			else 
				functionType.returnType = Others.IOWrap(FPMLFactory.eINSTANCE.createVoidType)
			return Others.IOWrap(functionType)
		} else { //Normal single argument function
			val firstFunctionReturnType = effectFullReference(first)
			if (references.size == 0)
					return firstFunctionReturnType
			else {
				return effectFullFunctionChain(references.tail.toList, references.head ,argument, null)
			}
		}
	}
	
	def static Type effectFullReference(EffectFullReference r) {
		switch r {
			EffectFullValue: effectFullExpression(r.value)
			PureValue: expression(r.value)
			PrimitiveEffectFullValue: primitiveEffectFullValue(r)
			PrimitiveEffectFullFunction: primitiveEffectFullFunction(r)
			PrimitivePureFunction: primitivePureFunction(r)
			EffectFullArgument: r.type
			Function: function(r)
		}
	}
	
	def static primitiveEffectFullValue(PrimitiveEffectFullValue value) {
		switch value {
			PrimitiveRandom: return Others.IOWrap(FPMLFactory.eINSTANCE.createIntegerType)
     		PrimitiveReturn: return Others.IOWrap(value.type)
     		PrimitiveTime: return Others.IOWrap(FPMLFactory.eINSTANCE.createStringType)
		}
	}
	
	def static Type effectFullExpression(EffectFullExpression expression) {
		switch expression {
			IOExpression: {
				return Others.IOWrap(expression(expression.innerValue))
			}
			Expression: expression(expression)
			EffectFullFunctionType:{
				if (expression.value instanceof EffectFullLambda){
					var EffectFullArgument arg = FPMLFactory.eINSTANCE.createEffectFullArgument
					arg.type = FPMLFactory.eINSTANCE.createUnitType
					if (expression.value.arg != null) arg = expression.value.arg
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
		}
	}
	
	def static Type mainFunc(MainFunc m) {
		val ioType = Others.IOWrap(FPMLFactory.eINSTANCE.createUnitType)
		var addictionalEffectFullArgument = FPMLFactory.eINSTANCE.createAdditionalEffectFullArgument
		addictionalEffectFullArgument.arg2 = Others.createVoidEffectFullArgument
		functionBodyEffectFull(m.functionBody, Others.createUnitEffectFullArgument, addictionalEffectFullArgument, ioType)
	}
}