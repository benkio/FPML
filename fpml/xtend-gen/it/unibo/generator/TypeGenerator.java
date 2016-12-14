package it.unibo.generator;

import it.unibo.fPML.BooleanType;
import it.unibo.fPML.DataType;
import it.unibo.fPML.EffectFullAlgebraicType;
import it.unibo.fPML.EffectFullArgument;
import it.unibo.fPML.EffectFullData;
import it.unibo.fPML.EffectFullDataType;
import it.unibo.fPML.EffectFullExpression;
import it.unibo.fPML.EffectFullFunctionType;
import it.unibo.fPML.EffectFullSumTypeFactor;
import it.unibo.fPML.EffectFullType;
import it.unibo.fPML.Expression;
import it.unibo.fPML.IOType;
import it.unibo.fPML.IntegerType;
import it.unibo.fPML.PureAlgebraicType;
import it.unibo.fPML.PureArgument;
import it.unibo.fPML.PureData;
import it.unibo.fPML.PureFunctionType;
import it.unibo.fPML.PureSumTypeFactor;
import it.unibo.fPML.StringType;
import it.unibo.fPML.Type;
import it.unibo.fPML.UnitType;
import it.unibo.fPML.ValueType;
import it.unibo.validation.utilitiesFunctions.Others;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class TypeGenerator {
  public Object compile(final ValueType vt) {
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
    if (!_matched) {
      if (vt instanceof PureAlgebraicType) {
        _matched=true;
        EObject _pureAdtElement2 = ((PureAlgebraicType) vt).getPureAdtElement2();
        if ((_pureAdtElement2 instanceof PureSumTypeFactor)) {
          StringConcatenation _builder_1 = new StringConcatenation();
          _builder_1.append("Either<");
          ValueType _pureAdtElement1 = ((PureAlgebraicType)vt).getPureAdtElement1();
          Object _compile = this.compile(_pureAdtElement1);
          _builder_1.append(_compile, "");
          _builder_1.append(", ");
          ValueType _element2ValueTypeFromPureAlgebraicType = Others.getElement2ValueTypeFromPureAlgebraicType(((PureAlgebraicType)vt));
          Object _compile_1 = this.compile(_element2ValueTypeFromPureAlgebraicType);
          _builder_1.append(_compile_1, "");
          _builder_1.append(">");
          return _builder_1.toString();
        } else {
          StringConcatenation _builder_2 = new StringConcatenation();
          _builder_2.append("P2<");
          ValueType _pureAdtElement1_1 = ((PureAlgebraicType)vt).getPureAdtElement1();
          Object _compile_2 = this.compile(_pureAdtElement1_1);
          _builder_2.append(_compile_2, "");
          _builder_2.append(", ");
          ValueType _element2ValueTypeFromPureAlgebraicType_1 = Others.getElement2ValueTypeFromPureAlgebraicType(((PureAlgebraicType)vt));
          Object _compile_3 = this.compile(_element2ValueTypeFromPureAlgebraicType_1);
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
    return _builder;
  }
  
  public CharSequence compile(final PureArgument arg) {
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
    EffectFullType _type = arg.getType();
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
    if (!_matched) {
      if (t instanceof EffectFullAlgebraicType) {
        _matched=true;
        EObject _effectFullAdtElement2 = ((EffectFullAlgebraicType)t).getEffectFullAdtElement2();
        if ((_effectFullAdtElement2 instanceof EffectFullSumTypeFactor)) {
          StringConcatenation _builder = new StringConcatenation();
          _builder.append("Either<");
          Type _effectFullAdtElement1 = ((EffectFullAlgebraicType)t).getEffectFullAdtElement1();
          Object _compile = this.compile(_effectFullAdtElement1);
          _builder.append(_compile, "");
          _builder.append(", ");
          Type _element2ValueTypeFromEffectFullAlgebraicType = Others.getElement2ValueTypeFromEffectFullAlgebraicType(((EffectFullAlgebraicType)t));
          Object _compile_1 = this.compile(_element2ValueTypeFromEffectFullAlgebraicType);
          _builder.append(_compile_1, "");
          _builder.append(">");
          return _builder.toString();
        } else {
          StringConcatenation _builder_1 = new StringConcatenation();
          _builder_1.append("P2<");
          Type _effectFullAdtElement1_1 = ((EffectFullAlgebraicType)t).getEffectFullAdtElement1();
          Object _compile_2 = this.compile(_effectFullAdtElement1_1);
          _builder_1.append(_compile_2, "");
          _builder_1.append(", ");
          Type _element2ValueTypeFromEffectFullAlgebraicType_1 = Others.getElement2ValueTypeFromEffectFullAlgebraicType(((EffectFullAlgebraicType)t));
          Object _compile_3 = this.compile(_element2ValueTypeFromEffectFullAlgebraicType_1);
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
        Object _compile = this.compile(_type);
        _builder.append(_compile, "");
        _builder.append(">");
        return _builder.toString();
      }
    }
    return _switchResult;
  }
  
  public Object compileType(final Expression e) {
    throw new Error("Unresolved compilation problems:"
      + "\nType mismatch: cannot convert from PureExpressionAndPureFunctionReference to Expression"
      + "\nType mismatch: cannot convert from PureExpressionAndPureFunctionReference to Expression"
      + "\nType mismatch: cannot convert from PureExpressionAndPureFunctionReference to Expression"
      + "\nType mismatch: cannot convert from PureExpressionAndPureFunctionReference to Expression");
  }
  
  public Object compileType(final EffectFullExpression e) {
    throw new Error("Unresolved compilation problems:"
      + "\nType mismatch: cannot convert from EffectFullExpressionAndEffectFullFunctionReference to Expression"
      + "\nType mismatch: cannot convert from EffectFullExpressionAndEffectFullFunctionReference to Expression"
      + "\nType mismatch: cannot convert from EffectFullExpressionAndEffectFullFunctionReference to Expression"
      + "\nType mismatch: cannot convert from EffectFullExpressionAndEffectFullFunctionReference to Expression");
  }
}
