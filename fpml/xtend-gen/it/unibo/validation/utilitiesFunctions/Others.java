package it.unibo.validation.utilitiesFunctions;

import com.google.common.base.Objects;
import it.unibo.fPML.ApplyFIOFactor;
import it.unibo.fPML.CompositionFunctionBodyEffect;
import it.unibo.fPML.CompositionFunctionBodyEffectFullFactor;
import it.unibo.fPML.CompositionFunctionBodyPure;
import it.unibo.fPML.CompositionFunctionBodyPureFactor;
import it.unibo.fPML.EffectFullAlgebraicType;
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
import it.unibo.fPML.PureFunctionType;
import it.unibo.fPML.PureProdTypeFactor;
import it.unibo.fPML.PureSumTypeFactor;
import it.unibo.fPML.Type;
import it.unibo.fPML.ValueType;
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
    boolean _equals = Objects.equal(_valuePrimitive, null);
    if (_equals) {
      return afiof.getValueReference();
    } else {
      return afiof.getValuePrimitive();
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
  
  public static IOType getElement2ValueTypeFromEffectFullAlgebraicType(final EffectFullAlgebraicType eat) {
    IOType _switchResult = null;
    EObject _effectFullAdtElement2 = eat.getEffectFullAdtElement2();
    boolean _matched = false;
    if (_effectFullAdtElement2 instanceof PureSumTypeFactor) {
      _matched=true;
      EObject _effectFullAdtElement2_1 = eat.getEffectFullAdtElement2();
      _switchResult = ((EffectFullSumTypeFactor) _effectFullAdtElement2_1).getAdtElement();
    }
    if (!_matched) {
      if (_effectFullAdtElement2 instanceof PureProdTypeFactor) {
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
}
