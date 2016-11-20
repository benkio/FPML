package it.unibo.validation.utilitiesFunctions;

import com.google.common.base.Objects;
import it.unibo.fPML.ApplyF;
import it.unibo.fPML.ApplyFIO;
import it.unibo.fPML.ChainElement;
import it.unibo.fPML.CompositionFunctionBodyEffect;
import it.unibo.fPML.CompositionFunctionBodyEffectFullFactor;
import it.unibo.fPML.CompositionFunctionBodyPure;
import it.unibo.fPML.CompositionFunctionBodyPureFactor;
import it.unibo.fPML.DataType;
import it.unibo.fPML.EffectFullArgument;
import it.unibo.fPML.EffectFullFunctionDefinition;
import it.unibo.fPML.EffectFullFunctionType;
import it.unibo.fPML.Expression;
import it.unibo.fPML.FPMLFactory;
import it.unibo.fPML.FunctionBodyPure;
import it.unibo.fPML.IOType;
import it.unibo.fPML.IntPow;
import it.unibo.fPML.IntToString;
import it.unibo.fPML.Minus;
import it.unibo.fPML.Mod;
import it.unibo.fPML.Plus;
import it.unibo.fPML.PrimitivePrint;
import it.unibo.fPML.PureFunctionDefinition;
import it.unibo.fPML.PureFunctionType;
import it.unibo.fPML.PureLambda;
import it.unibo.fPML.ReturnPureFunction;
import it.unibo.fPML.Times;
import it.unibo.fPML.Type;
import it.unibo.fPML.Value;
import it.unibo.fPML.ValueType;
import it.unibo.validation.utilitiesFunctions.Others;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;

@SuppressWarnings("all")
public class GetReturnType {
  public static ValueType getReturnValueType(final PureFunctionDefinition pf, final ValueType previousChainType) {
    final ValueType t = pf.getReturnType();
    boolean _equals = Objects.equal(t, null);
    if (_equals) {
      if ((previousChainType instanceof PureFunctionType)) {
        return GetReturnType.getReturnTypePurePrimitive(pf, ((PureFunctionType)previousChainType));
      } else {
        return GetReturnType.getReturnTypePurePrimitive(pf, null);
      }
    }
    return t;
  }
  
  public static Type getReturnEffectFullType(final EffectFullFunctionDefinition ef, final Type previousChainType) {
    final IOType t = ef.getReturnType();
    boolean _equals = Objects.equal(t, null);
    if (_equals) {
      if ((previousChainType instanceof EffectFullFunctionType)) {
        return GetReturnType.getReturnTypeEffectFullPrimitive(ef, ((EffectFullFunctionType)previousChainType));
      } else {
        return GetReturnType.getReturnTypeEffectFullPrimitive(ef, null);
      }
    } else {
      Type _type = t.getType();
      boolean _matched = false;
      if (_type instanceof DataType) {
        _matched=true;
        return ((DataType) t);
      }
      return t.getType();
    }
  }
  
  public static Type getReturnType(final ChainElement f1, final Type previousChainType) {
    try {
      boolean _matched = false;
      if (f1 instanceof EffectFullFunctionDefinition) {
        _matched=true;
        return GetReturnType.getReturnEffectFullType(((EffectFullFunctionDefinition) f1), previousChainType);
      }
      if (!_matched) {
        if (f1 instanceof PureFunctionDefinition) {
          _matched=true;
          if ((previousChainType instanceof ValueType)) {
            return GetReturnType.getReturnValueType(((PureFunctionDefinition) f1), ((ValueType)previousChainType));
          } else {
            throw new Exception("get return Type from pure function with an effectfull argument");
          }
        }
      }
      if (!_matched) {
        if (f1 instanceof Value) {
          _matched=true;
          Expression _value = ((Value)f1).getValue();
          return Others.getTypeFromExpression(_value);
        }
      }
      if (!_matched) {
        if (f1 instanceof EffectFullArgument) {
          _matched=true;
          return ((EffectFullArgument)f1).getType();
        }
      }
      return null;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public static ValueType getReturnTypePurePrimitive(final PureFunctionDefinition pf, final PureFunctionType previousFunction) {
    try {
      boolean _matched = false;
      if (pf instanceof IntToString) {
        _matched=true;
        return FPMLFactory.eINSTANCE.createStringType();
      }
      if (!_matched) {
        if (pf instanceof IntPow) {
          _matched=true;
          return FPMLFactory.eINSTANCE.createIntegerType();
        }
      }
      if (!_matched) {
        if (pf instanceof Plus) {
          _matched=true;
          return Others.createIntIntFuntionType();
        }
      }
      if (!_matched) {
        if (pf instanceof Minus) {
          _matched=true;
          return Others.createIntIntFuntionType();
        }
      }
      if (!_matched) {
        if (pf instanceof Times) {
          _matched=true;
          return Others.createIntIntFuntionType();
        }
      }
      if (!_matched) {
        if (pf instanceof Mod) {
          _matched=true;
          return Others.createIntIntFuntionType();
        }
      }
      if (!_matched) {
        if (pf instanceof ApplyF) {
          _matched=true;
          boolean _notEquals = (!Objects.equal(previousFunction, null));
          if (_notEquals) {
            return previousFunction.getReturnType();
          } else {
            throw new Exception("this cannot happen during the typechecking, get return type pure primitive");
          }
        }
      }
      throw new Exception("this cannot happen during the typechecking, get return type pure primitive");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public static ValueType getReturnTypeCompositionFunctionBodyPure(final CompositionFunctionBodyPure cfbp) {
    try {
      ReturnPureFunction _returnFunction = cfbp.getReturnFunction();
      boolean _equals = Objects.equal(_returnFunction, null);
      if (_equals) {
        EList<CompositionFunctionBodyPureFactor> _functionChain = cfbp.getFunctionChain();
        int _size = _functionChain.size();
        boolean _equals_1 = (_size == 1);
        if (_equals_1) {
          EList<CompositionFunctionBodyPureFactor> _functionChain_1 = cfbp.getFunctionChain();
          CompositionFunctionBodyPureFactor _last = IterableExtensions.<CompositionFunctionBodyPureFactor>last(_functionChain_1);
          PureFunctionDefinition _functionDefinitionFromPureFactor = Others.getFunctionDefinitionFromPureFactor(_last);
          PureFunctionDefinition _firstFunctionDefinitionFromCompositionBodyPure = Others.getFirstFunctionDefinitionFromCompositionBodyPure(cfbp);
          ValueType _returnType = _firstFunctionDefinitionFromCompositionBodyPure.getReturnType();
          return GetReturnType.getReturnValueType(_functionDefinitionFromPureFactor, _returnType);
        } else {
          EList<CompositionFunctionBodyPureFactor> _functionChain_2 = cfbp.getFunctionChain();
          CompositionFunctionBodyPureFactor _last_1 = IterableExtensions.<CompositionFunctionBodyPureFactor>last(_functionChain_2);
          PureFunctionDefinition _functionDefinitionFromPureFactor_1 = Others.getFunctionDefinitionFromPureFactor(_last_1);
          EList<CompositionFunctionBodyPureFactor> _functionChain_3 = cfbp.getFunctionChain();
          EList<CompositionFunctionBodyPureFactor> _functionChain_4 = cfbp.getFunctionChain();
          int _size_1 = _functionChain_4.size();
          int _minus = (_size_1 - 2);
          CompositionFunctionBodyPureFactor _get = _functionChain_3.get(_minus);
          PureFunctionDefinition _functionDefinitionFromPureFactor_2 = Others.getFunctionDefinitionFromPureFactor(_get);
          ValueType _returnType_1 = _functionDefinitionFromPureFactor_2.getReturnType();
          return GetReturnType.getReturnValueType(_functionDefinitionFromPureFactor_1, _returnType_1);
        }
      } else {
        ReturnPureFunction _returnFunction_1 = cfbp.getReturnFunction();
        PureLambda _lambdaFunctionBody = _returnFunction_1.getLambdaFunctionBody();
        FunctionBodyPure _functionBody = _lambdaFunctionBody.getFunctionBody();
        if ((_functionBody instanceof CompositionFunctionBodyPure)) {
          ReturnPureFunction _returnFunction_2 = cfbp.getReturnFunction();
          PureLambda _lambdaFunctionBody_1 = _returnFunction_2.getLambdaFunctionBody();
          FunctionBodyPure _functionBody_1 = _lambdaFunctionBody_1.getFunctionBody();
          return GetReturnType.getReturnTypeCompositionFunctionBodyPure(((CompositionFunctionBodyPure) _functionBody_1));
        } else {
          throw new Exception("this cannot happen during the typechecking of a compositionFunction body pure");
        }
      }
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public static Type getReturnTypeCompositionBodyEffect(final CompositionFunctionBodyEffect cfbe, final EffectFullArgument arg) {
    final ChainElement firstElement = Others.getFirstFunctionDefinitionFromCompositionBodyEffectFull(cfbe);
    EList<CompositionFunctionBodyEffectFullFactor> _functionChain = cfbe.getFunctionChain();
    final Function1<CompositionFunctionBodyEffectFullFactor, ChainElement> _function = (CompositionFunctionBodyEffectFullFactor x) -> {
      return Others.getFunctionDefinitionFromEffectFullFactor(x);
    };
    final List<ChainElement> functionChain = ListExtensions.<CompositionFunctionBodyEffectFullFactor, ChainElement>map(_functionChain, _function);
    return GetReturnType.getReturnTypeFunctionChainEffect(functionChain, firstElement, arg);
  }
  
  public static Type getReturnTypeFunctionChainEffect(final List<ChainElement> elements, final ChainElement element, final EffectFullArgument argument) {
    int _size = elements.size();
    boolean _equals = (_size == 1);
    if (_equals) {
      ChainElement _last = IterableExtensions.<ChainElement>last(elements);
      Type _type = argument.getType();
      Type _returnType = GetReturnType.getReturnType(element, _type);
      return GetReturnType.getReturnType(_last, _returnType);
    } else {
      ChainElement _last_1 = IterableExtensions.<ChainElement>last(elements);
      Iterable<ChainElement> _tail = IterableExtensions.<ChainElement>tail(elements);
      List<ChainElement> _list = IterableExtensions.<ChainElement>toList(_tail);
      Type _returnTypeFunctionChainEffect = GetReturnType.getReturnTypeFunctionChainEffect(_list, element, argument);
      return GetReturnType.getReturnType(_last_1, _returnTypeFunctionChainEffect);
    }
  }
  
  public static Type getReturnTypeEffectFullPrimitive(final EffectFullFunctionDefinition ef, final EffectFullFunctionType previousFunction) {
    try {
      boolean _matched = false;
      if (ef instanceof PrimitivePrint) {
        _matched=true;
        return FPMLFactory.eINSTANCE.createUnitType();
      }
      if (!_matched) {
        if (ef instanceof ApplyFIO) {
          _matched=true;
          boolean _notEquals = (!Objects.equal(previousFunction, null));
          if (_notEquals) {
            return previousFunction.getReturnType();
          } else {
            throw new Exception("this cannot happen during the typechecking, get return type Effectfull primitive");
          }
        }
      }
      throw new Exception("this cannot happen during the typechecking, get return type Effectfull primitive");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
