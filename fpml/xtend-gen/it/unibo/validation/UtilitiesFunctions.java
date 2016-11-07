package it.unibo.validation;

import it.unibo.fPML.Argument;
import it.unibo.fPML.ChainElement;
import it.unibo.fPML.Data;
import it.unibo.fPML.DataType;
import it.unibo.fPML.EffectFullArgument;
import it.unibo.fPML.EffectFullFunction;
import it.unibo.fPML.IOType;
import it.unibo.fPML.InitialPureChainElement;
import it.unibo.fPML.PureFunction;
import it.unibo.fPML.Type;
import it.unibo.fPML.ValueType;
import org.eclipse.emf.ecore.EObject;

/**
 * Created by benkio on 11/3/16.
 */
@SuppressWarnings("all")
public class UtilitiesFunctions {
  public static EObject getReturnType(final ChainElement f1) {
    boolean _matched = false;
    if (f1 instanceof EffectFullFunction) {
      _matched=true;
      IOType _returnType = ((EffectFullFunction)f1).getReturnType();
      final Type t = _returnType.getType();
      if ((t instanceof DataType)) {
        return ((DataType)t).getType();
      }
      return t;
    }
    if (!_matched) {
      if (f1 instanceof PureFunction) {
        _matched=true;
        return ((PureFunction)f1).getReturnType();
      }
    }
    if (!_matched) {
      if (f1 instanceof Data) {
        _matched=true;
        return f1;
      }
    }
    return null;
  }
  
  public static EObject getReturnType(final InitialPureChainElement f1) {
    boolean _matched = false;
    if (f1 instanceof PureFunction) {
      _matched=true;
      return ((PureFunction)f1).getReturnType();
    }
    if (!_matched) {
      if (f1 instanceof Data) {
        _matched=true;
        return f1;
      }
    }
    return null;
  }
  
  public static EObject getArgType(final ChainElement f1) {
    boolean _matched = false;
    if (f1 instanceof EffectFullFunction) {
      _matched=true;
      EffectFullArgument _arg = ((EffectFullFunction)f1).getArg();
      final Type t = _arg.getType();
      if ((t instanceof DataType)) {
        return ((DataType)t).getType();
      }
      return t;
    }
    if (!_matched) {
      if (f1 instanceof PureFunction) {
        _matched=true;
        Argument _arg = ((PureFunction)f1).getArg();
        return _arg.getType();
      }
    }
    if (!_matched) {
      if (f1 instanceof Data) {
        _matched=true;
        return f1;
      }
    }
    return null;
  }
  
  public static EObject getArgType(final InitialPureChainElement f1) {
    boolean _matched = false;
    if (f1 instanceof PureFunction) {
      _matched=true;
      Argument _arg = ((PureFunction)f1).getArg();
      return _arg.getType();
    }
    if (!_matched) {
      if (f1 instanceof Data) {
        _matched=true;
        return f1;
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
}
