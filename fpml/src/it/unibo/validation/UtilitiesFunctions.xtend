package it.unibo.validation


import it.unibo.fPML.PureFunction
import it.unibo.fPML.EffectFullFunction
import it.unibo.fPML.Data
import it.unibo.fPML.DataType
import it.unibo.fPML.ChainElement
import it.unibo.fPML.InitialPureChainElement
import it.unibo.fPML.ValueType
/**
 * Created by benkio on 11/3/16.
 */
class UtilitiesFunctions {
    def static getReturnType(ChainElement f1){
        switch f1 {
            EffectFullFunction : {
                val t = f1.getReturnType().getType()
                if (t instanceof DataType) return t.getType()
                return t
            }
            PureFunction: return f1.getReturnType()
            Data: return f1
        }
    }

    def static getReturnType(InitialPureChainElement f1){
        switch f1 {
            PureFunction: return f1.getReturnType()
            Data: return f1
        }
    }

    def static getArgType(ChainElement f1){
        switch f1 {
            EffectFullFunction: {
                val t = f1.getArg().getType()
                if (t instanceof DataType) return t.getType()
                return t
            }
            PureFunction: return f1.getArg().getType()
            Data: return f1
        }
    }

    def static getArgType(InitialPureChainElement f1){
        switch f1 {
            PureFunction: return f1.getArg().getType()
            Data: return f1
        }
    }

    def static getTypeFromValueType(ValueType t){
        switch t {
            DataType: return t.getType()
            default: return t
        }
    }
}