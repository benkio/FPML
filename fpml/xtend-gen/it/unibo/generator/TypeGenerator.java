package it.unibo.generator;

import com.google.common.base.Objects;
import it.unibo.fPML.BooleanType;
import it.unibo.fPML.DataType;
import it.unibo.fPML.EffectFullAlgebraicType;
import it.unibo.fPML.EffectFullArgument;
import it.unibo.fPML.EffectFullBodyContent;
import it.unibo.fPML.EffectFullData;
import it.unibo.fPML.EffectFullDataType;
import it.unibo.fPML.EffectFullExpression;
import it.unibo.fPML.EffectFullExpressionAndEffectFullFunctionReference;
import it.unibo.fPML.EffectFullFunction;
import it.unibo.fPML.EffectFullFunctionDefinition;
import it.unibo.fPML.EffectFullFunctionType;
import it.unibo.fPML.EffectFullProdValue;
import it.unibo.fPML.EffectFullSumTypeFactor;
import it.unibo.fPML.EffectFullSumValue;
import it.unibo.fPML.EffectFullType;
import it.unibo.fPML.EffectFullValue;
import it.unibo.fPML.EffectFullValueRef;
import it.unibo.fPML.Expression;
import it.unibo.fPML.IOEffectFullExpression;
import it.unibo.fPML.IOEffectFullFunction;
import it.unibo.fPML.IOExpression;
import it.unibo.fPML.IOPureFunction;
import it.unibo.fPML.IOType;
import it.unibo.fPML.IntegerType;
import it.unibo.fPML.PrimitiveEffectFullFunction;
import it.unibo.fPML.PrimitivePureFunction;
import it.unibo.fPML.PureAlgebraicType;
import it.unibo.fPML.PureArgument;
import it.unibo.fPML.PureData;
import it.unibo.fPML.PureExpressionAndPureFunctionReference;
import it.unibo.fPML.PureFunction;
import it.unibo.fPML.PureFunctionDefinition;
import it.unibo.fPML.PureFunctionType;
import it.unibo.fPML.PureProdValue;
import it.unibo.fPML.PureSumTypeFactor;
import it.unibo.fPML.PureSumValue;
import it.unibo.fPML.PureValue;
import it.unibo.fPML.PureValueRef;
import it.unibo.fPML.StringType;
import it.unibo.fPML.Type;
import it.unibo.fPML.UnitType;
import it.unibo.fPML.ValueType;
import it.unibo.validation.utilitiesFunctions.GetReturnType;
import it.unibo.validation.utilitiesFunctions.Others;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class TypeGenerator {
  public String compile(final ValueType vt) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _switchResult = null;
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
      if (vt instanceof BooleanType) {
        _matched=true;
        return "Boolean";
      }
    }
    if (!_matched) {
      if (vt instanceof PureFunctionType) {
        _matched=true;
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append("F<");
        ValueType _argType = ((PureFunctionType)vt).getArgType();
        String _compile = this.compile(_argType);
        _builder_1.append(_compile, "");
        _builder_1.append(",");
        ValueType _returnType = ((PureFunctionType)vt).getReturnType();
        String _compile_1 = this.compile(_returnType);
        _builder_1.append(_compile_1, "");
        _builder_1.append(">");
        return _builder_1.toString();
      }
    }
    if (!_matched) {
      if (vt instanceof PureAlgebraicType) {
        _matched=true;
        EObject _pureAdtElement2 = ((PureAlgebraicType) vt).getPureAdtElement2();
        if ((_pureAdtElement2 instanceof PureSumTypeFactor)) {
          StringConcatenation _builder_1 = new StringConcatenation();
          _builder_1.append("Either<");
          ValueType _pureAdtElement1 = ((PureAlgebraicType)vt).getPureAdtElement1();
          String _compile = this.compile(_pureAdtElement1);
          _builder_1.append(_compile, "");
          _builder_1.append(", ");
          ValueType _element2ValueTypeFromPureAlgebraicType = Others.getElement2ValueTypeFromPureAlgebraicType(((PureAlgebraicType)vt));
          String _compile_1 = this.compile(_element2ValueTypeFromPureAlgebraicType);
          _builder_1.append(_compile_1, "");
          _builder_1.append(">");
          return _builder_1.toString();
        } else {
          StringConcatenation _builder_2 = new StringConcatenation();
          _builder_2.append("P2<");
          ValueType _pureAdtElement1_1 = ((PureAlgebraicType)vt).getPureAdtElement1();
          String _compile_2 = this.compile(_pureAdtElement1_1);
          _builder_2.append(_compile_2, "");
          _builder_2.append(", ");
          ValueType _element2ValueTypeFromPureAlgebraicType_1 = Others.getElement2ValueTypeFromPureAlgebraicType(((PureAlgebraicType)vt));
          String _compile_3 = this.compile(_element2ValueTypeFromPureAlgebraicType_1);
          _builder_2.append(_compile_3, "");
          _builder_2.append(">");
          return _builder_2.toString();
        }
      }
    }
    if (!_matched) {
      if (vt instanceof UnitType) {
        _matched=true;
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append("Unit");
        _switchResult = _builder_1;
      }
    }
    _builder.append(_switchResult, "");
    return _builder.toString();
  }
  
  public CharSequence compile(final PureArgument arg) {
    StringConcatenation _builder = new StringConcatenation();
    ValueType _type = arg.getType();
    String _compile = this.compile(_type);
    _builder.append(_compile, "");
    _builder.append(" ");
    String _name = arg.getName();
    _builder.append(_name, "");
    return _builder;
  }
  
  public CharSequence compile(final EffectFullArgument arg) {
    StringConcatenation _builder = new StringConcatenation();
    EffectFullType _type = arg.getType();
    String _compile = this.compile(_type);
    _builder.append(_compile, "");
    _builder.append(" ");
    String _name = arg.getName();
    _builder.append(_name, "");
    return _builder;
  }
  
  public String compile(final Type t) {
    String _switchResult = null;
    boolean _matched = false;
    if (t instanceof ValueType) {
      _matched=true;
      return this.compile(((ValueType)t));
    }
    if (!_matched) {
      if (t instanceof EffectFullFunctionType) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("F<");
        Type _argType = ((EffectFullFunctionType)t).getArgType();
        String _compile = this.compile(_argType);
        _builder.append(_compile, "");
        _builder.append(", IO<");
        IOType _returnType = ((EffectFullFunctionType)t).getReturnType();
        Type _type = _returnType.getType();
        String _compile_1 = this.compile(_type);
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
        _switchResult = _builder.toString();
      }
    }
    if (!_matched) {
      if (t instanceof EffectFullAlgebraicType) {
        _matched=true;
        EObject _effectFullAdtElement2 = ((EffectFullAlgebraicType)t).getEffectFullAdtElement2();
        if ((_effectFullAdtElement2 instanceof EffectFullSumTypeFactor)) {
          StringConcatenation _builder = new StringConcatenation();
          _builder.append("Either<");
          Type _effectFullAdtElement1 = ((EffectFullAlgebraicType)t).getEffectFullAdtElement1();
          String _compile = this.compile(_effectFullAdtElement1);
          _builder.append(_compile, "");
          _builder.append(", ");
          Type _element2ValueTypeFromEffectFullAlgebraicType = Others.getElement2ValueTypeFromEffectFullAlgebraicType(((EffectFullAlgebraicType)t));
          String _compile_1 = this.compile(_element2ValueTypeFromEffectFullAlgebraicType);
          _builder.append(_compile_1, "");
          _builder.append(">");
          return _builder.toString();
        } else {
          StringConcatenation _builder_1 = new StringConcatenation();
          _builder_1.append("P2<");
          Type _effectFullAdtElement1_1 = ((EffectFullAlgebraicType)t).getEffectFullAdtElement1();
          String _compile_2 = this.compile(_effectFullAdtElement1_1);
          _builder_1.append(_compile_2, "");
          _builder_1.append(", ");
          Type _element2ValueTypeFromEffectFullAlgebraicType_1 = Others.getElement2ValueTypeFromEffectFullAlgebraicType(((EffectFullAlgebraicType)t));
          String _compile_3 = this.compile(_element2ValueTypeFromEffectFullAlgebraicType_1);
          _builder_1.append(_compile_3, "");
          _builder_1.append(">");
          return _builder_1.toString();
        }
      }
    }
    if (!_matched) {
      if (t instanceof IOType) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("IO<");
        Type _type = ((IOType)t).getType();
        String _compile = this.compile(_type);
        _builder.append(_compile, "");
        _builder.append(">");
        return _builder.toString();
      }
    }
    return _switchResult;
  }
  
  public String compileType(final Expression e) {
    boolean _matched = false;
    if (e instanceof IntegerType) {
      _matched=true;
      return "Integer";
    }
    if (!_matched) {
      if (e instanceof StringType) {
        _matched=true;
        return "String";
      }
    }
    if (!_matched) {
      if (e instanceof BooleanType) {
        _matched=true;
        return "Boolean";
      }
    }
    if (!_matched) {
      if (e instanceof DataType) {
        _matched=true;
        PureData _type = ((DataType)e).getType();
        return _type.getName();
      }
    }
    if (!_matched) {
      if (e instanceof PureFunctionType) {
        _matched=true;
        PureFunctionDefinition _value = ((PureFunctionType)e).getValue();
        PureArgument _arg = _value.getArg();
        boolean _notEquals = (!Objects.equal(_arg, null));
        if (_notEquals) {
          StringConcatenation _builder = new StringConcatenation();
          _builder.append("F<");
          PureFunctionDefinition _value_1 = ((PureFunctionType)e).getValue();
          PureArgument _arg_1 = _value_1.getArg();
          ValueType _type = _arg_1.getType();
          String _compile = this.compile(_type);
          _builder.append(_compile, "");
          _builder.append(", ");
          PureFunctionDefinition _value_2 = ((PureFunctionType)e).getValue();
          Type _function = GetReturnType.function(_value_2);
          String _compile_1 = this.compile(_function);
          _builder.append(_compile_1, "");
          _builder.append(">");
          return _builder.toString();
        } else {
          PureFunctionDefinition _value_3 = ((PureFunctionType)e).getValue();
          Type _function_1 = GetReturnType.function(_value_3);
          return this.compile(_function_1);
        }
      }
    }
    if (!_matched) {
      if (e instanceof PureValueRef) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        PureValue _value = ((PureValueRef)e).getValue();
        Expression _value_1 = _value.getValue();
        String _compileType = this.compileType(_value_1);
        _builder.append(_compileType, "");
        return _builder.toString();
      }
    }
    if (!_matched) {
      if (e instanceof PureSumValue) {
        _matched=true;
        PureExpressionAndPureFunctionReference _sumAdtElement1 = ((PureSumValue)e).getSumAdtElement1();
        boolean _notEquals = (!Objects.equal(_sumAdtElement1, null));
        if (_notEquals) {
          PureExpressionAndPureFunctionReference _sumAdtElement1_1 = ((PureSumValue)e).getSumAdtElement1();
          final PureFunction sumElement1 = Others.getInnerElementFromPureExpressionAndPureFunctionReference(_sumAdtElement1_1);
          String sumElement1Type = null;
          if ((sumElement1 instanceof Expression)) {
            String _compileType = this.compileType(((Expression) sumElement1));
            sumElement1Type = _compileType;
          } else {
            ValueType _createTypeOfPureFunction = Others.createTypeOfPureFunction(((PureFunction) sumElement1));
            String _compile = this.compile(_createTypeOfPureFunction);
            sumElement1Type = _compile;
          }
          StringConcatenation _builder = new StringConcatenation();
          _builder.append("Either<");
          _builder.append(sumElement1Type, "");
          _builder.append(", Unit>");
          return _builder.toString();
        } else {
          PureExpressionAndPureFunctionReference _sumAdtElement2 = ((PureSumValue)e).getSumAdtElement2();
          final PureFunction sumElement2 = Others.getInnerElementFromPureExpressionAndPureFunctionReference(_sumAdtElement2);
          String sumElement2Type = null;
          if ((sumElement2 instanceof Expression)) {
            String _compileType_1 = this.compileType(((Expression) sumElement2));
            sumElement2Type = _compileType_1;
          } else {
            ValueType _createTypeOfPureFunction_1 = Others.createTypeOfPureFunction(((PureFunction) sumElement2));
            String _compile_1 = this.compile(_createTypeOfPureFunction_1);
            sumElement2Type = _compile_1;
          }
          StringConcatenation _builder_1 = new StringConcatenation();
          _builder_1.append("Either<Unit, ");
          _builder_1.append(sumElement2Type, "");
          _builder_1.append(">");
          return _builder_1.toString();
        }
      }
    }
    if (!_matched) {
      if (e instanceof PureProdValue) {
        _matched=true;
        PureExpressionAndPureFunctionReference _prodAdtElement1 = ((PureProdValue)e).getProdAdtElement1();
        final PureFunction prodElement1 = Others.getInnerElementFromPureExpressionAndPureFunctionReference(_prodAdtElement1);
        PureExpressionAndPureFunctionReference _prodAdtElement2 = ((PureProdValue)e).getProdAdtElement2();
        final PureFunction prodElement2 = Others.getInnerElementFromPureExpressionAndPureFunctionReference(_prodAdtElement2);
        String prodElement1Type = null;
        String prodElement2Type = null;
        if ((prodElement1 instanceof Expression)) {
          String _compileType = this.compileType(((Expression) prodElement1));
          prodElement1Type = _compileType;
        } else {
          ValueType _createTypeOfPureFunction = Others.createTypeOfPureFunction(((PureFunction) prodElement1));
          String _compile = this.compile(_createTypeOfPureFunction);
          prodElement1Type = _compile;
        }
        if ((prodElement2 instanceof Expression)) {
          String _compileType_1 = this.compileType(((Expression) prodElement2));
          prodElement2Type = _compileType_1;
        } else {
          ValueType _createTypeOfPureFunction_1 = Others.createTypeOfPureFunction(((PureFunction) prodElement2));
          String _compile_1 = this.compile(_createTypeOfPureFunction_1);
          prodElement2Type = _compile_1;
        }
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("P2<");
        _builder.append(prodElement1Type, "");
        _builder.append(", ");
        _builder.append(prodElement2Type, "");
        _builder.append(">");
        return _builder.toString();
      }
    }
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Unit");
    return _builder.toString();
  }
  
  public String compileType(final EffectFullExpression e) {
    String _switchResult = null;
    boolean _matched = false;
    if (e instanceof IOExpression) {
      _matched=true;
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("IO<");
      Expression _innerValue = ((IOExpression)e).getInnerValue();
      String _compileType = this.compileType(((Expression) _innerValue));
      _builder.append(_compileType, "");
      _builder.append(">");
      _switchResult = _builder.toString();
    }
    if (!_matched) {
      if (e instanceof Expression) {
        _matched=true;
        _switchResult = this.compileType(((Expression) e));
      }
    }
    if (!_matched) {
      if (e instanceof EffectFullFunctionType) {
        _matched=true;
        if (((!Objects.equal(((EffectFullFunctionType)e).getArgType(), null)) && (!Objects.equal(((EffectFullFunctionType)e).getReturnType(), null)))) {
          StringConcatenation _builder = new StringConcatenation();
          _builder.append("F<");
          Type _argType = ((EffectFullFunctionType)e).getArgType();
          String _compile = this.compile(_argType);
          _builder.append(_compile, "");
          _builder.append(", IO<");
          IOType _returnType = ((EffectFullFunctionType)e).getReturnType();
          Type _type = _returnType.getType();
          String _compile_1 = this.compile(_type);
          _builder.append(_compile_1, "");
          _builder.append(">>");
          return _builder.toString();
        } else {
          IOType _returnType_1 = ((EffectFullFunctionType)e).getReturnType();
          boolean _notEquals = (!Objects.equal(_returnType_1, null));
          if (_notEquals) {
            StringConcatenation _builder_1 = new StringConcatenation();
            IOType _returnType_2 = ((EffectFullFunctionType)e).getReturnType();
            Type _type_1 = _returnType_2.getType();
            String _compile_2 = this.compile(_type_1);
            _builder_1.append(_compile_2, "");
            return _builder_1.toString();
          } else {
            StringConcatenation _builder_2 = new StringConcatenation();
            EffectFullFunctionDefinition _value = ((EffectFullFunctionType)e).getValue();
            Type _function = GetReturnType.function(_value);
            String _compile_3 = this.compile(_function);
            _builder_2.append(_compile_3, "");
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
    if (!_matched) {
      if (e instanceof IOEffectFullExpression) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("IO<");
        EffectFullExpression _innerValue = ((IOEffectFullExpression)e).getInnerValue();
        String _compileType = this.compileType(((EffectFullExpression) _innerValue));
        _builder.append(_compileType, "");
        _builder.append(">");
        _switchResult = _builder.toString();
      }
    }
    if (!_matched) {
      if (e instanceof IOPureFunction) {
        _matched=true;
        String _xifexpression = null;
        PureFunction _pureFunction = ((IOPureFunction)e).getPureFunction();
        boolean _equals = Objects.equal(_pureFunction, null);
        if (_equals) {
          StringConcatenation _builder = new StringConcatenation();
          _builder.append("IO<");
          PrimitivePureFunction _purePrimitive = ((IOPureFunction)e).getPurePrimitive();
          ValueType _createTypeOfPureFunction = Others.createTypeOfPureFunction(_purePrimitive);
          String _compile = this.compile(_createTypeOfPureFunction);
          _builder.append(_compile, "");
          _builder.append(">");
          _xifexpression = _builder.toString();
        } else {
          StringConcatenation _builder_1 = new StringConcatenation();
          _builder_1.append("IO<");
          PureFunction _pureFunction_1 = ((IOPureFunction)e).getPureFunction();
          ValueType _createTypeOfPureFunction_1 = Others.createTypeOfPureFunction(_pureFunction_1);
          _builder_1.append(_createTypeOfPureFunction_1, "");
          _builder_1.append(">");
          _xifexpression = _builder_1.toString();
        }
        _switchResult = _xifexpression;
      }
    }
    if (!_matched) {
      if (e instanceof IOEffectFullFunction) {
        _matched=true;
        String _xifexpression = null;
        EffectFullFunction _effectFullFunction = ((IOEffectFullFunction)e).getEffectFullFunction();
        boolean _equals = Objects.equal(_effectFullFunction, null);
        if (_equals) {
          StringConcatenation _builder = new StringConcatenation();
          _builder.append("IO<");
          PrimitiveEffectFullFunction _effectFullPrimitive = ((IOEffectFullFunction)e).getEffectFullPrimitive();
          Type _createTypeOfEffectFullFunction = Others.createTypeOfEffectFullFunction(_effectFullPrimitive);
          String _compile = this.compile(_createTypeOfEffectFullFunction);
          _builder.append(_compile, "");
          _builder.append(">");
          _xifexpression = _builder.toString();
        } else {
          StringConcatenation _builder_1 = new StringConcatenation();
          _builder_1.append("IO<");
          EffectFullFunction _effectFullFunction_1 = ((IOEffectFullFunction)e).getEffectFullFunction();
          Type _createTypeOfEffectFullFunction_1 = Others.createTypeOfEffectFullFunction(_effectFullFunction_1);
          String _compile_1 = this.compile(_createTypeOfEffectFullFunction_1);
          _builder_1.append(_compile_1, "");
          _builder_1.append(">");
          _xifexpression = _builder_1.toString();
        }
        _switchResult = _xifexpression;
      }
    }
    if (!_matched) {
      if (e instanceof EffectFullProdValue) {
        _matched=true;
        EffectFullExpressionAndEffectFullFunctionReference _prodAdtElement1 = ((EffectFullProdValue)e).getProdAdtElement1();
        final EffectFullBodyContent prodElement1 = Others.getInnerElementFromEffectFullExpressionAndEffectFullFunctionReference(_prodAdtElement1);
        EffectFullExpressionAndEffectFullFunctionReference _prodAdtElement2 = ((EffectFullProdValue)e).getProdAdtElement2();
        final EffectFullBodyContent prodElement2 = Others.getInnerElementFromEffectFullExpressionAndEffectFullFunctionReference(_prodAdtElement2);
        String prodElement1Type = null;
        String prodElement2Type = null;
        if ((prodElement1 instanceof Expression)) {
          String _compileType = this.compileType(((Expression) prodElement1));
          prodElement1Type = _compileType;
        } else {
          Type _createTypeOfEffectFullFunction = Others.createTypeOfEffectFullFunction(((EffectFullFunction) prodElement1));
          String _compile = this.compile(_createTypeOfEffectFullFunction);
          prodElement1Type = _compile;
        }
        if ((prodElement2 instanceof Expression)) {
          String _compileType_1 = this.compileType(((Expression) prodElement2));
          prodElement2Type = _compileType_1;
        } else {
          Type _createTypeOfEffectFullFunction_1 = Others.createTypeOfEffectFullFunction(((EffectFullFunction) prodElement2));
          String _compile_1 = this.compile(_createTypeOfEffectFullFunction_1);
          prodElement2Type = _compile_1;
        }
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("P2<");
        _builder.append(prodElement1Type, "");
        _builder.append(", ");
        _builder.append(prodElement2Type, "");
        _builder.append(">");
        return _builder.toString();
      }
    }
    if (!_matched) {
      if (e instanceof EffectFullSumValue) {
        _matched=true;
        EffectFullExpressionAndEffectFullFunctionReference _sumAdtElement1 = ((EffectFullSumValue)e).getSumAdtElement1();
        boolean _notEquals = (!Objects.equal(_sumAdtElement1, null));
        if (_notEquals) {
          EffectFullExpressionAndEffectFullFunctionReference _sumAdtElement1_1 = ((EffectFullSumValue)e).getSumAdtElement1();
          final EffectFullBodyContent sumElement1 = Others.getInnerElementFromEffectFullExpressionAndEffectFullFunctionReference(_sumAdtElement1_1);
          String sumElement1Type = null;
          if ((sumElement1 instanceof Expression)) {
            String _compileType = this.compileType(((Expression) sumElement1));
            sumElement1Type = _compileType;
          } else {
            Type _createTypeOfEffectFullFunction = Others.createTypeOfEffectFullFunction(((EffectFullFunction) sumElement1));
            String _compile = this.compile(_createTypeOfEffectFullFunction);
            sumElement1Type = _compile;
          }
          StringConcatenation _builder = new StringConcatenation();
          _builder.append("Either<");
          _builder.append(sumElement1Type, "");
          _builder.append(", Unit>");
          return _builder.toString();
        } else {
          EffectFullExpressionAndEffectFullFunctionReference _sumAdtElement2 = ((EffectFullSumValue)e).getSumAdtElement2();
          final EffectFullBodyContent sumElement2 = Others.getInnerElementFromEffectFullExpressionAndEffectFullFunctionReference(_sumAdtElement2);
          String sumElement2Type = null;
          if ((sumElement2 instanceof Expression)) {
            String _compileType_1 = this.compileType(((Expression) sumElement2));
            sumElement2Type = _compileType_1;
          } else {
            Type _createTypeOfEffectFullFunction_1 = Others.createTypeOfEffectFullFunction(((EffectFullFunction) sumElement2));
            String _compile_1 = this.compile(_createTypeOfEffectFullFunction_1);
            sumElement2Type = _compile_1;
          }
          StringConcatenation _builder_1 = new StringConcatenation();
          _builder_1.append("Either<Unit, ");
          _builder_1.append(sumElement2Type, "");
          _builder_1.append(">");
          return _builder_1.toString();
        }
      }
    }
    if (!_matched) {
      if (e instanceof EffectFullValueRef) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        EffectFullValue _value = ((EffectFullValueRef)e).getValue();
        EffectFullExpression _value_1 = _value.getValue();
        String _compileType = this.compileType(_value_1);
        _builder.append(_compileType, "");
        _switchResult = _builder.toString();
      }
    }
    return _switchResult;
  }
}
