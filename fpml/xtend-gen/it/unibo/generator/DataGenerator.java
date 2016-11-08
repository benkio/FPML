package it.unibo.generator;

import it.unibo.fPML.Adt;
import it.unibo.fPML.Argument;
import it.unibo.fPML.Data;
import it.unibo.fPML.ValueType;
import it.unibo.generator.FPMLGenerator;
import it.unibo.generator.TypeGenerator;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class DataGenerator {
  private final TypeGenerator typeGenerator = new TypeGenerator();
  
  public CharSequence compile(final Data d) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    String _basePackageJava = FPMLGenerator.getBasePackageJava();
    _builder.append(_basePackageJava, "");
    _builder.append("Pure.Data;");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("import ");
    String _basePackageJava_1 = FPMLGenerator.getBasePackageJava();
    _builder.append(_basePackageJava_1, "");
    _builder.append("Pure.Data.*;");
    _builder.newLineIfNotEmpty();
    _builder.append("import fj.data.*;");
    _builder.newLine();
    _builder.append("import fj.P2;");
    _builder.newLine();
    _builder.append("import fj.Unit;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public class ");
    String _name = d.getName();
    _builder.append(_name, "");
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    {
      Adt _content = d.getContent();
      if ((_content instanceof ValueType)) {
        _builder.append("\t");
        _builder.append("public final ");
        Adt _content_1 = d.getContent();
        String _dataCompile = this.typeGenerator.dataCompile(((ValueType) _content_1));
        _builder.append(_dataCompile, "\t");
        _builder.newLineIfNotEmpty();
      } else {
        Adt _content_2 = d.getContent();
        if ((_content_2 instanceof Argument)) {
          _builder.append("\t");
          _builder.append("public final ");
          Adt _content_3 = d.getContent();
          CharSequence _compile = this.typeGenerator.compile(_content_3);
          _builder.append(_compile, "\t");
          _builder.append(";");
          _builder.newLineIfNotEmpty();
          _builder.append("\t");
          _builder.append("\t    \t");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("public ");
          String _name_1 = d.getName();
          _builder.append(_name_1, "\t");
          _builder.append("(");
          Adt _content_4 = d.getContent();
          CharSequence _compile_1 = this.typeGenerator.compile(_content_4);
          _builder.append(_compile_1, "\t");
          _builder.append("){");
          _builder.newLineIfNotEmpty();
          _builder.append("\t");
          _builder.append("\t");
          _builder.append("this.");
          Adt _content_5 = d.getContent();
          String _name_2 = ((Argument) _content_5).getName();
          _builder.append(_name_2, "\t\t");
          _builder.append(" = ");
          Adt _content_6 = d.getContent();
          String _name_3 = ((Argument) _content_6).getName();
          _builder.append(_name_3, "\t\t");
          _builder.append(";");
          _builder.newLineIfNotEmpty();
          _builder.append("\t");
          _builder.append("}");
          _builder.newLine();
        } else {
          _builder.append("\t");
          _builder.append("public final ");
          Adt _content_7 = d.getContent();
          CharSequence _compile_2 = this.typeGenerator.compile(_content_7);
          _builder.append(_compile_2, "\t");
          _builder.append(" value;");
          _builder.newLineIfNotEmpty();
          _builder.append("\t");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("public ");
          String _name_4 = d.getName();
          _builder.append(_name_4, "\t");
          _builder.append("(");
          Adt _content_8 = d.getContent();
          CharSequence _compile_3 = this.typeGenerator.compile(_content_8);
          _builder.append(_compile_3, "\t");
          _builder.append(" value){");
          _builder.newLineIfNotEmpty();
          _builder.append("\t");
          _builder.append("\t");
          _builder.append("this.value = value;");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("}");
          _builder.newLine();
        }
      }
    }
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
}
