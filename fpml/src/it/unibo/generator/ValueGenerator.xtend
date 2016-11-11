package it.unibo.generator

import it.unibo.fPML.Value
import it.unibo.fPML.Expression
import it.unibo.fPML.IntegerType
import it.unibo.fPML.UnitType
import it.unibo.fPML.StringType
import it.unibo.fPML.DataType
import it.unibo.fPML.DataValue
import it.unibo.fPML.AdtValue
import it.unibo.fPML.SumValue
import it.unibo.fPML.ProdValue
import it.unibo.fPML.Data
import it.unibo.fPML.AdtType
import it.unibo.fPML.SumType
import it.unibo.fPML.ProdType

class ValueGenerator {
	
	val typeGenerator = new TypeGenerator
	val dataGenerator = new DataGenerator
	
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
			DataType: return '''new «typeGenerator.compileType(e)»(«compileAdtValue((e as DataValue).value, (e as DataValue).type.content)»)'''
		}	
	}
	
	def compileAdtValue(AdtValue v, AdtType d) {
		switch v {
			IntegerType: return v.value
			StringType: return '''"«v.value»"'''
			DataType: return '''new «typeGenerator.compileType(v)»(«compileAdtValue((v as DataValue).value, (v as DataValue).type.content)»)'''
			SumValue: {
				if (v.sumAdtElement1 == null) return '''«typeGenerator.adtTypeCompile((d as AdtType))».right(«compileAdtValue(v.sumAdtElement2, ((d as AdtType).adtElement2 as SumType).adtElement)»)'''
				return return '''«typeGenerator.adtTypeCompile((d as AdtType))».left(«compileAdtValue(v.sumAdtElement1, ((d as AdtType).adtElement1 as SumType).adtElement)»)'''
			}
			ProdValue: return '''p(«compileAdtValue(v.prodAdtElement1,d.adtElement1)»,«compileAdtValue(v.prodAdtElement2, (d.adtElement2 as ProdType).adtElement)»)'''			
		}
	}
}