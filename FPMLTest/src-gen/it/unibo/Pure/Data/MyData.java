package it.unibo.Pure.Data;

import fj.data.*;
import fj.*;
import it.unibo.Pure.Data.*;

public class MyData implements IPureData<Integer> {
	private final Integer value;
	
	public MyData(Integer value){
		this.value = value;
	}
	
	public Integer getValue() {
		return value;
	}
}