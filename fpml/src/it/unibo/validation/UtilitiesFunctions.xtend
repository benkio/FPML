package it.unibo.validation


import it.unibo.fPML.*;
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.util.EcoreUtil

/**
 * Created by benkio on 11/3/16.
 */
class UtilitiesFunctions {
	
	/////////////////////////////////////////////////////
	// getReturnTypes
	////////////////////////////////////////////////////
	
	def static ValueType getReturnType(PureFunctionDefinition pf){
		val t = pf.getReturnType()
		if (t == null)
			return UtilitiesFunctions.getReturnTypePurePrimitiveOrLambda(pf)
		return t
	}
	
	def static Type getReturnType(EffectFullFunctionDefinition ef){
        val t = ef.getReturnType()
        if (t == null) {
        	return getReturnTypeEffectFullPrimitive(ef)
	    }else{   
	    	 switch t.getType() {
	        	DataType: return (t as DataType)
	        	default: return t.type
	        }
        }
    }
	
    def static Type getReturnType(ChainElement f1){
        switch f1 {
            EffectFullFunctionDefinition : return getReturnType(f1)
            PureFunctionDefinition: return getReturnType(f1)
            Value: return getTypeFromExpression(f1.value)
            EffectFullArgument: return f1.type
        }
    }
    
    def static ValueType getReturnTypePurePrimitiveOrLambda(PureFunctionDefinition pf){
    	switch pf {
			IntToString: return FPMLFactory.eINSTANCE.createStringType()
			IntPow: return FPMLFactory.eINSTANCE.createIntegerType()
			Plus: return createIntIntFuntionType()
			Minus: return createIntIntFuntionType()
			Times: return createIntIntFuntionType()
			Mod: return createIntIntFuntionType()
        	default: throw new UnsupportedOperationException("TODO")
    	}
    }
    
    def static ValueType getReturnTypeCompositionFunctionBodyPure(CompositionFunctionBodyPure cfbp) {
		if (cfbp.returnFunction == null)
			return getReturnType(getFunctionDefinitionFromPureFactor(cfbp.functionChain.last))			
		else if (cfbp.returnFunction.lambdaFunctionBody.functionBody instanceof CompositionFunctionBodyPure)
			return getReturnTypeCompositionFunctionBodyPure((cfbp.returnFunction.lambdaFunctionBody.functionBody as CompositionFunctionBodyPure))
		else
			throw new Exception("this cannot happen during the typechecking of a compositionFunction body pure")	
    }
    
    def static Type getReturnTypeEffectFullPrimitive(EffectFullFunctionDefinition ef){
    	switch ef {
    		PrimitivePrint: return FPMLFactory.eINSTANCE.createUnitType
    	}
    }

	/////////////////////////////////////////////////////
	// getArgTypes
	////////////////////////////////////////////////////

	def static ValueType getArgType(PureFunctionDefinition pf){
		val t = pf.getArg()
		if (t == null) {
			return getArgTypePurePrimitive(pf)	
		} else {
			switch t.getType() {
				DataType: return (t.getType() as DataType)
				default: return t.type
			}
		}
	}
	
 	def static Type getArgType(EffectFullFunctionDefinition ef){
 		val t = ef.getArg()
 		if (t == null){
 			return getArgTypeEffectFullPrimitive(ef)
 		} else {
	 		switch t.getType() {
	 			DataType: return (t.getType() as DataType)
	 			default: return t.type
	 		}
 		}
 	}

    def static Type getArgType(ChainElement f1){
        switch f1 {
            EffectFullFunctionDefinition: return getArgType(f1)
            PureFunctionDefinition: return getArgType(f1)
            Value: return getTypeFromExpression(f1.value)
            EffectFullArgument: return f1.type
        }
    }

	def static ValueType getArgTypePurePrimitive(PureFunctionDefinition pf){
    	switch pf {
    		IntToString: return FPMLFactory.eINSTANCE.createIntegerType()
        	IntPow: return FPMLFactory.eINSTANCE.createIntegerType()
          Plus: return FPMLFactory.eINSTANCE.createIntegerType()
          Minus: return FPMLFactory.eINSTANCE.createIntegerType()
          Times: return FPMLFactory.eINSTANCE.createIntegerType()
          Mod: return FPMLFactory.eINSTANCE.createIntegerType()
    	}
    }
    
    def static Type getArgTypeEffectFullPrimitive(EffectFullFunctionDefinition ef){
    	switch ef {
    		PrimitivePrint: return FPMLFactory.eINSTANCE.createStringType()
    	}
    }

	//////////////////////////////////////////////////////
	// getTypeFrom
	/////////////////////////////////////////////////////
    
    def static Type getTypeFromExpression(Expression e){
    	switch e {
    		IntegerType: return (e as IntegerType)
    		StringType: return (e as StringType)
    		UnitType: return (e as UnitType)
    		DataType: return (e as DataType)
        	PureFunctionType: return (e as PureFunctionType) 
    	}
    }

	//////////////////////////////////////////////////////
	// Checks
	/////////////////////////////////////////////////////

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
					 checkValueTypeEquals(getReturnTypeCompositionFunctionBodyPure((value as PureFunctionType).value.functionBody as CompositionFunctionBodyPure), type.returnType)
				else if ( value instanceof ValueRef && (value as ValueRef).value instanceof PureFunctionDefinition) {
					return  checkValueTypeEquals(((value as ValueRef).value as PureFunctionDefinition).argType, type.argType) &&
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
			val valueType = getTypeFromExpression(v.value)
			switch adtt {
				IntegerType: return valueType instanceof IntegerType
				StringType: return valueType instanceof StringType
				DataType: return valueType instanceof DataType && adtt.type.name.equals((valueType as DataType).type.name) 
				PureFunctionType: valueType instanceof PureFunctionType && checkValueTypeEquals(adtt.argType, (valueType as PureFunctionType).argType) && checkValueTypeEquals(adtt.returnType, (valueType as PureFunctionType).returnType)
				default: false
			}
		} else {
			return adtt instanceof PureFunctionType && checkValueTypeEquals((v as PureFunctionDefinition).argType, (adtt as PureFunctionType).argType) && checkValueTypeEquals((v as PureFunctionDefinition).returnType, (adtt as PureFunctionType).returnType)  
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
											checkTypeEquals(t.returnType.type, (t1 as EffectFullFunctionType).returnType.type)
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
	
	/////////////////////////////////////////////////////
	// Other Utilities Functions
	/////////////////////////////////////////////////////
	

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
	
	def static PureFunctionType createIntIntFuntionType(){
		val func = FPMLFactory.eINSTANCE.createPureFunctionType()
   	   	val returnFunc = FPMLFactory.eINSTANCE.createPureFunctionType()
    	returnFunc.argType = FPMLFactory.eINSTANCE.createIntegerType()
    	returnFunc.returnType = FPMLFactory.eINSTANCE.createIntegerType()
      	func.argType = FPMLFactory.eINSTANCE.createIntegerType()
      	func.returnType = returnFunc
      	return func
	}
}