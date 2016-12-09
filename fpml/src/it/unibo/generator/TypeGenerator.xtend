package it.unibo.generator

import it.unibo.fPML.*
import it.unibo.validation.utilitiesFunctions.GetReturnType
import it.unibo.validation.utilitiesFunctions.Others

class TypeGenerator {
	
	def compile(ValueType vt) '''
		«switch vt{
			DataType: return vt.type.name
			IntegerType: return 'Integer'
			StringType: return vt.type
      		BooleanType: return 'Boolean'
			PureFunctionType: return '''F<«vt.argType.compile»,«vt.returnType.compile»>'''
			PureAlgebraicType: {
				if ((vt as PureAlgebraicType).pureAdtElement2 instanceof PureSumTypeFactor)
					return '''Either<«vt.pureAdtElement1.compile», «Others.getElement2ValueTypeFromPureAlgebraicType(vt).compile»>'''
				else
					return '''P2<«vt.pureAdtElement1.compile», «Others.getElement2ValueTypeFromPureAlgebraicType(vt).compile»>'''
			}
			UnitType: '''Unit'''
		}»'''

	def compile(PureArgument arg) '''«arg.type.compile» «arg.name»'''
	
	def compile(EffectFullArgument arg) '''«arg.type.compile» «arg.name»'''
	
	def compile(Type t){
		switch t {
			ValueType: return compile(t)
			EffectFullFunctionType: return '''F<«t.argType.compile», IO<«t.returnType.type.compile»>>'''
			EffectFullDataType: '''«t.type.name»'''
			EffectFullAlgebraicType: {
				if (t.effectFullAdtElement2 instanceof EffectFullSumTypeFactor)
					return '''Either<«t.effectFullAdtElement1.compile», «Others.getElement2ValueTypeFromEffectFullAlgebraicType(t).compile»>'''
				else
					return '''P2<«t.effectFullAdtElement1.compile», «Others.getElement2ValueTypeFromEffectFullAlgebraicType(t).compile»>'''
			}
			IOType: return '''IO<«t.type.compile»>'''
		}
	}
	
	def compileType(Expression e) {
		switch e {
			IntegerType: return "Integer"
			StringType: return "String"
      		BooleanType: return "Boolean"
			DataType: return e.type.name
			PureFunctionType: 	if (e.value.arg != null) return '''F<«e.value.arg.type.compile», «GetReturnType.function(e.value).compile»>'''
								else return GetReturnType.function(e.value).compile
			PureValueRef: return '''«compileType(e.value.value)»'''
			PureSumValue: return '''Either<«e.sumAdtElement1.compileType», «e.sumAdtElement2.compileType»>'''
			PureProdValue: return '''P2<«e.prodAdtElement1.compileType», «e.prodAdtElement2.compileType»>'''
			default: return '''Unit'''
		}
	}
	
	def compileType(EffectFullExpression e) {
		switch e {
			IOExpression: '''IO<«compileType(e.innerValue as Expression)»>'''
			Expression: compileType(e as Expression)
			EffectFullFunctionType: if (e.argType != null && e.returnType != null) 
										return '''F<«e.argType.compile», IO<«e.returnType.type.compile»>>'''
									else if(e.returnType != null)
										return '''«e.returnType.type.compile»'''
									else 
										return '''«GetReturnType.function(e.value).compile»'''
			EffectFullDataType: e.type.name
		    IOEffectFullExpression: '''IO<«(e.innerValue as EffectFullExpression).compileType»>'''
		    IOPureFunction:	'''TODO'''
			IOEffectFullFunction: '''TODO'''
		    EffectFullProdValue: '''P2<«e.prodAdtElement1.compileType», «e.prodAdtElement2.compileType»>'''
		    EffectFullSumValue: '''Either<«e.sumAdtElement1.compileType», «e.sumAdtElement2.compileType»>'''
			EffectFullValueRef: '''«compileType(e.value.value)»'''
		}
	}
}