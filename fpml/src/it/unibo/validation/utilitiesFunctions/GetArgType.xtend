package it.unibo.validation.utilitiesFunctions

import it.unibo.fPML.*
import it.unibo.validation.FPMLValidator
import org.eclipse.emf.ecore.EReference
import java.util.List
import org.eclipse.xtext.EcoreUtil2

class GetArgType {
		
	def static pureFunction(PureFunction f) {
		switch f {
			PureFunctionDefinition: pureFunctionDefinition(f) 
			PrimitivePureFunction: primitivePureFuction(f)
		}
	}
	
	def static primitivePureFunction(PrimitivePureFunction f) {
		switch f {
			IntToString: return FPMLFactory.eINSTANCE.createIntegerType
			IntPow: return FPMLFactory.eINSTANCE.createIntegerType
			Plus: return FPMLFactory.eINSTANCE.createIntegerType
			Minus: return FPMLFactory.eINSTANCE.createIntegerType
			Times: return FPMLFactory.eINSTANCE.createIntegerType
			Mod: return FPMLFactory.eINSTANCE.createIntegerType
			ApplyF:
		}
	}
	
	def static pureFunctionDefinition(PureFunctionDefinition f) {
		
	}
}