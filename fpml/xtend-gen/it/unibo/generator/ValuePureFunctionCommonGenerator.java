package it.unibo.generator;

import com.google.common.base.Objects;
import it.unibo.fPML.AdditionalPureArgument;
import it.unibo.fPML.ApplyF;
import it.unibo.fPML.ApplyFFactor;
import it.unibo.fPML.Argument;
import it.unibo.fPML.CompositionFunctionBodyPure;
import it.unibo.fPML.CompositionFunctionBodyPureFactor;
import it.unibo.fPML.EmptyFunctionBody;
import it.unibo.fPML.Equals;
import it.unibo.fPML.Expression;
import it.unibo.fPML.ExtractPure;
import it.unibo.fPML.FunctionBodyPure;
import it.unibo.fPML.IntPow;
import it.unibo.fPML.IntToString;
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
import it.unibo.fPML.PureArgument;
import it.unibo.fPML.PureEitherIf;
import it.unibo.fPML.PureFunction;
import it.unibo.fPML.PureFunctionDefinition;
import it.unibo.fPML.PureFunctionType;
import it.unibo.fPML.PureIf;
import it.unibo.fPML.PureIfBody;
import it.unibo.fPML.PureLambda;
import it.unibo.fPML.PureValue;
import it.unibo.fPML.RightAlgebraic;
import it.unibo.fPML.Times;
import it.unibo.fPML.Type;
import it.unibo.fPML.ValueType;
import it.unibo.generator.TypeGenerator;
import it.unibo.validation.utilitiesFunctions.GetReturnType;
import it.unibo.validation.utilitiesFunctions.Others;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class ValuePureFunctionCommonGenerator {
  private TypeGenerator typeGenerator = new TypeGenerator();
  
  public String compile(final Expression e) {
    throw new Error("Unresolved compilation problems:"
      + "\nType mismatch: cannot convert from PureExpressionAndPureFunctionReference to Expression"
      + "\nType mismatch: cannot convert from PureExpressionAndPureFunctionReference to PureFunctionType"
      + "\nType mismatch: cannot convert from PureExpressionAndPureFunctionReference to PureFunctionType"
      + "\nType mismatch: cannot convert from PureExpressionAndPureFunctionReference to PureFunctionType"
      + "\nType mismatch: cannot convert from PureExpressionAndPureFunctionReference to PureFunctionType");
  }
  
  public Object compileAdtValue(final Expression v, final Type d) {
    throw new Error("Unresolved compilation problems:"
      + "\nType mismatch: cannot convert from PureExpressionAndPureFunctionReference to Expression"
      + "\nType mismatch: cannot convert from PureExpressionAndPureFunctionReference to Expression"
      + "\nType mismatch: cannot convert from PureExpressionAndPureFunctionReference to Expression"
      + "\nType mismatch: cannot convert from PureExpressionAndPureFunctionReference to Expression"
      + "\nType mismatch: cannot convert from PureExpressionAndPureFunctionReference to Expression");
  }
  
  public String compile(final PureFunctionType pft) {
    StringConcatenation _builder = new StringConcatenation();
    {
      if (((pft.getValue().getFunctionBody() instanceof CompositionFunctionBodyPure) && (!Objects.equal(pft.getValue().getArg(), null)))) {
        _builder.append("new F<");
        PureFunctionDefinition _value = pft.getValue();
        PureArgument _arg = _value.getArg();
        ValueType _type = _arg.getType();
        Object _compile = this.typeGenerator.compile(_type);
        _builder.append(_compile, "");
        _builder.append(",");
        PureFunctionDefinition _value_1 = pft.getValue();
        ValueType _pureFunctionDefinition = GetReturnType.pureFunctionDefinition(_value_1);
        Object _compile_1 = this.typeGenerator.compile(_pureFunctionDefinition);
        _builder.append(_compile_1, "");
        _builder.append(">() {");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t");
        _builder.append("@Override");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("public ");
        PureFunctionDefinition _value_2 = pft.getValue();
        ValueType _pureFunctionDefinition_1 = GetReturnType.pureFunctionDefinition(_value_2);
        Object _compile_2 = this.typeGenerator.compile(_pureFunctionDefinition_1);
        _builder.append(_compile_2, "\t\t");
        _builder.append(" f(");
        PureFunctionDefinition _value_3 = pft.getValue();
        PureArgument _arg_1 = _value_3.getArg();
        ValueType _type_1 = _arg_1.getType();
        Object _compile_3 = this.typeGenerator.compile(_type_1);
        _builder.append(_compile_3, "\t\t");
        _builder.append(" ");
        PureFunctionDefinition _value_4 = pft.getValue();
        PureArgument _arg_2 = _value_4.getArg();
        String _name = _arg_2.getName();
        _builder.append(_name, "\t\t");
        _builder.append(") {");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t\t ");
        _builder.append("return ");
        PureFunctionDefinition _value_5 = pft.getValue();
        FunctionBodyPure _functionBody = _value_5.getFunctionBody();
        PureFunctionDefinition _value_6 = pft.getValue();
        PureArgument _arg_3 = _value_6.getArg();
        String _name_1 = _arg_3.getName();
        String _compile_4 = this.compile(_functionBody, _name_1, true);
        _builder.append(_compile_4, "\t\t\t ");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t");
        _builder.append("}");
        _builder.newLine();
        _builder.append("}");
        _builder.newLine();
      } else {
        PureFunctionDefinition _value_7 = pft.getValue();
        FunctionBodyPure _functionBody_1 = _value_7.getFunctionBody();
        if ((_functionBody_1 instanceof EmptyFunctionBody)) {
          _builder.append("new F<() {");
          _builder.newLine();
          _builder.append("\t\t\t");
          _builder.append("@Override");
          _builder.newLine();
          _builder.append("\t\t\t");
          _builder.append("public Object f(Object ");
          PureFunctionDefinition _value_8 = pft.getValue();
          PureArgument _arg_4 = _value_8.getArg();
          String _name_2 = _arg_4.getName();
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
          _builder.newLine();
        } else {
          PureFunctionDefinition _value_9 = pft.getValue();
          FunctionBodyPure _functionBody_2 = _value_9.getFunctionBody();
          String _compile_5 = this.compile(_functionBody_2, "", true);
          _builder.append(_compile_5, "");
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
        String _compileCall = this.compileCall(initialElement, argName, argName, outsideCalls);
        result = _compileCall;
      }
    }
    if (!_matched) {
      if (initialElement instanceof Expression) {
        _matched=true;
        String _compile = this.compile(((Expression)initialElement));
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
      String _compileCall = this.compileCall(_functionDefinitionFromPureFactor, result, argName, outsideCalls);
      result = _compileCall;
    }
    return result;
  }
  
  public String compileCall(final PureFunction pf, final String acc, final String argName, final boolean outsideCalls) {
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
        _switchResult = this.compile(((Expression)pf));
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
      if (purePrimitive instanceof PureIf) {
        _matched=true;
        PureIfBody _then = ((PureIf)purePrimitive).getThen();
        PureFunction _functionFromPureIfBody = Others.getFunctionFromPureIfBody(_then);
        String _compileCall = this.compileCall(_functionFromPureIfBody, acc, argName, outsideCalls);
        String _plus = ((("Primitives.pureIf(" + acc) + ", ") + _compileCall);
        String _plus_1 = (_plus + ", ");
        PureIfBody _else = ((PureIf)purePrimitive).getElse();
        PureFunction _functionFromPureIfBody_1 = Others.getFunctionFromPureIfBody(_else);
        String _compileCall_1 = this.compileCall(_functionFromPureIfBody_1, acc, argName, outsideCalls);
        String _plus_2 = (_plus_1 + _compileCall_1);
        _switchResult = (_plus_2 + ")");
      }
    }
    if (!_matched) {
      if (purePrimitive instanceof PureEitherIf) {
        _matched=true;
        PureIfBody _then = ((PureEitherIf)purePrimitive).getThen();
        PureFunction _functionFromPureIfBody = Others.getFunctionFromPureIfBody(_then);
        String _compileCall = this.compileCall(_functionFromPureIfBody, acc, argName, outsideCalls);
        String _plus = ((("Primitives.pureIfEither(" + acc) + ", ") + _compileCall);
        String _plus_1 = (_plus + ", ");
        PureIfBody _else = ((PureEitherIf)purePrimitive).getElse();
        PureFunction _functionFromPureIfBody_1 = Others.getFunctionFromPureIfBody(_else);
        String _compileCall_1 = this.compileCall(_functionFromPureIfBody_1, acc, argName, outsideCalls);
        String _plus_2 = (_plus_1 + _compileCall_1);
        _switchResult = (_plus_2 + ")");
      }
    }
    return _switchResult;
  }
  
  public String compileApplyFFactor(final ApplyFFactor r, final String argName, final boolean outsideCalls) {
    PureFunction _valueReference = r.getValueReference();
    boolean _matched = false;
    if (_valueReference instanceof PureValue) {
      _matched=true;
      PureFunction _valueReference_1 = r.getValueReference();
      return this.compileCall(((PureValue) _valueReference_1), argName, argName, outsideCalls);
    }
    if (!_matched) {
      if (_valueReference instanceof Argument) {
        _matched=true;
        PureFunction _valueReference_1 = r.getValueReference();
        return Others.getArgumentName(((Argument) _valueReference_1));
      }
    }
    Expression _valueExpression = r.getValueExpression();
    return this.compile(_valueExpression);
  }
  
  public String compilePureFunctionRef(final PureFunction pf) {
    String _switchResult = null;
    boolean _matched = false;
    if (pf instanceof PureValue) {
      _matched=true;
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("PureValue::");
      String _name = ((PureValue)pf).getName();
      _builder.append(_name, "");
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
        _switchResult = this.compile(((Expression)pf));
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
        _switchResult = this.compile(((Expression) content));
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
