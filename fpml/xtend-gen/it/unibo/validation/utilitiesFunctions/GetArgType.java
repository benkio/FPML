package it.unibo.validation.utilitiesFunctions;

import com.google.common.base.Objects;
import it.unibo.fPML.ApplyF;
import it.unibo.fPML.ApplyFIO;
import it.unibo.fPML.Argument;
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
import it.unibo.fPML.Equals;
import it.unibo.fPML.Expression;
import it.unibo.fPML.ExtractEffectFull;
import it.unibo.fPML.ExtractPure;
import it.unibo.fPML.FPMLFactory;
import it.unibo.fPML.Function;
import it.unibo.fPML.IOEffectFullExpression;
import it.unibo.fPML.IOEffectFullFunction;
import it.unibo.fPML.IOExpression;
import it.unibo.fPML.IOPureFunction;
import it.unibo.fPML.IntPow;
import it.unibo.fPML.IntToString;
import it.unibo.fPML.LeftPair;
import it.unibo.fPML.LeftPairIO;
import it.unibo.fPML.LogicAnd;
import it.unibo.fPML.LogicOr;
import it.unibo.fPML.Major;
import it.unibo.fPML.MajorEquals;
import it.unibo.fPML.Minor;
import it.unibo.fPML.MinorEquals;
import it.unibo.fPML.Minus;
import it.unibo.fPML.Mod;
import it.unibo.fPML.Plus;
import it.unibo.fPML.PrimitiveEffectFullFunction;
import it.unibo.fPML.PrimitiveEffectFullValue;
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
import it.unibo.fPML.PureValue;
import it.unibo.fPML.RightPair;
import it.unibo.fPML.RightPairIO;
import it.unibo.fPML.Times;
import it.unibo.fPML.Type;
import it.unibo.fPML.ValueType;
import it.unibo.validation.utilitiesFunctions.Others;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;

@SuppressWarnings("all")
public class GetArgType {
  public static Type function(final Function f) {
    Type _switchResult = null;
    boolean _matched = false;
    if (f instanceof EffectFullFunction) {
      _matched=true;
      _switchResult = GetArgType.effectFullFunction(((EffectFullFunction)f));
    }
    if (!_matched) {
      if (f instanceof PureFunction) {
        _matched=true;
        _switchResult = GetArgType.pureFunction(((PureFunction)f));
      }
    }
    return _switchResult;
  }
  
  public static ValueType pureFunction(final PureFunction f) {
    ValueType _switchResult = null;
    boolean _matched = false;
    if (f instanceof PureValue) {
      _matched=true;
      _switchResult = FPMLFactory.eINSTANCE.createUnitType();
    }
    if (!_matched) {
      if (f instanceof PureFunctionDefinition) {
        _matched=true;
        _switchResult = GetArgType.pureFunctionDefinition(((PureFunctionDefinition)f));
      }
    }
    if (!_matched) {
      if (f instanceof PrimitivePureFunction) {
        _matched=true;
        _switchResult = GetArgType.primitivePureFunction(((PrimitivePureFunction)f));
      }
    }
    if (!_matched) {
      if (f instanceof PureArgument) {
        _matched=true;
        _switchResult = FPMLFactory.eINSTANCE.createUnitType();
      }
    }
    if (!_matched) {
      if (f instanceof Expression) {
        _matched=true;
        _switchResult = FPMLFactory.eINSTANCE.createUnitType();
      }
    }
    return _switchResult;
  }
  
  public static ValueType primitivePureFunction(final PrimitivePureFunction f) {
    boolean _matched = false;
    if (f instanceof IntToString) {
      _matched=true;
      return FPMLFactory.eINSTANCE.createIntegerType();
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
        return ((ValueType) _copy);
      }
    }
    if (!_matched) {
      if (f instanceof Minus) {
        _matched=true;
        return FPMLFactory.eINSTANCE.createIntegerType();
      }
    }
    if (!_matched) {
      if (f instanceof Times) {
        _matched=true;
        return FPMLFactory.eINSTANCE.createIntegerType();
      }
    }
    if (!_matched) {
      if (f instanceof Mod) {
        _matched=true;
        return FPMLFactory.eINSTANCE.createIntegerType();
      }
    }
    if (!_matched) {
      if (f instanceof ApplyF) {
        _matched=true;
        PureFunctionType _functionType = ((ApplyF)f).getFunctionType();
        return EcoreUtil.<PureFunctionType>copy(_functionType);
      }
    }
    if (!_matched) {
      if (f instanceof LeftPair) {
        _matched=true;
        PureAlgebraicType _type = ((LeftPair)f).getType();
        return EcoreUtil.<PureAlgebraicType>copy(_type);
      }
    }
    if (!_matched) {
      if (f instanceof RightPair) {
        _matched=true;
        PureAlgebraicType _type = ((RightPair)f).getType();
        return EcoreUtil.<PureAlgebraicType>copy(_type);
      }
    }
    if (!_matched) {
      if (f instanceof Equals) {
        _matched=true;
        EObject _type = ((Equals)f).getType();
        EObject _copy = EcoreUtil.<EObject>copy(_type);
        return ((ValueType) _copy);
      }
    }
    if (!_matched) {
      if (f instanceof MinorEquals) {
        _matched=true;
        return FPMLFactory.eINSTANCE.createIntegerType();
      }
    }
    if (!_matched) {
      if (f instanceof MajorEquals) {
        _matched=true;
        return FPMLFactory.eINSTANCE.createIntegerType();
      }
    }
    if (!_matched) {
      if (f instanceof Minor) {
        _matched=true;
        return FPMLFactory.eINSTANCE.createIntegerType();
      }
    }
    if (!_matched) {
      if (f instanceof Major) {
        _matched=true;
        return FPMLFactory.eINSTANCE.createIntegerType();
      }
    }
    if (!_matched) {
      if (f instanceof LogicAnd) {
        _matched=true;
        return FPMLFactory.eINSTANCE.createBooleanType();
      }
    }
    if (!_matched) {
      if (f instanceof LogicOr) {
        _matched=true;
        return FPMLFactory.eINSTANCE.createBooleanType();
      }
    }
    if (!_matched) {
      if (f instanceof ExtractPure) {
        _matched=true;
        PureData _data = ((ExtractPure)f).getData();
        return Others.createDataType(_data);
      }
    }
    return null;
  }
  
  public static ValueType pureFunctionDefinition(final PureFunctionDefinition f) {
    boolean _matched = false;
    if (f instanceof PureValue) {
      _matched=true;
      Expression _value = ((PureValue)f).getValue();
      if ((_value instanceof PureFunctionType)) {
        Expression _value_1 = ((PureValue)f).getValue();
        PureFunctionDefinition _value_2 = ((PureFunctionType) _value_1).getValue();
        return GetArgType.pureLambda(((PureLambda) _value_2));
      } else {
        return FPMLFactory.eINSTANCE.createUnitType();
      }
    }
    if (!_matched) {
      if (f instanceof PureLambda) {
        _matched=true;
        return GetArgType.pureLambda(((PureLambda)f));
      }
    }
    PureArgument _arg = f.getArg();
    return _arg.getType();
  }
  
  public static ValueType pureLambda(final PureLambda l) {
    PureArgument _arg = l.getArg();
    boolean _notEquals = (!Objects.equal(_arg, null));
    if (_notEquals) {
      PureArgument _arg_1 = l.getArg();
      return _arg_1.getType();
    } else {
      return FPMLFactory.eINSTANCE.createUnitType();
    }
  }
  
  public static Type effectFullBodyContent(final EffectFullBodyContent reference) {
    Type _switchResult = null;
    boolean _matched = false;
    if (reference instanceof EffectFullExpression) {
      _matched=true;
      _switchResult = GetArgType.effectFullExpression(((EffectFullExpression)reference));
    }
    if (!_matched) {
      if (reference instanceof EffectFullFunction) {
        _matched=true;
        _switchResult = GetArgType.effectFullFunction(((EffectFullFunction)reference));
      }
    }
    if (!_matched) {
      if (reference instanceof EffectFullPrimitive) {
        _matched=true;
        _switchResult = GetArgType.effectFullPrimitive(((EffectFullPrimitive)reference));
      }
    }
    return _switchResult;
  }
  
  public static Type effectFullExpression(final EffectFullExpression expression) {
    Type _switchResult = null;
    boolean _matched = false;
    if (expression instanceof IOEffectFullFunction) {
      _matched=true;
      _switchResult = FPMLFactory.eINSTANCE.createUnitType();
    }
    if (!_matched) {
      if (expression instanceof IOEffectFullExpression) {
        _matched=true;
        _switchResult = FPMLFactory.eINSTANCE.createUnitType();
      }
    }
    if (!_matched) {
      if (expression instanceof IOExpression) {
        _matched=true;
        _switchResult = FPMLFactory.eINSTANCE.createUnitType();
      }
    }
    if (!_matched) {
      if (expression instanceof IOPureFunction) {
        _matched=true;
        PureFunction _pureFunctionFromIOPureFunction = Others.getPureFunctionFromIOPureFunction(((IOPureFunction)expression));
        _switchResult = GetArgType.pureFunction(_pureFunctionFromIOPureFunction);
      }
    }
    if (!_matched) {
      if (expression instanceof EffectFullFunctionType) {
        _matched=true;
        EffectFullFunctionDefinition _value = ((EffectFullFunctionType)expression).getValue();
        _switchResult = GetArgType.effectFullFunctionDefinition(_value);
      }
    }
    if (!_matched) {
      if (expression instanceof EffectFullDataValue) {
        _matched=true;
        _switchResult = FPMLFactory.eINSTANCE.createUnitType();
      }
    }
    if (!_matched) {
      if (expression instanceof EffectFullProdValue) {
        _matched=true;
        EffectFullExpression _prodAdtElement1 = ((EffectFullProdValue)expression).getProdAdtElement1();
        Type _effectFullExpression = GetArgType.effectFullExpression(_prodAdtElement1);
        EffectFullExpression _prodAdtElement2 = ((EffectFullProdValue)expression).getProdAdtElement2();
        Type _effectFullExpression_1 = GetArgType.effectFullExpression(_prodAdtElement2);
        _switchResult = Others.createEffectFullAlgebraicType(_effectFullExpression, _effectFullExpression_1, false);
      }
    }
    if (!_matched) {
      if (expression instanceof EffectFullSumValue) {
        _matched=true;
        EffectFullExpression _sumAdtElement1 = ((EffectFullSumValue)expression).getSumAdtElement1();
        Type _effectFullExpression = GetArgType.effectFullExpression(_sumAdtElement1);
        EffectFullExpression _sumAdtElement2 = ((EffectFullSumValue)expression).getSumAdtElement2();
        Type _effectFullExpression_1 = GetArgType.effectFullExpression(_sumAdtElement2);
        _switchResult = Others.createEffectFullAlgebraicType(_effectFullExpression, _effectFullExpression_1, true);
      }
    }
    if (!_matched) {
      if (expression instanceof EffectFullValueRef) {
        _matched=true;
        EffectFullValue _value = ((EffectFullValueRef)expression).getValue();
        EffectFullExpression _value_1 = _value.getValue();
        _switchResult = GetArgType.effectFullExpression(_value_1);
      }
    }
    return _switchResult;
  }
  
  public static Type effectFullPrimitive(final EffectFullPrimitive primitive) {
    Type _switchResult = null;
    boolean _matched = false;
    if (primitive instanceof PrimitiveEffectFullFunction) {
      _matched=true;
      _switchResult = GetArgType.primitiveEffectFullFunction(((PrimitiveEffectFullFunction)primitive));
    }
    if (!_matched) {
      if (primitive instanceof PrimitiveEffectFullValue) {
        _matched=true;
        _switchResult = GetArgType.primitiveEffectFullValue(((PrimitiveEffectFullValue)primitive));
      }
    }
    return _switchResult;
  }
  
  public static Type effectFullFunction(final EffectFullFunction function) {
    Type _switchResult = null;
    boolean _matched = false;
    if (function instanceof EffectFullArgument) {
      _matched=true;
      _switchResult = FPMLFactory.eINSTANCE.createUnitType();
    }
    if (!_matched) {
      if (function instanceof EffectFullValue) {
        _matched=true;
        EffectFullExpression _value = ((EffectFullValue)function).getValue();
        _switchResult = GetArgType.effectFullExpression(_value);
      }
    }
    if (!_matched) {
      if (function instanceof EffectFullFunctionDefinition) {
        _matched=true;
        _switchResult = GetArgType.effectFullFunctionDefinition(((EffectFullFunctionDefinition)function));
      }
    }
    if (!_matched) {
      if (function instanceof PrimitiveEffectFullFunction) {
        _matched=true;
        _switchResult = GetArgType.primitiveEffectFullFunction(((PrimitiveEffectFullFunction)function));
      }
    }
    return _switchResult;
  }
  
  public static Type primitiveEffectFullFunction(final PrimitiveEffectFullFunction function) {
    EffectFullAlgebraicType _switchResult = null;
    boolean _matched = false;
    if (function instanceof PrimitivePrint) {
      _matched=true;
      return FPMLFactory.eINSTANCE.createStringType();
    }
    if (!_matched) {
      if (function instanceof ApplyFIO) {
        _matched=true;
        return ((ApplyFIO)function).getFunctionType();
      }
    }
    if (!_matched) {
      if (function instanceof PrimitiveReturn) {
        _matched=true;
        return ((PrimitiveReturn)function).getType();
      }
    }
    if (!_matched) {
      if (function instanceof LeftPairIO) {
        _matched=true;
        _switchResult = ((LeftPairIO)function).getType();
      }
    }
    if (!_matched) {
      if (function instanceof RightPairIO) {
        _matched=true;
        _switchResult = ((RightPairIO)function).getType();
      }
    }
    if (!_matched) {
      if (function instanceof ExtractEffectFull) {
        _matched=true;
        EffectFullData _data = ((ExtractEffectFull)function).getData();
        return Others.createDataType(_data);
      }
    }
    return _switchResult;
  }
  
  public static Type primitiveEffectFullValue(final PrimitiveEffectFullValue pefv) {
    boolean _matched = false;
    if (pefv instanceof PrimitiveRandom) {
      _matched=true;
      return FPMLFactory.eINSTANCE.createUnitType();
    }
    if (!_matched) {
      if (pefv instanceof PrimitiveTime) {
        _matched=true;
        return FPMLFactory.eINSTANCE.createUnitType();
      }
    }
    return null;
  }
  
  public static Type effectFullFunctionDefinition(final EffectFullFunctionDefinition definition) {
    Type _switchResult = null;
    boolean _matched = false;
    if (definition instanceof EffectFullValue) {
      _matched=true;
      Type _switchResult_1 = null;
      EffectFullExpression _value = ((EffectFullValue)definition).getValue();
      boolean _matched_1 = false;
      if (_value instanceof EffectFullFunctionType) {
        _matched_1=true;
        EffectFullExpression _value_1 = ((EffectFullValue)definition).getValue();
        EffectFullFunctionDefinition _value_2 = ((EffectFullFunctionType) _value_1).getValue();
        _switchResult_1 = GetArgType.effectFullLambda(((EffectFullLambda) _value_2));
      }
      if (!_matched_1) {
        _switchResult_1 = FPMLFactory.eINSTANCE.createUnitType();
      }
      _switchResult = _switchResult_1;
    }
    if (!_matched) {
      if (definition instanceof EffectFullLambda) {
        _matched=true;
        _switchResult = GetArgType.effectFullLambda(((EffectFullLambda)definition));
      }
    }
    if (!_matched) {
      if (definition instanceof EffectFullFunctionDefinition) {
        _matched=true;
        Argument _arg = definition.getArg();
        _switchResult = Others.getArgumentType(_arg);
      }
    }
    return _switchResult;
  }
  
  public static Type effectFullLambda(final EffectFullLambda lambda) {
    Argument _arg = lambda.getArg();
    boolean _equals = Objects.equal(_arg, null);
    if (_equals) {
      return FPMLFactory.eINSTANCE.createUnitType();
    } else {
      Argument _arg_1 = lambda.getArg();
      return Others.getArgumentType(_arg_1);
    }
  }
}
