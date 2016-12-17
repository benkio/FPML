package it.unibo.Effectfull.Data;

import fj.data.*;
import fj.*;
import it.unibo.Pure.Data.*;

public class MyDataIO implements IEffectFullData<IO<Integer>> {
	private final IO<Integer> value;
	
	public MyDataIO(IO<Integer> value){
		this.value = value;
	}
	
	public IO<Integer> getValue() {
		return value;
	}
}