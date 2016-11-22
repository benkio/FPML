package it.unibo.generator

import it.unibo.fPML.*
import it.unibo.validation.utilitiesFunctions.GetReturnType

class ValueGenerator {
	
	val typeGenerator = new TypeGenerator
	val pureFunctionGenerator = new PureFunctionGenerator
	
	def compile(Iterable<Value> values)	'''
	    package «FPMLGenerator.basePackageJava»Pure.Data;
	    
	    import «FPMLGenerator.basePackageJava»Pure.Data.*;
	    import fj.data.*;
	    import fj.P;
	    import fj.P2;
	    import fj.Unit;
	    import it.unibo.Pure.Primitives;
	    import it.unibo.Pure.PureFunctionDefinitions;
	    import fj.F;
	    
	    public class Value {
	    	«FOR v:values»
	    		«v.compile»
	    	«ENDFOR»
	    }'''
	
	def compile(Value v) '''
	
	public static «typeGenerator.compileType(v.value)» «v.name»() {
		return «v.value.compile»;
	}
	'''
	
	def compile(Expression e) {
		switch e {
			IntegerType: return e.value
			UnitType: return "IOFunctions.ioUnit"
			StringType: return '''"«e.value»"'''
			DataType: return '''new «typeGenerator.compileType(e)»(«compileAdtValue((e as DataValue).value, (e as DataValue).type.content)»)'''
			PureFunctionType: return e.compile 
		}	
	}
	
	def compileAdtValue(AdtValue v, AdtType d) {
		switch v {
			IntegerType: return v.value
			StringType: return '''"«v.value»"'''
			DataType: return '''new «typeGenerator.compileType(v)»(«compileAdtValue((v as DataValue).value, (v as DataValue).type.content)»)'''
			SumValue: {
				if (v.sumAdtElement1 == null) return '''Either.right(«compileAdtValue(v.sumAdtElement2, (d.adtElement2 as SumType).adtElement)»)'''
				return '''Either.left(«compileAdtValue(v.sumAdtElement1, ((d as AdtType).adtElement1))»)'''
			}
			ProdValue: return '''P.p(«compileAdtValue(v.prodAdtElement1,d.adtElement1)»,«compileAdtValue(v.prodAdtElement2, (d.adtElement2 as ProdType).adtElement)»)'''			
			ValueRef: if ( v.value instanceof Value ) return '''Value.«(v.value as Value).name»()''' else return '''PureFunctionDefinitions::«(v.value as PureFunctionDefinition).name»'''
			PureFunctionType: return v.compile
		}
	}
	
	def compile(PureFunctionType pft) '''
	«IF (pft.value.functionBody instanceof CompositionFunctionBodyPure)»
	new F<«typeGenerator.compile(pft.value.arg.type)»,«typeGenerator.compile(GetReturnType.getReturnTypeCompositionFunctionBodyPureFunctionDefinition(pft.value))»>() {
				@Override
				public «typeGenerator.compile(GetReturnType.getReturnTypeCompositionFunctionBodyPureFunctionDefinition(pft.value))» f(«typeGenerator.compile(pft.value.arg.type)» «pft.value.arg.name») {
					«pureFunctionGenerator.compile(pft.value.functionBody, pft.value.arg.name, true)»
				}
		}
	«ELSEIF (pft.value.functionBody instanceof EmptyFunctionBody)»
	new F<() {
					@Override
					public Object f(Object «pft.value.arg.name») {
						throw new UnsupportedOperationException("TODO");
					}
			}
	«ENDIF»
	'''
}