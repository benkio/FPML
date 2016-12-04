package it.unibo.generator

import it.unibo.fPML.*
import it.unibo.validation.utilitiesFunctions.GetReturnType
import it.unibo.validation.utilitiesFunctions.Others

class EffectFullValueGenerator {
	
	val typeGenerator = new TypeGenerator
	val EffectFullFunctionGenerator = new EffectFullFunctionGenerator
	val valueGenerator = new ValueGenerator
	
	def compile(Iterable<EffectFullValue> values)	'''
	    package «FPMLGenerator.basePackageJava»Effectfull.Data;
	    
	    import «FPMLGenerator.basePackageJava»Effectfull.Data.*;
	    import it.unibo.Pure.PureFunctionDefinitions;
	    import it.unibo.Pure.Data.PureValue;
	    import fj.data.*;
	    import fj.*;
	    import it.unibo.Effectfull.PrimitivesEffectFull;
	    import it.unibo.Effectfull.EffectFullFunctionDefinitions;

	    
	    public class EffectFullValue {
	    	«FOR v:values»
	    		«v.compile»
	    	«ENDFOR»
	    }'''
	
	def compile(EffectFullValue v) '''
	
	public static «typeGenerator.compileType(v.value)» «v.name»() {
		return «v.value.compile»;
	}
	'''
	
	def compile(EffectFullExpression e) {
		switch e {
			Expression: return "IOFunctions.unit(" + valueGenerator.compile(e) + ")"
			UnitType: return "Unit.unit()"
			EffectFullFunctionType: return e.compile 
			EffectFullDataValue: '''new «e.type.name»(«compileAdtValue(e.value,e.type.content)»)'''
			RecursiveEffectFullExpression: return "IOFunctions.unit(" + e.exp.compile + ")"
		}	
	}
	
	def compileAdtValue(EffectFullAdtValue v, EffectFullType d) {
		switch v {
			PureAdtValue: '''IOFunctions.unit(«valueGenerator.compileAdtValue(v, (d as IOType).type)»)'''
			EffectFullSumValue: {
				if (v.sumAdtElement1 == null) return '''Either.right(«compileAdtValue(v.sumAdtElement2, Others.getElement2ValueTypeFromEffectFullAlgebraicType(d as EffectFullAlgebraicType))»)'''
				return '''Either.left(«compileAdtValue(v.sumAdtElement1, ((d as EffectFullAlgebraicType).effectFullAdtElement1))»)'''
			}
			EffectFullProdValue: return '''P.p(«compileAdtValue(v.prodAdtElement1,(d as EffectFullAlgebraicType).effectFullAdtElement1)»,«compileAdtValue(v.prodAdtElement2, Others.getElement2ValueTypeFromEffectFullAlgebraicType(d as EffectFullAlgebraicType))»)'''
			EffectFullValueRef: if ( v.value instanceof EffectFullValue ) return '''EffectFullValue.«(v.value as EffectFullValue).name»()''' else return '''EffectFullFunctionDefinitions::«(v.value as EffectFullFunctionDefinition).name»'''
			EffectFullFunctionType: {
				if (d instanceof EffectFullFunctionType)
					return v.compile
				else if (d instanceof IOType)
					return '''IOFunctions.unit(«v.compile»)'''
			}
			UnitType: return '''IOFunctions.ioUnit()'''
			EffectFullDataValue: return compile(v as EffectFullExpression)
			default: {
				switch v.innerValue {
					PureAdtValue: '''IOFunctions.unit(«valueGenerator.compileAdtValue(v.innerValue as PureAdtValue, (d as IOType).type)»)'''
					EffectFullAdtValue: '''IOFunctions.unit(«compileAdtValue(v.innerValue as EffectFullAdtValue, (d as IOType).type as EffectFullType)»)'''		
				} 
			}
		}
	}
	
	def compile(EffectFullFunctionType pft) '''
	«IF (pft.value.functionBody instanceof EmptyFunctionBody)»
		new F<Object>() {
						@Override
						public Object f(Object «pft.value.arg.name») {
							throw new UnsupportedOperationException("TODO");
						}
				}
	«ELSEIF (pft.value.functionBody instanceof CompositionFunctionBodyEffect && pft.value.arg != null)»
	new F<«typeGenerator.compile(pft.value.arg.type)»,«typeGenerator.compile(GetReturnType.effectFullFunctionDefinition(pft.value))»>() {
				@Override
				public «typeGenerator.compile(GetReturnType.effectFullFunctionDefinition(pft.value))» f(«typeGenerator.compile(pft.value.arg.type)» «pft.value.arg.name») {
					return «EffectFullFunctionGenerator.compileIO((pft.value.functionBody as CompositionFunctionBodyEffect), pft.value.arg)»;
				}
		}
	«ELSEIF (pft.value.functionBody instanceof CompositionFunctionBodyEffect && pft.value.arg == null)»
		new F0<«typeGenerator.compile(GetReturnType.effectFullFunctionDefinition(pft.value))»>() {
					@Override
					public «typeGenerator.compile(GetReturnType.effectFullFunctionDefinition(pft.value))» f() {
						return «EffectFullFunctionGenerator.compileIO((pft.value.functionBody as CompositionFunctionBodyEffect), null)»;
					}
			}.f()
	«ENDIF»
	'''
}