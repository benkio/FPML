package it.unibo.generator;

import it.unibo.generator.FPMLGenerator;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class PrimitiveGenerator {
  public CharSequence compilePure() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    String _basePackageJava = FPMLGenerator.basePackageJava();
    _builder.append(_basePackageJava, "");
    _builder.append("Pure;");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("import fj.*;");
    _builder.newLine();
    _builder.append("import fj.data.*;");
    _builder.newLine();
    _builder.append("public class Primitives {");
    _builder.newLine();
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
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public static Integer intPow(Integer x) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("return x * x;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public static String intToString(Integer x) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("return String.valueOf(x);");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public static <A,B> A leftPair(P2<A,B> pair){");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("return pair._1();");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public static <A,B> B rightPair(P2<A,B> pair){");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("return pair._2();");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence compileEffectFull() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    String _basePackageJava = FPMLGenerator.basePackageJava();
    _builder.append(_basePackageJava, "");
    _builder.append("Effectfull;");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("import fj.*;");
    _builder.newLine();
    _builder.append("import fj.data.*;");
    _builder.newLine();
    _builder.append("import java.util.Random;");
    _builder.newLine();
    _builder.append("import java.text.SimpleDateFormat;");
    _builder.newLine();
    _builder.append("import java.util.Date;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public class PrimitivesEffectFull {");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public static IO<Unit> primitivePrint(String s) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("return IOFunctions.stdoutPrintln(s);");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("} ");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public static IO<Integer> primitiveRandom() {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("return () -> new Random().nextInt();");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public static IO<String> primitiveTime() {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("return IOFunctions.unit(new SimpleDateFormat(\"yyyy/MM/dd HH:mm:ss\").format(new Date()));");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public static <A> IO<A> primitiveReturn(A x) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("return IOFunctions.unit(x);");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public static <A,B> A leftPairIO(P2<A,B> pair){");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("return pair._1();");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public static <A,B> B rightPairIO(P2<A,B> pair){");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("return pair._2();");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
}
