package it.unibo.generator;

import it.unibo.fPML.Argument;
import it.unibo.fPML.DataType;
import it.unibo.fPML.EffectFullArgument;
import it.unibo.fPML.EffectFullFunctionType;
import it.unibo.fPML.Expression;
import it.unibo.fPML.IOType;
import it.unibo.fPML.IntegerType;
import it.unibo.fPML.PureAdtType;
import it.unibo.fPML.PureData;
import it.unibo.fPML.PureFunctionType;
import it.unibo.fPML.PureProdType;
import it.unibo.fPML.PureSumType;
import it.unibo.fPML.StringType;
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
      PureData _type = ((DataType)vt).getType();
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
  
  public Object pureAdtTypeCompile(final PureAdtType adtType) {
    boolean _matched = false;
    if (adtType instanceof ValueType) {
      _matched=true;
      return this.compile(((ValueType) adtType));
    }
    EObject _pureAdtElement2 = adtType.getPureAdtElement2();
    if ((_pureAdtElement2 instanceof PureSumType)) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Either<");
      PureAdtType _pureAdtElement1 = adtType.getPureAdtElement1();
      Object _pureAdtTypeCompile = this.pureAdtTypeCompile(_pureAdtElement1);
      _builder.append(_pureAdtTypeCompile, "");
      _builder.append(", ");
      Object _xifexpression = null;
      EObject _pureAdtElement2_1 = adtType.getPureAdtElement2();
      if ((_pureAdtElement2_1 instanceof PureSumType)) {
        EObject _pureAdtElement2_2 = adtType.getPureAdtElement2();
        _xifexpression = this.compile(((PureSumType) _pureAdtElement2_2));
      } else {
        EObject _pureAdtElement2_3 = adtType.getPureAdtElement2();
        _xifexpression = this.compile(((PureProdType) _pureAdtElement2_3));
      }
      _builder.append(_xifexpression, "");
      _builder.append(">");
      return _builder.toString();
    } else {
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("P2<");
      PureAdtType _pureAdtElement1_1 = adtType.getPureAdtElement1();
      Object _pureAdtTypeCompile_1 = this.pureAdtTypeCompile(_pureAdtElement1_1);
      _builder_1.append(_pureAdtTypeCompile_1, "");
      _builder_1.append(", ");
      Object _xifexpression_1 = null;
      EObject _pureAdtElement2_4 = adtType.getPureAdtElement2();
      if ((_pureAdtElement2_4 instanceof PureSumType)) {
        EObject _pureAdtElement2_5 = adtType.getPureAdtElement2();
        _xifexpression_1 = this.compile(((PureSumType) _pureAdtElement2_5));
      } else {
        EObject _pureAdtElement2_6 = adtType.getPureAdtElement2();
        _xifexpression_1 = this.compile(((PureProdType) _pureAdtElement2_6));
      }
      _builder_1.append(_xifexpression_1, "");
      _builder_1.append(">");
      return _builder_1.toString();
    }
  }
  
  public Object compile(final PureSumType st) {
    PureAdtType _adtElement = st.getAdtElement();
    return this.pureAdtTypeCompile(_adtElement);
  }
  
  public Object compile(final PureProdType pt) {
    PureAdtType _adtElement = pt.getAdtElement();
    return this.pureAdtTypeCompile(_adtElement);
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
        PureData _type = ((DataType)e).getType();
        return _type.getName();
      }
    }
    return null;
  }
}
