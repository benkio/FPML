package it.unibo.generator

import it.unibo.fPML.*
import it.unibo.validation.utilitiesFunctions.GetReturnType
import it.unibo.validation.utilitiesFunctions.Others

class EffectFullValueGenerator {
	
	val typeGenerator = new TypeGenerator
	val commonEffectFullFunctions = new ValueEffectFullFunctionCommonGenerator
	
	
	def compile(Iterable<EffectFullValue> values)	'''
	    package «FPMLGenerator.basePackageJava»Effectfull.Data;
	    
	    import «FPMLGenerator.basePackageJava»Effectfull.Data.*;
	    import it.unibo.Pure.PureFunctionDefinitions;
	    import it.unibo.Pure.Data.PureValue;
	    import fj.data.*;
	    import fj.*;
	    import it.unibo.Effectfull.PrimitivesEffectFull;
	    import it.unibo.Effectfull.EffectFullFunctionDefinitions;

	    
	    public class EffectFullValue {
	    	«FOR v:values»
	    		«v.compile»
	    	«ENDFOR»
	    }'''
	
	def compile(EffectFullValue v) '''
	
	public static «typeGenerator.compileType(v.value)» «v.name»() {
		return «commonEffectFullFunctions.compile(v.value)»;
	}
	'''
	
	
}