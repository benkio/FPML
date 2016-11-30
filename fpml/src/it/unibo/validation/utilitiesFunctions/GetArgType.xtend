package it.unibo.validation.utilitiesFunctions

import it.unibo.fPML.*
import it.unibo.validation.FPMLValidator
import org.eclipse.emf.ecore.EReference
import java.util.List
import org.eclipse.xtext.EcoreUtil2
import it.unibo.fPML.EffectFullReference
import it.unibo.fPML.EffectFullFunction
import it.unibo.fPML.EffectFullFunctionDefinition
import it.unibo.fPML.PrimitiveEffectFullFunction
import it.unibo.fPML.EffectFullValue

class GetArgType {
	
	def static Type function(Function f) {
		switch f {
			EffectFullFunction: effectFullFunction(f)
			PureFunction: pureFunction(f)
		}
	}
	
	def static ValueType pureFunction(PureFunction f) {
		switch f {
			PureFunctionDefinition: pureFunctionDefinition(f) 
			PrimitivePureFunction: primitivePureFunction(f)
		}
	}
	
	def static ValueType primitivePureFunction(PrimitivePureFunction f) {
		switch f {
			IntToString: return FPMLFactory.eINSTANCE.createIntegerType
			IntPow: return FPMLFactory.eINSTANCE.createIntegerType
			Plus: return FPMLFactory.eINSTANCE.createIntegerType
			Minus: return FPMLFactory.eINSTANCE.createIntegerType
			Times: return FPMLFactory.eINSTANCE.createIntegerType
			Mod: return FPMLFactory.eINSTANCE.createIntegerType
			ApplyF: return f.functionType
		}
	}
	
	def static ValueType pureFunctionDefinition(PureFunctionDefinition f) {
		switch f {
			PureValue: return null
			PureLambda: return pureLambda(f)
			default: return f.arg.type
		}
	}
	
	def static ValueType pureLambda(PureLambda l){
		return l.arg.type
	}
	
	def static Type effectFullReference(EffectFullReference reference) {
		switch reference {
			EffectFullValue: return FPMLFactory.eINSTANCE.createUnitType
			PureValue: return FPMLFactory.eINSTANCE.createUnitType
			PrimitiveEffectFullValue: return FPMLFactory.eINSTANCE.createUnitType 
			PrimitiveEffectFullFunction: primitiveEffectFullFunction(reference)
			PrimitivePureFunction: primitivePureFunction(reference)
			EffectFullArgument:	return FPMLFactory.eINSTANCE.createUnitType
			Function: function(reference)
		}
	}
	
	def static Type effectFullFunction(EffectFullFunction function) {
		switch function {
			EffectFullFunctionDefinition: effectFullFunctionDefinition(function)
			PrimitiveEffectFullFunction: primitiveEffectFullFunction(function)
		}
	}
	
	def static Type primitiveEffectFullFunction(PrimitiveEffectFullFunction function) {
		switch function {
			PrimitivePrint: return FPMLFactory.eINSTANCE.createStringType 
			ApplyFIO: return function.functionType
     		PrimitiveReturn: return function.type
		}
	}
	
	def static Type primitiveEffectFullValue(PrimitiveEffectFullValue pefv) {
		switch pefv {
			PrimitiveRandom: return FPMLFactory.eINSTANCE.createUnitType
      		PrimitiveTime: return FPMLFactory.eINSTANCE.createUnitType
      		PrimitiveReturn: pefv.type
		}
	}
	
	def static Type effectFullFunctionDefinition(EffectFullFunctionDefinition definition) {
		switch definition{
			EffectFullValue: GetReturnType.effectFullExpression(definition.value)
			EffectFullLambda: effectFullLambda(definition)
			EffectFullFunctionDefinition: definition.arg.type
		}
	}
	
	def static effectFullLambda(EffectFullLambda lambda) {
		if (lambda.arg == null) return FPMLFactory.eINSTANCE.createUnitType
		else return lambda.arg.type
	}
}