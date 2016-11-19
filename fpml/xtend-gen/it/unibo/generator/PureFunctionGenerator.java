package it.unibo.generator;

import com.google.common.base.Objects;
import it.unibo.fPML.Argument;
import it.unibo.fPML.CompositionFunctionBodyPure;
import it.unibo.fPML.CompositionFunctionBodyPureFactor;
import it.unibo.fPML.EmptyFunctionBody;
import it.unibo.fPML.FPMLFactory;
import it.unibo.fPML.FunctionBodyPure;
import it.unibo.fPML.IntPow;
import it.unibo.fPML.IntToString;
import it.unibo.fPML.PureFunctionBlock;
import it.unibo.fPML.PureFunctionDefinition;
import it.unibo.fPML.Value;
import it.unibo.fPML.ValueType;
import it.unibo.generator.FPMLGenerator;
import it.unibo.generator.TypeGenerator;
import it.unibo.validation.UtilitiesFunctions;
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
    _builder.append("public class PureFunctionDefinitions {");
    _builder.newLine();
    {
      EList<PureFunctionDefinition> _features = pfb.getFeatures();
      for(final PureFunctionDefinition f : _features) {
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
  
  public CharSequence compile(final PureFunctionDefinition pf) {
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
    _builder.append("){");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    FunctionBodyPure _functionBody = pf.getFunctionBody();
    Argument _arg_1 = pf.getArg();
    String _name_1 = _arg_1.getName();
    String _compile_2 = this.compile(_functionBody, _name_1, false);
    _builder.append(_compile_2, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    return _builder;
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
    final PureFunctionDefinition initialElement = UtilitiesFunctions.getFirstFunctionDefinitionFromCompositionBodyPure(cfbp);
    boolean _matched = false;
    if (initialElement instanceof PureFunctionDefinition) {
      _matched=true;
      String _compileCall = this.compileCall(initialElement, argName, outsideCalls);
      result = _compileCall;
    }
    if (!_matched) {
      if (initialElement instanceof Value) {
        _matched=true;
        String _name = ((Value) initialElement).getName();
        String _plus = ("Value." + _name);
        String _plus_1 = (_plus + "()");
        result = _plus_1;
      }
    }
    EList<CompositionFunctionBodyPureFactor> _functionChain = cfbp.getFunctionChain();
    for (final CompositionFunctionBodyPureFactor f : _functionChain) {
      PureFunctionDefinition _functionDefinitionFromPureFactor = UtilitiesFunctions.getFunctionDefinitionFromPureFactor(f);
      String _compileCall = this.compileCall(_functionDefinitionFromPureFactor, result, outsideCalls);
      result = _compileCall;
    }
    return result;
  }
  
  public String compileCall(final PureFunctionDefinition pf, final String args, final boolean outsideCalls) {
    String _name = pf.getName();
    boolean _equals = Objects.equal(_name, null);
    if (_equals) {
      return this.compilePrimitiveCall(pf, args, outsideCalls);
    }
    if ((!outsideCalls)) {
      String _name_1 = pf.getName();
      String _plus = (_name_1 + "(");
      String _plus_1 = (_plus + args);
      return (_plus_1 + ")");
    } else {
      String _name_2 = pf.getName();
      String _plus_2 = ("PureFunctionDefinitions." + _name_2);
      String _plus_3 = (_plus_2 + "(");
      String _plus_4 = (_plus_3 + args);
      return (_plus_4 + ")");
    }
  }
  
  public String compilePrimitiveCall(final PureFunctionDefinition purePrimitive, final String argName, final boolean outsideCalls) {
    boolean _matched = false;
    if (purePrimitive instanceof IntToString) {
      _matched=true;
      final PureFunctionDefinition f = FPMLFactory.eINSTANCE.createPureFunctionDefinition();
      f.setName("Integer.toString");
      return this.compileCall(f, argName, outsideCalls);
    }
    if (!_matched) {
      if (purePrimitive instanceof IntPow) {
        _matched=true;
        final PureFunctionDefinition f = FPMLFactory.eINSTANCE.createPureFunctionDefinition();
        f.setName("(int) Math.pow");
        return this.compileCall(f, (argName + ", 2"), outsideCalls);
      }
    }
    return null;
  }
}
