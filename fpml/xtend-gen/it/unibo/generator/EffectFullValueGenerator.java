package it.unibo.generator;

import com.google.common.base.Objects;
import it.unibo.fPML.CompositionFunctionBodyEffect;
import it.unibo.fPML.EffectFullArgument;
import it.unibo.fPML.EffectFullExpression;
import it.unibo.fPML.EffectFullFunctionDefinition;
import it.unibo.fPML.EffectFullFunctionType;
import it.unibo.fPML.EffectFullType;
import it.unibo.fPML.EffectFullValue;
import it.unibo.fPML.EmptyFunctionBody;
import it.unibo.fPML.FunctionBodyEffectFull;
import it.unibo.fPML.Type;
import it.unibo.generator.EffectFullFunctionGenerator;
import it.unibo.generator.FPMLGenerator;
import it.unibo.generator.TypeGenerator;
import it.unibo.generator.ValueGenerator;
import it.unibo.validation.utilitiesFunctions.GetReturnType;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class EffectFullValueGenerator {
  private final TypeGenerator typeGenerator = new TypeGenerator();
  
  private final EffectFullFunctionGenerator EffectFullFunctionGenerator = new EffectFullFunctionGenerator();
  
  private final ValueGenerator valueGenerator = new ValueGenerator();
  
  public CharSequence compile(final Iterable<EffectFullValue> values) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    String _basePackageJava = FPMLGenerator.basePackageJava();
    _builder.append(_basePackageJava, "");
    _builder.append("Effectfull.Data;");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("import ");
    String _basePackageJava_1 = FPMLGenerator.basePackageJava();
    _builder.append(_basePackageJava_1, "");
    _builder.append("Effectfull.Data.*;");
    _builder.newLineIfNotEmpty();
    _builder.append("import it.unibo.Pure.PureFunctionDefinitions;");
    _builder.newLine();
    _builder.append("import it.unibo.Pure.Data.PureValue;");
    _builder.newLine();
    _builder.append("import fj.data.*;");
    _builder.newLine();
    _builder.append("import fj.*;");
    _builder.newLine();
    _builder.append("import it.unibo.Effectfull.PrimitivesEffectFull;");
    _builder.newLine();
    _builder.append("import it.unibo.Effectfull.EffectFullFunctionDefinitions;");
    _builder.newLine();
    _builder.newLine();
    _builder.newLine();
    _builder.append("public class EffectFullValue {");
    _builder.newLine();
    {
      for(final EffectFullValue v : values) {
        _builder.append("\t");
        CharSequence _compile = this.compile(v);
        _builder.append(_compile, "\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("}");
    return _builder;
  }
  
  public CharSequence compile(final EffectFullValue v) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.newLine();
    _builder.append("public static ");
    EffectFullExpression _value = v.getValue();
    Object _compileType = this.typeGenerator.compileType(_value);
    _builder.append(_compileType, "");
    _builder.append(" ");
    String _name = v.getName();
    _builder.append(_name, "");
    _builder.append("() {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("return ");
    EffectFullExpression _value_1 = v.getValue();
    CharSequence _compile = this.compile(_value_1);
    _builder.append(_compile, "\t");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence compile(final EffectFullExpression e) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method compileAdtValue(EffectFullAdtValue, EffectFullType) from the type EffectFullValueGenerator refers to the missing type Object");
  }
  
  public Object compileAdtValue(final /* EffectFullAdtValue */Object v, final EffectFullType d) {
    throw new Error("Unresolved compilation problems:"
      + "\nEffectFullAdtValue cannot be resolved to a type."
      + "\nEffectFullAdtValue cannot be resolved to a type."
      + "\nThe method compileAdtValue(EffectFullAdtValue, EffectFullType) from the type EffectFullValueGenerator refers to the missing type Object"
      + "\nThe method compileAdtValue(EffectFullAdtValue, EffectFullType) from the type EffectFullValueGenerator refers to the missing type Object"
      + "\nThe method compileAdtValue(EffectFullAdtValue, EffectFullType) from the type EffectFullValueGenerator refers to the missing type Object"
      + "\nThe method compileAdtValue(EffectFullAdtValue, EffectFullType) from the type EffectFullValueGenerator refers to the missing type Object"
      + "\nUnreachable code: The case can never match. It is already handled by a previous condition."
      + "\nThe method compileAdtValue(EffectFullAdtValue, EffectFullType) from the type EffectFullValueGenerator refers to the missing type Object"
      + "\nsumAdtElement1 cannot be resolved"
      + "\n== cannot be resolved"
      + "\nsumAdtElement2 cannot be resolved"
      + "\nsumAdtElement1 cannot be resolved"
      + "\nprodAdtElement1 cannot be resolved"
      + "\nprodAdtElement2 cannot be resolved"
      + "\nvalue cannot be resolved"
      + "\nvalue cannot be resolved"
      + "\nvalue cannot be resolved"
      + "\ncompile cannot be resolved"
      + "\ncompile cannot be resolved"
      + "\ninnerValue cannot be resolved"
      + "\ninnerValue cannot be resolved"
      + "\ninnerValue cannot be resolved");
  }
  
  public CharSequence compile(final EffectFullFunctionType pft) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EffectFullFunctionDefinition _value = pft.getValue();
      FunctionBodyEffectFull _functionBody = _value.getFunctionBody();
      if ((_functionBody instanceof EmptyFunctionBody)) {
        _builder.append("new F<Object>() {");
        _builder.newLine();
        _builder.append("\t\t\t\t");
        _builder.append("@Override");
        _builder.newLine();
        _builder.append("\t\t\t\t");
        _builder.append("public Object f(Object ");
        EffectFullFunctionDefinition _value_1 = pft.getValue();
        EffectFullArgument _arg = _value_1.getArg();
        String _name = _arg.getName();
        _builder.append(_name, "\t\t\t\t");
        _builder.append(") {");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t\t\t\t");
        _builder.append("throw new UnsupportedOperationException(\"TODO\");");
        _builder.newLine();
        _builder.append("\t\t\t\t");
        _builder.append("}");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("}");
        _builder.newLine();
      } else {
        if (((pft.getValue().getFunctionBody() instanceof CompositionFunctionBodyEffect) && (!Objects.equal(pft.getValue().getArg(), null)))) {
          _builder.append("new F<");
          EffectFullFunctionDefinition _value_2 = pft.getValue();
          EffectFullArgument _arg_1 = _value_2.getArg();
          Type _type = _arg_1.getType();
          Object _compile = this.typeGenerator.compile(_type);
          _builder.append(_compile, "");
          _builder.append(",");
          EffectFullFunctionDefinition _value_3 = pft.getValue();
          Type _effectFullFunctionDefinition = GetReturnType.effectFullFunctionDefinition(_value_3);
          Object _compile_1 = this.typeGenerator.compile(_effectFullFunctionDefinition);
          _builder.append(_compile_1, "");
          _builder.append(">() {");
          _builder.newLineIfNotEmpty();
          _builder.append("\t\t\t");
          _builder.append("@Override");
          _builder.newLine();
          _builder.append("\t\t\t");
          _builder.append("public ");
          EffectFullFunctionDefinition _value_4 = pft.getValue();
          Type _effectFullFunctionDefinition_1 = GetReturnType.effectFullFunctionDefinition(_value_4);
          Object _compile_2 = this.typeGenerator.compile(_effectFullFunctionDefinition_1);
          _builder.append(_compile_2, "\t\t\t");
          _builder.append(" f(");
          EffectFullFunctionDefinition _value_5 = pft.getValue();
          EffectFullArgument _arg_2 = _value_5.getArg();
          Type _type_1 = _arg_2.getType();
          Object _compile_3 = this.typeGenerator.compile(_type_1);
          _builder.append(_compile_3, "\t\t\t");
          _builder.append(" ");
          EffectFullFunctionDefinition _value_6 = pft.getValue();
          EffectFullArgument _arg_3 = _value_6.getArg();
          String _name_1 = _arg_3.getName();
          _builder.append(_name_1, "\t\t\t");
          _builder.append(") {");
          _builder.newLineIfNotEmpty();
          _builder.append("\t\t\t\t");
          _builder.append("return ");
          EffectFullFunctionDefinition _value_7 = pft.getValue();
          FunctionBodyEffectFull _functionBody_1 = _value_7.getFunctionBody();
          EffectFullFunctionDefinition _value_8 = pft.getValue();
          EffectFullArgument _arg_4 = _value_8.getArg();
          String _compileIO = this.EffectFullFunctionGenerator.compileIO(((CompositionFunctionBodyEffect) _functionBody_1), _arg_4);
          _builder.append(_compileIO, "\t\t\t\t");
          _builder.append(";");
          _builder.newLineIfNotEmpty();
          _builder.append("\t\t\t");
          _builder.append("}");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("}");
          _builder.newLine();
        } else {
          if (((pft.getValue().getFunctionBody() instanceof CompositionFunctionBodyEffect) && Objects.equal(pft.getValue().getArg(), null))) {
            _builder.append("new F0<");
            EffectFullFunctionDefinition _value_9 = pft.getValue();
            Type _effectFullFunctionDefinition_2 = GetReturnType.effectFullFunctionDefinition(_value_9);
            Object _compile_4 = this.typeGenerator.compile(_effectFullFunctionDefinition_2);
            _builder.append(_compile_4, "");
            _builder.append(">() {");
            _builder.newLineIfNotEmpty();
            _builder.append("\t\t\t");
            _builder.append("@Override");
            _builder.newLine();
            _builder.append("\t\t\t");
            _builder.append("public ");
            EffectFullFunctionDefinition _value_10 = pft.getValue();
            Type _effectFullFunctionDefinition_3 = GetReturnType.effectFullFunctionDefinition(_value_10);
            Object _compile_5 = this.typeGenerator.compile(_effectFullFunctionDefinition_3);
            _builder.append(_compile_5, "\t\t\t");
            _builder.append(" f() {");
            _builder.newLineIfNotEmpty();
            _builder.append("\t\t\t\t");
            _builder.append("return ");
            EffectFullFunctionDefinition _value_11 = pft.getValue();
            FunctionBodyEffectFull _functionBody_2 = _value_11.getFunctionBody();
            String _compileIO_1 = this.EffectFullFunctionGenerator.compileIO(((CompositionFunctionBodyEffect) _functionBody_2), null);
            _builder.append(_compileIO_1, "\t\t\t\t");
            _builder.append(";");
            _builder.newLineIfNotEmpty();
            _builder.append("\t\t\t");
            _builder.append("}");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("}.f()");
            _builder.newLine();
          }
        }
      }
    }
    return _builder;
  }
}
