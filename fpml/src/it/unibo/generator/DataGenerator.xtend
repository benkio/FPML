package it.unibo.generator

import it.unibo.generator.FPMLGenerator
import it.unibo.fPML.PureData
import it.unibo.fPML.PureAdtType

class DataGenerator {
	
	val typeGenerator = new TypeGenerator
	
	def compile(PureData d) {
	return '''
	    package «FPMLGenerator.basePackageJava»Pure.Data;
	    
	    import fj.data.*;
	    import fj.P2;
	    import fj.F;
	    import fj.Unit;
	    
	    public class «d.name» {
	    	public final «typeGenerator.pureAdtTypeCompile((d.content as PureAdtType))» value;
	    	
	    	public «d.name»(«typeGenerator.pureAdtTypeCompile((d.content as PureAdtType))» value){
	    		this.value = value;
	    	}
	    }'''
	}
}