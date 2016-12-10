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
import it.unibo.fPML.EffectFullFunction;
import it.unibo.fPML.EffectFullFunctionDefinition;
import it.unibo.fPML.EffectFullFunctionType;
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
import it.unibo.fPML.PrimitivePureFunction;
import it.unibo.fPML.PureAlgebraicType;
import it.unibo.fPML.PureArgument;
import it.unibo.fPML.PureData;
import it.unibo.fPML.PureFunction;
import it.unibo.fPML.PureFunctionDefinition;
import it.unibo.fPML.PureFunctionType;
import it.unibo.fPML.PureProdTypeFactor;
import it.unibo.fPML.PureSumTypeFactor;
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
      return cfbpf.getExpressionElement();
    } else {
      PureFunction _referenceElement = cfbpf.getReferenceElement();
      boolean _equals = Objects.equal(_referenceElement, null);
      if (_equals) {
        return cfbpf.getPrimitiveElement();
      } else {
        return cfbpf.getReferenceElement();
      }
    }
  }
  
  public static EffectFullBodyContent getFunctionDefinitionFromEffectFullFactor(final CompositionFunctionBodyEffectFullFactor cfbef) {
    EffectFullFunction _xifexpression = null;
    if ((Objects.equal(cfbef.getPrimitiveElement(), null) && Objects.equal(cfbef.getReferenceElement(), null))) {
      return cfbef.getExpressionElement();
    } else {
      EffectFullFunction _xifexpression_1 = null;
      EffectFullFunction _referenceElement = cfbef.getReferenceElement();
      boolean _equals = Objects.equal(_referenceElement, null);
      if (_equals) {
        return cfbef.getPrimitiveElement();
      } else {
        _xifexpression_1 = cfbef.getReferenceElement();
      }
      _xifexpression = _xifexpression_1;
    }
    return _xifexpression;
  }
  
  public static PureFunction getFirstFunctionDefinitionFromCompositionBodyPure(final CompositionFunctionBodyPure cfbp) {
    if ((Objects.equal(cfbp.getPrimitiveElement(), null) && Objects.equal(cfbp.getReferenceElement(), null))) {
      return cfbp.getExpressionElement();
    } else {
      PureFunction _referenceElement = cfbp.getReferenceElement();
      boolean _equals = Objects.equal(_referenceElement, null);
      if (_equals) {
        return cfbp.getPrimitiveElement();
      } else {
        return cfbp.getReferenceElement();
      }
    }
  }
  
  public static EffectFullBodyContent getFirstFunctionDefinitionFromCompositionBodyEffectFull(final CompositionFunctionBodyEffect cfbe) {
    if ((Objects.equal(cfbe.getPrimitiveElement(), null) && Objects.equal(cfbe.getReferenceElement(), null))) {
      return cfbe.getExpressionElement();
    } else {
      EffectFullFunction _referenceElement = cfbe.getReferenceElement();
      boolean _equals = Objects.equal(_referenceElement, null);
      if (_equals) {
        return cfbe.getPrimitiveElement();
      } else {
        return cfbe.getReferenceElement();
      }
    }
  }
  
  public static EffectFullBodyContent getValueFromApplyFIOFactor(final ApplyFIOFactor afiof) {
    EffectFullPrimitive _valuePrimitive = afiof.getValuePrimitive();
    boolean _notEquals = (!Objects.equal(_valuePrimitive, null));
    if (_notEquals) {
      return afiof.getValuePrimitive();
    } else {
      EffectFullFunction _valueReference = afiof.getValueReference();
      boolean _notEquals_1 = (!Objects.equal(_valueReference, null));
      if (_notEquals_1) {
        return afiof.getValueReference();
      } else {
        return afiof.getValueExpression();
      }
    }
  }
  
  public static PureFunction getValueFromApplyFFactor(final ApplyFFactor afiof) {
    Expression _valueExpression = afiof.getValueExpression();
    boolean _notEquals = (!Objects.equal(_valueExpression, null));
    if (_notEquals) {
      return afiof.getValueExpression();
    } else {
      return afiof.getValueReference();
    }
  }
  
  public static ValueType getElement2ValueTypeFromPureAlgebraicType(final PureAlgebraicType pat) {
    ValueType _switchResult = null;
    EObject _pureAdtElement2 = pat.getPureAdtElement2();
    boolean _matched = false;
    if (_pureAdtElement2 instanceof PureSumTypeFactor) {
      _matched=true;
      EObject _pureAdtElement2_1 = pat.getPureAdtElement2();
      _switchResult = ((PureSumTypeFactor) _pureAdtElement2_1).getAdtElement();
    }
    if (!_matched) {
      if (_pureAdtElement2 instanceof PureProdTypeFactor) {
        _matched=true;
        EObject _pureAdtElement2_1 = pat.getPureAdtElement2();
        _switchResult = ((PureProdTypeFactor) _pureAdtElement2_1).getAdtElement();
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
      _switchResult = ((EffectFullSumTypeFactor) _effectFullAdtElement2_1).getAdtElement();
    }
    if (!_matched) {
      if (_effectFullAdtElement2 instanceof EffectFullProdTypeFactor) {
        _matched=true;
        EObject _effectFullAdtElement2_1 = eat.getEffectFullAdtElement2();
        _switchResult = ((EffectFullProdTypeFactor) _effectFullAdtElement2_1).getAdtElement();
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
  
  public static PureFunctionType createPureFuntionType(final ValueType argT, final ValueType returnT) {
    final PureFunctionType func = FPMLFactory.eINSTANCE.createPureFunctionType();
    func.setArgType(argT);
    func.setReturnType(returnT);
    return func;
  }
  
  public static EffectFullFunctionType createEffectFullFuntionType(final Type argT, final IOType returnT) {
    final EffectFullFunctionType func = FPMLFactory.eINSTANCE.createEffectFullFunctionType();
    func.setArgType(argT);
    func.setReturnType(returnT);
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
        factor.setAdtElement(vt2);
        pat.setPureAdtElement2(factor);
        pat.setPureAdtElement1(vt1);
      } else {
        final PureProdTypeFactor factor_1 = FPMLFactory.eINSTANCE.createPureProdTypeFactor();
        factor_1.setAdtElement(vt2);
        pat.setPureAdtElement2(factor_1);
        pat.setPureAdtElement1(vt1);
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
        factor.setAdtElement(t2);
        efat.setEffectFullAdtElement2(factor);
        efat.setEffectFullAdtElement1(t1);
      } else {
        final EffectFullProdTypeFactor factor_1 = FPMLFactory.eINSTANCE.createEffectFullProdTypeFactor();
        factor_1.setAdtElement(t2);
        efat.setEffectFullAdtElement2(factor_1);
        efat.setEffectFullAdtElement1(t1);
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
      _switchResult = GetReturnType.expression(_value);
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
        _switchResult = ((PureArgument)pf).getType();
      }
    }
    if (!_matched) {
      if (pf instanceof Expression) {
        _matched=true;
        _switchResult = GetReturnType.expression(((Expression)pf));
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
      _switchResult = GetReturnType.effectFullExpression(_value);
    }
    if (!_matched) {
      if (function instanceof EffectFullArgument) {
        _matched=true;
        _switchResult = ((EffectFullArgument)function).getType();
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
}
