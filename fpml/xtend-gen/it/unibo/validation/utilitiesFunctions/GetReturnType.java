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
import it.unibo.fPML.EffectFullDataValue;
import it.unibo.fPML.EffectFullExpression;
import it.unibo.fPML.EffectFullFunction;
import it.unibo.fPML.EffectFullFunctionDefinition;
import it.unibo.fPML.EffectFullFunctionType;
import it.unibo.fPML.EffectFullLambda;
import it.unibo.fPML.EffectFullProdValue;
import it.unibo.fPML.EffectFullReference;
import it.unibo.fPML.EffectFullSumValue;
import it.unibo.fPML.EffectFullValue;
import it.unibo.fPML.EffectFullValueRef;
import it.unibo.fPML.EmptyFunctionBody;
import it.unibo.fPML.Expression;
import it.unibo.fPML.FPMLFactory;
import it.unibo.fPML.Function;
import it.unibo.fPML.FunctionBodyEffectFull;
import it.unibo.fPML.FunctionBodyPure;
import it.unibo.fPML.IOExpression;
import it.unibo.fPML.IOType;
import it.unibo.fPML.IntPow;
import it.unibo.fPML.IntToString;
import it.unibo.fPML.IntegerType;
import it.unibo.fPML.LeftPair;
import it.unibo.fPML.LeftPairIO;
import it.unibo.fPML.MainFunc;
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
    if (f instanceof PureFunctionDefinition) {
      _matched=true;
      _switchResult = GetReturnType.pureFunctionDefinition(((PureFunctionDefinition)f));
    }
    if (!_matched) {
      if (f instanceof PrimitivePureFunction) {
        _matched=true;
        _switchResult = GetReturnType.primitivePureFunction(((PrimitivePureFunction)f));
      }
    }
    if (!_matched) {
      if (f instanceof Argument) {
        _matched=true;
        _switchResult = ((Argument)f).getType();
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
        Argument _arg = ((PureLambda)f).getArg();
        AdditionalPureArgument _higherOrderArg = ((PureLambda)f).getHigherOrderArg();
        ValueType _returnType = ((PureLambda)f).getReturnType();
        _switchResult = GetReturnType.functionBodyPure(_functionBody, _arg, _higherOrderArg, _returnType);
      }
    }
    if (!_matched) {
      if (f instanceof PureFunctionDefinition) {
        _matched=true;
        FunctionBodyPure _functionBody = f.getFunctionBody();
        Argument _arg = f.getArg();
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
          Argument _arg = _value_2.getArg();
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
      Argument _arg2 = argument2.getArg2();
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
        return Others.createIntIntFuntionType();
      }
    }
    if (!_matched) {
      if (f instanceof Minus) {
        _matched=true;
        return Others.createIntIntFuntionType();
      }
    }
    if (!_matched) {
      if (f instanceof Times) {
        _matched=true;
        return Others.createIntIntFuntionType();
      }
    }
    if (!_matched) {
      if (f instanceof Mod) {
        _matched=true;
        return Others.createIntIntFuntionType();
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
        return Others.getElement2ValueTypeFromPureAlgebraicType(_type);
      }
    }
    return null;
  }
  
  public static Type effectFullFunction(final EffectFullFunction function) {
    Type _switchResult = null;
    boolean _matched = false;
    if (function instanceof EffectFullFunctionDefinition) {
      _matched=true;
      _switchResult = GetReturnType.effectFullFunctionDefinition(((EffectFullFunctionDefinition)function));
    }
    if (!_matched) {
      if (function instanceof PrimitiveEffectFullFunction) {
        _matched=true;
        _switchResult = GetReturnType.primitiveEffectFullFunction(((PrimitiveEffectFullFunction)function));
      }
    }
    return _switchResult;
  }
  
  public static Type effectFullFunctionDefinition(final EffectFullFunctionDefinition definition) {
    FunctionBodyEffectFull _functionBody = definition.getFunctionBody();
    EffectFullArgument _arg = definition.getArg();
    AdditionalEffectFullArgument _higherOrderArg = definition.getHigherOrderArg();
    IOType _returnType = definition.getReturnType();
    return GetReturnType.functionBodyEffectFull(_functionBody, _arg, _higherOrderArg, _returnType);
  }
  
  public static Type functionBodyEffectFull(final FunctionBodyEffectFull full, final EffectFullArgument argument, final AdditionalEffectFullArgument argument2, final IOType type) {
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
  
  public static Type compositionFunctionBodyEffectFull(final CompositionFunctionBodyEffect effect, final EffectFullArgument argument, final AdditionalEffectFullArgument argument2) {
    Type _xblockexpression = null;
    {
      EffectFullReference first = Others.getFirstFunctionDefinitionFromCompositionBodyEffectFull(effect);
      EList<CompositionFunctionBodyEffectFullFactor> _functionChain = effect.getFunctionChain();
      final Function1<CompositionFunctionBodyEffectFullFactor, EffectFullReference> _function = (CompositionFunctionBodyEffectFullFactor x) -> {
        return Others.getFunctionDefinitionFromEffectFullFactor(x);
      };
      List<EffectFullReference> chain = ListExtensions.<CompositionFunctionBodyEffectFullFactor, EffectFullReference>map(_functionChain, _function);
      _xblockexpression = GetReturnType.effectFullFunctionChain(chain, first, argument, argument2);
    }
    return _xblockexpression;
  }
  
  public static Type effectFullFunctionChain(final List<EffectFullReference> references, final EffectFullReference first, final EffectFullArgument argument, final AdditionalEffectFullArgument argument2) {
    if (((!Objects.equal(argument2, null)) && (!(argument2.getArg2().getType() instanceof VoidType)))) {
      Type _effectFullFunctionChain = GetReturnType.effectFullFunctionChain(references, first, argument, null);
      final Type returnFunctionType = EcoreUtil2.<Type>copy(_effectFullFunctionChain);
      final EffectFullFunctionType functionType = FPMLFactory.eINSTANCE.createEffectFullFunctionType();
      EffectFullArgument _arg2 = argument2.getArg2();
      Type _type = _arg2.getType();
      Type _copy = EcoreUtil.<Type>copy(_type);
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
      final Type firstFunctionReturnType = GetReturnType.effectFullReference(first);
      int _size = references.size();
      boolean _equals = (_size == 0);
      if (_equals) {
        return firstFunctionReturnType;
      } else {
        Iterable<EffectFullReference> _tail = IterableExtensions.<EffectFullReference>tail(references);
        List<EffectFullReference> _list = IterableExtensions.<EffectFullReference>toList(_tail);
        EffectFullReference _head = IterableExtensions.<EffectFullReference>head(references);
        return GetReturnType.effectFullFunctionChain(_list, _head, argument, null);
      }
    }
  }
  
  public static Type effectFullReference(final EffectFullReference r) {
    Type _switchResult = null;
    boolean _matched = false;
    if (r instanceof EffectFullValue) {
      _matched=true;
      EffectFullExpression _value = ((EffectFullValue)r).getValue();
      _switchResult = GetReturnType.effectFullExpression(_value);
    }
    if (!_matched) {
      if (r instanceof PureValue) {
        _matched=true;
        Expression _value = ((PureValue)r).getValue();
        _switchResult = GetReturnType.expression(_value);
      }
    }
    if (!_matched) {
      if (r instanceof PrimitiveEffectFullValue) {
        _matched=true;
        _switchResult = GetReturnType.primitiveEffectFullValue(((PrimitiveEffectFullValue)r));
      }
    }
    if (!_matched) {
      if (r instanceof PrimitiveEffectFullFunction) {
        _matched=true;
        _switchResult = GetReturnType.primitiveEffectFullFunction(((PrimitiveEffectFullFunction)r));
      }
    }
    if (!_matched) {
      if (r instanceof PrimitivePureFunction) {
        _matched=true;
        _switchResult = GetReturnType.primitivePureFunction(((PrimitivePureFunction)r));
      }
    }
    if (!_matched) {
      if (r instanceof EffectFullArgument) {
        _matched=true;
        _switchResult = ((EffectFullArgument)r).getType();
      }
    }
    if (!_matched) {
      if (r instanceof Function) {
        _matched=true;
        _switchResult = GetReturnType.function(((Function)r));
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
      if (value instanceof PrimitiveReturn) {
        _matched=true;
        Type _type = ((PrimitiveReturn)value).getType();
        return Others.IOWrap(_type);
      }
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
      if (expression instanceof Expression) {
        _matched=true;
        _switchResult = GetReturnType.expression(((Expression)expression));
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
            arg.setType(_createUnitType);
            EffectFullFunctionDefinition _value_1 = ((EffectFullFunctionType)expression).getValue();
            EffectFullArgument _arg = _value_1.getArg();
            boolean _notEquals = (!Objects.equal(_arg, null));
            if (_notEquals) {
              EffectFullFunctionDefinition _value_2 = ((EffectFullFunctionType)expression).getValue();
              EffectFullArgument _arg_1 = _value_2.getArg();
              arg = _arg_1;
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
