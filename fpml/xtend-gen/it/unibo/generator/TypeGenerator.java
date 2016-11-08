package it.unibo.generator;

import it.unibo.fPML.Adt;
import it.unibo.fPML.Argument;
import it.unibo.fPML.Data;
import it.unibo.fPML.DataType;
import it.unibo.fPML.EffectFullArgument;
import it.unibo.fPML.IOType;
import it.unibo.fPML.IntegerType;
import it.unibo.fPML.ProdType;
import it.unibo.fPML.StringType;
import it.unibo.fPML.SumType;
import it.unibo.fPML.Type;
import it.unibo.fPML.UnitType;
import it.unibo.fPML.ValueType;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.Functions.Function2;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;

@SuppressWarnings("all")
public class TypeGenerator {
  public String dataCompile(final ValueType vt) {
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
        _builder.append("Unit value = IOFunctions.unit;");
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
      return this.functionCompile(t);
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
      return this.functionCompile(t);
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
  
  public CharSequence compile(final Adt adt) {
    boolean _matched = false;
    if (adt instanceof Argument) {
      _matched=true;
      return this.compile(((Argument) adt));
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
  
  public CharSequence functionCompile(final ValueType vt) {
    StringConcatenation _builder = new StringConcatenation();
    boolean _matched = false;
    if (vt instanceof DataType) {
      _matched=true;
      Data _type = ((DataType)vt).getType();
      return _type.getName();
    }
    if (!_matched) {
      if (vt instanceof IntegerType) {
        _matched=true;
        return ((IntegerType)vt).getType();
      }
    }
    if (!_matched) {
      if (vt instanceof StringType) {
        _matched=true;
        return ((StringType)vt).getType();
      }
    }
    return _builder;
  }
  
  public CharSequence compile(final Argument arg) {
    StringConcatenation _builder = new StringConcatenation();
    ValueType _type = arg.getType();
    CharSequence _functionCompile = this.functionCompile(_type);
    _builder.append(_functionCompile, "");
    _builder.append(" ");
    String _name = arg.getName();
    _builder.append(_name, "");
    return _builder;
  }
  
  public CharSequence compile(final EffectFullArgument arg) {
    StringConcatenation _builder = new StringConcatenation();
    Type _type = arg.getType();
    CharSequence _compile = this.compile(_type);
    _builder.append(_compile, "");
    _builder.append(" ");
    String _name = arg.getName();
    _builder.append(_name, "");
    return _builder;
  }
  
  public CharSequence compile(final Type t) {
    boolean _matched = false;
    if (t instanceof UnitType) {
      _matched=true;
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Unit");
      return _builder.toString();
    }
    if (!_matched) {
      if (t instanceof ValueType) {
        _matched=true;
        return this.functionCompile(((ValueType)t));
      }
    }
    return null;
  }
  
  public String compile(final IOType iot) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("IO<");
    Type _type = iot.getType();
    CharSequence _compile = this.compile(_type);
    _builder.append(_compile, "");
    _builder.append(">");
    return _builder.toString();
  }
}
