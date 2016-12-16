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
import it.unibo.fPML.CompositionFunctionBodyEffect
import it.unibo.fPML.Expression

class PureFunctionGenerator {
	
	val typeGenerator = new TypeGenerator
	val commonFunctions = new ValuePureFunctionCommonGenerator
	
	def compile(PureFunctionBlock pfb) '''
		package «FPMLGenerator.basePackageJava»Pure;
		
		import «FPMLGenerator.basePackageJava»Pure.Data.*;
		import fj.*;
		import fj.data.*;
		
		public class PureFunctionDefinitions {
			«IF (pfb != null && pfb.features != null)»
				«FOR f:pfb.features»
					«f.compile»
				«ENDFOR»
			«ENDIF»	
		}
	'''

	def compile(PureFunctionDefinition pf) {
		if (!(pf instanceof PureValue) && !(pf instanceof PureLambda)) 
		return '''

		public static «typeGenerator.compile(pf.returnType)» «pf.name» («typeGenerator.compile(pf.arg)» ){
			« if (pf.higherOrderArg != null) "return (" + typeGenerator.compile(pf.higherOrderArg.arg2) +") -> {" »
			return « commonFunctions.compile(pf.functionBody, pf.arg.name, false)»;
			«if (pf.higherOrderArg != null) "};"»
		}'''
	}
	

}