package it.unibo.generator

import it.unibo.fPML.*
import it.unibo.validation.utilitiesFunctions.GetReturnType
import it.unibo.validation.utilitiesFunctions.Others

class ValueGenerator {
	
	val typeGenerator = new TypeGenerator
	val pureFunctionGenerator = new PureFunctionGenerator
	
	def compile(Iterable<PureValue> values)	'''
	    package «FPMLGenerator.basePackageJava»Pure.Data;
	    
	    import «FPMLGenerator.basePackageJava»Pure.Data.*;
	    import fj.data.*;
	    import fj.*;
	    import it.unibo.Pure.Primitives;
	    import it.unibo.Pure.PureFunctionDefinitions;
	    
	    public class PureValue {
	    	«FOR v:values»
	    		«v.compile»
	    	«ENDFOR»
	    }'''
	
	def compile(PureValue v) '''
	
	public static «typeGenerator.compileType(v.value)» «v.name»() {
		«v.value.compile»
	}
	'''
	
	def compile(Expression e) {
		switch e {
			IntegerType: return "return "+ e.value + ';'
			UnitType: return "return IOFunctions.ioUnit;"
			StringType: return '''return "«e.value»";'''
			DataType: return '''return new «typeGenerator.compileType(e)»(«compileAdtValue((e as DataValue).value, (e as DataValue).type.content)»);'''
			PureFunctionType: return e.compile 
		}	
	}
	
	def compileAdtValue(PureAdtValue v, Type d) {
		switch v {
			IntegerType: return v.value
			StringType: return '''"«v.value»"'''
			DataType: return '''new «typeGenerator.compileType(v)»(«compileAdtValue((v as DataValue).value, (v as DataValue).type.content)»)'''
			PureSumValue: {
				if (v.sumAdtElement1 == null) return '''Either.right(«compileAdtValue(v.sumAdtElement2, Others.getElement2ValueTypeFromPureAlgebraicType(d as PureAlgebraicType))»)'''
				return '''Either.left(«compileAdtValue(v.sumAdtElement1, ((d as PureAlgebraicType).pureAdtElement1))»)'''
			}
			PureProdValue: return '''P.p(«compileAdtValue(v.prodAdtElement1,(d as PureAlgebraicType).pureAdtElement1)»,«compileAdtValue(v.prodAdtElement2, Others.getElement2ValueTypeFromPureAlgebraicType(d as PureAlgebraicType))»)'''
			PureValueRef: if ( v.value instanceof PureValue ) return '''PureValue.«(v.value as PureValue).name»()''' else return '''PureFunctionDefinitions::«(v.value as PureFunctionDefinition).name»'''
			PureFunctionType: return v.compile
		}
	}
	
	def compile(PureFunctionType pft) '''
	«IF (pft.value.functionBody instanceof CompositionFunctionBodyPure) && pft.value.arg != null»
	return new F<«typeGenerator.compile(pft.value.arg.type)»,«typeGenerator.compile(GetReturnType.pureFunctionDefinition(pft.value))»>() {
				@Override
				public «typeGenerator.compile(GetReturnType.pureFunctionDefinition(pft.value))» f(«typeGenerator.compile(pft.value.arg.type)» «pft.value.arg.name») {
					«pureFunctionGenerator.compile(pft.value.functionBody, pft.value.arg.name, true)»
				}
		};
	«ELSEIF (pft.value.functionBody instanceof EmptyFunctionBody)»
	return new F<() {
					@Override
					public Object f(Object «pft.value.arg.name») {
						throw new UnsupportedOperationException("TODO");
					}
			};
	«ELSE»
	«pureFunctionGenerator.compile(pft.value.functionBody, "", true)»
	«ENDIF»
	'''
}