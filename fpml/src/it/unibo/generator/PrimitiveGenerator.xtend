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

			public static F<String, String> plus(String x) {
				return (String y) -> x + y;
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
		
			public static String boolToString(Boolean x) {
				return String.valueOf(x);
			}
			
			public static <A,B> A leftAlgebraic(P2<A,B> pair){
				return pair._1();
			}
		
			public static <A,B> B rightAlgebraic(P2<A,B> pair){
				return pair._2();
			}
			
			public static <A,B> A leftAlgebraic(Either<A,B> pair){
				return pair.left().value();
			}
		
			public static <A,B> B rightAlgebraic(Either<A,B> pair){
				return pair.right().value();
			}
			
			public static <A,B> Boolean isLeft(Either<A,B> pair) {
				return pair.isLeft();
			}
			
			public static <A,B> Boolean isRight(Either<A,B> pair) {
				return pair.isRight();
			}
			
			public static <A> F<A, Boolean> equalsCurrying(A x){
				return (A y) -> x == y;
			}
			
			public static F<String, Boolean> equalsCurrying(String x){
				return (String y) -> x.equals(y);
			}
			
			public static F<Integer, Boolean> minorEquals(Integer x) {
				return (Integer y) -> x <= y;
			}
			
			public static F<Integer, Boolean> majorEquals(Integer x) {
				return (Integer y) -> x >= y;
			}
			
			public static F<Integer, Boolean> minor(Integer x) {
				return (Integer y) -> x < y;
			}
			
			public static F<Integer, Boolean> major(Integer x) {
				return (Integer y) -> x > y;
			}
			
			public static F<Boolean, Boolean> logicAnd(Boolean b) {
				return (Boolean c) -> b && c;
			}
			
			public static F<Boolean, Boolean> logicOr(Boolean b) {
				return (Boolean c) -> b || c;
			}

			public static Boolean logicNot(Boolean b) {
				return !b;
			}
			
			public static <A> A pureIf(Boolean condition, A thenExpression, A elseExpression) {
				if (condition) {
					return thenExpression;
				} else {
					return elseExpression;
				}
			}
			
			public static <A,B> Either<A,B> pureIfEither(Boolean condition, A thenExpression, B elseExpression) {
				if (condition) {
					return Either.left(thenExpression);
				} else {
					return Either.right(elseExpression);
				}
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
			import java.util.Scanner;
			
			public class PrimitivesEffectFull {
				
				private final static Scanner scanner = new Scanner(System.in);
				
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
			
				public static <A,B> A leftAlgebraicIO(P2<A,B> pair){
					return pair._1();
				}
			
				public static <A,B> B rightAlgebraicIO(P2<A,B> pair){
					return pair._2();
				}
				
				public static <A,B> A leftAlgebraicIO(Either<A,B> pair){
					return pair.left().value();
				}
			
				public static <A,B> B rightAlgebraicIO(Either<A,B> pair){
					return pair.right().value();
				}
				
				public static <A,B> Boolean isLeft(Either<A,B> pair) {
					return pair.isLeft();
				}

				public static <A,B> Boolean isRight(Either<A,B> pair) {
					return pair.isRight();
				}
				
				public static <A> A effectFullIf(Boolean condition, A thenExpression, A elseExpression) {
					if (condition) {
						return thenExpression;
					} else {
						return elseExpression;
					}
				}
				
				public static <A,B> Either<A,B> effectFullIfEither(Boolean condition, A thenExpression, B elseExpression) {
					if (condition) {
						return Either.left(thenExpression);
					} else {
						return Either.right(elseExpression);
					}
				}
				
				public static IO<String> getLineStdIn() {
					return () -> scanner.next();
				}
				
				public static IO<Integer> getIntStdIn() {
					return () -> scanner.nextInt();
				}
			}
	'''
}