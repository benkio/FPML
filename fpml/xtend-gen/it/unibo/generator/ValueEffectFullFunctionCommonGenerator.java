package it.unibo.generator;

import com.google.common.base.Objects;
import it.unibo.fPML.CompositionFunctionBodyEffect;
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
import it.unibo.fPML.Expression;
import it.unibo.fPML.IOExpression;
import it.unibo.fPML.IOType;
import it.unibo.fPML.RecursiveEffectFullExpression;
import it.unibo.fPML.Type;
import it.unibo.generator.TypeGenerator;
import it.unibo.generator.ValuePureFunctionCommonGenerator;
import it.unibo.validation.utilitiesFunctions.Others;
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
      if (e instanceof RecursiveEffectFullExpression) {
        _matched=true;
        EffectFullExpression _innerValue = ((RecursiveEffectFullExpression)e).getInnerValue();
        String _compile = this.compile(((EffectFullExpression) _innerValue));
        String _plus = ("IOFunctions.unit(" + _compile);
        return (_plus + ")");
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
      if (v instanceof RecursiveEffectFullExpression) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("IOFunctions.unit(");
        EffectFullExpression _innerValue = ((RecursiveEffectFullExpression)v).getInnerValue();
        Type _type = ((IOType) d).getType();
        Object _compileAdtValue = this.compileAdtValue(((EffectFullExpression) _innerValue), ((EffectFullType) _type));
        _builder.append(_compileAdtValue, "");
        _builder.append(")");
        _switchResult = _builder;
      }
    }
    return _switchResult;
  }
  
  public String compile(final EffectFullFunctionType pft) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field type is undefined for the type Argument"
      + "\nThe method or field type is undefined for the type Argument"
      + "\nType mismatch: cannot convert from Argument to EffectFullArgument");
  }
  
  public String compileIO(final CompositionFunctionBodyEffect cfbe, final EffectFullArgument arg) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method compileIO(EffectFullReference, String) from the type ValueEffectFullFunctionCommonGenerator refers to the missing type EffectFullReference"
      + "\nThe method compileIO(EffectFullReference, String) from the type ValueEffectFullFunctionCommonGenerator refers to the missing type EffectFullReference");
  }
  
  public String compileIO(final /* EffectFullReference */Object e, final String valueName) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method effectFullReference(EffectFullReference) is undefined for the type Class<GetReturnType>"
      + "\nThe method compileIO(EffectFullReference, String) from the type ValueEffectFullFunctionCommonGenerator refers to the missing type EffectFullReference"
      + "\nfunctionType cannot be resolved"
      + "\nvalue cannot be resolved"
      + "\nfunctionType cannot be resolved"
      + "\nargType cannot be resolved"
      + "\nvalue cannot be resolved"
      + "\ntype cannot be resolved"
      + "\ndata cannot be resolved"
      + "\nname cannot be resolved"
      + "\ndata cannot be resolved"
      + "\ncontent cannot be resolved"
      + "\ndata cannot be resolved"
      + "\nname cannot be resolved");
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
