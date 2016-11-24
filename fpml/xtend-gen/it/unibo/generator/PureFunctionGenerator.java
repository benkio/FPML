package it.unibo.generator;

import com.google.common.base.Objects;
import it.unibo.fPML.AdditionalPureArgument;
import it.unibo.fPML.ApplyF;
import it.unibo.fPML.Argument;
import it.unibo.fPML.CompositionFunctionBodyPure;
import it.unibo.fPML.CompositionFunctionBodyPureFactor;
import it.unibo.fPML.EmptyFunctionBody;
import it.unibo.fPML.FunctionBodyPure;
import it.unibo.fPML.IntPow;
import it.unibo.fPML.IntToString;
import it.unibo.fPML.Minus;
import it.unibo.fPML.Mod;
import it.unibo.fPML.Plus;
import it.unibo.fPML.PrimitivePureFunction;
import it.unibo.fPML.PureFunction;
import it.unibo.fPML.PureFunctionBlock;
import it.unibo.fPML.PureFunctionDefinition;
import it.unibo.fPML.PureLambda;
import it.unibo.fPML.PureReference;
import it.unibo.fPML.Times;
import it.unibo.fPML.Value;
import it.unibo.fPML.ValueType;
import it.unibo.generator.FPMLGenerator;
import it.unibo.generator.TypeGenerator;
import it.unibo.validation.utilitiesFunctions.Others;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class PureFunctionGenerator {
  private final TypeGenerator typeGenerator = new TypeGenerator();
  
  public CharSequence compile(final PureFunctionBlock pfb) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    String _basePackageJava = FPMLGenerator.basePackageJava();
    _builder.append(_basePackageJava, "");
    _builder.append("Pure;");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("import ");
    String _basePackageJava_1 = FPMLGenerator.basePackageJava();
    _builder.append(_basePackageJava_1, "");
    _builder.append("Pure.Data.*;");
    _builder.newLineIfNotEmpty();
    _builder.append("import fj.F;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public class PureFunctionDefinitions {");
    _builder.newLine();
    {
      EList<PureFunctionDefinition> _features = pfb.getFeatures();
      for(final PureFunctionDefinition f : _features) {
        _builder.append("\t");
        String _compile = this.compile(f);
        _builder.append(_compile, "\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public String compile(final PureFunctionDefinition pf) {
    if (((!(pf instanceof Value)) && (!(pf instanceof PureLambda)))) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.newLine();
      _builder.append("public static ");
      ValueType _returnType = pf.getReturnType();
      Object _compile = this.typeGenerator.compile(_returnType);
      _builder.append(_compile, "");
      _builder.append(" ");
      String _name = pf.getName();
      _builder.append(_name, "");
      _builder.append(" (");
      Argument _arg = pf.getArg();
      CharSequence _compile_1 = this.typeGenerator.compile(_arg);
      _builder.append(_compile_1, "");
      _builder.append(" ){");
      _builder.newLineIfNotEmpty();
      _builder.append("\t");
      String _xifexpression = null;
      AdditionalPureArgument _higherOrderArg = pf.getHigherOrderArg();
      boolean _notEquals = (!Objects.equal(_higherOrderArg, null));
      if (_notEquals) {
        AdditionalPureArgument _higherOrderArg_1 = pf.getHigherOrderArg();
        Argument _arg2 = _higherOrderArg_1.getArg2();
        CharSequence _compile_2 = this.typeGenerator.compile(_arg2);
        String _plus = ("return (" + _compile_2);
        _xifexpression = (_plus + ") -> {");
      }
      _builder.append(_xifexpression, "\t");
      _builder.newLineIfNotEmpty();
      _builder.append("\t");
      FunctionBodyPure _functionBody = pf.getFunctionBody();
      Argument _arg_1 = pf.getArg();
      String _name_1 = _arg_1.getName();
      String _compile_3 = this.compile(_functionBody, _name_1, false);
      _builder.append(_compile_3, "\t");
      _builder.newLineIfNotEmpty();
      _builder.append("\t");
      String _xifexpression_1 = null;
      AdditionalPureArgument _higherOrderArg_2 = pf.getHigherOrderArg();
      boolean _notEquals_1 = (!Objects.equal(_higherOrderArg_2, null));
      if (_notEquals_1) {
        _xifexpression_1 = "};";
      }
      _builder.append(_xifexpression_1, "\t");
      _builder.newLineIfNotEmpty();
      _builder.append("}");
      return _builder.toString();
    }
    return null;
  }
  
  public String compile(final FunctionBodyPure fbp, final String arg, final boolean outsideCalls) {
    if ((fbp instanceof EmptyFunctionBody)) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("throw new UnsupportedOperationException(\"TODO\");");
      return _builder.toString();
    } else {
      if ((fbp instanceof CompositionFunctionBodyPure)) {
        String _compile = this.compile(((CompositionFunctionBodyPure) fbp), arg, outsideCalls);
        String _plus = ("return " + _compile);
        return (_plus + ";");
      }
    }
    return null;
  }
  
  public String compile(final CompositionFunctionBodyPure cfbp, final String argName, final boolean outsideCalls) {
    String result = "";
    final PureFunction initialElement = Others.getFirstFunctionDefinitionFromCompositionBodyPure(cfbp);
    boolean _matched = false;
    if (initialElement instanceof Value) {
      _matched=true;
      String _name = ((Value) initialElement).getName();
      String _plus = ("Value." + _name);
      String _plus_1 = (_plus + "()");
      result = _plus_1;
    }
    if (!_matched) {
      if (initialElement instanceof PureLambda) {
        _matched=true;
        Argument _arg = ((PureLambda)initialElement).getArg();
        CharSequence _compile = this.typeGenerator.compile(_arg);
        String _plus = ("(" + _compile);
        String _plus_1 = (_plus + ") -> ");
        FunctionBodyPure _functionBody = ((PureLambda)initialElement).getFunctionBody();
        Object _compile_1 = this.compile(_functionBody, argName, outsideCalls);
        String _plus_2 = (_plus_1 + _compile_1);
        result = _plus_2;
      }
    }
    if (!_matched) {
      if (initialElement instanceof PrimitivePureFunction) {
        _matched=true;
        String _compilePrimitiveCall = this.compilePrimitiveCall(((PrimitivePureFunction)initialElement), argName, outsideCalls);
        result = _compilePrimitiveCall;
      }
    }
    if (!_matched) {
      if (initialElement instanceof PureFunctionDefinition) {
        _matched=true;
        String _compileCall = this.compileCall(initialElement, argName, outsideCalls);
        result = _compileCall;
      }
    }
    EList<CompositionFunctionBodyPureFactor> _functionChain = cfbp.getFunctionChain();
    for (final CompositionFunctionBodyPureFactor f : _functionChain) {
      PureFunction _functionDefinitionFromPureFactor = Others.getFunctionDefinitionFromPureFactor(f);
      String _compileCall = this.compileCall(_functionDefinitionFromPureFactor, result, outsideCalls);
      result = _compileCall;
    }
    return result;
  }
  
  public String compileCall(final PureFunction pf, final String args, final boolean outsideCalls) {
    boolean _matched = false;
    if (pf instanceof Value) {
      _matched=true;
      String _name = ((Value) pf).getName();
      String _plus = ("Value." + _name);
      return (_plus + "()");
    }
    if (!_matched) {
      if (pf instanceof PureLambda) {
        _matched=true;
        AdditionalPureArgument _higherOrderArg = ((PureLambda)pf).getHigherOrderArg();
        Argument _arg2 = _higherOrderArg.getArg2();
        CharSequence _compile = this.typeGenerator.compile(_arg2);
        String _plus = ("(" + _compile);
        String _plus_1 = (_plus + ") -> ");
        FunctionBodyPure _functionBody = ((PureLambda)pf).getFunctionBody();
        String _compile_1 = this.compile(_functionBody, args, outsideCalls);
        return (_plus_1 + _compile_1);
      }
    }
    if (!_matched) {
      if (pf instanceof PrimitivePureFunction) {
        _matched=true;
        return this.compilePrimitiveCall(((PrimitivePureFunction)pf), args, outsideCalls);
      }
    }
    if (!_matched) {
      if (pf instanceof PureFunctionDefinition) {
        _matched=true;
        if ((!outsideCalls)) {
          String _name = ((PureFunctionDefinition)pf).getName();
          String _plus = (_name + "(");
          String _plus_1 = (_plus + args);
          return (_plus_1 + ")");
        } else {
          String _name_1 = ((PureFunctionDefinition)pf).getName();
          String _plus_2 = ("PureFunctionDefinitions." + _name_1);
          String _plus_3 = (_plus_2 + "(");
          String _plus_4 = (_plus_3 + args);
          return (_plus_4 + ")");
        }
      }
    }
    return null;
  }
  
  public String compilePrimitiveCall(final PrimitivePureFunction purePrimitive, final String argName, final boolean outsideCalls) {
    String _switchResult = null;
    boolean _matched = false;
    if (purePrimitive instanceof IntToString) {
      _matched=true;
      _switchResult = (("Primitives.intToString(" + argName) + ")");
    }
    if (!_matched) {
      if (purePrimitive instanceof IntPow) {
        _matched=true;
        _switchResult = (("Primitives.intPow(" + argName) + ")");
      }
    }
    if (!_matched) {
      if (purePrimitive instanceof Plus) {
        _matched=true;
        _switchResult = (("Primitives.plus(" + argName) + ")");
      }
    }
    if (!_matched) {
      if (purePrimitive instanceof Minus) {
        _matched=true;
        _switchResult = (("Primitives.minus(" + argName) + ")");
      }
    }
    if (!_matched) {
      if (purePrimitive instanceof Times) {
        _matched=true;
        _switchResult = (("Primitives.times(" + argName) + ")");
      }
    }
    if (!_matched) {
      if (purePrimitive instanceof Mod) {
        _matched=true;
        _switchResult = (("Primitives.mod(" + argName) + ")");
      }
    }
    if (!_matched) {
      if (purePrimitive instanceof ApplyF) {
        _matched=true;
        PureReference _value = ((ApplyF) purePrimitive).getValue();
        String _compile = this.compile(_value, argName, outsideCalls);
        String _plus = ((argName + ".f(") + _compile);
        _switchResult = (_plus + ")");
      }
    }
    return _switchResult;
  }
  
  public String compile(final PureReference r, final String argName, final boolean outsideCalls) {
    boolean _matched = false;
    if (r instanceof PureFunctionDefinition) {
      _matched=true;
      return this.compileCall(((PureFunction)r), argName, outsideCalls);
    }
    if (!_matched) {
      if (r instanceof Argument) {
        _matched=true;
        return ((Argument)r).getName();
      }
    }
    return null;
  }
}
