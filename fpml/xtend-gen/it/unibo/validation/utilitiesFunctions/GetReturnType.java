package it.unibo.validation.utilitiesFunctions;

import com.google.common.base.Objects;
import it.unibo.fPML.ApplyF;
import it.unibo.fPML.ApplyFIO;
import it.unibo.fPML.Argument;
import it.unibo.fPML.CompositionFunctionBodyEffect;
import it.unibo.fPML.CompositionFunctionBodyEffectFullFactor;
import it.unibo.fPML.CompositionFunctionBodyPure;
import it.unibo.fPML.CompositionFunctionBodyPureFactor;
import it.unibo.fPML.DataValue;
import it.unibo.fPML.EffectFullArgument;
import it.unibo.fPML.EffectFullFunction;
import it.unibo.fPML.EffectFullFunctionDefinition;
import it.unibo.fPML.EffectFullFunctionType;
import it.unibo.fPML.EffectFullReference;
import it.unibo.fPML.EmptyFunctionBody;
import it.unibo.fPML.Expression;
import it.unibo.fPML.FPMLFactory;
import it.unibo.fPML.Function;
import it.unibo.fPML.FunctionBodyEffectFull;
import it.unibo.fPML.FunctionBodyPure;
import it.unibo.fPML.IOType;
import it.unibo.fPML.IntPow;
import it.unibo.fPML.IntToString;
import it.unibo.fPML.IntegerType;
import it.unibo.fPML.MainFunc;
import it.unibo.fPML.Minus;
import it.unibo.fPML.Mod;
import it.unibo.fPML.Plus;
import it.unibo.fPML.PrimitiveEffectFullFunction;
import it.unibo.fPML.PrimitivePrint;
import it.unibo.fPML.PrimitivePureFunction;
import it.unibo.fPML.PrimitiveRandom;
import it.unibo.fPML.PureFunction;
import it.unibo.fPML.PureFunctionDefinition;
import it.unibo.fPML.PureFunctionType;
import it.unibo.fPML.PureLambda;
import it.unibo.fPML.PureReference;
import it.unibo.fPML.StringType;
import it.unibo.fPML.Times;
import it.unibo.fPML.Type;
import it.unibo.fPML.UnitType;
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
  public static Type function(final Function f) {
    Type _switchResult = null;
    boolean _matched = false;
    if (f instanceof EffectFullFunction) {
      _matched=true;
      _switchResult = GetReturnType.effectFullFunction(((EffectFullFunction)f));
    }
    if (!_matched) {
      if (f instanceof PureFunction) {
        _matched=true;
        _switchResult = GetReturnType.pureFunction(((PureFunction)f));
      }
    }
    return _switchResult;
  }
  
  public static ValueType pureFunction(final PureFunction f) {
    ValueType _switchResult = null;
    boolean _matched = false;
    if (f instanceof PureFunctionDefinition) {
      _matched=true;
      _switchResult = GetReturnType.pureFunctionDefinition(((PureFunctionDefinition)f));
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
        ValueType _returnType = ((PureLambda)f).getReturnType();
        _switchResult = GetReturnType.functionBodyPure(_functionBody, _arg, _arg2, _returnType);
      }
    }
    if (!_matched) {
      if (f instanceof PureFunctionDefinition) {
        _matched=true;
        FunctionBodyPure _functionBody = f.getFunctionBody();
        Argument _arg = f.getArg();
        Argument _arg2 = f.getArg2();
        ValueType _returnType = f.getReturnType();
        _switchResult = GetReturnType.functionBodyPure(_functionBody, _arg, _arg2, _returnType);
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
  
  public static ValueType functionBodyPure(final FunctionBodyPure pure, final Argument arg1, final Argument arg2, final ValueType returnType) {
    ValueType _switchResult = null;
    boolean _matched = false;
    if (pure instanceof EmptyFunctionBody) {
      _matched=true;
      _switchResult = returnType;
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
      PureFunction first = Others.getFirstFunctionDefinitionFromCompositionBodyPure(pure);
      EList<CompositionFunctionBodyPureFactor> _functionChain = pure.getFunctionChain();
      final Function1<CompositionFunctionBodyPureFactor, PureFunction> _function = (CompositionFunctionBodyPureFactor x) -> {
        return Others.getFunctionDefinitionFromPureFactor(x);
      };
      List<PureFunction> chain = ListExtensions.<CompositionFunctionBodyPureFactor, PureFunction>map(_functionChain, _function);
      _xblockexpression = GetReturnType.pureFunctionChain(chain, first, arg1, arg2);
    }
    return _xblockexpression;
  }
  
  public static ValueType pureFunctionChain(final List<PureFunction> definitions, final PureFunction first, final Argument argument, final Argument argument2) {
    boolean _notEquals = (!Objects.equal(argument2, null));
    if (_notEquals) {
      final PureFunctionType functionType = FPMLFactory.eINSTANCE.createPureFunctionType();
      ValueType _type = argument2.getType();
      functionType.setArgType(_type);
      ValueType _pureFunctionChain = GetReturnType.pureFunctionChain(definitions, first, argument, null);
      functionType.setReturnType(_pureFunctionChain);
      return functionType;
    } else {
      final ValueType firstFunctionReturnType = GetReturnType.pureFunction(first);
      int _size = definitions.size();
      boolean _equals = (_size == 0);
      if (_equals) {
        return firstFunctionReturnType;
      } else {
        Iterable<PureFunction> _tail = IterableExtensions.<PureFunction>tail(definitions);
        List<PureFunction> _list = IterableExtensions.<PureFunction>toList(_tail);
        PureFunction _head = IterableExtensions.<PureFunction>head(definitions);
        return GetReturnType.pureFunctionChain(_list, _head, argument, null);
      }
    }
  }
  
  public static ValueType primitivePureFunction(final PrimitivePureFunction f) {
    boolean _matched = false;
    if (f instanceof IntToString) {
      _matched=true;
      return FPMLFactory.eINSTANCE.createStringType();
    }
    if (!_matched) {
      if (f instanceof IntPow) {
        _matched=true;
        return FPMLFactory.eINSTANCE.createIntegerType();
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
  
  public static ValueType pureReference(final PureReference reference) {
    boolean _matched = false;
    if (reference instanceof PureFunctionDefinition) {
      _matched=true;
      return GetReturnType.pureFunctionDefinition(((PureFunctionDefinition)reference));
    }
    if (!_matched) {
      if (reference instanceof Argument) {
        _matched=true;
        return ((Argument)reference).getType();
      }
    }
    return null;
  }
  
  public static Type effectFullFunction(final EffectFullFunction function) {
    Type _switchResult = null;
    boolean _matched = false;
    if (function instanceof EffectFullFunctionDefinition) {
      _matched=true;
      _switchResult = GetReturnType.effectFullFunctionDefinition(((EffectFullFunctionDefinition)function));
    }
    if (!_matched) {
      if (function instanceof PrimitiveEffectFullFunction) {
        _matched=true;
        _switchResult = GetReturnType.primitiveEffectFullFunction(((PrimitiveEffectFullFunction)function));
      }
    }
    return _switchResult;
  }
  
  public static Type effectFullFunctionDefinition(final EffectFullFunctionDefinition definition) {
    FunctionBodyEffectFull _functionBody = definition.getFunctionBody();
    EffectFullArgument _arg = definition.getArg();
    EffectFullArgument _arg2 = definition.getArg2();
    IOType _returnType = definition.getReturnType();
    return GetReturnType.functionBodyEffectFull(_functionBody, _arg, _arg2, _returnType);
  }
  
  public static Type functionBodyEffectFull(final FunctionBodyEffectFull full, final EffectFullArgument argument, final EffectFullArgument argument2, final IOType type) {
    Type _switchResult = null;
    boolean _matched = false;
    if (full instanceof EmptyFunctionBody) {
      _matched=true;
      _switchResult = type.getType();
    }
    if (!_matched) {
      if (full instanceof CompositionFunctionBodyEffect) {
        _matched=true;
        _switchResult = GetReturnType.compositionFunctionBodyEffectFull(((CompositionFunctionBodyEffect)full), argument, argument2);
      }
    }
    return _switchResult;
  }
  
  public static Type compositionFunctionBodyEffectFull(final CompositionFunctionBodyEffect effect, final EffectFullArgument argument, final EffectFullArgument argument2) {
    Type _xblockexpression = null;
    {
      EffectFullReference first = Others.getFirstFunctionDefinitionFromCompositionBodyEffectFull(effect);
      EList<CompositionFunctionBodyEffectFullFactor> _functionChain = effect.getFunctionChain();
      final Function1<CompositionFunctionBodyEffectFullFactor, EffectFullReference> _function = (CompositionFunctionBodyEffectFullFactor x) -> {
        return Others.getFunctionDefinitionFromEffectFullFactor(x);
      };
      List<EffectFullReference> chain = ListExtensions.<CompositionFunctionBodyEffectFullFactor, EffectFullReference>map(_functionChain, _function);
      _xblockexpression = GetReturnType.effectFullFunctionChain(chain, first, argument, argument2);
    }
    return _xblockexpression;
  }
  
  public static Type effectFullFunctionChain(final List<EffectFullReference> references, final EffectFullReference first, final EffectFullArgument argument, final EffectFullArgument argument2) {
    boolean _notEquals = (!Objects.equal(argument2, null));
    if (_notEquals) {
      final EffectFullFunctionType functionType = FPMLFactory.eINSTANCE.createEffectFullFunctionType();
      final IOType ioTypeArg = FPMLFactory.eINSTANCE.createIOType();
      final IOType ioTypeReturn = FPMLFactory.eINSTANCE.createIOType();
      Type _type = argument2.getType();
      ioTypeArg.setType(_type);
      Type _effectFullFunctionChain = GetReturnType.effectFullFunctionChain(references, first, argument, null);
      ioTypeReturn.setType(_effectFullFunctionChain);
      functionType.setArgType(ioTypeArg);
      functionType.setReturnType(ioTypeReturn);
      return functionType;
    } else {
      final Type firstFunctionReturnType = GetReturnType.effectFullReference(first);
      int _size = references.size();
      boolean _equals = (_size == 0);
      if (_equals) {
        return firstFunctionReturnType;
      } else {
        Iterable<EffectFullReference> _tail = IterableExtensions.<EffectFullReference>tail(references);
        List<EffectFullReference> _list = IterableExtensions.<EffectFullReference>toList(_tail);
        EffectFullReference _head = IterableExtensions.<EffectFullReference>head(references);
        return GetReturnType.effectFullFunctionChain(_list, _head, argument, null);
      }
    }
  }
  
  public static Type effectFullReference(final EffectFullReference r) {
    Type _switchResult = null;
    boolean _matched = false;
    if (r instanceof Function) {
      _matched=true;
      _switchResult = GetReturnType.function(((Function)r));
    }
    if (!_matched) {
      if (r instanceof EffectFullArgument) {
        _matched=true;
        _switchResult = ((EffectFullArgument)r).getType();
      }
    }
    return _switchResult;
  }
  
  public static Type primitiveEffectFullFunction(final PrimitiveEffectFullFunction function) {
    Type _switchResult = null;
    boolean _matched = false;
    if (function instanceof PrimitivePrint) {
      _matched=true;
      _switchResult = FPMLFactory.eINSTANCE.createUnitType();
    }
    if (!_matched) {
      if (function instanceof PrimitiveRandom) {
        _matched=true;
        _switchResult = FPMLFactory.eINSTANCE.createIntegerType();
      }
    }
    if (!_matched) {
      if (function instanceof ApplyFIO) {
        _matched=true;
        EffectFullFunctionType _functionType = ((ApplyFIO)function).getFunctionType();
        IOType _returnType = _functionType.getReturnType();
        _switchResult = _returnType.getType();
      }
    }
    return _switchResult;
  }
  
  public static Type mainFunc(final MainFunc m) {
    Type _xblockexpression = null;
    {
      final IOType ioType = FPMLFactory.eINSTANCE.createIOType();
      UnitType _createUnitType = FPMLFactory.eINSTANCE.createUnitType();
      ioType.setType(_createUnitType);
      FunctionBodyEffectFull _functionBody = m.getFunctionBody();
      _xblockexpression = GetReturnType.functionBodyEffectFull(_functionBody, null, null, ioType);
    }
    return _xblockexpression;
  }
}
