package it.unibo.validation.utilitiesFunctions;

import com.google.common.base.Objects;
import it.unibo.fPML.ApplyF;
import it.unibo.fPML.ApplyFIO;
import it.unibo.fPML.Argument;
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
import it.unibo.fPML.Times;
import it.unibo.fPML.Type;
import it.unibo.fPML.Value;
import it.unibo.fPML.ValueType;
import it.unibo.validation.utilitiesFunctions.Others;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.EcoreUtil2;
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
  
  public static ValueType getReturnTypeCompositionFunctionBodyPureFunctionDefinition(final PureFunctionDefinition pf) {
    FunctionBodyPure _functionBody = pf.getFunctionBody();
    if ((_functionBody instanceof CompositionFunctionBodyPure)) {
      FunctionBodyPure _functionBody_1 = pf.getFunctionBody();
      final CompositionFunctionBodyPure fcBody = ((CompositionFunctionBodyPure) _functionBody_1);
      EList<CompositionFunctionBodyPureFactor> _functionChain = fcBody.getFunctionChain();
      final Function1<CompositionFunctionBodyPureFactor, PureFunctionDefinition> _function = (CompositionFunctionBodyPureFactor x) -> {
        return Others.getFunctionDefinitionFromPureFactor(x);
      };
      List<PureFunctionDefinition> _map = ListExtensions.<CompositionFunctionBodyPureFactor, PureFunctionDefinition>map(_functionChain, _function);
      Argument _arg = pf.getArg();
      ValueType _type = _arg.getType();
      PureFunctionDefinition _firstFunctionDefinitionFromCompositionBodyPure = Others.getFirstFunctionDefinitionFromCompositionBodyPure(fcBody);
      return GetReturnType.getReturnTypeFunctionChainPure(_map, _type, _firstFunctionDefinitionFromCompositionBodyPure);
    }
    return null;
  }
  
  public static ValueType getReturnTypeFunctionChainPure(final List<PureFunctionDefinition> list, final ValueType argType, final PureFunctionDefinition firstElement) {
    int _size = list.size();
    boolean _equals = (_size == 1);
    if (_equals) {
      PureFunctionDefinition _last = IterableExtensions.<PureFunctionDefinition>last(list);
      ValueType _returnValueType = GetReturnType.getReturnValueType(firstElement, argType);
      return GetReturnType.getReturnValueType(_last, _returnValueType);
    } else {
      PureFunctionDefinition _last_1 = IterableExtensions.<PureFunctionDefinition>last(list);
      Iterable<PureFunctionDefinition> _tail = IterableExtensions.<PureFunctionDefinition>tail(list);
      List<PureFunctionDefinition> _list = IterableExtensions.<PureFunctionDefinition>toList(_tail);
      ValueType _returnTypeFunctionChainPure = GetReturnType.getReturnTypeFunctionChainPure(_list, argType, firstElement);
      return GetReturnType.getReturnValueType(_last_1, _returnTypeFunctionChainPure);
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
  
  public static ValueType getPreviousFunctionChainElementReturnType(final List<PureFunctionDefinition> elements, final PureFunctionDefinition element, final PureFunctionDefinition firstElement, final Argument arg) {
    final Function1<PureFunctionDefinition, Boolean> _function = (PureFunctionDefinition x) -> {
      boolean _equals = EcoreUtil2.class.equals(element);
      return Boolean.valueOf((!_equals));
    };
    final Iterable<PureFunctionDefinition> functionChainToElement = IterableExtensions.<PureFunctionDefinition>takeWhile(elements, _function);
    int _size = IterableExtensions.size(functionChainToElement);
    boolean _equals = (_size == 0);
    if (_equals) {
      ValueType _type = arg.getType();
      return GetReturnType.getReturnValueType(firstElement, _type);
    } else {
      PureFunctionDefinition _last = IterableExtensions.<PureFunctionDefinition>last(elements);
      return GetReturnType.getPreviousFunctionChainElementReturnType(elements, _last, firstElement, arg);
    }
  }
}
