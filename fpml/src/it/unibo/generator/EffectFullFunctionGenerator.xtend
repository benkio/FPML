package it.unibo.generator

import it.unibo.fPML.EffectFullBlock
import it.unibo.fPML.EffectFullFunctionDefinition
import it.unibo.fPML.EmptyFunctionBody
import it.unibo.fPML.CompositionFunctionBodyEffect
import it.unibo.fPML.ChainElement
import org.eclipse.xtext.xbase.lib.Functions.Function2
import it.unibo.fPML.PureFunctionDefinition
import it.unibo.fPML.Value
import it.unibo.fPML.CompositionFunctionBodyEffectFullFactor
import it.unibo.validation.UtilitiesFunctions
import it.unibo.fPML.IntToString
import it.unibo.fPML.PrimitivePrint
import it.unibo.fPML.MainFunc
import it.unibo.fPML.FPMLFactory

class EffectFullFunctionGenerator {
	
	val typeGenerator = new TypeGenerator
	
	def compile(EffectFullBlock efb) '''
	    package «FPMLGenerator.basePackageJava»Effectfull;
	    		
	    import «FPMLGenerator.basePackageJava»Pure.Data.*;
	    import fj.data.*;
	    import «FPMLGenerator.basePackageJava»Pure.*;
	    
	    public class EffectFullFunctionDefinitions {
	    	«FOR f:efb.features»
	    		«f.compile»
	    	«ENDFOR»
	    }'''
	    
	def compile(EffectFullFunctionDefinition pf) {
		if (pf.name != "main") {
			return '''
			public static «typeGenerator.compile(pf.returnType)» «pf.name» («typeGenerator.compile(pf.arg)»){
				«IF pf.functionBody instanceof EmptyFunctionBody»
				throw new UnsupportedOperationException("TODO");
				«ELSEIF pf.functionBody instanceof CompositionFunctionBodyEffect»
				IOW.append(IOFunctions.unit(«pf.arg.name»))«(pf.functionBody as CompositionFunctionBodyEffect).compile»;
				«ENDIF»
			}'''
		}else {
			return '''
			public static void «pf.name»(){
				«IF pf.functionBody instanceof EmptyFunctionBody»
				throw new UnsupportedOperationException("TODO");
				«ELSEIF pf.functionBody instanceof CompositionFunctionBodyEffect»
				IOW«(pf.functionBody as CompositionFunctionBodyEffect).compile»
				«ENDIF»
				.safe().run().on((IOException e) -> { e.printStackTrace(); return Unit.unit(); });
			}'''
		}
	}

	def compile(CompositionFunctionBodyEffect cfbe) '''
		«val firstElementCompiled = UtilitiesFunctions.getFirstFunctionDefinitionFromCompositionBodyEffectFull(cfbe).compile»
		«val Function2<String, CompositionFunctionBodyEffectFullFactor, String>  f = [String acc, CompositionFunctionBodyEffectFullFactor x | acc + x.compile + "\n\t"]»
		«cfbe.functionChain.fold(firstElementCompiled + "\n\t", f) »'''
	
	def compile(CompositionFunctionBodyEffectFullFactor f) {
		val e = UtilitiesFunctions.getFunctionDefinitionFromEffectFullFactor(f)
		return e.compile	
	}	
	
	def compile(ChainElement e){
		switch e {
			IntToString: return '''.map(Integer.toString)'''
			PrimitivePrint: return '''.bind(IOFunctions.stdoutPrint)'''
			PureFunctionDefinition: return '''.map(PureFunctionDefinitions::«(e as PureFunctionDefinition).name»)'''
			Value: return '''.append(IOFunctions.unit(Value.«(e as Value).name»()))'''
			EffectFullFunctionDefinition: return '''.bind(EffectFullFunctionDefinitions::«(e as EffectFullFunctionDefinition).name»)''' 
		}
	}
	
	def compile(MainFunc mf)'''
		package «FPMLGenerator.basePackageJava»Effectfull;
		
		import «FPMLGenerator.basePackageJava»Pure.Data.*;
		import fj.data.*;
		import «FPMLGenerator.basePackageJava»Pure.*;
		
		public class EntryPoint {
			«compileMain(mf)»
		}'''
	
	def compileMain(MainFunc mf){
		val effectFullMainReturnType = FPMLFactory.eINSTANCE.createIOType()
		effectFullMainReturnType.type = FPMLFactory.eINSTANCE.createUnitType()
		val effectFullMain = FPMLFactory.eINSTANCE.createEffectFullFunctionDefinition()
		effectFullMain.functionBody = mf.functionBody
		effectFullMain.returnType = effectFullMainReturnType
		effectFullMain.name = "main"
		effectFullMain.compile
	}
}