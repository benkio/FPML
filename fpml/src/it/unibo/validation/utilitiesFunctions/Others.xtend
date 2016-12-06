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
	
	def static Type getElement2ValueTypeFromEffectFullAlgebraicType(EffectFullAlgebraicType eat) {
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
	
	def static PureAlgebraicType createPureAlgebraicType(ValueType vt1, ValueType vt2, boolean isSumType) {
		val PureAlgebraicType pat = FPMLFactory.eINSTANCE.createPureAlgebraicType;
		if (isSumType) {
			val factor = FPMLFactory.eINSTANCE.createPureSumTypeFactor
			factor.adtElement = vt2
			pat.pureAdtElement2 =  factor
			pat.pureAdtElement1 = vt1
		}else { //is prod type
			val factor = FPMLFactory.eINSTANCE.createPureProdTypeFactor
			factor.adtElement = vt2
			pat.pureAdtElement2 =  factor
			pat.pureAdtElement1 = vt1
		}
		 pat
	}
	
	def static EffectFullAlgebraicType createEffectFullAlgebraicType(Type t1, Type t2, boolean isSumType) {
		val EffectFullAlgebraicType efat = FPMLFactory.eINSTANCE.createEffectFullAlgebraicType;
		if (isSumType) {
			val factor = FPMLFactory.eINSTANCE.createEffectFullSumTypeFactor
			factor.adtElement = t2
			efat.effectFullAdtElement2 =  factor
			efat.effectFullAdtElement1 = t1
		}else { //is prod type
			val factor = FPMLFactory.eINSTANCE.createEffectFullProdTypeFactor
			factor.adtElement = t2
			efat.effectFullAdtElement2 =  factor
			efat.effectFullAdtElement1 = t1
		}
		 efat
	}
}