/**
 * generated by Xtext 2.9.2
 */
package it.unibo.validation;

import com.google.common.base.Objects;
import it.unibo.fPML.ApplyF;
import it.unibo.fPML.ApplyFIO;
import it.unibo.fPML.DataValue;
import it.unibo.fPML.EffectFullAlgebraicType;
import it.unibo.fPML.EffectFullData;
import it.unibo.fPML.EffectFullDataValue;
import it.unibo.fPML.EffectFullExpression;
import it.unibo.fPML.EffectFullFunction;
import it.unibo.fPML.EffectFullFunctionDefinition;
import it.unibo.fPML.EffectFullIf;
import it.unibo.fPML.EffectFullIfBody;
import it.unibo.fPML.EffectFullLambda;
import it.unibo.fPML.EffectFullSumTypeFactor;
import it.unibo.fPML.EffectFullType;
import it.unibo.fPML.EffectFullValue;
import it.unibo.fPML.Expression;
import it.unibo.fPML.FPMLFactory;
import it.unibo.fPML.FPMLPackage;
import it.unibo.fPML.Function;
import it.unibo.fPML.IsLeftEffectFull;
import it.unibo.fPML.IsLeftPure;
import it.unibo.fPML.IsRightEffectFull;
import it.unibo.fPML.IsRightPure;
import it.unibo.fPML.MainFunc;
import it.unibo.fPML.PrimitiveEffectFullFunction;
import it.unibo.fPML.PrimitivePureFunction;
import it.unibo.fPML.PureAlgebraicType;
import it.unibo.fPML.PureArgument;
import it.unibo.fPML.PureFunction;
import it.unibo.fPML.PureFunctionDefinition;
import it.unibo.fPML.PureIf;
import it.unibo.fPML.PureIfBody;
import it.unibo.fPML.PureLambda;
import it.unibo.fPML.PureSumTypeFactor;
import it.unibo.fPML.PureValue;
import it.unibo.fPML.Type;
import it.unibo.fPML.UnitType;
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
  
  public final static String FUNCTIONDEFINITIONWITHUNITARGUMENT = "The function definition cannot have the first argument as Unit type. Use Values instead";
  
  public final static String EITHERCHECKERROR = "The isRight or isLeft primitive can only be applied to SumTypes";
  
  public final static String IFBRANCHESTYPEMISMATCH = "The if branches types doesn\'t match, use the ifEither instead.";
  
  public final static String EFFECTFULLVALUEWARING = "This value has a pure expression content, maybe you want to move it to pure value section";
  
  public final static String EFFECTFULLDATAWARING = "This data has a pure type, maybe you want to move it to pure data section";
  
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
  
  @Check
  public void typeCheckEffectFullData(final EffectFullData data) {
    EffectFullType _content = data.getContent();
    boolean _checkTypeContainsIOTypes = Checks.checkTypeContainsIOTypes(_content);
    boolean _not = (!_checkTypeContainsIOTypes);
    if (_not) {
      this.warning(FPMLValidator.EFFECTFULLDATAWARING, FPMLPackage.Literals.EFFECT_FULL_DATA__CONTENT);
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
      this.warning(FPMLValidator.EFFECTFULLVALUEWARING, FPMLPackage.Literals.EFFECT_FULL_VALUE__VALUE);
    } else {
      if (((value.getValue() instanceof EffectFullDataValue) && 
        (!Checks.effectFullDataAndValue(((EffectFullDataValue) value.getValue()).getValue(), ((EffectFullDataValue) value.getValue()).getType().getContent())))) {
        this.error(FPMLValidator.TYPEMISMATCHBETWEENVALUEANDDATA, FPMLPackage.Literals.EFFECT_FULL_VALUE__VALUE);
      }
    }
    EffectFullExpression _value_2 = value.getValue();
    boolean _effectFullExpressionHasSideEffects = Checks.effectFullExpressionHasSideEffects(_value_2);
    boolean _not = (!_effectFullExpressionHasSideEffects);
    if (_not) {
      this.warning(FPMLValidator.EFFECTFULLVALUEWARING, FPMLPackage.Literals.EFFECT_FULL_VALUE__VALUE);
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
    if (p instanceof IsLeftPure) {
      _matched=true;
      PureAlgebraicType _type = ((IsLeftPure)p).getType();
      ValueType _element2ValueTypeFromPureAlgebraicType = Others.getElement2ValueTypeFromPureAlgebraicType(_type);
      boolean _not = (!(_element2ValueTypeFromPureAlgebraicType instanceof PureSumTypeFactor));
      if (_not) {
        this.error(FPMLValidator.EITHERCHECKERROR, FPMLPackage.Literals.IS_LEFT_PURE__TYPE);
      }
    }
    if (!_matched) {
      if (p instanceof IsRightPure) {
        _matched=true;
        PureAlgebraicType _type = ((IsRightPure)p).getType();
        ValueType _element2ValueTypeFromPureAlgebraicType = Others.getElement2ValueTypeFromPureAlgebraicType(_type);
        boolean _not = (!(_element2ValueTypeFromPureAlgebraicType instanceof PureSumTypeFactor));
        if (_not) {
          this.error(FPMLValidator.EITHERCHECKERROR, FPMLPackage.Literals.IS_RIGHT_PURE__TYPE);
        }
      }
    }
    if (!_matched) {
      if (p instanceof PureIf) {
        _matched=true;
        PureIfBody _then = ((PureIf)p).getThen();
        final ValueType thenType = GetReturnType.pureIfBody(_then);
        PureIfBody _else = ((PureIf)p).getElse();
        final ValueType elseType = GetReturnType.pureIfBody(_else);
        if (((!Checks.TypeEquals(thenType, elseType, false)) && (!Objects.equal(thenType.eClass(), elseType.eClass())))) {
          this.error(FPMLValidator.IFBRANCHESTYPEMISMATCH, FPMLPackage.Literals.PURE_IF__THEN);
        }
      }
    }
    if (!_matched) {
      if (p instanceof ApplyF) {
        _matched=true;
        boolean _applyF = Checks.applyF(((ApplyF)p));
        boolean _not = (!_applyF);
        if (_not) {
          this.error(FPMLValidator.APPLYFUNCTIONTOWRONGVALUE, FPMLPackage.Literals.APPLY_F__FUNCTION_TYPE);
        }
      }
    }
  }
  
  public void typeCheckPureFunction(final PureFunctionDefinition f) {
    PureArgument _arg = f.getArg();
    ValueType _type = _arg.getType();
    if ((_type instanceof UnitType)) {
      this.error(FPMLValidator.FUNCTIONDEFINITIONWITHUNITARGUMENT, FPMLPackage.Literals.PURE_FUNCTION_DEFINITION__ARG);
    }
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
    if (p instanceof IsLeftEffectFull) {
      _matched=true;
      EffectFullAlgebraicType _type = ((IsLeftEffectFull)p).getType();
      Type _element2ValueTypeFromEffectFullAlgebraicType = Others.getElement2ValueTypeFromEffectFullAlgebraicType(_type);
      boolean _not = (!(_element2ValueTypeFromEffectFullAlgebraicType instanceof EffectFullSumTypeFactor));
      if (_not) {
        this.error(FPMLValidator.EITHERCHECKERROR, FPMLPackage.Literals.IS_LEFT_EFFECT_FULL__TYPE);
      }
    }
    if (!_matched) {
      if (p instanceof IsRightEffectFull) {
        _matched=true;
        EffectFullAlgebraicType _type = ((IsRightEffectFull)p).getType();
        Type _element2ValueTypeFromEffectFullAlgebraicType = Others.getElement2ValueTypeFromEffectFullAlgebraicType(_type);
        boolean _not = (!(_element2ValueTypeFromEffectFullAlgebraicType instanceof EffectFullSumTypeFactor));
        if (_not) {
          this.error(FPMLValidator.EITHERCHECKERROR, FPMLPackage.Literals.IS_RIGHT_EFFECT_FULL__TYPE);
        }
      }
    }
    if (!_matched) {
      if (p instanceof EffectFullIf) {
        _matched=true;
        EffectFullIfBody _then = ((EffectFullIf)p).getThen();
        final Type thenType = GetReturnType.effectFullIfBody(_then);
        EffectFullIfBody _else = ((EffectFullIf)p).getElse();
        final Type elseType = GetReturnType.effectFullIfBody(_else);
        boolean _TypeEquals = Checks.TypeEquals(thenType, elseType, false);
        boolean _not = (!_TypeEquals);
        if (_not) {
          this.error(FPMLValidator.IFBRANCHESTYPEMISMATCH, FPMLPackage.Literals.EFFECT_FULL_IF__THEN);
        }
      }
    }
    if (!_matched) {
      if (p instanceof ApplyFIO) {
        _matched=true;
        boolean _applyFIO = Checks.applyFIO(((ApplyFIO)p));
        boolean _not = (!_applyFIO);
        if (_not) {
          this.error(FPMLValidator.APPLYFUNCTIONTOWRONGVALUE, FPMLPackage.Literals.APPLY_FIO__FUNCTION_TYPE);
        }
      }
    }
  }
}
