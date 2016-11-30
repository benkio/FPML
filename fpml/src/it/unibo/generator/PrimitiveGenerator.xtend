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
			import java.util.Random;
			import java.text.SimpleDateFormat;
			import java.util.Date;
			
			public class PrimitivesEffectFull {
				
				public static IO<Unit> primitivePrint(String s) {
					return IOFunctions.stdoutPrintln(s);
				} 
				
				public static IO<Integer> primitiveRandom() {
					return () -> new Random().nextInt();
				}
							
				public static IO<String> primitiveTime() {
					return IOFunctions.unit(new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(new Date()));
				}
				
				public static <A> IO<A> primitiveReturn(A x) {
					return IOFunctions.unit(x);
				}
			}
	'''
}