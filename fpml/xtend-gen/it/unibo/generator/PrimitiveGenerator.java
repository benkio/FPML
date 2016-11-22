package it.unibo.generator;

import it.unibo.generator.FPMLGenerator;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class PrimitiveGenerator {
  public CharSequence compile() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    String _basePackageJava = FPMLGenerator.basePackageJava();
    _builder.append(_basePackageJava, "");
    _builder.append("Pure;");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("import fj.F;");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("public class Primitives {");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public static F<Integer, Integer> plus(int x) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("return (Integer y) -> x + y;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public static F<Integer, Integer> minus(int x) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("return (Integer y) -> x - y;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public static F<Integer, Integer> times(int x) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("return (Integer y) -> x * y;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public static F<Integer, Integer> mod(int x) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("return (Integer y) -> x % y;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
}
