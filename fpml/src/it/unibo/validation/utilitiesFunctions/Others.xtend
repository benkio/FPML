package it.unibo.validation.utilitiesFunctions

import it.unibo.fPML.*

class Others {
	def static PureFunctionDefinition getFunctionDefinitionFromPureFactor(CompositionFunctionBodyPureFactor cfbpf) {
		if (cfbpf.primitiveElement == null) return cfbpf.referenceElement
		else return cfbpf.primitiveElement
	}
	def static getFunctionDefinitionFromEffectFullFactor(CompositionFunctionBodyEffectFullFactor cfbef) {
		if (cfbef.primitiveElement == null) return cfbef.referenceElement
		else return cfbef.primitiveElement
	}
	def static PureFunctionDefinition getFirstFunctionDefinitionFromCompositionBodyPure(CompositionFunctionBodyPure cfbp) {
		if (cfbp.primitiveElement == null) return cfbp.referenceElement
		else return cfbp.primitiveElement
	}
	def static ChainElement getFirstFunctionDefinitionFromCompositionBodyEffectFull(CompositionFunctionBodyEffect cfbe) {
		if (cfbe.primitiveElement == null) return cfbe.referenceElement
		else return cfbe.primitiveElement
	}
	
	def static PureFunctionType createIntIntFuntionType(){
		val func = FPMLFactory.eINSTANCE.createPureFunctionType()
      	func.argType = FPMLFactory.eINSTANCE.createIntegerType()
      	func.returnType = FPMLFactory.eINSTANCE.createIntegerType()
      	return func
	}
	
	def static Type getTypeFromExpression(Expression e){
    	switch e {
    		IntegerType: return (e as IntegerType)
    		StringType: return (e as StringType)
    		UnitType: return (e as UnitType)
    		DataType: return (e as DataType)
        	PureFunctionType: return (e as PureFunctionType) 
    	}
    }
}