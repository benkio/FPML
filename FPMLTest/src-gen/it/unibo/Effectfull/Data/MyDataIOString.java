package it.unibo.Effectfull.Data;

import fj.data.*;
import fj.*;
import it.unibo.Pure.Data.*;

public class MyDataIOString implements IEffectFullData<IO<String>> {
	private final IO<String> value;
	
	public MyDataIOString(IO<String> value){
		this.value = value;
	}
	
	public IO<String> getValue() {
		return value;
	}
}