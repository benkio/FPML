package it.unibo.validation.utilitiesFunctions

import it.unibo.fPML.*
import org.eclipse.emf.common.util.EList
import it.unibo.fPML.EffectFullArgument
import org.eclipse.xtext.EcoreUtil2
import java.util.List
import it.unibo.fPML.CompositionFunctionBodyPureFactor
import it.unibo.fPML.ValueType
import it.unibo.fPML.FunctionBodyPure
import it.unibo.fPML.Expression
import it.unibo.fPML.CompositionFunctionBodyPure
import it.unibo.fPML.PureFunctionDefinition
import it.unibo.fPML.Argument

class GetReturnType {
	
	def static ValueType pureFunction(PureFunction f){
		switch f {
			PureFunctionDefinition: pureFunction(f)
			PrimitivePureFunction: primitivePureFunction(f)
		}
	}	
	
	def static ValueType pureFunctionDefinition(PureFunctionDefinition f){
		switch f {
			Value: expression(f.value)
			PureLambda: functionBodyPure(f.functionBody, f.arg, f.arg2)
			PureFunctionDefinition: functionBodyPure(f.functionBody, f.arg, f.arg2)
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
	
	def static ValueType functionBodyPure(FunctionBodyPure pure, Argument arg1, Argument arg2) {
		switch pure {
			EmptyFunctionBody: return null
			CompositionFunctionBodyPure: compositionFunctionBodyPure(pure, arg1, arg2)
		}
	}
	
	def static ValueType compositionFunctionBodyPure(CompositionFunctionBodyPure pure, Argument arg1, Argument arg2) {
		val first = Others.getFirstFunctionDefinitionFromCompositionBodyPure(pure)
		val chain = pure.functionChain.map[x | Others.getFunctionDefinitionFromPureFactor(x)]
		chain.add(0, first)
		pureFunctionChain(chain, arg1, arg2)
	}
	
	def static ValueType pureFunctionChain(List<PureFunction> definitions, Argument argument, Argument argument2) {
		if (argument2 != null) { //HigherOrder
			val functionType = FPMLFactory.eINSTANCE.createPureFunctionType
			functionType.argType = argument2.type
			functionType.returnType = pureFunctionChain(definitions, argument, null)
			return functionType
		} else { //Normal single argument function
			val firstFunctionReturnType = pureFunction(definitions.head)
			if (definitions.size == 1)
				return firstFunctionReturnType
			else {
				val arg = FPMLFactory.eINSTANCE.createArgument
				argument.type = firstFunctionReturnType
				return pureFunctionChain(definitions.tail.toList, arg, null)
			}
		}
	}
	
	def static ValueType primitivePureFunction(PrimitivePureFunction f) {
		switch f {
			IntToString: return IntIntFunc
			IntPow: return IntIntFunc
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
}