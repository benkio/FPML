package it.unibo.generator;

import it.unibo.fPML.PureData;
import it.unibo.fPML.ValueType;
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
    _builder.append("import fj.*;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public class ");
    String _name = d.getName();
    _builder.append(_name, "");
    _builder.append(" implements IPureData<");
    ValueType _content = d.getContent();
    Object _compile = this.typeGenerator.compile(_content);
    _builder.append(_compile, "");
    _builder.append("> {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("private final ");
    ValueType _content_1 = d.getContent();
    Object _compile_1 = this.typeGenerator.compile(_content_1);
    _builder.append(_compile_1, "\t");
    _builder.append(" value;");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public ");
    String _name_1 = d.getName();
    _builder.append(_name_1, "\t");
    _builder.append("(");
    ValueType _content_2 = d.getContent();
    Object _compile_2 = this.typeGenerator.compile(_content_2);
    _builder.append(_compile_2, "\t");
    _builder.append(" value){");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("this.value = value;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public ");
    ValueType _content_3 = d.getContent();
    Object _compile_3 = this.typeGenerator.compile(_content_3);
    _builder.append(_compile_3, "\t");
    _builder.append(" getValue() {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("return value;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    return _builder.toString();
  }
}
