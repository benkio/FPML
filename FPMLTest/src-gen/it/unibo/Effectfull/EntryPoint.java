package it.unibo.Effectfull;

import it.unibo.Pure.Data.*;
import fj.data.*;
import java.io.IOException;
import fj.*;
import it.unibo.Effectfull.Data.*;
import it.unibo.Pure.*;

public class EntryPoint {
	public static void main(String[] args){
		IOW.lift(IOFunctions.ioUnit).append(IOFunctions.unit(PureValue.WelcomeMessage()))
			.bind(PrimitivesEffectFull::primitivePrint)
			.append(IOFunctions.unit(PureValue.AskMessage()))
			.bind(PrimitivesEffectFull::primitivePrint)
			.append(PrimitivesEffectFull.getLineStdIn())
			.bind(EffectFullFunctionDefinitions::DecideSumProd)
		.safe().run().on((IOException e) -> { e.printStackTrace(); return Unit.unit(); });
	}
}