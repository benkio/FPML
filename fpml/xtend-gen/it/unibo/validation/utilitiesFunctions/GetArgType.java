package it.unibo.validation.utilitiesFunctions;

import com.google.common.base.Objects;
import it.unibo.fPML.ApplyF;
import it.unibo.fPML.ApplyFIO;
import it.unibo.fPML.Argument;
import it.unibo.fPML.EffectFullArgument;
import it.unibo.fPML.EffectFullDataType;
import it.unibo.fPML.EffectFullExpression;
import it.unibo.fPML.EffectFullFunction;
import it.unibo.fPML.EffectFullFunctionDefinition;
import it.unibo.fPML.EffectFullFunctionType;
import it.unibo.fPML.EffectFullLambda;
import it.unibo.fPML.EffectFullReference;
import it.unibo.fPML.EffectFullValue;
import it.unibo.fPML.Expression;
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
import it.unibo.fPML.PureValue;
import it.unibo.fPML.Times;
import it.unibo.fPML.Type;
import it.unibo.fPML.UnitType;
import it.unibo.fPML.ValueType;
import it.unibo.validation.utilitiesFunctions.GetReturnType;

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
    Type _switchResult = null;
    boolean _matched = false;
    if (definition instanceof EffectFullValue) {
      _matched=true;
      EffectFullExpression _value = ((EffectFullValue)definition).getValue();
      _switchResult = GetArgType.effectFullExpression(_value);
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
  
  public static Type effectFullExpression(final EffectFullExpression eExp) {
    Type _switchResult = null;
    boolean _matched = false;
    if (eExp instanceof EffectFullDataType) {
      _matched=true;
      _switchResult = ((Type)eExp);
    }
    if (!_matched) {
      if (eExp instanceof EffectFullFunctionType) {
        _matched=true;
        _switchResult = ((Type)eExp);
      }
    }
    if (!_matched) {
      if (eExp instanceof Expression) {
        _matched=true;
        _switchResult = GetReturnType.expression(((Expression)eExp));
      }
    }
    if (!_matched) {
      if (eExp instanceof UnitType) {
        _matched=true;
        _switchResult = ((Type)eExp);
      }
    }
    return _switchResult;
  }
}
