package it.unibo.validation.utilitiesFunctions;

import com.google.common.base.Objects;
import it.unibo.fPML.ApplyFFactor;
import it.unibo.fPML.ApplyFIOFactor;
import it.unibo.fPML.CompositionFunctionBodyEffect;
import it.unibo.fPML.CompositionFunctionBodyEffectFullFactor;
import it.unibo.fPML.CompositionFunctionBodyPure;
import it.unibo.fPML.CompositionFunctionBodyPureFactor;
import it.unibo.fPML.EffectFullAlgebraicType;
import it.unibo.fPML.EffectFullArgument;
import it.unibo.fPML.EffectFullProdTypeFactor;
import it.unibo.fPML.EffectFullReference;
import it.unibo.fPML.EffectFullSumTypeFactor;
import it.unibo.fPML.FPMLFactory;
import it.unibo.fPML.IOType;
import it.unibo.fPML.IntegerType;
import it.unibo.fPML.PrimitiveEffectFullValue;
import it.unibo.fPML.PrimitiveFunction;
import it.unibo.fPML.PrimitivePureFunction;
import it.unibo.fPML.PureAlgebraicType;
import it.unibo.fPML.PureFunction;
import it.unibo.fPML.PureFunctionDefinition;
import it.unibo.fPML.PureFunctionType;
import it.unibo.fPML.PureProdTypeFactor;
import it.unibo.fPML.PureSumTypeFactor;
import it.unibo.fPML.Type;
import it.unibo.fPML.UnitType;
import it.unibo.fPML.ValueType;
import it.unibo.fPML.VoidType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.EcoreUtil2;

@SuppressWarnings("all")
public class Others {
  public static PureFunction getFunctionDefinitionFromPureFactor(final CompositionFunctionBodyPureFactor cfbpf) {
    PrimitivePureFunction _primitiveElement = cfbpf.getPrimitiveElement();
    boolean _equals = Objects.equal(_primitiveElement, null);
    if (_equals) {
      return cfbpf.getReferenceElement();
    } else {
      return cfbpf.getPrimitiveElement();
    }
  }
  
  public static EffectFullReference getFunctionDefinitionFromEffectFullFactor(final CompositionFunctionBodyEffectFullFactor cfbef) {
    PrimitiveFunction _primitiveElement = cfbef.getPrimitiveElement();
    boolean _equals = Objects.equal(_primitiveElement, null);
    if (_equals) {
      return cfbef.getReferenceElement();
    } else {
      return cfbef.getPrimitiveElement();
    }
  }
  
  public static PureFunction getFirstFunctionDefinitionFromCompositionBodyPure(final CompositionFunctionBodyPure cfbp) {
    PrimitivePureFunction _primitiveElement = cfbp.getPrimitiveElement();
    boolean _equals = Objects.equal(_primitiveElement, null);
    if (_equals) {
      return cfbp.getReferenceElement();
    } else {
      return cfbp.getPrimitiveElement();
    }
  }
  
  public static EffectFullReference getFirstFunctionDefinitionFromCompositionBodyEffectFull(final CompositionFunctionBodyEffect cfbe) {
    PrimitiveFunction _primitiveElement = cfbe.getPrimitiveElement();
    boolean _equals = Objects.equal(_primitiveElement, null);
    if (_equals) {
      return cfbe.getReferenceElement();
    } else {
      return cfbe.getPrimitiveElement();
    }
  }
  
  public static EffectFullReference getValueFromApplyFIOFactor(final ApplyFIOFactor afiof) {
    PrimitiveEffectFullValue _valuePrimitive = afiof.getValuePrimitive();
    boolean _notEquals = (!Objects.equal(_valuePrimitive, null));
    if (_notEquals) {
      return afiof.getValuePrimitive();
    } else {
      EffectFullReference _valueReference = afiof.getValueReference();
      boolean _notEquals_1 = (!Objects.equal(_valueReference, null));
      if (_notEquals_1) {
        return afiof.getValueReference();
      } else {
        return afiof.getValueLambda();
      }
    }
  }
  
  public static PureFunction getValueFromApplyFFactor(final ApplyFFactor afiof) {
    PureFunctionDefinition _valueLambda = afiof.getValueLambda();
    boolean _notEquals = (!Objects.equal(_valueLambda, null));
    if (_notEquals) {
      return afiof.getValueLambda();
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
  
  public static PureFunctionType createIntIntFuntionType() {
    final PureFunctionType func = FPMLFactory.eINSTANCE.createPureFunctionType();
    IntegerType _createIntegerType = FPMLFactory.eINSTANCE.createIntegerType();
    func.setArgType(_createIntegerType);
    IntegerType _createIntegerType_1 = FPMLFactory.eINSTANCE.createIntegerType();
    func.setReturnType(_createIntegerType_1);
    return func;
  }
  
  public static IOType IOWrap(final Type t) {
    final IOType returnT = FPMLFactory.eINSTANCE.createIOType();
    Type _copy = EcoreUtil2.<Type>copy(t);
    returnT.setType(_copy);
    return returnT;
  }
  
  public static EffectFullArgument createUnitEffectFullArgument() {
    final EffectFullArgument arg = FPMLFactory.eINSTANCE.createEffectFullArgument();
    UnitType _createUnitType = FPMLFactory.eINSTANCE.createUnitType();
    arg.setType(_createUnitType);
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
}
