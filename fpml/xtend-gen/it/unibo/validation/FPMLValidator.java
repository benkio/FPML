/**
 * generated by Xtext 2.9.2
 */
package it.unibo.validation;

import com.google.common.base.Objects;
import it.unibo.fPML.AdtType;
import it.unibo.fPML.AdtValue;
import it.unibo.fPML.Argument;
import it.unibo.fPML.ChainElement;
import it.unibo.fPML.CompositionFunctionBodyEffect;
import it.unibo.fPML.CompositionFunctionBodyEffectFullFactor;
import it.unibo.fPML.CompositionFunctionBodyPure;
import it.unibo.fPML.CompositionFunctionBodyPureFactor;
import it.unibo.fPML.Data;
import it.unibo.fPML.DataValue;
import it.unibo.fPML.EffectFullArgument;
import it.unibo.fPML.EffectFullFunctionDefinition;
import it.unibo.fPML.FPMLFactory;
import it.unibo.fPML.FPMLPackage;
import it.unibo.fPML.FunctionBodyEffectFull;
import it.unibo.fPML.FunctionBodyPure;
import it.unibo.fPML.IOType;
import it.unibo.fPML.MainFunc;
import it.unibo.fPML.PureFunctionDefinition;
import it.unibo.fPML.ReturnEffectFullFunction;
import it.unibo.fPML.ReturnPureFunction;
import it.unibo.fPML.Type;
import it.unibo.fPML.UnitType;
import it.unibo.fPML.Value;
import it.unibo.fPML.ValueType;
import it.unibo.validation.AbstractFPMLValidator;
import it.unibo.validation.utilitiesFunctions.Checks;
import it.unibo.validation.utilitiesFunctions.GetArgType;
import it.unibo.validation.utilitiesFunctions.GetReturnType;
import it.unibo.validation.utilitiesFunctions.Others;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.validation.Check;

/**
 * This class contains custom validation rules.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
@SuppressWarnings("all")
public class FPMLValidator extends AbstractFPMLValidator {
  public final static String TYPEMISMATCHFUNCTIONCOMPOSITION = "Type mismatch between the input of one function and the return of another in the function chain";
  
  public final static String TYPEMISMATCHFUNCTIONCOMPOSITIONRETURN = "The return type of the last function and the outside function doesn\'t match";
  
  public final static String TYPEMISMATCHFUNCTIONCOMPOSITIONLAMBDA = "The first argument of the product type in the lambda function chain doesn\'t match the return type of the function before the lambda";
  
  public final static String TYPEMISMATCHFUNCTIONCOMPOSITIONARGS = "The argument type of the function is not the same as the first argument of the function chain";
  
  public final static String EFFECTFULLARGUMENTUNITTYPEID = "The Unit Type don\'t require and ID";
  
  public final static String TYPEVMISMATCHBETWEENVALUEANDDATA = "The value doesn\'t match the data declaration";
  
  public final static String APPLYFUNCTIONTOWRONGVALUE = "The function is APPLYF has a wrong value type";
  
  @Check
  public void CompositionFunctionTypePure(final CompositionFunctionBodyPure cfbp) {
    PureFunctionDefinition _firstFunctionDefinitionFromCompositionBodyPure = Others.getFirstFunctionDefinitionFromCompositionBodyPure(cfbp);
    ValueType _argTypeCompositionFunctionBodyPureContainer = GetArgType.getArgTypeCompositionFunctionBodyPureContainer(cfbp);
    ValueType t = GetReturnType.getReturnValueType(_firstFunctionDefinitionFromCompositionBodyPure, _argTypeCompositionFunctionBodyPureContainer);
    EList<CompositionFunctionBodyPureFactor> _functionChain = cfbp.getFunctionChain();
    for (final CompositionFunctionBodyPureFactor pf : _functionChain) {
      {
        PureFunctionDefinition _functionDefinitionFromPureFactor = Others.getFunctionDefinitionFromPureFactor(pf);
        ValueType t1 = GetArgType.getArgTypePure(_functionDefinitionFromPureFactor, t);
        boolean _equals = Objects.equal(t1, null);
        if (_equals) {
          this.error(FPMLValidator.APPLYFUNCTIONTOWRONGVALUE, FPMLPackage.Literals.COMPOSITION_FUNCTION_BODY_PURE__FUNCTION_CHAIN);
        } else {
          boolean _checkValueTypeEquals = Checks.checkValueTypeEquals(t, t1);
          boolean _not = (!_checkValueTypeEquals);
          if (_not) {
            this.error(FPMLValidator.TYPEMISMATCHFUNCTIONCOMPOSITION, FPMLPackage.Literals.COMPOSITION_FUNCTION_BODY_PURE__FUNCTION_CHAIN);
          }
        }
        PureFunctionDefinition _functionDefinitionFromPureFactor_1 = Others.getFunctionDefinitionFromPureFactor(pf);
        ValueType _returnValueType = GetReturnType.getReturnValueType(_functionDefinitionFromPureFactor_1, t);
        t = _returnValueType;
      }
    }
    ReturnPureFunction _returnFunction = cfbp.getReturnFunction();
    boolean _notEquals = (!Objects.equal(_returnFunction, null));
    if (_notEquals) {
      ReturnPureFunction _returnFunction_1 = cfbp.getReturnFunction();
      PureFunctionDefinition _lambdaFunctionBody = _returnFunction_1.getLambdaFunctionBody();
      Argument _arg = _lambdaFunctionBody.getArg();
      final ValueType firstElem = _arg.getType();
      boolean _isInputTypeCompatibleWithArgType = Checks.isInputTypeCompatibleWithArgType(firstElem, t);
      boolean _not = (!_isInputTypeCompatibleWithArgType);
      if (_not) {
        this.error(FPMLValidator.TYPEMISMATCHFUNCTIONCOMPOSITIONLAMBDA, FPMLPackage.Literals.COMPOSITION_FUNCTION_BODY_PURE__FUNCTION_CHAIN);
      }
    }
  }
  
  @Check
  public void CompositionFunctionTypeEffect(final CompositionFunctionBodyEffect cfbe) {
    ChainElement _firstFunctionDefinitionFromCompositionBodyEffectFull = Others.getFirstFunctionDefinitionFromCompositionBodyEffectFull(cfbe);
    Type _argTypeCompositionFunctionBodyEffectFullContainer = GetArgType.getArgTypeCompositionFunctionBodyEffectFullContainer(cfbe);
    Type t = GetReturnType.getReturnType(_firstFunctionDefinitionFromCompositionBodyEffectFull, _argTypeCompositionFunctionBodyEffectFullContainer);
    EList<CompositionFunctionBodyEffectFullFactor> _functionChain = cfbe.getFunctionChain();
    for (final CompositionFunctionBodyEffectFullFactor ef : _functionChain) {
      {
        final ChainElement efElement = Others.getFunctionDefinitionFromEffectFullFactor(ef);
        if (((!(efElement instanceof Value)) && (!(efElement instanceof EffectFullArgument)))) {
          final Type t1 = GetArgType.getArgType(efElement, t);
          boolean _checkTypeEquals = Checks.checkTypeEquals(t, t1);
          boolean _not = (!_checkTypeEquals);
          if (_not) {
            this.error(FPMLValidator.TYPEMISMATCHFUNCTIONCOMPOSITION, FPMLPackage.Literals.COMPOSITION_FUNCTION_BODY_EFFECT__FUNCTION_CHAIN);
          }
        }
        Type _returnType = GetReturnType.getReturnType(efElement, t);
        t = _returnType;
      }
    }
    ReturnEffectFullFunction _returnFunction = cfbe.getReturnFunction();
    boolean _notEquals = (!Objects.equal(_returnFunction, null));
    if (_notEquals) {
      ReturnEffectFullFunction _returnFunction_1 = cfbe.getReturnFunction();
      EffectFullFunctionDefinition _lambdaFunctionBody = _returnFunction_1.getLambdaFunctionBody();
      EffectFullArgument _arg = _lambdaFunctionBody.getArg();
      final Type firstElem = _arg.getType();
      boolean _isInputTypeCompatibleWithArgType = Checks.isInputTypeCompatibleWithArgType(firstElem, t);
      boolean _not = (!_isInputTypeCompatibleWithArgType);
      if (_not) {
        this.error(FPMLValidator.TYPEMISMATCHFUNCTIONCOMPOSITIONLAMBDA, FPMLPackage.Literals.COMPOSITION_FUNCTION_BODY_PURE__FUNCTION_CHAIN);
      }
    }
  }
  
  @Check
  public void FunctionCompositionReturnType(final PureFunctionDefinition pf) {
    final FunctionBodyPure rt = pf.getFunctionBody();
    if (((!Objects.equal(rt, null)) && (rt instanceof CompositionFunctionBodyPure))) {
      final ValueType rt2 = GetReturnType.getReturnTypeCompositionFunctionBodyPureFunctionDefinition(pf);
      ValueType _returnType = pf.getReturnType();
      boolean _checkValueTypeEquals = Checks.checkValueTypeEquals(_returnType, rt2);
      boolean _not = (!_checkValueTypeEquals);
      if (_not) {
        this.error(FPMLValidator.TYPEMISMATCHFUNCTIONCOMPOSITIONRETURN, FPMLPackage.Literals.PURE_FUNCTION_DEFINITION__RETURN_TYPE);
      }
    }
  }
  
  @Check
  public void FunctionCompositionReturnType(final EffectFullFunctionDefinition ef) {
    final FunctionBodyEffectFull rt = ef.getFunctionBody();
    if ((((!Objects.equal(rt, null)) && 
      (rt instanceof CompositionFunctionBodyEffect)) && 
      Objects.equal(((CompositionFunctionBodyEffect) rt).getReturnFunction(), null))) {
      EffectFullArgument _arg = ef.getArg();
      final Type rt2 = GetReturnType.getReturnTypeCompositionBodyEffect(((CompositionFunctionBodyEffect) rt), _arg);
      IOType _returnType = ef.getReturnType();
      Type _type = _returnType.getType();
      boolean _checkTypeEquals = Checks.checkTypeEquals(_type, rt2);
      boolean _not = (!_checkTypeEquals);
      if (_not) {
        this.error(FPMLValidator.TYPEMISMATCHFUNCTIONCOMPOSITIONRETURN, FPMLPackage.Literals.EFFECT_FULL_FUNCTION_DEFINITION__RETURN_TYPE);
      }
    }
  }
  
  @Check
  public void FunctionCompositionArgType(final PureFunctionDefinition pf) {
    final FunctionBodyPure rt = pf.getFunctionBody();
    if (((!Objects.equal(rt, null)) && (rt instanceof CompositionFunctionBodyPure))) {
      final PureFunctionDefinition rt2 = Others.getFirstFunctionDefinitionFromCompositionBodyPure(((CompositionFunctionBodyPure) rt));
      if (((rt2 instanceof PureFunctionDefinition) && (!Checks.checkValueTypeEquals(pf.getArg().getType(), GetArgType.getArgTypePure(rt2, pf.getArg().getType()))))) {
        this.error(FPMLValidator.TYPEMISMATCHFUNCTIONCOMPOSITIONARGS, FPMLPackage.Literals.PURE_FUNCTION_DEFINITION__ARG);
      }
    }
  }
  
  @Check
  public void FunctionCompositionArgType(final EffectFullFunctionDefinition ef) {
    final FunctionBodyEffectFull rt = ef.getFunctionBody();
    if (((!Objects.equal(rt, null)) && 
      (rt instanceof CompositionFunctionBodyEffect))) {
      final ChainElement firstChainElement = Others.getFirstFunctionDefinitionFromCompositionBodyEffectFull(((CompositionFunctionBodyEffect) rt));
      if (((firstChainElement instanceof PureFunctionDefinition) || (firstChainElement instanceof EffectFullFunctionDefinition))) {
        EffectFullArgument _arg = ef.getArg();
        final Type t = _arg.getType();
        Type t1 = null;
        if (((firstChainElement instanceof PureFunctionDefinition) && (t instanceof ValueType))) {
          ValueType _argTypePure = GetArgType.getArgTypePure(((PureFunctionDefinition) firstChainElement), ((ValueType) t));
          t1 = _argTypePure;
        } else {
          if ((firstChainElement instanceof EffectFullFunctionDefinition)) {
            Type _argTypeEffectFull = GetArgType.getArgTypeEffectFull(((EffectFullFunctionDefinition) firstChainElement), t);
            t1 = _argTypeEffectFull;
          }
        }
        boolean _checkTypeEquals = Checks.checkTypeEquals(t, t1);
        boolean _not = (!_checkTypeEquals);
        if (_not) {
          this.error(FPMLValidator.TYPEMISMATCHFUNCTIONCOMPOSITIONARGS, FPMLPackage.Literals.EFFECT_FULL_FUNCTION_DEFINITION__ARG);
        }
      }
    }
  }
  
  @Check
  public void EffectFullArgumentUnitTypeNoID(final EffectFullArgument efa) {
    if (((efa.getType() instanceof UnitType) && (!Objects.equal(efa.getName(), null)))) {
      this.error(FPMLValidator.EFFECTFULLARGUMENTUNITTYPEID, FPMLPackage.Literals.EFFECT_FULL_ARGUMENT__TYPE);
    }
  }
  
  @Check
  public void MainFuncReturnTypeCheck(final MainFunc m) {
    final FunctionBodyEffectFull rt = m.getFunctionBody();
    final EffectFullArgument arg = FPMLFactory.eINSTANCE.createEffectFullArgument();
    final IOType argType = FPMLFactory.eINSTANCE.createIOType();
    UnitType _createUnitType = FPMLFactory.eINSTANCE.createUnitType();
    argType.setType(_createUnitType);
    if ((rt instanceof CompositionFunctionBodyEffect)) {
      final Type rt2 = GetReturnType.getReturnTypeCompositionBodyEffect(((CompositionFunctionBodyEffect)rt), arg);
      UnitType _returnType = m.getReturnType();
      boolean _checkTypeEquals = Checks.checkTypeEquals(_returnType, rt2);
      boolean _not = (!_checkTypeEquals);
      if (_not) {
        this.error(FPMLValidator.TYPEMISMATCHFUNCTIONCOMPOSITIONRETURN, FPMLPackage.Literals.MAIN_FUNC__RETURN_TYPE);
      }
    }
  }
  
  @Check
  public void ValueDataTypeCheck(final DataValue dv) {
    AdtValue _value = dv.getValue();
    Data _type = dv.getType();
    AdtType _content = _type.getContent();
    boolean _typeCheckDataAndValue = Checks.typeCheckDataAndValue(_value, _content);
    boolean _not = (!_typeCheckDataAndValue);
    if (_not) {
      this.error(FPMLValidator.TYPEVMISMATCHBETWEENVALUEANDDATA, FPMLPackage.Literals.DATA_VALUE__VALUE);
    }
  }
}
