package it.unibo.validation.utilitiesFunctions;

import com.google.common.base.Objects;
import it.unibo.fPML.ApplyFFactor;
import it.unibo.fPML.ApplyFIOFactor;
import it.unibo.fPML.CompositionFunctionBodyEffect;
import it.unibo.fPML.CompositionFunctionBodyEffectFullFactor;
import it.unibo.fPML.CompositionFunctionBodyPure;
import it.unibo.fPML.CompositionFunctionBodyPureFactor;
import it.unibo.fPML.DataType;
import it.unibo.fPML.EffectFullAlgebraicType;
import it.unibo.fPML.EffectFullArgument;
import it.unibo.fPML.EffectFullData;
import it.unibo.fPML.EffectFullDataType;
import it.unibo.fPML.EffectFullFunction;
import it.unibo.fPML.EffectFullPrimitive;
import it.unibo.fPML.EffectFullProdTypeFactor;
import it.unibo.fPML.EffectFullSumTypeFactor;
import it.unibo.fPML.Expression;
import it.unibo.fPML.FPMLFactory;
import it.unibo.fPML.IOType;
import it.unibo.fPML.PureAlgebraicType;
import it.unibo.fPML.PureData;
import it.unibo.fPML.PureFunction;
import it.unibo.fPML.PureFunctionType;
import it.unibo.fPML.PureProdTypeFactor;
import it.unibo.fPML.PureSumTypeFactor;
import it.unibo.fPML.Type;
import it.unibo.fPML.ValueType;
import it.unibo.fPML.VoidType;
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
  
  public static EObject getFunctionDefinitionFromEffectFullFactor(final CompositionFunctionBodyEffectFullFactor cfbef) {
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
  
  public static /* EffectFullReference */Object getFirstFunctionDefinitionFromCompositionBodyEffectFull(final CompositionFunctionBodyEffect cfbe) {
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
  
  public static /* EffectFullReference */Object getValueFromApplyFIOFactor(final ApplyFIOFactor afiof) {
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
  
  public static PureFunctionType createFuntionType(final ValueType argT, final ValueType returnT) {
    final PureFunctionType func = FPMLFactory.eINSTANCE.createPureFunctionType();
    func.setArgType(argT);
    func.setReturnType(returnT);
    return func;
  }
  
  public static IOType IOWrap(final Type t) {
    final IOType returnT = FPMLFactory.eINSTANCE.createIOType();
    Type _copy = EcoreUtil2.<Type>copy(t);
    returnT.setType(_copy);
    return returnT;
  }
  
  public static EffectFullArgument createUnitEffectFullArgument() {
    throw new Error("Unresolved compilation problems:"
      + "\nType mismatch: cannot convert from UnitType to EffectFullType");
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
}
