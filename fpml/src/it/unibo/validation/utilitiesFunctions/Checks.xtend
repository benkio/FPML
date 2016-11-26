package it.unibo.validation.utilitiesFunctions

import it.unibo.fPML.*
import it.unibo.fPML.PureLambda
import it.unibo.fPML.FunctionBodyPure
import it.unibo.fPML.ValueType
import it.unibo.fPML.CompositionFunctionBodyPure
import java.util.List
import it.unibo.fPML.PureFunction
import it.unibo.fPML.MainFunc
import it.unibo.fPML.FunctionBodyEffectFull
import it.unibo.fPML.CompositionFunctionBodyEffect
import it.unibo.fPML.EffectFullReference
import it.unibo.fPML.Type
import it.unibo.fPML.EffectFullFunctionDefinition
import org.eclipse.emf.ecore.EObject
import it.unibo.fPML.EffectFullAdtValue
import it.unibo.fPML.EffectFullAdtType

class Checks {
	
	def static boolean DataAndValue(PureAdtValue value, PureAdtType type) {
		switch type {
			IntegerType: return value instanceof IntegerType || 
						       (value instanceof PureValueRef &&
						       	checkValueType((value as PureValueRef).value, type)
						       )
			StringType: return value instanceof StringType ||
							  (value instanceof PureValueRef &&
						       	checkValueType((value as PureValueRef).value, type)
						       )
			DataType: return value instanceof DataValue && 
							 DataAndValue((value as DataValue).value, (type as DataType).type.content)
			PureFunctionType: {
				if ( value instanceof PureFunctionType) 
					return (value as PureFunctionType).value.getFunctionBody instanceof CompositionFunctionBodyPure &&
					 ValueTypeEquals((value as PureFunctionType).value.arg.type, type.argType) && 
					 ValueTypeEquals(GetReturnType.pureFunctionDefinition((value as PureFunctionType).value), type.returnType)
				else if ( value instanceof PureValueRef && (value as PureValueRef).value instanceof PureFunctionDefinition) {
					return  ValueTypeEquals(((value as PureValueRef).value as PureFunctionDefinition).arg.type, type.argType) &&
							ValueTypeEquals(((value as PureValueRef).value as PureFunctionDefinition).returnType, type.returnType)
				} 
			}
			default: {
				switch value{
					PureSumValue: return (type.pureAdtElement2 instanceof PureSumType) && 
									 (  (DataAndValue(value.sumAdtElement1, type.pureAdtElement1)).booleanValue 
									 || (DataAndValue(value.sumAdtElement2, (type.pureAdtElement2 as PureSumType).adtElement)).booleanValue)
					PureProdValue: return (type.pureAdtElement2 instanceof PureProdType) && 
									(   (DataAndValue(value.prodAdtElement1, type.pureAdtElement1)).booleanValue 
									&& (DataAndValue(value.prodAdtElement2, (type.pureAdtElement2 as PureProdType).adtElement)).booleanValue)
          			PureValueRef: return checkValueType(value.value, type)
					default: false
				}
			}
		}
	}
	
	def static boolean checkValueType(PureValue v, PureAdtType adtt) {
		val valueType = Others.getTypeFromExpression(v.value)
		switch adtt {
			IntegerType: return valueType instanceof IntegerType
			StringType: return valueType instanceof StringType
			DataType: return valueType instanceof DataType && adtt.type.name.equals((valueType as DataType).type.name) 
			PureFunctionType: valueType instanceof PureFunctionType && ValueTypeEquals(adtt.argType, (valueType as PureFunctionType).argType) && ValueTypeEquals(adtt.returnType, (valueType as PureFunctionType).returnType)
			default: false
		}
	}
	
	def static boolean ValueTypeEquals(ValueType v, ValueType v2) {
		switch v {
			PureFunctionType: return 	v2 instanceof PureFunctionType && 
										ValueTypeEquals(v.argType,(v2 as PureFunctionType).argType) && 
										ValueTypeEquals(v.returnType,(v2 as PureFunctionType).returnType)
			DataType: return v2 instanceof DataType && v.type.name.equals((v2 as DataType).type.name)
			default: return v.eClass == v2.eClass
		}
	}
	
	def static boolean TypeEquals(Type t, Type t1) {
		if (t1 instanceof UnitType || (t instanceof UnitType && t1 == null)) return true
		switch t {
			EffectFullFunctionType: return 	t1 instanceof EffectFullFunctionType &&
											TypeEquals(t.argType, (t1 as EffectFullFunctionType).argType) &&
											TypeEquals(t.returnType.type, (t1 as EffectFullFunctionType).returnType.type)
			UnitType: return false
			default: return ValueTypeEquals((t as ValueType), (t1 as ValueType))
		}
	}
	
	def static boolean functionReturnType(PureFunctionDefinition f) {
		return ValueTypeEquals(GetReturnType.pureFunctionDefinition(f), f.returnType) || GetReturnType.pureFunctionDefinition(f) == null 
	}
	
	def static boolean mainReturnType(MainFunc m){
		return TypeEquals(GetReturnType.mainFunc(m), FPMLFactory.eINSTANCE.createUnitType) || GetReturnType.mainFunc(m) == null 
	}
	
	def static boolean functionArgType(PureFunctionDefinition f) {
		return functionBody(f.functionBody, f.arg.type)
	}
	
	def static boolean pureLambda(PureLambda lambda) {
		val arg = GetArgType.pureLambda(lambda)
		
		return functionBody(lambda.functionBody, arg)
	}
	
	def static boolean functionBody(FunctionBodyPure pure, ValueType argType) {
		switch pure {
			EmptyFunctionBody: return true
			CompositionFunctionBodyPure: return compositionFunctionBodyPure(pure, argType)
		}
	}
	
	def static boolean compositionFunctionBodyPure(CompositionFunctionBodyPure pure, ValueType argType) {
		val first = Others.getFirstFunctionDefinitionFromCompositionBodyPure(pure)
		val chain = pure.functionChain.map[x | Others.getFunctionDefinitionFromPureFactor(x)].toList
		return functionChainPure(chain, first,  argType)
	}
	
	def static boolean functionChainPure(List<PureFunction> functions, PureFunction first, ValueType type) {
		var startType = type
		
		val argFuncFirst = GetArgType.pureFunction(first)
		if (!ValueTypeEquals(startType, argFuncFirst)) return false
		startType = GetReturnType.pureFunction(first)
	
		for (PureFunction f : functions) {
			val argFunc = GetArgType.pureFunction(f)
			if (startType != null && argFunc != null && !ValueTypeEquals(startType, argFunc)) return false
			startType = GetReturnType.pureFunction(f)
		}
		return true
	}
	
	def static boolean mainArgType(MainFunc func) {
		return functionBodyEffectFull(func.functionBody, FPMLFactory.eINSTANCE.createUnitType)
	}
	
	def static boolean functionBodyEffectFull(FunctionBodyEffectFull full, Type argType) {
		switch full {
			EmptyFunctionBody: return true
			CompositionFunctionBodyEffect: compositionFunctioBodyEffect(full, argType)
		}
	}
	
	def static boolean compositionFunctioBodyEffect(CompositionFunctionBodyEffect effect, Type argType) {
		val first = Others.getFirstFunctionDefinitionFromCompositionBodyEffectFull(effect)
		val chain = effect.functionChain.map[x | Others.getFunctionDefinitionFromEffectFullFactor(x)].toList
		return functionChainEffectFull(chain, first,  argType)
	}
	
	def static functionChainEffectFull(List<EffectFullReference> references, EffectFullReference first, Type type) {
		var startType = type
		
		val argFuncFirst = GetArgType.effectFullReference(first)
		if (!TypeEquals(startType, argFuncFirst)) return false
		startType = GetReturnType.effectFullReference(first)
	
		for (EffectFullReference r : references) {
			val argFunc = GetArgType.effectFullReference(r)
			if (startType != null && argFunc != null && !TypeEquals(startType, argFunc)) return false
			startType = GetReturnType.effectFullReference(r)
		}
		return true
	}
	
	def static functionReturnTypeEffectFull(EffectFullFunctionDefinition definition) {
		return TypeEquals(GetReturnType.effectFullFunctionDefinition(definition), definition.returnType.type) || GetReturnType.effectFullFunctionDefinition(definition) == null 
	}
	
	def static functionArgTypeEffectFull(it.unibo.fPML.EffectFullFunctionDefinition definition) {
		return functionBodyEffectFull(definition.functionBody, definition.arg.type)
		
	}
	
	def static boolean effectFullLambda(EffectFullLambda lambda) {
		val arg = GetArgType.effectFullLambda(lambda)
		
		return functionBodyEffectFull(lambda.functionBody, arg)
	}
	
	def static boolean effectFullDataAndValue(EffectFullAdtValue value, EffectFullAdtType type) {
		switch type {
			IOType: {
				switch type.type {
					ValueType: 	(value instanceof Expression && 
								ValueTypeEquals(type.type as ValueType, GetReturnType.expression(value as Expression))) ||
								(value instanceof PureValueRef &&
						       	TypeEquals(GetReturnType.expression((value as PureValueRef).value.value), type.type)) ||
						       	((value instanceof EffectFullValueRef &&
						       	TypeEquals(GetReturnType.effectFullExpression((value as EffectFullValueRef).value.value), type.type)))
					UnitType: 	value instanceof UnitType ||
								(value instanceof EffectFullValueRef &&
						       	TypeEquals(GetReturnType.effectFullExpression((value as EffectFullValueRef).value.value), type.type)) 
					EffectFullFunctionType: {
						if (value instanceof EffectFullFunctionType) 
							return (value as EffectFullFunctionType).value.getFunctionBody instanceof CompositionFunctionBodyEffect &&
							 TypeEquals((value as EffectFullFunctionType).value.arg.type, (type.type as EffectFullFunctionType).argType) && 
							 TypeEquals(GetReturnType.effectFullFunctionDefinition((value as EffectFullFunctionType).value), (type.type as EffectFullFunctionType).returnType.type)
						else if (value instanceof EffectFullValueRef && (value as EffectFullValueRef).value instanceof EffectFullFunctionDefinition) {
							return  TypeEquals(((value as EffectFullValueRef).value as EffectFullFunctionDefinition).arg.type, (type.type as EffectFullFunctionType).argType) &&
									TypeEquals(((value as EffectFullValueRef).value as EffectFullFunctionDefinition).returnType.type, (type.type as EffectFullFunctionType).returnType.type)
						} 
					}
					EffectFullDataType: return value instanceof EffectFullDataValue && 
							 			effectFullDataAndValue((value as EffectFullDataValue).value, (type as EffectFullDataType).type.content)
				}
			}
			default: {
				switch value{
					EffectFullSumValue: return (type.effectFullAdtElement2 instanceof EffectFullSumType) && 
									 (  (effectFullDataAndValue(value.sumAdtElement1, type.effectFullAdtElement1)).booleanValue 
									 || (effectFullDataAndValue(value.sumAdtElement2, (type.effectFullAdtElement2 as EffectFullSumType).adtElement)).booleanValue)
					EffectFullProdValue: return (type.effectFullAdtElement2 instanceof PureProdType) && 
									(   (effectFullDataAndValue(value.prodAdtElement1, type.effectFullAdtElement1)).booleanValue 
									&& (effectFullDataAndValue(value.prodAdtElement2, (type.effectFullAdtElement2 as EffectFullProdType).adtElement)).booleanValue)
					default: false	
				}	
			}
		}
	}
	
}