package it.unibo.generator;

import it.unibo.fPML.AdtType;
import it.unibo.fPML.Argument;
import it.unibo.fPML.Data;
import it.unibo.fPML.DataType;
import it.unibo.fPML.EffectFullArgument;
import it.unibo.fPML.EffectFullFunctionType;
import it.unibo.fPML.Expression;
import it.unibo.fPML.IOType;
import it.unibo.fPML.IntegerType;
import it.unibo.fPML.ProdType;
import it.unibo.fPML.PureFunctionType;
import it.unibo.fPML.StringType;
import it.unibo.fPML.SumType;
import it.unibo.fPML.Type;
import it.unibo.fPML.UnitType;
import it.unibo.fPML.ValueType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class TypeGenerator {
  public Object compile(final ValueType vt) {
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
        return "Integer";
      }
    }
    if (!_matched) {
      if (vt instanceof StringType) {
        _matched=true;
        return ((StringType)vt).getType();
      }
    }
    if (!_matched) {
      if (vt instanceof PureFunctionType) {
        _matched=true;
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append("F<");
        ValueType _argType = ((PureFunctionType)vt).getArgType();
        Object _compile = this.compile(_argType);
        _builder_1.append(_compile, "");
        _builder_1.append(",");
        ValueType _returnType = ((PureFunctionType)vt).getReturnType();
        Object _compile_1 = this.compile(_returnType);
        _builder_1.append(_compile_1, "");
        _builder_1.append(">");
        return _builder_1.toString();
      }
    }
    return _builder;
  }
  
  public CharSequence compile(final Argument arg) {
    StringConcatenation _builder = new StringConcatenation();
    ValueType _type = arg.getType();
    Object _compile = this.compile(_type);
    _builder.append(_compile, "");
    _builder.append(" ");
    String _name = arg.getName();
    _builder.append(_name, "");
    return _builder;
  }
  
  public CharSequence compile(final EffectFullArgument arg) {
    StringConcatenation _builder = new StringConcatenation();
    Type _type = arg.getType();
    Object _compile = this.compile(_type);
    _builder.append(_compile, "");
    _builder.append(" ");
    String _name = arg.getName();
    _builder.append(_name, "");
    return _builder;
  }
  
  public Object compile(final Type t) {
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
        return this.compile(((ValueType)t));
      }
    }
    if (!_matched) {
      if (t instanceof EffectFullFunctionType) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("F<");
        Type _argType = ((EffectFullFunctionType)t).getArgType();
        Object _compile = this.compile(_argType);
        _builder.append(_compile, "");
        _builder.append(", IO<");
        IOType _returnType = ((EffectFullFunctionType)t).getReturnType();
        Type _type = _returnType.getType();
        Object _compile_1 = this.compile(_type);
        _builder.append(_compile_1, "");
        _builder.append(">>");
        return _builder.toString();
      }
    }
    return null;
  }
  
  public String compile(final IOType iot) {
    StringConcatenation _builder = new StringConcatenation();
    Type _type = iot.getType();
    Object _compile = this.compile(_type);
    _builder.append(_compile, "");
    return _builder.toString();
  }
  
  public Object adtTypeCompile(final AdtType adtType) {
    boolean _matched = false;
    if (adtType instanceof ValueType) {
      _matched=true;
      return this.compile(((ValueType) adtType));
    }
    EObject _adtElement2 = adtType.getAdtElement2();
    if ((_adtElement2 instanceof SumType)) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Either<");
      AdtType _adtElement1 = adtType.getAdtElement1();
      Object _adtTypeCompile = this.adtTypeCompile(_adtElement1);
      _builder.append(_adtTypeCompile, "");
      _builder.append(", ");
      Object _xifexpression = null;
      EObject _adtElement2_1 = adtType.getAdtElement2();
      if ((_adtElement2_1 instanceof SumType)) {
        EObject _adtElement2_2 = adtType.getAdtElement2();
        _xifexpression = this.compile(((SumType) _adtElement2_2));
      } else {
        EObject _adtElement2_3 = adtType.getAdtElement2();
        _xifexpression = this.compile(((ProdType) _adtElement2_3));
      }
      _builder.append(_xifexpression, "");
      _builder.append(">");
      return _builder.toString();
    } else {
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("P2<");
      AdtType _adtElement1_1 = adtType.getAdtElement1();
      Object _adtTypeCompile_1 = this.adtTypeCompile(_adtElement1_1);
      _builder_1.append(_adtTypeCompile_1, "");
      _builder_1.append(", ");
      Object _xifexpression_1 = null;
      EObject _adtElement2_4 = adtType.getAdtElement2();
      if ((_adtElement2_4 instanceof SumType)) {
        EObject _adtElement2_5 = adtType.getAdtElement2();
        _xifexpression_1 = this.compile(((SumType) _adtElement2_5));
      } else {
        EObject _adtElement2_6 = adtType.getAdtElement2();
        _xifexpression_1 = this.compile(((ProdType) _adtElement2_6));
      }
      _builder_1.append(_xifexpression_1, "");
      _builder_1.append(">");
      return _builder_1.toString();
    }
  }
  
  public Object compile(final SumType st) {
    AdtType _adtElement = st.getAdtElement();
    return this.adtTypeCompile(_adtElement);
  }
  
  public Object compile(final ProdType pt) {
    AdtType _adtElement = pt.getAdtElement();
    return this.adtTypeCompile(_adtElement);
  }
  
  public String compileType(final Expression e) {
    boolean _matched = false;
    if (e instanceof IntegerType) {
      _matched=true;
      return "int";
    }
    if (!_matched) {
      if (e instanceof UnitType) {
        _matched=true;
        return "IO<Unit>";
      }
    }
    if (!_matched) {
      if (e instanceof StringType) {
        _matched=true;
        return "String";
      }
    }
    if (!_matched) {
      if (e instanceof DataType) {
        _matched=true;
        Data _type = ((DataType)e).getType();
        return _type.getName();
      }
    }
    return null;
  }
}
