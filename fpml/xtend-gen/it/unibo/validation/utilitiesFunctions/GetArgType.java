package it.unibo.validation.utilitiesFunctions;

import com.google.common.base.Objects;
import it.unibo.fPML.ApplyF;
import it.unibo.fPML.ApplyFIO;
import it.unibo.fPML.Argument;
import it.unibo.fPML.ChainElement;
import it.unibo.fPML.CompositionFunctionBodyEffect;
import it.unibo.fPML.CompositionFunctionBodyPure;
import it.unibo.fPML.DataType;
import it.unibo.fPML.EffectFullArgument;
import it.unibo.fPML.EffectFullFunctionDefinition;
import it.unibo.fPML.EffectFullFunctionType;
import it.unibo.fPML.Expression;
import it.unibo.fPML.FPMLFactory;
import it.unibo.fPML.IntPow;
import it.unibo.fPML.IntToString;
import it.unibo.fPML.MainFunc;
import it.unibo.fPML.Minus;
import it.unibo.fPML.Mod;
import it.unibo.fPML.Plus;
import it.unibo.fPML.PrimitivePrint;
import it.unibo.fPML.PureFunctionDefinition;
import it.unibo.fPML.PureFunctionType;
import it.unibo.fPML.Times;
import it.unibo.fPML.Type;
import it.unibo.fPML.Value;
import it.unibo.fPML.ValueType;
import it.unibo.validation.utilitiesFunctions.Checks;
import it.unibo.validation.utilitiesFunctions.Others;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.Exceptions;

@SuppressWarnings("all")
public class GetArgType {
  public static ValueType getArgTypePure(final PureFunctionDefinition pf, final ValueType previousChainType) {
    final Argument t = pf.getArg();
    boolean _equals = Objects.equal(t, null);
    if (_equals) {
      if ((previousChainType instanceof PureFunctionType)) {
        return GetArgType.getArgTypePurePrimitive(pf, ((PureFunctionType)previousChainType));
      } else {
        return GetArgType.getArgTypePurePrimitive(pf, null);
      }
    } else {
      ValueType _type = t.getType();
      boolean _matched = false;
      if (_type instanceof DataType) {
        _matched=true;
        ValueType _type_1 = t.getType();
        return ((DataType) _type_1);
      }
      return t.getType();
    }
  }
  
  public static Type getArgTypeEffectFull(final EffectFullFunctionDefinition ef, final Type previousChainType) {
    final EffectFullArgument t = ef.getArg();
    boolean _equals = Objects.equal(t, null);
    if (_equals) {
      if ((previousChainType instanceof EffectFullFunctionType)) {
        return GetArgType.getArgTypeEffectFullPrimitive(ef, ((EffectFullFunctionType)previousChainType));
      } else {
        return GetArgType.getArgTypeEffectFullPrimitive(ef, null);
      }
    } else {
      Type _type = t.getType();
      boolean _matched = false;
      if (_type instanceof DataType) {
        _matched=true;
        Type _type_1 = t.getType();
        return ((DataType) _type_1);
      }
      return t.getType();
    }
  }
  
  public static Type getArgType(final ChainElement f1, final Type previousChainType) {
    boolean _matched = false;
    if (f1 instanceof EffectFullFunctionDefinition) {
      _matched=true;
      return GetArgType.getArgTypeEffectFull(((EffectFullFunctionDefinition)f1), previousChainType);
    }
    if (!_matched) {
      if (f1 instanceof PureFunctionDefinition) {
        _matched=true;
        return GetArgType.getArgTypePure(((PureFunctionDefinition)f1), ((ValueType) previousChainType));
      }
    }
    if (!_matched) {
      if (f1 instanceof Value) {
        _matched=true;
        Expression _value = ((Value)f1).getValue();
        return Others.getTypeFromExpression(_value);
      }
    }
    if (!_matched) {
      if (f1 instanceof EffectFullArgument) {
        _matched=true;
        return ((EffectFullArgument)f1).getType();
      }
    }
    return null;
  }
  
  public static ValueType getArgTypePurePrimitive(final PureFunctionDefinition pf, final PureFunctionType previousFunction) {
    try {
      boolean _matched = false;
      if (pf instanceof IntToString) {
        _matched=true;
        return FPMLFactory.eINSTANCE.createIntegerType();
      }
      if (!_matched) {
        if (pf instanceof IntPow) {
          _matched=true;
          return FPMLFactory.eINSTANCE.createIntegerType();
        }
      }
      if (!_matched) {
        if (pf instanceof Plus) {
          _matched=true;
          return FPMLFactory.eINSTANCE.createIntegerType();
        }
      }
      if (!_matched) {
        if (pf instanceof Minus) {
          _matched=true;
          return FPMLFactory.eINSTANCE.createIntegerType();
        }
      }
      if (!_matched) {
        if (pf instanceof Times) {
          _matched=true;
          return FPMLFactory.eINSTANCE.createIntegerType();
        }
      }
      if (!_matched) {
        if (pf instanceof Mod) {
          _matched=true;
          return FPMLFactory.eINSTANCE.createIntegerType();
        }
      }
      if (!_matched) {
        if (pf instanceof ApplyF) {
          _matched=true;
          if (((((!Objects.equal(previousFunction, null)) && (((ApplyF)pf).getValueRef() instanceof Value)) && (Others.getTypeFromExpression(((Value) ((ApplyF)pf).getValueRef()).getValue()) instanceof ValueType)) && 
            Checks.checkValueTypeEquals(previousFunction.getArgType(), ((ValueType) Others.getTypeFromExpression(((Value) ((ApplyF)pf).getValueRef()).getValue()))))) {
            Value _valueRef = ((ApplyF)pf).getValueRef();
            Expression _value = ((Value) _valueRef).getValue();
            Type _typeFromExpression = Others.getTypeFromExpression(_value);
            previousFunction.setArgType(((ValueType) _typeFromExpression));
            return previousFunction;
          } else {
            return null;
          }
        }
      }
      throw new Exception("this cannot happen during the typechecking, get argument type pure primitive");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public static Type getArgTypeEffectFullPrimitive(final EffectFullFunctionDefinition ef, final EffectFullFunctionType previousFunction) {
    try {
      boolean _matched = false;
      if (ef instanceof PrimitivePrint) {
        _matched=true;
        return FPMLFactory.eINSTANCE.createStringType();
      }
      if (!_matched) {
        if (ef instanceof ApplyFIO) {
          _matched=true;
          boolean _notEquals = (!Objects.equal(previousFunction, null));
          if (_notEquals) {
            return previousFunction.getArgType();
          } else {
            throw new Exception("this cannot happen during the typechecking, get argument type pure primitive");
          }
        }
      }
      throw new Exception("this cannot happen during the typechecking, get argument type Effectfull primitive");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public static ValueType getArgTypeCompositionFunctionBodyPureContainer(final CompositionFunctionBodyPure cfbp) {
    try {
      final EObject container = cfbp.eContainer();
      if ((container instanceof PureFunctionDefinition)) {
        Argument _arg = ((PureFunctionDefinition)container).getArg();
        return _arg.getType();
      }
      throw new Exception("this cannot happen during the typechecking, getArgTypeCompositionBodyPureContainer");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public static Type getArgTypeCompositionFunctionBodyEffectFullContainer(final CompositionFunctionBodyEffect cfbe) {
    try {
      final EObject container = cfbe.eContainer();
      if (((container instanceof EffectFullFunctionDefinition) || (container instanceof MainFunc))) {
        boolean _matched = false;
        if (container instanceof EffectFullFunctionDefinition) {
          _matched=true;
          EffectFullArgument _arg = ((EffectFullFunctionDefinition)container).getArg();
          return _arg.getType();
        }
        if (!_matched) {
          if (container instanceof MainFunc) {
            _matched=true;
            return FPMLFactory.eINSTANCE.createUnitType();
          }
        }
      }
      throw new Exception("this cannot happen during the typechecking, getArgTypeCompositionFunctionBodyEffectFullContainer");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
