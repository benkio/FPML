package it.unibo.generator;

import com.google.common.base.Objects;
import it.unibo.fPML.AdditionalEffectFullArgument;
import it.unibo.fPML.ApplyF;
import it.unibo.fPML.ApplyFFactor;
import it.unibo.fPML.ApplyFIO;
import it.unibo.fPML.ApplyFIOFactor;
import it.unibo.fPML.Argument;
import it.unibo.fPML.CompositionFunctionBodyEffect;
import it.unibo.fPML.CompositionFunctionBodyEffectFullFactor;
import it.unibo.fPML.EffectFullArgument;
import it.unibo.fPML.EffectFullBodyContent;
import it.unibo.fPML.EffectFullData;
import it.unibo.fPML.EffectFullExpression;
import it.unibo.fPML.EffectFullFunction;
import it.unibo.fPML.EffectFullFunctionBlock;
import it.unibo.fPML.EffectFullFunctionDefinition;
import it.unibo.fPML.EffectFullFunctionType;
import it.unibo.fPML.EffectFullPrimitive;
import it.unibo.fPML.EffectFullType;
import it.unibo.fPML.EffectFullValue;
import it.unibo.fPML.EmptyFunctionBody;
import it.unibo.fPML.Equals;
import it.unibo.fPML.Expression;
import it.unibo.fPML.ExtractEffectFull;
import it.unibo.fPML.ExtractPure;
import it.unibo.fPML.FPMLFactory;
import it.unibo.fPML.FunctionBodyEffectFull;
import it.unibo.fPML.FunctionBodyPure;
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
import it.unibo.fPML.MainFunc;
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
import it.unibo.fPML.PureFunction;
import it.unibo.fPML.PureFunctionDefinition;
import it.unibo.fPML.PureFunctionType;
import it.unibo.fPML.PureLambda;
import it.unibo.fPML.PureValue;
import it.unibo.fPML.RightAlgebraic;
import it.unibo.fPML.RightAlgebraicIO;
import it.unibo.fPML.Times;
import it.unibo.fPML.Type;
import it.unibo.fPML.UnitType;
import it.unibo.fPML.ValueType;
import it.unibo.generator.FPMLGenerator;
import it.unibo.generator.TypeGenerator;
import it.unibo.generator.ValueEffectFullFunctionCommonGenerator;
import it.unibo.generator.ValuePureFunctionCommonGenerator;
import it.unibo.validation.utilitiesFunctions.Others;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Functions.Function2;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class EffectFullFunctionGenerator {
  private final TypeGenerator typeGenerator = new TypeGenerator();
  
  private final ValuePureFunctionCommonGenerator commonPureFunctions = new ValuePureFunctionCommonGenerator();
  
  private final ValueEffectFullFunctionCommonGenerator commonEffectFullFunctions = new ValueEffectFullFunctionCommonGenerator();
  
  public CharSequence compile(final EffectFullFunctionBlock effb) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    String _basePackageJava = FPMLGenerator.basePackageJava();
    _builder.append(_basePackageJava, "");
    _builder.append("Effectfull;");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("import ");
    String _basePackageJava_1 = FPMLGenerator.basePackageJava();
    _builder.append(_basePackageJava_1, "");
    _builder.append("Pure.Data.*;");
    _builder.newLineIfNotEmpty();
    _builder.append("import fj.data.*;");
    _builder.newLine();
    _builder.append("import fj.*;");
    _builder.newLine();
    _builder.append("import ");
    String _basePackageJava_2 = FPMLGenerator.basePackageJava();
    _builder.append(_basePackageJava_2, "");
    _builder.append("Effectfull.Data.*;");
    _builder.newLineIfNotEmpty();
    _builder.append("import ");
    String _basePackageJava_3 = FPMLGenerator.basePackageJava();
    _builder.append(_basePackageJava_3, "");
    _builder.append("Pure.*;");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("public class EffectFullFunctionDefinitions {");
    _builder.newLine();
    {
      EList<EffectFullFunctionDefinition> _features = effb.getFeatures();
      for(final EffectFullFunctionDefinition f : _features) {
        _builder.append("\t");
        String _compile = this.compile(f);
        _builder.append(_compile, "\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("}");
    return _builder;
  }
  
  public String compile(final EffectFullFunctionDefinition pf) {
    String _name = pf.getName();
    boolean _notEquals = (!Objects.equal(_name, "main"));
    if (_notEquals) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("public static ");
      IOType _returnType = pf.getReturnType();
      Object _compile = this.typeGenerator.compile(_returnType);
      _builder.append(_compile, "");
      _builder.append(" ");
      String _name_1 = pf.getName();
      _builder.append(_name_1, "");
      _builder.append(" (");
      Argument _arg = pf.getArg();
      Type _argumentType = Others.getArgumentType(_arg);
      Object _compile_1 = this.typeGenerator.compile(_argumentType);
      _builder.append(_compile_1, "");
      _builder.append(" ");
      Argument _arg_1 = pf.getArg();
      String _argumentName = Others.getArgumentName(_arg_1);
      _builder.append(_argumentName, "");
      _builder.append("){");
      _builder.newLineIfNotEmpty();
      {
        FunctionBodyEffectFull _functionBody = pf.getFunctionBody();
        if ((_functionBody instanceof EmptyFunctionBody)) {
          _builder.append("\t");
          _builder.append("throw new UnsupportedOperationException(\"TODO\");");
          _builder.newLine();
        } else {
          FunctionBodyEffectFull _functionBody_1 = pf.getFunctionBody();
          if ((_functionBody_1 instanceof CompositionFunctionBodyEffect)) {
            {
              AdditionalEffectFullArgument _higherOrderArg = pf.getHigherOrderArg();
              boolean _equals = Objects.equal(_higherOrderArg, null);
              if (_equals) {
                _builder.append("\t");
                _builder.append("return ");
                FunctionBodyEffectFull _functionBody_2 = pf.getFunctionBody();
                Argument _arg_2 = pf.getArg();
                String _compileIO = this.commonEffectFullFunctions.compileIO(((CompositionFunctionBodyEffect) _functionBody_2), _arg_2);
                _builder.append(_compileIO, "\t");
                _builder.append(";");
                _builder.newLineIfNotEmpty();
              } else {
                _builder.append("\t");
                _builder.append("return () -> { return ( ");
                AdditionalEffectFullArgument _higherOrderArg_1 = pf.getHigherOrderArg();
                Argument _arg2 = _higherOrderArg_1.getArg2();
                Type _argumentType_1 = Others.getArgumentType(_arg2);
                Object _compile_2 = this.typeGenerator.compile(_argumentType_1);
                _builder.append(_compile_2, "\t");
                _builder.append(" ");
                AdditionalEffectFullArgument _higherOrderArg_2 = pf.getHigherOrderArg();
                Argument _arg2_1 = _higherOrderArg_2.getArg2();
                String _argumentName_1 = Others.getArgumentName(_arg2_1);
                _builder.append(_argumentName_1, "\t");
                _builder.append(") -> ");
                FunctionBodyEffectFull _functionBody_3 = pf.getFunctionBody();
                Argument _arg_3 = pf.getArg();
                String _compileIO_1 = this.commonEffectFullFunctions.compileIO(((CompositionFunctionBodyEffect) _functionBody_3), _arg_3);
                _builder.append(_compileIO_1, "\t");
                _builder.append("; };");
                _builder.newLineIfNotEmpty();
              }
            }
          }
        }
      }
      _builder.append("}");
      return _builder.toString();
    } else {
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("public static void ");
      String _name_2 = pf.getName();
      _builder_1.append(_name_2, "");
      _builder_1.append("(String[] args){");
      _builder_1.newLineIfNotEmpty();
      {
        FunctionBodyEffectFull _functionBody_4 = pf.getFunctionBody();
        if ((_functionBody_4 instanceof EmptyFunctionBody)) {
          _builder_1.append("\t");
          _builder_1.append("throw new UnsupportedOperationException(\"TODO\");");
          _builder_1.newLine();
        } else {
          FunctionBodyEffectFull _functionBody_5 = pf.getFunctionBody();
          if ((_functionBody_5 instanceof CompositionFunctionBodyEffect)) {
            _builder_1.append("\t");
            _builder_1.append("IOW.lift(IOFunctions.ioUnit)");
            FunctionBodyEffectFull _functionBody_6 = pf.getFunctionBody();
            CharSequence _compileIOWalkthrough = this.compileIOWalkthrough(((CompositionFunctionBodyEffect) _functionBody_6));
            _builder_1.append(_compileIOWalkthrough, "\t");
            _builder_1.newLineIfNotEmpty();
          }
        }
      }
      _builder_1.append("\t");
      _builder_1.append(".safe().run().on((IOException e) -> { e.printStackTrace(); return Unit.unit(); });");
      _builder_1.newLine();
      _builder_1.append("}");
      return _builder_1.toString();
    }
  }
  
  public CharSequence compileIOWalkthrough(final CompositionFunctionBodyEffect cfbe) {
    StringConcatenation _builder = new StringConcatenation();
    EffectFullBodyContent _firstFunctionDefinitionFromCompositionBodyEffectFull = Others.getFirstFunctionDefinitionFromCompositionBodyEffectFull(cfbe);
    final Object firstElementCompiled = this.compileIOWalkthrough(_firstFunctionDefinitionFromCompositionBodyEffectFull);
    _builder.newLineIfNotEmpty();
    final Function2<String, CompositionFunctionBodyEffectFullFactor, String> _function = (String acc, CompositionFunctionBodyEffectFullFactor x) -> {
      Object _compileIOWalkThough = this.compileIOWalkThough(x);
      String _plus = (acc + _compileIOWalkThough);
      return (_plus + "\n\t");
    };
    final Function2<String, CompositionFunctionBodyEffectFullFactor, String> f = _function;
    _builder.newLineIfNotEmpty();
    EList<CompositionFunctionBodyEffectFullFactor> _functionChain = cfbe.getFunctionChain();
    String _plus = (firstElementCompiled + "\n\t");
    String _fold = IterableExtensions.<CompositionFunctionBodyEffectFullFactor, String>fold(_functionChain, _plus, f);
    _builder.append(_fold, "");
    return _builder;
  }
  
  public Object compileIOWalkThough(final CompositionFunctionBodyEffectFullFactor f) {
    final EffectFullBodyContent e = Others.getFunctionDefinitionFromEffectFullFactor(f);
    return this.compileIOWalkthrough(e);
  }
  
  public Object compileIOWalkthrough(final EffectFullBodyContent e) {
    Object _switchResult = null;
    boolean _matched = false;
    if (e instanceof EffectFullFunction) {
      _matched=true;
      _switchResult = this.compileIOWalkthrough(((EffectFullFunction)e));
    }
    if (!_matched) {
      if (e instanceof EffectFullPrimitive) {
        _matched=true;
        _switchResult = this.compileIOWalkthrough(((EffectFullPrimitive)e));
      }
    }
    if (!_matched) {
      if (e instanceof EffectFullExpression) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append(".append(");
        String _compile = this.commonEffectFullFunctions.compile(((EffectFullExpression)e));
        _builder.append(_compile, "");
        _builder.append(")");
        _switchResult = _builder;
      }
    }
    return _switchResult;
  }
  
  public Object compileIOWalkthrough(final EffectFullPrimitive efp) {
    Object _switchResult = null;
    boolean _matched = false;
    if (efp instanceof PrimitiveEffectFullFunction) {
      _matched=true;
      _switchResult = this.compileIOWalkthrough(((PrimitiveEffectFullFunction)efp));
    }
    if (!_matched) {
      if (efp instanceof PrimitiveEffectFullValue) {
        _matched=true;
        _switchResult = this.compileIOWalkthrough(((PrimitiveEffectFullValue)efp));
      }
    }
    return _switchResult;
  }
  
  public Object compileIOWalkthrough(final EffectFullFunction eff) {
    Object _switchResult = null;
    boolean _matched = false;
    if (eff instanceof EffectFullValue) {
      _matched=true;
      StringConcatenation _builder = new StringConcatenation();
      _builder.append(".append(EffectFullValue.");
      String _name = ((EffectFullValue)eff).getName();
      _builder.append(_name, "");
      _builder.append("())");
      _switchResult = _builder;
    }
    if (!_matched) {
      if (eff instanceof EffectFullFunctionDefinition) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append(".bind(EffectFullFunctionDefinitions::");
        String _name = ((EffectFullFunctionDefinition) eff).getName();
        _builder.append(_name, "");
        _builder.append(")");
        return _builder.toString();
      }
    }
    if (!_matched) {
      if (eff instanceof PrimitiveEffectFullFunction) {
        _matched=true;
        _switchResult = this.compileIOWalkthrough(((PrimitiveEffectFullFunction)eff));
      }
    }
    if (!_matched) {
      if (eff instanceof EffectFullArgument) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append(".append(IOFunctions.unit(");
        String _name = ((EffectFullArgument) eff).getName();
        _builder.append(_name, "");
        _builder.append("))");
        _switchResult = _builder;
      }
    }
    return _switchResult;
  }
  
  public Object compileIOWalkthrough(final PrimitiveEffectFullFunction pef) {
    Object _switchResult = null;
    boolean _matched = false;
    if (pef instanceof PrimitivePrint) {
      _matched=true;
      StringConcatenation _builder = new StringConcatenation();
      _builder.append(".bind(PrimitivesEffectFull::primitivePrint)");
      _switchResult = _builder;
    }
    if (!_matched) {
      if (pef instanceof LeftAlgebraicIO) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append(".bind(PrimitivesEffectFull::leftAlgebricIO)");
        _switchResult = _builder;
      }
    }
    if (!_matched) {
      if (pef instanceof RightAlgebraicIO) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append(".bind(PrimitivesEffectFull::rightAlgebricIO)");
        _switchResult = _builder;
      }
    }
    if (!_matched) {
      if (pef instanceof ApplyFIO) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append(".bind((");
        EffectFullFunctionType _functionType = ((ApplyFIO)pef).getFunctionType();
        Object _compile = this.typeGenerator.compile(_functionType);
        _builder.append(_compile, "");
        _builder.append(" f) -> f.f(IOFunctions.runSafe(");
        ApplyFIOFactor _value = ((ApplyFIO)pef).getValue();
        EffectFullBodyContent _valueFromApplyFIOFactor = Others.getValueFromApplyFIOFactor(_value);
        String _compileIO = this.commonEffectFullFunctions.compileIO(_valueFromApplyFIOFactor, null);
        _builder.append(_compileIO, "");
        _builder.append(")))");
        _switchResult = _builder;
      }
    }
    if (!_matched) {
      if (pef instanceof PrimitiveReturn) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _switchResult = _builder;
      }
    }
    if (!_matched) {
      if (pef instanceof ExtractEffectFull) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append(".bind((IEffectFullData");
        EffectFullData _data = ((ExtractEffectFull)pef).getData();
        EffectFullType _content = _data.getContent();
        Object _compile = this.typeGenerator.compile(_content);
        _builder.append(_compile, "");
        _builder.append(" d) -> d.getValue())");
        _switchResult = _builder;
      }
    }
    if (!_matched) {
      if (pef instanceof LiftPureFunction) {
        _matched=true;
        _switchResult = this.compileIOWalkthrough(((LiftPureFunction)pef));
      }
    }
    if (!_matched) {
      if (pef instanceof LiftEffectFullFunction) {
        _matched=true;
        _switchResult = this.compileIOWalkthrough(((LiftEffectFullFunction)pef));
      }
    }
    if (!_matched) {
      if (pef instanceof IsLeftEffectFull) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append(".bind(PrimitivesEffectFull::isLeft)");
        _switchResult = _builder;
      }
    }
    if (!_matched) {
      if (pef instanceof IsRightEffectFull) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append(".bind(PrimitivesEffectFull::isRight)");
        _switchResult = _builder;
      }
    }
    return _switchResult;
  }
  
  public Object compileIOWalkthrough(final LiftEffectFullFunction lef) {
    Object _switchResult = null;
    boolean _matched = false;
    if (lef instanceof PrimitiveEffectFullFunction) {
      _matched=true;
      _switchResult = this.compileIOWalkthrough(((PrimitiveEffectFullFunction) lef));
    }
    if (!_matched) {
      if (lef instanceof EffectFullFunction) {
        _matched=true;
        _switchResult = this.compileIOWalkthrough(((EffectFullFunction) lef));
      }
    }
    return _switchResult;
  }
  
  public CharSequence compileIOWalkthrough(final LiftPureFunction function) {
    CharSequence _xblockexpression = null;
    {
      final PureFunction innerFunction = Others.getPureFunctionFromLiftPureFunction(function);
      CharSequence _switchResult = null;
      boolean _matched = false;
      if (innerFunction instanceof PrimitivePureFunction) {
        _matched=true;
        _switchResult = this.compileIOWalkthrough(((PrimitivePureFunction) innerFunction));
      }
      if (!_matched) {
        if (innerFunction instanceof PureFunction) {
          _matched=true;
          _switchResult = this.compileIOWalkthrough(((PureFunction) innerFunction));
        }
      }
      _xblockexpression = _switchResult;
    }
    return _xblockexpression;
  }
  
  public CharSequence compileIOWalkthrough(final PrimitiveEffectFullValue pev) {
    CharSequence _switchResult = null;
    boolean _matched = false;
    if (pev instanceof PrimitiveRandom) {
      _matched=true;
      StringConcatenation _builder = new StringConcatenation();
      _builder.append(".append(PrimitivesEffectFull.primitiveRandom())");
      _switchResult = _builder;
    }
    if (!_matched) {
      if (pev instanceof PrimitiveTime) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append(".append(PrimitivesEffectFull.primitiveTime())");
        _switchResult = _builder;
      }
    }
    return _switchResult;
  }
  
  public CharSequence compileIOWalkthrough(final PrimitivePureFunction ppf) {
    CharSequence _switchResult = null;
    boolean _matched = false;
    if (ppf instanceof IntToString) {
      _matched=true;
      StringConcatenation _builder = new StringConcatenation();
      _builder.append(".map(Primitives::intToString)");
      _switchResult = _builder;
    }
    if (!_matched) {
      if (ppf instanceof IntPow) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append(".map(Primitives::intPow)");
        _switchResult = _builder;
      }
    }
    if (!_matched) {
      if (ppf instanceof Plus) {
        _matched=true;
        _switchResult = ".map(Primitives::plus)";
      }
    }
    if (!_matched) {
      if (ppf instanceof Minus) {
        _matched=true;
        _switchResult = ".map(Primitives::minus)";
      }
    }
    if (!_matched) {
      if (ppf instanceof Times) {
        _matched=true;
        _switchResult = ".map(Primitives::times)";
      }
    }
    if (!_matched) {
      if (ppf instanceof Mod) {
        _matched=true;
        _switchResult = ".map(Primitives::mod)";
      }
    }
    if (!_matched) {
      if (ppf instanceof ApplyF) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append(".map((");
        PureFunctionType _functionType = ((ApplyF)ppf).getFunctionType();
        Object _compile = this.typeGenerator.compile(_functionType);
        _builder.append(_compile, "");
        _builder.append(" f) -> f.f(");
        ApplyFFactor _value = ((ApplyF)ppf).getValue();
        String _compileApplyFFactor = this.commonPureFunctions.compileApplyFFactor(_value, "", true);
        _builder.append(_compileApplyFFactor, "");
        _builder.append("))");
        _switchResult = _builder;
      }
    }
    if (!_matched) {
      if (ppf instanceof LeftAlgebraic) {
        _matched=true;
        _switchResult = ".map(Primitives::leftAlgebraic)";
      }
    }
    if (!_matched) {
      if (ppf instanceof RightAlgebraic) {
        _matched=true;
        _switchResult = ".map(Primitives::rightAlgebric)";
      }
    }
    if (!_matched) {
      if (ppf instanceof Equals) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append(".map(Primitives::equalsCurryng)");
        _switchResult = _builder;
      }
    }
    if (!_matched) {
      if (ppf instanceof MinorEquals) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append(".map(Primitives::minorEquals)");
        _switchResult = _builder;
      }
    }
    if (!_matched) {
      if (ppf instanceof MajorEquals) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append(".map(Primitives::majorEquals)");
        _switchResult = _builder;
      }
    }
    if (!_matched) {
      if (ppf instanceof Minor) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append(".map(Primitives::minor)");
        _switchResult = _builder;
      }
    }
    if (!_matched) {
      if (ppf instanceof Major) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append(".map(Primitives::major)");
        _switchResult = _builder;
      }
    }
    if (!_matched) {
      if (ppf instanceof LogicAnd) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append(".map(Primitives::logicAnd)");
        _switchResult = _builder;
      }
    }
    if (!_matched) {
      if (ppf instanceof LogicOr) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append(".map(Primitives::logicOr)");
        _switchResult = _builder;
      }
    }
    if (!_matched) {
      if (ppf instanceof ExtractPure) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append(".bind((IPureData<");
        PureData _data = ((ExtractPure)ppf).getData();
        ValueType _content = _data.getContent();
        Object _compile = this.typeGenerator.compile(_content);
        _builder.append(_compile, "");
        _builder.append("> d) -> d.getValue())");
        _switchResult = _builder;
      }
    }
    if (!_matched) {
      if (ppf instanceof IsLeftPure) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append(".map(Primitives::isLeft)");
        _switchResult = _builder;
      }
    }
    if (!_matched) {
      if (ppf instanceof IsRightPure) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append(".map(Primitives::isRight)");
        _switchResult = _builder;
      }
    }
    return _switchResult;
  }
  
  public CharSequence compileIOWalkthrough(final PureFunction pf) {
    CharSequence _switchResult = null;
    boolean _matched = false;
    if (pf instanceof PureArgument) {
      _matched=true;
      StringConcatenation _builder = new StringConcatenation();
      _builder.append(".append(");
      String _name = ((PureArgument)pf).getName();
      _builder.append(_name, "");
      _builder.append(")");
      _switchResult = _builder;
    }
    if (!_matched) {
      if (pf instanceof Expression) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append(".append(");
        String _compile = this.commonPureFunctions.compile(((Expression)pf));
        _builder.append(_compile, "");
        _builder.append(")");
        _switchResult = _builder;
      }
    }
    if (!_matched) {
      if (pf instanceof PureValue) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append(".append(IOFunctions.unit(PureValue.");
        String _name = ((PureValue) pf).getName();
        _builder.append(_name, "");
        _builder.append("()))");
        return _builder.toString();
      }
    }
    if (!_matched) {
      if (pf instanceof PureLambda) {
        _matched=true;
        CharSequence _xifexpression = null;
        PureArgument _arg = ((PureLambda)pf).getArg();
        boolean _equals = Objects.equal(_arg, null);
        if (_equals) {
          StringConcatenation _builder = new StringConcatenation();
          _builder.append(".bind(() -> ");
          FunctionBodyPure _functionBody = ((PureLambda)pf).getFunctionBody();
          String _compile = this.commonPureFunctions.compile(_functionBody, "", true);
          _builder.append(_compile, "");
          _builder.append(")");
          _xifexpression = _builder;
        } else {
          StringConcatenation _builder_1 = new StringConcatenation();
          _builder_1.append(".bind((");
          PureArgument _arg_1 = ((PureLambda)pf).getArg();
          ValueType _type = _arg_1.getType();
          Object _compile_1 = this.typeGenerator.compile(_type);
          _builder_1.append(_compile_1, "");
          _builder_1.append(" ");
          PureArgument _arg_2 = ((PureLambda)pf).getArg();
          String _name = _arg_2.getName();
          _builder_1.append(_name, "");
          _builder_1.append(") -> ");
          FunctionBodyPure _functionBody_1 = ((PureLambda)pf).getFunctionBody();
          PureArgument _arg_3 = ((PureLambda)pf).getArg();
          String _name_1 = _arg_3.getName();
          String _compile_2 = this.commonPureFunctions.compile(_functionBody_1, _name_1, true);
          _builder_1.append(_compile_2, "");
          _builder_1.append(")");
          _xifexpression = _builder_1;
        }
        _switchResult = _xifexpression;
      }
    }
    if (!_matched) {
      if (pf instanceof PureFunctionDefinition) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append(".map(PureFunctionDefinitions::");
        String _name = ((PureFunctionDefinition) pf).getName();
        _builder.append(_name, "");
        _builder.append(")");
        return _builder.toString();
      }
    }
    return _switchResult;
  }
  
  public CharSequence compile(final MainFunc mf) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    String _basePackageJava = FPMLGenerator.basePackageJava();
    _builder.append(_basePackageJava, "");
    _builder.append("Effectfull;");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("import ");
    String _basePackageJava_1 = FPMLGenerator.basePackageJava();
    _builder.append(_basePackageJava_1, "");
    _builder.append("Pure.Data.*;");
    _builder.newLineIfNotEmpty();
    _builder.append("import fj.data.*;");
    _builder.newLine();
    _builder.append("import java.io.IOException;");
    _builder.newLine();
    _builder.append("import fj.Unit;");
    _builder.newLine();
    _builder.append("import fj.F;");
    _builder.newLine();
    _builder.append("import ");
    String _basePackageJava_2 = FPMLGenerator.basePackageJava();
    _builder.append(_basePackageJava_2, "");
    _builder.append("Effectfull.Data.*;");
    _builder.newLineIfNotEmpty();
    _builder.append("import ");
    String _basePackageJava_3 = FPMLGenerator.basePackageJava();
    _builder.append(_basePackageJava_3, "");
    _builder.append("Pure.*;");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("public class EntryPoint {");
    _builder.newLine();
    _builder.append("\t");
    String _compileMain = this.compileMain(mf);
    _builder.append(_compileMain, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    return _builder;
  }
  
  public String compileMain(final MainFunc mf) {
    String _xblockexpression = null;
    {
      final IOType effectFullMainReturnType = FPMLFactory.eINSTANCE.createIOType();
      UnitType _createUnitType = FPMLFactory.eINSTANCE.createUnitType();
      effectFullMainReturnType.setType(_createUnitType);
      final EffectFullFunctionDefinition effectFullMain = FPMLFactory.eINSTANCE.createEffectFullFunctionDefinition();
      FunctionBodyEffectFull _functionBody = mf.getFunctionBody();
      effectFullMain.setFunctionBody(_functionBody);
      effectFullMain.setReturnType(effectFullMainReturnType);
      effectFullMain.setName("main");
      _xblockexpression = this.compile(effectFullMain);
    }
    return _xblockexpression;
  }
}
