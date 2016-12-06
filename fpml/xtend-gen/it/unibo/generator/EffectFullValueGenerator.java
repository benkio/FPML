package it.unibo.generator;

import com.google.common.base.Objects;
import it.unibo.fPML.CompositionFunctionBodyEffect;
import it.unibo.fPML.EffectFullAdtValue;
import it.unibo.fPML.EffectFullAlgebraicType;
import it.unibo.fPML.EffectFullArgument;
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
import it.unibo.fPML.FunctionBodyEffectFull;
import it.unibo.fPML.IOType;
import it.unibo.fPML.RecursiveEffectFullExpression;
import it.unibo.fPML.Type;
import it.unibo.generator.EffectFullFunctionGenerator;
import it.unibo.generator.FPMLGenerator;
import it.unibo.generator.TypeGenerator;
import it.unibo.generator.ValueGenerator;
import it.unibo.validation.utilitiesFunctions.GetReturnType;
import it.unibo.validation.utilitiesFunctions.Others;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class EffectFullValueGenerator {
  private final TypeGenerator typeGenerator = new TypeGenerator();
  
  private final EffectFullFunctionGenerator EffectFullFunctionGenerator = new EffectFullFunctionGenerator();
  
  private final ValueGenerator valueGenerator = new ValueGenerator();
  
  public CharSequence compile(final Iterable<EffectFullValue> values) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    String _basePackageJava = FPMLGenerator.basePackageJava();
    _builder.append(_basePackageJava, "");
    _builder.append("Effectfull.Data;");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("import ");
    String _basePackageJava_1 = FPMLGenerator.basePackageJava();
    _builder.append(_basePackageJava_1, "");
    _builder.append("Effectfull.Data.*;");
    _builder.newLineIfNotEmpty();
    _builder.append("import it.unibo.Pure.PureFunctionDefinitions;");
    _builder.newLine();
    _builder.append("import it.unibo.Pure.Data.PureValue;");
    _builder.newLine();
    _builder.append("import fj.data.*;");
    _builder.newLine();
    _builder.append("import fj.*;");
    _builder.newLine();
    _builder.append("import it.unibo.Effectfull.PrimitivesEffectFull;");
    _builder.newLine();
    _builder.append("import it.unibo.Effectfull.EffectFullFunctionDefinitions;");
    _builder.newLine();
    _builder.newLine();
    _builder.newLine();
    _builder.append("public class EffectFullValue {");
    _builder.newLine();
    {
      for(final EffectFullValue v : values) {
        _builder.append("\t");
        CharSequence _compile = this.compile(v);
        _builder.append(_compile, "\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("}");
    return _builder;
  }
  
  public CharSequence compile(final EffectFullValue v) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.newLine();
    _builder.append("public static ");
    EffectFullExpression _value = v.getValue();
    Object _compileType = this.typeGenerator.compileType(_value);
    _builder.append(_compileType, "");
    _builder.append(" ");
    String _name = v.getName();
    _builder.append(_name, "");
    _builder.append("() {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("return ");
    EffectFullExpression _value_1 = v.getValue();
    CharSequence _compile = this.compile(_value_1);
    _builder.append(_compile, "\t");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence compile(final EffectFullExpression e) {
    CharSequence _switchResult = null;
    boolean _matched = false;
    if (e instanceof Expression) {
      _matched=true;
      Object _compile = this.valueGenerator.compile(((Expression)e));
      String _plus = ("IOFunctions.unit(" + _compile);
      return (_plus + ")");
    }
    if (!_matched) {
      if (e instanceof EffectFullFunctionType) {
        _matched=true;
        return this.compile(((EffectFullFunctionType)e));
      }
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
        EffectFullAdtValue _value = ((EffectFullDataValue)e).getValue();
        EffectFullData _type_1 = ((EffectFullDataValue)e).getType();
        EffectFullType _content = _type_1.getContent();
        Object _compileAdtValue = this.compileAdtValue(_value, _content);
        _builder.append(_compileAdtValue, "");
        _builder.append(")");
        _switchResult = _builder;
      }
    }
    if (!_matched) {
      if (e instanceof RecursiveEffectFullExpression) {
        _matched=true;
        EffectFullExpression _exp = ((RecursiveEffectFullExpression)e).getExp();
        Object _compile = this.compile(_exp);
        String _plus = ("IOFunctions.unit(" + _compile);
        return (_plus + ")");
      }
    }
    return _switchResult;
  }
  
  public Object compileAdtValue(final EffectFullAdtValue v, final EffectFullType d) {
    CharSequence _switchResult = null;
    boolean _matched = false;
    if (v instanceof Expression) {
      _matched=true;
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("IOFunctions.unit(");
      Type _type = ((IOType) d).getType();
      Object _compileAdtValue = this.valueGenerator.compileAdtValue(((Expression)v), _type);
      _builder.append(_compileAdtValue, "");
      _builder.append(")");
      _switchResult = _builder;
    }
    if (!_matched) {
      if (v instanceof EffectFullSumValue) {
        _matched=true;
        EffectFullAdtValue _sumAdtElement1 = ((EffectFullSumValue)v).getSumAdtElement1();
        boolean _equals = Objects.equal(_sumAdtElement1, null);
        if (_equals) {
          StringConcatenation _builder = new StringConcatenation();
          _builder.append("Either.right(");
          EffectFullAdtValue _sumAdtElement2 = ((EffectFullSumValue)v).getSumAdtElement2();
          IOType _element2ValueTypeFromEffectFullAlgebraicType = Others.getElement2ValueTypeFromEffectFullAlgebraicType(((EffectFullAlgebraicType) d));
          Object _compileAdtValue = this.compileAdtValue(_sumAdtElement2, _element2ValueTypeFromEffectFullAlgebraicType);
          _builder.append(_compileAdtValue, "");
          _builder.append(")");
          return _builder.toString();
        }
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append("Either.left(");
        EffectFullAdtValue _sumAdtElement1_1 = ((EffectFullSumValue)v).getSumAdtElement1();
        IOType _effectFullAdtElement1 = ((EffectFullAlgebraicType) d).getEffectFullAdtElement1();
        Object _compileAdtValue_1 = this.compileAdtValue(_sumAdtElement1_1, _effectFullAdtElement1);
        _builder_1.append(_compileAdtValue_1, "");
        _builder_1.append(")");
        return _builder_1.toString();
      }
    }
    if (!_matched) {
      if (v instanceof EffectFullProdValue) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("P.p(");
        EffectFullAdtValue _prodAdtElement1 = ((EffectFullProdValue)v).getProdAdtElement1();
        IOType _effectFullAdtElement1 = ((EffectFullAlgebraicType) d).getEffectFullAdtElement1();
        Object _compileAdtValue = this.compileAdtValue(_prodAdtElement1, _effectFullAdtElement1);
        _builder.append(_compileAdtValue, "");
        _builder.append(",");
        EffectFullAdtValue _prodAdtElement2 = ((EffectFullProdValue)v).getProdAdtElement2();
        IOType _element2ValueTypeFromEffectFullAlgebraicType = Others.getElement2ValueTypeFromEffectFullAlgebraicType(((EffectFullAlgebraicType) d));
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
            CharSequence _compile = this.compile(((EffectFullFunctionType)v));
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
      CharSequence _switchResult_1 = null;
      EObject _innerValue = v.getInnerValue();
      boolean _matched_1 = false;
      if (_innerValue instanceof Expression) {
        _matched_1=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("IOFunctions.unit(");
        EObject _innerValue_1 = v.getInnerValue();
        Type _type = ((IOType) d).getType();
        Object _compileAdtValue = this.valueGenerator.compileAdtValue(((Expression) _innerValue_1), _type);
        _builder.append(_compileAdtValue, "");
        _builder.append(")");
        _switchResult_1 = _builder;
      }
      if (!_matched_1) {
        if (_innerValue instanceof EffectFullAdtValue) {
          _matched_1=true;
          StringConcatenation _builder = new StringConcatenation();
          _builder.append("IOFunctions.unit(");
          EObject _innerValue_1 = v.getInnerValue();
          Type _type = ((IOType) d).getType();
          Object _compileAdtValue = this.compileAdtValue(((EffectFullAdtValue) _innerValue_1), ((EffectFullType) _type));
          _builder.append(_compileAdtValue, "");
          _builder.append(")");
          _switchResult_1 = _builder;
        }
      }
      _switchResult = _switchResult_1;
    }
    return _switchResult;
  }
  
  public CharSequence compile(final EffectFullFunctionType pft) {
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
        EffectFullArgument _arg = _value_1.getArg();
        String _name = _arg.getName();
        _builder.append(_name, "\t\t\t\t");
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
          EffectFullArgument _arg_1 = _value_2.getArg();
          Type _type = _arg_1.getType();
          Object _compile = this.typeGenerator.compile(_type);
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
          EffectFullArgument _arg_2 = _value_5.getArg();
          Type _type_1 = _arg_2.getType();
          Object _compile_3 = this.typeGenerator.compile(_type_1);
          _builder.append(_compile_3, "\t\t\t");
          _builder.append(" ");
          EffectFullFunctionDefinition _value_6 = pft.getValue();
          EffectFullArgument _arg_3 = _value_6.getArg();
          String _name_1 = _arg_3.getName();
          _builder.append(_name_1, "\t\t\t");
          _builder.append(") {");
          _builder.newLineIfNotEmpty();
          _builder.append("\t\t\t\t");
          _builder.append("return ");
          EffectFullFunctionDefinition _value_7 = pft.getValue();
          FunctionBodyEffectFull _functionBody_1 = _value_7.getFunctionBody();
          EffectFullFunctionDefinition _value_8 = pft.getValue();
          EffectFullArgument _arg_4 = _value_8.getArg();
          String _compileIO = this.EffectFullFunctionGenerator.compileIO(((CompositionFunctionBodyEffect) _functionBody_1), _arg_4);
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
            String _compileIO_1 = this.EffectFullFunctionGenerator.compileIO(((CompositionFunctionBodyEffect) _functionBody_2), null);
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
    return _builder;
  }
}
