package it.unibo.validation


import it.unibo.fPML.PureFunction
import it.unibo.fPML.EffectFullFunction
import it.unibo.fPML.DataType
import it.unibo.fPML.ChainElement
import it.unibo.fPML.InitialPureChainElement
import it.unibo.fPML.ValueType
import it.unibo.fPML.Value
import it.unibo.fPML.Expression
import it.unibo.fPML.IntegerType
import it.unibo.fPML.StringType
import it.unibo.fPML.UnitType
import it.unibo.fPML.DataValue
import it.unibo.fPML.SumValue
import it.unibo.fPML.SumType
import it.unibo.fPML.AdtType
import it.unibo.fPML.ProdType
import it.unibo.fPML.AdtValue
import it.unibo.fPML.ProdValue
import it.unibo.fPML.PrimitivePrint
import it.unibo.fPML.FPMLFactory

/**
 * Created by benkio on 11/3/16.
 */
class UtilitiesFunctions {
	
	def static getReturnType(PureFunction pf){
		val t = pf.getReturnType()
		if (t instanceof DataType) return t.type
		return t 
	}
	
	def static getReturnType(EffectFullFunction ef){
        val t = ef.getReturnType().getType()
        switch t {
        	DataType: return (t as DataType).getType()
        	PrimitivePrint: {
        		val t1 = FPMLFactory.eINSTANCE.createIOType()
        		t1.type = FPMLFactory.eINSTANCE.createUnitType
        		return t1
        	}
        	default: return t 
        }
    }
	
    def static getReturnType(ChainElement f1){
        switch f1 {
            EffectFullFunction : return getReturnType(f1)
            PureFunction: return getReturnType(f1)
            Value: return getTypeFromExpression(f1.value)
        }
    }

    def static getReturnType(InitialPureChainElement f1){
        switch f1 {
            PureFunction: return getReturnType(f1)
            Value: return getTypeFromExpression(f1.value)
        }
    }

	def static getArgType(PureFunction pf){
		val t = pf.getArg().getType()
    	if (t instanceof DataType) return t.getType()
    	return t
	}
	
 	def static getArgType(EffectFullFunction ef){
 		val t = ef.getArg().getType()
 		switch t {
 			DataType: return t.getType()
 			PrimitivePrint: return FPMLFactory.eINSTANCE.createStringType()
 			default: return t
 		}
 	}

    def static getArgType(ChainElement f1){
        switch f1 {
            EffectFullFunction: return getArgType(f1)
            PureFunction: return getArgType(f1)
            Value: return getTypeFromExpression(f1.value)
        }
    }

    def static getArgType(InitialPureChainElement f1){
        switch f1 {
            PureFunction: return getArgType(f1)
            Value: return getTypeFromExpression(f1.value)
        }
    }

    def static getTypeFromValueType(ValueType t){
        switch t {
            DataType: return t.getType()
            default: return t
        }
    }
    
    def static getTypeFromExpression(Expression e){
    	switch e {
    		IntegerType: return (e as IntegerType)
    		StringType: return (e as StringType)
    		UnitType: return (e as UnitType)
    		DataType: return (e as DataType).type
    	}
    }
	
	def static boolean typeCheckDataAndValue(AdtValue value, AdtType type) {
		switch type {
			IntegerType: return value instanceof IntegerType
			StringType: return value instanceof StringType
			DataType: return typeCheckDataAndValue((value as DataValue).value, (type as DataType).type.content) 
			default: {
				switch value{
					SumValue: return (type.adtElement2 instanceof SumType) && 
									 (  (typeCheckDataAndValue(value.sumAdtElement1, type.adtElement1)).booleanValue 
									 || (typeCheckDataAndValue(value.sumAdtElement2, (type.adtElement2 as SumType).adtElement)).booleanValue)
					ProdValue: return (type.adtElement2 instanceof ProdType) && 
									(   (typeCheckDataAndValue(value.prodAdtElement1, type.adtElement1)).booleanValue 
									&& (typeCheckDataAndValue(value.prodAdtElement2, (type.adtElement2 as ProdType).adtElement)).booleanValue)
					default: false
				}
			}
		}
	}
}