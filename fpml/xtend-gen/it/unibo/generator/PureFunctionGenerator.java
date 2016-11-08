package it.unibo.generator;

import it.unibo.fPML.Argument;
import it.unibo.fPML.CompositionFunctionBodyPure;
import it.unibo.fPML.Data;
import it.unibo.fPML.EmptyFunctionBody;
import it.unibo.fPML.FunctionBodyPure;
import it.unibo.fPML.InitialPureChainElement;
import it.unibo.fPML.PureFunction;
import it.unibo.fPML.PureFunctionBlock;
import it.unibo.fPML.ValueType;
import it.unibo.generator.FPMLGenerator;
import it.unibo.generator.TypeGenerator;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Functions.Function2;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class PureFunctionGenerator {
  private final TypeGenerator typeGenerator = new TypeGenerator();
  
  public CharSequence compile(final PureFunctionBlock pfb) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    String _basePackageJava = FPMLGenerator.getBasePackageJava();
    _builder.append(_basePackageJava, "");
    _builder.append("Pure;");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("import ");
    String _basePackageJava_1 = FPMLGenerator.getBasePackageJava();
    _builder.append(_basePackageJava_1, "");
    _builder.append("Pure.Data.*;");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("public static class PureFunction {");
    _builder.newLine();
    {
      EList<PureFunction> _features = pfb.getFeatures();
      for(final PureFunction f : _features) {
        _builder.append("\t");
        CharSequence _compile = this.compile(f);
        _builder.append(_compile, "\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence compile(final PureFunction pf) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.newLine();
    _builder.append("public static ");
    ValueType _returnType = pf.getReturnType();
    CharSequence _functionCompile = this.typeGenerator.functionCompile(_returnType);
    _builder.append(_functionCompile, "");
    _builder.append(" ");
    String _name = pf.getName();
    _builder.append(_name, "");
    _builder.append(" (");
    Argument _arg = pf.getArg();
    CharSequence _compile = this.typeGenerator.compile(_arg);
    _builder.append(_compile, "");
    _builder.append("){");
    _builder.newLineIfNotEmpty();
    {
      FunctionBodyPure _functionBody = pf.getFunctionBody();
      if ((_functionBody instanceof EmptyFunctionBody)) {
        _builder.append("\t");
        _builder.append("throw new NotImpletementedException(\"TODO\")");
        _builder.newLine();
      } else {
        FunctionBodyPure _functionBody_1 = pf.getFunctionBody();
        if ((_functionBody_1 instanceof CompositionFunctionBodyPure)) {
          _builder.append("\t");
          FunctionBodyPure _functionBody_2 = pf.getFunctionBody();
          CharSequence _compile_1 = this.compile(((CompositionFunctionBodyPure) _functionBody_2));
          _builder.append(_compile_1, "\t");
          _builder.newLineIfNotEmpty();
        }
      }
    }
    _builder.append("}");
    return _builder;
  }
  
  public CharSequence compile(final CompositionFunctionBodyPure cfbp) {
    StringConcatenation _builder = new StringConcatenation();
    final Function2<String, InitialPureChainElement, String> _function = (String acc, InitialPureChainElement x) -> {
      CharSequence _compile = this.compile(x);
      String _plus = (_compile + acc);
      return (_plus + ")");
    };
    final Function2<String, InitialPureChainElement, String> f = _function;
    _builder.newLineIfNotEmpty();
    EList<InitialPureChainElement> _functionChain = cfbp.getFunctionChain();
    String _fold = IterableExtensions.<InitialPureChainElement, String>fold(_functionChain, "", f);
    _builder.append(_fold, "");
    return _builder;
  }
  
  public CharSequence compile(final InitialPureChainElement e) {
    StringConcatenation _builder = new StringConcatenation();
    {
      if ((e instanceof Data)) {
        String _name = ((Data) e).getName();
        _builder.append(_name, "");
        _builder.append(".getValue()");
        _builder.newLineIfNotEmpty();
      } else {
        String _name_1 = ((PureFunction) e).getName();
        _builder.append(_name_1, "");
      }
    }
    _builder.append("(");
    return _builder;
  }
}
