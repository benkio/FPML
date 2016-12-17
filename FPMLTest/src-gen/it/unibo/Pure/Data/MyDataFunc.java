package it.unibo.Pure.Data;

import fj.data.*;
import fj.*;
import it.unibo.Pure.Data.*;

public class MyDataFunc implements IPureData<F0<F<Integer,Integer>>> {
	private final F0<F<Integer,Integer>> value;
	
	public MyDataFunc(F0<F<Integer,Integer>> value){
		this.value = value;
	}
	
	public F0<F<Integer,Integer>> getValue() {
		return value;
	}
}