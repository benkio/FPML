package it.unibo.generator;

import it.unibo.generator.FPMLGenerator;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class DataInterfaceGenerator {
  public String compileEffectFullInterface() {
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
    _builder.append("Pure.Data.*;");
    _builder.newLineIfNotEmpty();
    _builder.append("import fj.data.*;");
    _builder.newLine();
    _builder.append("import fj.*;");
    _builder.newLine();
    _builder.append("import it.unibo.Pure.Primitives;");
    _builder.newLine();
    _builder.append("import it.unibo.Pure.PureFunctionDefinitions;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public interface IEffectFullData<A> {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("A getValue();");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }
  
  public String compilePureInterface() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    String _basePackageJava = FPMLGenerator.basePackageJava();
    _builder.append(_basePackageJava, "");
    _builder.append("Pure.Data;");
    _builder.newLineIfNotEmpty();
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
    _builder.append("import it.unibo.Pure.Primitives;");
    _builder.newLine();
    _builder.append("import it.unibo.Pure.PureFunctionDefinitions;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public interface IPureData<A> {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("A getValue();");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }
}
