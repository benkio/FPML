/*
 * generated by Xtext 2.9.2
 */
package it.unibo.validation

import it.unibo.fPML.*
import org.eclipse.xtext.validation.Check
import org.eclipse.emf.ecore.util.EcoreUtil

import org.eclipse.emf.ecore.EObject
import it.unibo.validation.utilitiesFunctions.*
import org.eclipse.emf.ecore.EReference
import org.eclipse.xtext.EcoreUtil2
import it.unibo.services.FPMLGrammarAccess.PrimitivePureFunctionElements
import it.unibo.services.FPMLGrammarAccess.PrimitiveEffectFullFunctionElements
import it.unibo.fPML.EffectFullValue

/**
 * This class contains custom validation rules. 
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
class FPMLValidator extends AbstractFPMLValidator {

    public static val TYPEMISMATCHFUNCTIONCOMPOSITION = "Type mismatch between the input of one function and the return of another in the function chain";
    public static val TYPEMISMATCHFUNCTIONCOMPOSITIONRETURN = "The return type of the function chain and the outside function doesn't match";
    public static val TYPEMISMATCHBETWEENVALUEANDDATA = "The value doesn't match the data declaration"
	public static val APPLYFUNCTIONTOWRONGVALUE = "The function is APPLYF has a wrong value type"
	public static val FUNCTIONDEFINITIONWITHUNITARGUMENT = "The function definition cannot have the first argument as Unit type. Use Values instead"
	public static val EITHERCHECKERROR = "The isRight or isLeft primitive can only be applied to SumTypes"
	
	public static val EFFECTFULLVALUEWARING = "This value has a pure expression content, maybe you want to move it to pure value section"
	public static val EFFECTFULLDATAWARING = "This data has a pure type, maybe you want to move it to pure data section"
	
   @Check
   def typeCheck(Function f){
		switch f {
			PureFunction: {
				switch f {
					PureValue: typeCheckPureValue(f)
					PureLambda: typeCheckLambda(f)
					PrimitivePureFunction: typeCheckPurePrimitive(f)
					PureFunctionDefinition: typeCheckPureFunction(f)
				}
			}
			EffectFullFunction: {
				switch f {
					PrimitiveEffectFullFunction: typeCheckEffectFullPrimitive(f)
					EffectFullLambda: typeCheckEffectFullLambda(f)
					EffectFullValue: typeCheckEffectFullValue(f)
					EffectFullFunctionDefinition: typeCheckEffectFullFunction(f)
				}
			}
		}
   }
	
   @Check
   def typeCheckMain(MainFunc m){
   		if (!Checks.mainReturnType(m))
   			error(TYPEMISMATCHFUNCTIONCOMPOSITIONRETURN, FPMLPackage.Literals.MAIN_FUNC__RETURN_TYPE)
   		if (!Checks.mainArgType(m))
   			error(TYPEMISMATCHFUNCTIONCOMPOSITION, FPMLPackage.Literals.MAIN_FUNC__FUNCTION_BODY)
   }
   
   @Check
   def typeCheckEffectFullData(EffectFullData data) {
   		if (!Checks.checkTypeContainsIOTypes(data.content))
   			warning(EFFECTFULLDATAWARING, FPMLPackage.Literals.EFFECT_FULL_DATA__CONTENT)
   }
   
   	def typeCheckEffectFullLambda(EffectFullLambda lambda) {
 		if (!Checks.effectFullLambda(lambda)){
   			error(TYPEMISMATCHFUNCTIONCOMPOSITION, FPMLPackage.Literals.EFFECT_FULL_FUNCTION_DEFINITION__FUNCTION_BODY)
   		}
   	}
	
	def typeCheckEffectFullValue(EffectFullValue value) {
		if (value.value instanceof Expression){
			val pureValue = FPMLFactory.eINSTANCE.createPureValue
			pureValue.value = value.value as Expression
			typeCheckPureValue(pureValue)
			warning(EFFECTFULLVALUEWARING, FPMLPackage.Literals.EFFECT_FULL_VALUE__VALUE)
		}
		else if (value.value instanceof EffectFullDataValue &&
   		!Checks.effectFullDataAndValue((value.value as EffectFullDataValue).value, (value.value as EffectFullDataValue).type.content)) {
   			error(TYPEMISMATCHBETWEENVALUEANDDATA, FPMLPackage.Literals.EFFECT_FULL_VALUE__VALUE)
		}
		if (!Checks.effectFullExpressionHasSideEffects(value.value))
			warning(EFFECTFULLVALUEWARING, FPMLPackage.Literals.EFFECT_FULL_VALUE__VALUE)
	}
   
   def typeCheckPureValue(PureValue v){
   	if (v.value instanceof DataValue &&
   		!Checks.DataAndValue((v.value as DataValue).value, (v.value as DataValue).type.content)) {
   		error(TYPEMISMATCHBETWEENVALUEANDDATA, FPMLPackage.Literals.PURE_VALUE__VALUE)
	}
   }
   def typeCheckLambda(PureLambda l){
   		if (!Checks.pureLambda(l)){
   			error(TYPEMISMATCHFUNCTIONCOMPOSITION, FPMLPackage.Literals.PURE_FUNCTION_DEFINITION__FUNCTION_BODY)
   		}
   }
   def typeCheckPurePrimitive(PrimitivePureFunction p){
   		switch p {
   			IsLeftPure: if (!(Others.getElement2ValueTypeFromPureAlgebraicType(p.type) instanceof PureSumTypeFactor))
   							error(EITHERCHECKERROR, FPMLPackage.Literals.IS_LEFT_PURE__TYPE)
   			IsRightPure: if (!(Others.getElement2ValueTypeFromPureAlgebraicType(p.type) instanceof PureSumTypeFactor))
   							error(EITHERCHECKERROR, FPMLPackage.Literals.IS_RIGHT_PURE__TYPE)
   			ApplyF: {
   				if (!Checks.applyF(p))
   					error(APPLYFUNCTIONTOWRONGVALUE, FPMLPackage.Literals.APPLY_F__FUNCTION_TYPE)
   			}
   		}
   }
   def typeCheckPureFunction(PureFunctionDefinition f){
   		if (f.arg.type instanceof UnitType)
   			error(FUNCTIONDEFINITIONWITHUNITARGUMENT, FPMLPackage.Literals.PURE_FUNCTION_DEFINITION__ARG)
   		if (!Checks.functionReturnType(f))
   			error(TYPEMISMATCHFUNCTIONCOMPOSITIONRETURN, FPMLPackage.Literals.PURE_FUNCTION_DEFINITION__RETURN_TYPE)
   		if (!Checks.functionArgType(f))
   			error(TYPEMISMATCHFUNCTIONCOMPOSITION, FPMLPackage.Literals.PURE_FUNCTION_DEFINITION__FUNCTION_BODY)
   }

   def typeCheckEffectFullFunction(EffectFullFunctionDefinition f){
		if (!Checks.functionReturnTypeEffectFull(f))
			error(TYPEMISMATCHFUNCTIONCOMPOSITIONRETURN, FPMLPackage.Literals.EFFECT_FULL_FUNCTION_DEFINITION__RETURN_TYPE)
		if (!Checks.functionArgTypeEffectFull(f))
			error(TYPEMISMATCHFUNCTIONCOMPOSITION, FPMLPackage.Literals.EFFECT_FULL_FUNCTION_DEFINITION__FUNCTION_BODY)
   }
   def typeCheckEffectFullPrimitive(PrimitiveEffectFullFunction p){
   		switch p {
   			IsLeftEffectFull: if (!(Others.getElement2ValueTypeFromEffectFullAlgebraicType(p.type) instanceof EffectFullSumTypeFactor))
   								error(EITHERCHECKERROR, FPMLPackage.Literals.IS_LEFT_EFFECT_FULL__TYPE)
   			IsRightEffectFull: if (!(Others.getElement2ValueTypeFromEffectFullAlgebraicType(p.type) instanceof EffectFullSumTypeFactor))
   								error(EITHERCHECKERROR, FPMLPackage.Literals.IS_RIGHT_EFFECT_FULL__TYPE)
   			ApplyFIO: {
   				if (!Checks.applyFIO(p))
   					error(APPLYFUNCTIONTOWRONGVALUE, FPMLPackage.Literals.APPLY_FIO__FUNCTION_TYPE)
   			}
   		}
   }
}