package it.unibo.generator

import it.unibo.fPML.EffectFullData
import it.unibo.fPML.EffectFullAdtType

class EffectFullDataGenerator {
	
	val typeGenerator = new TypeGenerator
	
	def compile(EffectFullData d) '''
	    package «FPMLGenerator.basePackageJava»Effectfull.Data;
	    
	    import fj.data.*;
	    import fj.P2;
	    import fj.F;
	    import fj.Unit;
	    
	    public class «d.name» {
	    	public final «typeGenerator.effectFullAdtTypeCompile((d.content as EffectFullAdtType))» value;
	    	
	    	public «d.name»(«typeGenerator.effectFullAdtTypeCompile((d.content as EffectFullAdtType))» value){
	    		this.value = value;
	    	}
	    }'''
	
}