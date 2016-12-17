package it.unibo.Pure;

import it.unibo.Pure.Data.*;
import fj.*;
import fj.data.*;

public class PureFunctionDefinitions {
	
	public static Integer Summation (Integer n ){
		return Primitives.<F0<Integer>>pureIf(Primitives.equalsCurrying(n).f(1) , new F0<Integer>() {
				@Override
				public Integer f() {
					return 1;
				}
			}
													   , new F0<Integer>() {
													   		@Override
													   		public Integer f() {
													   			return Primitives.plus(n).f(new F0<Integer>() {
													   					@Override
													   					public Integer f() {
													   						return PureFunctionDefinitions.Summation(Primitives.minus(n).f(1));
													   					}
													   				}.f()
													   			);
													   		}
													   	}
													   ).f();
	}
	
	public static Integer Product (Integer n ){
		return Primitives.<F0<Integer>>pureIf(Primitives.equalsCurrying(n).f(1) , new F0<Integer>() {
				@Override
				public Integer f() {
					return 1;
				}
			}
													   , new F0<Integer>() {
													   		@Override
													   		public Integer f() {
													   			return Primitives.times(n).f(new F0<Integer>() {
													   					@Override
													   					public Integer f() {
													   						return PureFunctionDefinitions.Product(Primitives.minus(n).f(1));
													   					}
													   				}.f()
													   			);
													   		}
													   	}
													   ).f();
	}
}
