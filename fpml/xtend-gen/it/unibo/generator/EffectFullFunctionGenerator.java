package it.unibo.generator;

import it.unibo.fPML.ApplyFIO;
import it.unibo.fPML.CompositionFunctionBodyEffect;
import it.unibo.fPML.CompositionFunctionBodyEffectFullFactor;
import it.unibo.fPML.EffectFullArgument;
import it.unibo.fPML.EffectFullBlock;
import it.unibo.fPML.EffectFullFunctionDefinition;
import it.unibo.fPML.EffectFullReference;
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
import it.unibo.fPML.PureFunctionDefinition;
import it.unibo.fPML.Times;
import it.unibo.fPML.UnitType;
import it.unibo.fPML.Value;
import it.unibo.generator.FPMLGenerator;
import it.unibo.generator.TypeGenerator;
import it.unibo.validation.utilitiesFunctions.Others;
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
    _builder.append("import ");
    String _basePackageJava_2 = FPMLGenerator.basePackageJava();
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
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field arg is undefined for the type EffectFullFunctionDefinition"
      + "\nThe method or field arg is undefined for the type EffectFullFunctionDefinition"
      + "\nname cannot be resolved");
  }
  
  public CharSequence compile(final CompositionFunctionBodyEffect cfbe) {
    StringConcatenation _builder = new StringConcatenation();
    EffectFullReference _firstFunctionDefinitionFromCompositionBodyEffectFull = Others.getFirstFunctionDefinitionFromCompositionBodyEffectFull(cfbe);
    final CharSequence firstElementCompiled = this.compile(_firstFunctionDefinitionFromCompositionBodyEffectFull);
    _builder.newLineIfNotEmpty();
    final Function2<String, CompositionFunctionBodyEffectFullFactor, String> _function = (String acc, CompositionFunctionBodyEffectFullFactor x) -> {
      CharSequence _compile = this.compile(x);
      String _plus = (acc + _compile);
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
  
  public CharSequence compile(final CompositionFunctionBodyEffectFullFactor f) {
    final EffectFullReference e = Others.getFunctionDefinitionFromEffectFullFactor(f);
    return this.compile(e);
  }
  
  public CharSequence compile(final EffectFullReference e) {
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
      if (e instanceof ApplyFIO) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append(".bind(PrimitivesEffectFull::ApplyFIO(");
        EffectFullReference _value = ((ApplyFIO)e).getValue();
        Object _compile = this.compile(_value);
        _builder.append(_compile, "");
        _builder.append("))");
        _switchResult = _builder;
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
