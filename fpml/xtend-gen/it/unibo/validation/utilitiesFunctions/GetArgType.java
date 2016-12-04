package it.unibo.validation.utilitiesFunctions;

import com.google.common.base.Objects;
import it.unibo.fPML.ApplyF;
import it.unibo.fPML.ApplyFIO;
import it.unibo.fPML.Argument;
import it.unibo.fPML.EffectFullAlgebraicType;
import it.unibo.fPML.EffectFullArgument;
import it.unibo.fPML.EffectFullExpression;
import it.unibo.fPML.EffectFullFunction;
import it.unibo.fPML.EffectFullFunctionDefinition;
import it.unibo.fPML.EffectFullLambda;
import it.unibo.fPML.EffectFullReference;
import it.unibo.fPML.EffectFullValue;
import it.unibo.fPML.FPMLFactory;
import it.unibo.fPML.Function;
import it.unibo.fPML.IntPow;
import it.unibo.fPML.IntToString;
import it.unibo.fPML.LeftPair;
import it.unibo.fPML.LeftPairIO;
import it.unibo.fPML.Minus;
import it.unibo.fPML.Mod;
import it.unibo.fPML.Plus;
import it.unibo.fPML.PrimitiveEffectFullFunction;
import it.unibo.fPML.PrimitiveEffectFullValue;
import it.unibo.fPML.PrimitivePrint;
import it.unibo.fPML.PrimitivePureFunction;
import it.unibo.fPML.PrimitiveRandom;
import it.unibo.fPML.PrimitiveReturn;
import it.unibo.fPML.PrimitiveTime;
import it.unibo.fPML.PureFunction;
import it.unibo.fPML.PureFunctionDefinition;
import it.unibo.fPML.PureLambda;
import it.unibo.fPML.PureValue;
import it.unibo.fPML.RightPair;
import it.unibo.fPML.RightPairIO;
import it.unibo.fPML.Times;
import it.unibo.fPML.Type;
import it.unibo.fPML.ValueType;
import it.unibo.validation.utilitiesFunctions.GetReturnType;

@SuppressWarnings("all")
public class GetArgType {
  public static Type function(final Function f) {
    Type _switchResult = null;
    boolean _matched = false;
    if (f instanceof EffectFullFunction) {
      _matched=true;
      _switchResult = GetArgType.effectFullFunction(((EffectFullFunction)f));
    }
    if (!_matched) {
      if (f instanceof PureFunction) {
        _matched=true;
        _switchResult = GetArgType.pureFunction(((PureFunction)f));
      }
    }
    return _switchResult;
  }
  
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
    if (!_matched) {
      if (f instanceof LeftPair) {
        _matched=true;
        return ((LeftPair)f).getType();
      }
    }
    if (!_matched) {
      if (f instanceof RightPair) {
        _matched=true;
        return ((RightPair)f).getType();
      }
    }
    return null;
  }
  
  public static ValueType pureFunctionDefinition(final PureFunctionDefinition f) {
    boolean _matched = false;
    if (f instanceof PureValue) {
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
    boolean _notEquals = (!Objects.equal(_arg, null));
    if (_notEquals) {
      Argument _arg_1 = l.getArg();
      return _arg_1.getType();
    } else {
      return null;
    }
  }
  
  public static Type effectFullReference(final EffectFullReference reference) {
    Type _switchResult = null;
    boolean _matched = false;
    if (reference instanceof EffectFullValue) {
      _matched=true;
      return FPMLFactory.eINSTANCE.createUnitType();
    }
    if (!_matched) {
      if (reference instanceof PureValue) {
        _matched=true;
        return FPMLFactory.eINSTANCE.createUnitType();
      }
    }
    if (!_matched) {
      if (reference instanceof PrimitiveEffectFullValue) {
        _matched=true;
        return FPMLFactory.eINSTANCE.createUnitType();
      }
    }
    if (!_matched) {
      if (reference instanceof PrimitiveEffectFullFunction) {
        _matched=true;
        _switchResult = GetArgType.primitiveEffectFullFunction(((PrimitiveEffectFullFunction)reference));
      }
    }
    if (!_matched) {
      if (reference instanceof PrimitivePureFunction) {
        _matched=true;
        _switchResult = GetArgType.primitivePureFunction(((PrimitivePureFunction)reference));
      }
    }
    if (!_matched) {
      if (reference instanceof EffectFullArgument) {
        _matched=true;
        return FPMLFactory.eINSTANCE.createUnitType();
      }
    }
    if (!_matched) {
      if (reference instanceof Function) {
        _matched=true;
        _switchResult = GetArgType.function(((Function)reference));
      }
    }
    return _switchResult;
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
    EffectFullAlgebraicType _switchResult = null;
    boolean _matched = false;
    if (function instanceof PrimitivePrint) {
      _matched=true;
      return FPMLFactory.eINSTANCE.createStringType();
    }
    if (!_matched) {
      if (function instanceof ApplyFIO) {
        _matched=true;
        return ((ApplyFIO)function).getFunctionType();
      }
    }
    if (!_matched) {
      if (function instanceof PrimitiveReturn) {
        _matched=true;
        return ((PrimitiveReturn)function).getType();
      }
    }
    if (!_matched) {
      if (function instanceof LeftPairIO) {
        _matched=true;
        _switchResult = ((LeftPairIO)function).getType();
      }
    }
    if (!_matched) {
      if (function instanceof RightPairIO) {
        _matched=true;
        _switchResult = ((RightPairIO)function).getType();
      }
    }
    return _switchResult;
  }
  
  public static Type primitiveEffectFullValue(final PrimitiveEffectFullValue pefv) {
    Type _switchResult = null;
    boolean _matched = false;
    if (pefv instanceof PrimitiveRandom) {
      _matched=true;
      return FPMLFactory.eINSTANCE.createUnitType();
    }
    if (!_matched) {
      if (pefv instanceof PrimitiveTime) {
        _matched=true;
        return FPMLFactory.eINSTANCE.createUnitType();
      }
    }
    if (!_matched) {
      if (pefv instanceof PrimitiveReturn) {
        _matched=true;
        _switchResult = ((PrimitiveReturn)pefv).getType();
      }
    }
    return _switchResult;
  }
  
  public static Type effectFullFunctionDefinition(final EffectFullFunctionDefinition definition) {
    Type _switchResult = null;
    boolean _matched = false;
    if (definition instanceof EffectFullValue) {
      _matched=true;
      EffectFullExpression _value = ((EffectFullValue)definition).getValue();
      _switchResult = GetReturnType.effectFullExpression(_value);
    }
    if (!_matched) {
      if (definition instanceof EffectFullLambda) {
        _matched=true;
        _switchResult = GetArgType.effectFullLambda(((EffectFullLambda)definition));
      }
    }
    if (!_matched) {
      if (definition instanceof EffectFullFunctionDefinition) {
        _matched=true;
        EffectFullArgument _arg = definition.getArg();
        _switchResult = _arg.getType();
      }
    }
    return _switchResult;
  }
  
  public static Type effectFullLambda(final EffectFullLambda lambda) {
    EffectFullArgument _arg = lambda.getArg();
    boolean _equals = Objects.equal(_arg, null);
    if (_equals) {
      return FPMLFactory.eINSTANCE.createUnitType();
    } else {
      EffectFullArgument _arg_1 = lambda.getArg();
      return _arg_1.getType();
    }
  }
}
