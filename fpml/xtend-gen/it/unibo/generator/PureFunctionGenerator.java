package it.unibo.generator;

import it.unibo.fPML.Argument;
import it.unibo.fPML.CompositionFunctionBodyPure;
import it.unibo.fPML.EmptyFunctionBody;
import it.unibo.fPML.FunctionBodyPure;
import it.unibo.fPML.InitialPureChainElement;
import it.unibo.fPML.PureFunction;
import it.unibo.fPML.PureFunctionBlock;
import it.unibo.fPML.Value;
import it.unibo.fPML.ValueType;
import it.unibo.generator.FPMLGenerator;
import it.unibo.generator.TypeGenerator;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;

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
    CharSequence _compile = this.typeGenerator.compile(_returnType);
    _builder.append(_compile, "");
    _builder.append(" ");
    String _name = pf.getName();
    _builder.append(_name, "");
    _builder.append(" (");
    Argument _arg = pf.getArg();
    CharSequence _compile_1 = this.typeGenerator.compile(_arg);
    _builder.append(_compile_1, "");
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
          String _compile_2 = this.compile(((CompositionFunctionBodyPure) _functionBody_2));
          _builder.append(_compile_2, "\t");
          _builder.newLineIfNotEmpty();
        }
      }
    }
    _builder.append("}");
    return _builder;
  }
  
  public String compile(final CompositionFunctionBodyPure cfbp) {
    String result = "";
    InitialPureChainElement _initialElement = cfbp.getInitialElement();
    if ((_initialElement instanceof PureFunction)) {
      InitialPureChainElement _initialElement_1 = cfbp.getInitialElement();
      String _compileCall = this.compileCall(((PureFunction) _initialElement_1), "");
      result = _compileCall;
    } else {
      InitialPureChainElement _initialElement_2 = cfbp.getInitialElement();
      String _name = ((Value) _initialElement_2).getName();
      result = _name;
    }
    EList<PureFunction> _functionChain = cfbp.getFunctionChain();
    for (final PureFunction f : _functionChain) {
      String _compileCall_1 = this.compileCall(f, result);
      result = _compileCall_1;
    }
    return result;
  }
  
  public String compileCall(final PureFunction pf, final String args) {
    String _name = pf.getName();
    String _plus = (_name + "(");
    String _plus_1 = (_plus + args);
    return (_plus_1 + ")");
  }
}
