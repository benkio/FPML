package it.unibo.generator

import it.unibo.fPML.Value
import it.unibo.fPML.Expression
import it.unibo.fPML.IntegerType
import it.unibo.fPML.UnitType
import it.unibo.fPML.StringType
import it.unibo.fPML.DataType

class ValueGenerator {
	
	val typeGenerator = new TypeGenerator
	
	def compile(Iterable<Value> values)	'''
	    package «FPMLGenerator.basePackageJava»Pure.Data;
	    
	    import «FPMLGenerator.basePackageJava»Pure.Data.*;
	    import fj.data.*;
	    import fj.P2;
	    import fj.Unit;
	    
	    public class Value {
	    	«FOR v:values»
	    		«v.compile»
	    	«ENDFOR»
	    }
	    '''
	
	def compile(Value v) '''
	
	public static «typeGenerator.compileType(v.value)» «v.name»() {
		return «v.value.compile»;
	}
	'''
	
	def compile(Expression e) {
		switch e {
			IntegerType: return e.value
			UnitType: return "IOFunctions.unit"
			StringType: return '''"«e.value»"'''
			DataType: return '''new «typeGenerator.compileType(e)»()'''
		}	
	}
}