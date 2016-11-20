package it.unibo.validation.utilitiesFunctions

import it.unibo.fPML.*

class Checks {
		def static boolean typeCheckDataAndValue(AdtValue value, AdtType type) {
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
							 typeCheckDataAndValue((value as DataValue).value, (type as DataType).type.content)
			PureFunctionType: {
				if ( value instanceof PureFunctionType) 
					return (value as PureFunctionType).value.functionBody instanceof CompositionFunctionBodyPure &&
					 checkValueTypeEquals((value as PureFunctionType).value.arg.type, type.argType) && 
					 checkValueTypeEquals(GetReturnType.getReturnTypeCompositionFunctionBodyPure((value as PureFunctionType).value.functionBody as CompositionFunctionBodyPure), type.returnType)
				else if ( value instanceof ValueRef && (value as ValueRef).value instanceof PureFunctionDefinition) {
					return  checkValueTypeEquals(((value as ValueRef).value as PureFunctionDefinition).arg.type, type.argType) &&
							checkValueTypeEquals(((value as ValueRef).value as PureFunctionDefinition).returnType, type.returnType)
				} 
			}
			default: {
				switch value{
					SumValue: return (type.adtElement2 instanceof SumType) && 
									 (  (typeCheckDataAndValue(value.sumAdtElement1, type.adtElement1)).booleanValue 
									 || (typeCheckDataAndValue(value.sumAdtElement2, (type.adtElement2 as SumType).adtElement)).booleanValue)
					ProdValue: return (type.adtElement2 instanceof ProdType) && 
									(   (typeCheckDataAndValue(value.prodAdtElement1, type.adtElement1)).booleanValue 
									&& (typeCheckDataAndValue(value.prodAdtElement2, (type.adtElement2 as ProdType).adtElement)).booleanValue)
          			ValueRef: return checkValueType(value.value, type)
					default: false
				}
			}
		}
	}
	
	def static boolean checkValueType(PureReference v, AdtType adtt) {
		if (v instanceof Value) {
			val valueType = Others.getTypeFromExpression(v.value)
			switch adtt {
				IntegerType: return valueType instanceof IntegerType
				StringType: return valueType instanceof StringType
				DataType: return valueType instanceof DataType && adtt.type.name.equals((valueType as DataType).type.name) 
				PureFunctionType: valueType instanceof PureFunctionType && checkValueTypeEquals(adtt.argType, (valueType as PureFunctionType).argType) && checkValueTypeEquals(adtt.returnType, (valueType as PureFunctionType).returnType)
				default: false
			}
		} else {
			return adtt instanceof PureFunctionType && checkValueTypeEquals((v as PureFunctionDefinition).arg.type, (adtt as PureFunctionType).argType) && checkValueTypeEquals((v as PureFunctionDefinition).returnType, (adtt as PureFunctionType).returnType)  
		}
	}
	
	def static boolean checkValueTypeEquals(ValueType v, ValueType v2) {
		switch v {
			PureFunctionType: return 	v2 instanceof PureFunctionType && 
										checkValueTypeEquals(v.argType,(v2 as PureFunctionType).argType) && 
										checkValueTypeEquals(v.returnType,(v2 as PureFunctionType).returnType)
			DataType: return v2 instanceof DataType && v.type.name.equals((v2 as DataType).type.name)
			default: return v.eClass == v2.eClass
		}
	}
	
	def static boolean checkTypeEquals(Type t, Type t1) {
		if (t1 instanceof UnitType) return true
		switch t {
			EffectFullFunctionType: return 	t1 instanceof EffectFullFunctionType &&
											checkTypeEquals(t.argType, (t1 as EffectFullFunctionType).argType) &&
											checkTypeEquals(t.returnType, (t1 as EffectFullFunctionType).returnType)
			UnitType: return false
			default: return checkValueTypeEquals((t as ValueType), (t1 as ValueType))
		}
	}
	
	def static isInputTypeCompatibleWithArgType(Type argType, Type inputType){
		return (argType instanceof DataType) &&
				((argType as DataType).adtElement2 != null &&
				((argType as DataType).adtElement2 instanceof ProdType) &&
				((argType as DataType).adtElement1.eClass == inputType.eClass))
	}
}