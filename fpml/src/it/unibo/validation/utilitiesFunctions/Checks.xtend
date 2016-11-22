package it.unibo.validation.utilitiesFunctions

import it.unibo.fPML.*

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
		if (t1 instanceof UnitType) return true
		switch t {
			EffectFullFunctionType: return 	t1 instanceof EffectFullFunctionType &&
											TypeEquals(t.argType, (t1 as EffectFullFunctionType).argType) &&
											TypeEquals(t.returnType, (t1 as EffectFullFunctionType).returnType)
			UnitType: return false
			default: return ValueTypeEquals((t as ValueType), (t1 as ValueType))
		}
	}
	
	def static boolean functionReturnType(PureFunctionDefinition f) {
		return ValueTypeEquals(GetReturnType.pureFunctionDefinition(f), f.returnType) || GetReturnType.pureFunctionDefinition(f) == null 
	}
}