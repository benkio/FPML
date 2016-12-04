package it.unibo.generator

class PrimitiveGenerator {
		
	def compilePure() '''
		package «FPMLGenerator.basePackageJava»Pure;
		
		import fj.*;
		import fj.data.*;
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
		
			public static <A,B> A leftPair(P2<A,B> pair){
				return pair._1();
			}
		
			public static <A,B> B rightPair(P2<A,B> pair){
				return pair._2();
			}
		}
	'''
	
	def compileEffectFull() '''
			package «FPMLGenerator.basePackageJava»Effectfull;
			
			import fj.*;
			import fj.data.*;
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
			
				public static <A,B> A leftPairIO(P2<A,B> pair){
					return pair._1();
				}
			
				public static <A,B> B rightPairIO(P2<A,B> pair){
					return pair._2();
				}
			}
	'''
}