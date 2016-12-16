package it.unibo.generator;

import com.google.common.base.Objects;
import it.unibo.fPML.AdditionalPureArgument;
import it.unibo.fPML.ApplyF;
import it.unibo.fPML.ApplyFFactor;
import it.unibo.fPML.Argument;
import it.unibo.fPML.BoolToString;
import it.unibo.fPML.BooleanType;
import it.unibo.fPML.CompositionFunctionBodyPure;
import it.unibo.fPML.CompositionFunctionBodyPureFactor;
import it.unibo.fPML.DataType;
import it.unibo.fPML.DataValue;
import it.unibo.fPML.EmptyFunctionBody;
import it.unibo.fPML.Equals;
import it.unibo.fPML.Expression;
import it.unibo.fPML.ExtractPure;
import it.unibo.fPML.FunctionBodyPure;
import it.unibo.fPML.IntPow;
import it.unibo.fPML.IntToString;
import it.unibo.fPML.IntegerType;
import it.unibo.fPML.IsLeftPure;
import it.unibo.fPML.IsRightPure;
import it.unibo.fPML.LeftAlgebraic;
import it.unibo.fPML.LogicAnd;
import it.unibo.fPML.LogicNot;
import it.unibo.fPML.LogicOr;
import it.unibo.fPML.Major;
import it.unibo.fPML.MajorEquals;
import it.unibo.fPML.Minor;
import it.unibo.fPML.MinorEquals;
import it.unibo.fPML.Minus;
import it.unibo.fPML.Mod;
import it.unibo.fPML.Plus;
import it.unibo.fPML.PrimitivePureFunction;
import it.unibo.fPML.PureAlgebraicType;
import it.unibo.fPML.PureArgument;
import it.unibo.fPML.PureData;
import it.unibo.fPML.PureEitherIf;
import it.unibo.fPML.PureExpressionAndPureFunctionReference;
import it.unibo.fPML.PureFunction;
import it.unibo.fPML.PureFunctionDefinition;
import it.unibo.fPML.PureFunctionType;
import it.unibo.fPML.PureIf;
import it.unibo.fPML.PureIfBody;
import it.unibo.fPML.PureLambda;
import it.unibo.fPML.PureProdValue;
import it.unibo.fPML.PureReturn;
import it.unibo.fPML.PureSumValue;
import it.unibo.fPML.PureValue;
import it.unibo.fPML.PureValueRef;
import it.unibo.fPML.RightAlgebraic;
import it.unibo.fPML.StringType;
import it.unibo.fPML.Times;
import it.unibo.fPML.Type;
import it.unibo.fPML.UnitType;
import it.unibo.fPML.ValueType;
import it.unibo.generator.TypeGenerator;
import it.unibo.validation.utilitiesFunctions.GetReturnType;
import it.unibo.validation.utilitiesFunctions.Others;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class ValuePureFunctionCommonGenerator {
  private TypeGenerator typeGenerator = new TypeGenerator();
  
  public String compile(final Expression e, final boolean functionTypeExec) {
    String _switchResult = null;
    boolean _matched = false;
    if (e instanceof IntegerType) {
      _matched=true;
      StringConcatenation _builder = new StringConcatenation();
      int _value = ((IntegerType)e).getValue();
      _builder.append(_value, "");
      _switchResult = _builder.toString();
    }
    if (!_matched) {
      if (e instanceof UnitType) {
        _matched=true;
        _switchResult = "Unit.unit()";
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
        _switchResult = _builder.toString();
      }
    }
    if (!_matched) {
      if (e instanceof BooleanType) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        boolean _isValue = ((BooleanType)e).isValue();
        _builder.append(_isValue, "");
        _switchResult = _builder.toString();
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
        PureExpressionAndPureFunctionReference _value = ((DataValue) e).getValue();
        PureData _type = ((DataValue) e).getType();
        ValueType _content = _type.getContent();
        String _compileAdtValue = this.compileAdtValue(_value, _content, functionTypeExec);
        _builder.append(_compileAdtValue, "");
        _builder.append(")");
        _switchResult = _builder.toString();
      }
    }
    if (!_matched) {
      if (e instanceof PureFunctionType) {
        _matched=true;
        return this.compile(((PureFunctionType)e), functionTypeExec);
      }
    }
    if (!_matched) {
      if (e instanceof PureSumValue) {
        _matched=true;
        ValueType _pureAdtElement1 = ((PureSumValue)e).getPureAdtElement1();
        boolean _notEquals = (!Objects.equal(_pureAdtElement1, null));
        if (_notEquals) {
          PureExpressionAndPureFunctionReference _sumAdtElement1 = ((PureSumValue)e).getSumAdtElement1();
          final PureFunction sumElement1 = Others.getInnerElementFromPureExpressionAndPureFunctionReference(_sumAdtElement1);
          String sumElement1Type = null;
          if ((sumElement1 instanceof Expression)) {
            String _compile = this.compile(((Expression) sumElement1), functionTypeExec);
            sumElement1Type = _compile;
          } else {
            String _compilePureFunctionRef = this.compilePureFunctionRef(((PureFunction) sumElement1));
            sumElement1Type = _compilePureFunctionRef;
          }
          StringConcatenation _builder = new StringConcatenation();
          _builder.append("Either.left(");
          _builder.append(sumElement1Type, "");
          _builder.append(")");
          return _builder.toString();
        } else {
          PureExpressionAndPureFunctionReference _sumAdtElement2 = ((PureSumValue)e).getSumAdtElement2();
          final PureFunction sumElement2 = Others.getInnerElementFromPureExpressionAndPureFunctionReference(_sumAdtElement2);
          String sumElement2Type = null;
          if ((sumElement2 instanceof Expression)) {
            String _compile_1 = this.compile(((Expression) sumElement2), functionTypeExec);
            sumElement2Type = _compile_1;
          } else {
            String _compilePureFunctionRef_1 = this.compilePureFunctionRef(((PureFunction) sumElement2));
            sumElement2Type = _compilePureFunctionRef_1;
          }
          StringConcatenation _builder_1 = new StringConcatenation();
          _builder_1.append("Either.right(");
          _builder_1.append(sumElement2Type, "");
          _builder_1.append(")");
          return _builder_1.toString();
        }
      }
    }
    if (!_matched) {
      if (e instanceof PureValueRef) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("PureValue.");
        PureValue _value = ((PureValueRef)e).getValue();
        String _name = _value.getName();
        _builder.append(_name, "");
        _builder.append("()");
        _switchResult = _builder.toString();
      }
    }
    if (!_matched) {
      if (e instanceof PureProdValue) {
        _matched=true;
        String _xblockexpression = null;
        {
          PureExpressionAndPureFunctionReference _prodAdtElement1 = ((PureProdValue)e).getProdAdtElement1();
          final PureFunction prodElement1 = Others.getInnerElementFromPureExpressionAndPureFunctionReference(_prodAdtElement1);
          PureExpressionAndPureFunctionReference _prodAdtElement2 = ((PureProdValue)e).getProdAdtElement2();
          final PureFunction prodElement2 = Others.getInnerElementFromPureExpressionAndPureFunctionReference(_prodAdtElement2);
          String prodElement1Type = null;
          String prodElement2Type = null;
          if ((prodElement1 instanceof Expression)) {
            String _compile = this.compile(((Expression) prodElement1), functionTypeExec);
            prodElement1Type = _compile;
          } else {
            String _compilePureFunctionRef = this.compilePureFunctionRef(((PureFunction) prodElement1));
            prodElement1Type = _compilePureFunctionRef;
          }
          if ((prodElement2 instanceof Expression)) {
            String _compile_1 = this.compile(((Expression) prodElement2), functionTypeExec);
            prodElement2Type = _compile_1;
          } else {
            String _compilePureFunctionRef_1 = this.compilePureFunctionRef(((PureFunction) prodElement2));
            prodElement2Type = _compilePureFunctionRef_1;
          }
          StringConcatenation _builder = new StringConcatenation();
          _builder.append("P.p(");
          _builder.append(prodElement1Type, "");
          _builder.append(", ");
          _builder.append(prodElement2Type, "");
          _builder.append(")");
          _xblockexpression = _builder.toString();
        }
        _switchResult = _xblockexpression;
      }
    }
    return _switchResult;
  }
  
  public String compileAdtValue(final PureExpressionAndPureFunctionReference vr, final Type d, final boolean functionTypeExec) {
    String _xblockexpression = null;
    {
      final PureFunction v = Others.getInnerElementFromPureExpressionAndPureFunctionReference(vr);
      String _switchResult = null;
      boolean _matched = false;
      if (v instanceof IntegerType) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        int _value = ((IntegerType)v).getValue();
        _builder.append(_value, "");
        return _builder.toString();
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
        if (v instanceof BooleanType) {
          _matched=true;
          StringConcatenation _builder = new StringConcatenation();
          boolean _isValue = ((BooleanType)v).isValue();
          _builder.append(_isValue, "");
          return _builder.toString();
        }
      }
      if (!_matched) {
        if (v instanceof UnitType) {
          _matched=true;
          StringConcatenation _builder = new StringConcatenation();
          _builder.append("Unit.unit()");
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
          PureExpressionAndPureFunctionReference _value = ((DataValue) v).getValue();
          PureData _type = ((DataValue) v).getType();
          ValueType _content = _type.getContent();
          String _compileAdtValue = this.compileAdtValue(_value, _content, functionTypeExec);
          _builder.append(_compileAdtValue, "");
          _builder.append(")");
          return _builder.toString();
        }
      }
      if (!_matched) {
        if (v instanceof PureSumValue) {
          _matched=true;
          PureExpressionAndPureFunctionReference _sumAdtElement1 = ((PureSumValue)v).getSumAdtElement1();
          boolean _equals = Objects.equal(_sumAdtElement1, null);
          if (_equals) {
            StringConcatenation _builder = new StringConcatenation();
            _builder.append("Either.right(");
            PureExpressionAndPureFunctionReference _sumAdtElement2 = ((PureSumValue)v).getSumAdtElement2();
            ValueType _element2ValueTypeFromPureAlgebraicType = Others.getElement2ValueTypeFromPureAlgebraicType(((PureAlgebraicType) d));
            String _compileAdtValue = this.compileAdtValue(_sumAdtElement2, _element2ValueTypeFromPureAlgebraicType, functionTypeExec);
            _builder.append(_compileAdtValue, "");
            _builder.append(")");
            return _builder.toString();
          }
          StringConcatenation _builder_1 = new StringConcatenation();
          _builder_1.append("Either.left(");
          PureExpressionAndPureFunctionReference _sumAdtElement1_1 = ((PureSumValue)v).getSumAdtElement1();
          ValueType _pureAdtElement1 = ((PureAlgebraicType) d).getPureAdtElement1();
          String _compileAdtValue_1 = this.compileAdtValue(_sumAdtElement1_1, _pureAdtElement1, functionTypeExec);
          _builder_1.append(_compileAdtValue_1, "");
          _builder_1.append(")");
          return _builder_1.toString();
        }
      }
      if (!_matched) {
        if (v instanceof PureProdValue) {
          _matched=true;
          StringConcatenation _builder = new StringConcatenation();
          _builder.append("P.p(");
          PureExpressionAndPureFunctionReference _prodAdtElement1 = ((PureProdValue)v).getProdAdtElement1();
          ValueType _pureAdtElement1 = ((PureAlgebraicType) d).getPureAdtElement1();
          String _compileAdtValue = this.compileAdtValue(_prodAdtElement1, _pureAdtElement1, functionTypeExec);
          _builder.append(_compileAdtValue, "");
          _builder.append(",");
          PureExpressionAndPureFunctionReference _prodAdtElement2 = ((PureProdValue)v).getProdAdtElement2();
          ValueType _element2ValueTypeFromPureAlgebraicType = Others.getElement2ValueTypeFromPureAlgebraicType(((PureAlgebraicType) d));
          String _compileAdtValue_1 = this.compileAdtValue(_prodAdtElement2, _element2ValueTypeFromPureAlgebraicType, functionTypeExec);
          _builder.append(_compileAdtValue_1, "");
          _builder.append(")");
          return _builder.toString();
        }
      }
      if (!_matched) {
        if (v instanceof PureValueRef) {
          _matched=true;
          PureValue _value = ((PureValueRef)v).getValue();
          if ((_value instanceof PureValue)) {
            StringConcatenation _builder = new StringConcatenation();
            _builder.append("PureValue.");
            PureValue _value_1 = ((PureValueRef)v).getValue();
            String _name = ((PureValue) _value_1).getName();
            _builder.append(_name, "");
            _builder.append("()");
            return _builder.toString();
          } else {
            StringConcatenation _builder_1 = new StringConcatenation();
            _builder_1.append("PureFunctionDefinitions::");
            PureValue _value_2 = ((PureValueRef)v).getValue();
            String _name_1 = ((PureFunctionDefinition) _value_2).getName();
            _builder_1.append(_name_1, "");
            return _builder_1.toString();
          }
        }
      }
      if (!_matched) {
        if (v instanceof PureFunctionType) {
          _matched=true;
          return this.compile(((PureFunctionType)v), functionTypeExec);
        }
      }
      if (!_matched) {
        if (v instanceof PureFunction) {
          _matched=true;
          _switchResult = this.compilePureFunctionRef(v);
        }
      }
      _xblockexpression = _switchResult;
    }
    return _xblockexpression;
  }
  
  public String compile(final PureFunctionType pft, final boolean call) {
    StringConcatenation _builder = new StringConcatenation();
    {
      if (((pft.getValue().getFunctionBody() instanceof CompositionFunctionBodyPure) && (!Objects.equal(pft.getValue().getArg(), null)))) {
        _builder.append("new ");
        PureFunctionDefinition _value = pft.getValue();
        ValueType _createTypeOfPureFunction = Others.createTypeOfPureFunction(_value);
        ValueType _returnType = ((PureFunctionType) _createTypeOfPureFunction).getReturnType();
        String _compile = this.typeGenerator.compile(_returnType);
        _builder.append(_compile, "");
        _builder.append("() {");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t");
        _builder.append("@Override");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("public ");
        PureFunctionDefinition _value_1 = pft.getValue();
        ValueType _createTypeOfPureFunction_1 = Others.createTypeOfPureFunction(_value_1);
        ValueType _returnType_1 = ((PureFunctionType) _createTypeOfPureFunction_1).getReturnType();
        ValueType _returnType_2 = ((PureFunctionType) _returnType_1).getReturnType();
        String _compile_1 = this.typeGenerator.compile(_returnType_2);
        _builder.append(_compile_1, "\t\t");
        _builder.append(" f() {");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t\t ");
        _builder.append("return (");
        PureFunctionDefinition _value_2 = pft.getValue();
        PureArgument _arg = _value_2.getArg();
        ValueType _type = _arg.getType();
        String _compile_2 = this.typeGenerator.compile(_type);
        _builder.append(_compile_2, "\t\t\t ");
        _builder.append(" ");
        PureFunctionDefinition _value_3 = pft.getValue();
        PureArgument _arg_1 = _value_3.getArg();
        String _name = _arg_1.getName();
        _builder.append(_name, "\t\t\t ");
        _builder.append(") -> ");
        PureFunctionDefinition _value_4 = pft.getValue();
        FunctionBodyPure _functionBody = _value_4.getFunctionBody();
        PureFunctionDefinition _value_5 = pft.getValue();
        PureArgument _arg_2 = _value_5.getArg();
        String _name_1 = _arg_2.getName();
        String _compile_3 = this.compile(_functionBody, _name_1, true);
        _builder.append(_compile_3, "\t\t\t ");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t");
        _builder.append("}");
        _builder.newLine();
        _builder.append("}");
        _builder.newLine();
      } else {
        PureFunctionDefinition _value_6 = pft.getValue();
        FunctionBodyPure _functionBody_1 = _value_6.getFunctionBody();
        if ((_functionBody_1 instanceof EmptyFunctionBody)) {
          _builder.append("new F<Object>() {");
          _builder.newLine();
          _builder.append("\t\t\t");
          _builder.append("@Override");
          _builder.newLine();
          _builder.append("\t\t\t");
          _builder.append("public Object f(Object ");
          PureFunctionDefinition _value_7 = pft.getValue();
          PureArgument _arg_3 = _value_7.getArg();
          String _name_2 = _arg_3.getName();
          _builder.append(_name_2, "\t\t\t");
          _builder.append(") {");
          _builder.newLineIfNotEmpty();
          _builder.append("\t\t\t\t");
          _builder.append("throw new UnsupportedOperationException(\"TODO\");");
          _builder.newLine();
          _builder.append("\t\t\t");
          _builder.append("}");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("}");
          {
            if (call) {
              _builder.append(".f()");
            }
          }
          _builder.newLineIfNotEmpty();
        } else {
          _builder.append("new ");
          PureFunctionDefinition _value_8 = pft.getValue();
          ValueType _createTypeOfPureFunction_2 = Others.createTypeOfPureFunction(_value_8);
          String _compile_4 = this.typeGenerator.compile(((PureFunctionType) _createTypeOfPureFunction_2));
          _builder.append(_compile_4, "");
          _builder.append("() {");
          _builder.newLineIfNotEmpty();
          _builder.append("\t\t");
          _builder.append("@Override");
          _builder.newLine();
          _builder.append("\t\t");
          _builder.append("public ");
          PureFunctionDefinition _value_9 = pft.getValue();
          ValueType _createTypeOfPureFunction_3 = Others.createTypeOfPureFunction(_value_9);
          ValueType _returnType_3 = ((PureFunctionType) _createTypeOfPureFunction_3).getReturnType();
          String _compile_5 = this.typeGenerator.compile(_returnType_3);
          _builder.append(_compile_5, "\t\t");
          _builder.append(" f() {");
          _builder.newLineIfNotEmpty();
          _builder.append("\t\t\t");
          _builder.append("return ");
          PureFunctionDefinition _value_10 = pft.getValue();
          FunctionBodyPure _functionBody_2 = _value_10.getFunctionBody();
          String _compile_6 = this.compile(_functionBody_2, "", true);
          _builder.append(_compile_6, "\t\t\t");
          _builder.append(";");
          _builder.newLineIfNotEmpty();
          _builder.append("\t\t");
          _builder.append("}");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("}");
          {
            if (call) {
              _builder.append(".f()");
            }
          }
          _builder.newLineIfNotEmpty();
        }
      }
    }
    return _builder.toString();
  }
  
  public String compile(final FunctionBodyPure pf, final String argName, final boolean outSideCall) {
    String _switchResult = null;
    boolean _matched = false;
    if (pf instanceof EmptyFunctionBody) {
      _matched=true;
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("null");
      _switchResult = _builder.toString();
    }
    if (!_matched) {
      if (pf instanceof CompositionFunctionBodyPure) {
        _matched=true;
        _switchResult = this.compileCompositionFunctionBodyPure(((CompositionFunctionBodyPure)pf), argName, outSideCall);
      }
    }
    return _switchResult;
  }
  
  public String compileCompositionFunctionBodyPure(final CompositionFunctionBodyPure cfbp, final String argName, final boolean outsideCalls) {
    String result = argName;
    final PureFunction initialElement = Others.getFirstFunctionDefinitionFromCompositionBodyPure(cfbp);
    boolean _matched = false;
    if (initialElement instanceof PureValue) {
      _matched=true;
      String _name = ((PureValue) initialElement).getName();
      String _plus = ("PureValue." + _name);
      String _plus_1 = (_plus + "()");
      result = _plus_1;
    }
    if (!_matched) {
      if (initialElement instanceof PureLambda) {
        _matched=true;
        PureArgument _arg = ((PureLambda)initialElement).getArg();
        CharSequence _compile = this.typeGenerator.compile(_arg);
        String _plus = ("(" + _compile);
        String _plus_1 = (_plus + ") -> return ");
        FunctionBodyPure _functionBody = ((PureLambda)initialElement).getFunctionBody();
        String _compile_1 = this.compile(_functionBody, argName, outsideCalls);
        String _plus_2 = (_plus_1 + _compile_1);
        String _plus_3 = (_plus_2 + ";");
        result = _plus_3;
      }
    }
    if (!_matched) {
      if (initialElement instanceof PrimitivePureFunction) {
        _matched=true;
        String _compilePrimitiveCall = this.compilePrimitiveCall(((PrimitivePureFunction)initialElement), argName, argName, outsideCalls);
        result = _compilePrimitiveCall;
      }
    }
    if (!_matched) {
      if (initialElement instanceof PureFunctionDefinition) {
        _matched=true;
        String _compileCall = this.compileCall(initialElement, argName, argName, outsideCalls, true);
        result = _compileCall;
      }
    }
    if (!_matched) {
      if (initialElement instanceof Expression) {
        _matched=true;
        String _compile = this.compile(((Expression)initialElement), true);
        result = _compile;
      }
    }
    if (!_matched) {
      if (initialElement instanceof Argument) {
        _matched=true;
        String _argumentName = Others.getArgumentName(((Argument)initialElement));
        result = _argumentName;
      }
    }
    EList<CompositionFunctionBodyPureFactor> _functionChain = cfbp.getFunctionChain();
    for (final CompositionFunctionBodyPureFactor f : _functionChain) {
      PureFunction _functionDefinitionFromPureFactor = Others.getFunctionDefinitionFromPureFactor(f);
      String _compileCall = this.compileCall(_functionDefinitionFromPureFactor, result, argName, outsideCalls, true);
      result = _compileCall;
    }
    return result;
  }
  
  public String compileCall(final PureFunction pf, final String acc, final String argName, final boolean outsideCalls, final boolean execFunction) {
    String _switchResult = null;
    boolean _matched = false;
    if (pf instanceof PureValue) {
      _matched=true;
      String _name = ((PureValue) pf).getName();
      String _plus = ("PureValue." + _name);
      return (_plus + "()");
    }
    if (!_matched) {
      if (pf instanceof PureLambda) {
        _matched=true;
        AdditionalPureArgument _higherOrderArg = ((PureLambda)pf).getHigherOrderArg();
        PureArgument _arg2 = _higherOrderArg.getArg2();
        CharSequence _compile = this.typeGenerator.compile(_arg2);
        String _plus = ("(" + _compile);
        String _plus_1 = (_plus + ") -> return ");
        FunctionBodyPure _functionBody = ((PureLambda)pf).getFunctionBody();
        String _compile_1 = this.compile(_functionBody, argName, outsideCalls);
        String _plus_2 = (_plus_1 + _compile_1);
        return (_plus_2 + ";");
      }
    }
    if (!_matched) {
      if (pf instanceof PrimitivePureFunction) {
        _matched=true;
        return this.compilePrimitiveCall(((PrimitivePureFunction)pf), acc, argName, outsideCalls);
      }
    }
    if (!_matched) {
      if (pf instanceof PureFunctionDefinition) {
        _matched=true;
        if ((!outsideCalls)) {
          String _name = ((PureFunctionDefinition)pf).getName();
          String _plus = (_name + "(");
          String _plus_1 = (_plus + acc);
          return (_plus_1 + ")");
        } else {
          String _name_1 = ((PureFunctionDefinition)pf).getName();
          String _plus_2 = ("PureFunctionDefinitions." + _name_1);
          String _plus_3 = (_plus_2 + "(");
          String _plus_4 = (_plus_3 + acc);
          return (_plus_4 + ")");
        }
      }
    }
    if (!_matched) {
      if (pf instanceof Expression) {
        _matched=true;
        _switchResult = this.compile(((Expression)pf), execFunction);
      }
    }
    return _switchResult;
  }
  
  public String compilePrimitiveCall(final PrimitivePureFunction purePrimitive, final String acc, final String argName, final boolean outsideCalls) {
    String _switchResult = null;
    boolean _matched = false;
    if (purePrimitive instanceof IntToString) {
      _matched=true;
      _switchResult = (("Primitives.intToString(" + acc) + ")");
    }
    if (!_matched) {
      if (purePrimitive instanceof BoolToString) {
        _matched=true;
        _switchResult = (("Primitives.boolToString(" + acc) + ")");
      }
    }
    if (!_matched) {
      if (purePrimitive instanceof IntPow) {
        _matched=true;
        _switchResult = (("Primitives.intPow(" + acc) + ")");
      }
    }
    if (!_matched) {
      if (purePrimitive instanceof Plus) {
        _matched=true;
        _switchResult = (("Primitives.plus(" + acc) + ")");
      }
    }
    if (!_matched) {
      if (purePrimitive instanceof Minus) {
        _matched=true;
        _switchResult = (("Primitives.minus(" + acc) + ")");
      }
    }
    if (!_matched) {
      if (purePrimitive instanceof Times) {
        _matched=true;
        _switchResult = (("Primitives.times(" + acc) + ")");
      }
    }
    if (!_matched) {
      if (purePrimitive instanceof Mod) {
        _matched=true;
        _switchResult = (("Primitives.mod(" + acc) + ")");
      }
    }
    if (!_matched) {
      if (purePrimitive instanceof LeftAlgebraic) {
        _matched=true;
        _switchResult = (("Primitives.leftAlgebraic(" + acc) + ")");
      }
    }
    if (!_matched) {
      if (purePrimitive instanceof RightAlgebraic) {
        _matched=true;
        _switchResult = (("Primitives.rightAlgebraic(" + acc) + ")");
      }
    }
    if (!_matched) {
      if (purePrimitive instanceof ApplyF) {
        _matched=true;
        ApplyFFactor _value = ((ApplyF)purePrimitive).getValue();
        String _compileApplyFFactor = this.compileApplyFFactor(_value, argName, outsideCalls);
        String _plus = ((acc + ".f(") + _compileApplyFFactor);
        _switchResult = (_plus + ")");
      }
    }
    if (!_matched) {
      if (purePrimitive instanceof Equals) {
        _matched=true;
        _switchResult = (("Primitives.equalsCurrying(" + acc) + ")");
      }
    }
    if (!_matched) {
      if (purePrimitive instanceof MinorEquals) {
        _matched=true;
        _switchResult = (("Primitives.minorEquals(" + acc) + ")");
      }
    }
    if (!_matched) {
      if (purePrimitive instanceof MajorEquals) {
        _matched=true;
        _switchResult = (("Primitives.majorEquals(" + acc) + ")");
      }
    }
    if (!_matched) {
      if (purePrimitive instanceof Minor) {
        _matched=true;
        _switchResult = (("Primitives.minor(" + acc) + ")");
      }
    }
    if (!_matched) {
      if (purePrimitive instanceof Major) {
        _matched=true;
        _switchResult = (("Primitives.major(" + acc) + ")");
      }
    }
    if (!_matched) {
      if (purePrimitive instanceof LogicAnd) {
        _matched=true;
        _switchResult = (("Primitives.logicAnd(" + acc) + ")");
      }
    }
    if (!_matched) {
      if (purePrimitive instanceof LogicOr) {
        _matched=true;
        _switchResult = (("Primitives.logicOr(" + acc) + ")");
      }
    }
    if (!_matched) {
      if (purePrimitive instanceof LogicNot) {
        _matched=true;
        _switchResult = (("Primitives.logicNot(" + acc) + ")");
      }
    }
    if (!_matched) {
      if (purePrimitive instanceof ExtractPure) {
        _matched=true;
        _switchResult = (acc + ".getValue()");
      }
    }
    if (!_matched) {
      if (purePrimitive instanceof IsLeftPure) {
        _matched=true;
        _switchResult = (("Primitives.isLeft(" + acc) + ")");
      }
    }
    if (!_matched) {
      if (purePrimitive instanceof IsRightPure) {
        _matched=true;
        _switchResult = (("Primitives.isRight(" + acc) + ")");
      }
    }
    if (!_matched) {
      if (purePrimitive instanceof PureReturn) {
        _matched=true;
        _switchResult = acc;
      }
    }
    if (!_matched) {
      if (purePrimitive instanceof PureIf) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("Primitives.<");
        PureIfBody _then = ((PureIf)purePrimitive).getThen();
        PureFunction _functionFromPureIfBody = Others.getFunctionFromPureIfBody(_then);
        ValueType _pureFunction = GetReturnType.pureFunction(_functionFromPureIfBody);
        String _compile = this.typeGenerator.compile(_pureFunction);
        _builder.append(_compile, "");
        _builder.append(">pureIf(");
        _builder.append(acc, "");
        _builder.append(" , ");
        PureIfBody _then_1 = ((PureIf)purePrimitive).getThen();
        PureFunction _functionFromPureIfBody_1 = Others.getFunctionFromPureIfBody(_then_1);
        String _compileCall = this.compileCall(_functionFromPureIfBody_1, acc, argName, outsideCalls, false);
        _builder.append(_compileCall, "");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t\t\t\t\t\t\t\t\t\t   ");
        _builder.append(", ");
        PureIfBody _else = ((PureIf)purePrimitive).getElse();
        PureFunction _functionFromPureIfBody_2 = Others.getFunctionFromPureIfBody(_else);
        String _compileCall_1 = this.compileCall(_functionFromPureIfBody_2, acc, argName, outsideCalls, false);
        _builder.append(_compileCall_1, "\t\t\t\t\t\t\t\t\t\t\t   ");
        _builder.append(")");
        _switchResult = _builder.toString();
      }
    }
    if (!_matched) {
      if (purePrimitive instanceof PureEitherIf) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("Primitives.pureIfEither(");
        _builder.append(acc, "");
        _builder.append(", ");
        PureIfBody _then = ((PureEitherIf)purePrimitive).getThen();
        PureFunction _functionFromPureIfBody = Others.getFunctionFromPureIfBody(_then);
        String _compileCall = this.compileCall(_functionFromPureIfBody, acc, argName, outsideCalls, false);
        _builder.append(_compileCall, "");
        _builder.append(" ");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t\t\t\t\t\t\t\t\t\t   \t\t\t");
        _builder.append(", ");
        PureIfBody _else = ((PureEitherIf)purePrimitive).getElse();
        PureFunction _functionFromPureIfBody_1 = Others.getFunctionFromPureIfBody(_else);
        String _compileCall_1 = this.compileCall(_functionFromPureIfBody_1, acc, argName, outsideCalls, false);
        _builder.append(_compileCall_1, "\t\t\t\t\t\t\t\t\t\t\t   \t\t\t");
        _builder.append(")");
        _switchResult = _builder.toString();
      }
    }
    return _switchResult;
  }
  
  public String compileApplyFFactor(final ApplyFFactor r, final String argName, final boolean outsideCalls) {
    String _xifexpression = null;
    PureFunction _valueReference = r.getValueReference();
    boolean _notEquals = (!Objects.equal(_valueReference, null));
    if (_notEquals) {
      PureFunction _valueReference_1 = r.getValueReference();
      return this.compilePureFunctionRef(_valueReference_1);
    } else {
      String _switchResult = null;
      Expression _valueExpression = r.getValueExpression();
      boolean _matched = false;
      if (_valueExpression instanceof UnitType) {
        _matched=true;
        _switchResult = "";
      }
      if (!_matched) {
        Expression _valueExpression_1 = r.getValueExpression();
        return this.compile(_valueExpression_1, true);
      }
      _xifexpression = _switchResult;
    }
    return _xifexpression;
  }
  
  public String compilePureFunctionRef(final PureFunction pf) {
    String _switchResult = null;
    boolean _matched = false;
    if (pf instanceof PureValue) {
      _matched=true;
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("PureValue.");
      String _name = ((PureValue)pf).getName();
      _builder.append(_name, "");
      _builder.append("()");
      _switchResult = _builder.toString();
    }
    if (!_matched) {
      if (pf instanceof PureFunctionDefinition) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("PureFunctionDefinitions::");
        String _name = ((PureFunctionDefinition)pf).getName();
        _builder.append(_name, "");
        _switchResult = _builder.toString();
      }
    }
    if (!_matched) {
      if (pf instanceof PureArgument) {
        _matched=true;
        _switchResult = ((PureArgument)pf).getName();
      }
    }
    if (!_matched) {
      if (pf instanceof Expression) {
        _matched=true;
        _switchResult = this.compile(((Expression)pf), true);
      }
    }
    return _switchResult;
  }
  
  public String compile(final PureIfBody pib) {
    String _xblockexpression = null;
    {
      final PureFunction content = Others.getFunctionFromPureIfBody(pib);
      String _switchResult = null;
      boolean _matched = false;
      if (content instanceof Expression) {
        _matched=true;
        _switchResult = this.compile(((Expression) content), false);
      }
      if (!_matched) {
        if (content instanceof PureFunction) {
          _matched=true;
          String _switchResult_1 = null;
          boolean _matched_1 = false;
          if (content instanceof PureValue) {
            _matched_1=true;
            _switchResult_1 = ((PureValue)content).getName();
          }
          if (!_matched_1) {
            if (content instanceof PureFunctionDefinition) {
              _matched_1=true;
              _switchResult_1 = this.compilePureFunctionRef(((PureFunctionDefinition) content));
            }
          }
          if (!_matched_1) {
            if (content instanceof PrimitivePureFunction) {
              _matched_1=true;
              _switchResult_1 = this.compilePureFunctionRef(((PrimitivePureFunction) content));
            }
          }
          if (!_matched_1) {
            if (content instanceof PureArgument) {
              _matched_1=true;
              _switchResult_1 = ((PureArgument)content).getName();
            }
          }
          _switchResult = _switchResult_1;
        }
      }
      _xblockexpression = _switchResult;
    }
    return _xblockexpression;
  }
}
