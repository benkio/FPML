package it.unibo.generator;

import it.unibo.fPML.EffectFullData;
import it.unibo.fPML.EffectFullType;
import it.unibo.fPML.Type;
import it.unibo.generator.FPMLGenerator;
import it.unibo.generator.TypeGenerator;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class EffectFullDataGenerator {
  private final TypeGenerator typeGenerator = new TypeGenerator();
  
  public CharSequence compile(final EffectFullData d) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    String _basePackageJava = FPMLGenerator.basePackageJava();
    _builder.append(_basePackageJava, "");
    _builder.append("Effectfull.Data;");
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
    _builder.append(" implements IEffectFullData<");
    EffectFullType _content = d.getContent();
    Object _compile = this.typeGenerator.compile(((Type) _content));
    _builder.append(_compile, "");
    _builder.append("> {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("private final ");
    EffectFullType _content_1 = d.getContent();
    Object _compile_1 = this.typeGenerator.compile(((Type) _content_1));
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
    EffectFullType _content_2 = d.getContent();
    Object _compile_2 = this.typeGenerator.compile(((Type) _content_2));
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
    EffectFullType _content_3 = d.getContent();
    Object _compile_3 = this.typeGenerator.compile(((Type) _content_3));
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
    return _builder;
  }
}
