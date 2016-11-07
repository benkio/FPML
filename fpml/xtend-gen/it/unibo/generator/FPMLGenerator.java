/**
 * generated by Xtext 2.9.2
 */
package it.unibo.generator;

import com.google.common.collect.Iterables;
import com.google.common.collect.Iterators;
import it.unibo.fPML.Data;
import it.unibo.fPML.EffectFullBlock;
import it.unibo.fPML.PureFunctionBlock;
import java.util.Iterator;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class FPMLGenerator extends AbstractGenerator {
  private final String basePackage = "it/unibo/";
  
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    TreeIterator<EObject> _allContents = resource.getAllContents();
    Iterator<PureFunctionBlock> _filter = Iterators.<PureFunctionBlock>filter(_allContents, PureFunctionBlock.class);
    PureFunctionBlock _head = IteratorExtensions.<PureFunctionBlock>head(_filter);
    CharSequence _compile = this.compile(_head);
    fsa.generateFile((this.basePackage + "Pure/Functions.java"), _compile);
    TreeIterator<EObject> _allContents_1 = resource.getAllContents();
    Iterator<EffectFullBlock> _filter_1 = Iterators.<EffectFullBlock>filter(_allContents_1, EffectFullBlock.class);
    EffectFullBlock _head_1 = IteratorExtensions.<EffectFullBlock>head(_filter_1);
    CharSequence _compile_1 = this.compile(_head_1);
    fsa.generateFile((this.basePackage + "Effectfull/Functions.java"), _compile_1);
    TreeIterator<EObject> _allContents_2 = resource.getAllContents();
    Iterable<EObject> _iterable = IteratorExtensions.<EObject>toIterable(_allContents_2);
    Iterable<Data> _filter_2 = Iterables.<Data>filter(_iterable, Data.class);
    for (final Data e : _filter_2) {
      String _name = e.getName();
      String _plus = ((this.basePackage + "Data/") + _name);
      String _plus_1 = (_plus + ".java");
      CharSequence _compile_2 = this.compile(e);
      fsa.generateFile(_plus_1, _compile_2);
    }
  }
  
  public CharSequence compile(final PureFunctionBlock p) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Pure Functions");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence compile(final Data d) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Data");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence compile(final EffectFullBlock efb) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Effectfull funcitons");
    _builder.newLine();
    return _builder;
  }
}
