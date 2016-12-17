package it.unibo.Pure.Data;

import fj.data.*;
import fj.*;
import it.unibo.Pure.Data.*;

public class MyDataRef implements IPureData<MyData> {
	private final MyData value;
	
	public MyDataRef(MyData value){
		this.value = value;
	}
	
	public MyData getValue() {
		return value;
	}
}