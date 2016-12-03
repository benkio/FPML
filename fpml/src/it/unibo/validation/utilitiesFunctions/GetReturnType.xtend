package it.unibo.validation.utilitiesFunctions

import it.unibo.fPML.*
import org.eclipse.emf.common.util.EList
import it.unibo.fPML.EffectFullArgument
import org.eclipse.xtext.EcoreUtil2
import java.util.List
import org.eclipse.emf.ecore.EObject
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
		if (argument2 != null) { //HigherOrder
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
		}
	}
	
	def static ValueType pureReference(PureReference reference) {
		switch reference {
			PureValue: return expression(reference.value)
			Argument: return reference.type
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
		if (argument2 != null) { //HigherOrder
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
			Expression: {
				return Others.IOWrap(expression(expression))
			}
			UnitType: expression
			EffectFullFunctionType:{
				if (expression.value instanceof EffectFullLambda){
					var EffectFullArgument arg = null
					if (expression.value.arg != null) arg = expression.value.arg
					functionBodyEffectFull(expression.value.functionBody, arg, null, expression.value.returnType)
				}else
					expression
				} 
			EffectFullDataValue: expression
			RecursiveEffectFullExpression: {
				return Others.IOWrap(effectFullExpression(expression.exp))
			}
		}
	}
	
	def static Type pritiveFunction(Object function) {
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
		}
	}
	
	def static Type mainFunc(MainFunc m) {
		val ioType = Others.IOWrap(FPMLFactory.eINSTANCE.createUnitType)
		functionBodyEffectFull(m.functionBody, null, null, ioType)
	}
}