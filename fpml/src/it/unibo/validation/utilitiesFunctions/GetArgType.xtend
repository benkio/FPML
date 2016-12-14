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
import it.unibo.services.FPMLGrammarAccess.IsLeftEffectFullElements

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
			BoolToString: return FPMLFactory.eINSTANCE.createBooleanType
			IntPow: return FPMLFactory.eINSTANCE.createIntegerType
			Plus: return EcoreUtil.copy(f.type) as ValueType
			Minus: return FPMLFactory.eINSTANCE.createIntegerType
			Times: return FPMLFactory.eINSTANCE.createIntegerType
			Mod: return FPMLFactory.eINSTANCE.createIntegerType
			ApplyF: return EcoreUtil.copy(f.functionType)
      		LeftAlgebraic: return EcoreUtil.copy(f.type)
      		RightAlgebraic: return EcoreUtil.copy(f.type)
      		Equals: return EcoreUtil.copy(f.type) as ValueType 
      		MinorEquals: return FPMLFactory.eINSTANCE.createIntegerType
      		MajorEquals: return FPMLFactory.eINSTANCE.createIntegerType
      		Minor: return FPMLFactory.eINSTANCE.createIntegerType 
      		Major: return FPMLFactory.eINSTANCE.createIntegerType
      		LogicAnd:return FPMLFactory.eINSTANCE.createBooleanType
      		LogicOr: return FPMLFactory.eINSTANCE.createBooleanType
          LogicNot: return FPMLFactory.eINSTANCE.createBooleanType
      		ExtractPure: return Others.createDataType(f.data)
      		IsLeftPure: EcoreUtil.copy(f.type)
      		IsRightPure: EcoreUtil.copy(f.type)
      		PureIf: return FPMLFactory.eINSTANCE.createBooleanType
          	PureEitherIf: return FPMLFactory.eINSTANCE.createBooleanType
          	PureReturn: return EcoreUtil.copy(f.type)
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
			default: return EcoreUtil.copy(f.arg.type)
		}
	}
	
	def static ValueType pureLambda(PureLambda l){
    if (l.arg != null) 
		  return EcoreUtil.copy(l.arg.type)
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
			IOPureFunction: FPMLFactory.eINSTANCE.createUnitType
			EffectFullFunctionType: FPMLFactory.eINSTANCE.createUnitType 
			EffectFullDataValue: FPMLFactory.eINSTANCE.createUnitType
			EffectFullProdValue: Others.createEffectFullAlgebraicType(effectFullBodyContent(Others.getInnerElementFromEffectFullExpressionAndEffectFullFunctionReference(expression.prodAdtElement1)), effectFullBodyContent(Others.getInnerElementFromEffectFullExpressionAndEffectFullFunctionReference(expression.prodAdtElement2)), false)
			EffectFullSumValue: Others.createEffectFullAlgebraicType(effectFullBodyContent(Others.getInnerElementFromEffectFullExpressionAndEffectFullFunctionReference(expression.sumAdtElement1)), effectFullBodyContent(Others.getInnerElementFromEffectFullExpressionAndEffectFullFunctionReference(expression.sumAdtElement2)), true)
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
			Print: return FPMLFactory.eINSTANCE.createStringType 
			ApplyFIO: return EcoreUtil.copy(function.functionType)
     		EffectFullReturn: return EcoreUtil.copy(function.type)
      		LeftAlgebraicIO: EcoreUtil.copy(function.type)
      		RightAlgebraicIO: EcoreUtil.copy(function.type)
      		ExtractEffectFull: return Others.createDataType(function.data)
      		LiftPureFunction: return pureFunction(Others.getPureFunctionFromLiftPureFunction(function))
      		LiftEffectFullFunction: return effectFullFunction(Others.getEffectFullFunctionFromLiftEffectFullFunction(function))
			IsLeftEffectFull: EcoreUtil.copy(function.type)
			IsRightEffectFull: EcoreUtil.copy(function.type)
			EffectFullIf: FPMLFactory.eINSTANCE.createBooleanType
      		EffectFullEitherIf: FPMLFactory.eINSTANCE.createBooleanType
          	GetLine: FPMLFactory.eINSTANCE.createUnitType
		}
	}
	
	def static Type primitiveEffectFullValue(PrimitiveEffectFullValue pefv) {
		switch pefv {
			Random: return FPMLFactory.eINSTANCE.createUnitType
      		Time: return FPMLFactory.eINSTANCE.createUnitType
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