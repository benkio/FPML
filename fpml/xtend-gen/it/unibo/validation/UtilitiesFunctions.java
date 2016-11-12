package it.unibo.validation;

import com.google.common.base.Objects;
import it.unibo.fPML.AdtType;
import it.unibo.fPML.AdtValue;
import it.unibo.fPML.Argument;
import it.unibo.fPML.ChainElement;
import it.unibo.fPML.CompositionFunctionBodyEffect;
import it.unibo.fPML.CompositionFunctionBodyEffectFullFactor;
import it.unibo.fPML.CompositionFunctionBodyPure;
import it.unibo.fPML.CompositionFunctionBodyPureFactor;
import it.unibo.fPML.Data;
import it.unibo.fPML.DataType;
import it.unibo.fPML.DataValue;
import it.unibo.fPML.EffectFullArgument;
import it.unibo.fPML.EffectFullFunctionDefinition;
import it.unibo.fPML.Expression;
import it.unibo.fPML.FPMLFactory;
import it.unibo.fPML.IOType;
import it.unibo.fPML.InitialPureChainElement;
import it.unibo.fPML.IntToString;
import it.unibo.fPML.IntegerType;
import it.unibo.fPML.PrimitivePrint;
import it.unibo.fPML.ProdType;
import it.unibo.fPML.ProdValue;
import it.unibo.fPML.PureFunctionDefinition;
import it.unibo.fPML.StringType;
import it.unibo.fPML.SumType;
import it.unibo.fPML.SumValue;
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
  public static EObject getReturnType(final PureFunctionDefinition pf) {
    final ValueType t = pf.getReturnType();
    boolean _matched = false;
    if (t instanceof DataType) {
      _matched=true;
      return ((DataType)t).getType();
    }
    if (!_matched) {
      if (t instanceof IntToString) {
        _matched=true;
        return FPMLFactory.eINSTANCE.createStringType();
      }
    }
    return t;
  }
  
  public static EObject getReturnType(final EffectFullFunctionDefinition ef) {
    IOType _returnType = ef.getReturnType();
    final Type t = _returnType.getType();
    boolean _matched = false;
    if (t instanceof DataType) {
      _matched=true;
      return ((DataType) t).getType();
    }
    if (!_matched) {
      if (t instanceof PrimitivePrint) {
        _matched=true;
        final IOType t1 = FPMLFactory.eINSTANCE.createIOType();
        UnitType _createUnitType = FPMLFactory.eINSTANCE.createUnitType();
        t1.setType(_createUnitType);
        return t1;
      }
    }
    return t;
  }
  
  public static EObject getReturnType(final ChainElement f1) {
    boolean _matched = false;
    if (f1 instanceof EffectFullFunctionDefinition) {
      _matched=true;
      return UtilitiesFunctions.getReturnType(((EffectFullFunctionDefinition)f1));
    }
    if (!_matched) {
      if (f1 instanceof PureFunctionDefinition) {
        _matched=true;
        return UtilitiesFunctions.getReturnType(((PureFunctionDefinition)f1));
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
    if (f1 instanceof PureFunctionDefinition) {
      _matched=true;
      return UtilitiesFunctions.getReturnType(((PureFunctionDefinition)f1));
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
  
  public static EObject getArgType(final PureFunctionDefinition pf) {
    Argument _arg = pf.getArg();
    final ValueType t = _arg.getType();
    boolean _matched = false;
    if (t instanceof DataType) {
      _matched=true;
      return ((DataType)t).getType();
    }
    if (!_matched) {
      if (t instanceof IntToString) {
        _matched=true;
        return FPMLFactory.eINSTANCE.createIntegerType();
      }
    }
    return t;
  }
  
  public static EObject getArgType(final EffectFullFunctionDefinition ef) {
    EffectFullArgument _arg = ef.getArg();
    final Type t = _arg.getType();
    boolean _matched = false;
    if (t instanceof DataType) {
      _matched=true;
      return ((DataType)t).getType();
    }
    if (!_matched) {
      if (t instanceof PrimitivePrint) {
        _matched=true;
        return FPMLFactory.eINSTANCE.createStringType();
      }
    }
    return t;
  }
  
  public static EObject getArgType(final ChainElement f1) {
    boolean _matched = false;
    if (f1 instanceof EffectFullFunctionDefinition) {
      _matched=true;
      return UtilitiesFunctions.getArgType(((EffectFullFunctionDefinition)f1));
    }
    if (!_matched) {
      if (f1 instanceof PureFunctionDefinition) {
        _matched=true;
        return UtilitiesFunctions.getArgType(((PureFunctionDefinition)f1));
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
    if (f1 instanceof PureFunctionDefinition) {
      _matched=true;
      return UtilitiesFunctions.getArgType(((PureFunctionDefinition)f1));
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
  
  public static boolean typeCheckDataAndValue(final AdtValue value, final AdtType type) {
    boolean _switchResult = false;
    boolean _matched = false;
    if (type instanceof IntegerType) {
      _matched=true;
      return (value instanceof IntegerType);
    }
    if (!_matched) {
      if (type instanceof StringType) {
        _matched=true;
        return (value instanceof StringType);
      }
    }
    if (!_matched) {
      if (type instanceof DataType) {
        _matched=true;
        AdtValue _value = ((DataValue) value).getValue();
        Data _type = ((DataType) type).getType();
        AdtType _content = _type.getContent();
        return UtilitiesFunctions.typeCheckDataAndValue(_value, _content);
      }
    }
    if (!_matched) {
      boolean _switchResult_1 = false;
      boolean _matched_1 = false;
      if (value instanceof SumValue) {
        _matched_1=true;
        return ((type.getAdtElement2() instanceof SumType) && (Boolean.valueOf(UtilitiesFunctions.typeCheckDataAndValue(((SumValue)value).getSumAdtElement1(), type.getAdtElement1())).booleanValue() || Boolean.valueOf(UtilitiesFunctions.typeCheckDataAndValue(((SumValue)value).getSumAdtElement2(), ((SumType) type.getAdtElement2()).getAdtElement())).booleanValue()));
      }
      if (!_matched_1) {
        if (value instanceof ProdValue) {
          _matched_1=true;
          return ((type.getAdtElement2() instanceof ProdType) && (Boolean.valueOf(UtilitiesFunctions.typeCheckDataAndValue(((ProdValue)value).getProdAdtElement1(), type.getAdtElement1())).booleanValue() && Boolean.valueOf(UtilitiesFunctions.typeCheckDataAndValue(((ProdValue)value).getProdAdtElement2(), ((ProdType) type.getAdtElement2()).getAdtElement())).booleanValue()));
        }
      }
      if (!_matched_1) {
        _switchResult_1 = false;
      }
      _switchResult = _switchResult_1;
    }
    return _switchResult;
  }
  
  public static PureFunctionDefinition getFunctionDefinitionFromPureFactor(final CompositionFunctionBodyPureFactor cfbpf) {
    PureFunctionDefinition _primitiveElement = cfbpf.getPrimitiveElement();
    boolean _equals = Objects.equal(_primitiveElement, null);
    if (_equals) {
      return cfbpf.getReferenceElement();
    } else {
      return cfbpf.getPrimitiveElement();
    }
  }
  
  public static ChainElement getFunctionDefinitionFromEffectFullFactor(final CompositionFunctionBodyEffectFullFactor cfbef) {
    EffectFullFunctionDefinition _primitiveElement = cfbef.getPrimitiveElement();
    boolean _equals = Objects.equal(_primitiveElement, null);
    if (_equals) {
      return cfbef.getReferenceElement();
    } else {
      return cfbef.getPrimitiveElement();
    }
  }
  
  public static InitialPureChainElement getFirstFunctionDefinitionFromCompositionBodyPure(final CompositionFunctionBodyPure cfbp) {
    PureFunctionDefinition _primitiveElement = cfbp.getPrimitiveElement();
    boolean _equals = Objects.equal(_primitiveElement, null);
    if (_equals) {
      return cfbp.getReferenceElement();
    } else {
      return cfbp.getPrimitiveElement();
    }
  }
  
  public static ChainElement getFirstFunctionDefinitionFromCompositionBodyEffectFull(final CompositionFunctionBodyEffect cfbe) {
    EffectFullFunctionDefinition _primitiveElement = cfbe.getPrimitiveElement();
    boolean _equals = Objects.equal(_primitiveElement, null);
    if (_equals) {
      return cfbe.getReferenceElement();
    } else {
      return cfbe.getPrimitiveElement();
    }
  }
}
