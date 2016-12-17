package it.unibo.Effectfull;

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
