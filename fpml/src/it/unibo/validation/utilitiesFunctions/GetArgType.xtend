package it.unibo.validation.utilitiesFunctions

import it.unibo.fPML.*
import it.unibo.validation.FPMLValidator
import org.eclipse.emf.ecore.EReference
import java.util.List
import org.eclipse.xtext.EcoreUtil2
import it.unibo.fPML.EffectFullFunction
import it.unibo.fPML.EffectFullFunctionDefinition
import it.unibo.fPML.PrimitiveEffectFullFunction
import it.unibo.fPML.EffectFullValue
import org.eclipse.emf.ecore.util.EcoreUtil
import it.unibo.fPML.EffectFullPrimitive
import it.unibo.fPML.EffectFullExpression

class GetArgType {
	
	def static Type function(Function f) {
		switch f {
			EffectFullFunction: effectFullFunction(f)
			PureFunction: pureFunction(f)
		}
	}
	
	def static ValueType pureFunction(PureFunction f) {
		switch f {
			PureValue: FPMLFactory.eINSTANCE.createUnitType
			PureFunctionDefinition: pureFunctionDefinition(f) 
			PrimitivePureFunction: primitivePureFunction(f)
			PureArgument: FPMLFactory.eINSTANCE.createUnitType
			Expression: FPMLFactory.eINSTANCE.createUnitType
		}
	}
	
	def static ValueType primitivePureFunction(PrimitivePureFunction f) {
		switch f {
			IntToString: return FPMLFactory.eINSTANCE.createIntegerType
			IntPow: return FPMLFactory.eINSTANCE.createIntegerType
			Plus: return EcoreUtil.copy(f.type) as ValueType
			Minus: return FPMLFactory.eINSTANCE.createIntegerType
			Times: return FPMLFactory.eINSTANCE.createIntegerType
			Mod: return FPMLFactory.eINSTANCE.createIntegerType
			ApplyF: return EcoreUtil.copy(f.functionType)
      		LeftPair: return EcoreUtil.copy(f.type)
      		RightPair: return EcoreUtil.copy(f.type)
      		Equals: return EcoreUtil.copy(f.type) as ValueType 
      		MinorEquals: return FPMLFactory.eINSTANCE.createIntegerType
      		MajorEquals: return FPMLFactory.eINSTANCE.createIntegerType
      		Minor: return FPMLFactory.eINSTANCE.createIntegerType 
      		Major: return FPMLFactory.eINSTANCE.createIntegerType
      		LogicAnd:return FPMLFactory.eINSTANCE.createBooleanType
      		LogicOr: return FPMLFactory.eINSTANCE.createBooleanType
      		ExtractPure: return Others.createDataType(f.data)
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
	
	def static Type effectFullBodyContent(EffectFullBodyContent reference) {
		switch reference {
			EffectFullExpression: effectFullExpression(reference)
			EffectFullFunction: effectFullFunction(reference)
			EffectFullPrimitive: effectFullPrimitive(reference)
		}
	}
	
	def static Type effectFullExpression(EffectFullExpression expression) {
		switch expression {
			IOEffectFullFunction: FPMLFactory.eINSTANCE.createUnitType
			IOEffectFullExpression: FPMLFactory.eINSTANCE.createUnitType 
			IOExpression: FPMLFactory.eINSTANCE.createUnitType
			IOPureFunction: pureFunction(Others.getPureFunctionFromIOPureFunction(expression))
			EffectFullFunctionType: effectFullFunctionDefinition(expression.value) 
			EffectFullDataValue: FPMLFactory.eINSTANCE.createUnitType
			EffectFullProdValue: Others.createEffectFullAlgebraicType(effectFullExpression(expression.prodAdtElement1), effectFullExpression(expression.prodAdtElement2), false)
			EffectFullSumValue: Others.createEffectFullAlgebraicType(effectFullExpression(expression.sumAdtElement1), effectFullExpression(expression.sumAdtElement2), true)
			EffectFullValueRef: effectFullExpression(expression.value.value)
		}
	}
	
	def static Type effectFullPrimitive(EffectFullPrimitive primitive) {
		switch primitive {
			PrimitiveEffectFullFunction: primitiveEffectFullFunction(primitive)
			PrimitiveEffectFullValue: primitiveEffectFullValue(primitive)
		}
	}
	
	def static Type effectFullFunction(EffectFullFunction function) {
		switch function {
			EffectFullArgument: FPMLFactory.eINSTANCE.createUnitType
			EffectFullValue: effectFullExpression(function.value)
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
      		ExtractEffectFull: return Others.createDataType(function.data)
		}
	}
	
	def static Type primitiveEffectFullValue(PrimitiveEffectFullValue pefv) {
		switch pefv {
			PrimitiveRandom: return FPMLFactory.eINSTANCE.createUnitType
      		PrimitiveTime: return FPMLFactory.eINSTANCE.createUnitType
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
			EffectFullFunctionDefinition: Others.getArgumentType(definition.arg)
		}
	}
	
	def static Type effectFullLambda(EffectFullLambda lambda) {
		if (lambda.arg == null) return FPMLFactory.eINSTANCE.createUnitType
		else return Others.getArgumentType(lambda.arg)
	}
}