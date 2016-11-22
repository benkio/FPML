package it.unibo.generator

class PrimitiveGenerator {
		
	def compile() '''
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
		}
	'''
}