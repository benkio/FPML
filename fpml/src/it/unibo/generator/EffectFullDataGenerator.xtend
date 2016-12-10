package it.unibo.generator

import it.unibo.fPML.EffectFullData
import it.unibo.fPML.Type

class EffectFullDataGenerator {
	
	val typeGenerator = new TypeGenerator
	
	def compile(EffectFullData d) '''
	    package «FPMLGenerator.basePackageJava»Effectfull.Data;
	    
	    import fj.data.*;
	    import fj.*;
	    import it.unibo.Pure.Data.*;
	    
	    public class «d.name» implements IEffectFullData<«typeGenerator.compile(d.content as Type)»> {
	    	private final «typeGenerator.compile(d.content as Type)» value;
	    	
	    	public «d.name»(«typeGenerator.compile(d.content as Type)» value){
	    		this.value = value;
	    	}
	    	
	    	public «typeGenerator.compile(d.content as Type)» getValue() {
	    		return value;
	    	}
	    }'''
	
}