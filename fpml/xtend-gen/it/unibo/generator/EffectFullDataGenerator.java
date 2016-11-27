package it.unibo.generator;

import it.unibo.fPML.EffectFullAdtType;
import it.unibo.fPML.EffectFullData;
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
    EffectFullAdtType _content = d.getContent();
    CharSequence _effectFullAdtTypeCompile = this.typeGenerator.effectFullAdtTypeCompile(((EffectFullAdtType) _content));
    _builder.append(_effectFullAdtTypeCompile, "\t");
    _builder.append(" value;");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public ");
    String _name_1 = d.getName();
    _builder.append(_name_1, "\t");
    _builder.append("(");
    EffectFullAdtType _content_1 = d.getContent();
    CharSequence _effectFullAdtTypeCompile_1 = this.typeGenerator.effectFullAdtTypeCompile(((EffectFullAdtType) _content_1));
    _builder.append(_effectFullAdtTypeCompile_1, "\t");
    _builder.append(" value){");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("this.value = value;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    return _builder;
  }
}
