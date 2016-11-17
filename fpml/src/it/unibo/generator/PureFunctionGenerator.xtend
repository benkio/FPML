package it.unibo.generator

import it.unibo.fPML.PureFunctionBlock
import it.unibo.fPML.EmptyFunctionBody
import it.unibo.fPML.CompositionFunctionBodyPure
import it.unibo.fPML.PureFunctionDefinition
import it.unibo.fPML.Value
import it.unibo.fPML.IntToString
import it.unibo.fPML.IntPow
import it.unibo.validation.UtilitiesFunctions
import it.unibo.fPML.FPMLFactory

class PureFunctionGenerator {
	
	val typeGenerator = new TypeGenerator
	
	def compile(PureFunctionBlock pfb) '''
		package «FPMLGenerator.basePackageJava»Pure;
		
		import «FPMLGenerator.basePackageJava»Pure.Data.*;
		
		public class PureFunctionDefinitions {
			«FOR f:pfb.features»
				«f.compile»
			«ENDFOR»	
		}
	'''

	def compile(PureFunctionDefinition pf) '''

		public static «typeGenerator.compile(pf.returnType)» «pf.name» («typeGenerator.compile(pf.arg)»){
			«IF pf.functionBody instanceof EmptyFunctionBody»
				throw new UnsupportedOperationException("TODO");
			«ELSEIF pf.functionBody instanceof CompositionFunctionBodyPure»
				return «compile((pf.functionBody as CompositionFunctionBodyPure), pf.arg.name)»;
			«ENDIF»
		}'''

	def compile(CompositionFunctionBodyPure cfbp, String argName) {
		var result = ""
		val initialElement = UtilitiesFunctions.getFirstFunctionDefinitionFromCompositionBodyPure(cfbp)
		switch initialElement {
			PureFunctionDefinition: result = compileCall(initialElement, argName)
			Value: result = "Value." + (initialElement as Value).name + "()"
		}
		for (f : cfbp.functionChain){
			result = compileCall( UtilitiesFunctions.getFunctionDefinitionFromPureFactor(f), result)
		}
		return result
	} 
	
	def String compileCall(PureFunctionDefinition pf, String args) {
		if (pf.name == null ) return compilePrimitiveCall(pf, args)
		return pf.name + "(" + args + ")"
	}
	
	def compilePrimitiveCall(PureFunctionDefinition purePrimitive, String argName){
		switch purePrimitive {
			IntToString: {
				val f = FPMLFactory.eINSTANCE.createPureFunctionDefinition()
				f.name = "Integer.toString"
				return compileCall(f, argName)
			}
      		IntPow: {
				val f = FPMLFactory.eINSTANCE.createPureFunctionDefinition()
				f.name = "(int) Math.pow"
				return compileCall(f, argName + ", 2")
			}
		}
	}
}