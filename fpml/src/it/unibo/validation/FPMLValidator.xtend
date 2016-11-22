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

/**
 * This class contains custom validation rules. 
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
class FPMLValidator extends AbstractFPMLValidator {

    public static val TYPEMISMATCHFUNCTIONCOMPOSITION = "Type mismatch between the input of one function and the return of another in the function chain";
    public static val TYPEMISMATCHFUNCTIONCOMPOSITIONRETURN = "The return type of the function chain and the outside function doesn't match";
    public static val TYPEMISMATCHFUNCTIONCOMPOSITIONARGS = "The argument type of the function is not the same as the first argument of the function chain";
    public static val EFFECTFULLARGUMENTUNITTYPEID = "The Unit Type don't require and ID";
    public static val TYPEMISMATCHBETWEENVALUEANDDATA = "The value doesn't match the data declaration"
	public static val APPLYFUNCTIONTOWRONGVALUE = "The function is APPLYF has a wrong value type"
	
   @Check
   def typeCheck(Function f){
		switch f {
			PureFunction: {
				switch f {
					Value: typeCheck(f as Value)
					PureLambda: typeCheck(f as PureLambda)
					PrimitivePureFunction: typeCheck(f as PrimitivePureFunction)
					PureFunctionDefinition: typeCheck(f as PureFunctionDefinition)
				}
			}
			EffectFullFunction: {
				switch f {
					EffectFullFunctionDefinition: typeCheck(f as EffectFullFunctionDefinition)
					PrimitiveEffectFullFunction: typeCheck(f as PrimitiveEffectFullFunction)
				}
			}
		}
   }
   
   def typeCheck(Value v){
   	if (v.value instanceof DataValue &&
   		!Checks.DataAndValue((v.value as DataValue).value, (v.value as DataValue).type.content)) {
   		error(TYPEMISMATCHBETWEENVALUEANDDATA, FPMLPackage.Literals.VALUE__VALUE)
	}
   }
   def typeCheck(PureLambda l){
   		if (!Checks.pureLambda(l)){
   			error(TYPEMISMATCHFUNCTIONCOMPOSITION, FPMLPackage.Literals.PURE_FUNCTION_DEFINITION__FUNCTION_BODY)
   		}
   }
   def typeCheck(PrimitivePureFunction p){}
   def typeCheck(PureFunctionDefinition f){
   		if (!Checks.functionReturnType(f))
   			error(TYPEMISMATCHFUNCTIONCOMPOSITIONRETURN, FPMLPackage.Literals.PURE_FUNCTION_DEFINITION__RETURN_TYPE)
   }

   def typeCheck(EffectFullFunctionDefinition f){}
   def typeCheck(PrimitiveEffectFullFunction p){}
}