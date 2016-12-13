package it.unibo.generator;

import com.google.common.base.Objects;
import it.unibo.fPML.ApplyF;
import it.unibo.fPML.ApplyFFactor;
import it.unibo.fPML.ApplyFIO;
import it.unibo.fPML.ApplyFIOFactor;
import it.unibo.fPML.Argument;
import it.unibo.fPML.CompositionFunctionBodyEffect;
import it.unibo.fPML.CompositionFunctionBodyEffectFullFactor;
import it.unibo.fPML.EffectFullAlgebraicType;
import it.unibo.fPML.EffectFullArgument;
import it.unibo.fPML.EffectFullBodyContent;
import it.unibo.fPML.EffectFullData;
import it.unibo.fPML.EffectFullDataValue;
import it.unibo.fPML.EffectFullEitherIf;
import it.unibo.fPML.EffectFullExpression;
import it.unibo.fPML.EffectFullFunction;
import it.unibo.fPML.EffectFullFunctionDefinition;
import it.unibo.fPML.EffectFullFunctionType;
import it.unibo.fPML.EffectFullIf;
import it.unibo.fPML.EffectFullIfBody;
import it.unibo.fPML.EffectFullPrimitive;
import it.unibo.fPML.EffectFullProdValue;
import it.unibo.fPML.EffectFullSumValue;
import it.unibo.fPML.EffectFullType;
import it.unibo.fPML.EffectFullValue;
import it.unibo.fPML.EffectFullValueRef;
import it.unibo.fPML.EmptyFunctionBody;
import it.unibo.fPML.Equals;
import it.unibo.fPML.Expression;
import it.unibo.fPML.ExtractEffectFull;
import it.unibo.fPML.ExtractPure;
import it.unibo.fPML.FunctionBodyEffectFull;
import it.unibo.fPML.IOEffectFullExpression;
import it.unibo.fPML.IOEffectFullFunction;
import it.unibo.fPML.IOExpression;
import it.unibo.fPML.IOPureFunction;
import it.unibo.fPML.IOType;
import it.unibo.fPML.IntPow;
import it.unibo.fPML.IntToString;
import it.unibo.fPML.IsLeftEffectFull;
import it.unibo.fPML.IsLeftPure;
import it.unibo.fPML.IsRightEffectFull;
import it.unibo.fPML.IsRightPure;
import it.unibo.fPML.LeftAlgebraic;
import it.unibo.fPML.LeftAlgebraicIO;
import it.unibo.fPML.LiftEffectFullFunction;
import it.unibo.fPML.LiftPureFunction;
import it.unibo.fPML.LogicAnd;
import it.unibo.fPML.LogicOr;
import it.unibo.fPML.Major;
import it.unibo.fPML.MajorEquals;
import it.unibo.fPML.Minor;
import it.unibo.fPML.MinorEquals;
import it.unibo.fPML.Minus;
import it.unibo.fPML.Mod;
import it.unibo.fPML.Plus;
import it.unibo.fPML.PrimitiveEffectFullFunction;
import it.unibo.fPML.PrimitiveEffectFullValue;
import it.unibo.fPML.PrimitivePrint;
import it.unibo.fPML.PrimitivePureFunction;
import it.unibo.fPML.PrimitiveRandom;
import it.unibo.fPML.PrimitiveReturn;
import it.unibo.fPML.PrimitiveTime;
import it.unibo.fPML.PureArgument;
import it.unibo.fPML.PureData;
import it.unibo.fPML.PureEitherIf;
import it.unibo.fPML.PureFunction;
import it.unibo.fPML.PureFunctionDefinition;
import it.unibo.fPML.PureIf;
import it.unibo.fPML.PureIfBody;
import it.unibo.fPML.PureValue;
import it.unibo.fPML.RightAlgebraic;
import it.unibo.fPML.RightAlgebraicIO;
import it.unibo.fPML.Times;
import it.unibo.fPML.Type;
import it.unibo.generator.TypeGenerator;
import it.unibo.generator.ValuePureFunctionCommonGenerator;
import it.unibo.validation.utilitiesFunctions.GetReturnType;
import it.unibo.validation.utilitiesFunctions.Others;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.StringExtensions;

@SuppressWarnings("all")
public class ValueEffectFullFunctionCommonGenerator {
  private final TypeGenerator typeGenerator = new TypeGenerator();
  
  private final ValuePureFunctionCommonGenerator commonFunctions = new ValuePureFunctionCommonGenerator();
  
  private final ValuePureFunctionCommonGenerator commonPureFunctions = new ValuePureFunctionCommonGenerator();
  
  public String compile(final EffectFullExpression e) {
    String _switchResult = null;
    boolean _matched = false;
    if (e instanceof EffectFullFunctionType) {
      _matched=true;
      return this.compile(((EffectFullFunctionType)e));
    }
    if (!_matched) {
      if (e instanceof EffectFullDataValue) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("new ");
        EffectFullData _type = ((EffectFullDataValue)e).getType();
        String _name = _type.getName();
        _builder.append(_name, "");
        _builder.append("(");
        EffectFullExpression _value = ((EffectFullDataValue)e).getValue();
        EffectFullData _type_1 = ((EffectFullDataValue)e).getType();
        EffectFullType _content = _type_1.getContent();
        CharSequence _compileAdtValue = this.compileAdtValue(_value, _content);
        _builder.append(_compileAdtValue, "");
        _builder.append(")");
        _switchResult = _builder.toString();
      }
    }
    if (!_matched) {
      if (e instanceof EffectFullProdValue) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("P.p(");
        EffectFullExpression _prodAdtElement1 = ((EffectFullProdValue)e).getProdAdtElement1();
        String _compile = this.compile(_prodAdtElement1);
        _builder.append(_compile, "");
        _builder.append(", ");
        EffectFullExpression _prodAdtElement2 = ((EffectFullProdValue)e).getProdAdtElement2();
        String _compile_1 = this.compile(_prodAdtElement2);
        _builder.append(_compile_1, "");
        _builder.append(")");
        _switchResult = _builder.toString();
      }
    }
    if (!_matched) {
      if (e instanceof EffectFullSumValue) {
        _matched=true;
        EffectFullExpression _sumAdtElement1 = ((EffectFullSumValue)e).getSumAdtElement1();
        boolean _equals = Objects.equal(_sumAdtElement1, null);
        if (_equals) {
          StringConcatenation _builder = new StringConcatenation();
          _builder.append("Either.right(");
          EffectFullExpression _sumAdtElement2 = ((EffectFullSumValue)e).getSumAdtElement2();
          String _compile = this.compile(_sumAdtElement2);
          _builder.append(_compile, "");
          _builder.append(")");
          return _builder.toString();
        }
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append("Either.left(");
        EffectFullExpression _sumAdtElement1_1 = ((EffectFullSumValue)e).getSumAdtElement1();
        String _compile_1 = this.compile(_sumAdtElement1_1);
        _builder_1.append(_compile_1, "");
        _builder_1.append(")");
        return _builder_1.toString();
      }
    }
    if (!_matched) {
      if (e instanceof EffectFullValueRef) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("EffectFullValue.");
        EffectFullValue _value = ((EffectFullValueRef)e).getValue();
        String _name = _value.getName();
        _builder.append(_name, "");
        _builder.append("()");
        _switchResult = _builder.toString();
      }
    }
    if (!_matched) {
      if (e instanceof IOExpression) {
        _matched=true;
        Expression _innerValue = ((IOExpression)e).getInnerValue();
        String _compile = this.commonFunctions.compile(((Expression) _innerValue));
        String _plus = ("IOFunctions.unit(" + _compile);
        return (_plus + ")");
      }
    }
    if (!_matched) {
      if (e instanceof IOEffectFullExpression) {
        _matched=true;
        EffectFullExpression _innerValue = ((IOEffectFullExpression)e).getInnerValue();
        String _compile = this.compile(((EffectFullExpression) _innerValue));
        String _plus = ("IOFunctions.unit(" + _compile);
        return (_plus + ")");
      }
    }
    if (!_matched) {
      if (e instanceof IOPureFunction) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("IOFunctions.unit(");
        PureFunction _pureFunctionFromIOPureFunction = Others.getPureFunctionFromIOPureFunction(((IOPureFunction)e));
        String _compilePureFunctionRef = this.commonPureFunctions.compilePureFunctionRef(_pureFunctionFromIOPureFunction);
        _builder.append(_compilePureFunctionRef, "");
        _builder.append(")");
        _switchResult = _builder.toString();
      }
    }
    if (!_matched) {
      if (e instanceof IOEffectFullFunction) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("IOFunctions.unit(");
        EffectFullFunction _effectFullFunctionFromIOEffectFullFunction = Others.getEffectFullFunctionFromIOEffectFullFunction(((IOEffectFullFunction)e));
        String _compileEffectFullFunctionRef = this.compileEffectFullFunctionRef(_effectFullFunctionFromIOEffectFullFunction);
        _builder.append(_compileEffectFullFunctionRef, "");
        _builder.append(")");
        _switchResult = _builder.toString();
      }
    }
    return _switchResult;
  }
  
  public String compileEffectFullFunctionRef(final EffectFullFunction function) {
    String _switchResult = null;
    boolean _matched = false;
    if (function instanceof EffectFullValue) {
      _matched=true;
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("EffectFullValue::");
      String _name = ((EffectFullValue) function).getName();
      _builder.append(_name, "");
      _switchResult = _builder.toString();
    }
    if (!_matched) {
      if (function instanceof EffectFullFunctionDefinition) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("EffectFullFunctionDefinitions::");
        String _name = ((EffectFullFunctionDefinition)function).getName();
        _builder.append(_name, "");
        _switchResult = _builder.toString();
      }
    }
    if (!_matched) {
      if (function instanceof EffectFullArgument) {
        _matched=true;
        _switchResult = ((EffectFullArgument) function).getName();
      }
    }
    return _switchResult;
  }
  
  public CharSequence compileAdtValue(final EffectFullExpression v, final Type d) {
    CharSequence _switchResult = null;
    boolean _matched = false;
    if (v instanceof EffectFullSumValue) {
      _matched=true;
      EffectFullExpression _sumAdtElement1 = ((EffectFullSumValue)v).getSumAdtElement1();
      boolean _equals = Objects.equal(_sumAdtElement1, null);
      if (_equals) {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("Either.right(");
        EffectFullExpression _sumAdtElement2 = ((EffectFullSumValue)v).getSumAdtElement2();
        Type _element2ValueTypeFromEffectFullAlgebraicType = Others.getElement2ValueTypeFromEffectFullAlgebraicType(((EffectFullAlgebraicType) d));
        Object _compileAdtValue = this.compileAdtValue(_sumAdtElement2, _element2ValueTypeFromEffectFullAlgebraicType);
        _builder.append(_compileAdtValue, "");
        _builder.append(")");
        return _builder.toString();
      }
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("Either.left(");
      EffectFullExpression _sumAdtElement1_1 = ((EffectFullSumValue)v).getSumAdtElement1();
      Type _effectFullAdtElement1 = ((EffectFullAlgebraicType) d).getEffectFullAdtElement1();
      Object _compileAdtValue_1 = this.compileAdtValue(_sumAdtElement1_1, _effectFullAdtElement1);
      _builder_1.append(_compileAdtValue_1, "");
      _builder_1.append(")");
      return _builder_1.toString();
    }
    if (!_matched) {
      if (v instanceof EffectFullProdValue) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("P.p(");
        EffectFullExpression _prodAdtElement1 = ((EffectFullProdValue)v).getProdAdtElement1();
        Type _effectFullAdtElement1 = ((EffectFullAlgebraicType) d).getEffectFullAdtElement1();
        Object _compileAdtValue = this.compileAdtValue(_prodAdtElement1, _effectFullAdtElement1);
        _builder.append(_compileAdtValue, "");
        _builder.append(",");
        EffectFullExpression _prodAdtElement2 = ((EffectFullProdValue)v).getProdAdtElement2();
        Type _element2ValueTypeFromEffectFullAlgebraicType = Others.getElement2ValueTypeFromEffectFullAlgebraicType(((EffectFullAlgebraicType) d));
        Object _compileAdtValue_1 = this.compileAdtValue(_prodAdtElement2, _element2ValueTypeFromEffectFullAlgebraicType);
        _builder.append(_compileAdtValue_1, "");
        _builder.append(")");
        return _builder.toString();
      }
    }
    if (!_matched) {
      if (v instanceof EffectFullValueRef) {
        _matched=true;
        EffectFullValue _value = ((EffectFullValueRef)v).getValue();
        if ((_value instanceof EffectFullValue)) {
          StringConcatenation _builder = new StringConcatenation();
          _builder.append("EffectFullValue.");
          EffectFullValue _value_1 = ((EffectFullValueRef)v).getValue();
          String _name = ((EffectFullValue) _value_1).getName();
          _builder.append(_name, "");
          _builder.append("()");
          return _builder.toString();
        } else {
          StringConcatenation _builder_1 = new StringConcatenation();
          _builder_1.append("EffectFullFunctionDefinitions::");
          EffectFullValue _value_2 = ((EffectFullValueRef)v).getValue();
          String _name_1 = ((EffectFullFunctionDefinition) _value_2).getName();
          _builder_1.append(_name_1, "");
          return _builder_1.toString();
        }
      }
    }
    if (!_matched) {
      if (v instanceof EffectFullFunctionType) {
        _matched=true;
        if ((d instanceof EffectFullFunctionType)) {
          return this.compile(((EffectFullFunctionType)v));
        } else {
          if ((d instanceof IOType)) {
            StringConcatenation _builder = new StringConcatenation();
            _builder.append("IOFunctions.unit(");
            String _compile = this.compile(((EffectFullFunctionType)v));
            _builder.append(_compile, "");
            _builder.append(")");
            return _builder.toString();
          }
        }
      }
    }
    if (!_matched) {
      if (v instanceof EffectFullDataValue) {
        _matched=true;
        return this.compile(((EffectFullExpression) v));
      }
    }
    if (!_matched) {
      if (v instanceof IOExpression) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("IOFunctions.unit(");
        Expression _innerValue = ((IOExpression)v).getInnerValue();
        Type _type = ((IOType) d).getType();
        Object _compileAdtValue = this.commonFunctions.compileAdtValue(((Expression) _innerValue), _type);
        _builder.append(_compileAdtValue, "");
        _builder.append(")");
        _switchResult = _builder;
      }
    }
    if (!_matched) {
      if (v instanceof IOEffectFullExpression) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("IOFunctions.unit(");
        EffectFullExpression _innerValue = ((IOEffectFullExpression)v).getInnerValue();
        Type _type = ((IOType) d).getType();
        Object _compileAdtValue = this.compileAdtValue(((EffectFullExpression) _innerValue), ((EffectFullType) _type));
        _builder.append(_compileAdtValue, "");
        _builder.append(")");
        _switchResult = _builder;
      }
    }
    if (!_matched) {
      if (v instanceof IOPureFunction) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("IOFunctions.unit(");
        PureFunction _pureFunctionFromIOPureFunction = Others.getPureFunctionFromIOPureFunction(((IOPureFunction)v));
        String _compilePureFunctionRef = this.commonPureFunctions.compilePureFunctionRef(_pureFunctionFromIOPureFunction);
        _builder.append(_compilePureFunctionRef, "");
        _builder.append(")");
        _switchResult = _builder;
      }
    }
    if (!_matched) {
      if (v instanceof IOEffectFullFunction) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("IOFunctions.unit(");
        EffectFullFunction _effectFullFunctionFromIOEffectFullFunction = Others.getEffectFullFunctionFromIOEffectFullFunction(((IOEffectFullFunction)v));
        String _compileEffectFullFunctionRef = this.compileEffectFullFunctionRef(_effectFullFunctionFromIOEffectFullFunction);
        _builder.append(_compileEffectFullFunctionRef, "");
        _builder.append(")");
        _switchResult = _builder;
      }
    }
    return _switchResult;
  }
  
  public String compile(final EffectFullFunctionType pft) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EffectFullFunctionDefinition _value = pft.getValue();
      FunctionBodyEffectFull _functionBody = _value.getFunctionBody();
      if ((_functionBody instanceof EmptyFunctionBody)) {
        _builder.append("new F<Object>() {");
        _builder.newLine();
        _builder.append("\t\t\t\t");
        _builder.append("@Override");
        _builder.newLine();
        _builder.append("\t\t\t\t");
        _builder.append("public Object f(Object ");
        EffectFullFunctionDefinition _value_1 = pft.getValue();
        Argument _arg = _value_1.getArg();
        String _argumentName = Others.getArgumentName(_arg);
        _builder.append(_argumentName, "\t\t\t\t");
        _builder.append(") {");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t\t\t\t");
        _builder.append("throw new UnsupportedOperationException(\"TODO\");");
        _builder.newLine();
        _builder.append("\t\t\t\t");
        _builder.append("}");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("}");
        _builder.newLine();
      } else {
        if (((pft.getValue().getFunctionBody() instanceof CompositionFunctionBodyEffect) && (!Objects.equal(pft.getValue().getArg(), null)))) {
          _builder.append("new F<");
          EffectFullFunctionDefinition _value_2 = pft.getValue();
          Argument _arg_1 = _value_2.getArg();
          Type _argumentType = Others.getArgumentType(_arg_1);
          Object _compile = this.typeGenerator.compile(_argumentType);
          _builder.append(_compile, "");
          _builder.append(",");
          EffectFullFunctionDefinition _value_3 = pft.getValue();
          Type _effectFullFunctionDefinition = GetReturnType.effectFullFunctionDefinition(_value_3);
          Object _compile_1 = this.typeGenerator.compile(_effectFullFunctionDefinition);
          _builder.append(_compile_1, "");
          _builder.append(">() {");
          _builder.newLineIfNotEmpty();
          _builder.append("\t\t\t");
          _builder.append("@Override");
          _builder.newLine();
          _builder.append("\t\t\t");
          _builder.append("public ");
          EffectFullFunctionDefinition _value_4 = pft.getValue();
          Type _effectFullFunctionDefinition_1 = GetReturnType.effectFullFunctionDefinition(_value_4);
          Object _compile_2 = this.typeGenerator.compile(_effectFullFunctionDefinition_1);
          _builder.append(_compile_2, "\t\t\t");
          _builder.append(" f(");
          EffectFullFunctionDefinition _value_5 = pft.getValue();
          Argument _arg_2 = _value_5.getArg();
          Type _argumentType_1 = Others.getArgumentType(_arg_2);
          Object _compile_3 = this.typeGenerator.compile(_argumentType_1);
          _builder.append(_compile_3, "\t\t\t");
          _builder.append(" ");
          EffectFullFunctionDefinition _value_6 = pft.getValue();
          Argument _arg_3 = _value_6.getArg();
          String _argumentName_1 = Others.getArgumentName(_arg_3);
          _builder.append(_argumentName_1, "\t\t\t");
          _builder.append(") {");
          _builder.newLineIfNotEmpty();
          _builder.append("\t\t\t\t");
          _builder.append("return ");
          EffectFullFunctionDefinition _value_7 = pft.getValue();
          FunctionBodyEffectFull _functionBody_1 = _value_7.getFunctionBody();
          EffectFullFunctionDefinition _value_8 = pft.getValue();
          Argument _arg_4 = _value_8.getArg();
          String _compileIO = this.compileIO(((CompositionFunctionBodyEffect) _functionBody_1), _arg_4);
          _builder.append(_compileIO, "\t\t\t\t");
          _builder.append(";");
          _builder.newLineIfNotEmpty();
          _builder.append("\t\t\t");
          _builder.append("}");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("}");
          _builder.newLine();
        } else {
          if (((pft.getValue().getFunctionBody() instanceof CompositionFunctionBodyEffect) && Objects.equal(pft.getValue().getArg(), null))) {
            _builder.append("new F0<");
            EffectFullFunctionDefinition _value_9 = pft.getValue();
            Type _effectFullFunctionDefinition_2 = GetReturnType.effectFullFunctionDefinition(_value_9);
            Object _compile_4 = this.typeGenerator.compile(_effectFullFunctionDefinition_2);
            _builder.append(_compile_4, "");
            _builder.append(">() {");
            _builder.newLineIfNotEmpty();
            _builder.append("\t\t\t");
            _builder.append("@Override");
            _builder.newLine();
            _builder.append("\t\t\t");
            _builder.append("public ");
            EffectFullFunctionDefinition _value_10 = pft.getValue();
            Type _effectFullFunctionDefinition_3 = GetReturnType.effectFullFunctionDefinition(_value_10);
            Object _compile_5 = this.typeGenerator.compile(_effectFullFunctionDefinition_3);
            _builder.append(_compile_5, "\t\t\t");
            _builder.append(" f() {");
            _builder.newLineIfNotEmpty();
            _builder.append("\t\t\t\t");
            _builder.append("return ");
            EffectFullFunctionDefinition _value_11 = pft.getValue();
            FunctionBodyEffectFull _functionBody_2 = _value_11.getFunctionBody();
            String _compileIO_1 = this.compileIO(((CompositionFunctionBodyEffect) _functionBody_2), null);
            _builder.append(_compileIO_1, "\t\t\t\t");
            _builder.append(";");
            _builder.newLineIfNotEmpty();
            _builder.append("\t\t\t");
            _builder.append("}");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("}.f()");
            _builder.newLine();
          }
        }
      }
    }
    return _builder.toString();
  }
  
  public String compileIO(final CompositionFunctionBodyEffect cfbe, final Argument arg) {
    String argName = "";
    boolean _notEquals = (!Objects.equal(arg, null));
    if (_notEquals) {
      String _argumentName = Others.getArgumentName(arg);
      String _plus = ("IOFunctions.unit(" + _argumentName);
      String _plus_1 = (_plus + ")");
      argName = _plus_1;
    }
    EffectFullBodyContent _firstFunctionDefinitionFromCompositionBodyEffectFull = Others.getFirstFunctionDefinitionFromCompositionBodyEffectFull(cfbe);
    String _compileIO = this.compileIO(_firstFunctionDefinitionFromCompositionBodyEffectFull, argName);
    String result = _compileIO.toString();
    EList<CompositionFunctionBodyEffectFullFactor> _functionChain = cfbe.getFunctionChain();
    for (final CompositionFunctionBodyEffectFullFactor cfbef : _functionChain) {
      {
        String _result = result;
        result = (_result + "\n\t");
        EffectFullBodyContent _functionDefinitionFromEffectFullFactor = Others.getFunctionDefinitionFromEffectFullFactor(cfbef);
        String _string = result.toString();
        String _compileIO_1 = this.compileIO(_functionDefinitionFromEffectFullFactor, _string);
        String _string_1 = _compileIO_1.toString();
        result = _string_1;
      }
    }
    return result;
  }
  
  public String compileIO(final EffectFullBodyContent e, final String valueName) {
    String _switchResult = null;
    boolean _matched = false;
    if (e instanceof EffectFullExpression) {
      _matched=true;
      String _compile = this.compile(((EffectFullExpression)e));
      _switchResult = this.valueEmbellishment(valueName, _compile);
    }
    if (!_matched) {
      if (e instanceof EffectFullFunction) {
        _matched=true;
        _switchResult = this.compileIO(((EffectFullFunction) e), valueName);
      }
    }
    if (!_matched) {
      if (e instanceof EffectFullPrimitive) {
        _matched=true;
        _switchResult = this.compileIO(((EffectFullPrimitive) e), valueName);
      }
    }
    return _switchResult;
  }
  
  public String compileIO(final EffectFullPrimitive effp, final String acc) {
    String _switchResult = null;
    boolean _matched = false;
    if (effp instanceof PrimitiveEffectFullFunction) {
      _matched=true;
      _switchResult = this.compileIO(((PrimitiveEffectFullFunction)effp), acc);
    }
    if (!_matched) {
      if (effp instanceof PrimitiveEffectFullValue) {
        _matched=true;
        _switchResult = this.compileIO(((PrimitiveEffectFullValue)effp), acc);
      }
    }
    return _switchResult;
  }
  
  public String compileIO(final PrimitiveEffectFullValue pefv, final String acc) {
    String _switchResult = null;
    boolean _matched = false;
    if (pefv instanceof PrimitiveRandom) {
      _matched=true;
      _switchResult = this.valueEmbellishment(acc, "PrimitivesEffectFull.primitiveRandom()");
    }
    if (!_matched) {
      if (pefv instanceof PrimitiveTime) {
        _matched=true;
        _switchResult = this.valueEmbellishment(acc, "PrimitivesEffectFull.primitiveTime()");
      }
    }
    return _switchResult;
  }
  
  public String compileIO(final EffectFullFunction eff, final String acc) {
    String _switchResult = null;
    boolean _matched = false;
    if (eff instanceof EffectFullValue) {
      _matched=true;
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("EffectFullValue.");
      String _name = ((EffectFullValue) eff).getName();
      _builder.append(_name, "");
      _builder.append("()");
      Type _effectFullBodyContent = GetReturnType.effectFullBodyContent(eff);
      boolean _not = (!(_effectFullBodyContent instanceof IOType));
      _switchResult = this.compileIOEffectFullReference(_builder.toString(), acc, _not);
    }
    if (!_matched) {
      if (eff instanceof EffectFullFunctionDefinition) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("IOFunctions.bind(");
        _builder.append(acc, "");
        _builder.append(", EffectFullFunctionDefinitions::");
        String _name = ((EffectFullFunctionDefinition) eff).getName();
        _builder.append(_name, "");
        _builder.append(")");
        _switchResult = _builder.toString();
      }
    }
    if (!_matched) {
      if (eff instanceof PrimitiveEffectFullFunction) {
        _matched=true;
        _switchResult = this.compileIO(((PrimitiveEffectFullFunction)eff), acc);
      }
    }
    if (!_matched) {
      if (eff instanceof EffectFullArgument) {
        _matched=true;
        String _name = ((EffectFullArgument) eff).getName();
        EffectFullType _type = ((EffectFullArgument)eff).getType();
        boolean _not = (!(_type instanceof IOType));
        _switchResult = this.compileIOEffectFullReference(_name, acc, _not);
      }
    }
    return _switchResult;
  }
  
  public String compileIO(final PrimitiveEffectFullFunction peff, final String acc) {
    String _switchResult = null;
    boolean _matched = false;
    if (peff instanceof PrimitivePrint) {
      _matched=true;
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("IOFunctions.bind(");
      _builder.append(acc, "");
      _builder.append(", PrimitivesEffectFull::primitivePrint)");
      _switchResult = _builder.toString();
    }
    if (!_matched) {
      if (peff instanceof LeftAlgebraicIO) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("IOFunctions.bind(");
        _builder.append(acc, "");
        _builder.append(", PrimitivesEffectFull:leftAlgebraicIO)");
        _switchResult = _builder.toString();
      }
    }
    if (!_matched) {
      if (peff instanceof RightAlgebraicIO) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("IOFunctions.bind(");
        _builder.append(acc, "");
        _builder.append(", PrimitivesEffectFull:rightAlgebraicIO)");
        _switchResult = _builder.toString();
      }
    }
    if (!_matched) {
      if (peff instanceof ApplyFIO) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("IOFunctions.bind(");
        _builder.append(acc, "");
        _builder.append(", (");
        EffectFullFunctionType _functionType = ((ApplyFIO)peff).getFunctionType();
        Object _compile = this.typeGenerator.compile(_functionType);
        _builder.append(_compile, "");
        _builder.append(" f) -> f.f(IOFunctions.runSafe(");
        ApplyFIOFactor _value = ((ApplyFIO)peff).getValue();
        EffectFullBodyContent _valueFromApplyFIOFactor = Others.getValueFromApplyFIOFactor(_value);
        String _compileIO = this.compileIO(_valueFromApplyFIOFactor, null);
        _builder.append(_compileIO, "");
        _builder.append(")))");
        _switchResult = _builder.toString();
      }
    }
    if (!_matched) {
      if (peff instanceof PrimitiveReturn) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append(acc, "");
        _switchResult = _builder.toString();
      }
    }
    if (!_matched) {
      if (peff instanceof ExtractEffectFull) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("IOFunctions.bind(");
        _builder.append(acc, "");
        _builder.append(", (");
        EffectFullData _data = ((ExtractEffectFull)peff).getData();
        String _name = _data.getName();
        _builder.append(_name, "");
        _builder.append(" d) -> ");
        {
          EffectFullData _data_1 = ((ExtractEffectFull)peff).getData();
          EffectFullType _content = _data_1.getContent();
          if ((_content instanceof IOType)) {
            _builder.append(" d.getValue() ");
          } else {
            _builder.append(" IOFunctions.unit(d.getValue())) ");
          }
        }
        _switchResult = _builder.toString();
      }
    }
    if (!_matched) {
      if (peff instanceof LiftPureFunction) {
        _matched=true;
        PureFunction _pureFunctionFromLiftPureFunction = Others.getPureFunctionFromLiftPureFunction(((LiftPureFunction)peff));
        _switchResult = this.compileIO(_pureFunctionFromLiftPureFunction, acc);
      }
    }
    if (!_matched) {
      if (peff instanceof LiftEffectFullFunction) {
        _matched=true;
        EffectFullFunction _effectFullFunctionFromLiftEffectFullFunction = Others.getEffectFullFunctionFromLiftEffectFullFunction(((LiftEffectFullFunction)peff));
        _switchResult = this.compileIO(_effectFullFunctionFromLiftEffectFullFunction, acc);
      }
    }
    if (!_matched) {
      if (peff instanceof IsLeftEffectFull) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("IOFuctions.bind(");
        _builder.append(acc, "");
        _builder.append(", PrimitivesEffectFull::isLeft)");
        _switchResult = _builder.toString();
      }
    }
    if (!_matched) {
      if (peff instanceof IsRightEffectFull) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("IOFunctions.bind(");
        _builder.append(acc, "");
        _builder.append(", PrimitivesEffectFull::isRight)");
        _switchResult = _builder.toString();
      }
    }
    if (!_matched) {
      if (peff instanceof EffectFullIf) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("IOFunctions.bind(");
        _builder.append(acc, "");
        _builder.append(", (Boolean c) -> PrimitivesEffectFull.effectFullIf(c, ");
        EffectFullIfBody _then = ((EffectFullIf)peff).getThen();
        String _compile = this.compile(_then);
        _builder.append(_compile, "");
        _builder.append(" , ");
        EffectFullIfBody _else = ((EffectFullIf)peff).getElse();
        String _compile_1 = this.compile(_else);
        _builder.append(_compile_1, "");
        _builder.append("))");
        _switchResult = _builder.toString();
      }
    }
    if (!_matched) {
      if (peff instanceof EffectFullEitherIf) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("IOFunctions.bind(");
        _builder.append(acc, "");
        _builder.append(", (Boolean c) -> PrimitivesEffectFull.effectFullIfEither(c, ");
        EffectFullIfBody _then = ((EffectFullEitherIf)peff).getThen();
        String _compile = this.compile(_then);
        _builder.append(_compile, "");
        _builder.append(" , ");
        EffectFullIfBody _else = ((EffectFullEitherIf)peff).getElse();
        String _compile_1 = this.compile(_else);
        _builder.append(_compile_1, "");
        _builder.append("))");
        _switchResult = _builder.toString();
      }
    }
    return _switchResult;
  }
  
  public String compileIO(final PureFunction pf, final String acc) {
    String _switchResult = null;
    boolean _matched = false;
    if (pf instanceof PureValue) {
      _matched=true;
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("IOFunctions.unit(PureValue.");
      String _name = ((PureValue) pf).getName();
      _builder.append(_name, "");
      _builder.append("())");
      _switchResult = this.valueEmbellishment(acc, _builder.toString());
    }
    if (!_matched) {
      if (pf instanceof PureFunctionDefinition) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("IOFunctions.map(");
        _builder.append(acc, "");
        _builder.append(", PureFunctionDefinitions::");
        String _name = ((PureFunctionDefinition) pf).getName();
        _builder.append(_name, "");
        _builder.append(")");
        _switchResult = _builder.toString();
      }
    }
    if (!_matched) {
      if (pf instanceof PrimitivePureFunction) {
        _matched=true;
        _switchResult = this.compileIO(((PrimitivePureFunction)pf), acc);
      }
    }
    if (!_matched) {
      if (pf instanceof PureArgument) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("IOFunctions.unit(");
        String _name = ((PureArgument)pf).getName();
        _builder.append(_name, "");
        _builder.append(")");
        _switchResult = this.valueEmbellishment(acc, _builder.toString());
      }
    }
    if (!_matched) {
      if (pf instanceof Expression) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("IOFuncitons.unit(");
        String _compile = this.commonPureFunctions.compile(((Expression)pf));
        _builder.append(_compile, "");
        _builder.append(")");
        _switchResult = this.valueEmbellishment(acc, _builder.toString());
      }
    }
    return _switchResult;
  }
  
  public String compileIO(final PrimitivePureFunction ppf, final String acc) {
    String _switchResult = null;
    boolean _matched = false;
    if (ppf instanceof IntToString) {
      _matched=true;
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("IOFunctions.map(");
      _builder.append(acc, "");
      _builder.append(" ,Primitives::intToString)");
      _switchResult = _builder.toString();
    }
    if (!_matched) {
      if (ppf instanceof IntPow) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("IOFunctions.map(");
        _builder.append(acc, "");
        _builder.append(",Primitives::intPow) ");
        _switchResult = _builder.toString();
      }
    }
    if (!_matched) {
      if (ppf instanceof Plus) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("IOFunctions.map(");
        _builder.append(acc, "");
        _builder.append(", Primitives::plus)");
        _switchResult = _builder.toString();
      }
    }
    if (!_matched) {
      if (ppf instanceof Minus) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("IOFunctions.map(");
        _builder.append(acc, "");
        _builder.append(", Primitives::minus)");
        _switchResult = _builder.toString();
      }
    }
    if (!_matched) {
      if (ppf instanceof Times) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("IOFunctions.map(");
        _builder.append(acc, "");
        _builder.append(", Primitives::times)");
        _switchResult = _builder.toString();
      }
    }
    if (!_matched) {
      if (ppf instanceof LeftAlgebraic) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("IOFunctions.map(");
        _builder.append(acc, "");
        _builder.append(", Primitives::leftAlgebraic)");
        _switchResult = _builder.toString();
      }
    }
    if (!_matched) {
      if (ppf instanceof RightAlgebraic) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("IOFunctions.map(");
        _builder.append(acc, "");
        _builder.append(", Primitives::rightAlgebraic)");
        _switchResult = _builder.toString();
      }
    }
    if (!_matched) {
      if (ppf instanceof Mod) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("IOFunctions.map(");
        _builder.append(acc, "");
        _builder.append(", Primitives::mod)");
        _switchResult = _builder.toString();
      }
    }
    if (!_matched) {
      if (ppf instanceof ApplyF) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("IOFunctions.unit(IOFunctions.runSafe(");
        _builder.append(acc, "");
        _builder.append(").f(");
        ApplyFFactor _value = ((ApplyF)ppf).getValue();
        String _compileApplyFFactor = this.commonPureFunctions.compileApplyFFactor(_value, "", true);
        _builder.append(_compileApplyFFactor, "");
        _builder.append("))");
        _switchResult = _builder.toString();
      }
    }
    if (!_matched) {
      if (ppf instanceof ExtractPure) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("IOFunctions.bind(");
        _builder.append(acc, "");
        _builder.append(", (");
        PureData _data = ((ExtractPure)ppf).getData();
        String _name = _data.getName();
        _builder.append(_name, "");
        _builder.append(" d) ->  IOFunctions.unit(d.getValue()))");
        _switchResult = _builder.toString();
      }
    }
    if (!_matched) {
      if (ppf instanceof Equals) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("IOFunctions.map(");
        _builder.append(acc, "");
        _builder.append(", Primitives::equalsCurrying)");
        _switchResult = _builder.toString();
      }
    }
    if (!_matched) {
      if (ppf instanceof MinorEquals) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("IOFunctions.map(");
        _builder.append(acc, "");
        _builder.append(", Primitives::minorEquals)");
        _switchResult = _builder.toString();
      }
    }
    if (!_matched) {
      if (ppf instanceof MajorEquals) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("IOFunctions.map(");
        _builder.append(acc, "");
        _builder.append(", Primitives::majorEquals)");
        _switchResult = _builder.toString();
      }
    }
    if (!_matched) {
      if (ppf instanceof Minor) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("IOFunctions.map(");
        _builder.append(acc, "");
        _builder.append(", Primitives::minor)");
        _switchResult = _builder.toString();
      }
    }
    if (!_matched) {
      if (ppf instanceof Major) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("IOFunctions.map(");
        _builder.append(acc, "");
        _builder.append(", Primitives::major)");
        _switchResult = _builder.toString();
      }
    }
    if (!_matched) {
      if (ppf instanceof LogicAnd) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("IOFunctions.map(");
        _builder.append(acc, "");
        _builder.append(", Primitives::logicAnd)");
        _switchResult = _builder.toString();
      }
    }
    if (!_matched) {
      if (ppf instanceof LogicOr) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("IOFunctions.map(");
        _builder.append(acc, "");
        _builder.append(", Primitives::logicOr)");
        _switchResult = _builder.toString();
      }
    }
    if (!_matched) {
      if (ppf instanceof IsLeftPure) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("IOFuncitons.map(");
        _builder.append(acc, "");
        _builder.append(", Primitives::isLeft)");
        _switchResult = _builder.toString();
      }
    }
    if (!_matched) {
      if (ppf instanceof IsRightPure) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("IOFunctions.map(");
        _builder.append(acc, "");
        _builder.append(", Primitives::isRight)");
        _switchResult = _builder.toString();
      }
    }
    if (!_matched) {
      if (ppf instanceof PureIf) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("IOFunctions.map(");
        _builder.append(acc, "");
        _builder.append(", (Boolean c) -> Primitives.pureIf(c, ");
        PureIfBody _then = ((PureIf)ppf).getThen();
        String _compile = this.commonPureFunctions.compile(_then);
        _builder.append(_compile, "");
        _builder.append(" , ");
        PureIfBody _else = ((PureIf)ppf).getElse();
        String _compile_1 = this.commonPureFunctions.compile(_else);
        _builder.append(_compile_1, "");
        _builder.append("))");
        _switchResult = _builder.toString();
      }
    }
    if (!_matched) {
      if (ppf instanceof PureEitherIf) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("IOFunctions.map(");
        _builder.append(acc, "");
        _builder.append(", (Boolean c) -> Primitives.pureIfEither(c, ");
        PureIfBody _then = ((PureEitherIf)ppf).getThen();
        String _compile = this.commonPureFunctions.compile(_then);
        _builder.append(_compile, "");
        _builder.append(" , ");
        PureIfBody _else = ((PureEitherIf)ppf).getElse();
        String _compile_1 = this.commonPureFunctions.compile(_else);
        _builder.append(_compile_1, "");
        _builder.append("))");
        _switchResult = _builder.toString();
      }
    }
    return _switchResult;
  }
  
  public String compileIOEffectFullReference(final String effectFullReferenceCompiled, final String valueName, final boolean unitWrap) {
    if (unitWrap) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("IOFunctions.unit(");
      _builder.append(effectFullReferenceCompiled, "");
      _builder.append(")");
      return this.valueEmbellishment(valueName, _builder.toString());
    } else {
      return this.valueEmbellishment(valueName, effectFullReferenceCompiled);
    }
  }
  
  public String valueEmbellishment(final String inputChain, final String valueCompiled) {
    boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(inputChain);
    if (_isNullOrEmpty) {
      return valueCompiled;
    } else {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("IOFunctions.left(");
      _builder.append(valueCompiled, "");
      _builder.append(",");
      _builder.append(inputChain, "");
      _builder.append(")");
      return _builder.toString();
    }
  }
  
  public String compile(final EffectFullIfBody pib) {
    String _switchResult = null;
    boolean _matched = false;
    if (pib instanceof EffectFullExpression) {
      _matched=true;
      _switchResult = this.compile(((EffectFullExpression) pib));
    }
    if (!_matched) {
      if (pib instanceof EffectFullFunction) {
        _matched=true;
        String _switchResult_1 = null;
        boolean _matched_1 = false;
        if (pib instanceof EffectFullValue) {
          _matched_1=true;
          _switchResult_1 = ((EffectFullValue)pib).getName();
        }
        if (!_matched_1) {
          if (pib instanceof EffectFullFunctionDefinition) {
            _matched_1=true;
            _switchResult_1 = this.compileEffectFullFunctionRef(((EffectFullFunctionDefinition) pib));
          }
        }
        if (!_matched_1) {
          if (pib instanceof PrimitiveEffectFullFunction) {
            _matched_1=true;
            _switchResult_1 = this.compileEffectFullFunctionRef(((PrimitiveEffectFullFunction) pib));
          }
        }
        if (!_matched_1) {
          if (pib instanceof EffectFullArgument) {
            _matched_1=true;
            _switchResult_1 = ((EffectFullArgument)pib).getName();
          }
        }
        _switchResult = _switchResult_1;
      }
    }
    return _switchResult;
  }
}
