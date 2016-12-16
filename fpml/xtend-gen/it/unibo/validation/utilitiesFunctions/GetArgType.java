package it.unibo.validation.utilitiesFunctions;

import it.unibo.fPML.ApplyF;
import it.unibo.fPML.ApplyFIO;
import it.unibo.fPML.Argument;
import it.unibo.fPML.BoolToString;
import it.unibo.fPML.EffectFullAlgebraicType;
import it.unibo.fPML.EffectFullArgument;
import it.unibo.fPML.EffectFullBodyContent;
import it.unibo.fPML.EffectFullData;
import it.unibo.fPML.EffectFullDataValue;
import it.unibo.fPML.EffectFullEitherIf;
import it.unibo.fPML.EffectFullExpression;
import it.unibo.fPML.EffectFullExpressionAndEffectFullFunctionReference;
import it.unibo.fPML.EffectFullFunction;
import it.unibo.fPML.EffectFullFunctionDefinition;
import it.unibo.fPML.EffectFullFunctionType;
import it.unibo.fPML.EffectFullIf;
import it.unibo.fPML.EffectFullLambda;
import it.unibo.fPML.EffectFullPrimitive;
import it.unibo.fPML.EffectFullProdValue;
import it.unibo.fPML.EffectFullReturn;
import it.unibo.fPML.EffectFullSumValue;
import it.unibo.fPML.EffectFullValue;
import it.unibo.fPML.EffectFullValueRef;
import it.unibo.fPML.Equals;
import it.unibo.fPML.Expression;
import it.unibo.fPML.ExtractEffectFull;
import it.unibo.fPML.ExtractPure;
import it.unibo.fPML.FPMLFactory;
import it.unibo.fPML.Function;
import it.unibo.fPML.GetIntSdtIn;
import it.unibo.fPML.GetLineStdIn;
import it.unibo.fPML.IOEffectFullExpression;
import it.unibo.fPML.IOEffectFullFunction;
import it.unibo.fPML.IOExpression;
import it.unibo.fPML.IOPureFunction;
import it.unibo.fPML.IntPow;
import it.unibo.fPML.IntToString;
import it.unibo.fPML.IsLeftEffectFull;
import it.unibo.fPML.IsLeftPure;
import it.unibo.fPML.IsRightEffectFull;
import it.unibo.fPML.IsRightPure;
import it.unibo.fPML.LeftAlgebraic;
import it.unibo.fPML.LeftAlgebraicIO;
import it.unibo.fPML.LiftEffectFullFunction;
import it.unibo.fPML.LiftPureFunction;
import it.unibo.fPML.LogicAnd;
import it.unibo.fPML.LogicNot;
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
import it.unibo.fPML.PrimitivePureFunction;
import it.unibo.fPML.Print;
import it.unibo.fPML.PureAlgebraicType;
import it.unibo.fPML.PureArgument;
import it.unibo.fPML.PureData;
import it.unibo.fPML.PureEitherIf;
import it.unibo.fPML.PureFunction;
import it.unibo.fPML.PureFunctionDefinition;
import it.unibo.fPML.PureFunctionType;
import it.unibo.fPML.PureIf;
import it.unibo.fPML.PureLambda;
import it.unibo.fPML.PureReturn;
import it.unibo.fPML.PureValue;
import it.unibo.fPML.Random;
import it.unibo.fPML.RightAlgebraic;
import it.unibo.fPML.RightAlgebraicIO;
import it.unibo.fPML.Time;
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
    PureAlgebraicType _switchResult = null;
    boolean _matched = false;
    if (f instanceof IntToString) {
      _matched=true;
      return FPMLFactory.eINSTANCE.createIntegerType();
    }
    if (!_matched) {
      if (f instanceof BoolToString) {
        _matched=true;
        return FPMLFactory.eINSTANCE.createBooleanType();
      }
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
      if (f instanceof LeftAlgebraic) {
        _matched=true;
        PureAlgebraicType _type = ((LeftAlgebraic)f).getType();
        return EcoreUtil.<PureAlgebraicType>copy(_type);
      }
    }
    if (!_matched) {
      if (f instanceof RightAlgebraic) {
        _matched=true;
        PureAlgebraicType _type = ((RightAlgebraic)f).getType();
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
      if (f instanceof LogicNot) {
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
    if (!_matched) {
      if (f instanceof IsLeftPure) {
        _matched=true;
        PureAlgebraicType _type = ((IsLeftPure)f).getType();
        _switchResult = EcoreUtil.<PureAlgebraicType>copy(_type);
      }
    }
    if (!_matched) {
      if (f instanceof IsRightPure) {
        _matched=true;
        PureAlgebraicType _type = ((IsRightPure)f).getType();
        _switchResult = EcoreUtil.<PureAlgebraicType>copy(_type);
      }
    }
    if (!_matched) {
      if (f instanceof PureIf) {
        _matched=true;
        return FPMLFactory.eINSTANCE.createBooleanType();
      }
    }
    if (!_matched) {
      if (f instanceof PureEitherIf) {
        _matched=true;
        return FPMLFactory.eINSTANCE.createBooleanType();
      }
    }
    if (!_matched) {
      if (f instanceof PureReturn) {
        _matched=true;
        ValueType _type = ((PureReturn)f).getType();
        return EcoreUtil.<ValueType>copy(_type);
      }
    }
    return _switchResult;
  }
  
  public static ValueType pureFunctionDefinition(final PureFunctionDefinition f) {
    boolean _matched = false;
    if (f instanceof PureValue) {
      _matched=true;
      return FPMLFactory.eINSTANCE.createUnitType();
    }
    if (!_matched) {
      if (f instanceof PureLambda) {
        _matched=true;
        return FPMLFactory.eINSTANCE.createUnitType();
      }
    }
    PureArgument _arg = f.getArg();
    ValueType _type = _arg.getType();
    return EcoreUtil.<ValueType>copy(_type);
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
        _switchResult = FPMLFactory.eINSTANCE.createUnitType();
      }
    }
    if (!_matched) {
      if (expression instanceof EffectFullFunctionType) {
        _matched=true;
        _switchResult = FPMLFactory.eINSTANCE.createUnitType();
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
        EffectFullExpressionAndEffectFullFunctionReference _prodAdtElement1 = ((EffectFullProdValue)expression).getProdAdtElement1();
        EffectFullBodyContent _innerElementFromEffectFullExpressionAndEffectFullFunctionReference = Others.getInnerElementFromEffectFullExpressionAndEffectFullFunctionReference(_prodAdtElement1);
        Type _effectFullBodyContent = GetArgType.effectFullBodyContent(_innerElementFromEffectFullExpressionAndEffectFullFunctionReference);
        EffectFullExpressionAndEffectFullFunctionReference _prodAdtElement2 = ((EffectFullProdValue)expression).getProdAdtElement2();
        EffectFullBodyContent _innerElementFromEffectFullExpressionAndEffectFullFunctionReference_1 = Others.getInnerElementFromEffectFullExpressionAndEffectFullFunctionReference(_prodAdtElement2);
        Type _effectFullBodyContent_1 = GetArgType.effectFullBodyContent(_innerElementFromEffectFullExpressionAndEffectFullFunctionReference_1);
        _switchResult = Others.createEffectFullAlgebraicType(_effectFullBodyContent, _effectFullBodyContent_1, false);
      }
    }
    if (!_matched) {
      if (expression instanceof EffectFullSumValue) {
        _matched=true;
        EffectFullExpressionAndEffectFullFunctionReference _sumAdtElement1 = ((EffectFullSumValue)expression).getSumAdtElement1();
        EffectFullBodyContent _innerElementFromEffectFullExpressionAndEffectFullFunctionReference = Others.getInnerElementFromEffectFullExpressionAndEffectFullFunctionReference(_sumAdtElement1);
        Type _effectFullBodyContent = GetArgType.effectFullBodyContent(_innerElementFromEffectFullExpressionAndEffectFullFunctionReference);
        EffectFullExpressionAndEffectFullFunctionReference _sumAdtElement2 = ((EffectFullSumValue)expression).getSumAdtElement2();
        EffectFullBodyContent _innerElementFromEffectFullExpressionAndEffectFullFunctionReference_1 = Others.getInnerElementFromEffectFullExpressionAndEffectFullFunctionReference(_sumAdtElement2);
        Type _effectFullBodyContent_1 = GetArgType.effectFullBodyContent(_innerElementFromEffectFullExpressionAndEffectFullFunctionReference_1);
        _switchResult = Others.createEffectFullAlgebraicType(_effectFullBodyContent, _effectFullBodyContent_1, true);
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
    Type _switchResult = null;
    boolean _matched = false;
    if (function instanceof Print) {
      _matched=true;
      return FPMLFactory.eINSTANCE.createStringType();
    }
    if (!_matched) {
      if (function instanceof ApplyFIO) {
        _matched=true;
        EffectFullFunctionType _functionType = ((ApplyFIO)function).getFunctionType();
        return EcoreUtil.<EffectFullFunctionType>copy(_functionType);
      }
    }
    if (!_matched) {
      if (function instanceof EffectFullReturn) {
        _matched=true;
        Type _type = ((EffectFullReturn)function).getType();
        return EcoreUtil.<Type>copy(_type);
      }
    }
    if (!_matched) {
      if (function instanceof LeftAlgebraicIO) {
        _matched=true;
        EffectFullAlgebraicType _type = ((LeftAlgebraicIO)function).getType();
        _switchResult = EcoreUtil.<EffectFullAlgebraicType>copy(_type);
      }
    }
    if (!_matched) {
      if (function instanceof RightAlgebraicIO) {
        _matched=true;
        EffectFullAlgebraicType _type = ((RightAlgebraicIO)function).getType();
        _switchResult = EcoreUtil.<EffectFullAlgebraicType>copy(_type);
      }
    }
    if (!_matched) {
      if (function instanceof ExtractEffectFull) {
        _matched=true;
        EffectFullData _data = ((ExtractEffectFull)function).getData();
        return Others.createDataType(_data);
      }
    }
    if (!_matched) {
      if (function instanceof LiftPureFunction) {
        _matched=true;
        PureFunction _pureFunctionFromLiftPureFunction = Others.getPureFunctionFromLiftPureFunction(((LiftPureFunction)function));
        return GetArgType.pureFunction(_pureFunctionFromLiftPureFunction);
      }
    }
    if (!_matched) {
      if (function instanceof LiftEffectFullFunction) {
        _matched=true;
        EffectFullFunction _effectFullFunctionFromLiftEffectFullFunction = Others.getEffectFullFunctionFromLiftEffectFullFunction(((LiftEffectFullFunction)function));
        return GetArgType.effectFullFunction(_effectFullFunctionFromLiftEffectFullFunction);
      }
    }
    if (!_matched) {
      if (function instanceof IsLeftEffectFull) {
        _matched=true;
        EffectFullAlgebraicType _type = ((IsLeftEffectFull)function).getType();
        _switchResult = EcoreUtil.<EffectFullAlgebraicType>copy(_type);
      }
    }
    if (!_matched) {
      if (function instanceof IsRightEffectFull) {
        _matched=true;
        EffectFullAlgebraicType _type = ((IsRightEffectFull)function).getType();
        _switchResult = EcoreUtil.<EffectFullAlgebraicType>copy(_type);
      }
    }
    if (!_matched) {
      if (function instanceof EffectFullIf) {
        _matched=true;
        _switchResult = FPMLFactory.eINSTANCE.createBooleanType();
      }
    }
    if (!_matched) {
      if (function instanceof EffectFullEitherIf) {
        _matched=true;
        _switchResult = FPMLFactory.eINSTANCE.createBooleanType();
      }
    }
    if (!_matched) {
      if (function instanceof GetLineStdIn) {
        _matched=true;
        _switchResult = FPMLFactory.eINSTANCE.createUnitType();
      }
    }
    if (!_matched) {
      if (function instanceof GetIntSdtIn) {
        _matched=true;
        _switchResult = FPMLFactory.eINSTANCE.createUnitType();
      }
    }
    return _switchResult;
  }
  
  public static Type primitiveEffectFullValue(final PrimitiveEffectFullValue pefv) {
    boolean _matched = false;
    if (pefv instanceof Random) {
      _matched=true;
      return FPMLFactory.eINSTANCE.createUnitType();
    }
    if (!_matched) {
      if (pefv instanceof Time) {
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
      _switchResult = FPMLFactory.eINSTANCE.createUnitType();
    }
    if (!_matched) {
      if (definition instanceof EffectFullLambda) {
        _matched=true;
        _switchResult = FPMLFactory.eINSTANCE.createUnitType();
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
}
