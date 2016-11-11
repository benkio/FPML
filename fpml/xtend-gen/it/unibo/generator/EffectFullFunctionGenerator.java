package it.unibo.generator;

import it.unibo.fPML.ChainElement;
import it.unibo.fPML.CompositionFunctionBodyEffect;
import it.unibo.fPML.EffectFullBlock;
import it.unibo.fPML.EffectFullFunctionDefinition;
import it.unibo.generator.FPMLGenerator;
import it.unibo.generator.TypeGenerator;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class EffectFullFunctionGenerator {
  private final TypeGenerator typeGenerator = new TypeGenerator();
  
  public CharSequence compile(final EffectFullBlock efb) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    String _basePackageJava = FPMLGenerator.getBasePackageJava();
    _builder.append(_basePackageJava, "");
    _builder.append("Effectfull;");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("import ");
    String _basePackageJava_1 = FPMLGenerator.getBasePackageJava();
    _builder.append(_basePackageJava_1, "");
    _builder.append("Pure.Data.*;");
    _builder.newLineIfNotEmpty();
    _builder.append("import fj.data.*;");
    _builder.newLine();
    _builder.append("import ");
    String _basePackageJava_2 = FPMLGenerator.getBasePackageJava();
    _builder.append(_basePackageJava_2, "");
    _builder.append("Pure.*;");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("public class EffectFullFunctions {");
    _builder.newLine();
    {
      EList<EffectFullFunctionDefinition> _features = efb.getFeatures();
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
  
  public CharSequence compile(final /* EffectFullFunction */Object pf) {
    throw new Error("Unresolved compilation problems:"
      + "\nreturnType cannot be resolved"
      + "\nname cannot be resolved"
      + "\narg cannot be resolved"
      + "\nfunctionBody cannot be resolved"
      + "\nfunctionBody cannot be resolved"
      + "\narg cannot be resolved"
      + "\nname cannot be resolved"
      + "\nfunctionBody cannot be resolved");
  }
  
  public CharSequence compile(final CompositionFunctionBodyEffect cfbe) {
    throw new Error("Unresolved compilation problems:"
      + "\nType mismatch: cannot convert from Function2<String, ChainElement, String> to Function2<? super String, ? super CompositionFunctionBodyEffectFullFactor, ? extends String>");
  }
  
  public String compile(final ChainElement e) {
    throw new Error("Unresolved compilation problems:"
      + "\nPureFunction cannot be resolved to a type."
      + "\nPureFunction cannot be resolved to a type."
      + "\nEffectFullFunction cannot be resolved to a type."
      + "\nEffectFullFunction cannot be resolved to a type."
      + "\nUnreachable code: The case can never match. It is already handled by a previous condition."
      + "\nUnreachable code: The case can never match. It is already handled by a previous condition."
      + "\nname cannot be resolved"
      + "\nname cannot be resolved");
  }
}
