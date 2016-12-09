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
import it.unibo.fPML.EffectFullExpression;
import it.unibo.fPML.EffectFullFunctionDefinition;
import it.unibo.fPML.EffectFullFunctionType;
import it.unibo.fPML.EffectFullProdValue;
import it.unibo.fPML.EffectFullSumValue;
import it.unibo.fPML.EffectFullType;
import it.unibo.fPML.EffectFullValue;
import it.unibo.fPML.EffectFullValueRef;
import it.unibo.fPML.EmptyFunctionBody;
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
import it.unibo.fPML.LeftPair;
import it.unibo.fPML.LeftPairIO;
import it.unibo.fPML.Minus;
import it.unibo.fPML.Mod;
import it.unibo.fPML.Plus;
import it.unibo.fPML.PrimitivePrint;
import it.unibo.fPML.PrimitiveRandom;
import it.unibo.fPML.PrimitiveReturn;
import it.unibo.fPML.PrimitiveTime;
import it.unibo.fPML.PureData;
import it.unibo.fPML.PureFunctionDefinition;
import it.unibo.fPML.PureValue;
import it.unibo.fPML.RightPair;
import it.unibo.fPML.RightPairIO;
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
        Object _compileAdtValue = this.compileAdtValue(_value, _content);
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
        _builder.append("\'EffectFullValue.");
        EffectFullValue _value = ((EffectFullValueRef)e).getValue();
        String _name = _value.getName();
        _builder.append(_name, "");
        _builder.append("()");
        _switchResult = _builder.toString();
      }
    }
    if (!_matched) {
      if (e instanceof Expression) {
        _matched=true;
        _switchResult = this.commonFunctions.compile(((Expression) e));
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
        _builder.append("TODO");
        _switchResult = _builder.toString();
      }
    }
    if (!_matched) {
      if (e instanceof IOEffectFullFunction) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("TODO");
        _switchResult = _builder.toString();
      }
    }
    return _switchResult;
  }
  
  public Object compileAdtValue(final EffectFullExpression v, final Type d) {
    Object _switchResult = null;
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
      if (v instanceof Expression) {
        _matched=true;
        Type _type = ((IOType) d).getType();
        _switchResult = this.commonFunctions.compileAdtValue(((Expression) v), _type);
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
        _builder.append("TODO");
        _switchResult = _builder;
      }
    }
    if (!_matched) {
      if (v instanceof IOEffectFullFunction) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("TODO");
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
    if (e instanceof IntToString) {
      _matched=true;
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("IOFunctions.map(");
      _builder.append(valueName, "");
      _builder.append(" ,Primitives::intToString)");
      _switchResult = _builder.toString();
    }
    if (!_matched) {
      if (e instanceof IntPow) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("IOFunctions.map(");
        _builder.append(valueName, "");
        _builder.append(",Primitives::intPow) ");
        _switchResult = _builder.toString();
      }
    }
    if (!_matched) {
      if (e instanceof Plus) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("IOFunctions.map(");
        _builder.append(valueName, "");
        _builder.append(", Primitives::plus)");
        _switchResult = _builder.toString();
      }
    }
    if (!_matched) {
      if (e instanceof Minus) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("IOFunctions.map(");
        _builder.append(valueName, "");
        _builder.append(", Primitives::minus)");
        _switchResult = _builder.toString();
      }
    }
    if (!_matched) {
      if (e instanceof Times) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("IOFunctions.map(");
        _builder.append(valueName, "");
        _builder.append(", Primitives::times)");
        _switchResult = _builder.toString();
      }
    }
    if (!_matched) {
      if (e instanceof LeftPair) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("IOFunctions.map(");
        _builder.append(valueName, "");
        _builder.append(", Primitives::leftPair)");
        _switchResult = _builder.toString();
      }
    }
    if (!_matched) {
      if (e instanceof RightPair) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("IOFunctions.map(");
        _builder.append(valueName, "");
        _builder.append(", Primitives::rightPair)");
        _switchResult = _builder.toString();
      }
    }
    if (!_matched) {
      if (e instanceof Mod) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("IOFunctions.map(");
        _builder.append(valueName, "");
        _builder.append(", Primitives::mod)");
        _switchResult = _builder.toString();
      }
    }
    if (!_matched) {
      if (e instanceof PrimitivePrint) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("IOFunctions.bind(");
        _builder.append(valueName, "");
        _builder.append(", PrimitivesEffectFull::primitivePrint)");
        _switchResult = _builder.toString();
      }
    }
    if (!_matched) {
      if (e instanceof LeftPairIO) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("IOFunctions.bind(");
        _builder.append(valueName, "");
        _builder.append(", primitivesEffectFull:leftPairIO)");
        _switchResult = _builder.toString();
      }
    }
    if (!_matched) {
      if (e instanceof RightPairIO) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("IOFunctions.bind(");
        _builder.append(valueName, "");
        _builder.append(", primitivesEffectFull:rightPairIO)");
        _switchResult = _builder.toString();
      }
    }
    if (!_matched) {
      if (e instanceof PrimitiveRandom) {
        _matched=true;
        _switchResult = this.valueEmbellishment(valueName, "PrimitivesEffectFull.primitiveRandom()");
      }
    }
    if (!_matched) {
      if (e instanceof PrimitiveTime) {
        _matched=true;
        _switchResult = this.valueEmbellishment(valueName, "PrimitivesEffectFull.primitiveTime()");
      }
    }
    if (!_matched) {
      if (e instanceof PrimitiveReturn) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append(valueName, "");
        _switchResult = _builder.toString();
      }
    }
    if (!_matched) {
      if (e instanceof ApplyFIO) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("IOFunctions.bind(");
        _builder.append(valueName, "");
        _builder.append(", (");
        EffectFullFunctionType _functionType = ((ApplyFIO)e).getFunctionType();
        Object _compile = this.typeGenerator.compile(_functionType);
        _builder.append(_compile, "");
        _builder.append(" f) -> f.f(IOFunctions.runSafe(");
        ApplyFIOFactor _value = ((ApplyFIO)e).getValue();
        EffectFullBodyContent _valueFromApplyFIOFactor = Others.getValueFromApplyFIOFactor(_value);
        String _compileIO = this.compileIO(_valueFromApplyFIOFactor, null);
        EffectFullFunctionType _functionType_1 = ((ApplyFIO)e).getFunctionType();
        Type _argType = _functionType_1.getArgType();
        String _compileIOEffectFullReference = this.compileIOEffectFullReference(_compileIO, null, (_argType instanceof IOType));
        _builder.append(_compileIOEffectFullReference, "");
        _builder.append(")))");
        _switchResult = _builder.toString();
      }
    }
    if (!_matched) {
      if (e instanceof ApplyF) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("IOFunctions.unit(IOFunctions.runSafe(");
        _builder.append(valueName, "");
        _builder.append(").f(");
        ApplyFFactor _value = ((ApplyF)e).getValue();
        String _compileApplyFFactor = this.commonPureFunctions.compileApplyFFactor(_value, "", true);
        _builder.append(_compileApplyFFactor, "");
        _builder.append("))");
        _switchResult = _builder.toString();
      }
    }
    if (!_matched) {
      if (e instanceof PureValue) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("IOFunctions.unit(PureValue.");
        String _name = ((PureValue) e).getName();
        _builder.append(_name, "");
        _builder.append("())");
        _switchResult = this.valueEmbellishment(valueName, _builder.toString());
      }
    }
    if (!_matched) {
      if (e instanceof EffectFullValue) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("EffectFullValue.");
        String _name = ((EffectFullValue) e).getName();
        _builder.append(_name, "");
        _builder.append("()");
        Type _effectFullBodyContent = GetReturnType.effectFullBodyContent(e);
        boolean _not = (!(_effectFullBodyContent instanceof IOType));
        _switchResult = this.compileIOEffectFullReference(_builder.toString(), valueName, _not);
      }
    }
    if (!_matched) {
      if (e instanceof PureFunctionDefinition) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("IOFunctions.map(");
        _builder.append(valueName, "");
        _builder.append(", PureFunctionDefinitions::");
        String _name = ((PureFunctionDefinition) e).getName();
        _builder.append(_name, "");
        _builder.append(")");
        return _builder.toString();
      }
    }
    if (!_matched) {
      if (e instanceof EffectFullArgument) {
        _matched=true;
        String _name = ((EffectFullArgument) e).getName();
        EffectFullType _type = ((EffectFullArgument)e).getType();
        boolean _not = (!(_type instanceof IOType));
        _switchResult = this.compileIOEffectFullReference(_name, valueName, _not);
      }
    }
    if (!_matched) {
      if (e instanceof EffectFullFunctionDefinition) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("IOFunctions.bind(");
        _builder.append(valueName, "");
        _builder.append(", EffectFullFunctionDefinitions::");
        String _name = ((EffectFullFunctionDefinition) e).getName();
        _builder.append(_name, "");
        _builder.append(")");
        return _builder.toString();
      }
    }
    if (!_matched) {
      if (e instanceof EffectFullExpression) {
        _matched=true;
        String _compile = this.compile(((EffectFullExpression)e));
        _switchResult = this.valueEmbellishment(valueName, _compile);
      }
    }
    if (!_matched) {
      if (e instanceof ExtractEffectFull) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("IOFunctions.bind(");
        _builder.append(valueName, "");
        _builder.append(", (");
        EffectFullData _data = ((ExtractEffectFull)e).getData();
        String _name = _data.getName();
        _builder.append(_name, "");
        _builder.append(" d) -> ");
        {
          EffectFullData _data_1 = ((ExtractEffectFull)e).getData();
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
      if (e instanceof ExtractPure) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("IOFunctions.bind(");
        _builder.append(valueName, "");
        _builder.append(", (");
        PureData _data = ((ExtractPure)e).getData();
        String _name = _data.getName();
        _builder.append(_name, "");
        _builder.append(" d) ->  IOFunctions.unit(d.getValue()))");
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
}
