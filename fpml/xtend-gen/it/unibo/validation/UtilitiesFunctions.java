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
import it.unibo.fPML.DataType;
import it.unibo.fPML.DataValue;
import it.unibo.fPML.EffectFullArgument;
import it.unibo.fPML.EffectFullFunctionDefinition;
import it.unibo.fPML.EffectFullFunctionType;
import it.unibo.fPML.Expression;
import it.unibo.fPML.FPMLFactory;
import it.unibo.fPML.FunctionBodyPure;
import it.unibo.fPML.IOType;
import it.unibo.fPML.IntPow;
import it.unibo.fPML.IntToString;
import it.unibo.fPML.IntegerType;
import it.unibo.fPML.Minus;
import it.unibo.fPML.Mod;
import it.unibo.fPML.Plus;
import it.unibo.fPML.PrimitivePrint;
import it.unibo.fPML.ProdType;
import it.unibo.fPML.ProdValue;
import it.unibo.fPML.PureFunctionDefinition;
import it.unibo.fPML.PureFunctionType;
import it.unibo.fPML.PureLambda;
import it.unibo.fPML.PureReference;
import it.unibo.fPML.ReturnPureFunction;
import it.unibo.fPML.StringType;
import it.unibo.fPML.SumType;
import it.unibo.fPML.SumValue;
import it.unibo.fPML.Times;
import it.unibo.fPML.Type;
import it.unibo.fPML.UnitType;
import it.unibo.fPML.Value;
import it.unibo.fPML.ValueRef;
import it.unibo.fPML.ValueType;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

/**
 * Created by benkio on 11/3/16.
 */
@SuppressWarnings("all")
public class UtilitiesFunctions {
  public static ValueType getReturnType(final PureFunctionDefinition pf) {
    final ValueType t = pf.getReturnType();
    boolean _equals = Objects.equal(t, null);
    if (_equals) {
      return UtilitiesFunctions.getReturnTypePurePrimitiveOrLambda(pf);
    }
    return t;
  }
  
  public static Type getReturnType(final EffectFullFunctionDefinition ef) {
    final IOType t = ef.getReturnType();
    boolean _equals = Objects.equal(t, null);
    if (_equals) {
      return UtilitiesFunctions.getReturnTypeEffectFullPrimitive(ef);
    } else {
      Type _type = t.getType();
      boolean _matched = false;
      if (_type instanceof DataType) {
        _matched=true;
        return ((DataType) t);
      }
      return t.getType();
    }
  }
  
  public static Type getReturnType(final ChainElement f1) {
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
    if (!_matched) {
      if (f1 instanceof EffectFullArgument) {
        _matched=true;
        return ((EffectFullArgument)f1).getType();
      }
    }
    return null;
  }
  
  public static ValueType getReturnTypePurePrimitiveOrLambda(final PureFunctionDefinition pf) {
    boolean _matched = false;
    if (pf instanceof IntToString) {
      _matched=true;
      return FPMLFactory.eINSTANCE.createStringType();
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
        return UtilitiesFunctions.createIntIntFuntionType();
      }
    }
    if (!_matched) {
      if (pf instanceof Minus) {
        _matched=true;
        return UtilitiesFunctions.createIntIntFuntionType();
      }
    }
    if (!_matched) {
      if (pf instanceof Times) {
        _matched=true;
        return UtilitiesFunctions.createIntIntFuntionType();
      }
    }
    if (!_matched) {
      if (pf instanceof Mod) {
        _matched=true;
        return UtilitiesFunctions.createIntIntFuntionType();
      }
    }
    throw new UnsupportedOperationException("TODO");
  }
  
  public static ValueType getReturnTypeCompositionFunctionBodyPure(final CompositionFunctionBodyPure cfbp) {
    try {
      ReturnPureFunction _returnFunction = cfbp.getReturnFunction();
      boolean _equals = Objects.equal(_returnFunction, null);
      if (_equals) {
        EList<CompositionFunctionBodyPureFactor> _functionChain = cfbp.getFunctionChain();
        CompositionFunctionBodyPureFactor _last = IterableExtensions.<CompositionFunctionBodyPureFactor>last(_functionChain);
        PureFunctionDefinition _functionDefinitionFromPureFactor = UtilitiesFunctions.getFunctionDefinitionFromPureFactor(_last);
        return UtilitiesFunctions.getReturnType(_functionDefinitionFromPureFactor);
      } else {
        ReturnPureFunction _returnFunction_1 = cfbp.getReturnFunction();
        PureLambda _lambdaFunctionBody = _returnFunction_1.getLambdaFunctionBody();
        FunctionBodyPure _functionBody = _lambdaFunctionBody.getFunctionBody();
        if ((_functionBody instanceof CompositionFunctionBodyPure)) {
          ReturnPureFunction _returnFunction_2 = cfbp.getReturnFunction();
          PureLambda _lambdaFunctionBody_1 = _returnFunction_2.getLambdaFunctionBody();
          FunctionBodyPure _functionBody_1 = _lambdaFunctionBody_1.getFunctionBody();
          return UtilitiesFunctions.getReturnTypeCompositionFunctionBodyPure(((CompositionFunctionBodyPure) _functionBody_1));
        } else {
          throw new Exception("this cannot happen during the typechecking of a compositionFunction body pure");
        }
      }
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public static Type getReturnTypeEffectFullPrimitive(final EffectFullFunctionDefinition ef) {
    boolean _matched = false;
    if (ef instanceof PrimitivePrint) {
      _matched=true;
      return FPMLFactory.eINSTANCE.createUnitType();
    }
    return null;
  }
  
  public static ValueType getArgType(final PureFunctionDefinition pf) {
    final Argument t = pf.getArg();
    boolean _equals = Objects.equal(t, null);
    if (_equals) {
      return UtilitiesFunctions.getArgTypePurePrimitive(pf);
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
  
  public static Type getArgType(final EffectFullFunctionDefinition ef) {
    final EffectFullArgument t = ef.getArg();
    boolean _equals = Objects.equal(t, null);
    if (_equals) {
      return UtilitiesFunctions.getArgTypeEffectFullPrimitive(ef);
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
  
  public static Type getArgType(final ChainElement f1) {
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
    if (!_matched) {
      if (f1 instanceof EffectFullArgument) {
        _matched=true;
        return ((EffectFullArgument)f1).getType();
      }
    }
    return null;
  }
  
  public static ValueType getArgTypePurePrimitive(final PureFunctionDefinition pf) {
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
    return null;
  }
  
  public static Type getArgTypeEffectFullPrimitive(final EffectFullFunctionDefinition ef) {
    boolean _matched = false;
    if (ef instanceof PrimitivePrint) {
      _matched=true;
      return FPMLFactory.eINSTANCE.createStringType();
    }
    return null;
  }
  
  public static Type getTypeFromExpression(final Expression e) {
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
        return ((DataType) e);
      }
    }
    if (!_matched) {
      if (e instanceof PureFunctionType) {
        _matched=true;
        return ((PureFunctionType) e);
      }
    }
    return null;
  }
  
  public static boolean typeCheckDataAndValue(final AdtValue value, final AdtType type) {
    boolean _switchResult = false;
    boolean _matched = false;
    if (type instanceof IntegerType) {
      _matched=true;
      return ((value instanceof IntegerType) || ((value instanceof ValueRef) && 
        UtilitiesFunctions.checkValueType(((ValueRef) value).getValue(), type)));
    }
    if (!_matched) {
      if (type instanceof StringType) {
        _matched=true;
        return ((value instanceof StringType) || ((value instanceof ValueRef) && 
          UtilitiesFunctions.checkValueType(((ValueRef) value).getValue(), type)));
      }
    }
    if (!_matched) {
      if (type instanceof DataType) {
        _matched=true;
        return ((value instanceof DataValue) && 
          UtilitiesFunctions.typeCheckDataAndValue(((DataValue) value).getValue(), ((DataType) type).getType().getContent()));
      }
    }
    if (!_matched) {
      if (type instanceof PureFunctionType) {
        _matched=true;
        if ((value instanceof PureFunctionType)) {
          return (((((PureFunctionType) value).getValue().getFunctionBody() instanceof CompositionFunctionBodyPure) && 
            UtilitiesFunctions.checkValueTypeEquals(((PureFunctionType) value).getValue().getArg().getType(), ((PureFunctionType)type).getArgType())) && 
            UtilitiesFunctions.checkValueTypeEquals(UtilitiesFunctions.getReturnTypeCompositionFunctionBodyPure(((CompositionFunctionBodyPure) ((PureFunctionType) value).getValue().getFunctionBody())), ((PureFunctionType)type).getReturnType()));
        } else {
          if (((value instanceof ValueRef) && (((ValueRef) value).getValue() instanceof PureFunctionDefinition))) {
            return (UtilitiesFunctions.checkValueTypeEquals(UtilitiesFunctions.getArgType(((PureFunctionDefinition) ((ValueRef) value).getValue())), ((PureFunctionType)type).getArgType()) && 
              UtilitiesFunctions.checkValueTypeEquals(((PureFunctionDefinition) ((ValueRef) value).getValue()).getReturnType(), ((PureFunctionType)type).getReturnType()));
          }
        }
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
        if (value instanceof ValueRef) {
          _matched_1=true;
          PureReference _value = ((ValueRef)value).getValue();
          return UtilitiesFunctions.checkValueType(_value, type);
        }
      }
      if (!_matched_1) {
        _switchResult_1 = false;
      }
      _switchResult = _switchResult_1;
    }
    return _switchResult;
  }
  
  public static boolean checkValueType(final PureReference v, final AdtType adtt) {
    boolean _xifexpression = false;
    if ((v instanceof Value)) {
      boolean _xblockexpression = false;
      {
        Expression _value = ((Value)v).getValue();
        final Type valueType = UtilitiesFunctions.getTypeFromExpression(_value);
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
            _switchResult = (((valueType instanceof PureFunctionType) && UtilitiesFunctions.checkValueTypeEquals(((PureFunctionType)adtt).getArgType(), ((PureFunctionType) valueType).getArgType())) && UtilitiesFunctions.checkValueTypeEquals(((PureFunctionType)adtt).getReturnType(), ((PureFunctionType) valueType).getReturnType()));
          }
        }
        if (!_matched) {
          _switchResult = false;
        }
        _xblockexpression = _switchResult;
      }
      _xifexpression = _xblockexpression;
    } else {
      return (((adtt instanceof PureFunctionType) && UtilitiesFunctions.checkValueTypeEquals(UtilitiesFunctions.getArgType(((PureFunctionDefinition) v)), ((PureFunctionType) adtt).getArgType())) && UtilitiesFunctions.checkValueTypeEquals(((PureFunctionDefinition) v).getReturnType(), ((PureFunctionType) adtt).getReturnType()));
    }
    return _xifexpression;
  }
  
  public static boolean checkValueTypeEquals(final ValueType v, final ValueType v2) {
    boolean _matched = false;
    if (v instanceof PureFunctionType) {
      _matched=true;
      return (((v2 instanceof PureFunctionType) && 
        UtilitiesFunctions.checkValueTypeEquals(((PureFunctionType)v).getArgType(), ((PureFunctionType) v2).getArgType())) && 
        UtilitiesFunctions.checkValueTypeEquals(((PureFunctionType)v).getReturnType(), ((PureFunctionType) v2).getReturnType()));
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
  
  public static boolean checkTypeEquals(final Type t, final Type t1) {
    if ((t1 instanceof UnitType)) {
      return true;
    }
    boolean _matched = false;
    if (t instanceof EffectFullFunctionType) {
      _matched=true;
      return (((t1 instanceof EffectFullFunctionType) && 
        UtilitiesFunctions.checkTypeEquals(((EffectFullFunctionType)t).getArgType(), ((EffectFullFunctionType) t1).getArgType())) && 
        UtilitiesFunctions.checkTypeEquals(((EffectFullFunctionType)t).getReturnType().getType(), ((EffectFullFunctionType) t1).getReturnType().getType()));
    }
    if (!_matched) {
      if (t instanceof UnitType) {
        _matched=true;
        return false;
      }
    }
    return UtilitiesFunctions.checkValueTypeEquals(((ValueType) t), ((ValueType) t1));
  }
  
  public static boolean isInputTypeCompatibleWithArgType(final Type argType, final Type inputType) {
    return ((argType instanceof DataType) && (((!Objects.equal(((DataType) argType).getAdtElement2(), null)) && (((DataType) argType).getAdtElement2() instanceof ProdType)) && Objects.equal(((DataType) argType).getAdtElement1().eClass(), inputType.eClass())));
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
    ChainElement _primitiveElement = cfbef.getPrimitiveElement();
    boolean _equals = Objects.equal(_primitiveElement, null);
    if (_equals) {
      return cfbef.getReferenceElement();
    } else {
      return cfbef.getPrimitiveElement();
    }
  }
  
  public static PureFunctionDefinition getFirstFunctionDefinitionFromCompositionBodyPure(final CompositionFunctionBodyPure cfbp) {
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
  
  public static PureFunctionType createIntIntFuntionType() {
    final PureFunctionType func = FPMLFactory.eINSTANCE.createPureFunctionType();
    final PureFunctionType returnFunc = FPMLFactory.eINSTANCE.createPureFunctionType();
    IntegerType _createIntegerType = FPMLFactory.eINSTANCE.createIntegerType();
    returnFunc.setArgType(_createIntegerType);
    IntegerType _createIntegerType_1 = FPMLFactory.eINSTANCE.createIntegerType();
    returnFunc.setReturnType(_createIntegerType_1);
    IntegerType _createIntegerType_2 = FPMLFactory.eINSTANCE.createIntegerType();
    func.setArgType(_createIntegerType_2);
    func.setReturnType(returnFunc);
    return func;
  }
}
