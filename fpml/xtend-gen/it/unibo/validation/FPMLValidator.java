/**
 * generated by Xtext 2.9.2
 */
package it.unibo.validation;

import it.unibo.fPML.ApplyF;
import it.unibo.fPML.ApplyFIO;
import it.unibo.fPML.ApplyFIOFactor;
import it.unibo.fPML.DataValue;
import it.unibo.fPML.EffectFullDataValue;
import it.unibo.fPML.EffectFullExpression;
import it.unibo.fPML.EffectFullFunction;
import it.unibo.fPML.EffectFullFunctionDefinition;
import it.unibo.fPML.EffectFullFunctionType;
import it.unibo.fPML.EffectFullLambda;
import it.unibo.fPML.EffectFullReference;
import it.unibo.fPML.EffectFullValue;
import it.unibo.fPML.Expression;
import it.unibo.fPML.FPMLFactory;
import it.unibo.fPML.FPMLPackage;
import it.unibo.fPML.Function;
import it.unibo.fPML.MainFunc;
import it.unibo.fPML.PrimitiveEffectFullFunction;
import it.unibo.fPML.PrimitivePureFunction;
import it.unibo.fPML.PureFunction;
import it.unibo.fPML.PureFunctionDefinition;
import it.unibo.fPML.PureFunctionType;
import it.unibo.fPML.PureLambda;
import it.unibo.fPML.PureReference;
import it.unibo.fPML.PureValue;
import it.unibo.fPML.Type;
import it.unibo.fPML.ValueType;
import it.unibo.validation.AbstractFPMLValidator;
import it.unibo.validation.utilitiesFunctions.Checks;
import it.unibo.validation.utilitiesFunctions.GetReturnType;
import it.unibo.validation.utilitiesFunctions.Others;
import org.eclipse.xtext.validation.Check;

/**
 * This class contains custom validation rules.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
@SuppressWarnings("all")
public class FPMLValidator extends AbstractFPMLValidator {
  public final static String TYPEMISMATCHFUNCTIONCOMPOSITION = "Type mismatch between the input of one function and the return of another in the function chain";
  
  public final static String TYPEMISMATCHFUNCTIONCOMPOSITIONRETURN = "The return type of the function chain and the outside function doesn\'t match";
  
  public final static String TYPEMISMATCHBETWEENVALUEANDDATA = "The value doesn\'t match the data declaration";
  
  public final static String APPLYFUNCTIONTOWRONGVALUE = "The function is APPLYF has a wrong value type";
  
  @Check
  public void typeCheck(final Function f) {
    boolean _matched = false;
    if (f instanceof PureFunction) {
      _matched=true;
      boolean _matched_1 = false;
      if (f instanceof PureValue) {
        _matched_1=true;
        this.typeCheckPureValue(((PureValue)f));
      }
      if (!_matched_1) {
        if (f instanceof PureLambda) {
          _matched_1=true;
          this.typeCheckLambda(((PureLambda)f));
        }
      }
      if (!_matched_1) {
        if (f instanceof PrimitivePureFunction) {
          _matched_1=true;
          this.typeCheckPurePrimitive(((PrimitivePureFunction)f));
        }
      }
      if (!_matched_1) {
        if (f instanceof PureFunctionDefinition) {
          _matched_1=true;
          this.typeCheckPureFunction(((PureFunctionDefinition)f));
        }
      }
    }
    if (!_matched) {
      if (f instanceof EffectFullFunction) {
        _matched=true;
        boolean _matched_1 = false;
        if (f instanceof PrimitiveEffectFullFunction) {
          _matched_1=true;
          this.typeCheckEffectFullPrimitive(((PrimitiveEffectFullFunction)f));
        }
        if (!_matched_1) {
          if (f instanceof EffectFullLambda) {
            _matched_1=true;
            this.typeCheckEffectFullLambda(((EffectFullLambda)f));
          }
        }
        if (!_matched_1) {
          if (f instanceof EffectFullValue) {
            _matched_1=true;
            this.typeCheckEffectFullValue(((EffectFullValue)f));
          }
        }
        if (!_matched_1) {
          if (f instanceof EffectFullFunctionDefinition) {
            _matched_1=true;
            this.typeCheckEffectFullFunction(((EffectFullFunctionDefinition)f));
          }
        }
      }
    }
  }
  
  @Check
  public void typeCheckMain(final MainFunc m) {
    boolean _mainReturnType = Checks.mainReturnType(m);
    boolean _not = (!_mainReturnType);
    if (_not) {
      this.error(FPMLValidator.TYPEMISMATCHFUNCTIONCOMPOSITIONRETURN, FPMLPackage.Literals.MAIN_FUNC__RETURN_TYPE);
    }
    boolean _mainArgType = Checks.mainArgType(m);
    boolean _not_1 = (!_mainArgType);
    if (_not_1) {
      this.error(FPMLValidator.TYPEMISMATCHFUNCTIONCOMPOSITION, FPMLPackage.Literals.MAIN_FUNC__FUNCTION_BODY);
    }
  }
  
  public void typeCheckEffectFullLambda(final EffectFullLambda lambda) {
    boolean _effectFullLambda = Checks.effectFullLambda(lambda);
    boolean _not = (!_effectFullLambda);
    if (_not) {
      this.error(FPMLValidator.TYPEMISMATCHFUNCTIONCOMPOSITION, FPMLPackage.Literals.EFFECT_FULL_FUNCTION_DEFINITION__FUNCTION_BODY);
    }
  }
  
  public void typeCheckEffectFullValue(final EffectFullValue value) {
    EffectFullExpression _value = value.getValue();
    if ((_value instanceof Expression)) {
      final PureValue pureValue = FPMLFactory.eINSTANCE.createPureValue();
      EffectFullExpression _value_1 = value.getValue();
      pureValue.setValue(((Expression) _value_1));
      this.typeCheckPureValue(pureValue);
    } else {
      if (((value.getValue() instanceof EffectFullDataValue) && 
        (!Checks.effectFullDataAndValue(((EffectFullDataValue) value.getValue()).getValue(), ((EffectFullDataValue) value.getValue()).getType().getContent())))) {
        this.error(FPMLValidator.TYPEMISMATCHBETWEENVALUEANDDATA, FPMLPackage.Literals.EFFECT_FULL_DATA_VALUE__VALUE);
      }
    }
  }
  
  public void typeCheckPureValue(final PureValue v) {
    if (((v.getValue() instanceof DataValue) && 
      (!Checks.DataAndValue(((DataValue) v.getValue()).getValue(), ((DataValue) v.getValue()).getType().getContent())))) {
      this.error(FPMLValidator.TYPEMISMATCHBETWEENVALUEANDDATA, FPMLPackage.Literals.PURE_VALUE__VALUE);
    }
  }
  
  public void typeCheckLambda(final PureLambda l) {
    boolean _pureLambda = Checks.pureLambda(l);
    boolean _not = (!_pureLambda);
    if (_not) {
      this.error(FPMLValidator.TYPEMISMATCHFUNCTIONCOMPOSITION, FPMLPackage.Literals.PURE_FUNCTION_DEFINITION__FUNCTION_BODY);
    }
  }
  
  public void typeCheckPurePrimitive(final PrimitivePureFunction p) {
    boolean _matched = false;
    if (p instanceof ApplyF) {
      _matched=true;
      PureFunctionType _functionType = ((ApplyF)p).getFunctionType();
      ValueType _argType = _functionType.getArgType();
      PureReference _value = ((ApplyF)p).getValue();
      ValueType _pureReference = GetReturnType.pureReference(_value);
      boolean _ValueTypeEquals = Checks.ValueTypeEquals(_argType, _pureReference);
      boolean _not = (!_ValueTypeEquals);
      if (_not) {
        this.error(FPMLValidator.APPLYFUNCTIONTOWRONGVALUE, FPMLPackage.Literals.APPLY_F__FUNCTION_TYPE);
      }
    }
  }
  
  public void typeCheckPureFunction(final PureFunctionDefinition f) {
    boolean _functionReturnType = Checks.functionReturnType(f);
    boolean _not = (!_functionReturnType);
    if (_not) {
      this.error(FPMLValidator.TYPEMISMATCHFUNCTIONCOMPOSITIONRETURN, FPMLPackage.Literals.PURE_FUNCTION_DEFINITION__RETURN_TYPE);
    }
    boolean _functionArgType = Checks.functionArgType(f);
    boolean _not_1 = (!_functionArgType);
    if (_not_1) {
      this.error(FPMLValidator.TYPEMISMATCHFUNCTIONCOMPOSITION, FPMLPackage.Literals.PURE_FUNCTION_DEFINITION__FUNCTION_BODY);
    }
  }
  
  public void typeCheckEffectFullFunction(final EffectFullFunctionDefinition f) {
    boolean _functionReturnTypeEffectFull = Checks.functionReturnTypeEffectFull(f);
    boolean _not = (!_functionReturnTypeEffectFull);
    if (_not) {
      this.error(FPMLValidator.TYPEMISMATCHFUNCTIONCOMPOSITIONRETURN, FPMLPackage.Literals.EFFECT_FULL_FUNCTION_DEFINITION__RETURN_TYPE);
    }
    boolean _functionArgTypeEffectFull = Checks.functionArgTypeEffectFull(f);
    boolean _not_1 = (!_functionArgTypeEffectFull);
    if (_not_1) {
      this.error(FPMLValidator.TYPEMISMATCHFUNCTIONCOMPOSITION, FPMLPackage.Literals.EFFECT_FULL_FUNCTION_DEFINITION__FUNCTION_BODY);
    }
  }
  
  public void typeCheckEffectFullPrimitive(final PrimitiveEffectFullFunction p) {
    boolean _matched = false;
    if (p instanceof ApplyFIO) {
      _matched=true;
      EffectFullFunctionType _functionType = ((ApplyFIO)p).getFunctionType();
      Type _argType = _functionType.getArgType();
      ApplyFIOFactor _value = ((ApplyFIO)p).getValue();
      EffectFullReference _valueFromApplyFIOFactor = Others.getValueFromApplyFIOFactor(_value);
      Type _effectFullReference = GetReturnType.effectFullReference(_valueFromApplyFIOFactor);
      boolean _TypeEquals = Checks.TypeEquals(_argType, _effectFullReference);
      boolean _not = (!_TypeEquals);
      if (_not) {
        this.error(FPMLValidator.APPLYFUNCTIONTOWRONGVALUE, FPMLPackage.Literals.APPLY_F__FUNCTION_TYPE);
      }
    }
  }
}
