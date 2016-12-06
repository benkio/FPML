package it.unibo.validation.utilitiesFunctions;

import com.google.common.base.Objects;
import it.unibo.fPML.ApplyF;
import it.unibo.fPML.ApplyFFactor;
import it.unibo.fPML.ApplyFIO;
import it.unibo.fPML.ApplyFIOFactor;
import it.unibo.fPML.Argument;
import it.unibo.fPML.CompositionFunctionBodyEffect;
import it.unibo.fPML.CompositionFunctionBodyEffectFullFactor;
import it.unibo.fPML.CompositionFunctionBodyPure;
import it.unibo.fPML.CompositionFunctionBodyPureFactor;
import it.unibo.fPML.DataType;
import it.unibo.fPML.DataValue;
import it.unibo.fPML.EffectFullAlgebraicType;
import it.unibo.fPML.EffectFullArgument;
import it.unibo.fPML.EffectFullDataType;
import it.unibo.fPML.EffectFullFunctionDefinition;
import it.unibo.fPML.EffectFullFunctionType;
import it.unibo.fPML.EffectFullLambda;
import it.unibo.fPML.EffectFullReference;
import it.unibo.fPML.EffectFullType;
import it.unibo.fPML.EmptyFunctionBody;
import it.unibo.fPML.Expression;
import it.unibo.fPML.FPMLFactory;
import it.unibo.fPML.FunctionBodyEffectFull;
import it.unibo.fPML.FunctionBodyPure;
import it.unibo.fPML.IOType;
import it.unibo.fPML.IntegerType;
import it.unibo.fPML.MainFunc;
import it.unibo.fPML.PureAlgebraicType;
import it.unibo.fPML.PureFunction;
import it.unibo.fPML.PureFunctionDefinition;
import it.unibo.fPML.PureFunctionType;
import it.unibo.fPML.PureLambda;
import it.unibo.fPML.PureProdTypeFactor;
import it.unibo.fPML.PureProdValue;
import it.unibo.fPML.PureSumTypeFactor;
import it.unibo.fPML.PureSumValue;
import it.unibo.fPML.PureValue;
import it.unibo.fPML.PureValueRef;
import it.unibo.fPML.StringType;
import it.unibo.fPML.Type;
import it.unibo.fPML.UnitType;
import it.unibo.fPML.ValueType;
import it.unibo.fPML.VoidType;
import it.unibo.validation.utilitiesFunctions.GetArgType;
import it.unibo.validation.utilitiesFunctions.GetReturnType;
import it.unibo.validation.utilitiesFunctions.Others;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;

@SuppressWarnings("all")
public class Checks {
  public static boolean DataAndValue(final Expression value, final ValueType type) {
    boolean _switchResult = false;
    boolean _matched = false;
    if (type instanceof IntegerType) {
      _matched=true;
      return ((value instanceof IntegerType) || ((value instanceof PureValueRef) && 
        Checks.checkValueType(((PureValueRef) value).getValue(), type)));
    }
    if (!_matched) {
      if (type instanceof StringType) {
        _matched=true;
        return ((value instanceof StringType) || ((value instanceof PureValueRef) && 
          Checks.checkValueType(((PureValueRef) value).getValue(), type)));
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
          if (((value instanceof PureValueRef) && (((PureValueRef) value).getValue() instanceof PureFunctionDefinition))) {
            return (Checks.ValueTypeEquals(((PureFunctionDefinition) ((PureValueRef) value).getValue()).getArg().getType(), ((PureFunctionType)type).getArgType()) && 
              Checks.ValueTypeEquals(((PureFunctionDefinition) ((PureValueRef) value).getValue()).getReturnType(), ((PureFunctionType)type).getReturnType()));
          }
        }
      }
    }
    if (!_matched) {
      if (type instanceof PureAlgebraicType) {
        _matched=true;
        boolean _switchResult_1 = false;
        boolean _matched_1 = false;
        if (value instanceof PureSumValue) {
          _matched_1=true;
          return ((((PureAlgebraicType) type).getPureAdtElement2() instanceof PureSumTypeFactor) && (Boolean.valueOf(Checks.DataAndValue(((PureSumValue)value).getSumAdtElement1(), ((PureAlgebraicType) type).getPureAdtElement1())).booleanValue() || Boolean.valueOf(Checks.DataAndValue(((PureSumValue)value).getSumAdtElement2(), Others.getElement2ValueTypeFromPureAlgebraicType(((PureAlgebraicType) type)))).booleanValue()));
        }
        if (!_matched_1) {
          if (value instanceof PureProdValue) {
            _matched_1=true;
            return ((((PureAlgebraicType) type).getPureAdtElement2() instanceof PureProdTypeFactor) && (Boolean.valueOf(Checks.DataAndValue(((PureProdValue)value).getProdAdtElement1(), ((PureAlgebraicType) type).getPureAdtElement1())).booleanValue() && Boolean.valueOf(Checks.DataAndValue(((PureProdValue)value).getProdAdtElement2(), Others.getElement2ValueTypeFromPureAlgebraicType(((PureAlgebraicType) type)))).booleanValue()));
          }
        }
        if (!_matched_1) {
          if (value instanceof PureValueRef) {
            _matched_1=true;
            return ((((PureValueRef)value).getValue().getValue() instanceof DataValue) && Checks.ValueTypeEquals(((DataValue) ((PureValueRef)value).getValue().getValue()).getType().getContent(), type));
          }
        }
        if (!_matched_1) {
          _switchResult_1 = false;
        }
        _switchResult = _switchResult_1;
      }
    }
    if (!_matched) {
      _switchResult = false;
    }
    return _switchResult;
  }
  
  public static boolean checkValueType(final PureValue v, final ValueType adtt) {
    boolean _xblockexpression = false;
    {
      Expression _value = v.getValue();
      final ValueType valueType = GetReturnType.expression(_value);
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
    if ((v2 instanceof VoidType)) {
      return false;
    }
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
    if (!_matched) {
      if (v instanceof PureAlgebraicType) {
        _matched=true;
        return (((v2 instanceof PureAlgebraicType) && 
          Checks.ValueTypeEquals(((PureAlgebraicType)v).getPureAdtElement1(), ((PureAlgebraicType) v2).getPureAdtElement1())) && 
          Checks.ValueTypeEquals(Others.getElement2ValueTypeFromPureAlgebraicType(((PureAlgebraicType)v)), Others.getElement2ValueTypeFromPureAlgebraicType(((PureAlgebraicType) v2))));
      }
    }
    if (!_matched) {
      if (v instanceof VoidType) {
        _matched=true;
        return false;
      }
    }
    if (!_matched) {
      if (v instanceof UnitType) {
        _matched=true;
        return (v2 instanceof UnitType);
      }
    }
    return ((v2 instanceof UnitType) || Objects.equal(v.eClass(), v2.eClass()));
  }
  
  public static boolean TypeEquals(final Type t, final Type t1) {
    if (((t1 instanceof UnitType) || ((t instanceof UnitType) && Objects.equal(t1, null)))) {
      return true;
    }
    if (((t instanceof VoidType) || (t1 instanceof VoidType))) {
      return false;
    }
    boolean _matched = false;
    if (t instanceof EffectFullFunctionType) {
      _matched=true;
      return (((t1 instanceof EffectFullFunctionType) && 
        Checks.TypeEquals(((EffectFullFunctionType)t).getArgType(), ((EffectFullFunctionType) t1).getArgType())) && 
        Checks.TypeEquals(((EffectFullFunctionType)t).getReturnType().getType(), ((EffectFullFunctionType) t1).getReturnType().getType()));
    }
    if (!_matched) {
      if (t instanceof UnitType) {
        _matched=true;
        return false;
      }
    }
    if (!_matched) {
      if (t instanceof IOType) {
        _matched=true;
        return ((t1 instanceof IOType) && Checks.TypeEquals(((IOType)t).getType(), ((IOType) t1).getType()));
      }
    }
    if (!_matched) {
      if (t instanceof EffectFullDataType) {
        _matched=true;
        return ((t1 instanceof EffectFullDataType) && ((EffectFullDataType)t).getType().getName().equals(((EffectFullDataType) t1).getType().getName()));
      }
    }
    if (!_matched) {
      if (t instanceof EffectFullAlgebraicType) {
        _matched=true;
        return (((t1 instanceof EffectFullAlgebraicType) && 
          Checks.TypeEquals(((EffectFullAlgebraicType)t).getEffectFullAdtElement1(), ((EffectFullAlgebraicType) t1).getEffectFullAdtElement1())) && 
          Checks.TypeEquals(Others.getElement2ValueTypeFromEffectFullAlgebraicType(((EffectFullAlgebraicType)t)), Others.getElement2ValueTypeFromEffectFullAlgebraicType(((EffectFullAlgebraicType) t1))));
      }
    }
    return ((t1 instanceof ValueType) && Checks.ValueTypeEquals(((ValueType) t), ((ValueType) t1)));
  }
  
  public static boolean functionReturnType(final PureFunctionDefinition f) {
    return (Checks.ValueTypeEquals(GetReturnType.pureFunctionDefinition(f), f.getReturnType()) || Objects.equal(GetReturnType.pureFunctionDefinition(f), null));
  }
  
  public static boolean mainReturnType(final MainFunc m) {
    return (Checks.TypeEquals(GetReturnType.mainFunc(m), FPMLFactory.eINSTANCE.createUnitType()) || Objects.equal(GetReturnType.mainFunc(m), null));
  }
  
  public static boolean functionArgType(final PureFunctionDefinition f) {
    FunctionBodyPure _functionBody = f.getFunctionBody();
    Argument _arg = f.getArg();
    ValueType _type = _arg.getType();
    return Checks.functionBody(_functionBody, _type);
  }
  
  public static boolean pureLambda(final PureLambda lambda) {
    final ValueType arg = GetArgType.pureLambda(lambda);
    FunctionBodyPure _functionBody = lambda.getFunctionBody();
    return Checks.functionBody(_functionBody, arg);
  }
  
  public static boolean functionBody(final FunctionBodyPure pure, final ValueType argType) {
    boolean _matched = false;
    if (pure instanceof EmptyFunctionBody) {
      _matched=true;
      return true;
    }
    if (!_matched) {
      if (pure instanceof CompositionFunctionBodyPure) {
        _matched=true;
        return Checks.compositionFunctionBodyPure(((CompositionFunctionBodyPure)pure), argType);
      }
    }
    return false;
  }
  
  public static boolean compositionFunctionBodyPure(final CompositionFunctionBodyPure pure, final ValueType argType) {
    final PureFunction first = Others.getFirstFunctionDefinitionFromCompositionBodyPure(pure);
    EList<CompositionFunctionBodyPureFactor> _functionChain = pure.getFunctionChain();
    final Function1<CompositionFunctionBodyPureFactor, PureFunction> _function = (CompositionFunctionBodyPureFactor x) -> {
      return Others.getFunctionDefinitionFromPureFactor(x);
    };
    List<PureFunction> _map = ListExtensions.<CompositionFunctionBodyPureFactor, PureFunction>map(_functionChain, _function);
    final List<PureFunction> chain = IterableExtensions.<PureFunction>toList(_map);
    return Checks.functionChainPure(chain, first, argType);
  }
  
  public static boolean functionChainPure(final List<PureFunction> functions, final PureFunction first, final ValueType type) {
    if ((type instanceof VoidType)) {
      return false;
    }
    ValueType startType = type;
    final ValueType argFuncFirst = GetArgType.pureFunction(first);
    boolean _ValueTypeEquals = Checks.ValueTypeEquals(startType, argFuncFirst);
    boolean _not = (!_ValueTypeEquals);
    if (_not) {
      return false;
    }
    ValueType _pureFunction = GetReturnType.pureFunction(first);
    startType = _pureFunction;
    for (final PureFunction f : functions) {
      {
        final ValueType argFunc = GetArgType.pureFunction(f);
        if ((((!Objects.equal(startType, null)) && (!Objects.equal(argFunc, null))) && (!Checks.ValueTypeEquals(startType, argFunc)))) {
          return false;
        }
        ValueType _pureFunction_1 = GetReturnType.pureFunction(f);
        startType = _pureFunction_1;
      }
    }
    return true;
  }
  
  public static boolean mainArgType(final MainFunc func) {
    FunctionBodyEffectFull _functionBody = func.getFunctionBody();
    UnitType _createUnitType = FPMLFactory.eINSTANCE.createUnitType();
    return Checks.functionBodyEffectFull(_functionBody, _createUnitType);
  }
  
  public static boolean functionBodyEffectFull(final FunctionBodyEffectFull full, final Type argType) {
    boolean _switchResult = false;
    boolean _matched = false;
    if (full instanceof EmptyFunctionBody) {
      _matched=true;
      return true;
    }
    if (!_matched) {
      if (full instanceof CompositionFunctionBodyEffect) {
        _matched=true;
        _switchResult = Checks.compositionFunctioBodyEffect(((CompositionFunctionBodyEffect)full), argType);
      }
    }
    return _switchResult;
  }
  
  public static boolean compositionFunctioBodyEffect(final CompositionFunctionBodyEffect effect, final Type argType) {
    final EffectFullReference first = Others.getFirstFunctionDefinitionFromCompositionBodyEffectFull(effect);
    EList<CompositionFunctionBodyEffectFullFactor> _functionChain = effect.getFunctionChain();
    final Function1<CompositionFunctionBodyEffectFullFactor, EffectFullReference> _function = (CompositionFunctionBodyEffectFullFactor x) -> {
      return Others.getFunctionDefinitionFromEffectFullFactor(x);
    };
    List<EffectFullReference> _map = ListExtensions.<CompositionFunctionBodyEffectFullFactor, EffectFullReference>map(_functionChain, _function);
    final List<EffectFullReference> chain = IterableExtensions.<EffectFullReference>toList(_map);
    return Checks.functionChainEffectFull(chain, first, argType);
  }
  
  public static boolean functionChainEffectFull(final List<EffectFullReference> references, final EffectFullReference first, final Type type) {
    if ((type instanceof VoidType)) {
      return false;
    }
    Type startType = type;
    final Type argFuncFirst = GetArgType.effectFullReference(first);
    boolean _TypeEquals = Checks.TypeEquals(startType, argFuncFirst);
    boolean _not = (!_TypeEquals);
    if (_not) {
      return false;
    }
    Type _effectFullReference = GetReturnType.effectFullReference(first);
    startType = _effectFullReference;
    for (final EffectFullReference r : references) {
      {
        final Type argFunc = GetArgType.effectFullReference(r);
        if (((((!Objects.equal(startType, null)) && (!Objects.equal(argFunc, null))) && (startType instanceof IOType)) && (!Checks.TypeEquals(((IOType) startType).getType(), argFunc)))) {
          return false;
        }
        Type _effectFullReference_1 = GetReturnType.effectFullReference(r);
        startType = _effectFullReference_1;
      }
    }
    return true;
  }
  
  public static boolean functionReturnTypeEffectFull(final EffectFullFunctionDefinition definition) {
    return (Checks.TypeEquals(GetReturnType.effectFullFunctionDefinition(definition), definition.getReturnType()) || Objects.equal(GetReturnType.effectFullFunctionDefinition(definition), null));
  }
  
  public static boolean functionArgTypeEffectFull(final EffectFullFunctionDefinition definition) {
    FunctionBodyEffectFull _functionBody = definition.getFunctionBody();
    EffectFullArgument _arg = definition.getArg();
    Type _type = _arg.getType();
    return Checks.functionBodyEffectFull(_functionBody, _type);
  }
  
  public static boolean effectFullLambda(final EffectFullLambda lambda) {
    final Type arg = GetArgType.effectFullLambda(lambda);
    FunctionBodyEffectFull _functionBody = lambda.getFunctionBody();
    return Checks.functionBodyEffectFull(_functionBody, arg);
  }
  
  public static boolean effectFullDataAndValue(final /* EffectFullAdtValue */Object value, final EffectFullType type) {
    throw new Error("Unresolved compilation problems:"
      + "\nEffectFullAdtValue cannot be resolved to a type."
      + "\nEffectFullAdtValue cannot be resolved to a type."
      + "\nThe method effectFullDataAndValue(EffectFullAdtValue, EffectFullType) from the type Checks refers to the missing type EffectFullAdtValue"
      + "\nThe method effectFullDataAndValue(EffectFullAdtValue, EffectFullType) from the type Checks refers to the missing type EffectFullAdtValue"
      + "\nThe method effectFullDataAndValue(EffectFullAdtValue, EffectFullType) from the type Checks refers to the missing type EffectFullAdtValue"
      + "\nThe method effectFullDataAndValue(EffectFullAdtValue, EffectFullType) from the type Checks refers to the missing type EffectFullAdtValue"
      + "\nThe method effectFullDataAndValue(EffectFullAdtValue, EffectFullType) from the type Checks refers to the missing type EffectFullAdtValue"
      + "\nUnreachable code: The case can never match. It is already handled by a previous condition."
      + "\nThe method effectFullDataAndValue(EffectFullAdtValue, EffectFullType) from the type Checks refers to the missing type EffectFullAdtValue"
      + "\nsumAdtElement1 cannot be resolved"
      + "\nsumAdtElement2 cannot be resolved"
      + "\nprodAdtElement1 cannot be resolved"
      + "\nprodAdtElement2 cannot be resolved"
      + "\nvalue cannot be resolved"
      + "\nvalue cannot be resolved"
      + "\ninnerValue cannot be resolved"
      + "\ninnerValue cannot be resolved"
      + "\ninnerValue cannot be resolved");
  }
  
  public static boolean applyF(final ApplyF af) {
    ApplyFFactor _value = af.getValue();
    PureFunctionDefinition _valueLambda = _value.getValueLambda();
    boolean _equals = Objects.equal(_valueLambda, null);
    if (_equals) {
      PureFunctionType _functionType = af.getFunctionType();
      ValueType _argType = _functionType.getArgType();
      ApplyFFactor _value_1 = af.getValue();
      PureFunction _valueReference = _value_1.getValueReference();
      ValueType _pureFunction = GetReturnType.pureFunction(_valueReference);
      return Checks.ValueTypeEquals(_argType, _pureFunction);
    } else {
      return ((((af.getFunctionType().getArgType() instanceof PureFunctionType) && Checks.ValueTypeEquals(((PureFunctionType) af.getFunctionType().getArgType()).getReturnType(), GetReturnType.pureFunctionDefinition(af.getValue().getValueLambda()))) && Checks.ValueTypeEquals(((PureFunctionType) af.getFunctionType().getArgType()).getArgType(), GetArgType.pureFunctionDefinition(af.getValue().getValueLambda()))) || (Objects.equal(af.getValue().getValueLambda().getArg(), null) && Checks.ValueTypeEquals(af.getFunctionType().getArgType(), GetReturnType.pureFunctionDefinition(af.getValue().getValueLambda()))));
    }
  }
  
  public static boolean applyFIO(final ApplyFIO afio) {
    EffectFullFunctionType _functionType = afio.getFunctionType();
    Type _argType = _functionType.getArgType();
    ApplyFIOFactor _value = afio.getValue();
    EffectFullReference _valueFromApplyFIOFactor = Others.getValueFromApplyFIOFactor(_value);
    Type _effectFullReference = GetReturnType.effectFullReference(_valueFromApplyFIOFactor);
    return Checks.TypeEquals(_argType, _effectFullReference);
  }
}
