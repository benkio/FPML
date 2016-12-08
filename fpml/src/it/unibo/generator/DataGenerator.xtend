package it.unibo.generator

import it.unibo.generator.FPMLGenerator
import it.unibo.fPML.PureData

class DataGenerator {
	
	val typeGenerator = new TypeGenerator
	
	def compile(PureData d) {
	return '''
	    package «FPMLGenerator.basePackageJava»Pure.Data;
	    
	    import fj.data.*;
	    import fj.*;
	    
	    public class «d.name» implements IPureData<«typeGenerator.compile(d.content)»> {
	    	private final «typeGenerator.compile(d.content)» value;
	    	
	    	public «d.name»(«typeGenerator.compile(d.content)» value){
	    		this.value = value;
	    	}
	    	
	    	public «typeGenerator.compile(d.content)» getValue() {
	    		return value;
	    	}
	    }'''
	}
}