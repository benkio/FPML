package it.unibo.validation;

import it.unibo.fPML.Argument;
import it.unibo.fPML.ChainElement;
import it.unibo.fPML.DataType;
import it.unibo.fPML.EffectFullArgument;
import it.unibo.fPML.EffectFullFunction;
import it.unibo.fPML.Expression;
import it.unibo.fPML.IOType;
import it.unibo.fPML.InitialPureChainElement;
import it.unibo.fPML.IntegerType;
import it.unibo.fPML.PureFunction;
import it.unibo.fPML.StringType;
import it.unibo.fPML.Type;
import it.unibo.fPML.UnitType;
import it.unibo.fPML.Value;
import it.unibo.fPML.ValueType;
import org.eclipse.emf.ecore.EObject;

/**
 * Created by benkio on 11/3/16.
 */
@SuppressWarnings("all")
public class UtilitiesFunctions {
  public static EObject getReturnType(final PureFunction pf) {
    final ValueType t = pf.getReturnType();
    if ((t instanceof DataType)) {
      return ((DataType)t).getType();
    }
    return t;
  }
  
  public static EObject getReturnType(final EffectFullFunction ef) {
    IOType _returnType = ef.getReturnType();
    final Type t = _returnType.getType();
    if ((t instanceof DataType)) {
      return ((DataType)t).getType();
    }
    return t;
  }
  
  public static EObject getReturnType(final ChainElement f1) {
    boolean _matched = false;
    if (f1 instanceof EffectFullFunction) {
      _matched=true;
      return UtilitiesFunctions.getReturnType(((EffectFullFunction)f1));
    }
    if (!_matched) {
      if (f1 instanceof PureFunction) {
        _matched=true;
        return UtilitiesFunctions.getReturnType(((PureFunction)f1));
      }
    }
    if (!_matched) {
      if (f1 instanceof Value) {
        _matched=true;
        Expression _value = ((Value)f1).getValue();
        return UtilitiesFunctions.getTypeFromExpression(_value);
      }
    }
    return null;
  }
  
  public static EObject getReturnType(final InitialPureChainElement f1) {
    boolean _matched = false;
    if (f1 instanceof PureFunction) {
      _matched=true;
      return UtilitiesFunctions.getReturnType(((PureFunction)f1));
    }
    if (!_matched) {
      if (f1 instanceof Value) {
        _matched=true;
        Expression _value = ((Value)f1).getValue();
        return UtilitiesFunctions.getTypeFromExpression(_value);
      }
    }
    return null;
  }
  
  public static EObject getArgType(final PureFunction pf) {
    Argument _arg = pf.getArg();
    final ValueType t = _arg.getType();
    if ((t instanceof DataType)) {
      return ((DataType)t).getType();
    }
    return t;
  }
  
  public static EObject getArgType(final EffectFullFunction ef) {
    EffectFullArgument _arg = ef.getArg();
    final Type t = _arg.getType();
    if ((t instanceof DataType)) {
      return ((DataType)t).getType();
    }
    return t;
  }
  
  public static EObject getArgType(final ChainElement f1) {
    boolean _matched = false;
    if (f1 instanceof EffectFullFunction) {
      _matched=true;
      return UtilitiesFunctions.getArgType(((EffectFullFunction)f1));
    }
    if (!_matched) {
      if (f1 instanceof PureFunction) {
        _matched=true;
        return UtilitiesFunctions.getArgType(((PureFunction)f1));
      }
    }
    if (!_matched) {
      if (f1 instanceof Value) {
        _matched=true;
        Expression _value = ((Value)f1).getValue();
        return UtilitiesFunctions.getTypeFromExpression(_value);
      }
    }
    return null;
  }
  
  public static EObject getArgType(final InitialPureChainElement f1) {
    boolean _matched = false;
    if (f1 instanceof PureFunction) {
      _matched=true;
      return UtilitiesFunctions.getArgType(((PureFunction)f1));
    }
    if (!_matched) {
      if (f1 instanceof Value) {
        _matched=true;
        Expression _value = ((Value)f1).getValue();
        return UtilitiesFunctions.getTypeFromExpression(_value);
      }
    }
    return null;
  }
  
  public static EObject getTypeFromValueType(final ValueType t) {
    boolean _matched = false;
    if (t instanceof DataType) {
      _matched=true;
      return ((DataType)t).getType();
    }
    return t;
  }
  
  public static EObject getTypeFromExpression(final Expression e) {
    boolean _matched = false;
    if (e instanceof IntegerType) {
      _matched=true;
      return ((IntegerType) e);
    }
    if (!_matched) {
      if (e instanceof StringType) {
        _matched=true;
        return ((StringType) e);
      }
    }
    if (!_matched) {
      if (e instanceof UnitType) {
        _matched=true;
        return ((UnitType) e);
      }
    }
    if (!_matched) {
      if (e instanceof DataType) {
        _matched=true;
        return ((DataType) e).getType();
      }
    }
    return null;
  }
}
