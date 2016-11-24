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

class Checks {
	
	def static boolean DataAndValue(AdtValue value, AdtType type) {
		switch type {
			IntegerType: return value instanceof IntegerType || 
						       (value instanceof ValueRef &&
						       	checkValueType((value as ValueRef).value, type)
						       )
			StringType: return value instanceof StringType ||
							  (value instanceof ValueRef &&
						       	checkValueType((value as ValueRef).value, type)
						       )
			DataType: return value instanceof DataValue && 
							 DataAndValue((value as DataValue).value, (type as DataType).type.content)
			PureFunctionType: {
				if ( value instanceof PureFunctionType) 
					return (value as PureFunctionType).value.getFunctionBody instanceof CompositionFunctionBodyPure &&
					 ValueTypeEquals((value as PureFunctionType).value.arg.type, type.argType) && 
					 ValueTypeEquals(GetReturnType.pureFunctionDefinition((value as PureFunctionType).value), type.returnType)
				else if ( value instanceof ValueRef && (value as ValueRef).value instanceof PureFunctionDefinition) {
					return  ValueTypeEquals(((value as ValueRef).value as PureFunctionDefinition).arg.type, type.argType) &&
							ValueTypeEquals(((value as ValueRef).value as PureFunctionDefinition).returnType, type.returnType)
				} 
			}
			default: {
				switch value{
					SumValue: return (type.adtElement2 instanceof SumType) && 
									 (  (DataAndValue(value.sumAdtElement1, type.adtElement1)).booleanValue 
									 || (DataAndValue(value.sumAdtElement2, (type.adtElement2 as SumType).adtElement)).booleanValue)
					ProdValue: return (type.adtElement2 instanceof ProdType) && 
									(   (DataAndValue(value.prodAdtElement1, type.adtElement1)).booleanValue 
									&& (DataAndValue(value.prodAdtElement2, (type.adtElement2 as ProdType).adtElement)).booleanValue)
          			ValueRef: return checkValueType(value.value, type)
					default: false
				}
			}
		}
	}
	
	def static boolean checkValueType(Value v, AdtType adtt) {
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
	
}