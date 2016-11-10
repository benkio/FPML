package it.unibo.generator;

import it.unibo.fPML.DataType;
import it.unibo.fPML.Expression;
import it.unibo.fPML.IntegerType;
import it.unibo.fPML.StringType;
import it.unibo.fPML.UnitType;
import it.unibo.fPML.Value;
import it.unibo.generator.FPMLGenerator;
import it.unibo.generator.TypeGenerator;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class ValueGenerator {
  private final TypeGenerator typeGenerator = new TypeGenerator();
  
  public CharSequence compile(final Iterable<Value> values) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    String _basePackageJava = FPMLGenerator.getBasePackageJava();
    _builder.append(_basePackageJava, "");
    _builder.append("Pure.Data;");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("import ");
    String _basePackageJava_1 = FPMLGenerator.getBasePackageJava();
    _builder.append(_basePackageJava_1, "");
    _builder.append("Pure.Data.*;");
    _builder.newLineIfNotEmpty();
    _builder.append("import fj.data.*;");
    _builder.newLine();
    _builder.append("import fj.P2;");
    _builder.newLine();
    _builder.append("import fj.Unit;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public class Value {");
    _builder.newLine();
    {
      for(final Value v : values) {
        _builder.append("\t");
        CharSequence _compile = this.compile(v);
        _builder.append(_compile, "\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence compile(final Value v) {
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
    Object _compile = this.compile(_value_1);
    _builder.append(_compile, "\t");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public Object compile(final Expression e) {
    boolean _matched = false;
    if (e instanceof IntegerType) {
      _matched=true;
      return Integer.valueOf(((IntegerType)e).getValue());
    }
    if (!_matched) {
      if (e instanceof UnitType) {
        _matched=true;
        return "IOFunctions.unit";
      }
    }
    if (!_matched) {
      if (e instanceof StringType) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("\"");
        String _value = ((StringType)e).getValue();
        _builder.append(_value, "");
        _builder.append("\"");
        return _builder.toString();
      }
    }
    if (!_matched) {
      if (e instanceof DataType) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("new ");
        String _compileType = this.typeGenerator.compileType(e);
        _builder.append(_compileType, "");
        _builder.append("()");
        return _builder.toString();
      }
    }
    return null;
  }
}
