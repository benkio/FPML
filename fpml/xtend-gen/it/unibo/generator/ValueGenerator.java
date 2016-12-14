package it.unibo.generator;

import it.unibo.fPML.Expression;
import it.unibo.fPML.PureValue;
import it.unibo.generator.FPMLGenerator;
import it.unibo.generator.TypeGenerator;
import it.unibo.generator.ValuePureFunctionCommonGenerator;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class ValueGenerator {
  private final TypeGenerator typeGenerator = new TypeGenerator();
  
  private final ValuePureFunctionCommonGenerator commonFunctions = new ValuePureFunctionCommonGenerator();
  
  public CharSequence compile(final Iterable<PureValue> values) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    String _basePackageJava = FPMLGenerator.basePackageJava();
    _builder.append(_basePackageJava, "");
    _builder.append("Pure.Data;");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("import ");
    String _basePackageJava_1 = FPMLGenerator.basePackageJava();
    _builder.append(_basePackageJava_1, "");
    _builder.append("Pure.Data.*;");
    _builder.newLineIfNotEmpty();
    _builder.append("import fj.data.*;");
    _builder.newLine();
    _builder.append("import fj.*;");
    _builder.newLine();
    _builder.append("import it.unibo.Pure.Primitives;");
    _builder.newLine();
    _builder.append("import it.unibo.Pure.PureFunctionDefinitions;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public class PureValue{");
    _builder.newLine();
    {
      for(final PureValue v : values) {
        _builder.append("\t");
        CharSequence _compile = this.compile(v);
        _builder.append(_compile, "\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("}");
    return _builder;
  }
  
  public CharSequence compile(final PureValue v) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.newLine();
    _builder.append("public static ");
    Expression _value = v.getValue();
    String _compileType = this.typeGenerator.compileType(_value);
    _builder.append(_compileType, "");
    _builder.append(" ");
    String _name = v.getName();
    _builder.append(_name, "");
    _builder.append("() {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("return ");
    Expression _value_1 = v.getValue();
    String _compile = this.commonFunctions.compile(_value_1);
    _builder.append(_compile, "\t");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
}
