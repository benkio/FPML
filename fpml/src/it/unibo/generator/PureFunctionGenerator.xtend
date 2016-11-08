package it.unibo.generator

import it.unibo.fPML.PureFunctionBlock
import it.unibo.fPML.EmptyFunctionBody
import it.unibo.fPML.Data
import it.unibo.fPML.CompositionFunctionBodyPure
import org.eclipse.xtext.xbase.lib.Functions.Function2
import it.unibo.fPML.InitialPureChainElement
import it.unibo.fPML.PureFunction
import it.unibo.fPML.DataType
import it.unibo.fPML.IntegerType
import it.unibo.fPML.StringType
import it.unibo.fPML.ValueType
import it.unibo.fPML.Argument

class PureFunctionGenerator {
	
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

		public static «pf.returnType.compile» «pf.name» («pf.arg.compile»){
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

	def compile(ValueType vt) '''
		«switch vt{
			DataType: return vt.type.name
			IntegerType: return vt.type
			StringType: return vt.type
		}»'''

	def compile(Argument arg) '''«arg.type.compile» «arg.name»'''
	
}