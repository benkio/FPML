package it.unibo.generator;

import com.google.common.base.Objects;
import it.unibo.fPML.AdtType;
import it.unibo.fPML.AdtValue;
import it.unibo.fPML.Data;
import it.unibo.fPML.DataType;
import it.unibo.fPML.DataValue;
import it.unibo.fPML.Expression;
import it.unibo.fPML.IntegerType;
import it.unibo.fPML.ProdType;
import it.unibo.fPML.ProdValue;
import it.unibo.fPML.StringType;
import it.unibo.fPML.SumType;
import it.unibo.fPML.SumValue;
import it.unibo.fPML.UnitType;
import it.unibo.fPML.Value;
import it.unibo.generator.DataGenerator;
import it.unibo.generator.FPMLGenerator;
import it.unibo.generator.TypeGenerator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class ValueGenerator {
  private final TypeGenerator typeGenerator = new TypeGenerator();
  
  private final DataGenerator dataGenerator = new DataGenerator();
  
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
    _builder.append("import fj.P;");
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
        _builder.append("(");
        AdtValue _value = ((DataValue) e).getValue();
        Data _type = ((DataValue) e).getType();
        AdtType _content = _type.getContent();
        Object _compileAdtValue = this.compileAdtValue(_value, _content);
        _builder.append(_compileAdtValue, "");
        _builder.append(")");
        return _builder.toString();
      }
    }
    return null;
  }
  
  public Object compileAdtValue(final AdtValue v, final AdtType d) {
    boolean _matched = false;
    if (v instanceof IntegerType) {
      _matched=true;
      return Integer.valueOf(((IntegerType)v).getValue());
    }
    if (!_matched) {
      if (v instanceof StringType) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("\"");
        String _value = ((StringType)v).getValue();
        _builder.append(_value, "");
        _builder.append("\"");
        return _builder.toString();
      }
    }
    if (!_matched) {
      if (v instanceof DataType) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("new ");
        String _compileType = this.typeGenerator.compileType(((Expression)v));
        _builder.append(_compileType, "");
        _builder.append("(");
        AdtValue _value = ((DataValue) v).getValue();
        Data _type = ((DataValue) v).getType();
        AdtType _content = _type.getContent();
        Object _compileAdtValue = this.compileAdtValue(_value, _content);
        _builder.append(_compileAdtValue, "");
        _builder.append(")");
        return _builder.toString();
      }
    }
    if (!_matched) {
      if (v instanceof SumValue) {
        _matched=true;
        AdtValue _sumAdtElement1 = ((SumValue)v).getSumAdtElement1();
        boolean _equals = Objects.equal(_sumAdtElement1, null);
        if (_equals) {
          StringConcatenation _builder = new StringConcatenation();
          _builder.append("Either.right(");
          AdtValue _sumAdtElement2 = ((SumValue)v).getSumAdtElement2();
          EObject _adtElement2 = d.getAdtElement2();
          AdtType _adtElement = ((SumType) _adtElement2).getAdtElement();
          Object _compileAdtValue = this.compileAdtValue(_sumAdtElement2, _adtElement);
          _builder.append(_compileAdtValue, "");
          _builder.append(")");
          return _builder.toString();
        }
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append("Either.left(");
        AdtValue _sumAdtElement1_1 = ((SumValue)v).getSumAdtElement1();
        AdtType _adtElement1 = ((AdtType) d).getAdtElement1();
        Object _compileAdtValue_1 = this.compileAdtValue(_sumAdtElement1_1, _adtElement1);
        _builder_1.append(_compileAdtValue_1, "");
        _builder_1.append(")");
        return _builder_1.toString();
      }
    }
    if (!_matched) {
      if (v instanceof ProdValue) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("P.p(");
        AdtValue _prodAdtElement1 = ((ProdValue)v).getProdAdtElement1();
        AdtType _adtElement1 = d.getAdtElement1();
        Object _compileAdtValue = this.compileAdtValue(_prodAdtElement1, _adtElement1);
        _builder.append(_compileAdtValue, "");
        _builder.append(",");
        AdtValue _prodAdtElement2 = ((ProdValue)v).getProdAdtElement2();
        EObject _adtElement2 = d.getAdtElement2();
        AdtType _adtElement = ((ProdType) _adtElement2).getAdtElement();
        Object _compileAdtValue_1 = this.compileAdtValue(_prodAdtElement2, _adtElement);
        _builder.append(_compileAdtValue_1, "");
        _builder.append(")");
        return _builder.toString();
      }
    }
    return null;
  }
}
