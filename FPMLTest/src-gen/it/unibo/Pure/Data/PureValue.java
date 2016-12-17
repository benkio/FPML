package it.unibo.Pure.Data;

import it.unibo.Pure.Data.*;
import fj.data.*;
import fj.*;
import it.unibo.Pure.Primitives;
import it.unibo.Pure.PureFunctionDefinitions;

public class PureValue{
	
	public static String WelcomeMessage() {
		return "----------Summation or Product From 1 to n --------------";
	}
	
	public static String AskMessage() {
		return "Do you want to compute Sum or Prod? (s or p, anykey to exit)";
	}
	
	public static String AskNMessage() {
		return "Insert the n:";
	}
	
	public static String ResultMessage() {
		return "The result from 1 to n is: ";
	}
	
	public static String ExitMessage() {
		return "Exit";
	}
}