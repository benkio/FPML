package it.unibo.validation.utilitiesFunctions

import it.unibo.fPML.*
import java.util.List
import org.eclipse.xtend.lib.annotations.EqualsHashCodeProcessor.Util
import org.eclipse.emf.ecore.util.EcoreUtil
import it.unibo.services.FPMLGrammarAccess.PureExpressionAndPureFunctionReferenceElements

class Checks {
	
	def static boolean DataAndValue(PureExpressionAndPureFunctionReference valueOrReference, ValueType type) {
		val value = Others.getInnerElementFromPureExpressionAndPureFunctionReference(valueOrReference)
		switch type {
			UnitType: value instanceof UnitType ||
					(value instanceof PureValueRef &&
				      TypeEquals(GetReturnType.expression((value as PureValueRef).value.value), type)) 
			IntegerType: return value instanceof IntegerType || 
						       (value instanceof PureValueRef &&
						       	checkValueType((value as PureValueRef).value, type)
						       )
			StringType: return value instanceof StringType ||
							  (value instanceof PureValueRef &&
						       	checkValueType((value as PureValueRef).value, type)
						       )
		    BooleanType: return value instanceof BooleanType ||
							  (value instanceof PureValueRef &&
						       	checkValueType((value as PureValueRef).value, type)
						       )
		    DataType: return (value instanceof DataValue && 
							DataAndValue((value as DataValue).value, (type as DataType).type.content))
			PureFunctionType: {
				if ( value instanceof PureFunctionType) 
					return (value as PureFunctionType).value.getFunctionBody instanceof CompositionFunctionBodyPure &&
					 ValueTypeEquals((value as PureFunctionType).value.arg.type, type.argType) && 
					 ValueTypeEquals(GetReturnType.pureFunctionDefinition((value as PureFunctionType).value), type.returnType)
				else if ( value instanceof PureValueRef && (value as PureValueRef).value instanceof PureFunctionDefinition) {
					return  ValueTypeEquals(((value as PureValueRef).value as PureFunctionDefinition).arg.type, type.argType) &&
							ValueTypeEquals(((value as PureValueRef).value as PureFunctionDefinition).returnType, type.returnType)
				} 
			}
			PureAlgebraicType: {
				switch value{
					PureSumValue: return ((type as PureAlgebraicType).pureAdtElement2 instanceof PureSumTypeFactor) && 
									 (  (DataAndValue(value.sumAdtElement1, (type as PureAlgebraicType).pureAdtElement1)).booleanValue 
									 || (DataAndValue(value.sumAdtElement2, Others.getElement2ValueTypeFromPureAlgebraicType((type as PureAlgebraicType))).booleanValue))
					PureProdValue: return ((type as PureAlgebraicType).pureAdtElement2 instanceof PureProdTypeFactor) && 
									(   (DataAndValue(value.prodAdtElement1, (type as PureAlgebraicType).pureAdtElement1)).booleanValue 
									&& (DataAndValue(value.prodAdtElement2, Others.getElement2ValueTypeFromPureAlgebraicType((type as PureAlgebraicType))).booleanValue))
					PureValueRef: return (value.value.value instanceof DataValue) && ValueTypeEquals((value.value.value as DataValue).type.content, type)
					default: false			
					}
				}
          	default: false
		}
	}
	
	def static boolean checkValueType(PureValue v, ValueType adtt) {
		val valueType = GetReturnType.expression(v.value)
		switch adtt {
			IntegerType: return valueType instanceof IntegerType
			StringType: return valueType instanceof StringType
      		BooleanType: return valueType instanceof BooleanType
			DataType: return valueType instanceof DataType && adtt.type.name.equals((valueType as DataType).type.name) 
			PureFunctionType: valueType instanceof PureFunctionType && ValueTypeEquals(adtt.argType, (valueType as PureFunctionType).argType) && ValueTypeEquals(adtt.returnType, (valueType as PureFunctionType).returnType)
			default: false
		}
	}
	
	def static boolean ValueTypeEquals(ValueType v, ValueType v2) {
		if (v2 instanceof VoidType) return false
		switch v {
			PureFunctionType: return 	v2 instanceof PureFunctionType && 
										ValueTypeEquals(v.argType,(v2 as PureFunctionType).argType) && 
										ValueTypeEquals(v.returnType,(v2 as PureFunctionType).returnType)
			DataType: return v2 instanceof DataType && v.type.name.equals((v2 as DataType).type.name)
			PureAlgebraicType: return v2 instanceof PureAlgebraicType &&
											ValueTypeEquals(v.pureAdtElement1, (v2 as PureAlgebraicType).pureAdtElement1) &&
											ValueTypeEquals(Others.getElement2ValueTypeFromPureAlgebraicType(v), Others.getElement2ValueTypeFromPureAlgebraicType(v2 as PureAlgebraicType))
			VoidType: return false
			UnitType: return v2 instanceof UnitType
			default: return  v2 instanceof UnitType || v.eClass == v2.eClass
		}
	}
	
	def static boolean TypeEquals(Type t, Type t1) {
		if (t1 instanceof UnitType || (t instanceof UnitType && t1 == null)) return true
		if (t instanceof VoidType || t1 instanceof VoidType) return false
		switch t {
			EffectFullFunctionType: return 	t1 instanceof EffectFullFunctionType &&
											TypeEquals(t.argType, (t1 as EffectFullFunctionType).argType) &&
											TypeEquals(t.returnType.type, (t1 as EffectFullFunctionType).returnType.type)
			UnitType: return t1 instanceof UnitType
			IOType: return t1 instanceof IOType && TypeEquals(t.type, (t1 as IOType).type) && !((t1 as IOType).type instanceof UnitType && !(t.type instanceof UnitType))
			EffectFullDataType: return t1 instanceof EffectFullDataType && t.type.name.equals((t1 as EffectFullDataType).type.name)
			EffectFullAlgebraicType: return t1 instanceof EffectFullAlgebraicType &&
											TypeEquals(t.effectFullAdtElement1, (t1 as EffectFullAlgebraicType).effectFullAdtElement1) &&
											TypeEquals(Others.getElement2ValueTypeFromEffectFullAlgebraicType(t), Others.getElement2ValueTypeFromEffectFullAlgebraicType(t1 as EffectFullAlgebraicType))
			default: return t1 instanceof ValueType && ValueTypeEquals((t as ValueType), (t1 as ValueType))
		}
	}
	
	def static boolean functionReturnType(PureFunctionDefinition f) {
		return ValueTypeEquals(GetReturnType.pureFunctionDefinition(f), f.returnType) || GetReturnType.pureFunctionDefinition(f) == null 
	}
	
	def static boolean mainReturnType(MainFunc m){
		return TypeEquals(GetReturnType.mainFunc(m), FPMLFactory.eINSTANCE.createUnitType) || GetReturnType.mainFunc(m) == null 
	}
	
	def static boolean functionArgType(PureFunctionDefinition f) {
		return functionBody(f.functionBody, f.arg.type)
	}
	
	def static boolean pureLambda(PureLambda lambda) {
		val arg = GetArgType.pureLambda(lambda)
		
		return functionBody(lambda.functionBody, arg)
	}
	
	def static boolean functionBody(FunctionBodyPure pure, ValueType argType) {
		switch pure {
			EmptyFunctionBody: return true
			CompositionFunctionBodyPure: return compositionFunctionBodyPure(pure, argType)
		}
	}
	
	def static boolean compositionFunctionBodyPure(CompositionFunctionBodyPure pure, ValueType argType) {
		val first = Others.getFirstFunctionDefinitionFromCompositionBodyPure(pure)
		val chain = pure.functionChain.map[x | Others.getFunctionDefinitionFromPureFactor(x)].toList
		return functionChainPure(chain, first,  argType)
	}
	
	def static boolean functionChainPure(List<PureFunction> functions, PureFunction first, ValueType type) {
		if(type instanceof VoidType) return false
		var startType = type
		
		val argFuncFirst = GetArgType.pureFunction(first)
		if (!ValueTypeEquals(startType, argFuncFirst)) return false
		startType = GetReturnType.pureFunction(first)
	
		for (PureFunction f : functions) {
			val argFunc = GetArgType.pureFunction(f)
			if (!ValueTypeEquals(startType, argFunc)) return false
			startType = GetReturnType.pureFunction(f)
		}
		return true
	}
	
	def static boolean mainArgType(MainFunc func) {
		return functionBodyEffectFull(func.functionBody, FPMLFactory.eINSTANCE.createUnitType)
	}
	
	def static boolean functionBodyEffectFull(FunctionBodyEffectFull full, Type argType) {
		switch full {
			EmptyFunctionBody: return true
			CompositionFunctionBodyEffect: compositionFunctioBodyEffect(full, argType)
		}
	}
	
	def static boolean compositionFunctioBodyEffect(CompositionFunctionBodyEffect effect, Type argType) {
		val first = Others.getFirstFunctionDefinitionFromCompositionBodyEffectFull(effect)
		val chain = effect.functionChain.map[x | Others.getFunctionDefinitionFromEffectFullFactor(x)].toList
		return functionChainEffectFull(chain, first,  argType)
	}
	
	def static functionChainEffectFull(List<EffectFullBodyContent> references, EffectFullBodyContent first, Type type) {
		if(type instanceof VoidType) return false
		var startType = type
		
		val argFuncFirst = GetArgType.effectFullBodyContent(first)
		if (!TypeEquals(startType, argFuncFirst)) return false
		startType = GetReturnType.effectFullBodyContent(first)
	
		for (EffectFullBodyContent r : references) {
			val argFunc = GetArgType.effectFullBodyContent(r)
			val result	= !(startType instanceof IOType) 
						|| !TypeEquals((startType as IOType).type, argFunc) 
			if (result) return false
			startType = GetReturnType.effectFullBodyContent(r)
		}
		return true
	}
	
	def static functionReturnTypeEffectFull(EffectFullFunctionDefinition definition) {
		return TypeEquals(GetReturnType.effectFullFunctionDefinition(definition), definition.returnType) || GetReturnType.effectFullFunctionDefinition(definition) == null 
	}
	
	def static functionArgTypeEffectFull(it.unibo.fPML.EffectFullFunctionDefinition definition) {
		return functionBodyEffectFull(definition.functionBody, Others.getArgumentType(definition.arg))
	}
	
	def static boolean effectFullLambda(EffectFullLambda lambda) {
		val arg = GetArgType.effectFullLambda(lambda)
		
		return functionBodyEffectFull(lambda.functionBody, arg)
	}
	
	
	///
	/// Most Delicate method
	///
	def static boolean effectFullDataAndValue(EffectFullExpressionAndEffectFullFunctionReference valueOrReference, Type type) {
		val value = Others.getInnerElementFromEffectFullExpressionAndEffectFullFunctionReference(valueOrReference)
		switch type {
			ValueType: (value instanceof Expression || value instanceof PureFunction) 
						&&  valueOrReference instanceof PureExpressionAndPureFunctionReference 
						&& DataAndValue(valueOrReference as PureExpressionAndPureFunctionReference, type)
			EffectFullFunctionType: 
				if (value instanceof EffectFullFunctionType) 
					return (value as EffectFullFunctionType).value.getFunctionBody instanceof CompositionFunctionBodyEffect &&
					 TypeEquals(Others.getArgumentType((value as EffectFullFunctionType).value.arg), type.argType) && 
					 TypeEquals(GetReturnType.effectFullFunctionDefinition((value as EffectFullFunctionType).value), type.returnType)
				else if (value instanceof EffectFullValueRef && 
						(value as EffectFullValueRef).value instanceof EffectFullFunctionType && 
						((value as EffectFullValueRef).value as EffectFullFunctionType).value instanceof EffectFullLambda) {
							val lambda = ((value as EffectFullValueRef).value as EffectFullFunctionType)
							return  TypeEquals(GetArgType.effectFullLambda(lambda.value as EffectFullLambda), type.argType) &&
							TypeEquals(GetReturnType.effectFullExpression(lambda), type.returnType)
					}
			EffectFullDataType: return (value instanceof EffectFullDataValue && 
					 			effectFullDataAndValue((value as EffectFullDataValue).value, type.type.content)) ||
					 			(value instanceof EffectFullValueRef && 
					 			TypeEquals(GetReturnType.effectFullExpression((value as EffectFullValueRef).value.value), type)) 
			EffectFullAlgebraicType: {
				switch value {
					EffectFullSumValue: return (Others.getElement2ValueTypeFromEffectFullAlgebraicType(type) instanceof EffectFullSumTypeFactor) && 
									 (  (effectFullDataAndValue(value.sumAdtElement1, (type).effectFullAdtElement1)).booleanValue 
									 || (effectFullDataAndValue(value.sumAdtElement2, (Others.getElement2ValueTypeFromEffectFullAlgebraicType(type))).booleanValue))
					EffectFullProdValue: return (Others.getElement2ValueTypeFromEffectFullAlgebraicType(type) instanceof PureProdTypeFactor) && 
									(   (effectFullDataAndValue(value.prodAdtElement1, type.effectFullAdtElement1)).booleanValue 
									&& (effectFullDataAndValue(value.prodAdtElement2, (Others.getElement2ValueTypeFromEffectFullAlgebraicType(type))).booleanValue))
					EffectFullValueRef: return TypeEquals(GetReturnType.effectFullExpression(value.value.value), type) 
					default: return false	
				}
			}
			IOType: {
				switch value {
					IOExpression: return ((type as IOType).type instanceof ValueType) && DataAndValue(Others.createPureExpressionAndPureFunctionReference(value.innerValue as Expression), (type as IOType).type as ValueType)
					IOEffectFullExpression: return ((type as IOType).type instanceof EffectFullType) && effectFullDataAndValue(Others.createEffectFullExpressionAndEffectFullFunctionReference(value.innerValue as EffectFullExpression), (type as IOType).type as EffectFullType)					
					IOPureFunction: {
							var PureFunction function;
							if (value.pureFunction != null) function = value.pureFunction else function = value.purePrimitive
							return ((type as IOType).type instanceof ValueType) && ValueTypeEquals(Others.createTypeOfPureFunction(function), (type as IOType).type as ValueType)
						}
					IOEffectFullFunction: {
							var EffectFullFunction function;
							if (value.effectFullFunction != null) function = value.effectFullFunction else function = value.effectFullPrimitive
							return ((type as IOType).type instanceof EffectFullType) && TypeEquals(Others.createTypeOfEffectFullFunction(function), (type as IOType).type as EffectFullType)
					}
					default: return false
				}
			}
			default: false
		}
	}
	
	def static boolean applyF(ApplyF af){
		if (af.value.valueExpression == null) {
			return Checks.ValueTypeEquals(af.functionType.argType, GetReturnType.pureFunction(af.value.valueReference))
		} 
		switch af.value.valueExpression {
			PureFunctionType: if ((af.value.valueExpression as PureFunctionType).argType == null)
								return ValueTypeEquals(GetReturnType.pureFunction((af.value.valueExpression as PureFunctionType).value), af.functionType.argType)
							  else 
								return DataAndValue(Others.createPureExpressionAndPureFunctionReference(af.value.valueExpression), af.functionType.argType)
			default: return DataAndValue(Others.createPureExpressionAndPureFunctionReference(af.value.valueExpression), af.functionType.argType)
		}
	}
	
	def static boolean applyFIO(ApplyFIO afio){
			return Checks.TypeEquals(Others.IOWrap(afio.functionType.argType), GetReturnType.effectFullBodyContent(Others.getValueFromApplyFIOFactor(afio.value)))
	}
	
	def static boolean effectFullExpressionHasSideEffects(EffectFullExpression expression) {
		val effectFullExpressionType = GetReturnType.effectFullExpression(expression)
		return checkTypeContainsIOTypes(effectFullExpressionType)
	}
	
	def static boolean checkTypeContainsIOTypes(Type type){
		switch type {
			ValueType: return false
			EffectFullDataType: checkTypeContainsIOTypes(type.type.content)
			EffectFullAlgebraicType: checkTypeContainsIOTypes(type.effectFullAdtElement1) || checkTypeContainsIOTypes(Others.getElement2ValueTypeFromEffectFullAlgebraicType(type))
			default: return true
		}
	}
	
}