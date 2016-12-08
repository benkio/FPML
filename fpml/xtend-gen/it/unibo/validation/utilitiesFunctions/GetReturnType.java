package it.unibo.validation.utilitiesFunctions;

import com.google.common.base.Objects;
import it.unibo.fPML.AdditionalEffectFullArgument;
import it.unibo.fPML.AdditionalPureArgument;
import it.unibo.fPML.ApplyF;
import it.unibo.fPML.ApplyFIO;
import it.unibo.fPML.Argument;
import it.unibo.fPML.BooleanType;
import it.unibo.fPML.CompositionFunctionBodyEffect;
import it.unibo.fPML.CompositionFunctionBodyEffectFullFactor;
import it.unibo.fPML.CompositionFunctionBodyPure;
import it.unibo.fPML.CompositionFunctionBodyPureFactor;
import it.unibo.fPML.DataValue;
import it.unibo.fPML.EffectFullAlgebraicType;
import it.unibo.fPML.EffectFullArgument;
import it.unibo.fPML.EffectFullBodyContent;
import it.unibo.fPML.EffectFullData;
import it.unibo.fPML.EffectFullDataValue;
import it.unibo.fPML.EffectFullExpression;
import it.unibo.fPML.EffectFullFunction;
import it.unibo.fPML.EffectFullFunctionDefinition;
import it.unibo.fPML.EffectFullFunctionType;
import it.unibo.fPML.EffectFullLambda;
import it.unibo.fPML.EffectFullPrimitive;
import it.unibo.fPML.EffectFullProdValue;
import it.unibo.fPML.EffectFullSumValue;
import it.unibo.fPML.EffectFullValue;
import it.unibo.fPML.EffectFullValueRef;
import it.unibo.fPML.EmptyFunctionBody;
import it.unibo.fPML.Equals;
import it.unibo.fPML.Expression;
import it.unibo.fPML.ExtractEffectFull;
import it.unibo.fPML.ExtractPure;
import it.unibo.fPML.FPMLFactory;
import it.unibo.fPML.Function;
import it.unibo.fPML.FunctionBodyEffectFull;
import it.unibo.fPML.FunctionBodyPure;
import it.unibo.fPML.IOExpression;
import it.unibo.fPML.IOPureFunction;
import it.unibo.fPML.IOType;
import it.unibo.fPML.IntPow;
import it.unibo.fPML.IntToString;
import it.unibo.fPML.IntegerType;
import it.unibo.fPML.LeftPair;
import it.unibo.fPML.LeftPairIO;
import it.unibo.fPML.LogicAnd;
import it.unibo.fPML.LogicOr;
import it.unibo.fPML.MainFunc;
import it.unibo.fPML.Major;
import it.unibo.fPML.MajorEquals;
import it.unibo.fPML.Minor;
import it.unibo.fPML.MinorEquals;
import it.unibo.fPML.Minus;
import it.unibo.fPML.Mod;
import it.unibo.fPML.Plus;
import it.unibo.fPML.PrimitiveEffectFullFunction;
import it.unibo.fPML.PrimitiveEffectFullValue;
import it.unibo.fPML.PrimitiveFunction;
import it.unibo.fPML.PrimitivePrint;
import it.unibo.fPML.PrimitivePureFunction;
import it.unibo.fPML.PrimitiveRandom;
import it.unibo.fPML.PrimitiveReturn;
import it.unibo.fPML.PrimitiveTime;
import it.unibo.fPML.PureAlgebraicType;
import it.unibo.fPML.PureArgument;
import it.unibo.fPML.PureData;
import it.unibo.fPML.PureFunction;
import it.unibo.fPML.PureFunctionDefinition;
import it.unibo.fPML.PureFunctionType;
import it.unibo.fPML.PureLambda;
import it.unibo.fPML.PureProdValue;
import it.unibo.fPML.PureSumValue;
import it.unibo.fPML.PureValue;
import it.unibo.fPML.PureValueRef;
import it.unibo.fPML.RecursiveEffectFullExpression;
import it.unibo.fPML.RightPair;
import it.unibo.fPML.RightPairIO;
import it.unibo.fPML.StringType;
import it.unibo.fPML.Times;
import it.unibo.fPML.Type;
import it.unibo.fPML.UnitType;
import it.unibo.fPML.ValueType;
import it.unibo.fPML.VoidType;
import it.unibo.validation.utilitiesFunctions.Others;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;

@SuppressWarnings("all")
public class GetReturnType {
  public static Type function(final Function f) {
    Type _switchResult = null;
    boolean _matched = false;
    if (f instanceof EffectFullFunction) {
      _matched=true;
      _switchResult = GetReturnType.effectFullFunction(((EffectFullFunction)f));
    }
    if (!_matched) {
      if (f instanceof PureFunction) {
        _matched=true;
        _switchResult = GetReturnType.pureFunction(((PureFunction)f));
      }
    }
    return _switchResult;
  }
  
  public static ValueType pureFunction(final PureFunction f) {
    ValueType _switchResult = null;
    boolean _matched = false;
    if (f instanceof PureValue) {
      _matched=true;
      Expression _value = ((PureValue)f).getValue();
      _switchResult = GetReturnType.expression(_value);
    }
    if (!_matched) {
      if (f instanceof PureFunctionDefinition) {
        _matched=true;
        _switchResult = GetReturnType.pureFunctionDefinition(((PureFunctionDefinition)f));
      }
    }
    if (!_matched) {
      if (f instanceof PrimitivePureFunction) {
        _matched=true;
        _switchResult = GetReturnType.primitivePureFunction(((PrimitivePureFunction)f));
      }
    }
    if (!_matched) {
      if (f instanceof PureArgument) {
        _matched=true;
        _switchResult = ((PureArgument)f).getType();
      }
    }
    if (!_matched) {
      if (f instanceof Expression) {
        _matched=true;
        _switchResult = GetReturnType.expression(((Expression)f));
      }
    }
    return _switchResult;
  }
  
  public static ValueType pureFunctionDefinition(final PureFunctionDefinition f) {
    ValueType _switchResult = null;
    boolean _matched = false;
    if (f instanceof PureValue) {
      _matched=true;
      Expression _value = ((PureValue)f).getValue();
      _switchResult = GetReturnType.expression(_value);
    }
    if (!_matched) {
      if (f instanceof PureLambda) {
        _matched=true;
        FunctionBodyPure _functionBody = ((PureLambda)f).getFunctionBody();
        PureArgument _arg = ((PureLambda)f).getArg();
        AdditionalPureArgument _higherOrderArg = ((PureLambda)f).getHigherOrderArg();
        ValueType _returnType = ((PureLambda)f).getReturnType();
        _switchResult = GetReturnType.functionBodyPure(_functionBody, _arg, _higherOrderArg, _returnType);
      }
    }
    if (!_matched) {
      if (f instanceof PureFunctionDefinition) {
        _matched=true;
        FunctionBodyPure _functionBody = f.getFunctionBody();
        PureArgument _arg = f.getArg();
        AdditionalPureArgument _higherOrderArg = f.getHigherOrderArg();
        ValueType _returnType = f.getReturnType();
        _switchResult = GetReturnType.functionBodyPure(_functionBody, _arg, _higherOrderArg, _returnType);
      }
    }
    return _switchResult;
  }
  
  public static ValueType expression(final Expression expression) {
    ValueType _switchResult = null;
    boolean _matched = false;
    if (expression instanceof IntegerType) {
      _matched=true;
      return FPMLFactory.eINSTANCE.createIntegerType();
    }
    if (!_matched) {
      if (expression instanceof StringType) {
        _matched=true;
        return FPMLFactory.eINSTANCE.createStringType();
      }
    }
    if (!_matched) {
      if (expression instanceof BooleanType) {
        _matched=true;
        return FPMLFactory.eINSTANCE.createBooleanType();
      }
    }
    if (!_matched) {
      if (expression instanceof DataValue) {
        _matched=true;
        return ((ValueType)expression);
      }
    }
    if (!_matched) {
      if (expression instanceof PureFunctionType) {
        _matched=true;
        ValueType _xifexpression = null;
        PureFunctionDefinition _value = ((PureFunctionType)expression).getValue();
        if ((_value instanceof PureLambda)) {
          PureFunctionDefinition _value_1 = ((PureFunctionType)expression).getValue();
          FunctionBodyPure _functionBody = _value_1.getFunctionBody();
          PureFunctionDefinition _value_2 = ((PureFunctionType)expression).getValue();
          PureArgument _arg = _value_2.getArg();
          PureFunctionDefinition _value_3 = ((PureFunctionType)expression).getValue();
          ValueType _returnType = _value_3.getReturnType();
          _xifexpression = GetReturnType.functionBodyPure(_functionBody, _arg, null, _returnType);
        } else {
          _xifexpression = ((ValueType)expression);
        }
        _switchResult = _xifexpression;
      }
    }
    if (!_matched) {
      if (expression instanceof UnitType) {
        _matched=true;
        _switchResult = ((ValueType)expression);
      }
    }
    if (!_matched) {
      if (expression instanceof PureValueRef) {
        _matched=true;
        PureValue _value = ((PureValueRef)expression).getValue();
        Expression _value_1 = _value.getValue();
        _switchResult = GetReturnType.expression(_value_1);
      }
    }
    if (!_matched) {
      if (expression instanceof PureSumValue) {
        _matched=true;
        Expression _sumAdtElement1 = ((PureSumValue)expression).getSumAdtElement1();
        ValueType _expression = GetReturnType.expression(_sumAdtElement1);
        Expression _sumAdtElement2 = ((PureSumValue)expression).getSumAdtElement2();
        ValueType _expression_1 = GetReturnType.expression(_sumAdtElement2);
        _switchResult = Others.createPureAlgebraicType(_expression, _expression_1, true);
      }
    }
    if (!_matched) {
      if (expression instanceof PureProdValue) {
        _matched=true;
        Expression _prodAdtElement1 = ((PureProdValue)expression).getProdAdtElement1();
        ValueType _expression = GetReturnType.expression(_prodAdtElement1);
        Expression _prodAdtElement2 = ((PureProdValue)expression).getProdAdtElement2();
        ValueType _expression_1 = GetReturnType.expression(_prodAdtElement2);
        _switchResult = Others.createPureAlgebraicType(_expression, _expression_1, false);
      }
    }
    return _switchResult;
  }
  
  public static ValueType functionBodyPure(final FunctionBodyPure pure, final Argument arg1, final AdditionalPureArgument arg2, final ValueType returnType) {
    ValueType _switchResult = null;
    boolean _matched = false;
    if (pure instanceof EmptyFunctionBody) {
      _matched=true;
      _switchResult = returnType;
    }
    if (!_matched) {
      if (pure instanceof CompositionFunctionBodyPure) {
        _matched=true;
        _switchResult = GetReturnType.compositionFunctionBodyPure(((CompositionFunctionBodyPure)pure), arg1, arg2);
      }
    }
    return _switchResult;
  }
  
  public static ValueType compositionFunctionBodyPure(final CompositionFunctionBodyPure pure, final Argument arg1, final AdditionalPureArgument arg2) {
    ValueType _xblockexpression = null;
    {
      PureFunction first = Others.getFirstFunctionDefinitionFromCompositionBodyPure(pure);
      EList<CompositionFunctionBodyPureFactor> _functionChain = pure.getFunctionChain();
      final Function1<CompositionFunctionBodyPureFactor, PureFunction> _function = (CompositionFunctionBodyPureFactor x) -> {
        return Others.getFunctionDefinitionFromPureFactor(x);
      };
      List<PureFunction> chain = ListExtensions.<CompositionFunctionBodyPureFactor, PureFunction>map(_functionChain, _function);
      _xblockexpression = GetReturnType.pureFunctionChain(chain, first, arg1, arg2);
    }
    return _xblockexpression;
  }
  
  public static ValueType pureFunctionChain(final List<PureFunction> definitions, final PureFunction first, final Argument argument, final AdditionalPureArgument argument2) {
    if (((!Objects.equal(argument2, null)) && (!(argument2.getArg2().getType() instanceof VoidType)))) {
      final PureFunctionType functionType = FPMLFactory.eINSTANCE.createPureFunctionType();
      PureArgument _arg2 = argument2.getArg2();
      ValueType _type = _arg2.getType();
      ValueType _copy = EcoreUtil.<ValueType>copy(_type);
      functionType.setArgType(_copy);
      ValueType _pureFunctionChain = GetReturnType.pureFunctionChain(definitions, first, argument, null);
      ValueType _copy_1 = EcoreUtil.<ValueType>copy(_pureFunctionChain);
      functionType.setReturnType(_copy_1);
      return functionType;
    } else {
      final ValueType firstFunctionReturnType = GetReturnType.pureFunction(first);
      int _size = definitions.size();
      boolean _equals = (_size == 0);
      if (_equals) {
        return firstFunctionReturnType;
      } else {
        Iterable<PureFunction> _tail = IterableExtensions.<PureFunction>tail(definitions);
        List<PureFunction> _list = IterableExtensions.<PureFunction>toList(_tail);
        PureFunction _head = IterableExtensions.<PureFunction>head(definitions);
        return GetReturnType.pureFunctionChain(_list, _head, argument, null);
      }
    }
  }
  
  public static ValueType primitivePureFunction(final PrimitivePureFunction f) {
    boolean _matched = false;
    if (f instanceof IntToString) {
      _matched=true;
      return FPMLFactory.eINSTANCE.createStringType();
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
        EObject _type = ((Plus)f).getType();
        EObject _copy = EcoreUtil.<EObject>copy(_type);
        EObject _type_1 = ((Plus)f).getType();
        EObject _copy_1 = EcoreUtil.<EObject>copy(_type_1);
        return Others.createFuntionType(((ValueType) _copy), ((ValueType) _copy_1));
      }
    }
    if (!_matched) {
      if (f instanceof Minus) {
        _matched=true;
        IntegerType _createIntegerType = FPMLFactory.eINSTANCE.createIntegerType();
        IntegerType _createIntegerType_1 = FPMLFactory.eINSTANCE.createIntegerType();
        return Others.createFuntionType(_createIntegerType, _createIntegerType_1);
      }
    }
    if (!_matched) {
      if (f instanceof Times) {
        _matched=true;
        IntegerType _createIntegerType = FPMLFactory.eINSTANCE.createIntegerType();
        IntegerType _createIntegerType_1 = FPMLFactory.eINSTANCE.createIntegerType();
        return Others.createFuntionType(_createIntegerType, _createIntegerType_1);
      }
    }
    if (!_matched) {
      if (f instanceof Mod) {
        _matched=true;
        IntegerType _createIntegerType = FPMLFactory.eINSTANCE.createIntegerType();
        IntegerType _createIntegerType_1 = FPMLFactory.eINSTANCE.createIntegerType();
        return Others.createFuntionType(_createIntegerType, _createIntegerType_1);
      }
    }
    if (!_matched) {
      if (f instanceof ApplyF) {
        _matched=true;
        PureFunctionType _functionType = ((ApplyF)f).getFunctionType();
        return _functionType.getReturnType();
      }
    }
    if (!_matched) {
      if (f instanceof LeftPair) {
        _matched=true;
        PureAlgebraicType _type = ((LeftPair)f).getType();
        return _type.getPureAdtElement1();
      }
    }
    if (!_matched) {
      if (f instanceof RightPair) {
        _matched=true;
        PureAlgebraicType _type = ((RightPair)f).getType();
        PureAlgebraicType _copy = EcoreUtil.<PureAlgebraicType>copy(_type);
        return Others.getElement2ValueTypeFromPureAlgebraicType(_copy);
      }
    }
    if (!_matched) {
      if (f instanceof Equals) {
        _matched=true;
        EObject _type = ((Equals)f).getType();
        EObject _copy = EcoreUtil.<EObject>copy(_type);
        BooleanType _createBooleanType = FPMLFactory.eINSTANCE.createBooleanType();
        return Others.createFuntionType(((ValueType) _copy), _createBooleanType);
      }
    }
    if (!_matched) {
      if (f instanceof MinorEquals) {
        _matched=true;
        IntegerType _createIntegerType = FPMLFactory.eINSTANCE.createIntegerType();
        BooleanType _createBooleanType = FPMLFactory.eINSTANCE.createBooleanType();
        return Others.createFuntionType(_createIntegerType, _createBooleanType);
      }
    }
    if (!_matched) {
      if (f instanceof MajorEquals) {
        _matched=true;
        IntegerType _createIntegerType = FPMLFactory.eINSTANCE.createIntegerType();
        BooleanType _createBooleanType = FPMLFactory.eINSTANCE.createBooleanType();
        return Others.createFuntionType(_createIntegerType, _createBooleanType);
      }
    }
    if (!_matched) {
      if (f instanceof Minor) {
        _matched=true;
        IntegerType _createIntegerType = FPMLFactory.eINSTANCE.createIntegerType();
        BooleanType _createBooleanType = FPMLFactory.eINSTANCE.createBooleanType();
        return Others.createFuntionType(_createIntegerType, _createBooleanType);
      }
    }
    if (!_matched) {
      if (f instanceof Major) {
        _matched=true;
        IntegerType _createIntegerType = FPMLFactory.eINSTANCE.createIntegerType();
        BooleanType _createBooleanType = FPMLFactory.eINSTANCE.createBooleanType();
        return Others.createFuntionType(_createIntegerType, _createBooleanType);
      }
    }
    if (!_matched) {
      if (f instanceof LogicAnd) {
        _matched=true;
        BooleanType _createBooleanType = FPMLFactory.eINSTANCE.createBooleanType();
        BooleanType _createBooleanType_1 = FPMLFactory.eINSTANCE.createBooleanType();
        return Others.createFuntionType(_createBooleanType, _createBooleanType_1);
      }
    }
    if (!_matched) {
      if (f instanceof LogicOr) {
        _matched=true;
        BooleanType _createBooleanType = FPMLFactory.eINSTANCE.createBooleanType();
        BooleanType _createBooleanType_1 = FPMLFactory.eINSTANCE.createBooleanType();
        return Others.createFuntionType(_createBooleanType, _createBooleanType_1);
      }
    }
    if (!_matched) {
      if (f instanceof ExtractPure) {
        _matched=true;
        PureData _data = ((ExtractPure)f).getData();
        return _data.getContent();
      }
    }
    return null;
  }
  
  public static Type effectFullFunction(final EffectFullFunction function) {
    Type _switchResult = null;
    boolean _matched = false;
    if (function instanceof EffectFullValue) {
      _matched=true;
      EffectFullExpression _value = ((EffectFullValue)function).getValue();
      _switchResult = GetReturnType.effectFullExpression(_value);
    }
    if (!_matched) {
      if (function instanceof EffectFullFunctionDefinition) {
        _matched=true;
        _switchResult = GetReturnType.effectFullFunctionDefinition(((EffectFullFunctionDefinition)function));
      }
    }
    if (!_matched) {
      if (function instanceof PrimitiveEffectFullFunction) {
        _matched=true;
        _switchResult = GetReturnType.primitiveEffectFullFunction(((PrimitiveEffectFullFunction)function));
      }
    }
    if (!_matched) {
      if (function instanceof EffectFullExpression) {
        _matched=true;
        _switchResult = GetReturnType.effectFullExpression(((EffectFullExpression)function));
      }
    }
    return _switchResult;
  }
  
  public static Type effectFullFunctionDefinition(final EffectFullFunctionDefinition definition) {
    FunctionBodyEffectFull _functionBody = definition.getFunctionBody();
    Argument _arg = definition.getArg();
    AdditionalEffectFullArgument _higherOrderArg = definition.getHigherOrderArg();
    IOType _returnType = definition.getReturnType();
    return GetReturnType.functionBodyEffectFull(_functionBody, _arg, _higherOrderArg, _returnType);
  }
  
  public static Type functionBodyEffectFull(final FunctionBodyEffectFull full, final Argument argument, final AdditionalEffectFullArgument argument2, final IOType type) {
    Type _switchResult = null;
    boolean _matched = false;
    if (full instanceof EmptyFunctionBody) {
      _matched=true;
      _switchResult = type;
    }
    if (!_matched) {
      if (full instanceof CompositionFunctionBodyEffect) {
        _matched=true;
        _switchResult = GetReturnType.compositionFunctionBodyEffectFull(((CompositionFunctionBodyEffect)full), argument, argument2);
      }
    }
    return _switchResult;
  }
  
  public static Type compositionFunctionBodyEffectFull(final CompositionFunctionBodyEffect effect, final Argument argument, final AdditionalEffectFullArgument argument2) {
    Type _xblockexpression = null;
    {
      EffectFullBodyContent first = Others.getFirstFunctionDefinitionFromCompositionBodyEffectFull(effect);
      EList<CompositionFunctionBodyEffectFullFactor> _functionChain = effect.getFunctionChain();
      final Function1<CompositionFunctionBodyEffectFullFactor, EffectFullBodyContent> _function = (CompositionFunctionBodyEffectFullFactor x) -> {
        return Others.getFunctionDefinitionFromEffectFullFactor(x);
      };
      List<EffectFullBodyContent> chain = ListExtensions.<CompositionFunctionBodyEffectFullFactor, EffectFullBodyContent>map(_functionChain, _function);
      _xblockexpression = GetReturnType.effectFullFunctionChain(chain, first, argument, argument2);
    }
    return _xblockexpression;
  }
  
  public static Type effectFullFunctionChain(final List<EffectFullBodyContent> references, final EffectFullBodyContent first, final Argument argument, final AdditionalEffectFullArgument argument2) {
    if (((!Objects.equal(argument2, null)) && ((argument2.getArg2() instanceof EffectFullArgument) && (!(((EffectFullArgument) argument2.getArg2()).getType() instanceof VoidType))))) {
      Type _effectFullFunctionChain = GetReturnType.effectFullFunctionChain(references, first, argument, null);
      final Type returnFunctionType = EcoreUtil2.<Type>copy(_effectFullFunctionChain);
      final EffectFullFunctionType functionType = FPMLFactory.eINSTANCE.createEffectFullFunctionType();
      Argument _arg2 = argument2.getArg2();
      Type _argumentType = Others.getArgumentType(_arg2);
      Type _copy = EcoreUtil.<Type>copy(_argumentType);
      functionType.setArgType(_copy);
      if ((returnFunctionType instanceof IOType)) {
        functionType.setReturnType(((IOType)returnFunctionType));
      } else {
        VoidType _createVoidType = FPMLFactory.eINSTANCE.createVoidType();
        IOType _IOWrap = Others.IOWrap(_createVoidType);
        functionType.setReturnType(_IOWrap);
      }
      return Others.IOWrap(functionType);
    } else {
      final Type firstFunctionReturnType = GetReturnType.effectFullBodyContent(first);
      int _size = references.size();
      boolean _equals = (_size == 0);
      if (_equals) {
        return firstFunctionReturnType;
      } else {
        Iterable<EffectFullBodyContent> _tail = IterableExtensions.<EffectFullBodyContent>tail(references);
        List<EffectFullBodyContent> _list = IterableExtensions.<EffectFullBodyContent>toList(_tail);
        EffectFullBodyContent _head = IterableExtensions.<EffectFullBodyContent>head(references);
        return GetReturnType.effectFullFunctionChain(_list, _head, argument, null);
      }
    }
  }
  
  public static Type effectFullBodyContent(final EffectFullBodyContent efbc) {
    Type _switchResult = null;
    boolean _matched = false;
    if (efbc instanceof EffectFullExpression) {
      _matched=true;
      _switchResult = GetReturnType.effectFullExpression(((EffectFullExpression)efbc));
    }
    if (!_matched) {
      if (efbc instanceof EffectFullFunction) {
        _matched=true;
        _switchResult = GetReturnType.effectFullFunction(((EffectFullFunction)efbc));
      }
    }
    if (!_matched) {
      if (efbc instanceof EffectFullPrimitive) {
        _matched=true;
        _switchResult = GetReturnType.effectFullPrimitive(((EffectFullPrimitive)efbc));
      }
    }
    return _switchResult;
  }
  
  public static Type effectFullPrimitive(final EffectFullPrimitive primitive) {
    Type _switchResult = null;
    boolean _matched = false;
    if (primitive instanceof PrimitiveEffectFullFunction) {
      _matched=true;
      _switchResult = GetReturnType.primitiveEffectFullFunction(((PrimitiveEffectFullFunction)primitive));
    }
    if (!_matched) {
      if (primitive instanceof PrimitiveEffectFullValue) {
        _matched=true;
        _switchResult = GetReturnType.primitiveEffectFullValue(((PrimitiveEffectFullValue)primitive));
      }
    }
    return _switchResult;
  }
  
  public static IOType primitiveEffectFullValue(final PrimitiveEffectFullValue value) {
    boolean _matched = false;
    if (value instanceof PrimitiveRandom) {
      _matched=true;
      IntegerType _createIntegerType = FPMLFactory.eINSTANCE.createIntegerType();
      return Others.IOWrap(_createIntegerType);
    }
    if (!_matched) {
      if (value instanceof PrimitiveTime) {
        _matched=true;
        StringType _createStringType = FPMLFactory.eINSTANCE.createStringType();
        return Others.IOWrap(_createStringType);
      }
    }
    return null;
  }
  
  public static Type effectFullExpression(final EffectFullExpression expression) {
    Type _switchResult = null;
    boolean _matched = false;
    if (expression instanceof IOExpression) {
      _matched=true;
      Expression _innerValue = ((IOExpression)expression).getInnerValue();
      ValueType _expression = GetReturnType.expression(_innerValue);
      return Others.IOWrap(_expression);
    }
    if (!_matched) {
      if (expression instanceof IOPureFunction) {
        _matched=true;
        PureFunction _pureFunction = ((IOPureFunction)expression).getPureFunction();
        _switchResult = GetReturnType.pureFunction(_pureFunction);
      }
    }
    if (!_matched) {
      if (expression instanceof EffectFullFunctionType) {
        _matched=true;
        Type _xifexpression = null;
        EffectFullFunctionDefinition _value = ((EffectFullFunctionType)expression).getValue();
        if ((_value instanceof EffectFullLambda)) {
          Type _xblockexpression = null;
          {
            EffectFullArgument arg = FPMLFactory.eINSTANCE.createEffectFullArgument();
            UnitType _createUnitType = FPMLFactory.eINSTANCE.createUnitType();
            IOType _IOWrap = Others.IOWrap(_createUnitType);
            arg.setType(_IOWrap);
            EffectFullFunctionDefinition _value_1 = ((EffectFullFunctionType)expression).getValue();
            Argument _arg = _value_1.getArg();
            boolean _notEquals = (!Objects.equal(_arg, null));
            if (_notEquals) {
              EffectFullFunctionDefinition _value_2 = ((EffectFullFunctionType)expression).getValue();
              Argument _arg_1 = _value_2.getArg();
              Type _argumentType = Others.getArgumentType(_arg_1);
              IOType _IOWrap_1 = Others.IOWrap(_argumentType);
              arg.setType(_IOWrap_1);
            }
            EffectFullFunctionDefinition _value_3 = ((EffectFullFunctionType)expression).getValue();
            FunctionBodyEffectFull _functionBody = _value_3.getFunctionBody();
            EffectFullFunctionDefinition _value_4 = ((EffectFullFunctionType)expression).getValue();
            IOType _returnType = _value_4.getReturnType();
            _xblockexpression = GetReturnType.functionBodyEffectFull(_functionBody, arg, null, _returnType);
          }
          _xifexpression = _xblockexpression;
        } else {
          _xifexpression = ((Type)expression);
        }
        _switchResult = _xifexpression;
      }
    }
    if (!_matched) {
      if (expression instanceof EffectFullDataValue) {
        _matched=true;
        _switchResult = ((Type)expression);
      }
    }
    if (!_matched) {
      if (expression instanceof RecursiveEffectFullExpression) {
        _matched=true;
        EffectFullExpression _innerValue = ((RecursiveEffectFullExpression)expression).getInnerValue();
        Type _effectFullExpression = GetReturnType.effectFullExpression(((EffectFullExpression) _innerValue));
        return Others.IOWrap(_effectFullExpression);
      }
    }
    if (!_matched) {
      if (expression instanceof EffectFullProdValue) {
        _matched=true;
        EffectFullExpression _prodAdtElement1 = ((EffectFullProdValue)expression).getProdAdtElement1();
        Type _effectFullExpression = GetReturnType.effectFullExpression(_prodAdtElement1);
        EffectFullExpression _prodAdtElement2 = ((EffectFullProdValue)expression).getProdAdtElement2();
        Type _effectFullExpression_1 = GetReturnType.effectFullExpression(_prodAdtElement2);
        _switchResult = Others.createEffectFullAlgebraicType(_effectFullExpression, _effectFullExpression_1, false);
      }
    }
    if (!_matched) {
      if (expression instanceof EffectFullSumValue) {
        _matched=true;
        EffectFullExpression _sumAdtElement1 = ((EffectFullSumValue)expression).getSumAdtElement1();
        Type _effectFullExpression = GetReturnType.effectFullExpression(_sumAdtElement1);
        EffectFullExpression _sumAdtElement2 = ((EffectFullSumValue)expression).getSumAdtElement2();
        Type _effectFullExpression_1 = GetReturnType.effectFullExpression(_sumAdtElement2);
        _switchResult = Others.createEffectFullAlgebraicType(_effectFullExpression, _effectFullExpression_1, true);
      }
    }
    if (!_matched) {
      if (expression instanceof EffectFullValueRef) {
        _matched=true;
        EffectFullValue _value = ((EffectFullValueRef)expression).getValue();
        EffectFullExpression _value_1 = _value.getValue();
        _switchResult = GetReturnType.effectFullExpression(_value_1);
      }
    }
    return _switchResult;
  }
  
  public static Type pritiveFunction(final PrimitiveFunction function) {
    Type _switchResult = null;
    boolean _matched = false;
    if (function instanceof PrimitiveEffectFullFunction) {
      _matched=true;
      _switchResult = GetReturnType.primitiveEffectFullFunction(((PrimitiveEffectFullFunction)function));
    }
    if (!_matched) {
      if (function instanceof PrimitivePureFunction) {
        _matched=true;
        _switchResult = GetReturnType.primitivePureFunction(((PrimitivePureFunction)function));
      }
    }
    return _switchResult;
  }
  
  public static Type primitiveEffectFullFunction(final PrimitiveEffectFullFunction function) {
    Type _switchResult = null;
    boolean _matched = false;
    if (function instanceof PrimitivePrint) {
      _matched=true;
      UnitType _createUnitType = FPMLFactory.eINSTANCE.createUnitType();
      _switchResult = Others.IOWrap(_createUnitType);
    }
    if (!_matched) {
      if (function instanceof ApplyFIO) {
        _matched=true;
        EffectFullFunctionType _functionType = ((ApplyFIO)function).getFunctionType();
        _switchResult = _functionType.getReturnType();
      }
    }
    if (!_matched) {
      if (function instanceof PrimitiveReturn) {
        _matched=true;
        Type _type = ((PrimitiveReturn)function).getType();
        _switchResult = Others.IOWrap(_type);
      }
    }
    if (!_matched) {
      if (function instanceof LeftPairIO) {
        _matched=true;
        EffectFullAlgebraicType _type = ((LeftPairIO)function).getType();
        _switchResult = _type.getEffectFullAdtElement1();
      }
    }
    if (!_matched) {
      if (function instanceof RightPairIO) {
        _matched=true;
        EffectFullAlgebraicType _type = ((RightPairIO)function).getType();
        _switchResult = Others.getElement2ValueTypeFromEffectFullAlgebraicType(_type);
      }
    }
    if (!_matched) {
      if (function instanceof ExtractEffectFull) {
        _matched=true;
        EffectFullData _data = ((ExtractEffectFull)function).getData();
        _switchResult = _data.getContent();
      }
    }
    return _switchResult;
  }
  
  public static Type mainFunc(final MainFunc m) {
    Type _xblockexpression = null;
    {
      UnitType _createUnitType = FPMLFactory.eINSTANCE.createUnitType();
      final IOType ioType = Others.IOWrap(_createUnitType);
      AdditionalEffectFullArgument addictionalEffectFullArgument = FPMLFactory.eINSTANCE.createAdditionalEffectFullArgument();
      EffectFullArgument _createVoidEffectFullArgument = Others.createVoidEffectFullArgument();
      addictionalEffectFullArgument.setArg2(_createVoidEffectFullArgument);
      FunctionBodyEffectFull _functionBody = m.getFunctionBody();
      EffectFullArgument _createUnitEffectFullArgument = Others.createUnitEffectFullArgument();
      _xblockexpression = GetReturnType.functionBodyEffectFull(_functionBody, _createUnitEffectFullArgument, addictionalEffectFullArgument, ioType);
    }
    return _xblockexpression;
  }
}
