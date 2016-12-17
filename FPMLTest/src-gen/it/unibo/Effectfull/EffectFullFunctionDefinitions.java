package it.unibo.Effectfull;
		
import it.unibo.Pure.Data.*;
import fj.data.*;
import fj.*;
import it.unibo.Effectfull.Data.*;
import it.unibo.Pure.*;

public class EffectFullFunctionDefinitions {
	public static IO<Integer> printResultMessageAndPass (Integer result){
		return IOFunctions.left(IOFunctions.unit(result),IOFunctions.bind(IOFunctions.left(IOFunctions.unit(PureValue.ResultMessage()),IOFunctions.unit(result))
			, PrimitivesEffectFull::primitivePrint)
			);
	}
	public static IO<Unit> printResult (Integer result){
		return IOFunctions.bind(IOFunctions.map(IOFunctions.bind(IOFunctions.unit(result), EffectFullFunctionDefinitions::printResultMessageAndPass)
			 ,Primitives::intToString)
			, PrimitivesEffectFull::primitivePrint);
	}
	public static IO<Integer> SummationIO (Unit u){
		return IOFunctions.map(IOFunctions.append(IOFunctions.bind(IOFunctions.left(IOFunctions.unit(PureValue.AskNMessage()),IOFunctions.unit(u))
			, PrimitivesEffectFull::primitivePrint)
			, PrimitivesEffectFull.getIntStdIn())
			, PureFunctionDefinitions::Summation);
	}
	public static IO<Integer> ProductIO (Unit u){
		return IOFunctions.map(IOFunctions.append(IOFunctions.bind(IOFunctions.left(IOFunctions.unit(PureValue.AskNMessage()),IOFunctions.unit(u))
			, PrimitivesEffectFull::primitivePrint)
			, PrimitivesEffectFull.getIntStdIn())
			, PureFunctionDefinitions::Product);
	}
	public static IO<Unit> DecideSumProd (String decision){
		return IOFunctions.bind(IOFunctions.bind(IOFunctions.unit(IOFunctions.runSafe(IOFunctions.map(IOFunctions.unit(decision), Primitives::equalsCurrying)
			).f("s"))
			, (Boolean c) ->  IOFunctions.unit(PrimitivesEffectFull.<F0<IO<Unit>>>effectFullIf(c, new F0<IO<Unit>>() {
					@Override
					public IO<Unit> f() {
						return IOFunctions.bind(IOFunctions.bind(IOFunctions.unit(Unit.unit())
							,ignored -> EffectFullFunctionDefinitions.SummationIO(Unit.unit()))
							, EffectFullFunctionDefinitions::printResult);
					}
			}
		 , new F0<IO<Unit>>() {
					@Override
					public IO<Unit> f() {
						return IOFunctions.bind(IOFunctions.bind(IOFunctions.unit(IOFunctions.runSafe(IOFunctions.map(IOFunctions.unit(decision)
							, Primitives::equalsCurrying)
							).f("p"))
							, (Boolean c) ->  IOFunctions.unit(PrimitivesEffectFull.<F0<IO<Unit>>>effectFullIf(c, new F0<IO<Unit>>() {
									@Override
									public IO<Unit> f() {
										return IOFunctions.bind(IOFunctions.bind(IOFunctions.ioUnit,ignored -> EffectFullFunctionDefinitions.ProductIO(Unit.unit()))
											, EffectFullFunctionDefinitions::printResult);
									}
							}
						 , new F0<IO<Unit>>() {
									@Override
									public IO<Unit> f() {
										return IOFunctions.bind(IOFunctions.unit(PureValue.ExitMessage())
											, PrimitivesEffectFull::primitivePrint);
									}
							}
						)))
							, (F0<IO<Unit>> f) -> f.f());
					}
			}
		)))
			, (F0<IO<Unit>> f) -> f.f());
	}
}