package it.unibo.Effectfull.Data;

import fj.data.*;
import fj.*;
import it.unibo.Pure.Data.*;

public class MyDataIOProd implements IEffectFullData<Either<IO<Integer>, IO<Integer>>> {
	private final Either<IO<Integer>, IO<Integer>> value;
	
	public MyDataIOProd(Either<IO<Integer>, IO<Integer>> value){
		this.value = value;
	}
	
	public Either<IO<Integer>, IO<Integer>> getValue() {
		return value;
	}
}