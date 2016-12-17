package it.unibo.Pure.Data;

import fj.data.*;
import fj.*;
import it.unibo.Pure.Data.*;

public class MyDataProd implements IPureData<P2<MyDataString, Integer>> {
	private final P2<MyDataString, Integer> value;
	
	public MyDataProd(P2<MyDataString, Integer> value){
		this.value = value;
	}
	
	public P2<MyDataString, Integer> getValue() {
		return value;
	}
}