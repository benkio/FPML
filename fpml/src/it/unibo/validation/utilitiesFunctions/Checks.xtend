package it.unibo.validation.utilitiesFunctions

import it.unibo.fPML.*
import java.util.List
import it.unibo.validation.utilitiesFunctions.*
import org.eclipse.xtend.lib.annotations.EqualsHashCodeProcessor.Util
import org.eclipse.emf.ecore.util.EcoreUtil
import it.unibo.services.FPMLGrammarAccess.PureExpressionAndPureFunctionReferenceElements
import org.eclipse.xtext.EcoreUtil2

class Checks {
	
	def static boolean DataAndValue(PureExpressionAndPureFunctionReference valueOrReference, ValueType type) {
		var PureFunction value = Others.getInnerElementFromPureExpressionAndPureFunctionReference(valueOrReference)
		switch type {
			UnitType: value instanceof UnitType ||
					(value instanceof PureValueRef &&
				      TypeEquals(GetReturnType.expression((value as PureValueRef).value.value), type, false)) 
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
				switch value {
					PureValueRef: value.value instanceof PureFunctionDefinition
								  && TypeEquals(Others.createTypeOfPureFunction((value as PureValueRef).value), type, false)
					default: TypeEquals(Others.createTypeOfPureFunction(value), type, false)
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
					PureValueRef: return (value.value.value instanceof DataValue) && ValueTypeEquals((value.value.value as DataValue).type.content, type, false)
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
			PureFunctionType: valueType instanceof PureFunctionType && ValueTypeEquals(adtt.argType, (valueType as PureFunctionType).argType, false) && ValueTypeEquals(adtt.returnType, (valueType as PureFunctionType).returnType, false)
			default: false
		}
	}
	
	def static boolean ValueTypeEquals(ValueType v, ValueType v2, boolean unitCheck) {
		if (unitCheck && (v2 instanceof UnitType || (v instanceof UnitType && v2 == null)))
			return true
		
		if (v2 instanceof VoidType) return false
		switch v {
			PureFunctionType: return 	v2 instanceof PureFunctionType && 
										ValueTypeEquals(v.argType,(v2 as PureFunctionType).argType, false) && 
										ValueTypeEquals(v.returnType,(v2 as PureFunctionType).returnType, false)
			DataType: return v2 instanceof DataType && v.type.name.equals((v2 as DataType).type.name)
			PureAlgebraicType: return v2 instanceof PureAlgebraicType &&
											ValueTypeEquals(v.pureAdtElement1, (v2 as PureAlgebraicType).pureAdtElement1, false) &&
											ValueTypeEquals(Others.getElement2ValueTypeFromPureAlgebraicType(v), Others.getElement2ValueTypeFromPureAlgebraicType(v2 as PureAlgebraicType), false)
			VoidType: return false
			UnitType: return v2 instanceof UnitType
			default: return  (unitCheck && v2 instanceof UnitType) || v.eClass == v2.eClass
		}
	}
	
	def static boolean TypeEquals(Type t, Type t1, boolean unitTypeCheck) {
		if (unitTypeCheck && (t1 instanceof UnitType || (t instanceof UnitType && t1 == null)))
			return true

		if (t instanceof VoidType || t1 instanceof VoidType) return false
		switch t {
			EffectFullFunctionType: return 	(t1 instanceof EffectFullFunctionType) 
										&&	TypeEquals(t.argType, (t1 as EffectFullFunctionType).argType, false)
										&&	TypeEquals(t.returnType.type, (t1 as EffectFullFunctionType).returnType.type, false)
			UnitType: return t1 instanceof UnitType
			IOType: return t1 instanceof IOType && TypeEquals(t.type, (t1 as IOType).type, false)
			EffectFullDataType: return t1 instanceof EffectFullDataType && t.type.name.equals((t1 as EffectFullDataType).type.name)
			EffectFullAlgebraicType: return t1 instanceof EffectFullAlgebraicType &&
											TypeEquals(t.effectFullAdtElement1, (t1 as EffectFullAlgebraicType).effectFullAdtElement1, false) &&
											TypeEquals(Others.getElement2ValueTypeFromEffectFullAlgebraicType(t), Others.getElement2ValueTypeFromEffectFullAlgebraicType(t1 as EffectFullAlgebraicType), false)
			default: return t1 instanceof ValueType && ValueTypeEquals((t as ValueType), (t1 as ValueType), unitTypeCheck)
		}
	}
	
	def static boolean functionReturnType(PureFunctionDefinition f) {
		return ValueTypeEquals(GetReturnType.pureFunctionDefinition(f), f.returnType, false) || GetReturnType.pureFunctionDefinition(f) == null 
	}
	
	def static boolean mainReturnType(MainFunc m){
		return (GetReturnType.mainFunc(m) instanceof IOType && (GetReturnType.mainFunc(m) as IOType).type instanceof UnitType)
	}
	
	def static boolean functionArgType(PureFunctionDefinition f) {
		return functionBody(f.functionBody, f.arg.type)
	}
	
	def static boolean pureLambda(PureLambda lambda) {
		if (lambda.arg != null)
			return functionBody(lambda.functionBody, lambda.arg.type)
		else 
			return functionBody(lambda.functionBody, FPMLFactory.eINSTANCE.createUnitType)
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
		if (!ValueTypeEquals(startType, argFuncFirst, true)) return false
		startType = GetReturnType.pureFunction(first)
	
		for (PureFunction f : functions) {
			val argFunc = GetArgType.pureFunction(f)
			if (!ValueTypeEquals(startType, argFunc, true)) return false
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
		if (!TypeEquals(startType, argFuncFirst, true)) return false
		startType = GetReturnType.effectFullBodyContent(first)
	
		for (EffectFullBodyContent r : references) {
			val argFunc = GetArgType.effectFullBodyContent(r)
			val result	= !(startType instanceof IOType) 
						|| !TypeEquals((startType as IOType).type, argFunc, true) 
			if (result) return false
			startType = GetReturnType.effectFullBodyContent(r)
		}
		return true
	}
	
	def static functionReturnTypeEffectFull(EffectFullFunctionDefinition definition) {
		return TypeEquals(GetReturnType.effectFullFunctionDefinition(definition), definition.returnType, false) || GetReturnType.effectFullFunctionDefinition(definition) == null 
	}
	
	def static functionArgTypeEffectFull(it.unibo.fPML.EffectFullFunctionDefinition definition) {
		return functionBodyEffectFull(definition.functionBody, Others.getArgumentType(definition.arg))
	}
	
	def static boolean effectFullLambda(EffectFullLambda lambda) {
		if (lambda.arg != null)
			return functionBodyEffectFull(lambda.functionBody, Others.getArgumentType(lambda.arg))
		else 
			return functionBodyEffectFull(lambda.functionBody, FPMLFactory.eINSTANCE.createUnitType)
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
			EffectFullFunctionType: {
				switch value {
					EffectFullValueRef: value.value instanceof EffectFullFunctionDefinition
								  && TypeEquals(Others.createTypeOfPureFunction((value as PureValueRef).value), type, false)
					default: TypeEquals(Others.createTypeOfEffectFullBodyContent(value), Others.lambdaWrap(type.argType, type.returnType), false) 
					
				}
			}
			EffectFullDataType: return (value instanceof EffectFullDataValue && 
					 			effectFullDataAndValue((value as EffectFullDataValue).value, type.type.content)) ||
					 			(value instanceof EffectFullValueRef && 
					 			TypeEquals(GetReturnType.effectFullExpression((value as EffectFullValueRef).value.value), type, true)) 
			EffectFullAlgebraicType: {
				switch value {
					EffectFullSumValue: return (Others.getElement2ValueTypeFromEffectFullAlgebraicType(type) instanceof EffectFullSumTypeFactor) && 
									 (  (effectFullDataAndValue(value.sumAdtElement1, (type).effectFullAdtElement1)).booleanValue 
									 || (effectFullDataAndValue(value.sumAdtElement2, (Others.getElement2ValueTypeFromEffectFullAlgebraicType(type))).booleanValue))
					EffectFullProdValue: return (Others.getElement2ValueTypeFromEffectFullAlgebraicType(type) instanceof PureProdTypeFactor) && 
									(   (effectFullDataAndValue(value.prodAdtElement1, type.effectFullAdtElement1)).booleanValue 
									&& (effectFullDataAndValue(value.prodAdtElement2, (Others.getElement2ValueTypeFromEffectFullAlgebraicType(type))).booleanValue))
					EffectFullValueRef: return TypeEquals(GetReturnType.effectFullExpression(value.value.value), type, true) 
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
							return ((type as IOType).type instanceof ValueType) && ValueTypeEquals(Others.createTypeOfPureFunction(function), (type as IOType).type as ValueType, false)
						}
					IOEffectFullFunction: {
							var EffectFullFunction function;
							if (value.effectFullFunction != null) function = value.effectFullFunction else function = value.effectFullPrimitive
							return ((type as IOType).type instanceof EffectFullType) && TypeEquals(Others.createTypeOfEffectFullFunction(function), (type as IOType).type as EffectFullType, false)
					}
					default: return false
				}
			}
			default: false
		}
	}
	
	def static boolean applyF(ApplyF af){
		if (af.value.valueExpression == null) {
			return Checks.ValueTypeEquals(af.functionType.argType, GetReturnType.pureFunction(af.value.valueReference), false)
		} else {
			if (af.value.valueExpression instanceof PureFunctionType && (af.value.valueExpression as PureFunctionType).value.arg == null) {
				val lambdaReturnType = (GetReturnType.pureFunction((af.value.valueExpression as PureFunctionType).value) as PureFunctionType).returnType
				return ValueTypeEquals(lambdaReturnType, af.functionType.argType, false)
			}
			return DataAndValue(Others.createPureExpressionAndPureFunctionReference(af.value.valueExpression), af.functionType.argType)
		}
	}
	
	def static boolean applyFIO(ApplyFIO afio){
		val valueReturnType = GetReturnType.effectFullBodyContent(Others.getValueFromApplyFIOFactor(afio.value))
		if (afio.value.valueExpression != null 
			&& afio.value.valueExpression instanceof EffectFullFunctionType
			&& (afio.value.valueExpression as EffectFullFunctionType).value.arg == null
		)
			return Checks.TypeEquals(Others.IOWrap(afio.functionType.argType), (valueReturnType as EffectFullFunctionType).returnType, false)
		return Checks.TypeEquals(Others.IOWrap(afio.functionType.argType), valueReturnType, false)
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