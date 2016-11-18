package it.unibo.generator;

import com.google.common.base.Objects;
import it.unibo.fPML.ChainElement;
import it.unibo.fPML.CompositionFunctionBodyEffect;
import it.unibo.fPML.CompositionFunctionBodyEffectFullFactor;
import it.unibo.fPML.EffectFullArgument;
import it.unibo.fPML.EffectFullBlock;
import it.unibo.fPML.EffectFullFunctionDefinition;
import it.unibo.fPML.EmptyFunctionBody;
import it.unibo.fPML.FPMLFactory;
import it.unibo.fPML.FunctionBodyEffectFull;
import it.unibo.fPML.IOType;
import it.unibo.fPML.IntPow;
import it.unibo.fPML.IntToString;
import it.unibo.fPML.MainFunc;
import it.unibo.fPML.PrimitivePrint;
import it.unibo.fPML.PureFunctionDefinition;
import it.unibo.fPML.UnitType;
import it.unibo.fPML.Value;
import it.unibo.generator.FPMLGenerator;
import it.unibo.generator.TypeGenerator;
import it.unibo.validation.UtilitiesFunctions;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Functions.Function2;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class EffectFullFunctionGenerator {
  private final TypeGenerator typeGenerator = new TypeGenerator();
  
  public CharSequence compile(final EffectFullBlock efb) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    String _basePackageJava = FPMLGenerator.getBasePackageJava();
    _builder.append(_basePackageJava, "");
    _builder.append("Effectfull;");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("import ");
    String _basePackageJava_1 = FPMLGenerator.getBasePackageJava();
    _builder.append(_basePackageJava_1, "");
    _builder.append("Pure.Data.*;");
    _builder.newLineIfNotEmpty();
    _builder.append("import fj.data.*;");
    _builder.newLine();
    _builder.append("import ");
    String _basePackageJava_2 = FPMLGenerator.getBasePackageJava();
    _builder.append(_basePackageJava_2, "");
    _builder.append("Pure.*;");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("public class EffectFullFunctionDefinitions {");
    _builder.newLine();
    {
      EList<EffectFullFunctionDefinition> _features = efb.getFeatures();
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
            _builder.append("\t");
            _builder.append("return IOW.lift(IOFunctions.unit(");
            EffectFullArgument _arg_1 = pf.getArg();
            String _name_2 = _arg_1.getName();
            _builder.append(_name_2, "\t");
            _builder.append("))");
            FunctionBodyEffectFull _functionBody_2 = pf.getFunctionBody();
            CharSequence _compile_2 = this.compile(((CompositionFunctionBodyEffect) _functionBody_2));
            _builder.append(_compile_2, "\t");
            _builder.append(";");
            _builder.newLineIfNotEmpty();
          }
        }
      }
      _builder.append("}");
      return _builder.toString();
    } else {
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("public static void ");
      String _name_3 = pf.getName();
      _builder_1.append(_name_3, "");
      _builder_1.append("(String[] args){");
      _builder_1.newLineIfNotEmpty();
      {
        FunctionBodyEffectFull _functionBody_3 = pf.getFunctionBody();
        if ((_functionBody_3 instanceof EmptyFunctionBody)) {
          _builder_1.append("\t");
          _builder_1.append("throw new UnsupportedOperationException(\"TODO\");");
          _builder_1.newLine();
        } else {
          FunctionBodyEffectFull _functionBody_4 = pf.getFunctionBody();
          if ((_functionBody_4 instanceof CompositionFunctionBodyEffect)) {
            _builder_1.append("\t");
            _builder_1.append("IOW.lift(IOFunctions.ioUnit)");
            FunctionBodyEffectFull _functionBody_5 = pf.getFunctionBody();
            CharSequence _compile_3 = this.compile(((CompositionFunctionBodyEffect) _functionBody_5));
            _builder_1.append(_compile_3, "\t");
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
  
  public CharSequence compile(final CompositionFunctionBodyEffect cfbe) {
    StringConcatenation _builder = new StringConcatenation();
    ChainElement _firstFunctionDefinitionFromCompositionBodyEffectFull = UtilitiesFunctions.getFirstFunctionDefinitionFromCompositionBodyEffectFull(cfbe);
    final String firstElementCompiled = this.compile(_firstFunctionDefinitionFromCompositionBodyEffectFull);
    _builder.newLineIfNotEmpty();
    final Function2<String, CompositionFunctionBodyEffectFullFactor, String> _function = (String acc, CompositionFunctionBodyEffectFullFactor x) -> {
      String _compile = this.compile(x);
      String _plus = (acc + _compile);
      return (_plus + "\n\t");
    };
    final Function2<String, CompositionFunctionBodyEffectFullFactor, String> f = _function;
    _builder.newLineIfNotEmpty();
    EList<CompositionFunctionBodyEffectFullFactor> _functionChain = cfbe.getFunctionChain();
    String _fold = IterableExtensions.<CompositionFunctionBodyEffectFullFactor, String>fold(_functionChain, (firstElementCompiled + "\n\t"), f);
    _builder.append(_fold, "");
    return _builder;
  }
  
  public String compile(final CompositionFunctionBodyEffectFullFactor f) {
    final ChainElement e = UtilitiesFunctions.getFunctionDefinitionFromEffectFullFactor(f);
    return this.compile(e);
  }
  
  public String compile(final ChainElement e) {
    boolean _matched = false;
    if (e instanceof IntToString) {
      _matched=true;
      StringConcatenation _builder = new StringConcatenation();
      _builder.append(".map(String::valueOf)");
      return _builder.toString();
    }
    if (!_matched) {
      if (e instanceof IntPow) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append(".map(x -> x * x) ");
        return _builder.toString();
      }
    }
    if (!_matched) {
      if (e instanceof PrimitivePrint) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append(".bind(IOFunctions::stdoutPrint)");
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
      if (e instanceof Value) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append(".append(IOFunctions.unit(Value.");
        String _name = ((Value) e).getName();
        _builder.append(_name, "");
        _builder.append("()))");
        return _builder.toString();
      }
    }
    if (!_matched) {
      if (e instanceof EffectFullArgument) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append(".append(");
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
        _builder.append(".bind(EffectFullFunctionDefinitions::");
        String _name = ((EffectFullFunctionDefinition) e).getName();
        _builder.append(_name, "");
        _builder.append(")");
        return _builder.toString();
      }
    }
    return null;
  }
  
  public CharSequence compile(final MainFunc mf) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    String _basePackageJava = FPMLGenerator.getBasePackageJava();
    _builder.append(_basePackageJava, "");
    _builder.append("Effectfull;");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("import ");
    String _basePackageJava_1 = FPMLGenerator.getBasePackageJava();
    _builder.append(_basePackageJava_1, "");
    _builder.append("Pure.Data.*;");
    _builder.newLineIfNotEmpty();
    _builder.append("import fj.data.*;");
    _builder.newLine();
    _builder.append("import java.io.IOException;");
    _builder.newLine();
    _builder.append("import fj.Unit;");
    _builder.newLine();
    _builder.append("import ");
    String _basePackageJava_2 = FPMLGenerator.getBasePackageJava();
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
