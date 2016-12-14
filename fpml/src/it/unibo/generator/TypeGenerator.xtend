package it.unibo.generator

import it.unibo.fPML.*
import it.unibo.validation.utilitiesFunctions.GetReturnType
import it.unibo.validation.utilitiesFunctions.Others

class TypeGenerator {
	
	def String compile(ValueType vt) '''
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
	
	def String compile(Type t){
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
	
	def String compileType(Expression e) {
		switch e {
			IntegerType: return "Integer"
			StringType: return "String"
      		BooleanType: return "Boolean"
			DataType: return e.type.name
			PureFunctionType: 	if (e.value.arg != null) return '''F<«e.value.arg.type.compile», «GetReturnType.function(e.value).compile»>'''
								else return GetReturnType.function(e.value).compile
			PureValueRef: return '''«compileType(e.value.value)»'''
			PureSumValue: {
		    	if (e.sumAdtElement1 != null){
		    		val sumElement1 = Others.getInnerElementFromPureExpressionAndPureFunctionReference(e.sumAdtElement1)
					var String sumElement1Type 
					if (sumElement1 instanceof Expression) sumElement1Type = compileType(sumElement1 as Expression) else sumElement1Type = Others.createTypeOfPureFunction(sumElement1 as PureFunction).compile 	
		    		return '''Either<«sumElement1Type», Unit>'''
		    	}
		    	else {
		    		val sumElement2 = Others.getInnerElementFromPureExpressionAndPureFunctionReference(e.sumAdtElement2)	
		    		var String sumElement2Type
		    		if (sumElement2 instanceof Expression) sumElement2Type = compileType(sumElement2 as Expression) else sumElement2Type = Others.createTypeOfPureFunction(sumElement2 as PureFunction).compile
		    		return '''Either<Unit, «sumElement2Type»>'''
		    	}	
		    } 
			PureProdValue: {
				val prodElement1 = Others.getInnerElementFromPureExpressionAndPureFunctionReference(e.prodAdtElement1)
				val prodElement2 = Others.getInnerElementFromPureExpressionAndPureFunctionReference(e.prodAdtElement2)
				var String prodElement1Type 
				var String prodElement2Type
				if (prodElement1 instanceof Expression) prodElement1Type = compileType(prodElement1 as Expression) else prodElement1Type = Others.createTypeOfPureFunction(prodElement1 as PureFunction).compile 
				if (prodElement2 instanceof Expression) prodElement2Type = compileType(prodElement2 as Expression) else prodElement2Type = Others.createTypeOfPureFunction(prodElement2 as PureFunction).compile
				return '''P2<«prodElement1Type», «prodElement2Type»>'''
			
			}
			default: return '''Unit'''
		}
	}
	
	def String compileType(EffectFullExpression e) {
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
		    IOPureFunction:	{
		    	if (e.pureFunction == null) '''IO<«Others.createTypeOfPureFunction(e.purePrimitive).compile»>'''
		    	else '''IO<«Others.createTypeOfPureFunction(e.pureFunction)»>'''
		    }
			IOEffectFullFunction: {
				if (e.effectFullFunction == null) '''IO<«Others.createTypeOfEffectFullFunction(e.effectFullPrimitive).compile»>''' 
				else '''IO<«Others.createTypeOfEffectFullFunction(e.effectFullFunction).compile»>'''
			}
		    EffectFullProdValue: {
		    	val prodElement1 = Others.getInnerElementFromEffectFullExpressionAndEffectFullFunctionReference(e.prodAdtElement1)
				val prodElement2 = Others.getInnerElementFromEffectFullExpressionAndEffectFullFunctionReference(e.prodAdtElement2)
				var String prodElement1Type 
				var String prodElement2Type
				if (prodElement1 instanceof Expression) prodElement1Type = compileType(prodElement1 as Expression) else prodElement1Type = Others.createTypeOfEffectFullFunction(prodElement1 as EffectFullFunction).compile 
				if (prodElement2 instanceof Expression) prodElement2Type = compileType(prodElement2 as Expression) else prodElement2Type = Others.createTypeOfEffectFullFunction(prodElement2 as EffectFullFunction).compile
				return '''P2<«prodElement1Type», «prodElement2Type»>'''
		    	}
		    EffectFullSumValue: {
		    	if (e.sumAdtElement1 != null){
		    		val sumElement1 = Others.getInnerElementFromEffectFullExpressionAndEffectFullFunctionReference(e.sumAdtElement1)
					var String sumElement1Type 
					if (sumElement1 instanceof Expression) sumElement1Type = compileType(sumElement1 as Expression) else sumElement1Type = Others.createTypeOfEffectFullFunction(sumElement1 as EffectFullFunction).compile 	
		    		return '''Either<«sumElement1Type», Unit>'''
		    	}
		    	else {
		    		val sumElement2 = Others.getInnerElementFromEffectFullExpressionAndEffectFullFunctionReference(e.sumAdtElement2)	
		    		var String sumElement2Type
		    		if (sumElement2 instanceof Expression) sumElement2Type = compileType(sumElement2 as Expression) else sumElement2Type = Others.createTypeOfEffectFullFunction(sumElement2 as EffectFullFunction).compile
		    		return '''Either<Unit, «sumElement2Type»>'''
		    	}	
		    } 
			EffectFullValueRef: '''«compileType(e.value.value)»'''
		}
	}
}