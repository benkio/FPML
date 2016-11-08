package it.unibo.generator


import it.unibo.fPML.Adt
import it.unibo.fPML.Argument
import it.unibo.fPML.SumType
import it.unibo.fPML.ProdType
import it.unibo.fPML.ValueType
import it.unibo.fPML.IntegerType
import it.unibo.fPML.UnitType
import it.unibo.fPML.StringType
import it.unibo.fPML.Data
import it.unibo.generator.PureFunctionGenerator
import it.unibo.generator.FPMLGenerator

class DataGenerator {
	
	val pureFunctionGenerator = new PureFunctionGenerator
	
	def compile(Data d) '''
	    package «FPMLGenerator.basePackageJava»Pure.Data;
	    
	    import «FPMLGenerator.basePackageJava»Pure.Data.*;
	    import fj.data.*;
	    import fj.P2;
	    import fj.Unit;
	    
	    public class «d.name» {
	    	«IF d.content instanceof ValueType»
	    	public final «(d.content as ValueType).compile»
	    	«ELSEIF d.content instanceof Argument»
	    	public final «d.content.compile»;
	    		    	
	    	public «d.name»(«d.content.compile»){
	    		this.«(d.content as Argument).name» = «(d.content as Argument).name»;
	    	}
	    	«ELSE»
	    	public final «d.content.compile» value;
	    	
	    	public «d.name»(«d.content.compile» value){
	    		this.value = value;
	    	}
	        «ENDIF»
	    }
	'''
	
	def compile(Adt adt) {
		switch adt {
			Argument: return pureFunctionGenerator.compile(adt as Argument)
	  		SumType:  return (adt as SumType).compile
    		ProdType: return (adt as ProdType).compile
		}
	}
	
	def compile(ValueType vt) {
		switch vt {
			IntegerType: return '''int value = «(vt as IntegerType).value»;'''
			StringType: return '''String value = "«(vt as StringType).value»";'''
			UnitType: return '''Unit value;'''
		}
	}
	
	def compile(SumType st) '''Either<«st.sumAdtElements.map[t | pureFunctionGenerator.compile(t)].reduce[p1, p2| p1 + ", " + p2]»>''' 
	def compile(ProdType pt) '''P2<«pt.prodAdtElements.map[t | pureFunctionGenerator.compile(t)].reduce[p1, p2| p1 + ", " + p2]»>'''
	
}