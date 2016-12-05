package it.unibo.generator

import it.unibo.fPML.PureFunctionBlock
import it.unibo.fPML.EmptyFunctionBody
import it.unibo.fPML.CompositionFunctionBodyPure
import it.unibo.fPML.PureFunctionDefinition
import it.unibo.fPML.IntToString
import it.unibo.fPML.IntPow
import it.unibo.fPML.FPMLFactory
import it.unibo.fPML.FunctionBodyPure
import it.unibo.validation.utilitiesFunctions.Others
import it.unibo.fPML.Plus
import it.unibo.fPML.Minus
import it.unibo.fPML.Times
import it.unibo.fPML.Mod
import it.unibo.fPML.ApplyF
import it.unibo.fPML.PureLambda
import it.unibo.fPML.PrimitivePureFunction
import it.unibo.fPML.PureFunction
import it.unibo.fPML.Argument
import it.unibo.fPML.PureValue
import it.unibo.fPML.PureFunctionType
import it.unibo.fPML.ApplyFFactor
import it.unibo.fPML.LeftPair
import it.unibo.fPML.RightPair

class PureFunctionGenerator {
	
	val typeGenerator = new TypeGenerator
	
	def compile(PureFunctionBlock pfb) '''
		package «FPMLGenerator.basePackageJava»Pure;
		
		import «FPMLGenerator.basePackageJava»Pure.Data.*;
		import fj.*;
		import fj.data.*;
		
		public class PureFunctionDefinitions {
			«FOR f:pfb.features»
				«f.compile»
			«ENDFOR»	
		}
	'''

	def compile(PureFunctionDefinition pf) {
		if (!(pf instanceof PureValue) && !(pf instanceof PureLambda)) 
		return '''

		public static «typeGenerator.compile(pf.returnType)» «pf.name» («typeGenerator.compile(pf.arg)» ){
			« if (pf.higherOrderArg != null) "return (" + typeGenerator.compile(pf.higherOrderArg.arg2) +") -> {" »
			«compile(pf.functionBody, pf.arg.name, false)»
			« if (pf.higherOrderArg != null) "};"»
		}'''
	}

	def compile(FunctionBodyPure fbp, String arg, boolean outsideCalls){
		if (fbp instanceof EmptyFunctionBody)
			return '''throw new UnsupportedOperationException("TODO");'''
		else if (fbp instanceof CompositionFunctionBodyPure)
			return 'return ' + compileCompositionFunctionBodyPure((fbp as CompositionFunctionBodyPure), arg, outsideCalls) + ';'
	}

	def String compileCompositionFunctionBodyPure(CompositionFunctionBodyPure cfbp, String argName, boolean outsideCalls) {
		var result = argName
		val initialElement = Others.getFirstFunctionDefinitionFromCompositionBodyPure(cfbp)
		switch initialElement {
			PureValue: result = "PureValue." + (initialElement as PureValue).name + "()"
			PureLambda: result = "(" + typeGenerator.compile(initialElement.arg) + ") -> " + initialElement.functionBody.compile(argName,outsideCalls)
			PrimitivePureFunction: result = compilePrimitiveCall(initialElement, argName, argName, outsideCalls)
			PureFunctionDefinition: result = compileCall(initialElement, argName, argName, outsideCalls)
		}
		for (f : cfbp.functionChain){
			result = compileCall( Others.getFunctionDefinitionFromPureFactor(f), result, argName , outsideCalls)
		}
		return result
	} 
	
	def String compileCall(PureFunction pf, String acc, String argName, boolean outsideCalls) {
		switch pf {
			PureValue: return "PureValue." + (pf as PureValue).name + "()"
			PureLambda: return "(" + typeGenerator.compile(pf.higherOrderArg.arg2) + ") -> " + pf.functionBody.compile(argName,outsideCalls)
			PrimitivePureFunction: return compilePrimitiveCall(pf, acc, argName, outsideCalls)
			PureFunctionDefinition: {
				if (!outsideCalls)
					return pf.name + "(" + acc + ")"
				else 
					return "PureFunctionDefinitions." + pf.name + "(" + acc + ")"	
			}
		}
	}
	
	def compilePrimitiveCall(PrimitivePureFunction purePrimitive, String acc, String argName , boolean outsideCalls){
		switch purePrimitive {
			IntToString: "Primitives.intToString(" + acc + ")"
      		IntPow: "Primitives.intPow(" + acc + ")"
			Plus: "Primitives.plus(" + acc + ")"
			Minus: "Primitives.minus(" + acc + ")"
			Times: "Primitives.times(" + acc + ")"
			Mod: "Primitives.mod(" + acc + ")"
      		LeftPair: "Primitives.leftPair(" + acc + ")"
      		RightPair: "Primitives.rightPair(" + acc + ")"
			ApplyF: acc + ".f(" + compileApplyFFactor(purePrimitive.value, argName, outsideCalls) + ")"		
		}
	}
	
	def String compileApplyFFactor(ApplyFFactor r,  String argName, boolean outsideCalls) {
		switch r.valueReference {
			PureValue: return compileCall(r.valueReference as PureValue, argName, argName, outsideCalls)
			Argument: return (r.valueReference as Argument).name
			default: {
				if (r.valueLambda.arg != null) {
					return '''( «typeGenerator.compile(r.valueLambda.arg.type)» «r.valueLambda.arg.name» ) -> «r.valueLambda.functionBody.compile(argName, outsideCalls)»'''
				} else {
					return (r.valueLambda.functionBody as CompositionFunctionBodyPure).compileCompositionFunctionBodyPure(argName, outsideCalls)
				}
			}
		}
	}
}