package it.unibo.validation.utilitiesFunctions

import it.unibo.fPML.*

class GetReturnType {
		def static ValueType getReturnValueType(PureFunctionDefinition pf, ValueType previousChainType){
		val t = pf.getReturnType()
		if (t == null){
			if ( previousChainType instanceof PureFunctionType) {
				return GetReturnType.getReturnTypePurePrimitive(pf, previousChainType)
			} else {
				return GetReturnType.getReturnTypePurePrimitive(pf, null)
			}
		}
		return t
	}
	
	def static Type getReturnEffectFullType(EffectFullFunctionDefinition ef, Type previousChainType){
        val t = ef.getReturnType()
        if (t == null) {
        	if (previousChainType instanceof EffectFullFunctionType) {
        		return getReturnTypeEffectFullPrimitive(ef, previousChainType)
        	} else {
        		return getReturnTypeEffectFullPrimitive(ef, null)
        	}
	    }else{   
	    	 switch t.getType() {
	        	DataType: return (t as DataType)
	        	default: return t.type
	        }
        }
    }
	
    def static Type getReturnType(ChainElement f1, Type previousChainType){
        switch f1 {
            EffectFullFunctionDefinition : return getReturnEffectFullType((f1 as EffectFullFunctionDefinition), previousChainType)
            PureFunctionDefinition: {
            	if (previousChainType instanceof ValueType){
            		return getReturnValueType((f1 as PureFunctionDefinition), previousChainType)
            	} else {
            		throw new Exception("get return Type from pure function with an effectfull argument")
            	}
            }
            Value: return Others.getTypeFromExpression(f1.value)
            EffectFullArgument: return f1.type
        }
    }
    
    def static ValueType getReturnTypePurePrimitive(PureFunctionDefinition pf, PureFunctionType previousFunction){
    	switch pf {
			IntToString: return FPMLFactory.eINSTANCE.createStringType()
			IntPow: return FPMLFactory.eINSTANCE.createIntegerType()
			Plus: return Others.createIntIntFuntionType()
			Minus: return Others.createIntIntFuntionType()
			Times: return Others.createIntIntFuntionType()
			Mod: return Others.createIntIntFuntionType()
			ApplyF: {
				if (previousFunction != null) {
					return previousFunction.returnType
				} else 
					throw new Exception("this cannot happen during the typechecking, get return type pure primitive")
			}
        	default: throw new Exception("this cannot happen during the typechecking, get return type pure primitive")
    	}
    }
    
    def static ValueType getReturnTypeCompositionFunctionBodyPure(CompositionFunctionBodyPure cfbp) {
		if (cfbp.returnFunction == null){
			if (cfbp.functionChain.size == 1)
				return getReturnValueType(Others.getFunctionDefinitionFromPureFactor(cfbp.functionChain.last), Others.getFirstFunctionDefinitionFromCompositionBodyPure(cfbp).returnType)
			else 
				return getReturnValueType(Others.getFunctionDefinitionFromPureFactor(cfbp.functionChain.last), Others.getFunctionDefinitionFromPureFactor(cfbp.functionChain.get(cfbp.functionChain.size - 2)).returnType)
		}else if (cfbp.returnFunction.lambdaFunctionBody.functionBody instanceof CompositionFunctionBodyPure)
			return getReturnTypeCompositionFunctionBodyPure((cfbp.returnFunction.lambdaFunctionBody.functionBody as CompositionFunctionBodyPure))
		else
			throw new Exception("this cannot happen during the typechecking of a compositionFunction body pure")	
    }
    
    def static Type getReturnTypeEffectFullPrimitive(EffectFullFunctionDefinition ef, EffectFullFunctionType previousFunction){
    	switch ef {
    		PrimitivePrint: return FPMLFactory.eINSTANCE.createUnitType
    		ApplyF: {
				if (previousFunction != null) {
					return previousFunction.returnType
				} else 
					throw new Exception("this cannot happen during the typechecking, get return type Effectfull primitive")
			}
			default: throw new Exception("this cannot happen during the typechecking, get return type Effectfull primitive")
			
    	}
    }
}