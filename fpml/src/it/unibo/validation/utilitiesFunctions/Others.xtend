package it.unibo.validation.utilitiesFunctions

import it.unibo.fPML.*
import it.unibo.fPML.EffectFullAlgebraicType
import org.eclipse.xtext.EcoreUtil2

class Others {
	def static PureFunction getFunctionDefinitionFromPureFactor(CompositionFunctionBodyPureFactor cfbpf) {
		if (cfbpf.primitiveElement == null) return cfbpf.referenceElement
		else return cfbpf.primitiveElement
	}
	def static getFunctionDefinitionFromEffectFullFactor(CompositionFunctionBodyEffectFullFactor cfbef) {
		if (cfbef.primitiveElement == null) return cfbef.referenceElement
		else return cfbef.primitiveElement
	}
	def static PureFunction getFirstFunctionDefinitionFromCompositionBodyPure(CompositionFunctionBodyPure cfbp) {
		if (cfbp.primitiveElement == null) return cfbp.referenceElement
		else return cfbp.primitiveElement
	}
	def static EffectFullReference getFirstFunctionDefinitionFromCompositionBodyEffectFull(CompositionFunctionBodyEffect cfbe) {
		if (cfbe.primitiveElement == null) return cfbe.referenceElement
		else return cfbe.primitiveElement
	}
	
	def static EffectFullReference getValueFromApplyFIOFactor(ApplyFIOFactor afiof) {
		if (afiof.valuePrimitive != null) return afiof.valuePrimitive
		else if (afiof.valueReference != null) return afiof.valueReference
		else return afiof.valueLambda 
	}
	
	def static getValueFromApplyFFactor(ApplyFFactor afiof) {
		if (afiof.valueLambda != null) return afiof.valueLambda
		else return afiof.valueReference

	}
	
	def static ValueType getElement2ValueTypeFromPureAlgebraicType(PureAlgebraicType pat){
		switch pat.pureAdtElement2 {
			PureSumTypeFactor: (pat.pureAdtElement2 as PureSumTypeFactor).adtElement
			PureProdTypeFactor: (pat.pureAdtElement2 as PureProdTypeFactor).adtElement 
		}
	}
	
	def static IOType getElement2ValueTypeFromEffectFullAlgebraicType(EffectFullAlgebraicType eat) {
		switch eat.effectFullAdtElement2 {
			EffectFullSumTypeFactor: (eat.effectFullAdtElement2 as EffectFullSumTypeFactor).adtElement
			EffectFullProdTypeFactor: (eat.effectFullAdtElement2 as EffectFullProdTypeFactor).adtElement 
		}
	}
	
	def static PureFunctionType createIntIntFuntionType(){
		val func = FPMLFactory.eINSTANCE.createPureFunctionType()
      	func.argType = FPMLFactory.eINSTANCE.createIntegerType()
      	func.returnType = FPMLFactory.eINSTANCE.createIntegerType()
      	return func
	}
	
	def static IOType IOWrap(Type t){
		val returnT = FPMLFactory.eINSTANCE.createIOType
		returnT.type = EcoreUtil2.copy(t)
		return returnT	
	}
	
	def static EffectFullArgument createUnitEffectFullArgument(){
		val arg = FPMLFactory.eINSTANCE.createEffectFullArgument
		arg.type = FPMLFactory.eINSTANCE.createUnitType
		return arg
	}
	
	def static EffectFullArgument createVoidEffectFullArgument(){
		val arg = FPMLFactory.eINSTANCE.createEffectFullArgument
		arg.type = FPMLFactory.eINSTANCE.createVoidType
		return arg
	}
}