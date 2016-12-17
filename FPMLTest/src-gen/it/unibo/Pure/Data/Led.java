package it.unibo.Pure.Data;

import fj.data.*;
import fj.*;
import it.unibo.Pure.Data.*;

public class Led implements IPureData<P2<Boolean, String>> {
	private final P2<Boolean, String> value;
	
	public Led(P2<Boolean, String> value){
		this.value = value;
	}
	
	public P2<Boolean, String> getValue() {
		return value;
	}
}