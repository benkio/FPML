package it.unibo.generator

import it.unibo.fPML.Data
import it.unibo.generator.FPMLGenerator
import it.unibo.fPML.AdtType

class DataGenerator {
	
	val typeGenerator = new TypeGenerator
	
	def compile(Data d) {
	return '''
	    package «FPMLGenerator.basePackageJava»Pure.Data;
	    
	    import fj.data.*;
	    import fj.P2;
	    import fj.Unit;
	    
	    public class «d.name» {
	    	public final «typeGenerator.adtTypeCompile((d.content as AdtType))» value;
	    	
	    	public «d.name»(«typeGenerator.adtTypeCompile((d.content as AdtType))» value){
	    		this.value = value;
	    	}
	    }'''
	}
}