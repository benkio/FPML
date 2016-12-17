package it.unibo.Effectfull.Data;

import fj.data.*;
import fj.*;
import it.unibo.Pure.Data.*;

public class MyDataIOFunc implements IEffectFullData<F0<IO<F<Integer, IO<String>>>>> {
	private final F0<IO<F<Integer, IO<String>>>> value;
	
	public MyDataIOFunc(F0<IO<F<Integer, IO<String>>>> value){
		this.value = value;
	}
	
	public F0<IO<F<Integer, IO<String>>>> getValue() {
		return value;
	}
}