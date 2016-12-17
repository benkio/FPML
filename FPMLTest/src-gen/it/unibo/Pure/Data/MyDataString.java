package it.unibo.Pure.Data;

import fj.data.*;
import fj.*;
import it.unibo.Pure.Data.*;

public class MyDataString implements IPureData<String> {
	private final String value;
	
	public MyDataString(String value){
		this.value = value;
	}
	
	public String getValue() {
		return value;
	}
}