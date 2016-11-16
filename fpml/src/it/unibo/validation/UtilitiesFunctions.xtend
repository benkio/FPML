package it.unibo.validation


import it.unibo.fPML.*;

/**
 * Created by benkio on 11/3/16.
 */
class UtilitiesFunctions {
	
	/////////////////////////////////////////////////////
	// getReturnTypes
	////////////////////////////////////////////////////
	
	def static getReturnType(PureFunctionDefinition pf){
		val t = pf.getReturnType()
		if (t == null) {
			return getReturnTypePurePrimitive(pf)
		}else{
			switch t {
				DataType: return t.type 
				default: return t
			}
		}
	}
	
	def static getReturnType(EffectFullFunctionDefinition ef){
        val t = ef.getReturnType()
        if (t == null) {
        	return getReturnTypeEffectFullPrimitive(ef)
	    }else{   
	    	 switch t.getType() {
	        	DataType: return (t as DataType).getType()
	        	default: return t.type
	        }
        }
    }
	
    def static getReturnType(ChainElement f1){
        switch f1 {
            EffectFullFunctionDefinition : return getReturnType(f1)
            PureFunctionDefinition: return getReturnType(f1)
            Value: return getTypeFromExpression(f1.value)
        }
    }

    def static getReturnType(InitialPureChainElement f1){
        switch f1 {
            PureFunctionDefinition: return getReturnType(f1)
            Value: return getTypeFromExpression(f1.value)
        }
    }
    
    def static getReturnTypePurePrimitive(PureFunctionDefinition pf){
    	switch pf {
    		IntToString: return FPMLFactory.eINSTANCE.createStringType()
    	}
    }
    
    def static getReturnTypeEffectFullPrimitive(EffectFullFunctionDefinition ef){
    	switch ef {
    		PrimitivePrint: return FPMLFactory.eINSTANCE.createUnitType
    	}
    }

	/////////////////////////////////////////////////////
	// getArgTypes
	////////////////////////////////////////////////////

	def static getArgType(PureFunctionDefinition pf){
		val t = pf.getArg()
		if (t == null) {
			return getArgTypePurePrimitive(pf)	
		} else {
			switch t.getType() {
				DataType: return (t.getType() as DataType).type	
				default: return t.type
			}
		}
	}
	
 	def static getArgType(EffectFullFunctionDefinition ef){
 		val t = ef.getArg()
 		if (t == null){
 			return getArgTypeEffectFullPrimitive(ef)
 		} else {
	 		switch t.getType() {
	 			DataType: return (t.getType() as DataType).type
	 			default: return t.type
	 		}
 		}
 	}

    def static getArgType(ChainElement f1){
        switch f1 {
            EffectFullFunctionDefinition: return getArgType(f1)
            PureFunctionDefinition: return getArgType(f1)
            Value: return getTypeFromExpression(f1.value)
        }
    }

    def static getArgType(InitialPureChainElement f1){
        switch f1 {
            PureFunctionDefinition: return getArgType(f1)
            Value: return getTypeFromExpression(f1.value)
        }
    }

	def static getArgTypePurePrimitive(PureFunctionDefinition pf){
    	switch pf {
    		IntToString: return FPMLFactory.eINSTANCE.createIntegerType()
    	}
    }
    
    def static getArgTypeEffectFullPrimitive(EffectFullFunctionDefinition ef){
    	switch ef {
    		PrimitivePrint: return FPMLFactory.eINSTANCE.createStringType()
    	}
    }

	//////////////////////////////////////////////////////
	// getTypeFrom
	/////////////////////////////////////////////////////

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

	//////////////////////////////////////////////////////
	// Checks
	/////////////////////////////////////////////////////

	def static isFirstFunctionBodyArgAProductTypeAndMatchTheType(Function f, Type t){
		if (f instanceof EffectFullFunctionDefinition){
			return ((f as EffectFullFunctionDefinition).arg.type != null &&
			((f as EffectFullFunctionDefinition).arg.type instanceof DataType) &&
			((f as EffectFullFunctionDefinition).arg.type as DataType).type.content.adtElement2 != null &&
			(((f as EffectFullFunctionDefinition).arg.type as DataType).type.content.adtElement2 instanceof ProdType) &&
			(((f as EffectFullFunctionDefinition).arg.type as DataType).type.content.adtElement1.eClass == t.eClass))
		}else 
			return ((f as PureFunctionDefinition).arg.type != null &&
			((f as PureFunctionDefinition).arg.type instanceof DataType) &&
			((f as PureFunctionDefinition).arg.type as DataType).type.content.adtElement2 != null &&
			(((f as PureFunctionDefinition).arg.type as DataType).type.content.adtElement2 instanceof ProdType) &&
			(((f as PureFunctionDefinition).arg.type as DataType).type.content.adtElement1.eClass == t.eClass))
	}
	
	/////////////////////////////////////////////////////
	// Other Utilities Functions
	/////////////////////////////////////////////////////
	
		
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

	def static getFunctionDefinitionFromPureFactor(CompositionFunctionBodyPureFactor cfbpf) {
		if (cfbpf.primitiveElement == null) return cfbpf.referenceElement
		else return cfbpf.primitiveElement
	}
	def static getFunctionDefinitionFromEffectFullFactor(CompositionFunctionBodyEffectFullFactor cfbef) {
		if (cfbef.primitiveElement == null) return cfbef.referenceElement
		else return cfbef.primitiveElement
	}
	def static getFirstFunctionDefinitionFromCompositionBodyPure(CompositionFunctionBodyPure cfbp) {
		if (cfbp.primitiveElement == null) return cfbp.referenceElement
		else return cfbp.primitiveElement
	}
	def static getFirstFunctionDefinitionFromCompositionBodyEffectFull(CompositionFunctionBodyEffect cfbe) {
		if (cfbe.primitiveElement == null) return cfbe.referenceElement
		else return cfbe.primitiveElement
	}
}