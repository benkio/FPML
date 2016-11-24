package it.unibo.validation.utilitiesFunctions;

import it.unibo.fPML.ApplyF;
import it.unibo.fPML.ApplyFIO;
import it.unibo.fPML.Argument;
import it.unibo.fPML.EffectFullArgument;
import it.unibo.fPML.EffectFullFunction;
import it.unibo.fPML.EffectFullFunctionDefinition;
import it.unibo.fPML.EffectFullFunctionType;
import it.unibo.fPML.EffectFullReference;
import it.unibo.fPML.FPMLFactory;
import it.unibo.fPML.IntPow;
import it.unibo.fPML.IntToString;
import it.unibo.fPML.Minus;
import it.unibo.fPML.Mod;
import it.unibo.fPML.Plus;
import it.unibo.fPML.PrimitiveEffectFullFunction;
import it.unibo.fPML.PrimitivePrint;
import it.unibo.fPML.PrimitivePureFunction;
import it.unibo.fPML.PrimitiveRandom;
import it.unibo.fPML.PureFunction;
import it.unibo.fPML.PureFunctionDefinition;
import it.unibo.fPML.PureLambda;
import it.unibo.fPML.Times;
import it.unibo.fPML.Type;
import it.unibo.fPML.Value;
import it.unibo.fPML.ValueType;

@SuppressWarnings("all")
public class GetArgType {
  public static ValueType pureFunction(final PureFunction f) {
    ValueType _switchResult = null;
    boolean _matched = false;
    if (f instanceof PureFunctionDefinition) {
      _matched=true;
      _switchResult = GetArgType.pureFunctionDefinition(((PureFunctionDefinition)f));
    }
    if (!_matched) {
      if (f instanceof PrimitivePureFunction) {
        _matched=true;
        _switchResult = GetArgType.primitivePureFunction(((PrimitivePureFunction)f));
      }
    }
    return _switchResult;
  }
  
  public static ValueType primitivePureFunction(final PrimitivePureFunction f) {
    boolean _matched = false;
    if (f instanceof IntToString) {
      _matched=true;
      return FPMLFactory.eINSTANCE.createIntegerType();
    }
    if (!_matched) {
      if (f instanceof IntPow) {
        _matched=true;
        return FPMLFactory.eINSTANCE.createIntegerType();
      }
    }
    if (!_matched) {
      if (f instanceof Plus) {
        _matched=true;
        return FPMLFactory.eINSTANCE.createIntegerType();
      }
    }
    if (!_matched) {
      if (f instanceof Minus) {
        _matched=true;
        return FPMLFactory.eINSTANCE.createIntegerType();
      }
    }
    if (!_matched) {
      if (f instanceof Times) {
        _matched=true;
        return FPMLFactory.eINSTANCE.createIntegerType();
      }
    }
    if (!_matched) {
      if (f instanceof Mod) {
        _matched=true;
        return FPMLFactory.eINSTANCE.createIntegerType();
      }
    }
    if (!_matched) {
      if (f instanceof ApplyF) {
        _matched=true;
        return ((ApplyF)f).getFunctionType();
      }
    }
    return null;
  }
  
  public static ValueType pureFunctionDefinition(final PureFunctionDefinition f) {
    boolean _matched = false;
    if (f instanceof Value) {
      _matched=true;
      return null;
    }
    if (!_matched) {
      if (f instanceof PureLambda) {
        _matched=true;
        return GetArgType.pureLambda(((PureLambda)f));
      }
    }
    Argument _arg = f.getArg();
    return _arg.getType();
  }
  
  public static ValueType pureLambda(final PureLambda l) {
    Argument _arg = l.getArg();
    return _arg.getType();
  }
  
  public static Type effectFullReference(final EffectFullReference reference) {
    boolean _matched = false;
    if (reference instanceof EffectFullFunction) {
      _matched=true;
      return GetArgType.effectFullFunction(((EffectFullFunction)reference));
    }
    if (!_matched) {
      if (reference instanceof PureFunction) {
        _matched=true;
        return GetArgType.pureFunction(((PureFunction)reference));
      }
    }
    if (!_matched) {
      if (reference instanceof EffectFullArgument) {
        _matched=true;
        return FPMLFactory.eINSTANCE.createUnitType();
      }
    }
    return null;
  }
  
  public static Type effectFullFunction(final EffectFullFunction function) {
    Type _switchResult = null;
    boolean _matched = false;
    if (function instanceof EffectFullFunctionDefinition) {
      _matched=true;
      _switchResult = GetArgType.effectFullFunctionDefinition(((EffectFullFunctionDefinition)function));
    }
    if (!_matched) {
      if (function instanceof PrimitiveEffectFullFunction) {
        _matched=true;
        _switchResult = GetArgType.primitiveEffectFullFunction(((PrimitiveEffectFullFunction)function));
      }
    }
    return _switchResult;
  }
  
  public static Type primitiveEffectFullFunction(final PrimitiveEffectFullFunction function) {
    boolean _matched = false;
    if (function instanceof PrimitivePrint) {
      _matched=true;
      return FPMLFactory.eINSTANCE.createStringType();
    }
    if (!_matched) {
      if (function instanceof PrimitiveRandom) {
        _matched=true;
        return FPMLFactory.eINSTANCE.createUnitType();
      }
    }
    if (!_matched) {
      if (function instanceof ApplyFIO) {
        _matched=true;
        EffectFullFunctionType _functionType = ((ApplyFIO)function).getFunctionType();
        return _functionType.getArgType();
      }
    }
    return null;
  }
  
  public static Type effectFullFunctionDefinition(final EffectFullFunctionDefinition definition) {
    EffectFullArgument _arg = definition.getArg();
    return _arg.getType();
  }
}
