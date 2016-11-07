/**
 * generated by Xtext 2.9.2
 */
package it.unibo.validation;

import com.google.common.base.Objects;
import it.unibo.fPML.Argument;
import it.unibo.fPML.ChainElement;
import it.unibo.fPML.CompositionFunctionBodyEffect;
import it.unibo.fPML.CompositionFunctionBodyPure;
import it.unibo.fPML.Data;
import it.unibo.fPML.EffectFullArgument;
import it.unibo.fPML.EffectFullFunction;
import it.unibo.fPML.FPMLPackage;
import it.unibo.fPML.FunctionBodyEffectFull;
import it.unibo.fPML.FunctionBodyPure;
import it.unibo.fPML.InitialPureChainElement;
import it.unibo.fPML.MainFunc;
import it.unibo.fPML.PureFunction;
import it.unibo.fPML.Type;
import it.unibo.fPML.UnitType;
import it.unibo.fPML.ValueType;
import it.unibo.validation.AbstractFPMLValidator;
import it.unibo.validation.UtilitiesFunctions;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

/**
 * This class contains custom validation rules.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
@SuppressWarnings("all")
public class FPMLValidator extends AbstractFPMLValidator {
  public final static String TYPEMISMATCHFUNCTIONCOMPOSITION = "Type mismatch between the input of one function and the return of another in the function chain";
  
  public final static String TYPEMISMATCHFUNCTIONCOMPOSITIONRETURN = "The return type of the last function and the outside function doesn\'t match";
  
  public final static String TYPEMISMATCHFUNCTIONCOMPOSITIONARGS = "The argument type of the function is not the same as the first argument of the function chain";
  
  public final static String EFFECTFULLARGUMENTUNITTYPEID = "The Unit Type don\'t require and ID";
  
  @Check
  public void CompositionFunctionTypePure(final CompositionFunctionBodyPure cfbp) {
    EList<InitialPureChainElement> _functionChain = cfbp.getFunctionChain();
    InitialPureChainElement _head = IterableExtensions.<InitialPureChainElement>head(_functionChain);
    EObject t = UtilitiesFunctions.getReturnType(_head);
    EList<InitialPureChainElement> _functionChain_1 = cfbp.getFunctionChain();
    Iterable<InitialPureChainElement> _tail = IterableExtensions.<InitialPureChainElement>tail(_functionChain_1);
    for (final InitialPureChainElement pf : _tail) {
      {
        final EObject t1 = UtilitiesFunctions.getArgType(pf);
        boolean _equals = EcoreUtil.equals(t1, t);
        boolean _not = (!_equals);
        if (_not) {
          this.error(FPMLValidator.TYPEMISMATCHFUNCTIONCOMPOSITION, FPMLPackage.Literals.COMPOSITION_FUNCTION_BODY_PURE__FUNCTION_CHAIN);
        }
        EObject _returnType = UtilitiesFunctions.getReturnType(pf);
        t = _returnType;
      }
    }
  }
  
  @Check
  public void CompositionFunctionTypeEffect(final CompositionFunctionBodyEffect cfbe) {
    EList<ChainElement> _functionChain = cfbe.getFunctionChain();
    final ChainElement f1 = IterableExtensions.<ChainElement>head(_functionChain);
    EObject t = UtilitiesFunctions.getReturnType(f1);
    EList<ChainElement> _functionChain_1 = cfbe.getFunctionChain();
    Iterable<ChainElement> _tail = IterableExtensions.<ChainElement>tail(_functionChain_1);
    for (final ChainElement ef : _tail) {
      {
        if ((!(ef instanceof Data))) {
          EObject t1 = UtilitiesFunctions.getArgType(ef);
          if (((!EcoreUtil.equals(t1, t)) && (!(t1 instanceof UnitType)))) {
            this.error(FPMLValidator.TYPEMISMATCHFUNCTIONCOMPOSITION, FPMLPackage.Literals.COMPOSITION_FUNCTION_BODY_EFFECT__FUNCTION_CHAIN);
          }
        }
        EObject _returnType = UtilitiesFunctions.getReturnType(ef);
        t = _returnType;
      }
    }
  }
  
  @Check
  public void FunctionCompositionReturnType(final PureFunction pf) {
    final FunctionBodyPure rt = pf.getFunctionBody();
    if ((rt instanceof CompositionFunctionBodyPure)) {
      final EList<InitialPureChainElement> rt2 = ((CompositionFunctionBodyPure)rt).getFunctionChain();
      ValueType _returnType = pf.getReturnType();
      EObject _typeFromValueType = UtilitiesFunctions.getTypeFromValueType(_returnType);
      int _size = rt2.size();
      int _minus = (_size - 1);
      InitialPureChainElement _get = rt2.get(_minus);
      EObject _returnType_1 = UtilitiesFunctions.getReturnType(_get);
      boolean _equals = EcoreUtil.equals(_typeFromValueType, _returnType_1);
      boolean _not = (!_equals);
      if (_not) {
        this.error(FPMLValidator.TYPEMISMATCHFUNCTIONCOMPOSITIONRETURN, FPMLPackage.Literals.PURE_FUNCTION__RETURN_TYPE);
      }
    }
  }
  
  @Check
  public void FunctionCompositionReturnType(final EffectFullFunction ef) {
    final FunctionBodyEffectFull rt = ef.getFunctionBody();
    if (((!(ef instanceof MainFunc)) && (rt instanceof CompositionFunctionBodyEffect))) {
      final EList<ChainElement> rt2 = ((CompositionFunctionBodyEffect) rt).getFunctionChain();
      EObject _returnType = UtilitiesFunctions.getReturnType(ef);
      int _size = rt2.size();
      int _minus = (_size - 1);
      ChainElement _get = rt2.get(_minus);
      EObject _returnType_1 = UtilitiesFunctions.getReturnType(_get);
      boolean _equals = EcoreUtil.equals(_returnType, _returnType_1);
      boolean _not = (!_equals);
      if (_not) {
        this.error(FPMLValidator.TYPEMISMATCHFUNCTIONCOMPOSITIONRETURN, FPMLPackage.Literals.EFFECT_FULL_FUNCTION__RETURN_TYPE);
      }
    }
  }
  
  @Check
  public void FunctionCompositionArgType(final PureFunction pf) {
    final FunctionBodyPure rt = pf.getFunctionBody();
    if ((rt instanceof CompositionFunctionBodyPure)) {
      final EList<InitialPureChainElement> rt2 = ((CompositionFunctionBodyPure)rt).getFunctionChain();
      Argument _arg = pf.getArg();
      ValueType _type = _arg.getType();
      InitialPureChainElement _get = rt2.get(0);
      EObject _argType = UtilitiesFunctions.getArgType(_get);
      boolean _equals = EcoreUtil.equals(_type, _argType);
      boolean _not = (!_equals);
      if (_not) {
        this.error(FPMLValidator.TYPEMISMATCHFUNCTIONCOMPOSITIONARGS, FPMLPackage.Literals.PURE_FUNCTION__ARG);
      }
    }
  }
  
  @Check
  public void FunctionCompositionArgType(final EffectFullFunction ef) {
    final FunctionBodyEffectFull rt = ef.getFunctionBody();
    if ((rt instanceof CompositionFunctionBodyEffect)) {
      final EList<ChainElement> rt2 = ((CompositionFunctionBodyEffect)rt).getFunctionChain();
      EffectFullArgument _arg = ef.getArg();
      final Type t = _arg.getType();
      ChainElement _get = rt2.get(0);
      final EObject t1 = UtilitiesFunctions.getArgType(_get);
      boolean _equals = EcoreUtil.equals(t, t1);
      boolean _not = (!_equals);
      if (_not) {
        this.error(FPMLValidator.TYPEMISMATCHFUNCTIONCOMPOSITIONARGS, FPMLPackage.Literals.EFFECT_FULL_FUNCTION__ARG);
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
    if ((rt instanceof CompositionFunctionBodyEffect)) {
      final EList<ChainElement> rt2 = ((CompositionFunctionBodyEffect)rt).getFunctionChain();
      UnitType _returnType = m.getReturnType();
      int _size = rt2.size();
      int _minus = (_size - 1);
      ChainElement _get = rt2.get(_minus);
      EObject _returnType_1 = UtilitiesFunctions.getReturnType(_get);
      boolean _equals = EcoreUtil.equals(_returnType, _returnType_1);
      boolean _not = (!_equals);
      if (_not) {
        this.error(FPMLValidator.TYPEMISMATCHFUNCTIONCOMPOSITIONRETURN, FPMLPackage.Literals.MAIN_FUNC__RETURN_TYPE);
      }
    }
  }
}
