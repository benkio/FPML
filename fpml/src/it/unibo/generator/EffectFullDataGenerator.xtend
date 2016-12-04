package it.unibo.generator

import it.unibo.fPML.EffectFullData
import it.unibo.fPML.Type

class EffectFullDataGenerator {
	
	val typeGenerator = new TypeGenerator
	
	def compile(EffectFullData d) '''
	    package «FPMLGenerator.basePackageJava»Effectfull.Data;
	    
	    import fj.data.*;
	    import fj.*;
	    
	    public class «d.name» {
	    	public final «typeGenerator.compile(d.content as Type)» value;
	    	
	    	public «d.name»(«typeGenerator.compile(d.content as Type)» value){
	    		this.value = value;
	    	}
	    }'''
	
}