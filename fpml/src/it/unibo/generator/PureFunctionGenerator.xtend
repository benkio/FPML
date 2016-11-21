package it.unibo.generator

import it.unibo.fPML.PureFunctionBlock
import it.unibo.fPML.EmptyFunctionBody
import it.unibo.fPML.CompositionFunctionBodyPure
import it.unibo.fPML.PureFunctionDefinition
import it.unibo.fPML.Value
import it.unibo.fPML.IntToString
import it.unibo.fPML.IntPow
import it.unibo.fPML.FPMLFactory
import it.unibo.fPML.FunctionBodyPure
import it.unibo.validation.utilitiesFunctions.Others

class PureFunctionGenerator {
	
	val typeGenerator = new TypeGenerator
	
	def compile(PureFunctionBlock pfb) '''
		package «FPMLGenerator.basePackageJava»Pure;
		
		import «FPMLGenerator.basePackageJava»Pure.Data.*;
		
		public class PureFunctionDefinitions {
			«FOR f:pfb.features»
				«f.compile»
			«ENDFOR»	
		}
	'''

	def compile(PureFunctionDefinition pf) '''

		public static «typeGenerator.compile(pf.returnType)» «pf.name» («typeGenerator.compile(pf.arg)»){
			«compile(pf.functionBody, pf.arg.name, false)»
		}'''

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
			PureFunctionDefinition: result = compileCall(initialElement, argName, outsideCalls)
			Value: result = "Value." + (initialElement as Value).name + "()"
		}
		for (f : cfbp.functionChain){
			result = compileCall( Others.getFunctionDefinitionFromPureFactor(f), result, outsideCalls)
		}
		return result
	} 
	
	def String compileCall(PureFunctionDefinition pf, String args, boolean outsideCalls) {
		if (pf.name == null ) return compilePrimitiveCall(pf, args, outsideCalls)
		if (!outsideCalls)
			return pf.name + "(" + args + ")"
		else 
			return "PureFunctionDefinitions." + pf.name + "(" + args + ")"
	}
	
	def compilePrimitiveCall(PureFunctionDefinition purePrimitive, String argName, boolean outsideCalls){
		switch purePrimitive {
			IntToString: {
				val f = FPMLFactory.eINSTANCE.createPureFunctionDefinition()
				f.name = "Integer.toString"
				return compileCall(f, argName, outsideCalls)
			}
      		IntPow: {
				val f = FPMLFactory.eINSTANCE.createPureFunctionDefinition()
				f.name = "(int) Math.pow"
				return compileCall(f, argName + ", 2", outsideCalls)
			}
		}
	}
}