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

class PureFunctionGenerator {
	
	val typeGenerator = new TypeGenerator
	
	def compile(PureFunctionBlock pfb) '''
		package «FPMLGenerator.basePackageJava»Pure;
		
		import «FPMLGenerator.basePackageJava»Pure.Data.*;
		import fj.F;
		
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
			return 'return ' + compile((fbp as CompositionFunctionBodyPure), arg, outsideCalls) + ';'
	}

	def compile(CompositionFunctionBodyPure cfbp, String argName, boolean outsideCalls) {
		var result = ""
		val initialElement = Others.getFirstFunctionDefinitionFromCompositionBodyPure(cfbp)
		switch initialElement {
			PureValue: result = "Value." + (initialElement as PureValue).name + "()"
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
			PureValue: return "Value." + (pf as PureValue).name + "()"
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
			ApplyF: argName + ".f(" + compile((purePrimitive as ApplyF).value, argName, outsideCalls) + ")"
		}
	}
	
	def compile(PureReference r,  String argName, boolean outsideCalls) {
		switch r {
			PureValue: return compileCall(r ,argName, outsideCalls)
			Argument: return r.name
		}
	}
}