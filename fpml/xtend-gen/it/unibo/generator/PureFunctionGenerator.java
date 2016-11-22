package it.unibo.generator;

import com.google.common.base.Objects;
import it.unibo.fPML.Argument;
import it.unibo.fPML.CompositionFunctionBodyPure;
import it.unibo.fPML.EmptyFunctionBody;
import it.unibo.fPML.FunctionBodyPure;
import it.unibo.fPML.PureFunctionBlock;
import it.unibo.fPML.PureFunctionDefinition;
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
    throw new Error("Unresolved compilation problems:"
      + "\nType mismatch: cannot convert from PureFunction to PureFunctionDefinition"
      + "\nUnreachable code: The case can never match. It is already handled by a previous condition.");
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
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field valueRef is undefined for the type ApplyF"
      + "\nname cannot be resolved");
  }
}
