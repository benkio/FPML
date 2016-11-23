package it.unibo.validation.utilitiesFunctions

import it.unibo.fPML.*
import org.eclipse.emf.common.util.EList
import it.unibo.fPML.EffectFullArgument
import org.eclipse.xtext.EcoreUtil2
import java.util.List
import org.eclipse.emf.ecore.EObject

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
			Value: expression(f.value)
			PureLambda: functionBodyPure(f.functionBody, f.arg, f.arg2, f.returnType)
			PureFunctionDefinition: functionBodyPure(f.functionBody, f.arg, f.arg2, f.returnType)
		}
	}
	
	def static ValueType expression(Expression expression) {
		switch expression {
			IntegerType: return FPMLFactory.eINSTANCE.createIntegerType
			StringType: return FPMLFactory.eINSTANCE.createStringType 
			DataValue: return expression
			PureFunctionType: return expression
		}
	}
	
	def static ValueType functionBodyPure(FunctionBodyPure pure, Argument arg1, Argument arg2, ValueType returnType) {
		switch pure {
			EmptyFunctionBody: returnType
			CompositionFunctionBodyPure: compositionFunctionBodyPure(pure, arg1, arg2)
		}
	}
	
	def static ValueType compositionFunctionBodyPure(CompositionFunctionBodyPure pure, Argument arg1, Argument arg2) {
		var first = Others.getFirstFunctionDefinitionFromCompositionBodyPure(pure)
		var chain = pure.functionChain.map[x | Others.getFunctionDefinitionFromPureFactor(x)]
		pureFunctionChain(chain,first, arg1, arg2)
	}
	
	def static ValueType pureFunctionChain(List<PureFunction> definitions, PureFunction first ,Argument argument, Argument argument2) {
		if (argument2 != null) { //HigherOrder
			val functionType = FPMLFactory.eINSTANCE.createPureFunctionType
			functionType.argType = argument2.type
			functionType.returnType = pureFunctionChain(definitions, first, argument, null)
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
			Plus: return IntIntFunc
			Minus: return IntIntFunc
			Times: return IntIntFunc
			Mod: return IntIntFunc
			ApplyF: return f.functionType.returnType
		}
	}
	
	def static PureFunctionType IntIntFunc() {
		val func = FPMLFactory.eINSTANCE.createPureFunctionType
		func.argType = FPMLFactory.eINSTANCE.createIntegerType
		func.returnType = FPMLFactory.eINSTANCE.createIntegerType
		return func
	}
	
	def static ValueType pureReference(PureReference reference) {
		switch reference {
			PureFunctionDefinition: return pureFunctionDefinition(reference)
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
		functionBodyEffectFull(definition.functionBody, definition.arg, definition.arg2, definition.returnType)
	}
	
	def static Type functionBodyEffectFull(FunctionBodyEffectFull full, EffectFullArgument argument, EffectFullArgument argument2, IOType type) {
		switch full {
			EmptyFunctionBody: type.type
			CompositionFunctionBodyEffect: compositionFunctionBodyEffectFull(full, argument, argument2)
		}
	}
	
	def static Type compositionFunctionBodyEffectFull(CompositionFunctionBodyEffect effect, EffectFullArgument argument, EffectFullArgument argument2) {
		var first = Others.getFirstFunctionDefinitionFromCompositionBodyEffectFull(effect)
		var chain = effect.functionChain.map[x | Others.getFunctionDefinitionFromEffectFullFactor(x)]
		effectFullFunctionChain(chain, first, argument, argument2)
	}
	
	def static Type effectFullFunctionChain(List<EffectFullReference> references, EffectFullReference first, EffectFullArgument argument, EffectFullArgument argument2) {
		if (argument2 != null) { //HigherOrder
			val functionType = FPMLFactory.eINSTANCE.createEffectFullFunctionType
			val ioTypeArg = FPMLFactory.eINSTANCE.createIOType
			val ioTypeReturn = FPMLFactory.eINSTANCE.createIOType
			ioTypeArg.type = argument2.type
			ioTypeReturn.type = effectFullFunctionChain(references, first, argument, null)
			functionType.argType = ioTypeArg
			functionType.returnType = ioTypeReturn
			return functionType
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
			Function: function(r)
			EffectFullArgument: r.type
		}
	}
	
	def static primitiveEffectFullFunction(PrimitiveEffectFullFunction function) {
		switch function {
			PrimitivePrint: FPMLFactory.eINSTANCE.createUnitType
			PrimitiveRandom: FPMLFactory.eINSTANCE.createIntegerType
			ApplyFIO: function.functionType.returnType.type
		}
	}
	
	def static Type mainFunc(MainFunc m) {
		val ioType = FPMLFactory.eINSTANCE.createIOType
		ioType.type = FPMLFactory.eINSTANCE.createUnitType
		functionBodyEffectFull(m.functionBody, null, null, ioType)
	}
	
}