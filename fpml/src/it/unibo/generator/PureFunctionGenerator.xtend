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
import it.unibo.fPML.PureReference
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
		var result = ""
		val initialElement = Others.getFirstFunctionDefinitionFromCompositionBodyPure(cfbp)
		switch initialElement {
			PureValue: result = "PureValue." + (initialElement as PureValue).name + "()"
			PureLambda: result = "(" + typeGenerator.compile(initialElement.arg) + ") -> " + initialElement.functionBody.compile(argName,outsideCalls)
			PrimitivePureFunction: result = compilePrimitiveCall(initialElement, argName, outsideCalls)
			PureFunctionDefinition: result = compileCall(initialElement, argName, outsideCalls)
		}
		for (f : cfbp.functionChain){
			result = compileCall( Others.getFunctionDefinitionFromPureFactor(f), result, outsideCalls)
		}
		return result
	} 
	
	def String compileCall(PureFunction pf, String args, boolean outsideCalls) {
		switch pf {
			PureValue: return "PureValue." + (pf as PureValue).name + "()"
			PureLambda: return "(" + typeGenerator.compile(pf.higherOrderArg.arg2) + ") -> " + pf.functionBody.compile(args,outsideCalls)
			PrimitivePureFunction: return compilePrimitiveCall(pf, args, outsideCalls)
			PureFunctionDefinition: {
				if (!outsideCalls)
					return pf.name + "(" + args + ")"
				else 
					return "PureFunctionDefinitions." + pf.name + "(" + args + ")"	
			}
		}
	}
	
	def compilePrimitiveCall(PrimitivePureFunction purePrimitive, String argName, boolean outsideCalls){
		switch purePrimitive {
			IntToString: "Primitives.intToString(" + argName + ")"
      		IntPow: "Primitives.intPow(" + argName + ")"
			Plus: "Primitives.plus(" + argName + ")"
			Minus: "Primitives.minus(" + argName + ")"
			Times: "Primitives.times(" + argName + ")"
			Mod: "Primitives.mod(" + argName + ")"
      		LeftPair: "Primitives.leftPair(" + argName + ")"
      		RightPair: "Primitives.rightPair(" + argName + ")"
			ApplyF: argName + ".f(" + compileApplyFFactor(purePrimitive.value, argName, outsideCalls) + ")"		
		}
	}
	
	def String compileApplyFFactor(ApplyFFactor r,  String argName, boolean outsideCalls) {
		switch r.valueReference {
			PureValue: return compileCall(r.valueReference as PureValue ,argName, outsideCalls)
			Argument: return r.valueReference.name
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