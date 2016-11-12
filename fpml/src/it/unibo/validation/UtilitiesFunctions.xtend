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
		switch t {
			DataType: return t.type
			IntToString: return FPMLFactory.eINSTANCE.createStringType() 
			default: return t
		}
	}
	
	def static getReturnType(EffectFullFunctionDefinition ef){
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

	/////////////////////////////////////////////////////
	// getArgTypes
	////////////////////////////////////////////////////

	def static getArgType(PureFunctionDefinition pf){
		val t = pf.getArg().getType()
		switch t {
			DataType: return t.getType()
			IntToString: return FPMLFactory.eINSTANCE.createIntegerType	
			default: return t
		}
	}
	
 	def static getArgType(EffectFullFunctionDefinition ef){
 		val t = ef.getArg().getType()
 		switch t {
 			DataType: return t.getType()
 			PrimitivePrint: return FPMLFactory.eINSTANCE.createStringType()
 			default: return t
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