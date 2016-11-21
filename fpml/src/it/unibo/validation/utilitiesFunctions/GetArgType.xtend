package it.unibo.validation.utilitiesFunctions

import it.unibo.fPML.*
import it.unibo.validation.FPMLValidator
import org.eclipse.emf.ecore.EReference
import java.util.List
import org.eclipse.xtext.EcoreUtil2

class GetArgType {
		
		def static ValueType getArgTypePure(PureFunctionDefinition pf, ValueType previousChainType){
		val t = pf.getArg()
		if (t == null) {
			if ( previousChainType instanceof PureFunctionType) {
				return getArgTypePurePrimitive(pf, previousChainType)
			} else {
				return getArgTypePurePrimitive(pf, null)
			}	
		} else {
			switch t.getType() {
				DataType: return (t.getType() as DataType)
				default: return t.type
			}
		}
	}
	
 	def static Type getArgTypeEffectFull(EffectFullFunctionDefinition ef, Type previousChainType){
 		val t = ef.getArg()
 		if (t == null){
 			if ( previousChainType instanceof EffectFullFunctionType) {
				return getArgTypeEffectFullPrimitive(ef, previousChainType)
			} else {
				return getArgTypeEffectFullPrimitive(ef, null)
			}
 		} else {
	 		switch t.getType() {
	 			DataType: return (t.getType() as DataType)
	 			default: return t.type
	 		}
 		}
 	}

    def static Type getArgType(ChainElement f1, Type previousChainType){
        switch f1 {
            EffectFullFunctionDefinition: return getArgTypeEffectFull(f1, previousChainType)
            PureFunctionDefinition: return getArgTypePure(f1, (previousChainType as ValueType))
            Value: return Others.getTypeFromExpression(f1.value)
            EffectFullArgument: return f1.type
        }
    }

	def static ValueType getArgTypePurePrimitive(PureFunctionDefinition pf, PureFunctionType previousFunction){
    	switch pf {
    		IntToString: return FPMLFactory.eINSTANCE.createIntegerType()
        	IntPow: return FPMLFactory.eINSTANCE.createIntegerType()
          Plus: return FPMLFactory.eINSTANCE.createIntegerType()
          Minus: return FPMLFactory.eINSTANCE.createIntegerType()
          Times: return FPMLFactory.eINSTANCE.createIntegerType()
          Mod: return FPMLFactory.eINSTANCE.createIntegerType()
          ApplyF: {
				if (previousFunction != null && (Others.getTypeFromExpression(pf.value.value) instanceof ValueType)) {
					previousFunction.argType = Others.getTypeFromExpression(pf.value.value) as ValueType
					return previousFunction
				}
			}
        	default: throw new Exception("this cannot happen during the typechecking, get argument type pure primitive")
    	}
    }
    
    def static Type getArgTypeEffectFullPrimitive(EffectFullFunctionDefinition ef, EffectFullFunctionType previousFunction){
    	switch ef {
    		PrimitivePrint: return FPMLFactory.eINSTANCE.createStringType()
    		ApplyFIO: {
    			if (previousFunction != null) {
					return previousFunction.argType
				} else 
					throw new Exception("this cannot happen during the typechecking, get argument type pure primitive")
    		}
    		default: throw new Exception("this cannot happen during the typechecking, get argument type Effectfull primitive")
    	}
    }
    
    def static ValueType getArgTypeCompositionFunctionBodyPureContainer(CompositionFunctionBodyPure cfbp) {
    	val container = cfbp.eContainer
    	if (container instanceof PureFunctionDefinition)
    		return container.arg.type
    	throw new Exception("this cannot happen during the typechecking, getArgTypeCompositionBodyPureContainer")
    }
    
    def static Type getArgTypeCompositionFunctionBodyEffectFullContainer(CompositionFunctionBodyEffect cfbe) {
    	val container = cfbe.eContainer
    	if (container instanceof EffectFullFunctionDefinition || container instanceof MainFunc)
    		switch container{
    			EffectFullFunctionDefinition: return container.arg.type
    			MainFunc: return FPMLFactory.eINSTANCE.createUnitType
    		}
    	throw new Exception("this cannot happen during the typechecking, getArgTypeCompositionFunctionBodyEffectFullContainer")
    }
}