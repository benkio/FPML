/*
 * generated by Xtext 2.9.2
 */
package it.unibo.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import it.unibo.fPML.PureFunctionBlock
import it.unibo.fPML.Data
import it.unibo.fPML.EffectFullBlock

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class FPMLGenerator extends AbstractGenerator {

	val basePackage = "it/unibo/";

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		fsa.generateFile(basePackage + "Pure/Functions.java", resource.getAllContents.filter(PureFunctionBlock).head.compile);
		fsa.generateFile(basePackage + "Effectfull/Functions.java", resource.getAllContents.filter(EffectFullBlock).head.compile);
		for(e : resource.getAllContents.toIterable.filter(Data)){
			fsa.generateFile(
					basePackage + "Data/" + e.getName() + ".java",
					e.compile
			);
		}
	}

	def compile(PureFunctionBlock p) '''
		Pure Functions
	'''

	def compile(Data d) '''
	    Data
	'''

	def compile(EffectFullBlock efb) '''
	    Effectfull funcitons
	'''
}
