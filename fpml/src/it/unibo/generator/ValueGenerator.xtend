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
		return «v.value.compile»;
	}
	'''
	
	def compile(Expression e) {
		switch e {
			IntegerType: e.value
			UnitType: "Unit.unit()"
			StringType: '''"«e.value»"'''
			DataType: '''new «typeGenerator.compileType(e)»(«compileAdtValue((e as DataValue).value, (e as DataValue).type.content)»)'''
			PureFunctionType: return e.compile 
			PureSumValue:  {
				if (e.sumAdtElement1 == null) return '''Either.right(«e.sumAdtElement2.compile»)'''
				return '''Either.left(«e.sumAdtElement1.compile»)'''
			}
			PureValueRef: '''PureValue.«e.value.name»()'''
			PureProdValue: '''P.p(«e.prodAdtElement1.compile», «e.prodAdtElement2.compile»)'''
		}	
	}
	
	def compileAdtValue(Expression v, Type d) {
		switch v {
			IntegerType: return v.value
			StringType: return '''"«v.value»"'''
			UnitType: return '''Unit.unit()'''
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
		new F<«typeGenerator.compile(pft.value.arg.type)»,«typeGenerator.compile(GetReturnType.pureFunctionDefinition(pft.value))»>() {
				@Override
				public «typeGenerator.compile(GetReturnType.pureFunctionDefinition(pft.value))» f(«typeGenerator.compile(pft.value.arg.type)» «pft.value.arg.name») {
					 return «pureFunctionGenerator.compile(pft.value.functionBody, pft.value.arg.name, true)»;
				}
		}
	«ELSEIF (pft.value.functionBody instanceof EmptyFunctionBody)»
		new F<() {
					@Override
					public Object f(Object «pft.value.arg.name») {
						throw new UnsupportedOperationException("TODO");
					}
			}
	«ELSE»
	«pureFunctionGenerator.compile(pft.value.functionBody, "", true)»
	«ENDIF»
	'''
}