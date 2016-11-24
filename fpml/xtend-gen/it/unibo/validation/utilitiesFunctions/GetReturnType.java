package it.unibo.validation.utilitiesFunctions;

import it.unibo.fPML.ApplyF;
import it.unibo.fPML.ApplyFIO;
import it.unibo.fPML.Argument;
import it.unibo.fPML.CompositionFunctionBodyEffect;
import it.unibo.fPML.CompositionFunctionBodyPure;
import it.unibo.fPML.DataValue;
import it.unibo.fPML.EffectFullArgument;
import it.unibo.fPML.EffectFullFunction;
import it.unibo.fPML.EffectFullFunctionDefinition;
import it.unibo.fPML.EffectFullFunctionType;
import it.unibo.fPML.EffectFullReference;
import it.unibo.fPML.Expression;
import it.unibo.fPML.FPMLFactory;
import it.unibo.fPML.Function;
import it.unibo.fPML.FunctionBodyEffectFull;
import it.unibo.fPML.FunctionBodyPure;
import it.unibo.fPML.IOType;
import it.unibo.fPML.IntPow;
import it.unibo.fPML.IntToString;
import it.unibo.fPML.IntegerType;
import it.unibo.fPML.MainFunc;
import it.unibo.fPML.Minus;
import it.unibo.fPML.Mod;
import it.unibo.fPML.Plus;
import it.unibo.fPML.PrimitiveEffectFullFunction;
import it.unibo.fPML.PrimitivePrint;
import it.unibo.fPML.PrimitivePureFunction;
import it.unibo.fPML.PrimitiveRandom;
import it.unibo.fPML.PureFunction;
import it.unibo.fPML.PureFunctionDefinition;
import it.unibo.fPML.PureFunctionType;
import it.unibo.fPML.PureReference;
import it.unibo.fPML.StringType;
import it.unibo.fPML.Times;
import it.unibo.fPML.Type;
import it.unibo.fPML.ValueType;
import java.util.List;

@SuppressWarnings("all")
public class GetReturnType {
  public static Type function(final Function f) {
    Type _switchResult = null;
    boolean _matched = false;
    if (f instanceof EffectFullFunction) {
      _matched=true;
      _switchResult = GetReturnType.effectFullFunction(((EffectFullFunction)f));
    }
    if (!_matched) {
      if (f instanceof PureFunction) {
        _matched=true;
        _switchResult = GetReturnType.pureFunction(((PureFunction)f));
      }
    }
    return _switchResult;
  }
  
  public static ValueType pureFunction(final PureFunction f) {
    ValueType _switchResult = null;
    boolean _matched = false;
    if (f instanceof PureFunctionDefinition) {
      _matched=true;
      _switchResult = GetReturnType.pureFunctionDefinition(((PureFunctionDefinition)f));
    }
    if (!_matched) {
      if (f instanceof PrimitivePureFunction) {
        _matched=true;
        _switchResult = GetReturnType.primitivePureFunction(((PrimitivePureFunction)f));
      }
    }
    return _switchResult;
  }
  
  public static ValueType pureFunctionDefinition(final PureFunctionDefinition f) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field higherOrderArg is undefined for the type PureLambda"
      + "\nThe method or field arg is undefined for the type PureFunctionDefinition"
      + "\nThe method or field higherOrderArg is undefined for the type PureFunctionDefinition"
      + "\nThe method functionBodyPure(FunctionBodyPure, Argument, AdditionalPureArgument, ValueType) from the type GetReturnType refers to the missing type AdditionalPureArgument"
      + "\nThe method functionBodyPure(FunctionBodyPure, Argument, AdditionalPureArgument, ValueType) from the type GetReturnType refers to the missing type AdditionalPureArgument");
  }
  
  public static ValueType expression(final Expression expression) {
    boolean _matched = false;
    if (expression instanceof IntegerType) {
      _matched=true;
      return FPMLFactory.eINSTANCE.createIntegerType();
    }
    if (!_matched) {
      if (expression instanceof StringType) {
        _matched=true;
        return FPMLFactory.eINSTANCE.createStringType();
      }
    }
    if (!_matched) {
      if (expression instanceof DataValue) {
        _matched=true;
        return ((ValueType)expression);
      }
    }
    if (!_matched) {
      if (expression instanceof PureFunctionType) {
        _matched=true;
        return ((ValueType)expression);
      }
    }
    return null;
  }
  
  public static ValueType functionBodyPure(final FunctionBodyPure pure, final Argument arg1, final /* AdditionalPureArgument */Object arg2, final ValueType returnType) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method compositionFunctionBodyPure(CompositionFunctionBodyPure, Argument, AdditionalPureArgument) from the type GetReturnType refers to the missing type AdditionalPureArgument");
  }
  
  public static ValueType compositionFunctionBodyPure(final CompositionFunctionBodyPure pure, final Argument arg1, final /* AdditionalPureArgument */Object arg2) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method pureFunctionChain(List<PureFunction>, PureFunction, Argument, AdditionalPureArgument) from the type GetReturnType refers to the missing type AdditionalPureArgument");
  }
  
  public static ValueType pureFunctionChain(final List<PureFunction> definitions, final PureFunction first, final Argument argument, final /* AdditionalPureArgument */Object argument2) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method pureFunctionChain(List<PureFunction>, PureFunction, Argument, AdditionalPureArgument) from the type GetReturnType refers to the missing type AdditionalPureArgument"
      + "\nThe method pureFunctionChain(List<PureFunction>, PureFunction, Argument, AdditionalPureArgument) from the type GetReturnType refers to the missing type AdditionalPureArgument"
      + "\n!= cannot be resolved"
      + "\ntype cannot be resolved");
  }
  
  public static ValueType primitivePureFunction(final PrimitivePureFunction f) {
    boolean _matched = false;
    if (f instanceof IntToString) {
      _matched=true;
      return FPMLFactory.eINSTANCE.createStringType();
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
        return GetReturnType.IntIntFunc();
      }
    }
    if (!_matched) {
      if (f instanceof Minus) {
        _matched=true;
        return GetReturnType.IntIntFunc();
      }
    }
    if (!_matched) {
      if (f instanceof Times) {
        _matched=true;
        return GetReturnType.IntIntFunc();
      }
    }
    if (!_matched) {
      if (f instanceof Mod) {
        _matched=true;
        return GetReturnType.IntIntFunc();
      }
    }
    if (!_matched) {
      if (f instanceof ApplyF) {
        _matched=true;
        PureFunctionType _functionType = ((ApplyF)f).getFunctionType();
        return _functionType.getReturnType();
      }
    }
    return null;
  }
  
  public static PureFunctionType IntIntFunc() {
    final PureFunctionType func = FPMLFactory.eINSTANCE.createPureFunctionType();
    IntegerType _createIntegerType = FPMLFactory.eINSTANCE.createIntegerType();
    func.setArgType(_createIntegerType);
    IntegerType _createIntegerType_1 = FPMLFactory.eINSTANCE.createIntegerType();
    func.setReturnType(_createIntegerType_1);
    return func;
  }
  
  public static ValueType pureReference(final PureReference reference) {
    boolean _matched = false;
    if (reference instanceof PureFunctionDefinition) {
      _matched=true;
      return GetReturnType.pureFunctionDefinition(((PureFunctionDefinition)reference));
    }
    if (!_matched) {
      if (reference instanceof Argument) {
        _matched=true;
        return ((Argument)reference).getType();
      }
    }
    return null;
  }
  
  public static Type effectFullFunction(final EffectFullFunction function) {
    Type _switchResult = null;
    boolean _matched = false;
    if (function instanceof EffectFullFunctionDefinition) {
      _matched=true;
      _switchResult = GetReturnType.effectFullFunctionDefinition(((EffectFullFunctionDefinition)function));
    }
    if (!_matched) {
      if (function instanceof PrimitiveEffectFullFunction) {
        _matched=true;
        _switchResult = GetReturnType.primitiveEffectFullFunction(((PrimitiveEffectFullFunction)function));
      }
    }
    return _switchResult;
  }
  
  public static Type effectFullFunctionDefinition(final EffectFullFunctionDefinition definition) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field arg is undefined for the type EffectFullFunctionDefinition"
      + "\nThe method or field higherOrderArg is undefined for the type EffectFullFunctionDefinition"
      + "\nThe method functionBodyEffectFull(FunctionBodyEffectFull, EffectFullArgument, AdditionalEffectFullArgument, IOType) from the type GetReturnType refers to the missing type AdditionalEffectFullArgument");
  }
  
  public static Type functionBodyEffectFull(final FunctionBodyEffectFull full, final EffectFullArgument argument, final /* AdditionalEffectFullArgument */Object argument2, final IOType type) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method compositionFunctionBodyEffectFull(CompositionFunctionBodyEffect, EffectFullArgument, AdditionalEffectFullArgument) from the type GetReturnType refers to the missing type AdditionalEffectFullArgument");
  }
  
  public static Type compositionFunctionBodyEffectFull(final CompositionFunctionBodyEffect effect, final EffectFullArgument argument, final /* AdditionalEffectFullArgument */Object argument2) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method effectFullFunctionChain(List<EffectFullReference>, EffectFullReference, EffectFullArgument, AdditionalEffectFullArgument) from the type GetReturnType refers to the missing type AdditionalEffectFullArgument");
  }
  
  public static Type effectFullFunctionChain(final List<EffectFullReference> references, final EffectFullReference first, final EffectFullArgument argument, final /* AdditionalEffectFullArgument */Object argument2) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method effectFullFunctionChain(List<EffectFullReference>, EffectFullReference, EffectFullArgument, AdditionalEffectFullArgument) from the type GetReturnType refers to the missing type AdditionalEffectFullArgument"
      + "\nThe method effectFullFunctionChain(List<EffectFullReference>, EffectFullReference, EffectFullArgument, AdditionalEffectFullArgument) from the type GetReturnType refers to the missing type AdditionalEffectFullArgument"
      + "\n!= cannot be resolved"
      + "\ntype cannot be resolved");
  }
  
  public static Type effectFullReference(final EffectFullReference r) {
    Type _switchResult = null;
    boolean _matched = false;
    if (r instanceof Function) {
      _matched=true;
      _switchResult = GetReturnType.function(((Function)r));
    }
    if (!_matched) {
      if (r instanceof EffectFullArgument) {
        _matched=true;
        _switchResult = ((EffectFullArgument)r).getType();
      }
    }
    return _switchResult;
  }
  
  public static Type primitiveEffectFullFunction(final PrimitiveEffectFullFunction function) {
    Type _switchResult = null;
    boolean _matched = false;
    if (function instanceof PrimitivePrint) {
      _matched=true;
      _switchResult = FPMLFactory.eINSTANCE.createUnitType();
    }
    if (!_matched) {
      if (function instanceof PrimitiveRandom) {
        _matched=true;
        _switchResult = FPMLFactory.eINSTANCE.createIntegerType();
      }
    }
    if (!_matched) {
      if (function instanceof ApplyFIO) {
        _matched=true;
        EffectFullFunctionType _functionType = ((ApplyFIO)function).getFunctionType();
        IOType _returnType = _functionType.getReturnType();
        _switchResult = _returnType.getType();
      }
    }
    return _switchResult;
  }
  
  public static Type mainFunc(final MainFunc m) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method functionBodyEffectFull(FunctionBodyEffectFull, EffectFullArgument, AdditionalEffectFullArgument, IOType) from the type GetReturnType refers to the missing type AdditionalEffectFullArgument");
  }
}
