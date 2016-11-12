package it.unibo.generator

import it.unibo.fPML.PureFunctionBlock
import it.unibo.fPML.EmptyFunctionBody
import it.unibo.fPML.CompositionFunctionBodyPure
import it.unibo.fPML.PureFunctionDefinition
import it.unibo.fPML.Value
import it.unibo.fPML.IntToString
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
			IntToString: {
				val f = FPMLFactory.eINSTANCE.createPureFunctionDefinition()
				f.name = "Integer.toString"
				result = compileCall(f, argName)
			} 
			PureFunctionDefinition: result = compileCall((initialElement as PureFunctionDefinition), argName)
			Value: result = (initialElement as Value).name
		}
		for (f : cfbp.functionChain){
			result = compileCall( UtilitiesFunctions.getFunctionDefinitionFromPureFactor(f), result)
		}
		return result
	} 
	
	def compileCall(PureFunctionDefinition pf, String args) {
		return pf.name + "(" + args + ")"
	}
}