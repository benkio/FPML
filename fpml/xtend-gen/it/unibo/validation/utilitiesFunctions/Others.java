package it.unibo.validation.utilitiesFunctions;

import com.google.common.base.Objects;
import it.unibo.fPML.ApplyFFactor;
import it.unibo.fPML.ApplyFIOFactor;
import it.unibo.fPML.Argument;
import it.unibo.fPML.CompositionFunctionBodyEffect;
import it.unibo.fPML.CompositionFunctionBodyEffectFullFactor;
import it.unibo.fPML.CompositionFunctionBodyPure;
import it.unibo.fPML.CompositionFunctionBodyPureFactor;
import it.unibo.fPML.DataType;
import it.unibo.fPML.EffectFullAlgebraicType;
import it.unibo.fPML.EffectFullArgument;
import it.unibo.fPML.EffectFullBodyContent;
import it.unibo.fPML.EffectFullData;
import it.unibo.fPML.EffectFullDataType;
import it.unibo.fPML.EffectFullExpression;
import it.unibo.fPML.EffectFullExpressionAndEffectFullFunctionReference;
import it.unibo.fPML.EffectFullFunction;
import it.unibo.fPML.EffectFullFunctionDefinition;
import it.unibo.fPML.EffectFullFunctionType;
import it.unibo.fPML.EffectFullIfBody;
import it.unibo.fPML.EffectFullLambda;
import it.unibo.fPML.EffectFullPrimitive;
import it.unibo.fPML.EffectFullProdTypeFactor;
import it.unibo.fPML.EffectFullSumTypeFactor;
import it.unibo.fPML.EffectFullType;
import it.unibo.fPML.EffectFullValue;
import it.unibo.fPML.Expression;
import it.unibo.fPML.FPMLFactory;
import it.unibo.fPML.IOEffectFullFunction;
import it.unibo.fPML.IOPureFunction;
import it.unibo.fPML.IOType;
import it.unibo.fPML.LiftEffectFullFunction;
import it.unibo.fPML.LiftPureFunction;
import it.unibo.fPML.PrimitiveEffectFullFunction;
import it.unibo.fPML.PrimitiveEffectFullValue;
import it.unibo.fPML.PrimitivePureFunction;
import it.unibo.fPML.PureAlgebraicType;
import it.unibo.fPML.PureArgument;
import it.unibo.fPML.PureData;
import it.unibo.fPML.PureExpressionAndPureFunctionReference;
import it.unibo.fPML.PureFunction;
import it.unibo.fPML.PureFunctionDefinition;
import it.unibo.fPML.PureFunctionType;
import it.unibo.fPML.PureIfBody;
import it.unibo.fPML.PureProdTypeFactor;
import it.unibo.fPML.PureProdValue;
import it.unibo.fPML.PureSumTypeFactor;
import it.unibo.fPML.PureSumValue;
import it.unibo.fPML.PureValue;
import it.unibo.fPML.Type;
import it.unibo.fPML.UnitType;
import it.unibo.fPML.ValueType;
import it.unibo.fPML.VoidType;
import it.unibo.validation.utilitiesFunctions.GetArgType;
import it.unibo.validation.utilitiesFunctions.GetReturnType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.EcoreUtil2;

@SuppressWarnings("all")
public class Others {
  public static PureFunction getFunctionDefinitionFromPureFactor(final CompositionFunctionBodyPureFactor cfbpf) {
    if ((Objects.equal(cfbpf.getPrimitiveElement(), null) && Objects.equal(cfbpf.getReferenceElement(), null))) {
      Expression _expressionElement = cfbpf.getExpressionElement();
      return EcoreUtil.<Expression>copy(_expressionElement);
    } else {
      PureFunction _referenceElement = cfbpf.getReferenceElement();
      boolean _equals = Objects.equal(_referenceElement, null);
      if (_equals) {
        PrimitivePureFunction _primitiveElement = cfbpf.getPrimitiveElement();
        return EcoreUtil.<PrimitivePureFunction>copy(_primitiveElement);
      } else {
        PureFunction _referenceElement_1 = cfbpf.getReferenceElement();
        return EcoreUtil.<PureFunction>copy(_referenceElement_1);
      }
    }
  }
  
  public static EffectFullBodyContent getFunctionDefinitionFromEffectFullFactor(final CompositionFunctionBodyEffectFullFactor cfbef) {
    EffectFullFunction _xifexpression = null;
    if ((Objects.equal(cfbef.getPrimitiveElement(), null) && Objects.equal(cfbef.getReferenceElement(), null))) {
      EffectFullExpression _expressionElement = cfbef.getExpressionElement();
      return EcoreUtil.<EffectFullExpression>copy(_expressionElement);
    } else {
      EffectFullFunction _xifexpression_1 = null;
      EffectFullFunction _referenceElement = cfbef.getReferenceElement();
      boolean _equals = Objects.equal(_referenceElement, null);
      if (_equals) {
        EffectFullPrimitive _primitiveElement = cfbef.getPrimitiveElement();
        return EcoreUtil.<EffectFullPrimitive>copy(_primitiveElement);
      } else {
        EffectFullFunction _referenceElement_1 = cfbef.getReferenceElement();
        _xifexpression_1 = EcoreUtil.<EffectFullFunction>copy(_referenceElement_1);
      }
      _xifexpression = _xifexpression_1;
    }
    return _xifexpression;
  }
  
  public static PureFunction getFirstFunctionDefinitionFromCompositionBodyPure(final CompositionFunctionBodyPure cfbp) {
    if ((Objects.equal(cfbp.getPrimitiveElement(), null) && Objects.equal(cfbp.getReferenceElement(), null))) {
      Expression _expressionElement = cfbp.getExpressionElement();
      return EcoreUtil.<Expression>copy(_expressionElement);
    } else {
      PureFunction _referenceElement = cfbp.getReferenceElement();
      boolean _equals = Objects.equal(_referenceElement, null);
      if (_equals) {
        PrimitivePureFunction _primitiveElement = cfbp.getPrimitiveElement();
        return EcoreUtil.<PrimitivePureFunction>copy(_primitiveElement);
      } else {
        PureFunction _referenceElement_1 = cfbp.getReferenceElement();
        return EcoreUtil.<PureFunction>copy(_referenceElement_1);
      }
    }
  }
  
  public static EffectFullBodyContent getFirstFunctionDefinitionFromCompositionBodyEffectFull(final CompositionFunctionBodyEffect cfbe) {
    if ((Objects.equal(cfbe.getPrimitiveElement(), null) && Objects.equal(cfbe.getReferenceElement(), null))) {
      EffectFullExpression _expressionElement = cfbe.getExpressionElement();
      return EcoreUtil.<EffectFullExpression>copy(_expressionElement);
    } else {
      EffectFullFunction _referenceElement = cfbe.getReferenceElement();
      boolean _equals = Objects.equal(_referenceElement, null);
      if (_equals) {
        EffectFullPrimitive _primitiveElement = cfbe.getPrimitiveElement();
        return EcoreUtil.<EffectFullPrimitive>copy(_primitiveElement);
      } else {
        EffectFullFunction _referenceElement_1 = cfbe.getReferenceElement();
        return EcoreUtil.<EffectFullFunction>copy(_referenceElement_1);
      }
    }
  }
  
  public static EffectFullBodyContent getValueFromApplyFIOFactor(final ApplyFIOFactor afiof) {
    EffectFullPrimitive _valuePrimitive = afiof.getValuePrimitive();
    boolean _notEquals = (!Objects.equal(_valuePrimitive, null));
    if (_notEquals) {
      EffectFullPrimitive _valuePrimitive_1 = afiof.getValuePrimitive();
      return EcoreUtil.<EffectFullPrimitive>copy(_valuePrimitive_1);
    } else {
      EffectFullFunction _valueReference = afiof.getValueReference();
      boolean _notEquals_1 = (!Objects.equal(_valueReference, null));
      if (_notEquals_1) {
        EffectFullFunction _valueReference_1 = afiof.getValueReference();
        return EcoreUtil.<EffectFullFunction>copy(_valueReference_1);
      } else {
        EffectFullExpression _valueExpression = afiof.getValueExpression();
        return EcoreUtil.<EffectFullExpression>copy(_valueExpression);
      }
    }
  }
  
  public static PureFunction getValueFromApplyFFactor(final ApplyFFactor afiof) {
    Expression _valueExpression = afiof.getValueExpression();
    boolean _notEquals = (!Objects.equal(_valueExpression, null));
    if (_notEquals) {
      Expression _valueExpression_1 = afiof.getValueExpression();
      return EcoreUtil.<Expression>copy(_valueExpression_1);
    } else {
      PureFunction _valueReference = afiof.getValueReference();
      return EcoreUtil.<PureFunction>copy(_valueReference);
    }
  }
  
  public static ValueType getElement2ValueTypeFromPureAlgebraicType(final PureAlgebraicType pat) {
    ValueType _switchResult = null;
    EObject _pureAdtElement2 = pat.getPureAdtElement2();
    boolean _matched = false;
    if (_pureAdtElement2 instanceof PureSumTypeFactor) {
      _matched=true;
      EObject _pureAdtElement2_1 = pat.getPureAdtElement2();
      ValueType _adtElement = ((PureSumTypeFactor) _pureAdtElement2_1).getAdtElement();
      _switchResult = EcoreUtil.<ValueType>copy(_adtElement);
    }
    if (!_matched) {
      if (_pureAdtElement2 instanceof PureProdTypeFactor) {
        _matched=true;
        EObject _pureAdtElement2_1 = pat.getPureAdtElement2();
        ValueType _adtElement = ((PureProdTypeFactor) _pureAdtElement2_1).getAdtElement();
        _switchResult = EcoreUtil.<ValueType>copy(_adtElement);
      }
    }
    return _switchResult;
  }
  
  public static Type getElement2ValueTypeFromEffectFullAlgebraicType(final EffectFullAlgebraicType eat) {
    Type _switchResult = null;
    EObject _effectFullAdtElement2 = eat.getEffectFullAdtElement2();
    boolean _matched = false;
    if (_effectFullAdtElement2 instanceof EffectFullSumTypeFactor) {
      _matched=true;
      EObject _effectFullAdtElement2_1 = eat.getEffectFullAdtElement2();
      Type _adtElement = ((EffectFullSumTypeFactor) _effectFullAdtElement2_1).getAdtElement();
      _switchResult = EcoreUtil.<Type>copy(_adtElement);
    }
    if (!_matched) {
      if (_effectFullAdtElement2 instanceof EffectFullProdTypeFactor) {
        _matched=true;
        EObject _effectFullAdtElement2_1 = eat.getEffectFullAdtElement2();
        Type _adtElement = ((EffectFullProdTypeFactor) _effectFullAdtElement2_1).getAdtElement();
        _switchResult = EcoreUtil.<Type>copy(_adtElement);
      }
    }
    return _switchResult;
  }
  
  public static Type getArgumentType(final Argument a) {
    Type _switchResult = null;
    boolean _matched = false;
    if (a instanceof EffectFullArgument) {
      _matched=true;
      EffectFullType _type = ((EffectFullArgument)a).getType();
      _switchResult = EcoreUtil.<EffectFullType>copy(_type);
    }
    if (!_matched) {
      if (a instanceof PureArgument) {
        _matched=true;
        ValueType _type = ((PureArgument)a).getType();
        _switchResult = EcoreUtil.<ValueType>copy(_type);
      }
    }
    return _switchResult;
  }
  
  public static PureFunction getPureFunctionFromIOPureFunction(final IOPureFunction iopf) {
    PureFunction _pureFunction = iopf.getPureFunction();
    boolean _equals = Objects.equal(_pureFunction, null);
    if (_equals) {
      PrimitivePureFunction _purePrimitive = iopf.getPurePrimitive();
      return EcoreUtil.<PrimitivePureFunction>copy(_purePrimitive);
    } else {
      PureFunction _pureFunction_1 = iopf.getPureFunction();
      return EcoreUtil.<PureFunction>copy(_pureFunction_1);
    }
  }
  
  public static String getArgumentName(final Argument argument) {
    String _switchResult = null;
    boolean _matched = false;
    if (argument instanceof PureArgument) {
      _matched=true;
      _switchResult = ((PureArgument)argument).getName();
    }
    if (!_matched) {
      if (argument instanceof EffectFullArgument) {
        _matched=true;
        _switchResult = ((EffectFullArgument)argument).getName();
      }
    }
    return _switchResult;
  }
  
  public static EffectFullFunction getEffectFullFunctionFromIOEffectFullFunction(final IOEffectFullFunction function) {
    EffectFullFunction _xifexpression = null;
    EffectFullFunction _effectFullFunction = function.getEffectFullFunction();
    boolean _equals = Objects.equal(_effectFullFunction, null);
    if (_equals) {
      PrimitiveEffectFullFunction _effectFullPrimitive = function.getEffectFullPrimitive();
      _xifexpression = EcoreUtil.<PrimitiveEffectFullFunction>copy(_effectFullPrimitive);
    } else {
      EffectFullFunction _effectFullFunction_1 = function.getEffectFullFunction();
      _xifexpression = EcoreUtil.<EffectFullFunction>copy(_effectFullFunction_1);
    }
    return _xifexpression;
  }
  
  public static PureFunction getPureFunctionFromLiftPureFunction(final LiftPureFunction lpf) {
    PrimitivePureFunction _xifexpression = null;
    PrimitivePureFunction _functionPrimitive = lpf.getFunctionPrimitive();
    boolean _equals = Objects.equal(_functionPrimitive, null);
    if (_equals) {
      PureFunction _functionRef = lpf.getFunctionRef();
      return EcoreUtil.<PureFunction>copy(_functionRef);
    } else {
      PrimitivePureFunction _functionPrimitive_1 = lpf.getFunctionPrimitive();
      _xifexpression = EcoreUtil.<PrimitivePureFunction>copy(_functionPrimitive_1);
    }
    return _xifexpression;
  }
  
  public static EffectFullFunction getEffectFullFunctionFromLiftEffectFullFunction(final LiftEffectFullFunction eff) {
    PrimitiveEffectFullFunction _xifexpression = null;
    PrimitiveEffectFullFunction _functionPrimitive = eff.getFunctionPrimitive();
    boolean _equals = Objects.equal(_functionPrimitive, null);
    if (_equals) {
      EffectFullFunction _functionRef = eff.getFunctionRef();
      return EcoreUtil.<EffectFullFunction>copy(_functionRef);
    } else {
      PrimitiveEffectFullFunction _functionPrimitive_1 = eff.getFunctionPrimitive();
      _xifexpression = EcoreUtil.<PrimitiveEffectFullFunction>copy(_functionPrimitive_1);
    }
    return _xifexpression;
  }
  
  public static PureFunction getFunctionFromPureIfBody(final PureIfBody pib) {
    PureFunction _xifexpression = null;
    Expression _functionExpression = pib.getFunctionExpression();
    boolean _equals = Objects.equal(_functionExpression, null);
    if (_equals) {
      PureFunction _functionReference = pib.getFunctionReference();
      _xifexpression = EcoreUtil.<PureFunction>copy(_functionReference);
    } else {
      Expression _functionExpression_1 = pib.getFunctionExpression();
      _xifexpression = EcoreUtil.<Expression>copy(_functionExpression_1);
    }
    return _xifexpression;
  }
  
  public static EffectFullBodyContent getFunctionFromEffectFullIfBody(final EffectFullIfBody efib) {
    EffectFullBodyContent _xifexpression = null;
    EffectFullExpression _functionExpression = efib.getFunctionExpression();
    boolean _equals = Objects.equal(_functionExpression, null);
    if (_equals) {
      EffectFullFunction _functionReference = efib.getFunctionReference();
      _xifexpression = EcoreUtil.<EffectFullFunction>copy(_functionReference);
    } else {
      EffectFullExpression _functionExpression_1 = efib.getFunctionExpression();
      _xifexpression = EcoreUtil.<EffectFullExpression>copy(_functionExpression_1);
    }
    return _xifexpression;
  }
  
  public static PureFunction getInnerElementFromPureExpressionAndPureFunctionReference(final PureExpressionAndPureFunctionReference r) {
    PureFunction _xifexpression = null;
    Expression _prodAdtElementExpression = r.getProdAdtElementExpression();
    boolean _equals = Objects.equal(_prodAdtElementExpression, null);
    if (_equals) {
      PureFunction _prodAdtElementFunction = r.getProdAdtElementFunction();
      _xifexpression = EcoreUtil.<PureFunction>copy(_prodAdtElementFunction);
    } else {
      Expression _prodAdtElementExpression_1 = r.getProdAdtElementExpression();
      _xifexpression = EcoreUtil.<Expression>copy(_prodAdtElementExpression_1);
    }
    return _xifexpression;
  }
  
  public static PureExpressionAndPureFunctionReference getFirstElementFromPureAlgebraicValue(final PureSumValue psv) {
    PureExpressionAndPureFunctionReference _xifexpression = null;
    PureExpressionAndPureFunctionReference _sumAdtElement1 = psv.getSumAdtElement1();
    boolean _equals = Objects.equal(_sumAdtElement1, null);
    if (_equals) {
      PureExpressionAndPureFunctionReference _sumAdtElement2 = psv.getSumAdtElement2();
      _xifexpression = EcoreUtil.<PureExpressionAndPureFunctionReference>copy(_sumAdtElement2);
    } else {
      PureExpressionAndPureFunctionReference _sumAdtElement1_1 = psv.getSumAdtElement1();
      _xifexpression = EcoreUtil.<PureExpressionAndPureFunctionReference>copy(_sumAdtElement1_1);
    }
    return _xifexpression;
  }
  
  public static PureExpressionAndPureFunctionReference getFirstElementFromPureAlgebraicValue(final PureProdValue ppv) {
    PureExpressionAndPureFunctionReference _xifexpression = null;
    PureExpressionAndPureFunctionReference _prodAdtElement1 = ppv.getProdAdtElement1();
    boolean _equals = Objects.equal(_prodAdtElement1, null);
    if (_equals) {
      PureExpressionAndPureFunctionReference _prodAdtElement2 = ppv.getProdAdtElement2();
      _xifexpression = EcoreUtil.<PureExpressionAndPureFunctionReference>copy(_prodAdtElement2);
    } else {
      PureExpressionAndPureFunctionReference _prodAdtElement1_1 = ppv.getProdAdtElement1();
      _xifexpression = EcoreUtil.<PureExpressionAndPureFunctionReference>copy(_prodAdtElement1_1);
    }
    return _xifexpression;
  }
  
  public static EffectFullBodyContent getInnerElementFromEffectFullExpressionAndEffectFullFunctionReference(final EffectFullExpressionAndEffectFullFunctionReference r) {
    EffectFullBodyContent _xifexpression = null;
    EffectFullExpression _prodAdtElementExpression = r.getProdAdtElementExpression();
    boolean _equals = Objects.equal(_prodAdtElementExpression, null);
    if (_equals) {
      EffectFullFunction _prodAdtElementFunction = r.getProdAdtElementFunction();
      _xifexpression = EcoreUtil.<EffectFullFunction>copy(_prodAdtElementFunction);
    } else {
      EffectFullExpression _prodAdtElementExpression_1 = r.getProdAdtElementExpression();
      _xifexpression = EcoreUtil.<EffectFullExpression>copy(_prodAdtElementExpression_1);
    }
    return _xifexpression;
  }
  
  public static PureFunctionType createPureFuntionType(final ValueType argT, final ValueType returnT) {
    final PureFunctionType func = FPMLFactory.eINSTANCE.createPureFunctionType();
    ValueType _copy = EcoreUtil.<ValueType>copy(argT);
    func.setArgType(_copy);
    ValueType _copy_1 = EcoreUtil.<ValueType>copy(returnT);
    func.setReturnType(_copy_1);
    return func;
  }
  
  public static EffectFullFunctionType createEffectFullFuntionType(final Type argT, final IOType returnT) {
    final EffectFullFunctionType func = FPMLFactory.eINSTANCE.createEffectFullFunctionType();
    Type _copy = EcoreUtil.<Type>copy(argT);
    func.setArgType(_copy);
    IOType _copy_1 = EcoreUtil.<IOType>copy(returnT);
    func.setReturnType(_copy_1);
    return func;
  }
  
  public static EffectFullArgument createUnitEffectFullArgument() {
    final EffectFullArgument arg = FPMLFactory.eINSTANCE.createEffectFullArgument();
    final IOType unitType = FPMLFactory.eINSTANCE.createIOType();
    UnitType _createUnitType = FPMLFactory.eINSTANCE.createUnitType();
    unitType.setType(_createUnitType);
    arg.setType(unitType);
    return arg;
  }
  
  public static EffectFullArgument createVoidEffectFullArgument() {
    final EffectFullArgument arg = FPMLFactory.eINSTANCE.createEffectFullArgument();
    VoidType _createVoidType = FPMLFactory.eINSTANCE.createVoidType();
    arg.setType(_createVoidType);
    return arg;
  }
  
  public static PureAlgebraicType createPureAlgebraicType(final ValueType vt1, final ValueType vt2, final boolean isSumType) {
    PureAlgebraicType _xblockexpression = null;
    {
      final PureAlgebraicType pat = FPMLFactory.eINSTANCE.createPureAlgebraicType();
      if (isSumType) {
        final PureSumTypeFactor factor = FPMLFactory.eINSTANCE.createPureSumTypeFactor();
        ValueType _copy = EcoreUtil.<ValueType>copy(vt2);
        factor.setAdtElement(_copy);
        pat.setPureAdtElement2(factor);
        ValueType _copy_1 = EcoreUtil.<ValueType>copy(vt1);
        pat.setPureAdtElement1(_copy_1);
      } else {
        final PureProdTypeFactor factor_1 = FPMLFactory.eINSTANCE.createPureProdTypeFactor();
        ValueType _copy_2 = EcoreUtil.<ValueType>copy(vt2);
        factor_1.setAdtElement(_copy_2);
        pat.setPureAdtElement2(factor_1);
        ValueType _copy_3 = EcoreUtil.<ValueType>copy(vt1);
        pat.setPureAdtElement1(_copy_3);
      }
      _xblockexpression = pat;
    }
    return _xblockexpression;
  }
  
  public static EffectFullAlgebraicType createEffectFullAlgebraicType(final Type t1, final Type t2, final boolean isSumType) {
    EffectFullAlgebraicType _xblockexpression = null;
    {
      final EffectFullAlgebraicType efat = FPMLFactory.eINSTANCE.createEffectFullAlgebraicType();
      if (isSumType) {
        final EffectFullSumTypeFactor factor = FPMLFactory.eINSTANCE.createEffectFullSumTypeFactor();
        Type _copy = EcoreUtil.<Type>copy(t2);
        factor.setAdtElement(_copy);
        efat.setEffectFullAdtElement2(factor);
        Type _copy_1 = EcoreUtil.<Type>copy(t1);
        efat.setEffectFullAdtElement1(_copy_1);
      } else {
        final EffectFullProdTypeFactor factor_1 = FPMLFactory.eINSTANCE.createEffectFullProdTypeFactor();
        Type _copy_2 = EcoreUtil.<Type>copy(t2);
        factor_1.setAdtElement(_copy_2);
        efat.setEffectFullAdtElement2(factor_1);
        Type _copy_3 = EcoreUtil.<Type>copy(t1);
        efat.setEffectFullAdtElement1(_copy_3);
      }
      _xblockexpression = efat;
    }
    return _xblockexpression;
  }
  
  public static DataType createDataType(final PureData pd) {
    final DataType dataType = FPMLFactory.eINSTANCE.createDataType();
    PureData _copy = EcoreUtil.<PureData>copy(pd);
    dataType.setType(_copy);
    return dataType;
  }
  
  public static EffectFullDataType createDataType(final EffectFullData pd) {
    final EffectFullDataType dataType = FPMLFactory.eINSTANCE.createEffectFullDataType();
    EffectFullData _copy = EcoreUtil.<EffectFullData>copy(pd);
    dataType.setType(_copy);
    return dataType;
  }
  
  public static IOType IOWrap(final Type t) {
    final IOType returnT = FPMLFactory.eINSTANCE.createIOType();
    Type _copy = EcoreUtil2.<Type>copy(t);
    returnT.setType(_copy);
    return returnT;
  }
  
  public static ValueType createTypeOfPureFunction(final PureFunction pf) {
    ValueType _switchResult = null;
    boolean _matched = false;
    if (pf instanceof PureValue) {
      _matched=true;
      Expression _value = ((PureValue)pf).getValue();
      ValueType _expression = GetReturnType.expression(_value);
      _switchResult = EcoreUtil.<ValueType>copy(_expression);
    }
    if (!_matched) {
      if (pf instanceof PureFunctionDefinition) {
        _matched=true;
        ValueType _pureFunction = GetArgType.pureFunction(pf);
        ValueType _pureFunction_1 = GetReturnType.pureFunction(pf);
        _switchResult = Others.createPureFuntionType(_pureFunction, _pureFunction_1);
      }
    }
    if (!_matched) {
      if (pf instanceof PrimitivePureFunction) {
        _matched=true;
        ValueType _pureFunction = GetArgType.pureFunction(pf);
        ValueType _pureFunction_1 = GetReturnType.pureFunction(pf);
        _switchResult = Others.createPureFuntionType(_pureFunction, _pureFunction_1);
      }
    }
    if (!_matched) {
      if (pf instanceof PureArgument) {
        _matched=true;
        ValueType _type = ((PureArgument)pf).getType();
        _switchResult = EcoreUtil.<ValueType>copy(_type);
      }
    }
    if (!_matched) {
      if (pf instanceof Expression) {
        _matched=true;
        ValueType _expression = GetReturnType.expression(((Expression)pf));
        _switchResult = EcoreUtil.<ValueType>copy(_expression);
      }
    }
    return _switchResult;
  }
  
  public static Type createTypeOfEffectFullFunction(final EffectFullFunction function) {
    Type _switchResult = null;
    boolean _matched = false;
    if (function instanceof EffectFullValue) {
      _matched=true;
      EffectFullExpression _value = ((EffectFullValue)function).getValue();
      Type _effectFullExpression = GetReturnType.effectFullExpression(_value);
      _switchResult = EcoreUtil.<Type>copy(_effectFullExpression);
    }
    if (!_matched) {
      if (function instanceof EffectFullArgument) {
        _matched=true;
        EffectFullType _type = ((EffectFullArgument)function).getType();
        _switchResult = EcoreUtil.<EffectFullType>copy(_type);
      }
    }
    if (!_matched) {
      if (function instanceof PrimitiveEffectFullFunction) {
        _matched=true;
        Type _effectFullFunction = GetArgType.effectFullFunction(function);
        Type _effectFullFunction_1 = GetReturnType.effectFullFunction(function);
        _switchResult = Others.createEffectFullFuntionType(_effectFullFunction, ((IOType) _effectFullFunction_1));
      }
    }
    if (!_matched) {
      if (function instanceof EffectFullFunctionDefinition) {
        _matched=true;
        Type _effectFullFunction = GetArgType.effectFullFunction(function);
        Type _effectFullFunction_1 = GetReturnType.effectFullFunction(function);
        _switchResult = Others.createEffectFullFuntionType(_effectFullFunction, ((IOType) _effectFullFunction_1));
      }
    }
    return _switchResult;
  }
  
  public static Type createTypeOfEffectFullBodyContent(final EffectFullBodyContent content) {
    Type _switchResult = null;
    boolean _matched = false;
    if (content instanceof EffectFullFunction) {
      _matched=true;
      _switchResult = Others.createTypeOfEffectFullFunction(((EffectFullFunction)content));
    }
    if (!_matched) {
      if (content instanceof EffectFullPrimitive) {
        _matched=true;
        _switchResult = Others.createTypeOfEffectFullPrimitive(((EffectFullPrimitive)content));
      }
    }
    if (!_matched) {
      if (content instanceof EffectFullFunctionType) {
        _matched=true;
        Type _xblockexpression = null;
        {
          Type _effectFullExpression = GetReturnType.effectFullExpression(((EffectFullExpression) content));
          final Type returnType = EcoreUtil.<Type>copy(_effectFullExpression);
          Type _xifexpression = null;
          EffectFullFunctionDefinition _value = ((EffectFullFunctionType)content).getValue();
          if ((_value instanceof EffectFullLambda)) {
            EffectFullFunctionType _xblockexpression_1 = null;
            {
              EffectFullFunctionDefinition _value_1 = ((EffectFullFunctionType)content).getValue();
              Type _effectFullLambda = GetArgType.effectFullLambda(((EffectFullLambda) _value_1));
              final Type argType = EcoreUtil.<Type>copy(_effectFullLambda);
              EffectFullFunctionType _xifexpression_1 = null;
              if ((returnType instanceof IOType)) {
                _xifexpression_1 = Others.createEffectFullFuntionType(argType, ((IOType) returnType));
              } else {
                IOType _IOWrap = Others.IOWrap(returnType);
                _xifexpression_1 = Others.createEffectFullFuntionType(argType, _IOWrap);
              }
              _xblockexpression_1 = _xifexpression_1;
            }
            _xifexpression = _xblockexpression_1;
          } else {
            _xifexpression = returnType;
          }
          _xblockexpression = _xifexpression;
        }
        _switchResult = _xblockexpression;
      }
    }
    if (!_matched) {
      if (content instanceof EffectFullExpression) {
        _matched=true;
        _switchResult = GetReturnType.effectFullExpression(((EffectFullExpression) content));
      }
    }
    return _switchResult;
  }
  
  public static EffectFullType createTypeOfEffectFullPrimitive(final EffectFullPrimitive primitive) {
    EffectFullType _switchResult = null;
    boolean _matched = false;
    if (primitive instanceof PrimitiveEffectFullFunction) {
      _matched=true;
      EffectFullFunctionType _xblockexpression = null;
      {
        Type _effectFullPrimitive = GetReturnType.effectFullPrimitive(primitive);
        final Type returnType = EcoreUtil.<Type>copy(_effectFullPrimitive);
        EffectFullFunctionType _xifexpression = null;
        if ((returnType instanceof IOType)) {
          Type _effectFullPrimitive_1 = GetArgType.effectFullPrimitive(primitive);
          Type _effectFullPrimitive_2 = GetReturnType.effectFullPrimitive(primitive);
          _xifexpression = Others.createEffectFullFuntionType(_effectFullPrimitive_1, ((IOType) _effectFullPrimitive_2));
        } else {
          Type _effectFullPrimitive_3 = GetArgType.effectFullPrimitive(primitive);
          Type _effectFullPrimitive_4 = GetReturnType.effectFullPrimitive(primitive);
          IOType _IOWrap = Others.IOWrap(_effectFullPrimitive_4);
          _xifexpression = Others.createEffectFullFuntionType(_effectFullPrimitive_3, _IOWrap);
        }
        _xblockexpression = _xifexpression;
      }
      _switchResult = _xblockexpression;
    }
    if (!_matched) {
      if (primitive instanceof PrimitiveEffectFullValue) {
        _matched=true;
        _switchResult = GetReturnType.primitiveEffectFullValue(((PrimitiveEffectFullValue)primitive));
      }
    }
    return _switchResult;
  }
  
  public static PureExpressionAndPureFunctionReference createPureExpressionAndPureFunctionReference(final Expression e) {
    final PureExpressionAndPureFunctionReference result = FPMLFactory.eINSTANCE.createPureExpressionAndPureFunctionReference();
    Expression _copy = EcoreUtil.<Expression>copy(e);
    result.setProdAdtElementExpression(_copy);
    return result;
  }
  
  public static PureExpressionAndPureFunctionReference createPureExpressionAndPureFunctionReference(final PureFunction f) {
    final PureExpressionAndPureFunctionReference result = FPMLFactory.eINSTANCE.createPureExpressionAndPureFunctionReference();
    PureFunction _copy = EcoreUtil.<PureFunction>copy(f);
    result.setProdAdtElementFunction(_copy);
    return result;
  }
  
  public static EffectFullExpressionAndEffectFullFunctionReference createEffectFullExpressionAndEffectFullFunctionReference(final EffectFullExpression e) {
    final EffectFullExpressionAndEffectFullFunctionReference result = FPMLFactory.eINSTANCE.createEffectFullExpressionAndEffectFullFunctionReference();
    EffectFullExpression _copy = EcoreUtil.<EffectFullExpression>copy(e);
    result.setProdAdtElementExpression(_copy);
    return result;
  }
  
  public static EffectFullExpressionAndEffectFullFunctionReference createEffectFullExpressionAndEffectFullFunctionReference(final EffectFullFunction f) {
    final EffectFullExpressionAndEffectFullFunctionReference result = FPMLFactory.eINSTANCE.createEffectFullExpressionAndEffectFullFunctionReference();
    EffectFullFunction _copy = EcoreUtil.<EffectFullFunction>copy(f);
    result.setProdAdtElementFunction(_copy);
    return result;
  }
}
