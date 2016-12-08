package it.unibo.generator;

import it.unibo.fPML.EffectFullExpression;
import it.unibo.fPML.EffectFullValue;
import it.unibo.generator.FPMLGenerator;
import it.unibo.generator.TypeGenerator;
import it.unibo.generator.ValueEffectFullFunctionCommonGenerator;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class EffectFullValueGenerator {
  private final TypeGenerator typeGenerator = new TypeGenerator();
  
  private final ValueEffectFullFunctionCommonGenerator commonEffectFullFunctions = new ValueEffectFullFunctionCommonGenerator();
  
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
    String _compile = this.commonEffectFullFunctions.compile(_value_1);
    _builder.append(_compile, "\t");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
}
