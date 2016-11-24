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

class GetArgType {
		
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
			Value: return null
			PureLambda: return pureLambda(f)
			default: return f.arg.type
		}
	}
	
	def static ValueType pureLambda(PureLambda l){
		return l.arg.type
	}
	
	def static Type effectFullReference(EffectFullReference reference) {
		switch reference {
			EffectFullFunction: return effectFullFunction(reference)
			PureFunction: return pureFunction(reference)
			EffectFullArgument:	return FPMLFactory.eINSTANCE.createUnitType
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
			PrimitiveRandom: return FPMLFactory.eINSTANCE.createUnitType
			ApplyFIO: return function.functionType.argType
		}
	}
	
	def static Type effectFullFunctionDefinition(EffectFullFunctionDefinition definition) {
		definition.arg.type
	}
}