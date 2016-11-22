package it.unibo.validation.utilitiesFunctions;

import com.google.common.base.Objects;
import it.unibo.fPML.AdtType;
import it.unibo.fPML.AdtValue;
import it.unibo.fPML.CompositionFunctionBodyPure;
import it.unibo.fPML.DataType;
import it.unibo.fPML.DataValue;
import it.unibo.fPML.EffectFullFunctionType;
import it.unibo.fPML.Expression;
import it.unibo.fPML.IntegerType;
import it.unibo.fPML.ProdType;
import it.unibo.fPML.ProdValue;
import it.unibo.fPML.PureFunctionDefinition;
import it.unibo.fPML.PureFunctionType;
import it.unibo.fPML.StringType;
import it.unibo.fPML.SumType;
import it.unibo.fPML.SumValue;
import it.unibo.fPML.Type;
import it.unibo.fPML.UnitType;
import it.unibo.fPML.Value;
import it.unibo.fPML.ValueRef;
import it.unibo.fPML.ValueType;
import it.unibo.validation.utilitiesFunctions.GetReturnType;
import it.unibo.validation.utilitiesFunctions.Others;
import org.eclipse.emf.ecore.EClass;

@SuppressWarnings("all")
public class Checks {
  public static boolean DataAndValue(final AdtValue value, final AdtType type) {
    boolean _switchResult = false;
    boolean _matched = false;
    if (type instanceof IntegerType) {
      _matched=true;
      return ((value instanceof IntegerType) || ((value instanceof ValueRef) && 
        Checks.checkValueType(((ValueRef) value).getValue(), type)));
    }
    if (!_matched) {
      if (type instanceof StringType) {
        _matched=true;
        return ((value instanceof StringType) || ((value instanceof ValueRef) && 
          Checks.checkValueType(((ValueRef) value).getValue(), type)));
      }
    }
    if (!_matched) {
      if (type instanceof DataType) {
        _matched=true;
        return ((value instanceof DataValue) && 
          Checks.DataAndValue(((DataValue) value).getValue(), ((DataType) type).getType().getContent()));
      }
    }
    if (!_matched) {
      if (type instanceof PureFunctionType) {
        _matched=true;
        if ((value instanceof PureFunctionType)) {
          return (((((PureFunctionType) value).getValue().getFunctionBody() instanceof CompositionFunctionBodyPure) && 
            Checks.ValueTypeEquals(((PureFunctionType) value).getValue().getArg().getType(), ((PureFunctionType)type).getArgType())) && 
            Checks.ValueTypeEquals(GetReturnType.pureFunctionDefinition(((PureFunctionType) value).getValue()), ((PureFunctionType)type).getReturnType()));
        } else {
          if (((value instanceof ValueRef) && (((ValueRef) value).getValue() instanceof PureFunctionDefinition))) {
            return (Checks.ValueTypeEquals(((PureFunctionDefinition) ((ValueRef) value).getValue()).getArg().getType(), ((PureFunctionType)type).getArgType()) && 
              Checks.ValueTypeEquals(((PureFunctionDefinition) ((ValueRef) value).getValue()).getReturnType(), ((PureFunctionType)type).getReturnType()));
          }
        }
      }
    }
    if (!_matched) {
      boolean _switchResult_1 = false;
      boolean _matched_1 = false;
      if (value instanceof SumValue) {
        _matched_1=true;
        return ((type.getAdtElement2() instanceof SumType) && (Boolean.valueOf(Checks.DataAndValue(((SumValue)value).getSumAdtElement1(), type.getAdtElement1())).booleanValue() || Boolean.valueOf(Checks.DataAndValue(((SumValue)value).getSumAdtElement2(), ((SumType) type.getAdtElement2()).getAdtElement())).booleanValue()));
      }
      if (!_matched_1) {
        if (value instanceof ProdValue) {
          _matched_1=true;
          return ((type.getAdtElement2() instanceof ProdType) && (Boolean.valueOf(Checks.DataAndValue(((ProdValue)value).getProdAdtElement1(), type.getAdtElement1())).booleanValue() && Boolean.valueOf(Checks.DataAndValue(((ProdValue)value).getProdAdtElement2(), ((ProdType) type.getAdtElement2()).getAdtElement())).booleanValue()));
        }
      }
      if (!_matched_1) {
        if (value instanceof ValueRef) {
          _matched_1=true;
          Value _value = ((ValueRef)value).getValue();
          return Checks.checkValueType(_value, type);
        }
      }
      if (!_matched_1) {
        _switchResult_1 = false;
      }
      _switchResult = _switchResult_1;
    }
    return _switchResult;
  }
  
  public static boolean checkValueType(final Value v, final AdtType adtt) {
    boolean _xblockexpression = false;
    {
      Expression _value = v.getValue();
      final Type valueType = Others.getTypeFromExpression(_value);
      boolean _switchResult = false;
      boolean _matched = false;
      if (adtt instanceof IntegerType) {
        _matched=true;
        return (valueType instanceof IntegerType);
      }
      if (!_matched) {
        if (adtt instanceof StringType) {
          _matched=true;
          return (valueType instanceof StringType);
        }
      }
      if (!_matched) {
        if (adtt instanceof DataType) {
          _matched=true;
          return ((valueType instanceof DataType) && ((DataType)adtt).getType().getName().equals(((DataType) valueType).getType().getName()));
        }
      }
      if (!_matched) {
        if (adtt instanceof PureFunctionType) {
          _matched=true;
          _switchResult = (((valueType instanceof PureFunctionType) && Checks.ValueTypeEquals(((PureFunctionType)adtt).getArgType(), ((PureFunctionType) valueType).getArgType())) && Checks.ValueTypeEquals(((PureFunctionType)adtt).getReturnType(), ((PureFunctionType) valueType).getReturnType()));
        }
      }
      if (!_matched) {
        _switchResult = false;
      }
      _xblockexpression = _switchResult;
    }
    return _xblockexpression;
  }
  
  public static boolean ValueTypeEquals(final ValueType v, final ValueType v2) {
    boolean _matched = false;
    if (v instanceof PureFunctionType) {
      _matched=true;
      return (((v2 instanceof PureFunctionType) && 
        Checks.ValueTypeEquals(((PureFunctionType)v).getArgType(), ((PureFunctionType) v2).getArgType())) && 
        Checks.ValueTypeEquals(((PureFunctionType)v).getReturnType(), ((PureFunctionType) v2).getReturnType()));
    }
    if (!_matched) {
      if (v instanceof DataType) {
        _matched=true;
        return ((v2 instanceof DataType) && ((DataType)v).getType().getName().equals(((DataType) v2).getType().getName()));
      }
    }
    EClass _eClass = v.eClass();
    EClass _eClass_1 = v2.eClass();
    return Objects.equal(_eClass, _eClass_1);
  }
  
  public static boolean TypeEquals(final Type t, final Type t1) {
    if ((t1 instanceof UnitType)) {
      return true;
    }
    boolean _matched = false;
    if (t instanceof EffectFullFunctionType) {
      _matched=true;
      return (((t1 instanceof EffectFullFunctionType) && 
        Checks.TypeEquals(((EffectFullFunctionType)t).getArgType(), ((EffectFullFunctionType) t1).getArgType())) && 
        Checks.TypeEquals(((EffectFullFunctionType)t).getReturnType(), ((EffectFullFunctionType) t1).getReturnType()));
    }
    if (!_matched) {
      if (t instanceof UnitType) {
        _matched=true;
        return false;
      }
    }
    return Checks.ValueTypeEquals(((ValueType) t), ((ValueType) t1));
  }
  
  public static boolean functionReturnType(final PureFunctionDefinition f) {
    return (Checks.ValueTypeEquals(GetReturnType.pureFunctionDefinition(f), f.getReturnType()) || Objects.equal(GetReturnType.pureFunctionDefinition(f), null));
  }
}
