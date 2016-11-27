package it.unibo.generator

import it.unibo.fPML.*
import it.unibo.validation.utilitiesFunctions.GetReturnType

class EffectFullValueGenerator {
	
	val typeGenerator = new TypeGenerator
	val EffectFullFunctionGenerator = new EffectFullFunctionGenerator
	val valueGenerator = new ValueGenerator
	
	def compile(Iterable<EffectFullValue> values)	'''
	    package «FPMLGenerator.basePackageJava»Effectfull.Data;
	    
	    import «FPMLGenerator.basePackageJava»Effectfull.Data.*;
	    import it.unibo.Pure.PureFunctionDefinitions;
	    import fj.data.*;
	    import fj.P;
	    import fj.P2;
	    import fj.Unit;
	    import it.unibo.Effectfull.PrimitivesEffectFull;
	    import it.unibo.Effectfull.EffectFullFunctionDefinitions;
	    import fj.F;
	    import fj.F0;
	    
	    public class Value {
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
			Expression: return "IOFunctions.Unit(" + valueGenerator.compile(e) + ")"
			UnitType: return "IOFunctions.ioUnit"
			EffectFullFunctionType: return e.compile 
			EffectFullDataValue: '''new «e.type.name»(«compileAdtValue(e.value,e.type.content)»)'''
		}	
	}
	
	def compileAdtValue(EffectFullAdtValue v, EffectFullAdtType d) {
		switch v {
			PureAdtValue: '''IOFunctions.unit(«valueGenerator.compileAdtValue(v, ((d as IOType).type as PureAdtType))»)'''
			EffectFullSumValue: {
				if (v.sumAdtElement1 == null) return '''Either.right(«compileAdtValue(v.sumAdtElement2, (d.effectFullAdtElement2 as EffectFullSumType).adtElement)»)'''
				return '''Either.left(«compileAdtValue(v.sumAdtElement1, ((d as EffectFullAdtType).effectFullAdtElement1))»)'''
			}
			EffectFullProdValue: return '''P.p(«compileAdtValue(v.prodAdtElement1,d.effectFullAdtElement1)»,«compileAdtValue(v.prodAdtElement2, (d.effectFullAdtElement2 as EffectFullProdType).adtElement)»)'''			
			EffectFullValueRef: if ( v.value instanceof EffectFullValue ) return '''Value.«(v.value as EffectFullValue).name»()''' else return '''EffectFullFunctionDefinitions::«(v.value as EffectFullFunctionDefinition).name»'''
			EffectFullFunctionType: {
				if (d instanceof EffectFullFunctionType)
					return v.compile
				else if (d instanceof IOType)
					return '''IOFunctions.unit(«v.compile»)'''
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
	new F<«typeGenerator.compile(pft.value.arg.type)»,IO<«typeGenerator.compile(GetReturnType.effectFullFunctionDefinition(pft.value))»>>() {
				@Override
				public IO<«typeGenerator.compile(GetReturnType.effectFullFunctionDefinition(pft.value))»> f(«typeGenerator.compile(pft.value.arg.type)» «pft.value.arg.name») {
					return «EffectFullFunctionGenerator.compileIO((pft.value.functionBody as CompositionFunctionBodyEffect), pft.value.arg)»
				}
		}
	«ELSEIF (pft.value.functionBody instanceof CompositionFunctionBodyEffect && pft.value.arg == null)»
		new F0<IO<«typeGenerator.compile(GetReturnType.effectFullFunctionDefinition(pft.value))»>>() {
					@Override
					public IO<«typeGenerator.compile(GetReturnType.effectFullFunctionDefinition(pft.value))»> f() {
						return «EffectFullFunctionGenerator.compileIO((pft.value.functionBody as CompositionFunctionBodyEffect), null)»
					}
			}.f()
	«ENDIF»
	'''
}