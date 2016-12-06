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
			Argument: FPMLFactory.eINSTANCE.createUnitType
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
      		LeftPair: return f.type
      		RightPair: return f.type
		}
	}
	
	def static ValueType pureFunctionDefinition(PureFunctionDefinition f) {
		switch f {
			PureValue: {
				if (f.value instanceof PureFunctionType) {
						return pureLambda((f.value as PureFunctionType).value as PureLambda)
				}else 
					return FPMLFactory.eINSTANCE.createUnitType
			}
			PureLambda: return pureLambda(f)
			default: return f.arg.type
		}
	}
	
	def static ValueType pureLambda(PureLambda l){
    if (l.arg != null) 
		  return l.arg.type
    else
      return FPMLFactory.eINSTANCE.createUnitType
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
      		LeftPairIO: function.type
      		RightPairIO: function.type
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
			EffectFullValue: {
				switch definition.value{
					EffectFullFunctionType: effectFullLambda((definition.value as EffectFullFunctionType).value as EffectFullLambda)
					default: FPMLFactory.eINSTANCE.createUnitType
				}
			}
			EffectFullLambda: effectFullLambda(definition)
			EffectFullFunctionDefinition: definition.arg.type
		}
	}
	
	def static Type effectFullLambda(EffectFullLambda lambda) {
		if (lambda.arg == null) return FPMLFactory.eINSTANCE.createUnitType
		else return lambda.arg.type
	}
}