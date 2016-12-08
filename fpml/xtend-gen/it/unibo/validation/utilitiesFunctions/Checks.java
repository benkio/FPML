package it.unibo.validation.utilitiesFunctions;

import com.google.common.base.Objects;
import it.unibo.fPML.ApplyF;
import it.unibo.fPML.ApplyFFactor;
import it.unibo.fPML.ApplyFIO;
import it.unibo.fPML.BooleanType;
import it.unibo.fPML.CompositionFunctionBodyEffect;
import it.unibo.fPML.CompositionFunctionBodyPure;
import it.unibo.fPML.CompositionFunctionBodyPureFactor;
import it.unibo.fPML.DataType;
import it.unibo.fPML.EffectFullAlgebraicType;
import it.unibo.fPML.EffectFullData;
import it.unibo.fPML.EffectFullDataType;
import it.unibo.fPML.EffectFullExpression;
import it.unibo.fPML.EffectFullFunctionDefinition;
import it.unibo.fPML.EffectFullFunctionType;
import it.unibo.fPML.EffectFullLambda;
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
import it.unibo.fPML.PureArgument;
import it.unibo.fPML.PureFunction;
import it.unibo.fPML.PureFunctionDefinition;
import it.unibo.fPML.PureFunctionType;
import it.unibo.fPML.PureLambda;
import it.unibo.fPML.PureValue;
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
    throw new Error("Unresolved compilation problems:"
      + "\nType mismatch: cannot convert from Expression to EffectFullExpression");
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
    PureArgument _arg = f.getArg();
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
        boolean _ValueTypeEquals_1 = Checks.ValueTypeEquals(startType, argFunc);
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
    throw new Error("Unresolved compilation problems:"
      + "\nThe method getFirstFunctionDefinitionFromCompositionBodyEffectFull(CompositionFunctionBodyEffect) from the type Others refers to the missing type EffectFullReference"
      + "\nThe method functionChainEffectFull(List<EffectFullReference>, EffectFullReference, Type) from the type Checks refers to the missing type EffectFullReference");
  }
  
  public static boolean functionChainEffectFull(final /* List<EffectFullReference> */Object references, final /* EffectFullReference */Object first, final Type type) {
    throw new Error("Unresolved compilation problems:"
      + "\nEffectFullReference cannot be resolved to a type."
      + "\nThe method effectFullReference(EffectFullReference) from the type GetArgType refers to the missing type EffectFullReference"
      + "\nThe method effectFullReference(EffectFullReference) from the type GetReturnType refers to the missing type EffectFullReference"
      + "\nThe method effectFullReference(EffectFullReference) from the type GetArgType refers to the missing type EffectFullReference"
      + "\nThe method effectFullReference(EffectFullReference) from the type GetReturnType refers to the missing type EffectFullReference");
  }
  
  public static boolean functionReturnTypeEffectFull(final EffectFullFunctionDefinition definition) {
    return (Checks.TypeEquals(GetReturnType.effectFullFunctionDefinition(definition), definition.getReturnType()) || Objects.equal(GetReturnType.effectFullFunctionDefinition(definition), null));
  }
  
  public static boolean functionArgTypeEffectFull(final EffectFullFunctionDefinition definition) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field type is undefined for the type Argument");
  }
  
  public static boolean effectFullLambda(final EffectFullLambda lambda) {
    final Type arg = GetArgType.effectFullLambda(lambda);
    FunctionBodyEffectFull _functionBody = lambda.getFunctionBody();
    return Checks.functionBodyEffectFull(_functionBody, arg);
  }
  
  public static boolean effectFullDataAndValue(final EffectFullExpression value, final Type type) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field type is undefined for the type Argument");
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
      return Checks.ValueTypeEquals(_argType, _pureFunction);
    }
    ApplyFFactor _value_2 = af.getValue();
    Expression _valueExpression_1 = _value_2.getValueExpression();
    boolean _matched = false;
    if (_valueExpression_1 instanceof PureFunctionType) {
      _matched=true;
      ApplyFFactor _value_3 = af.getValue();
      Expression _valueExpression_2 = _value_3.getValueExpression();
      ValueType _argType_1 = ((PureFunctionType) _valueExpression_2).getArgType();
      boolean _equals_1 = Objects.equal(_argType_1, null);
      if (_equals_1) {
        ApplyFFactor _value_4 = af.getValue();
        Expression _valueExpression_3 = _value_4.getValueExpression();
        PureFunctionDefinition _value_5 = ((PureFunctionType) _valueExpression_3).getValue();
        ValueType _pureFunction_1 = GetReturnType.pureFunction(_value_5);
        PureFunctionType _functionType_1 = af.getFunctionType();
        ValueType _argType_2 = _functionType_1.getArgType();
        return Checks.ValueTypeEquals(_pureFunction_1, _argType_2);
      } else {
        ApplyFFactor _value_6 = af.getValue();
        Expression _valueExpression_4 = _value_6.getValueExpression();
        PureFunctionType _functionType_2 = af.getFunctionType();
        ValueType _argType_3 = _functionType_2.getArgType();
        return Checks.DataAndValue(_valueExpression_4, _argType_3);
      }
    }
    ApplyFFactor _value_3 = af.getValue();
    Expression _valueExpression_2 = _value_3.getValueExpression();
    PureFunctionType _functionType_1 = af.getFunctionType();
    ValueType _argType_1 = _functionType_1.getArgType();
    return Checks.DataAndValue(_valueExpression_2, _argType_1);
  }
  
  public static boolean applyFIO(final ApplyFIO afio) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method effectFullReference(EffectFullReference) from the type GetReturnType refers to the missing type EffectFullReference"
      + "\nThe method getValueFromApplyFIOFactor(ApplyFIOFactor) from the type Others refers to the missing type EffectFullReference");
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
