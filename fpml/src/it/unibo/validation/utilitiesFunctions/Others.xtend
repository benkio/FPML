package it.unibo.validation.utilitiesFunctions

import it.unibo.fPML.*
import it.unibo.fPML.EffectFullAlgebraicType
import org.eclipse.xtext.EcoreUtil2
import org.eclipse.emf.ecore.util.EcoreUtil
import org.eclipse.emf.ecore.EObject
import it.unibo.fPML.IOEffectFullFunction
import it.unibo.fPML.EffectFullFunction

class Others {
	
	///////////////////////////////////////////////////////////////////////////////////////
	// GETs
	//////////////////////////////////////////////////////////////////////////////////////
	
	def static PureFunction getFunctionDefinitionFromPureFactor(CompositionFunctionBodyPureFactor cfbpf) {
		if (cfbpf.primitiveElement == null && cfbpf.referenceElement == null) return cfbpf.expressionElement
		else if (cfbpf.referenceElement == null) return cfbpf.primitiveElement
		else return cfbpf.referenceElement
	}
	def static getFunctionDefinitionFromEffectFullFactor(CompositionFunctionBodyEffectFullFactor cfbef) {
		if (cfbef.primitiveElement == null && cfbef.referenceElement == null) return cfbef.expressionElement
		else if (cfbef.referenceElement == null) return cfbef.primitiveElement
		else cfbef.referenceElement
	}
	def static PureFunction getFirstFunctionDefinitionFromCompositionBodyPure(CompositionFunctionBodyPure cfbp) {
		if (cfbp.primitiveElement == null && cfbp.referenceElement == null) return cfbp.expressionElement
		else if (cfbp.referenceElement == null) return cfbp.primitiveElement 
		else return cfbp.referenceElement
	}
	def static EffectFullBodyContent getFirstFunctionDefinitionFromCompositionBodyEffectFull(CompositionFunctionBodyEffect cfbe) {
		if (cfbe.primitiveElement == null && cfbe.referenceElement == null) return cfbe.expressionElement
		else if (cfbe.referenceElement == null) return cfbe.primitiveElement 
		else return cfbe.referenceElement
	}
	
	def static EffectFullBodyContent getValueFromApplyFIOFactor(ApplyFIOFactor afiof) {
		if (afiof.valuePrimitive != null) return afiof.valuePrimitive
		else if (afiof.valueReference != null) return afiof.valueReference
		else return afiof.valueExpression 
	}
	
	def static getValueFromApplyFFactor(ApplyFFactor afiof) {
		if (afiof.valueExpression != null) return afiof.valueExpression
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
	
	def static Type getArgumentType(Argument a){
		switch a {
			EffectFullArgument: EcoreUtil.copy(a.type)
			PureArgument: EcoreUtil.copy(a.type)
		}
	} 
	
	def static PureFunction getPureFunctionFromIOPureFunction(IOPureFunction iopf) {
		if (iopf.pureFunction == null) return EcoreUtil.copy(iopf.purePrimitive)
		else return EcoreUtil.copy(iopf.pureFunction)
	}
	
	
	def static getArgumentName(Argument argument) {
		switch argument {
			PureArgument: argument.name
			EffectFullArgument: argument.name
		}
	}
	
	def static getEffectFullFunctionFromIOEffectFullFunction(IOEffectFullFunction function) {
		if (function.effectFullFunction == null) EcoreUtil.copy(function.effectFullPrimitive)
		else EcoreUtil.copy(function.effectFullFunction)
	}
	
	def static getPureFunctionFromLiftPureFunction(LiftPureFunction lpf) {
		if (lpf.functionPrimitive == null) return EcoreUtil.copy(lpf.functionRef)
		else EcoreUtil.copy(lpf.functionPrimitive)
	}
	
	def static getEffectFullFunctionFromLiftEffectFullFunction(LiftEffectFullFunction eff) {
		if (eff.functionPrimitive == null) return EcoreUtil.copy(eff.functionRef)
		else EcoreUtil.copy(eff.functionPrimitive)
	}
	
	/////////////////////////////////////////////////////////////////////////////////////////
	// CREATE
	/////////////////////////////////////////////////////////////////////////////////////////
	
	def static PureFunctionType createPureFuntionType(ValueType argT, ValueType returnT){
		val func = FPMLFactory.eINSTANCE.createPureFunctionType()
      	func.argType = argT
      	func.returnType = returnT
      	return func
	}
	
	def static EffectFullFunctionType createEffectFullFuntionType(Type argT, IOType returnT){
		val func = FPMLFactory.eINSTANCE.createEffectFullFunctionType()
      	func.argType = argT
      	func.returnType = returnT
      	return func
	}
	
	def static EffectFullArgument createUnitEffectFullArgument(){
		val arg = FPMLFactory.eINSTANCE.createEffectFullArgument
		val unitType = FPMLFactory.eINSTANCE.createIOType
		unitType.type = FPMLFactory.eINSTANCE.createUnitType
		arg.type = unitType
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
	
	def static DataType createDataType(PureData pd) {
		val dataType = FPMLFactory.eINSTANCE.createDataType
		dataType.type = EcoreUtil.copy(pd)
		return dataType
	}
	
	def static EffectFullDataType createDataType(EffectFullData pd) {
		val dataType = FPMLFactory.eINSTANCE.createEffectFullDataType
		dataType.type = EcoreUtil.copy(pd)
		return dataType
	}
	
	def static IOType IOWrap(Type t){
		val returnT = FPMLFactory.eINSTANCE.createIOType
		returnT.type = EcoreUtil2.copy(t)
		return returnT	
	}
	
	def static ValueType createTypeOfPureFunction(PureFunction pf){
		switch pf {
			PureValue: GetReturnType.expression(pf.value)
			PureFunctionDefinition: it.unibo.validation.utilitiesFunctions.Others.createPureFuntionType(GetArgType.pureFunction(pf),GetReturnType.pureFunction(pf))
			PrimitivePureFunction: it.unibo.validation.utilitiesFunctions.Others.createPureFuntionType(GetArgType.pureFunction(pf),GetReturnType.pureFunction(pf))
			PureArgument: pf.type
			Expression: GetReturnType.expression(pf)
		}
	}
	
	def static Type createTypeOfEffectFullFunction(EffectFullFunction function) {
		switch function { 
			EffectFullValue: GetReturnType.effectFullExpression(function.value)
			EffectFullArgument: function.type
			PrimitiveEffectFullFunction: it.unibo.validation.utilitiesFunctions.Others.createEffectFullFuntionType(GetArgType.effectFullFunction(function),GetReturnType.effectFullFunction(function) as IOType)
			EffectFullFunctionDefinition: it.unibo.validation.utilitiesFunctions.Others.createEffectFullFuntionType(GetArgType.effectFullFunction(function),GetReturnType.effectFullFunction(function) as IOType)
		}
	}
	
}