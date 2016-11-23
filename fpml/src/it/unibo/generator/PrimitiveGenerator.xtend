package it.unibo.generator

class PrimitiveGenerator {
		
	def compilePure() '''
		package «FPMLGenerator.basePackageJava»Pure;
	
		import fj.F;
	
		public class Primitives {
			
			public static F<Integer, Integer> plus(int x) {
				return (Integer y) -> x + y;
			}
			
			public static F<Integer, Integer> minus(int x) {
				return (Integer y) -> x - y;
			}
			
			public static F<Integer, Integer> times(int x) {
				return (Integer y) -> x * y;
			}
			
			public static F<Integer, Integer> mod(int x) {
				return (Integer y) -> x % y;
			}
			
			public static Integer intPow(Integer x) {
				return x * x;
			}
			
			public static String intToString(Integer x) {
				return String.valueOf(x);
			}
		}
	'''
	
	def compileEffectFull() '''
			package «FPMLGenerator.basePackageJava»Effectfull;
			
			import fj.F;
			import fj.Unit;
			import fj.data.IO;
			import fj.data.IOFunctions;
			
			public class PrimitivesEffectFull {
				
				public static IO<Unit> primitivePrint(String s) {
					return IOFunctions.stdoutPrint(s);
				} 
				
				public static IO<Integer> primitiveRandom() {
					return () -> (int) Math.random();
				}
				
			//	public static <B, A> IO<B> applyFIO(F<A,B> f){
			//		return (A val) -> IOFunctions.unit(f.f(val));
			//	}
			}
	'''
}