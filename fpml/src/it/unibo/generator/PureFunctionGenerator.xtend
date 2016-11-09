package it.unibo.generator

import it.unibo.fPML.PureFunctionBlock
import it.unibo.fPML.EmptyFunctionBody
import it.unibo.fPML.CompositionFunctionBodyPure
import it.unibo.fPML.PureFunction
import it.unibo.fPML.Value

class PureFunctionGenerator {
	
	val typeGenerator = new TypeGenerator
	
	def compile(PureFunctionBlock pfb) '''
		package «FPMLGenerator.basePackageJava»Pure;
		
		import «FPMLGenerator.basePackageJava»Pure.Data.*;
		
		public static class PureFunction {
			«FOR f:pfb.features»
				«f.compile»
			«ENDFOR»	
		}
	'''

	def compile(PureFunction pf) '''

		public static «typeGenerator.compile(pf.returnType)» «pf.name» («typeGenerator.compile(pf.arg)»){
			«IF pf.functionBody instanceof EmptyFunctionBody»
				throw new NotImpletementedException("TODO")
			«ELSEIF pf.functionBody instanceof CompositionFunctionBodyPure»
				«(pf.functionBody as CompositionFunctionBodyPure).compile»
			«ENDIF»
		}'''

	def compile(CompositionFunctionBodyPure cfbp) {
		var result = ""
		if (cfbp.initialElement instanceof PureFunction) 
			result = compileCall((cfbp.initialElement as PureFunction), "")
		else 
			result = (cfbp.initialElement as Value).name
		for (f : cfbp.functionChain){
			result = compileCall(f, result)
		}
		return result
	} 
	
	def compileCall(PureFunction pf, String args) {
		return pf.name + "(" + args + ")"
	}
}