package it.unibo.generator

import it.unibo.fPML.Argument
import it.unibo.fPML.ValueType
import it.unibo.fPML.Data
import it.unibo.generator.FPMLGenerator

class DataGenerator {
	
	val typeGenerator = new TypeGenerator
	
	def compile(Data d) '''
	    package «FPMLGenerator.basePackageJava»Pure.Data;
	    
	    import «FPMLGenerator.basePackageJava»Pure.Data.*;
	    import fj.data.*;
	    import fj.P2;
	    import fj.Unit;
	    
	    public class «d.name» {
	    	«IF d.content instanceof ValueType»
	    	public final «typeGenerator.dataCompile(d.content as ValueType)»
	    	«ELSEIF d.content instanceof Argument»
	    	public final «typeGenerator.compile(d.content)»;
	    		    	
	    	public «d.name»(«typeGenerator.compile(d.content)»){
	    		this.«(d.content as Argument).name» = «(d.content as Argument).name»;
	    	}
	    	«ELSE»
	    	public final «typeGenerator.compile(d.content)» value;
	    	
	    	public «d.name»(«typeGenerator.compile(d.content)» value){
	    		this.value = value;
	    	}
	        «ENDIF»
	    }
	'''	
}