package it.unibo.validation.utilitiesFunctions

import it.unibo.fPML.*
import org.eclipse.emf.common.util.EList
import it.unibo.fPML.ChainElement
import it.unibo.fPML.EffectFullArgument
import org.eclipse.xtext.EcoreUtil2
import java.util.List
import it.unibo.fPML.CompositionFunctionBodyPureFactor
import it.unibo.fPML.ValueType

class GetReturnType {
		def static ValueType getReturnValueType(PureFunctionDefinition pf, ValueType previousChainType){
		val t = pf.getReturnType()
		if (t == null){
			if ( previousChainType instanceof PureFunctionType) {
				return GetReturnType.getReturnTypePurePrimitive(pf, previousChainType)
			} else {
				return GetReturnType.getReturnTypePurePrimitive(pf, null)
			}
		}
		return t
	}
	
	def static Type getReturnEffectFullType(EffectFullFunctionDefinition ef, Type previousChainType){
        val t = ef.getReturnType()
        if (t == null) {
        	if (previousChainType instanceof EffectFullFunctionType) {
        		return getReturnTypeEffectFullPrimitive(ef, previousChainType)
        	} else {
        		return getReturnTypeEffectFullPrimitive(ef, null)
        	}
	    }else{   
	    	 switch t.getType() {
	        	DataType: return (t as DataType)
	        	default: return t.type
	        }
        }
    }
	
    def static Type getReturnType(ChainElement f1, Type previousChainType){
        switch f1 {
            EffectFullFunctionDefinition : return getReturnEffectFullType((f1 as EffectFullFunctionDefinition), previousChainType)
            PureFunctionDefinition: {
            	if (previousChainType instanceof ValueType){
            		return getReturnValueType((f1 as PureFunctionDefinition), previousChainType)
            	} else {
            		throw new Exception("get return Type from pure function with an effectfull argument")
            	}
            }
            Value: return Others.getTypeFromExpression(f1.value)
            EffectFullArgument: return f1.type
        }
    }
    
    def static ValueType getReturnTypePurePrimitive(PureFunctionDefinition pf, PureFunctionType previousFunction){
    	switch pf {
			IntToString: return FPMLFactory.eINSTANCE.createStringType()
			IntPow: return FPMLFactory.eINSTANCE.createIntegerType()
			Plus: return Others.createIntIntFuntionType()
			Minus: return Others.createIntIntFuntionType()
			Times: return Others.createIntIntFuntionType()
			Mod: return Others.createIntIntFuntionType()
			ApplyF: {
				if (previousFunction != null) {
					return previousFunction.returnType
				} else
					return null 
			}
        	default: throw new Exception("this cannot happen during the typechecking, get return type pure primitive")
    	}
    }
    
    def static ValueType getReturnTypeCompositionFunctionBodyPureFunctionDefinition(PureFunctionDefinition pf) {
		if (pf.functionBody instanceof CompositionFunctionBodyPure){
			val fcBody = (pf.functionBody as CompositionFunctionBodyPure)
			return getReturnTypeFunctionChainPure(fcBody.functionChain.map[x | Others.getFunctionDefinitionFromPureFactor(x)], pf.arg.type, Others.getFirstFunctionDefinitionFromCompositionBodyPure(fcBody))
		}
    }
	
	def static ValueType getReturnTypeFunctionChainPure(List<PureFunctionDefinition> list, ValueType argType, PureFunctionDefinition firstElement) {
		if (list.size != 0){
			if (list.size == 1)
				return getReturnValueType(list.last, getReturnValueType(firstElement, argType))
			else
				return getReturnValueType(list.last, getReturnTypeFunctionChainPure(list.tail.toList, argType, firstElement))
		} else {
			return null
		}
	}
    
    def static Type getReturnTypeCompositionBodyEffect(CompositionFunctionBodyEffect cfbe, EffectFullArgument arg) {
    	val firstElement = Others.getFirstFunctionDefinitionFromCompositionBodyEffectFull(cfbe)
    	val functionChain = cfbe.functionChain.map[x | Others.getFunctionDefinitionFromEffectFullFactor(x)]
    	return getReturnTypeFunctionChainEffect(functionChain, firstElement, arg)
    }
	
	def static Type getReturnTypeFunctionChainEffect(List<ChainElement> elements, ChainElement element, EffectFullArgument argument) {
		if (elements.size == 1)
			return getReturnType(elements.last, getReturnType(element, argument.type))
		else
			return getReturnType(elements.last, getReturnTypeFunctionChainEffect(elements.tail.toList, element, argument))
	}
    
    def static Type getReturnTypeEffectFullPrimitive(EffectFullFunctionDefinition ef, EffectFullFunctionType previousFunction){
    	switch ef {
    		PrimitivePrint: return FPMLFactory.eINSTANCE.createUnitType
    		ApplyFIO: {
				if (previousFunction != null) {
					return previousFunction.returnType
				} else 
					throw new Exception("this cannot happen during the typechecking, get return type Effectfull primitive")
			}
			default: throw new Exception("this cannot happen during the typechecking, get return type Effectfull primitive")
			
    	}
    }
    
    def static ValueType getPreviousFunctionChainElementReturnType(List<PureFunctionDefinition> elements, PureFunctionDefinition element, PureFunctionDefinition firstElement, Argument arg) {
		val functionChainToElement = elements.takeWhile[x | !EcoreUtil2.equals(element)]
		if (functionChainToElement.size == 1)
			return getReturnValueType(firstElement, arg.type)
		else 
			return getPreviousFunctionChainElementReturnType(functionChainToElement.toList, functionChainToElement.last, firstElement, arg)
		}
}