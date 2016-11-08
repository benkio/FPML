package it.unibo.generator;

import it.unibo.fPML.Adt;
import it.unibo.fPML.Argument;
import it.unibo.fPML.Data;
import it.unibo.fPML.IntegerType;
import it.unibo.fPML.ProdType;
import it.unibo.fPML.StringType;
import it.unibo.fPML.SumType;
import it.unibo.fPML.UnitType;
import it.unibo.fPML.ValueType;
import it.unibo.generator.FPMLGenerator;
import it.unibo.generator.PureFunctionGenerator;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.Functions.Function2;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;

@SuppressWarnings("all")
public class DataGenerator {
  private final PureFunctionGenerator pureFunctionGenerator = new PureFunctionGenerator();
  
  public CharSequence compile(final Data d) {
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
    _builder.append("public class ");
    String _name = d.getName();
    _builder.append(_name, "");
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    {
      Adt _content = d.getContent();
      if ((_content instanceof ValueType)) {
        _builder.append("\t");
        _builder.append("public final ");
        Adt _content_1 = d.getContent();
        String _compile = this.compile(((ValueType) _content_1));
        _builder.append(_compile, "\t");
        _builder.newLineIfNotEmpty();
      } else {
        Adt _content_2 = d.getContent();
        if ((_content_2 instanceof Argument)) {
          _builder.append("\t");
          _builder.append("public final ");
          Adt _content_3 = d.getContent();
          CharSequence _compile_1 = this.compile(_content_3);
          _builder.append(_compile_1, "\t");
          _builder.append(";");
          _builder.newLineIfNotEmpty();
          _builder.append("\t");
          _builder.append("\t    \t");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("public ");
          String _name_1 = d.getName();
          _builder.append(_name_1, "\t");
          _builder.append("(");
          Adt _content_4 = d.getContent();
          CharSequence _compile_2 = this.compile(_content_4);
          _builder.append(_compile_2, "\t");
          _builder.append("){");
          _builder.newLineIfNotEmpty();
          _builder.append("\t");
          _builder.append("\t");
          _builder.append("this.");
          Adt _content_5 = d.getContent();
          String _name_2 = ((Argument) _content_5).getName();
          _builder.append(_name_2, "\t\t");
          _builder.append(" = ");
          Adt _content_6 = d.getContent();
          String _name_3 = ((Argument) _content_6).getName();
          _builder.append(_name_3, "\t\t");
          _builder.append(";");
          _builder.newLineIfNotEmpty();
          _builder.append("\t");
          _builder.append("}");
          _builder.newLine();
        } else {
          _builder.append("\t");
          _builder.append("public final ");
          Adt _content_7 = d.getContent();
          CharSequence _compile_3 = this.compile(_content_7);
          _builder.append(_compile_3, "\t");
          _builder.append(" value;");
          _builder.newLineIfNotEmpty();
          _builder.append("\t");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("public ");
          String _name_4 = d.getName();
          _builder.append(_name_4, "\t");
          _builder.append("(");
          Adt _content_8 = d.getContent();
          CharSequence _compile_4 = this.compile(_content_8);
          _builder.append(_compile_4, "\t");
          _builder.append(" value){");
          _builder.newLineIfNotEmpty();
          _builder.append("\t");
          _builder.append("\t");
          _builder.append("this.value = value;");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("}");
          _builder.newLine();
        }
      }
    }
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence compile(final Adt adt) {
    boolean _matched = false;
    if (adt instanceof Argument) {
      _matched=true;
      return this.pureFunctionGenerator.compile(((Argument) adt));
    }
    if (!_matched) {
      if (adt instanceof SumType) {
        _matched=true;
        return this.compile(((SumType) adt));
      }
    }
    if (!_matched) {
      if (adt instanceof ProdType) {
        _matched=true;
        return this.compile(((ProdType) adt));
      }
    }
    return null;
  }
  
  public String compile(final ValueType vt) {
    boolean _matched = false;
    if (vt instanceof IntegerType) {
      _matched=true;
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("int value = ");
      int _value = ((IntegerType) vt).getValue();
      _builder.append(_value, "");
      _builder.append(";");
      return _builder.toString();
    }
    if (!_matched) {
      if (vt instanceof StringType) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("String value = \"");
        String _value = ((StringType) vt).getValue();
        _builder.append(_value, "");
        _builder.append("\";");
        return _builder.toString();
      }
    }
    if (!_matched) {
      if (vt instanceof UnitType) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("Unit value;");
        return _builder.toString();
      }
    }
    return null;
  }
  
  public CharSequence compile(final SumType st) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Either<");
    EList<ValueType> _sumAdtElements = st.getSumAdtElements();
    final Function1<ValueType, CharSequence> _function = (ValueType t) -> {
      return this.pureFunctionGenerator.compile(t);
    };
    List<CharSequence> _map = ListExtensions.<ValueType, CharSequence>map(_sumAdtElements, _function);
    final Function2<CharSequence, CharSequence, CharSequence> _function_1 = (CharSequence p1, CharSequence p2) -> {
      String _plus = (p1 + ", ");
      return (_plus + p2);
    };
    CharSequence _reduce = IterableExtensions.<CharSequence>reduce(_map, _function_1);
    _builder.append(_reduce, "");
    _builder.append(">");
    return _builder;
  }
  
  public CharSequence compile(final ProdType pt) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("P2<");
    EList<ValueType> _prodAdtElements = pt.getProdAdtElements();
    final Function1<ValueType, CharSequence> _function = (ValueType t) -> {
      return this.pureFunctionGenerator.compile(t);
    };
    List<CharSequence> _map = ListExtensions.<ValueType, CharSequence>map(_prodAdtElements, _function);
    final Function2<CharSequence, CharSequence, CharSequence> _function_1 = (CharSequence p1, CharSequence p2) -> {
      String _plus = (p1 + ", ");
      return (_plus + p2);
    };
    CharSequence _reduce = IterableExtensions.<CharSequence>reduce(_map, _function_1);
    _builder.append(_reduce, "");
    _builder.append(">");
    return _builder;
  }
}
