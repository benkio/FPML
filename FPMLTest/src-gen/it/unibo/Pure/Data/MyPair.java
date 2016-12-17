package it.unibo.Pure.Data;

import fj.data.*;
import fj.*;
import it.unibo.Pure.Data.*;

public class MyPair implements IPureData<P2<Integer, Integer>> {
	private final P2<Integer, Integer> value;
	
	public MyPair(P2<Integer, Integer> value){
		this.value = value;
	}
	
	public P2<Integer, Integer> getValue() {
		return value;
	}
}