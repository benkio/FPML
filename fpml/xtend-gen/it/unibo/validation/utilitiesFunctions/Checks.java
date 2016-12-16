package it.unibo.validation.utilitiesFunctions;

import com.google.common.base.Objects;
import it.unibo.fPML.ApplyF;
import it.unibo.fPML.ApplyFFactor;
import it.unibo.fPML.ApplyFIO;
import it.unibo.fPML.ApplyFIOFactor;
import it.unibo.fPML.Argument;
import it.unibo.fPML.BooleanType;
import it.unibo.fPML.CompositionFunctionBodyEffect;
import it.unibo.fPML.CompositionFunctionBodyEffectFullFactor;
import it.unibo.fPML.CompositionFunctionBodyPure;
import it.unibo.fPML.CompositionFunctionBodyPureFactor;
import it.unibo.fPML.DataType;
import it.unibo.fPML.DataValue;
import it.unibo.fPML.EffectFullAlgebraicType;
import it.unibo.fPML.EffectFullBodyContent;
import it.unibo.fPML.EffectFullData;
import it.unibo.fPML.EffectFullDataType;
import it.unibo.fPML.EffectFullDataValue;
import it.unibo.fPML.EffectFullExpression;
import it.unibo.fPML.EffectFullExpressionAndEffectFullFunctionReference;
import it.unibo.fPML.EffectFullFunction;
import it.unibo.fPML.EffectFullFunctionDefinition;
import it.unibo.fPML.EffectFullFunctionType;
import it.unibo.fPML.EffectFullLambda;
import it.unibo.fPML.EffectFullProdValue;
import it.unibo.fPML.EffectFullSumTypeFactor;
import it.unibo.fPML.EffectFullSumValue;
import it.unibo.fPML.EffectFullType;
import it.unibo.fPML.EffectFullValue;
import it.unibo.fPML.EffectFullValueRef;
import it.unibo.fPML.EmptyFunctionBody;
import it.unibo.fPML.Expression;
import it.unibo.fPML.FPMLFactory;
import it.unibo.fPML.FunctionBodyEffectFull;
import it.unibo.fPML.FunctionBodyPure;
import it.unibo.fPML.IOEffectFullExpression;
import it.unibo.fPML.IOEffectFullFunction;
import it.unibo.fPML.IOExpression;
import it.unibo.fPML.IOPureFunction;
import it.unibo.fPML.IOType;
import it.unibo.fPML.IntegerType;
import it.unibo.fPML.MainFunc;
import it.unibo.fPML.PrimitiveEffectFullFunction;
import it.unibo.fPML.PrimitivePureFunction;
import it.unibo.fPML.PureAlgebraicType;
import it.unibo.fPML.PureArgument;
import it.unibo.fPML.PureExpressionAndPureFunctionReference;
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
  public static boolean DataAndValue(final PureExpressionAndPureFunctionReference valueOrReference, final ValueType type) {
    boolean _xblockexpression = false;
    {
      PureFunction value = Others.getInnerElementFromPureExpressionAndPureFunctionReference(valueOrReference);
      boolean _switchResult = false;
      boolean _matched = false;
      if (type instanceof UnitType) {
        _matched=true;
        _switchResult = ((value instanceof UnitType) || ((value instanceof PureValueRef) && 
          Checks.TypeEquals(GetReturnType.expression(((PureValueRef) value).getValue().getValue()), type, false)));
      }
      if (!_matched) {
        if (type instanceof IntegerType) {
          _matched=true;
          return ((value instanceof IntegerType) || ((value instanceof PureValueRef) && 
            Checks.checkValueType(((PureValueRef) value).getValue(), type)));
        }
      }
      if (!_matched) {
        if (type instanceof StringType) {
          _matched=true;
          return ((value instanceof StringType) || ((value instanceof PureValueRef) && 
            Checks.checkValueType(((PureValueRef) value).getValue(), type)));
        }
      }
      if (!_matched) {
        if (type instanceof BooleanType) {
          _matched=true;
          return ((value instanceof BooleanType) || ((value instanceof PureValueRef) && 
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
          boolean _switchResult_1 = false;
          boolean _matched_1 = false;
          if (value instanceof PureValueRef) {
            _matched_1=true;
            _switchResult_1 = ((((PureValueRef)value).getValue() instanceof PureFunctionDefinition) && Checks.TypeEquals(Others.createTypeOfPureFunction(((PureValueRef) value).getValue()), type, false));
          }
          if (!_matched_1) {
            ValueType _createTypeOfPureFunction = Others.createTypeOfPureFunction(value);
            _switchResult_1 = Checks.TypeEquals(_createTypeOfPureFunction, type, false);
          }
          _switchResult = _switchResult_1;
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
              return ((((PureValueRef)value).getValue().getValue() instanceof DataValue) && Checks.ValueTypeEquals(((DataValue) ((PureValueRef)value).getValue().getValue()).getType().getContent(), type, false));
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
      _xblockexpression = _switchResult;
    }
    return _xblockexpression;
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
        if (adtt instanceof BooleanType) {
          _matched=true;
          return (valueType instanceof BooleanType);
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
          _switchResult = (((valueType instanceof PureFunctionType) && Checks.ValueTypeEquals(((PureFunctionType)adtt).getArgType(), ((PureFunctionType) valueType).getArgType(), false)) && Checks.ValueTypeEquals(((PureFunctionType)adtt).getReturnType(), ((PureFunctionType) valueType).getReturnType(), false));
        }
      }
      if (!_matched) {
        _switchResult = false;
      }
      _xblockexpression = _switchResult;
    }
    return _xblockexpression;
  }
  
  public static boolean ValueTypeEquals(final ValueType v, final ValueType v2, final boolean unitCheck) {
    if ((unitCheck && ((v2 instanceof UnitType) || ((v instanceof UnitType) && Objects.equal(v2, null))))) {
      return true;
    }
    if ((v2 instanceof VoidType)) {
      return false;
    }
    boolean _matched = false;
    if (v instanceof PureFunctionType) {
      _matched=true;
      return (((v2 instanceof PureFunctionType) && 
        Checks.ValueTypeEquals(((PureFunctionType)v).getArgType(), ((PureFunctionType) v2).getArgType(), false)) && 
        Checks.ValueTypeEquals(((PureFunctionType)v).getReturnType(), ((PureFunctionType) v2).getReturnType(), false));
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
          Checks.ValueTypeEquals(((PureAlgebraicType)v).getPureAdtElement1(), ((PureAlgebraicType) v2).getPureAdtElement1(), false)) && 
          Checks.ValueTypeEquals(Others.getElement2ValueTypeFromPureAlgebraicType(((PureAlgebraicType)v)), Others.getElement2ValueTypeFromPureAlgebraicType(((PureAlgebraicType) v2)), false));
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
    return ((unitCheck && (v2 instanceof UnitType)) || Objects.equal(v.eClass(), v2.eClass()));
  }
  
  public static boolean TypeEquals(final Type t, final Type t1, final boolean unitTypeCheck) {
    if ((unitTypeCheck && ((t1 instanceof UnitType) || ((t instanceof UnitType) && Objects.equal(t1, null))))) {
      return true;
    }
    if (((t instanceof VoidType) || (t1 instanceof VoidType))) {
      return false;
    }
    boolean _matched = false;
    if (t instanceof EffectFullFunctionType) {
      _matched=true;
      return (((t1 instanceof EffectFullFunctionType) && Checks.TypeEquals(((EffectFullFunctionType)t).getArgType(), ((EffectFullFunctionType) t1).getArgType(), false)) && Checks.TypeEquals(((EffectFullFunctionType)t).getReturnType().getType(), ((EffectFullFunctionType) t1).getReturnType().getType(), false));
    }
    if (!_matched) {
      if (t instanceof UnitType) {
        _matched=true;
        return (t1 instanceof UnitType);
      }
    }
    if (!_matched) {
      if (t instanceof IOType) {
        _matched=true;
        return ((t1 instanceof IOType) && Checks.TypeEquals(((IOType)t).getType(), ((IOType) t1).getType(), false));
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
          Checks.TypeEquals(((EffectFullAlgebraicType)t).getEffectFullAdtElement1(), ((EffectFullAlgebraicType) t1).getEffectFullAdtElement1(), false)) && 
          Checks.TypeEquals(Others.getElement2ValueTypeFromEffectFullAlgebraicType(((EffectFullAlgebraicType)t)), Others.getElement2ValueTypeFromEffectFullAlgebraicType(((EffectFullAlgebraicType) t1)), false));
      }
    }
    return ((t1 instanceof ValueType) && Checks.ValueTypeEquals(((ValueType) t), ((ValueType) t1), unitTypeCheck));
  }
  
  public static boolean functionReturnType(final PureFunctionDefinition f) {
    return (Checks.ValueTypeEquals(GetReturnType.pureFunctionDefinition(f), f.getReturnType(), false) || Objects.equal(GetReturnType.pureFunctionDefinition(f), null));
  }
  
  public static boolean mainReturnType(final MainFunc m) {
    return ((GetReturnType.mainFunc(m) instanceof IOType) && (((IOType) GetReturnType.mainFunc(m)).getType() instanceof UnitType));
  }
  
  public static boolean functionArgType(final PureFunctionDefinition f) {
    FunctionBodyPure _functionBody = f.getFunctionBody();
    PureArgument _arg = f.getArg();
    ValueType _type = _arg.getType();
    return Checks.functionBody(_functionBody, _type);
  }
  
  public static boolean pureLambda(final PureLambda lambda) {
    PureArgument _arg = lambda.getArg();
    boolean _notEquals = (!Objects.equal(_arg, null));
    if (_notEquals) {
      FunctionBodyPure _functionBody = lambda.getFunctionBody();
      PureArgument _arg_1 = lambda.getArg();
      ValueType _type = _arg_1.getType();
      return Checks.functionBody(_functionBody, _type);
    } else {
      FunctionBodyPure _functionBody_1 = lambda.getFunctionBody();
      UnitType _createUnitType = FPMLFactory.eINSTANCE.createUnitType();
      return Checks.functionBody(_functionBody_1, _createUnitType);
    }
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
    boolean _ValueTypeEquals = Checks.ValueTypeEquals(startType, argFuncFirst, true);
    boolean _not = (!_ValueTypeEquals);
    if (_not) {
      return false;
    }
    ValueType _pureFunction = GetReturnType.pureFunction(first);
    startType = _pureFunction;
    for (final PureFunction f : functions) {
      {
        final ValueType argFunc = GetArgType.pureFunction(f);
        boolean _ValueTypeEquals_1 = Checks.ValueTypeEquals(startType, argFunc, true);
        boolean _not_1 = (!_ValueTypeEquals_1);
        if (_not_1) {
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
    final EffectFullBodyContent first = Others.getFirstFunctionDefinitionFromCompositionBodyEffectFull(effect);
    EList<CompositionFunctionBodyEffectFullFactor> _functionChain = effect.getFunctionChain();
    final Function1<CompositionFunctionBodyEffectFullFactor, EffectFullBodyContent> _function = (CompositionFunctionBodyEffectFullFactor x) -> {
      return Others.getFunctionDefinitionFromEffectFullFactor(x);
    };
    List<EffectFullBodyContent> _map = ListExtensions.<CompositionFunctionBodyEffectFullFactor, EffectFullBodyContent>map(_functionChain, _function);
    final List<EffectFullBodyContent> chain = IterableExtensions.<EffectFullBodyContent>toList(_map);
    return Checks.functionChainEffectFull(chain, first, argType);
  }
  
  public static boolean functionChainEffectFull(final List<EffectFullBodyContent> references, final EffectFullBodyContent first, final Type type) {
    if ((type instanceof VoidType)) {
      return false;
    }
    Type startType = type;
    final Type argFuncFirst = GetArgType.effectFullBodyContent(first);
    boolean _TypeEquals = Checks.TypeEquals(startType, argFuncFirst, true);
    boolean _not = (!_TypeEquals);
    if (_not) {
      return false;
    }
    Type _effectFullBodyContent = GetReturnType.effectFullBodyContent(first);
    startType = _effectFullBodyContent;
    for (final EffectFullBodyContent r : references) {
      {
        final Type argFunc = GetArgType.effectFullBodyContent(r);
        final boolean result = ((!(startType instanceof IOType)) || (!Checks.TypeEquals(((IOType) startType).getType(), argFunc, true)));
        if (result) {
          return false;
        }
        Type _effectFullBodyContent_1 = GetReturnType.effectFullBodyContent(r);
        startType = _effectFullBodyContent_1;
      }
    }
    return true;
  }
  
  public static boolean functionReturnTypeEffectFull(final EffectFullFunctionDefinition definition) {
    return (Checks.TypeEquals(GetReturnType.effectFullFunctionDefinition(definition), definition.getReturnType(), false) || Objects.equal(GetReturnType.effectFullFunctionDefinition(definition), null));
  }
  
  public static boolean functionArgTypeEffectFull(final EffectFullFunctionDefinition definition) {
    FunctionBodyEffectFull _functionBody = definition.getFunctionBody();
    Argument _arg = definition.getArg();
    Type _argumentType = Others.getArgumentType(_arg);
    return Checks.functionBodyEffectFull(_functionBody, _argumentType);
  }
  
  public static boolean effectFullLambda(final EffectFullLambda lambda) {
    Argument _arg = lambda.getArg();
    boolean _notEquals = (!Objects.equal(_arg, null));
    if (_notEquals) {
      FunctionBodyEffectFull _functionBody = lambda.getFunctionBody();
      Argument _arg_1 = lambda.getArg();
      Type _argumentType = Others.getArgumentType(_arg_1);
      return Checks.functionBodyEffectFull(_functionBody, _argumentType);
    } else {
      FunctionBodyEffectFull _functionBody_1 = lambda.getFunctionBody();
      UnitType _createUnitType = FPMLFactory.eINSTANCE.createUnitType();
      return Checks.functionBodyEffectFull(_functionBody_1, _createUnitType);
    }
  }
  
  public static boolean effectFullDataAndValue(final EffectFullExpressionAndEffectFullFunctionReference valueOrReference, final Type type) {
    boolean _xblockexpression = false;
    {
      final EffectFullBodyContent value = Others.getInnerElementFromEffectFullExpressionAndEffectFullFunctionReference(valueOrReference);
      boolean _switchResult = false;
      boolean _matched = false;
      if (type instanceof ValueType) {
        _matched=true;
        _switchResult = ((((value instanceof Expression) || (value instanceof PureFunction)) && (valueOrReference instanceof PureExpressionAndPureFunctionReference)) && Checks.DataAndValue(((PureExpressionAndPureFunctionReference) valueOrReference), ((ValueType)type)));
      }
      if (!_matched) {
        if (type instanceof EffectFullFunctionType) {
          _matched=true;
          boolean _switchResult_1 = false;
          boolean _matched_1 = false;
          if (value instanceof EffectFullValueRef) {
            _matched_1=true;
            _switchResult_1 = ((((EffectFullValueRef)value).getValue() instanceof EffectFullFunctionDefinition) && Checks.TypeEquals(Others.createTypeOfPureFunction(((PureValueRef) value).getValue()), type, false));
          }
          if (!_matched_1) {
            Type _createTypeOfEffectFullBodyContent = Others.createTypeOfEffectFullBodyContent(value);
            IOType _IOWrap = Others.IOWrap(type);
            _switchResult_1 = Checks.TypeEquals(_createTypeOfEffectFullBodyContent, _IOWrap, false);
          }
          _switchResult = _switchResult_1;
        }
      }
      if (!_matched) {
        if (type instanceof EffectFullDataType) {
          _matched=true;
          return (((value instanceof EffectFullDataValue) && 
            Checks.effectFullDataAndValue(((EffectFullDataValue) value).getValue(), ((EffectFullDataType)type).getType().getContent())) || ((value instanceof EffectFullValueRef) && 
            Checks.TypeEquals(GetReturnType.effectFullExpression(((EffectFullValueRef) value).getValue().getValue()), type, true)));
        }
      }
      if (!_matched) {
        if (type instanceof EffectFullAlgebraicType) {
          _matched=true;
          boolean _matched_1 = false;
          if (value instanceof EffectFullSumValue) {
            _matched_1=true;
            return ((Others.getElement2ValueTypeFromEffectFullAlgebraicType(((EffectFullAlgebraicType)type)) instanceof EffectFullSumTypeFactor) && (Boolean.valueOf(Checks.effectFullDataAndValue(((EffectFullSumValue)value).getSumAdtElement1(), ((EffectFullAlgebraicType)type).getEffectFullAdtElement1())).booleanValue() || Boolean.valueOf(Checks.effectFullDataAndValue(((EffectFullSumValue)value).getSumAdtElement2(), Others.getElement2ValueTypeFromEffectFullAlgebraicType(((EffectFullAlgebraicType)type)))).booleanValue()));
          }
          if (!_matched_1) {
            if (value instanceof EffectFullProdValue) {
              _matched_1=true;
              return ((Others.getElement2ValueTypeFromEffectFullAlgebraicType(((EffectFullAlgebraicType)type)) instanceof PureProdTypeFactor) && (Boolean.valueOf(Checks.effectFullDataAndValue(((EffectFullProdValue)value).getProdAdtElement1(), ((EffectFullAlgebraicType)type).getEffectFullAdtElement1())).booleanValue() && Boolean.valueOf(Checks.effectFullDataAndValue(((EffectFullProdValue)value).getProdAdtElement2(), Others.getElement2ValueTypeFromEffectFullAlgebraicType(((EffectFullAlgebraicType)type)))).booleanValue()));
            }
          }
          if (!_matched_1) {
            if (value instanceof EffectFullValueRef) {
              _matched_1=true;
              EffectFullValue _value = ((EffectFullValueRef)value).getValue();
              EffectFullExpression _value_1 = _value.getValue();
              Type _effectFullExpression = GetReturnType.effectFullExpression(_value_1);
              return Checks.TypeEquals(_effectFullExpression, type, true);
            }
          }
          return false;
        }
      }
      if (!_matched) {
        if (type instanceof IOType) {
          _matched=true;
          boolean _matched_1 = false;
          if (value instanceof IOExpression) {
            _matched_1=true;
            return ((((IOType) type).getType() instanceof ValueType) && Checks.DataAndValue(Others.createPureExpressionAndPureFunctionReference(((Expression) ((IOExpression)value).getInnerValue())), ((ValueType) ((IOType) type).getType())));
          }
          if (!_matched_1) {
            if (value instanceof IOEffectFullExpression) {
              _matched_1=true;
              return ((((IOType) type).getType() instanceof EffectFullType) && Checks.effectFullDataAndValue(Others.createEffectFullExpressionAndEffectFullFunctionReference(((EffectFullExpression) ((IOEffectFullExpression)value).getInnerValue())), ((EffectFullType) ((IOType) type).getType())));
            }
          }
          if (!_matched_1) {
            if (value instanceof IOPureFunction) {
              _matched_1=true;
              PureFunction function = null;
              PureFunction _pureFunction = ((IOPureFunction)value).getPureFunction();
              boolean _notEquals = (!Objects.equal(_pureFunction, null));
              if (_notEquals) {
                PureFunction _pureFunction_1 = ((IOPureFunction)value).getPureFunction();
                function = _pureFunction_1;
              } else {
                PrimitivePureFunction _purePrimitive = ((IOPureFunction)value).getPurePrimitive();
                function = _purePrimitive;
              }
              return ((((IOType) type).getType() instanceof ValueType) && Checks.ValueTypeEquals(Others.createTypeOfPureFunction(function), ((ValueType) ((IOType) type).getType()), false));
            }
          }
          if (!_matched_1) {
            if (value instanceof IOEffectFullFunction) {
              _matched_1=true;
              EffectFullFunction function = null;
              EffectFullFunction _effectFullFunction = ((IOEffectFullFunction)value).getEffectFullFunction();
              boolean _notEquals = (!Objects.equal(_effectFullFunction, null));
              if (_notEquals) {
                EffectFullFunction _effectFullFunction_1 = ((IOEffectFullFunction)value).getEffectFullFunction();
                function = _effectFullFunction_1;
              } else {
                PrimitiveEffectFullFunction _effectFullPrimitive = ((IOEffectFullFunction)value).getEffectFullPrimitive();
                function = _effectFullPrimitive;
              }
              return ((((IOType) type).getType() instanceof EffectFullType) && Checks.TypeEquals(Others.createTypeOfEffectFullFunction(function), ((EffectFullType) ((IOType) type).getType()), false));
            }
          }
          return false;
        }
      }
      if (!_matched) {
        _switchResult = false;
      }
      _xblockexpression = _switchResult;
    }
    return _xblockexpression;
  }
  
  public static boolean applyF(final ApplyF af) {
    ApplyFFactor _value = af.getValue();
    Expression _valueExpression = _value.getValueExpression();
    boolean _equals = Objects.equal(_valueExpression, null);
    if (_equals) {
      PureFunctionType _functionType = af.getFunctionType();
      ValueType _argType = _functionType.getArgType();
      ApplyFFactor _value_1 = af.getValue();
      PureFunction _valueReference = _value_1.getValueReference();
      ValueType _pureFunction = GetReturnType.pureFunction(_valueReference);
      return Checks.ValueTypeEquals(_argType, _pureFunction, false);
    } else {
      if (((af.getValue().getValueExpression() instanceof PureFunctionType) && Objects.equal(((PureFunctionType) af.getValue().getValueExpression()).getValue().getArg(), null))) {
        ApplyFFactor _value_2 = af.getValue();
        Expression _valueExpression_1 = _value_2.getValueExpression();
        PureFunctionDefinition _value_3 = ((PureFunctionType) _valueExpression_1).getValue();
        ValueType _pureFunction_1 = GetReturnType.pureFunction(_value_3);
        final ValueType lambdaReturnType = ((PureFunctionType) _pureFunction_1).getReturnType();
        PureFunctionType _functionType_1 = af.getFunctionType();
        ValueType _argType_1 = _functionType_1.getArgType();
        return Checks.ValueTypeEquals(lambdaReturnType, _argType_1, false);
      }
      ApplyFFactor _value_4 = af.getValue();
      Expression _valueExpression_2 = _value_4.getValueExpression();
      PureExpressionAndPureFunctionReference _createPureExpressionAndPureFunctionReference = Others.createPureExpressionAndPureFunctionReference(_valueExpression_2);
      PureFunctionType _functionType_2 = af.getFunctionType();
      ValueType _argType_2 = _functionType_2.getArgType();
      return Checks.DataAndValue(_createPureExpressionAndPureFunctionReference, _argType_2);
    }
  }
  
  public static boolean applyFIO(final ApplyFIO afio) {
    ApplyFIOFactor _value = afio.getValue();
    EffectFullBodyContent _valueFromApplyFIOFactor = Others.getValueFromApplyFIOFactor(_value);
    final Type valueReturnType = GetReturnType.effectFullBodyContent(_valueFromApplyFIOFactor);
    if ((((!Objects.equal(afio.getValue().getValueExpression(), null)) && (afio.getValue().getValueExpression() instanceof EffectFullFunctionType)) && Objects.equal(((EffectFullFunctionType) afio.getValue().getValueExpression()).getValue().getArg(), null))) {
      EffectFullFunctionType _functionType = afio.getFunctionType();
      Type _argType = _functionType.getArgType();
      IOType _IOWrap = Others.IOWrap(_argType);
      IOType _returnType = ((EffectFullFunctionType) valueReturnType).getReturnType();
      return Checks.TypeEquals(_IOWrap, _returnType, false);
    }
    EffectFullFunctionType _functionType_1 = afio.getFunctionType();
    Type _argType_1 = _functionType_1.getArgType();
    IOType _IOWrap_1 = Others.IOWrap(_argType_1);
    return Checks.TypeEquals(_IOWrap_1, valueReturnType, false);
  }
  
  public static boolean effectFullExpressionHasSideEffects(final EffectFullExpression expression) {
    final Type effectFullExpressionType = GetReturnType.effectFullExpression(expression);
    return Checks.checkTypeContainsIOTypes(effectFullExpressionType);
  }
  
  public static boolean checkTypeContainsIOTypes(final Type type) {
    boolean _switchResult = false;
    boolean _matched = false;
    if (type instanceof ValueType) {
      _matched=true;
      return false;
    }
    if (!_matched) {
      if (type instanceof EffectFullDataType) {
        _matched=true;
        EffectFullData _type = ((EffectFullDataType)type).getType();
        EffectFullType _content = _type.getContent();
        _switchResult = Checks.checkTypeContainsIOTypes(_content);
      }
    }
    if (!_matched) {
      if (type instanceof EffectFullAlgebraicType) {
        _matched=true;
        _switchResult = (Checks.checkTypeContainsIOTypes(((EffectFullAlgebraicType)type).getEffectFullAdtElement1()) || Checks.checkTypeContainsIOTypes(Others.getElement2ValueTypeFromEffectFullAlgebraicType(((EffectFullAlgebraicType)type))));
      }
    }
    if (!_matched) {
      return true;
    }
    return _switchResult;
  }
}
