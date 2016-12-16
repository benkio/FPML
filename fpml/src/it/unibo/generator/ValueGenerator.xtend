package it.unibo.generator

import it.unibo.fPML.*
import it.unibo.validation.utilitiesFunctions.GetReturnType
import it.unibo.validation.utilitiesFunctions.Others

class ValueGenerator {
	
	val typeGenerator = new TypeGenerator
	val commonFunctions = new ValuePureFunctionCommonGenerator
	
	def compile(Iterable<PureValue> values)	'''
	    package «FPMLGenerator.basePackageJava»Pure.Data;
	    
	    import «FPMLGenerator.basePackageJava»Pure.Data.*;
	    import fj.data.*;
	    import fj.*;
	    import it.unibo.Pure.Primitives;
	    import it.unibo.Pure.PureFunctionDefinitions;
	    
	    public class PureValue{
	    	«FOR v:values»
	    		«v.compile»
	    	«ENDFOR»
	    }'''
	
	def compile(PureValue v) '''
	
	public static «typeGenerator.compileType(v.value)» «v.name»() {
		return «commonFunctions.compile(v.value, false)»;
	}
	'''
	
	
	

}