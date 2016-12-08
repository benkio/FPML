package it.unibo.generator

import it.unibo.fPML.*
import it.unibo.validation.utilitiesFunctions.Others
import it.unibo.validation.utilitiesFunctions.GetReturnType

class ValueEffectFullFunctionCommonGenerator {
	
	val typeGenerator = new TypeGenerator
	val commonFunctions = new ValuePureFunctionCommonGenerator
	val commonPureFunctions = new ValuePureFunctionCommonGenerator
	
	def String compile(EffectFullExpression e) {
		switch e {
			EffectFullFunctionType: return e.compile 
			EffectFullDataValue: '''new «e.type.name»(«compileAdtValue(e.value,e.type.content)»)'''
			EffectFullProdValue: '''P.p(«e.prodAdtElement1.compile», «e.prodAdtElement2.compile»)'''
			EffectFullSumValue: {
				if (e.sumAdtElement1 == null) return '''Either.right(«e.sumAdtElement2.compile»)'''
				return '''Either.left(«e.sumAdtElement1.compile»)'''
			}
			EffectFullValueRef: ''''EffectFullValue.«e.value.name»()'''
			Expression: commonFunctions.compile(e as Expression)
			IOExpression: return "IOFunctions.unit(" + commonFunctions.compile(e.innerValue as Expression) + ")"
			RecursiveEffectFullExpression: return "IOFunctions.unit(" + (e.innerValue as EffectFullExpression).compile + ")"
		}	
	}
	
	def compileAdtValue(EffectFullExpression v, Type d) {
		switch v {
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
			EffectFullDataValue: return compile(v as EffectFullExpression)
			Expression: commonFunctions.compileAdtValue(v as Expression, (d as IOType).type)
			IOExpression: '''IOFunctions.unit(«commonFunctions.compileAdtValue(v.innerValue as Expression, (d as IOType).type)»)'''
			RecursiveEffectFullExpression: '''IOFunctions.unit(«compileAdtValue(v.innerValue as EffectFullExpression, (d as IOType).type as EffectFullType)»)'''
		}
	}
	
	def String compile(EffectFullFunctionType pft) '''
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
					return «compileIO((pft.value.functionBody as CompositionFunctionBodyEffect), pft.value.arg)»;
				}
		}
	«ELSEIF (pft.value.functionBody instanceof CompositionFunctionBodyEffect && pft.value.arg == null)»
		new F0<«typeGenerator.compile(GetReturnType.effectFullFunctionDefinition(pft.value))»>() {
					@Override
					public «typeGenerator.compile(GetReturnType.effectFullFunctionDefinition(pft.value))» f() {
						return «compileIO((pft.value.functionBody as CompositionFunctionBodyEffect), null)»;
					}
			}.f()
	«ENDIF»
	'''
	
	//////////////////////////////////////////////////////////////////////////////////
	// IO Functions
	//////////////////////////////////////////////////////////////////////////////////
	
	def compileIO(CompositionFunctionBodyEffect cfbe, EffectFullArgument arg) {
		var String argName = ""
		if (arg != null){
			argName = "IOFunctions.unit(" + arg.name + ")"
 		}
		var String result = compileIO(Others.getFirstFunctionDefinitionFromCompositionBodyEffectFull(cfbe), argName).toString
		for (CompositionFunctionBodyEffectFullFactor cfbef: cfbe.functionChain){
			result += "\n\t"
			result = compileIO(Others.getFunctionDefinitionFromEffectFullFactor(cfbef), result.toString).toString
		}
		return result;
	}
	
	
	def String compileIO(EffectFullReference e, String valueName){
		switch e {
			IntToString: '''IOFunctions.map(«valueName» ,Primitives::intToString)'''
      		IntPow: '''IOFunctions.map(«valueName»,Primitives::intPow) '''
			Plus: '''IOFunctions.map(«valueName», Primitives::plus)'''
			Minus: '''IOFunctions.map(«valueName», Primitives::minus)'''
			Times: '''IOFunctions.map(«valueName», Primitives::times)'''
		  	LeftPair: '''IOFunctions.map(«valueName», Primitives::leftPair)'''
 			RightPair: '''IOFunctions.map(«valueName», Primitives::rightPair)'''
      		Mod: '''IOFunctions.map(«valueName», Primitives::mod)'''
			PrimitivePrint: '''IOFunctions.bind(«valueName», PrimitivesEffectFull::primitivePrint)'''
      		LeftPairIO: '''IOFunctions.bind(«valueName», primitivesEffectFull:leftPairIO)'''
      		RightPairIO: '''IOFunctions.bind(«valueName», primitivesEffectFull:rightPairIO)'''
      		PrimitiveRandom: valueEmbellishment(valueName,"PrimitivesEffectFull.primitiveRandom()")
      		PrimitiveTime: valueEmbellishment(valueName,"PrimitivesEffectFull.primitiveTime()")
      		PrimitiveReturn: '''«valueName»'''
			ApplyFIO: '''IOFunctions.bind(«valueName», («typeGenerator.compile(e.functionType)» f) -> f.f(IOFunctions.runSafe(«compileIOEffectFullReference(compileIO(Others.getValueFromApplyFIOFactor(e.value), null), null, (e.functionType.argType instanceof IOType))»)))'''
			ApplyF: '''IOFunctions.unit(IOFunctions.runSafe(«valueName»).f(«commonPureFunctions.compileApplyFFactor(e.value,"", true)»))'''
			PureValue: valueEmbellishment(valueName,'''IOFunctions.unit(PureValue.«(e as PureValue).name»())''')
			EffectFullValue: compileIOEffectFullReference('''EffectFullValue.«(e as EffectFullValue).name»()''', valueName, !(GetReturnType.effectFullReference(e) instanceof IOType))
			PureFunctionDefinition: return '''IOFunctions.map(«valueName», PureFunctionDefinitions::«(e as PureFunctionDefinition).name»)'''
      		EffectFullArgument: compileIOEffectFullReference((e as EffectFullArgument).name, valueName, !(e.type instanceof IOType))
      		EffectFullFunctionDefinition: return '''IOFunctions.bind(«valueName», EffectFullFunctionDefinitions::«(e as EffectFullFunctionDefinition).name»)'''
      		EffectFullExpression: valueEmbellishment(valueName, compile(e))
      		ExtractEffectFull: '''IOFunctions.bind(«valueName», («e.data.name» d) -> «IF (e.data.content instanceof IOType)» d.getValue() «ELSE» IOFunctions.unit(d.getValue())) «ENDIF»'''
			ExtractPure: '''IOFunctions.bind(«valueName», («e.data.name» d) ->  IOFunctions.unit(d.getValue()))'''
		}
	}

	def compileIOEffectFullReference(String effectFullReferenceCompiled, String valueName, boolean unitWrap){
		if (unitWrap)
			return valueEmbellishment(valueName,'''IOFunctions.unit(«effectFullReferenceCompiled»)''')
		else
			return valueEmbellishment(valueName,effectFullReferenceCompiled)
	}

	def valueEmbellishment(String inputChain, String valueCompiled){
		if (inputChain.isNullOrEmpty) {
			return valueCompiled;
		}else
			return '''IOFunctions.left(«valueCompiled»,«inputChain»)'''
	}
}