package it.unibo.generator

import it.unibo.fPML.EffectFullBlock
import it.unibo.fPML.EffectFullFunction
import it.unibo.fPML.EmptyFunctionBody
import it.unibo.fPML.CompositionFunctionBodyEffect
import it.unibo.fPML.ChainElement
import org.eclipse.xtext.xbase.lib.Functions.Function2
import it.unibo.fPML.PureFunction
import it.unibo.fPML.Data

class EffectFullFunctionGenerator {
	
	val typeGenerator = new TypeGenerator
	
	def compile(EffectFullBlock efb) '''
	    package «FPMLGenerator.basePackageJava»Effectfull;
	    		
	    import «FPMLGenerator.basePackageJava»Pure.Data.*;
	    import fj.data.*;
	    
	    public static class EffectFullFunction {
	    	«FOR f:efb.features»
	    		«f.compile»
	    	«ENDFOR»
	    }
	'''
	def compile(EffectFullFunction pf) '''

		public static «typeGenerator.compile(pf.returnType)» «pf.name» («typeGenerator.compile(pf.arg)»){
			«IF pf.functionBody instanceof EmptyFunctionBody»
			throw new NotImpletementedException("TODO")
			«ELSEIF pf.functionBody instanceof CompositionFunctionBodyEffect»
			IOW.append(IOFunctions.unit(«pf.arg.name»))«(pf.functionBody as CompositionFunctionBodyEffect).compile»
			«ENDIF»
		}'''

	
	def compile(CompositionFunctionBodyEffect cfbe) '''
		«val Function2<String, ChainElement, String>  f = [String acc, ChainElement x | acc + x.compile + "\n\t"]»
		«cfbe.functionChain.fold("\n\t", f) »'''
	
	def compile(ChainElement e) {
		switch e {
			PureFunction: return '''.map(«(e as PureFunction).name»)'''
			Data: return '''.append(IOFunctions.unit(«(e as Data).name».value))'''
			EffectFullFunction: return '''.bind(«(e as EffectFullFunction).name»)''' 
		}
	}	
}