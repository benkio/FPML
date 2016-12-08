package it.unibo.generator;

import com.google.common.base.Objects;
import it.unibo.fPML.AdditionalPureArgument;
import it.unibo.fPML.FunctionBodyPure;
import it.unibo.fPML.PureArgument;
import it.unibo.fPML.PureFunctionBlock;
import it.unibo.fPML.PureFunctionDefinition;
import it.unibo.fPML.PureLambda;
import it.unibo.fPML.PureValue;
import it.unibo.fPML.ValueType;
import it.unibo.generator.FPMLGenerator;
import it.unibo.generator.TypeGenerator;
import it.unibo.generator.ValuePureFunctionCommonGenerator;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class PureFunctionGenerator {
  private final TypeGenerator typeGenerator = new TypeGenerator();
  
  private final ValuePureFunctionCommonGenerator commonFunctions = new ValuePureFunctionCommonGenerator();
  
  public CharSequence compile(final PureFunctionBlock pfb) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    String _basePackageJava = FPMLGenerator.basePackageJava();
    _builder.append(_basePackageJava, "");
    _builder.append("Pure;");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("import ");
    String _basePackageJava_1 = FPMLGenerator.basePackageJava();
    _builder.append(_basePackageJava_1, "");
    _builder.append("Pure.Data.*;");
    _builder.newLineIfNotEmpty();
    _builder.append("import fj.*;");
    _builder.newLine();
    _builder.append("import fj.data.*;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public class PureFunctionDefinitions {");
    _builder.newLine();
    {
      EList<PureFunctionDefinition> _features = pfb.getFeatures();
      for(final PureFunctionDefinition f : _features) {
        _builder.append("\t");
        String _compile = this.compile(f);
        _builder.append(_compile, "\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public String compile(final PureFunctionDefinition pf) {
    if (((!(pf instanceof PureValue)) && (!(pf instanceof PureLambda)))) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.newLine();
      _builder.append("public static ");
      ValueType _returnType = pf.getReturnType();
      Object _compile = this.typeGenerator.compile(_returnType);
      _builder.append(_compile, "");
      _builder.append(" ");
      String _name = pf.getName();
      _builder.append(_name, "");
      _builder.append(" (");
      PureArgument _arg = pf.getArg();
      CharSequence _compile_1 = this.typeGenerator.compile(_arg);
      _builder.append(_compile_1, "");
      _builder.append(" ){");
      _builder.newLineIfNotEmpty();
      _builder.append("\t");
      String _xifexpression = null;
      AdditionalPureArgument _higherOrderArg = pf.getHigherOrderArg();
      boolean _notEquals = (!Objects.equal(_higherOrderArg, null));
      if (_notEquals) {
        AdditionalPureArgument _higherOrderArg_1 = pf.getHigherOrderArg();
        PureArgument _arg2 = _higherOrderArg_1.getArg2();
        CharSequence _compile_2 = this.typeGenerator.compile(_arg2);
        String _plus = ("return (" + _compile_2);
        _xifexpression = (_plus + ") -> {");
      }
      _builder.append(_xifexpression, "\t");
      _builder.newLineIfNotEmpty();
      _builder.append("\t");
      _builder.append("return ");
      FunctionBodyPure _functionBody = pf.getFunctionBody();
      PureArgument _arg_1 = pf.getArg();
      String _name_1 = _arg_1.getName();
      String _compile_3 = this.commonFunctions.compile(_functionBody, _name_1, false);
      _builder.append(_compile_3, "\t");
      _builder.append(";");
      _builder.newLineIfNotEmpty();
      _builder.append("\t");
      String _xifexpression_1 = null;
      AdditionalPureArgument _higherOrderArg_2 = pf.getHigherOrderArg();
      boolean _notEquals_1 = (!Objects.equal(_higherOrderArg_2, null));
      if (_notEquals_1) {
        _xifexpression_1 = "};";
      }
      _builder.append(_xifexpression_1, "\t");
      _builder.newLineIfNotEmpty();
      _builder.append("}");
      return _builder.toString();
    }
    return null;
  }
}
