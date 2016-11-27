package it.unibo.generator;

import com.google.common.base.Objects;
import it.unibo.fPML.Argument;
import it.unibo.fPML.DataType;
import it.unibo.fPML.EffectFullAdtType;
import it.unibo.fPML.EffectFullArgument;
import it.unibo.fPML.EffectFullData;
import it.unibo.fPML.EffectFullDataType;
import it.unibo.fPML.EffectFullExpression;
import it.unibo.fPML.EffectFullFunctionDefinition;
import it.unibo.fPML.EffectFullFunctionType;
import it.unibo.fPML.EffectFullProdType;
import it.unibo.fPML.EffectFullSumType;
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
import it.unibo.validation.utilitiesFunctions.GetReturnType;
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
    CharSequence _switchResult = null;
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
    if (!_matched) {
      if (t instanceof EffectFullDataType) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        EffectFullData _type = ((EffectFullDataType)t).getType();
        String _name = _type.getName();
        _builder.append(_name, "");
        _switchResult = _builder;
      }
    }
    return _switchResult;
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
  
  public Object compile(final EffectFullSumType st) {
    EffectFullAdtType _adtElement = st.getAdtElement();
    return this.effectFullAdtTypeCompile(_adtElement);
  }
  
  public Object compile(final EffectFullProdType pt) {
    EffectFullAdtType _adtElement = pt.getAdtElement();
    return this.effectFullAdtTypeCompile(_adtElement);
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
  
  public CharSequence compileType(final EffectFullExpression e) {
    CharSequence _switchResult = null;
    boolean _matched = false;
    if (e instanceof Expression) {
      _matched=true;
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("IO<");
      String _compileType = this.compileType(((Expression)e));
      _builder.append(_compileType, "");
      _builder.append(">");
      _switchResult = _builder;
    }
    if (!_matched) {
      if (e instanceof UnitType) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("Unit");
        _switchResult = _builder;
      }
    }
    if (!_matched) {
      if (e instanceof EffectFullFunctionType) {
        _matched=true;
        if (((!Objects.equal(((EffectFullFunctionType)e).getArgType(), null)) && (!Objects.equal(((EffectFullFunctionType)e).getReturnType(), null)))) {
          StringConcatenation _builder = new StringConcatenation();
          _builder.append("F<");
          Type _argType = ((EffectFullFunctionType)e).getArgType();
          Object _compile = this.compile(_argType);
          _builder.append(_compile, "");
          _builder.append(", IO<");
          IOType _returnType = ((EffectFullFunctionType)e).getReturnType();
          Type _type = _returnType.getType();
          Object _compile_1 = this.compile(_type);
          _builder.append(_compile_1, "");
          _builder.append(">>");
          return _builder.toString();
        } else {
          IOType _returnType_1 = ((EffectFullFunctionType)e).getReturnType();
          boolean _notEquals = (!Objects.equal(_returnType_1, null));
          if (_notEquals) {
            StringConcatenation _builder_1 = new StringConcatenation();
            _builder_1.append("IO<");
            IOType _returnType_2 = ((EffectFullFunctionType)e).getReturnType();
            Type _type_1 = _returnType_2.getType();
            Object _compile_2 = this.compile(_type_1);
            _builder_1.append(_compile_2, "");
            _builder_1.append(">");
            return _builder_1.toString();
          } else {
            StringConcatenation _builder_2 = new StringConcatenation();
            _builder_2.append("IO<");
            EffectFullFunctionDefinition _value = ((EffectFullFunctionType)e).getValue();
            Type _function = GetReturnType.function(_value);
            Object _compile_3 = this.compile(_function);
            _builder_2.append(_compile_3, "");
            _builder_2.append(">");
            return _builder_2.toString();
          }
        }
      }
    }
    if (!_matched) {
      if (e instanceof EffectFullDataType) {
        _matched=true;
        EffectFullData _type = ((EffectFullDataType)e).getType();
        _switchResult = _type.getName();
      }
    }
    return _switchResult;
  }
  
  public CharSequence effectFullAdtTypeCompile(final EffectFullAdtType type) {
    CharSequence _switchResult = null;
    boolean _matched = false;
    if (type instanceof IOType) {
      _matched=true;
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("IO<");
      Type _type = ((IOType)type).getType();
      Object _compile = this.compile(_type);
      _builder.append(_compile, "");
      _builder.append(">");
      _switchResult = _builder;
    }
    if (!_matched) {
      EObject _effectFullAdtElement2 = type.getEffectFullAdtElement2();
      if ((_effectFullAdtElement2 instanceof EffectFullSumType)) {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("Either<");
        EffectFullAdtType _effectFullAdtElement1 = type.getEffectFullAdtElement1();
        Object _effectFullAdtTypeCompile = this.effectFullAdtTypeCompile(_effectFullAdtElement1);
        _builder.append(_effectFullAdtTypeCompile, "");
        _builder.append(", ");
        Object _xifexpression = null;
        EObject _effectFullAdtElement2_1 = type.getEffectFullAdtElement2();
        if ((_effectFullAdtElement2_1 instanceof EffectFullSumType)) {
          EObject _effectFullAdtElement2_2 = type.getEffectFullAdtElement2();
          _xifexpression = this.compile(((EffectFullSumType) _effectFullAdtElement2_2));
        } else {
          EObject _effectFullAdtElement2_3 = type.getEffectFullAdtElement2();
          _xifexpression = this.compile(((EffectFullProdType) _effectFullAdtElement2_3));
        }
        _builder.append(_xifexpression, "");
        _builder.append(">");
        return _builder.toString();
      } else {
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append("P2<");
        EffectFullAdtType _effectFullAdtElement1_1 = type.getEffectFullAdtElement1();
        Object _effectFullAdtTypeCompile_1 = this.effectFullAdtTypeCompile(_effectFullAdtElement1_1);
        _builder_1.append(_effectFullAdtTypeCompile_1, "");
        _builder_1.append(", ");
        Object _xifexpression_1 = null;
        EObject _effectFullAdtElement2_4 = type.getEffectFullAdtElement2();
        if ((_effectFullAdtElement2_4 instanceof EffectFullSumType)) {
          EObject _effectFullAdtElement2_5 = type.getEffectFullAdtElement2();
          _xifexpression_1 = this.compile(((EffectFullSumType) _effectFullAdtElement2_5));
        } else {
          EObject _effectFullAdtElement2_6 = type.getEffectFullAdtElement2();
          _xifexpression_1 = this.compile(((EffectFullProdType) _effectFullAdtElement2_6));
        }
        _builder_1.append(_xifexpression_1, "");
        _builder_1.append(">");
        return _builder_1.toString();
      }
    }
    return _switchResult;
  }
}
