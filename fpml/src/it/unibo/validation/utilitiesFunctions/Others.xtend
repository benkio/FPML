package it.unibo.validation.utilitiesFunctions

import it.unibo.fPML.*
import it.unibo.fPML.EffectFullAlgebraicType
import org.eclipse.xtext.EcoreUtil2
import org.eclipse.emf.ecore.util.EcoreUtil
import org.eclipse.emf.ecore.EObject
import it.unibo.fPML.IOEffectFullFunction
import it.unibo.fPML.EffectFullFunction
import it.unibo.fPML.EffectFullBodyContent
import it.unibo.fPML.EffectFullPrimitive

class Others {
	
	///////////////////////////////////////////////////////////////////////////////////////
	// GETs
	//////////////////////////////////////////////////////////////////////////////////////
	
	def static PureFunction getFunctionDefinitionFromPureFactor(CompositionFunctionBodyPureFactor cfbpf) {
		if (cfbpf.primitiveElement == null && cfbpf.referenceElement == null) return EcoreUtil.copy(cfbpf.expressionElement)
		else if (cfbpf.referenceElement == null) return EcoreUtil.copy(cfbpf.primitiveElement)
		else return EcoreUtil.copy(cfbpf.referenceElement)
	}
	def static getFunctionDefinitionFromEffectFullFactor(CompositionFunctionBodyEffectFullFactor cfbef) {
		if (cfbef.primitiveElement == null && cfbef.referenceElement == null) return EcoreUtil.copy(cfbef.expressionElement)
		else if (cfbef.referenceElement == null) return EcoreUtil.copy(cfbef.primitiveElement)
		else EcoreUtil.copy(cfbef.referenceElement)
	}
	def static PureFunction getFirstFunctionDefinitionFromCompositionBodyPure(CompositionFunctionBodyPure cfbp) {
		if (cfbp.primitiveElement == null && cfbp.referenceElement == null) return EcoreUtil.copy(cfbp.expressionElement)
		else if (cfbp.referenceElement == null) return EcoreUtil.copy(cfbp.primitiveElement) 
		else return EcoreUtil.copy(cfbp.referenceElement)
	}
	def static EffectFullBodyContent getFirstFunctionDefinitionFromCompositionBodyEffectFull(CompositionFunctionBodyEffect cfbe) {
		if (cfbe.primitiveElement == null && cfbe.referenceElement == null) return EcoreUtil.copy(cfbe.expressionElement)
		else if (cfbe.referenceElement == null) return EcoreUtil.copy(cfbe.primitiveElement)
		else return EcoreUtil.copy(cfbe.referenceElement)
	}
	
	def static EffectFullBodyContent getValueFromApplyFIOFactor(ApplyFIOFactor afiof) {
		if (afiof.valuePrimitive != null) return EcoreUtil.copy(afiof.valuePrimitive)
		else if (afiof.valueReference != null) return EcoreUtil.copy(afiof.valueReference)
		else return EcoreUtil.copy(afiof.valueExpression)
	}
	
	def static getValueFromApplyFFactor(ApplyFFactor afiof) {
		if (afiof.valueExpression != null) return EcoreUtil.copy(afiof.valueExpression)
		else return EcoreUtil.copy(afiof.valueReference)

	}
	
	def static ValueType getElement2ValueTypeFromPureAlgebraicType(PureAlgebraicType pat){
		switch pat.pureAdtElement2 {
			PureSumTypeFactor: EcoreUtil.copy((pat.pureAdtElement2 as PureSumTypeFactor).adtElement)
			PureProdTypeFactor: EcoreUtil.copy((pat.pureAdtElement2 as PureProdTypeFactor).adtElement )
		}
	}
	
	def static Type getElement2ValueTypeFromEffectFullAlgebraicType(EffectFullAlgebraicType eat) {
		switch eat.effectFullAdtElement2 {
			EffectFullSumTypeFactor: EcoreUtil.copy((eat.effectFullAdtElement2 as EffectFullSumTypeFactor).adtElement)
			EffectFullProdTypeFactor: EcoreUtil.copy((eat.effectFullAdtElement2 as EffectFullProdTypeFactor).adtElement )
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
	
	def static PureFunction getFunctionFromPureIfBody(PureIfBody pib){
		if (pib.functionExpression == null) EcoreUtil.copy(pib.functionReference)
		else EcoreUtil.copy(pib.functionExpression)
	}
	
	def static EffectFullBodyContent getFunctionFromEffectFullIfBody(EffectFullIfBody efib){
		if (efib.functionExpression == null) EcoreUtil.copy(efib.functionReference)
		else EcoreUtil.copy(efib.functionExpression)	
	}
	
	def static PureFunction getInnerElementFromPureExpressionAndPureFunctionReference(PureExpressionAndPureFunctionReference r) {
		if (r.prodAdtElementExpression == null) EcoreUtil.copy(r.prodAdtElementFunction)
		else EcoreUtil.copy(r.prodAdtElementExpression)
	}
	
	def static PureExpressionAndPureFunctionReference getFirstElementFromPureAlgebraicValue(PureSumValue psv) {
		if (psv.sumAdtElement1 == null) EcoreUtil.copy(psv.sumAdtElement2)
		else EcoreUtil.copy(psv.sumAdtElement1)
	}
	
	def static PureExpressionAndPureFunctionReference getFirstElementFromPureAlgebraicValue(PureProdValue ppv) {
		if (ppv.prodAdtElement1 == null) EcoreUtil.copy(ppv.prodAdtElement2)
		else EcoreUtil.copy(ppv.prodAdtElement1)
	}
	
	def static EffectFullBodyContent getInnerElementFromEffectFullExpressionAndEffectFullFunctionReference(EffectFullExpressionAndEffectFullFunctionReference r) {
		if (r.prodAdtElementExpression == null) EcoreUtil.copy(r.prodAdtElementFunction)
		else EcoreUtil.copy(r.prodAdtElementExpression)
	}
	
	
	/////////////////////////////////////////////////////////////////////////////////////////
	// CREATE
	/////////////////////////////////////////////////////////////////////////////////////////
	
	def static PureFunctionType createPureFuntionType(ValueType argT, ValueType returnT){
		val func = FPMLFactory.eINSTANCE.createPureFunctionType()
      	func.argType = EcoreUtil.copy(argT)
      	func.returnType = EcoreUtil.copy(returnT)
      	return func
	}
	
	def static EffectFullFunctionType createEffectFullFuntionType(Type argT, IOType returnT){
		val func = FPMLFactory.eINSTANCE.createEffectFullFunctionType()
      	func.argType = EcoreUtil.copy(argT)
      	func.returnType = EcoreUtil.copy(returnT)
      	return func
	}
	
	def static Argument createUnitPureArgument(){
		val arg = FPMLFactory.eINSTANCE.createPureArgument
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
			factor.adtElement = EcoreUtil.copy(vt2)
			pat.pureAdtElement2 =  factor
			pat.pureAdtElement1 = EcoreUtil.copy(vt1)
		}else { //is prod type
			val factor = FPMLFactory.eINSTANCE.createPureProdTypeFactor
			factor.adtElement = EcoreUtil.copy(vt2)
			pat.pureAdtElement2 =  factor
			pat.pureAdtElement1 = EcoreUtil.copy(vt1)
		}
		 pat
	}
	
	def static EffectFullAlgebraicType createEffectFullAlgebraicType(Type t1, Type t2, boolean isSumType) {
		val EffectFullAlgebraicType efat = FPMLFactory.eINSTANCE.createEffectFullAlgebraicType;
		if (isSumType) {
			val factor = FPMLFactory.eINSTANCE.createEffectFullSumTypeFactor
			factor.adtElement = EcoreUtil.copy(t2)
			efat.effectFullAdtElement2 =  factor
			efat.effectFullAdtElement1 = EcoreUtil.copy(t1)
		}else { //is prod type
			val factor = FPMLFactory.eINSTANCE.createEffectFullProdTypeFactor
			factor.adtElement = EcoreUtil.copy(t2)
			efat.effectFullAdtElement2 =  factor
			efat.effectFullAdtElement1 = EcoreUtil.copy(t1)
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
	
	def static EffectFullFunctionType lambdaWrap(Type lambdaArgumentType, Type lambdaReturnType){
		val returnT = FPMLFactory.eINSTANCE.createEffectFullFunctionType
		returnT.argType = FPMLFactory.eINSTANCE.createUnitType
		
		if (lambdaArgumentType instanceof UnitType) {
			if (lambdaReturnType instanceof IOType)
				returnT.returnType = EcoreUtil.copy((lambdaReturnType as IOType))
			else
				returnT.returnType = IOWrap(lambdaReturnType)
			return returnT
		} else {
			val innerT = FPMLFactory.eINSTANCE.createEffectFullFunctionType
			innerT.argType = EcoreUtil.copy(lambdaArgumentType)
			if (lambdaReturnType instanceof IOType)
				innerT.returnType = EcoreUtil.copy((lambdaReturnType as IOType))
			else
				innerT.returnType = IOWrap(lambdaReturnType)
			returnT.returnType = IOWrap(innerT)
			return returnT	
		}
	}
	
	def static PureFunctionType lambdaWrap(ValueType lambdaArgumentType, ValueType lambdaReturnType){
		val returnT = FPMLFactory.eINSTANCE.createPureFunctionType
		returnT.argType = FPMLFactory.eINSTANCE.createUnitType
		
		if (lambdaArgumentType instanceof UnitType){
			returnT.returnType = EcoreUtil.copy(lambdaReturnType)
			return returnT
		}else {
			val innerT = FPMLFactory.eINSTANCE.createPureFunctionType
			innerT.argType = EcoreUtil.copy(lambdaArgumentType)
			innerT.returnType = EcoreUtil.copy(lambdaReturnType)
			returnT.returnType = innerT
			return returnT	
		}
	}
	
	def static ValueType createTypeOfPureFunction(PureFunction pf){
		switch pf {
			PureValue: EcoreUtil.copy(GetReturnType.expression(pf.value))
			PrimitivePureFunction: createPureFuntionType(GetArgType.pureFunction(pf),GetReturnType.pureFunction(pf))
			PureArgument: EcoreUtil.copy(pf.type)
			PureLambda: if (pf.arg == null) GetReturnType.pureFunction(pf)
						else createPureFuntionType(GetArgType.pureFunction(pf),GetReturnType.pureFunction(pf))
			PureFunctionDefinition: createPureFuntionType(GetArgType.pureFunction(pf),GetReturnType.pureFunction(pf))
			Expression: EcoreUtil.copy(GetReturnType.expression(pf))
		}
	}
	
	def static Type createTypeOfEffectFullFunction(EffectFullFunction function) {
		switch function { 
			EffectFullValue: EcoreUtil.copy(GetReturnType.effectFullExpression(function.value))
			EffectFullArgument: EcoreUtil.copy(function.type)
			PrimitiveEffectFullFunction: createEffectFullFuntionType(GetArgType.effectFullFunction(function),GetReturnType.effectFullFunction(function) as IOType)
			EffectFullLambda: if (function.arg == null) GetReturnType.effectFullFunction(function)
							  else createEffectFullFuntionType(GetArgType.effectFullFunction(function),IOWrap(GetReturnType.effectFullFunction(function)))
			EffectFullFunctionDefinition: createEffectFullFuntionType(GetArgType.effectFullFunction(function),GetReturnType.effectFullFunction(function) as IOType)
		}
	}
	
	def static Type createTypeOfEffectFullBodyContent(EffectFullBodyContent content) {
		switch content {
			EffectFullFunction: createTypeOfEffectFullFunction(content)
			EffectFullPrimitive: createTypeOfEffectFullPrimitive(content)
			EffectFullFunctionType: EcoreUtil.copy(GetReturnType.effectFullExpression(content as EffectFullExpression))
			EffectFullExpression: GetReturnType.effectFullExpression(content as EffectFullExpression)
		}
	}
	
	def static createTypeOfEffectFullPrimitive(EffectFullPrimitive primitive) {
		switch primitive {
			PrimitiveEffectFullFunction: {
				val returnType = EcoreUtil.copy(GetReturnType.effectFullPrimitive(primitive))
				if (returnType instanceof IOType)
					Others.createEffectFullFuntionType(GetArgType.effectFullPrimitive(primitive), GetReturnType.effectFullPrimitive(primitive) as IOType)
				else
					Others.createEffectFullFuntionType(GetArgType.effectFullPrimitive(primitive), Others.IOWrap(GetReturnType.effectFullPrimitive(primitive)))
			}
			PrimitiveEffectFullValue: GetReturnType.primitiveEffectFullValue(primitive)
		}
	}
	
	def static PureExpressionAndPureFunctionReference createPureExpressionAndPureFunctionReference(Expression e) {
		val result = FPMLFactory.eINSTANCE.createPureExpressionAndPureFunctionReference
		result.prodAdtElementExpression = EcoreUtil.copy(e)
		return result
	}
	
	def static PureExpressionAndPureFunctionReference createPureExpressionAndPureFunctionReference(PureFunction f) {
		val result = FPMLFactory.eINSTANCE.createPureExpressionAndPureFunctionReference
		result.prodAdtElementFunction = EcoreUtil.copy(f)
		return result
	}
	
	def static EffectFullExpressionAndEffectFullFunctionReference createEffectFullExpressionAndEffectFullFunctionReference(EffectFullExpression e) {
		val result = FPMLFactory.eINSTANCE.createEffectFullExpressionAndEffectFullFunctionReference
		result.prodAdtElementExpression = EcoreUtil.copy(e)
		return result
	}
	
	def static EffectFullExpressionAndEffectFullFunctionReference createEffectFullExpressionAndEffectFullFunctionReference(EffectFullFunction f) {
		val result = FPMLFactory.eINSTANCE.createEffectFullExpressionAndEffectFullFunctionReference
		result.prodAdtElementFunction = EcoreUtil.copy(f)
		return result
	}
}