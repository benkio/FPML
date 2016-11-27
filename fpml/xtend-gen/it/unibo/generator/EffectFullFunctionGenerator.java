package it.unibo.generator;

import com.google.common.base.Objects;
import it.unibo.fPML.AdditionalEffectFullArgument;
import it.unibo.fPML.ApplyF;
import it.unibo.fPML.ApplyFIO;
import it.unibo.fPML.ApplyFIOFactor;
import it.unibo.fPML.CompositionFunctionBodyEffect;
import it.unibo.fPML.CompositionFunctionBodyEffectFullFactor;
import it.unibo.fPML.EffectFullArgument;
import it.unibo.fPML.EffectFullFunctionBlock;
import it.unibo.fPML.EffectFullFunctionDefinition;
import it.unibo.fPML.EffectFullReference;
import it.unibo.fPML.EmptyFunctionBody;
import it.unibo.fPML.FPMLFactory;
import it.unibo.fPML.FunctionBodyEffectFull;
import it.unibo.fPML.IOType;
import it.unibo.fPML.IntPow;
import it.unibo.fPML.IntToString;
import it.unibo.fPML.MainFunc;
import it.unibo.fPML.Minus;
import it.unibo.fPML.Mod;
import it.unibo.fPML.Plus;
import it.unibo.fPML.PrimitivePrint;
import it.unibo.fPML.PrimitiveRandom;
import it.unibo.fPML.PrimitiveReturn;
import it.unibo.fPML.PrimitiveTime;
import it.unibo.fPML.PureFunctionDefinition;
import it.unibo.fPML.PureFunctionType;
import it.unibo.fPML.PureReference;
import it.unibo.fPML.PureValue;
import it.unibo.fPML.Times;
import it.unibo.fPML.UnitType;
import it.unibo.generator.FPMLGenerator;
import it.unibo.generator.PureFunctionGenerator;
import it.unibo.generator.TypeGenerator;
import it.unibo.validation.utilitiesFunctions.Others;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Functions.Function2;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class EffectFullFunctionGenerator {
  private final TypeGenerator typeGenerator = new TypeGenerator();
  
  private final PureFunctionGenerator pureFunctionGenerator = new PureFunctionGenerator();
  
  public CharSequence compile(final EffectFullFunctionBlock effb) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    String _basePackageJava = FPMLGenerator.basePackageJava();
    _builder.append(_basePackageJava, "");
    _builder.append("Effectfull;");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("import ");
    String _basePackageJava_1 = FPMLGenerator.basePackageJava();
    _builder.append(_basePackageJava_1, "");
    _builder.append("Pure.Data.*;");
    _builder.newLineIfNotEmpty();
    _builder.append("import fj.data.*;");
    _builder.newLine();
    _builder.append("import fj.F;");
    _builder.newLine();
    _builder.append("import ");
    String _basePackageJava_2 = FPMLGenerator.basePackageJava();
    _builder.append(_basePackageJava_2, "");
    _builder.append("Pure.*;");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("public class EffectFullFunctionDefinitions {");
    _builder.newLine();
    {
      EList<EffectFullFunctionDefinition> _features = effb.getFeatures();
      for(final EffectFullFunctionDefinition f : _features) {
        _builder.append("\t");
        String _compile = this.compile(f);
        _builder.append(_compile, "\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("}");
    return _builder;
  }
  
  public String compile(final EffectFullFunctionDefinition pf) {
    String _name = pf.getName();
    boolean _notEquals = (!Objects.equal(_name, "main"));
    if (_notEquals) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("public static ");
      IOType _returnType = pf.getReturnType();
      String _compile = this.typeGenerator.compile(_returnType);
      _builder.append(_compile, "");
      _builder.append(" ");
      String _name_1 = pf.getName();
      _builder.append(_name_1, "");
      _builder.append(" (");
      EffectFullArgument _arg = pf.getArg();
      CharSequence _compile_1 = this.typeGenerator.compile(_arg);
      _builder.append(_compile_1, "");
      _builder.append("){");
      _builder.newLineIfNotEmpty();
      {
        FunctionBodyEffectFull _functionBody = pf.getFunctionBody();
        if ((_functionBody instanceof EmptyFunctionBody)) {
          _builder.append("\t");
          _builder.append("throw new UnsupportedOperationException(\"TODO\");");
          _builder.newLine();
        } else {
          FunctionBodyEffectFull _functionBody_1 = pf.getFunctionBody();
          if ((_functionBody_1 instanceof CompositionFunctionBodyEffect)) {
            {
              AdditionalEffectFullArgument _higherOrderArg = pf.getHigherOrderArg();
              boolean _equals = Objects.equal(_higherOrderArg, null);
              if (_equals) {
                _builder.append("\t");
                _builder.append("return ");
                FunctionBodyEffectFull _functionBody_2 = pf.getFunctionBody();
                EffectFullArgument _arg_1 = pf.getArg();
                String _compileIO = this.compileIO(((CompositionFunctionBodyEffect) _functionBody_2), _arg_1);
                _builder.append(_compileIO, "\t");
                _builder.newLineIfNotEmpty();
              } else {
                _builder.append("\t");
                _builder.append("return ( ");
                AdditionalEffectFullArgument _higherOrderArg_1 = pf.getHigherOrderArg();
                EffectFullArgument _arg2 = _higherOrderArg_1.getArg2();
                CharSequence _compile_2 = this.typeGenerator.compile(_arg2);
                _builder.append(_compile_2, "\t");
                _builder.append(" ) -> ");
                FunctionBodyEffectFull _functionBody_3 = pf.getFunctionBody();
                EffectFullArgument _arg_2 = pf.getArg();
                String _compileIO_1 = this.compileIO(((CompositionFunctionBodyEffect) _functionBody_3), _arg_2);
                _builder.append(_compileIO_1, "\t");
                _builder.newLineIfNotEmpty();
              }
            }
          }
        }
      }
      _builder.append("}");
      return _builder.toString();
    } else {
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("public static void ");
      String _name_2 = pf.getName();
      _builder_1.append(_name_2, "");
      _builder_1.append("(String[] args){");
      _builder_1.newLineIfNotEmpty();
      {
        FunctionBodyEffectFull _functionBody_4 = pf.getFunctionBody();
        if ((_functionBody_4 instanceof EmptyFunctionBody)) {
          _builder_1.append("\t");
          _builder_1.append("throw new UnsupportedOperationException(\"TODO\");");
          _builder_1.newLine();
        } else {
          FunctionBodyEffectFull _functionBody_5 = pf.getFunctionBody();
          if ((_functionBody_5 instanceof CompositionFunctionBodyEffect)) {
            _builder_1.append("\t");
            _builder_1.append("IOW.lift(IOFunctions.ioUnit)");
            FunctionBodyEffectFull _functionBody_6 = pf.getFunctionBody();
            CharSequence _compileIOWalkthrough = this.compileIOWalkthrough(((CompositionFunctionBodyEffect) _functionBody_6));
            _builder_1.append(_compileIOWalkthrough, "\t");
            _builder_1.newLineIfNotEmpty();
          }
        }
      }
      _builder_1.append("\t");
      _builder_1.append(".safe().run().on((IOException e) -> { e.printStackTrace(); return Unit.unit(); });");
      _builder_1.newLine();
      _builder_1.append("}");
      return _builder_1.toString();
    }
  }
  
  public String compileIO(final CompositionFunctionBodyEffect cfbe, final EffectFullArgument arg) {
    String argName = "";
    boolean _notEquals = (!Objects.equal(arg, null));
    if (_notEquals) {
      String _name = arg.getName();
      argName = _name;
    }
    EffectFullReference _firstFunctionDefinitionFromCompositionBodyEffectFull = Others.getFirstFunctionDefinitionFromCompositionBodyEffectFull(cfbe);
    final CharSequence firstElementCompiled = this.compileIO(_firstFunctionDefinitionFromCompositionBodyEffectFull, argName);
    final Function2<String, CompositionFunctionBodyEffectFullFactor, String> _function = (String acc, CompositionFunctionBodyEffectFullFactor x) -> {
      EffectFullReference _functionDefinitionFromEffectFullFactor = Others.getFunctionDefinitionFromEffectFullFactor(x);
      CharSequence _compileIO = this.compileIO(_functionDefinitionFromEffectFullFactor, acc);
      return (_compileIO + "\n\t");
    };
    final Function2<String, CompositionFunctionBodyEffectFullFactor, String> f = _function;
    EList<CompositionFunctionBodyEffectFullFactor> _functionChain = cfbe.getFunctionChain();
    String _plus = (firstElementCompiled + "\n\t");
    String _fold = IterableExtensions.<CompositionFunctionBodyEffectFullFactor, String>fold(_functionChain, _plus, f);
    return (_fold + ";");
  }
  
  public CharSequence compileIO(final EffectFullReference e, final String valueName) {
    CharSequence _switchResult = null;
    boolean _matched = false;
    if (e instanceof IntToString) {
      _matched=true;
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("IOFunctions.map(");
      _builder.append(valueName, "");
      _builder.append(" ,Primitives::intToString)");
      _switchResult = _builder;
    }
    if (!_matched) {
      if (e instanceof IntPow) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("IOFunctions.map(");
        _builder.append(valueName, "");
        _builder.append(",Primitives::intPow) ");
        _switchResult = _builder;
      }
    }
    if (!_matched) {
      if (e instanceof Plus) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("IOFunctions.map(");
        _builder.append(valueName, "");
        _builder.append(", Primitives::plus)");
        _switchResult = _builder;
      }
    }
    if (!_matched) {
      if (e instanceof Minus) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("IOFunctions.map(");
        _builder.append(valueName, "");
        _builder.append(", Primitives::minus)");
        _switchResult = _builder;
      }
    }
    if (!_matched) {
      if (e instanceof Times) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("IOFunctions.map(");
        _builder.append(valueName, "");
        _builder.append(", Primitives::times)");
        _switchResult = _builder;
      }
    }
    if (!_matched) {
      if (e instanceof Mod) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("IOFunctions.map(");
        _builder.append(valueName, "");
        _builder.append(", Primitives::mod)");
        _switchResult = _builder;
      }
    }
    if (!_matched) {
      if (e instanceof PrimitivePrint) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("IOFunctions.bind(");
        _builder.append(valueName, "");
        _builder.append(", PrimitivesEffectFull::primitivePrint)");
        _switchResult = _builder;
      }
    }
    if (!_matched) {
      if (e instanceof PrimitiveRandom) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("PrimitivesEffectFull.primitiveRandom()");
        _switchResult = _builder;
      }
    }
    if (!_matched) {
      if (e instanceof PrimitiveTime) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("PrimitivesEffectFull.primitiveTime()");
        _switchResult = _builder;
      }
    }
    if (!_matched) {
      if (e instanceof PrimitiveReturn) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("IOFunctions.bind(");
        _builder.append(valueName, "");
        _builder.append(", PrimitivesEffectFull::primitiveReturn)");
        _switchResult = _builder;
      }
    }
    if (!_matched) {
      if (e instanceof ApplyF) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append(valueName, "");
        _builder.append(".f(");
        PureReference _value = ((ApplyF)e).getValue();
        String _compile = this.pureFunctionGenerator.compile(_value, "", true);
        _builder.append(_compile, "");
        _builder.append(")");
        _switchResult = _builder;
      }
    }
    if (!_matched) {
      if (e instanceof PureValue) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("IOFunctions.unit(Value.");
        String _name = ((PureValue) e).getName();
        _builder.append(_name, "");
        _builder.append("())");
        return _builder.toString();
      }
    }
    if (!_matched) {
      if (e instanceof PureFunctionDefinition) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("IOFunctions.map(");
        _builder.append(valueName, "");
        _builder.append(", PureFunctionDefinitions::");
        String _name = ((PureFunctionDefinition) e).getName();
        _builder.append(_name, "");
        _builder.append(")");
        return _builder.toString();
      }
    }
    if (!_matched) {
      if (e instanceof EffectFullArgument) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("IOFunctions.unit(");
        String _name = ((EffectFullArgument) e).getName();
        _builder.append(_name, "");
        _builder.append(")");
        return _builder.toString();
      }
    }
    if (!_matched) {
      if (e instanceof EffectFullFunctionDefinition) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("IOFunctions.bind(");
        _builder.append(valueName, "");
        _builder.append(", EffectFullFunctionDefinitions::");
        String _name = ((EffectFullFunctionDefinition) e).getName();
        _builder.append(_name, "");
        _builder.append(")");
        return _builder.toString();
      }
    }
    return _switchResult;
  }
  
  public CharSequence compileIOWalkthrough(final CompositionFunctionBodyEffect cfbe) {
    StringConcatenation _builder = new StringConcatenation();
    EffectFullReference _firstFunctionDefinitionFromCompositionBodyEffectFull = Others.getFirstFunctionDefinitionFromCompositionBodyEffectFull(cfbe);
    final CharSequence firstElementCompiled = this.compileIOWalkthorugh(_firstFunctionDefinitionFromCompositionBodyEffectFull);
    _builder.newLineIfNotEmpty();
    final Function2<String, CompositionFunctionBodyEffectFullFactor, String> _function = (String acc, CompositionFunctionBodyEffectFullFactor x) -> {
      CharSequence _compileIOWalkThough = this.compileIOWalkThough(x);
      String _plus = (acc + _compileIOWalkThough);
      return (_plus + "\n\t");
    };
    final Function2<String, CompositionFunctionBodyEffectFullFactor, String> f = _function;
    _builder.newLineIfNotEmpty();
    EList<CompositionFunctionBodyEffectFullFactor> _functionChain = cfbe.getFunctionChain();
    String _plus = (firstElementCompiled + "\n\t");
    String _fold = IterableExtensions.<CompositionFunctionBodyEffectFullFactor, String>fold(_functionChain, _plus, f);
    _builder.append(_fold, "");
    return _builder;
  }
  
  public CharSequence compileIOWalkThough(final CompositionFunctionBodyEffectFullFactor f) {
    final EffectFullReference e = Others.getFunctionDefinitionFromEffectFullFactor(f);
    return this.compileIOWalkthorugh(e);
  }
  
  public CharSequence compileIOWalkthorugh(final EffectFullReference e) {
    CharSequence _switchResult = null;
    boolean _matched = false;
    if (e instanceof IntToString) {
      _matched=true;
      StringConcatenation _builder = new StringConcatenation();
      _builder.append(".map(Primitives::intToString)");
      _switchResult = _builder;
    }
    if (!_matched) {
      if (e instanceof IntPow) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append(".map(Primitives::intPow) ");
        _switchResult = _builder;
      }
    }
    if (!_matched) {
      if (e instanceof Plus) {
        _matched=true;
        _switchResult = ".map(Primitives::plus)";
      }
    }
    if (!_matched) {
      if (e instanceof Minus) {
        _matched=true;
        _switchResult = ".map(Primitives::minus)";
      }
    }
    if (!_matched) {
      if (e instanceof Times) {
        _matched=true;
        _switchResult = ".map(Primitives::times)";
      }
    }
    if (!_matched) {
      if (e instanceof Mod) {
        _matched=true;
        _switchResult = ".map(Primitives::mod)";
      }
    }
    if (!_matched) {
      if (e instanceof PrimitivePrint) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append(".bind(PrimitivesEffectFull::primitivePrint)");
        _switchResult = _builder;
      }
    }
    if (!_matched) {
      if (e instanceof PrimitiveRandom) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append(".bind(PrimitivesEffectFull::primitiveRandom)");
        _switchResult = _builder;
      }
    }
    if (!_matched) {
      if (e instanceof PrimitiveTime) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append(".bind(PrimitivesEffectFull::primitiveTime)");
        _switchResult = _builder;
      }
    }
    if (!_matched) {
      if (e instanceof PrimitiveReturn) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append(".bind(PrimitivesEffectFull::primitiveReturn)");
        _switchResult = _builder;
      }
    }
    if (!_matched) {
      if (e instanceof ApplyFIO) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append(".bind(PrimitivesEffectFull::ApplyFIO(");
        ApplyFIOFactor _value = ((ApplyFIO)e).getValue();
        EffectFullReference _valueFromApplyFIOFactor = Others.getValueFromApplyFIOFactor(_value);
        Object _compileIOWalkthorugh = this.compileIOWalkthorugh(_valueFromApplyFIOFactor);
        _builder.append(_compileIOWalkthorugh, "");
        _builder.append("))");
        _switchResult = _builder;
      }
    }
    if (!_matched) {
      if (e instanceof ApplyF) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append(".map((");
        PureFunctionType _functionType = ((ApplyF)e).getFunctionType();
        Object _compile = this.typeGenerator.compile(_functionType);
        _builder.append(_compile, "");
        _builder.append(" f) -> f.f(");
        PureReference _value = ((ApplyF)e).getValue();
        String _compile_1 = this.pureFunctionGenerator.compile(_value, "", true);
        _builder.append(_compile_1, "");
        _builder.append("))");
        _switchResult = _builder;
      }
    }
    if (!_matched) {
      if (e instanceof PureValue) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append(".append(IOFunctions.unit(Value.");
        String _name = ((PureValue) e).getName();
        _builder.append(_name, "");
        _builder.append("()))");
        return _builder.toString();
      }
    }
    if (!_matched) {
      if (e instanceof PureFunctionDefinition) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append(".map(PureFunctionDefinitions::");
        String _name = ((PureFunctionDefinition) e).getName();
        _builder.append(_name, "");
        _builder.append(")");
        return _builder.toString();
      }
    }
    if (!_matched) {
      if (e instanceof EffectFullArgument) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append(".append(IOFunctions.unit(");
        String _name = ((EffectFullArgument) e).getName();
        _builder.append(_name, "");
        _builder.append("))");
        return _builder.toString();
      }
    }
    if (!_matched) {
      if (e instanceof EffectFullFunctionDefinition) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append(".bind(EffectFullFunctionDefinitions::");
        String _name = ((EffectFullFunctionDefinition) e).getName();
        _builder.append(_name, "");
        _builder.append(")");
        return _builder.toString();
      }
    }
    return _switchResult;
  }
  
  public CharSequence compile(final MainFunc mf) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    String _basePackageJava = FPMLGenerator.basePackageJava();
    _builder.append(_basePackageJava, "");
    _builder.append("Effectfull;");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("import ");
    String _basePackageJava_1 = FPMLGenerator.basePackageJava();
    _builder.append(_basePackageJava_1, "");
    _builder.append("Pure.Data.*;");
    _builder.newLineIfNotEmpty();
    _builder.append("import fj.data.*;");
    _builder.newLine();
    _builder.append("import java.io.IOException;");
    _builder.newLine();
    _builder.append("import fj.Unit;");
    _builder.newLine();
    _builder.append("import fj.F;");
    _builder.newLine();
    _builder.append("import ");
    String _basePackageJava_2 = FPMLGenerator.basePackageJava();
    _builder.append(_basePackageJava_2, "");
    _builder.append("Pure.*;");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("public class EntryPoint {");
    _builder.newLine();
    _builder.append("\t");
    String _compileMain = this.compileMain(mf);
    _builder.append(_compileMain, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    return _builder;
  }
  
  public String compileMain(final MainFunc mf) {
    String _xblockexpression = null;
    {
      final IOType effectFullMainReturnType = FPMLFactory.eINSTANCE.createIOType();
      UnitType _createUnitType = FPMLFactory.eINSTANCE.createUnitType();
      effectFullMainReturnType.setType(_createUnitType);
      final EffectFullFunctionDefinition effectFullMain = FPMLFactory.eINSTANCE.createEffectFullFunctionDefinition();
      FunctionBodyEffectFull _functionBody = mf.getFunctionBody();
      effectFullMain.setFunctionBody(_functionBody);
      effectFullMain.setReturnType(effectFullMainReturnType);
      effectFullMain.setName("main");
      _xblockexpression = this.compile(effectFullMain);
    }
    return _xblockexpression;
  }
}
