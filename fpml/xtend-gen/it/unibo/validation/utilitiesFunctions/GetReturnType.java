package it.unibo.validation.utilitiesFunctions;

import com.google.common.base.Objects;
import it.unibo.fPML.ApplyF;
import it.unibo.fPML.Argument;
import it.unibo.fPML.CompositionFunctionBodyPure;
import it.unibo.fPML.CompositionFunctionBodyPureFactor;
import it.unibo.fPML.DataValue;
import it.unibo.fPML.EmptyFunctionBody;
import it.unibo.fPML.Expression;
import it.unibo.fPML.FPMLFactory;
import it.unibo.fPML.FunctionBodyPure;
import it.unibo.fPML.IntPow;
import it.unibo.fPML.IntToString;
import it.unibo.fPML.IntegerType;
import it.unibo.fPML.Minus;
import it.unibo.fPML.Mod;
import it.unibo.fPML.Plus;
import it.unibo.fPML.PrimitivePureFunction;
import it.unibo.fPML.PureFunction;
import it.unibo.fPML.PureFunctionDefinition;
import it.unibo.fPML.PureFunctionType;
import it.unibo.fPML.PureLambda;
import it.unibo.fPML.StringType;
import it.unibo.fPML.Times;
import it.unibo.fPML.Value;
import it.unibo.fPML.ValueType;
import it.unibo.validation.utilitiesFunctions.Others;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;

@SuppressWarnings("all")
public class GetReturnType {
  public static ValueType pureFunction(final PureFunction f) {
    ValueType _switchResult = null;
    boolean _matched = false;
    if (f instanceof PureFunctionDefinition) {
      _matched=true;
      _switchResult = GetReturnType.pureFunction(f);
    }
    if (!_matched) {
      if (f instanceof PrimitivePureFunction) {
        _matched=true;
        _switchResult = GetReturnType.primitivePureFunction(((PrimitivePureFunction)f));
      }
    }
    return _switchResult;
  }
  
  public static ValueType pureFunctionDefinition(final PureFunctionDefinition f) {
    ValueType _switchResult = null;
    boolean _matched = false;
    if (f instanceof Value) {
      _matched=true;
      Expression _value = ((Value)f).getValue();
      _switchResult = GetReturnType.expression(_value);
    }
    if (!_matched) {
      if (f instanceof PureLambda) {
        _matched=true;
        FunctionBodyPure _functionBody = ((PureLambda)f).getFunctionBody();
        Argument _arg = ((PureLambda)f).getArg();
        Argument _arg2 = ((PureLambda)f).getArg2();
        _switchResult = GetReturnType.functionBodyPure(_functionBody, _arg, _arg2);
      }
    }
    if (!_matched) {
      if (f instanceof PureFunctionDefinition) {
        _matched=true;
        FunctionBodyPure _functionBody = f.getFunctionBody();
        Argument _arg = f.getArg();
        Argument _arg2 = f.getArg2();
        _switchResult = GetReturnType.functionBodyPure(_functionBody, _arg, _arg2);
      }
    }
    return _switchResult;
  }
  
  public static ValueType expression(final Expression expression) {
    boolean _matched = false;
    if (expression instanceof IntegerType) {
      _matched=true;
      return FPMLFactory.eINSTANCE.createIntegerType();
    }
    if (!_matched) {
      if (expression instanceof StringType) {
        _matched=true;
        return FPMLFactory.eINSTANCE.createStringType();
      }
    }
    if (!_matched) {
      if (expression instanceof DataValue) {
        _matched=true;
        return ((ValueType)expression);
      }
    }
    if (!_matched) {
      if (expression instanceof PureFunctionType) {
        _matched=true;
        return ((ValueType)expression);
      }
    }
    return null;
  }
  
  public static ValueType functionBodyPure(final FunctionBodyPure pure, final Argument arg1, final Argument arg2) {
    ValueType _switchResult = null;
    boolean _matched = false;
    if (pure instanceof EmptyFunctionBody) {
      _matched=true;
      return null;
    }
    if (!_matched) {
      if (pure instanceof CompositionFunctionBodyPure) {
        _matched=true;
        _switchResult = GetReturnType.compositionFunctionBodyPure(((CompositionFunctionBodyPure)pure), arg1, arg2);
      }
    }
    return _switchResult;
  }
  
  public static ValueType compositionFunctionBodyPure(final CompositionFunctionBodyPure pure, final Argument arg1, final Argument arg2) {
    ValueType _xblockexpression = null;
    {
      final PureFunction first = Others.getFirstFunctionDefinitionFromCompositionBodyPure(pure);
      EList<CompositionFunctionBodyPureFactor> _functionChain = pure.getFunctionChain();
      final Function1<CompositionFunctionBodyPureFactor, PureFunction> _function = (CompositionFunctionBodyPureFactor x) -> {
        return Others.getFunctionDefinitionFromPureFactor(x);
      };
      final List<PureFunction> chain = ListExtensions.<CompositionFunctionBodyPureFactor, PureFunction>map(_functionChain, _function);
      chain.add(0, first);
      _xblockexpression = GetReturnType.pureFunctionChain(chain, arg1, arg2);
    }
    return _xblockexpression;
  }
  
  public static ValueType pureFunctionChain(final List<PureFunction> definitions, final Argument argument, final Argument argument2) {
    boolean _notEquals = (!Objects.equal(argument2, null));
    if (_notEquals) {
      final PureFunctionType functionType = FPMLFactory.eINSTANCE.createPureFunctionType();
      ValueType _type = argument2.getType();
      functionType.setArgType(_type);
      ValueType _pureFunctionChain = GetReturnType.pureFunctionChain(definitions, argument, null);
      functionType.setReturnType(_pureFunctionChain);
      return functionType;
    } else {
      PureFunction _head = IterableExtensions.<PureFunction>head(definitions);
      final ValueType firstFunctionReturnType = GetReturnType.pureFunction(_head);
      int _size = definitions.size();
      boolean _equals = (_size == 1);
      if (_equals) {
        return firstFunctionReturnType;
      } else {
        final Argument arg = FPMLFactory.eINSTANCE.createArgument();
        argument.setType(firstFunctionReturnType);
        Iterable<PureFunction> _tail = IterableExtensions.<PureFunction>tail(definitions);
        List<PureFunction> _list = IterableExtensions.<PureFunction>toList(_tail);
        return GetReturnType.pureFunctionChain(_list, arg, null);
      }
    }
  }
  
  public static ValueType primitivePureFunction(final PrimitivePureFunction f) {
    boolean _matched = false;
    if (f instanceof IntToString) {
      _matched=true;
      return GetReturnType.IntIntFunc();
    }
    if (!_matched) {
      if (f instanceof IntPow) {
        _matched=true;
        return GetReturnType.IntIntFunc();
      }
    }
    if (!_matched) {
      if (f instanceof Plus) {
        _matched=true;
        return GetReturnType.IntIntFunc();
      }
    }
    if (!_matched) {
      if (f instanceof Minus) {
        _matched=true;
        return GetReturnType.IntIntFunc();
      }
    }
    if (!_matched) {
      if (f instanceof Times) {
        _matched=true;
        return GetReturnType.IntIntFunc();
      }
    }
    if (!_matched) {
      if (f instanceof Mod) {
        _matched=true;
        return GetReturnType.IntIntFunc();
      }
    }
    if (!_matched) {
      if (f instanceof ApplyF) {
        _matched=true;
        PureFunctionType _functionType = ((ApplyF)f).getFunctionType();
        return _functionType.getReturnType();
      }
    }
    return null;
  }
  
  public static PureFunctionType IntIntFunc() {
    final PureFunctionType func = FPMLFactory.eINSTANCE.createPureFunctionType();
    IntegerType _createIntegerType = FPMLFactory.eINSTANCE.createIntegerType();
    func.setArgType(_createIntegerType);
    IntegerType _createIntegerType_1 = FPMLFactory.eINSTANCE.createIntegerType();
    func.setReturnType(_createIntegerType_1);
    return func;
  }
}
