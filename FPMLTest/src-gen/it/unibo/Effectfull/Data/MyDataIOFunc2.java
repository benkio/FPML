package it.unibo.Effectfull.Data;

import fj.data.*;
import fj.*;
import it.unibo.Pure.Data.*;

public class MyDataIOFunc2 implements IEffectFullData<IO<F0<F<MyPair,Integer>>>> {
	private final IO<F0<F<MyPair,Integer>>> value;
	
	public MyDataIOFunc2(IO<F0<F<MyPair,Integer>>> value){
		this.value = value;
	}
	
	public IO<F0<F<MyPair,Integer>>> getValue() {
		return value;
	}
}