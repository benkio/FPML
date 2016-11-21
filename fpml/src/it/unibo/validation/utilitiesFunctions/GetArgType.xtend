package it.unibo.validation.utilitiesFunctions

import it.unibo.fPML.*

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
				if (previousFunction != null) {
					return previousFunction.argType
				} else 
					throw new Exception("this cannot happen during the typechecking, get argument type pure primitive")
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
    	switch container {
    		PureFunctionDefinition: return container.arg.type	
    		PureLambda: return container.arg.type
    	}
    }
    
    def static Type getArgTypeCompositionFunctionBodyEffectFullContainer(CompositionFunctionBodyEffect cfbe) {
    	val container = cfbe.eContainer
    	switch container {
    		EffectFullFunctionDefinition: return container.arg.type	
    		EffectFullLambda: return container.arg.type
    	}
    }
}