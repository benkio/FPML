package it.unibo.generator;

import it.unibo.fPML.CompositionFunctionBodyEffect;
import it.unibo.fPML.CompositionFunctionBodyEffectFullFactor;
import it.unibo.fPML.EffectFullFunctionBlock;
import it.unibo.fPML.EffectFullFunctionDefinition;
import it.unibo.fPML.FPMLFactory;
import it.unibo.fPML.FunctionBodyEffectFull;
import it.unibo.fPML.IOType;
import it.unibo.fPML.MainFunc;
import it.unibo.fPML.UnitType;
import it.unibo.generator.FPMLGenerator;
import it.unibo.generator.TypeGenerator;
import it.unibo.generator.ValueEffectFullFunctionCommonGenerator;
import it.unibo.generator.ValuePureFunctionCommonGenerator;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class EffectFullFunctionGenerator {
  private final TypeGenerator typeGenerator = new TypeGenerator();
  
  private final ValuePureFunctionCommonGenerator commonPureFunctions = new ValuePureFunctionCommonGenerator();
  
  private final ValueEffectFullFunctionCommonGenerator commonEffectFullFunctions = new ValueEffectFullFunctionCommonGenerator();
  
  public CharSequence compile(final EffectFullFunctionBlock effb) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    String _basePackageJava = FPMLGenerator.basePackageJava();
    _builder.append(_basePackageJava, "");
    _builder.append("Effectfull;");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
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
    _builder.append("import ");
    String _basePackageJava_2 = FPMLGenerator.basePackageJava();
    _builder.append(_basePackageJava_2, "");
    _builder.append("Effectfull.Data.*;");
    _builder.newLineIfNotEmpty();
    _builder.append("import ");
    String _basePackageJava_3 = FPMLGenerator.basePackageJava();
    _builder.append(_basePackageJava_3, "");
    _builder.append("Pure.*;");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("public class EffectFullFunctionDefinitions {");
    _builder.newLine();
    {
      EList<EffectFullFunctionDefinition> _features = effb.getFeatures();
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
  
  public String compile(final EffectFullFunctionDefinition pf) {
    throw new Error("Unresolved compilation problems:"
      + "\nType mismatch: cannot convert from Argument to EffectFullArgument"
      + "\nType mismatch: cannot convert from Argument to EffectFullArgument");
  }
  
  public CharSequence compileIOWalkthrough(final CompositionFunctionBodyEffect cfbe) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method getFirstFunctionDefinitionFromCompositionBodyEffectFull(CompositionFunctionBodyEffect) from the type Others refers to the missing type EffectFullReference"
      + "\ncompileIOWalkthorugh cannot be resolved"
      + "\n+ cannot be resolved");
  }
  
  public CharSequence compileIOWalkThough(final CompositionFunctionBodyEffectFullFactor f) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method compileIOWalkthorugh(EffectFullReference) from the type EffectFullFunctionGenerator refers to the missing type EffectFullReference");
  }
  
  public CharSequence compileIOWalkthorugh(final /* EffectFullReference */Object e) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method getValueFromApplyFIOFactor(ApplyFIOFactor) from the type Others refers to the missing type EffectFullReference"
      + "\ndata cannot be resolved"
      + "\ncontent cannot be resolved"
      + "\nfunctionType cannot be resolved"
      + "\nvalue cannot be resolved"
      + "\nfunctionType cannot be resolved"
      + "\nvalue cannot be resolved"
      + "\nname cannot be resolved"
      + "\ndata cannot be resolved"
      + "\ncontent cannot be resolved");
  }
  
  public CharSequence compile(final MainFunc mf) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    String _basePackageJava = FPMLGenerator.basePackageJava();
    _builder.append(_basePackageJava, "");
    _builder.append("Effectfull;");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("import ");
    String _basePackageJava_1 = FPMLGenerator.basePackageJava();
    _builder.append(_basePackageJava_1, "");
    _builder.append("Pure.Data.*;");
    _builder.newLineIfNotEmpty();
    _builder.append("import fj.data.*;");
    _builder.newLine();
    _builder.append("import java.io.IOException;");
    _builder.newLine();
    _builder.append("import fj.Unit;");
    _builder.newLine();
    _builder.append("import fj.F;");
    _builder.newLine();
    _builder.append("import ");
    String _basePackageJava_2 = FPMLGenerator.basePackageJava();
    _builder.append(_basePackageJava_2, "");
    _builder.append("Effectfull.Data.*;");
    _builder.newLineIfNotEmpty();
    _builder.append("import ");
    String _basePackageJava_3 = FPMLGenerator.basePackageJava();
    _builder.append(_basePackageJava_3, "");
    _builder.append("Pure.*;");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("public class EntryPoint {");
    _builder.newLine();
    _builder.append("\t");
    String _compileMain = this.compileMain(mf);
    _builder.append(_compileMain, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    return _builder;
  }
  
  public String compileMain(final MainFunc mf) {
    String _xblockexpression = null;
    {
      final IOType effectFullMainReturnType = FPMLFactory.eINSTANCE.createIOType();
      UnitType _createUnitType = FPMLFactory.eINSTANCE.createUnitType();
      effectFullMainReturnType.setType(_createUnitType);
      final EffectFullFunctionDefinition effectFullMain = FPMLFactory.eINSTANCE.createEffectFullFunctionDefinition();
      FunctionBodyEffectFull _functionBody = mf.getFunctionBody();
      effectFullMain.setFunctionBody(_functionBody);
      effectFullMain.setReturnType(effectFullMainReturnType);
      effectFullMain.setName("main");
      _xblockexpression = this.compile(effectFullMain);
    }
    return _xblockexpression;
  }
}
