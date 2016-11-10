package it.unibo.generator;

import it.unibo.fPML.ChainElement;
import it.unibo.fPML.CompositionFunctionBodyEffect;
import it.unibo.fPML.EffectFullArgument;
import it.unibo.fPML.EffectFullBlock;
import it.unibo.fPML.EffectFullFunction;
import it.unibo.fPML.EmptyFunctionBody;
import it.unibo.fPML.FunctionBodyEffectFull;
import it.unibo.fPML.IOType;
import it.unibo.fPML.PureFunction;
import it.unibo.fPML.Value;
import it.unibo.generator.FPMLGenerator;
import it.unibo.generator.TypeGenerator;
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
    _builder.append("public class EffectFullFunctions {");
    _builder.newLine();
    {
      EList<EffectFullFunction> _features = efb.getFeatures();
      for(final EffectFullFunction f : _features) {
        _builder.append("\t");
        CharSequence _compile = this.compile(f);
        _builder.append(_compile, "\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("}");
    return _builder;
  }
  
  public CharSequence compile(final EffectFullFunction pf) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.newLine();
    _builder.append("public static ");
    IOType _returnType = pf.getReturnType();
    String _compile = this.typeGenerator.compile(_returnType);
    _builder.append(_compile, "");
    _builder.append(" ");
    String _name = pf.getName();
    _builder.append(_name, "");
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
          _builder.append("IOW.append(IOFunctions.unit(");
          EffectFullArgument _arg_1 = pf.getArg();
          String _name_1 = _arg_1.getName();
          _builder.append(_name_1, "\t");
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
    return _builder;
  }
  
  public CharSequence compile(final CompositionFunctionBodyEffect cfbe) {
    StringConcatenation _builder = new StringConcatenation();
    final Function2<String, ChainElement, String> _function = (String acc, ChainElement x) -> {
      String _compile = this.compile(x);
      String _plus = (acc + _compile);
      return (_plus + "\n\t");
    };
    final Function2<String, ChainElement, String> f = _function;
    _builder.newLineIfNotEmpty();
    EList<ChainElement> _functionChain = cfbe.getFunctionChain();
    String _fold = IterableExtensions.<ChainElement, String>fold(_functionChain, "\n\t", f);
    _builder.append(_fold, "");
    return _builder;
  }
  
  public String compile(final ChainElement e) {
    boolean _matched = false;
    if (e instanceof PureFunction) {
      _matched=true;
      StringConcatenation _builder = new StringConcatenation();
      _builder.append(".map(PureFunctions::");
      String _name = ((PureFunction) e).getName();
      _builder.append(_name, "");
      _builder.append(")");
      return _builder.toString();
    }
    if (!_matched) {
      if (e instanceof Value) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append(".append(IOFunctions.unit(");
        String _name = ((Value) e).getName();
        _builder.append(_name, "");
        _builder.append(".value))");
        return _builder.toString();
      }
    }
    if (!_matched) {
      if (e instanceof EffectFullFunction) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append(".bind(EffectFullFunctions::");
        String _name = ((EffectFullFunction) e).getName();
        _builder.append(_name, "");
        _builder.append(")");
        return _builder.toString();
      }
    }
    return null;
  }
}
