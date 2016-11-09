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
        if (t instanceof DataType) return t.getType()
        return t
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
        if (t instanceof DataType) return t.getType()
        return t
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
}