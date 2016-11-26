package it.unibo.generator;

import it.unibo.fPML.PureAdtType;
import it.unibo.fPML.PureData;
import it.unibo.generator.FPMLGenerator;
import it.unibo.generator.TypeGenerator;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class DataGenerator {
  private final TypeGenerator typeGenerator = new TypeGenerator();
  
  public String compile(final PureData d) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    String _basePackageJava = FPMLGenerator.basePackageJava();
    _builder.append(_basePackageJava, "");
    _builder.append("Pure.Data;");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("import fj.data.*;");
    _builder.newLine();
    _builder.append("import fj.P2;");
    _builder.newLine();
    _builder.append("import fj.F;");
    _builder.newLine();
    _builder.append("import fj.Unit;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public class ");
    String _name = d.getName();
    _builder.append(_name, "");
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("public final ");
    PureAdtType _content = d.getContent();
    Object _pureAdtTypeCompile = this.typeGenerator.pureAdtTypeCompile(((PureAdtType) _content));
    _builder.append(_pureAdtTypeCompile, "\t");
    _builder.append(" value;");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public ");
    String _name_1 = d.getName();
    _builder.append(_name_1, "\t");
    _builder.append("(");
    PureAdtType _content_1 = d.getContent();
    Object _pureAdtTypeCompile_1 = this.typeGenerator.pureAdtTypeCompile(((PureAdtType) _content_1));
    _builder.append(_pureAdtTypeCompile_1, "\t");
    _builder.append(" value){");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("this.value = value;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    return _builder.toString();
  }
}
