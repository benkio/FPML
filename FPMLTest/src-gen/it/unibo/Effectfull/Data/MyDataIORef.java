package it.unibo.Effectfull.Data;

import fj.data.*;
import fj.*;
import it.unibo.Pure.Data.*;

public class MyDataIORef implements IEffectFullData<IO<MyDataIO>> {
	private final IO<MyDataIO> value;
	
	public MyDataIORef(IO<MyDataIO> value){
		this.value = value;
	}
	
	public IO<MyDataIO> getValue() {
		return value;
	}
}