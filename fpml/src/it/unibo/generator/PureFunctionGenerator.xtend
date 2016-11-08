package it.unibo.generator

import it.unibo.fPML.PureFunctionBlock
import it.unibo.fPML.EmptyFunctionBody
import it.unibo.fPML.Data
import it.unibo.fPML.CompositionFunctionBodyPure
import org.eclipse.xtext.xbase.lib.Functions.Function2
import it.unibo.fPML.InitialPureChainElement
import it.unibo.fPML.PureFunction

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

		public static «typeGenerator.functionCompile(pf.returnType)» «pf.name» («typeGenerator.compile(pf.arg)»){
			«IF pf.functionBody instanceof EmptyFunctionBody»
			throw new NotImpletementedException("TODO")
			«ELSEIF pf.functionBody instanceof CompositionFunctionBodyPure»
			«(pf.functionBody as CompositionFunctionBodyPure).compile»
			«ENDIF»
		}'''

	def compile(CompositionFunctionBodyPure cfbp) '''
		«val Function2<String, InitialPureChainElement, String>  f = [String acc, InitialPureChainElement x | x.compile + acc + ')']»
		«cfbp.functionChain.fold("", f) »'''
	
	def compile(InitialPureChainElement e) '''
		«IF e instanceof Data»
			«(e as Data).name».getValue()
		«ELSE»
			«(e as PureFunction).name»«ENDIF»('''
}