package it.unibo.generator

class DataInterfaceGenerator {
	
	def String compileEffectFullInterface() '''
	    package «FPMLGenerator.basePackageJava»Effectfull.Data;
	    
	    import «FPMLGenerator.basePackageJava»Pure.Data.*;
	    import fj.data.*;
	    import fj.*;
	    import it.unibo.Pure.Primitives;
	    import it.unibo.Pure.PureFunctionDefinitions;
	    
	    public interface IEffectFullData<A> {
	    	A getValue();
	    }
	    '''
	
	def String compilePureInterface() '''
	    package «FPMLGenerator.basePackageJava»Pure.Data;
	    
	    import «FPMLGenerator.basePackageJava»Pure.Data.*;
	    import fj.data.*;
	    import fj.*;
	    import it.unibo.Pure.Primitives;
	    import it.unibo.Pure.PureFunctionDefinitions;
	    
	    public interface IPureData<A> {
	    	A getValue();
	    }
	    '''
	
}