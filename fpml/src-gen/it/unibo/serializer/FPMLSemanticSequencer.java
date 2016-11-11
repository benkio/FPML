/*
 * generated by Xtext 2.10.0
 */
package it.unibo.serializer;

import com.google.inject.Inject;
import it.unibo.fPML.AdtType;
import it.unibo.fPML.Argument;
import it.unibo.fPML.CompositionFunctionBodyEffect;
import it.unibo.fPML.CompositionFunctionBodyPure;
import it.unibo.fPML.Data;
import it.unibo.fPML.DataBlock;
import it.unibo.fPML.DataType;
import it.unibo.fPML.DataValue;
import it.unibo.fPML.EffectFullArgument;
import it.unibo.fPML.EffectFullBlock;
import it.unibo.fPML.EffectFullFunction;
import it.unibo.fPML.EmptyFunctionBody;
import it.unibo.fPML.FPMLPackage;
import it.unibo.fPML.IOType;
import it.unibo.fPML.IntegerType;
import it.unibo.fPML.MainFunc;
import it.unibo.fPML.Model;
import it.unibo.fPML.PrimitivePrint;
import it.unibo.fPML.ProdType;
import it.unibo.fPML.ProdValue;
import it.unibo.fPML.PureBlock;
import it.unibo.fPML.PureFunction;
import it.unibo.fPML.PureFunctionBlock;
import it.unibo.fPML.StringType;
import it.unibo.fPML.SumType;
import it.unibo.fPML.SumValue;
import it.unibo.fPML.UnitType;
import it.unibo.fPML.Value;
import it.unibo.fPML.ValueBlock;
import it.unibo.services.FPMLGrammarAccess;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class FPMLSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private FPMLGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == FPMLPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case FPMLPackage.ADT_TYPE:
				sequence_AdtType(context, (AdtType) semanticObject); 
				return; 
			case FPMLPackage.ARGUMENT:
				sequence_Argument(context, (Argument) semanticObject); 
				return; 
			case FPMLPackage.COMPOSITION_FUNCTION_BODY_EFFECT:
				sequence_CompositionFunctionBodyEffect(context, (CompositionFunctionBodyEffect) semanticObject); 
				return; 
			case FPMLPackage.COMPOSITION_FUNCTION_BODY_PURE:
				sequence_CompositionFunctionBodyPure(context, (CompositionFunctionBodyPure) semanticObject); 
				return; 
			case FPMLPackage.DATA:
				sequence_Data(context, (Data) semanticObject); 
				return; 
			case FPMLPackage.DATA_BLOCK:
				sequence_DataBlock(context, (DataBlock) semanticObject); 
				return; 
			case FPMLPackage.DATA_TYPE:
				sequence_DataType(context, (DataType) semanticObject); 
				return; 
			case FPMLPackage.DATA_VALUE:
				sequence_DataValue(context, (DataValue) semanticObject); 
				return; 
			case FPMLPackage.EFFECT_FULL_ARGUMENT:
				sequence_EffectFullArgument(context, (EffectFullArgument) semanticObject); 
				return; 
			case FPMLPackage.EFFECT_FULL_BLOCK:
				sequence_EffectFullBlock(context, (EffectFullBlock) semanticObject); 
				return; 
			case FPMLPackage.EFFECT_FULL_FUNCTION:
				sequence_EffectFullFunction(context, (EffectFullFunction) semanticObject); 
				return; 
			case FPMLPackage.EMPTY_FUNCTION_BODY:
				sequence_EmptyFunctionBody(context, (EmptyFunctionBody) semanticObject); 
				return; 
			case FPMLPackage.IO_TYPE:
				sequence_IOType(context, (IOType) semanticObject); 
				return; 
			case FPMLPackage.INTEGER_TYPE:
				if (rule == grammarAccess.getExpressionRule()
						|| rule == grammarAccess.getIntValueRule()
						|| rule == grammarAccess.getAdtValueRule()) {
					sequence_IntValue(context, (IntegerType) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getAdtTypeRule()
						|| rule == grammarAccess.getValueTypeRule()
						|| rule == grammarAccess.getTypeRule()
						|| rule == grammarAccess.getIntegerTypeRule()) {
					sequence_IntegerType(context, (IntegerType) semanticObject); 
					return; 
				}
				else break;
			case FPMLPackage.MAIN_FUNC:
				sequence_MainFunc(context, (MainFunc) semanticObject); 
				return; 
			case FPMLPackage.MODEL:
				sequence_Model(context, (Model) semanticObject); 
				return; 
			case FPMLPackage.PRIMITIVE_PRINT:
				sequence_PrimitivePrint(context, (PrimitivePrint) semanticObject); 
				return; 
			case FPMLPackage.PROD_TYPE:
				sequence_ProdType(context, (ProdType) semanticObject); 
				return; 
			case FPMLPackage.PROD_VALUE:
				sequence_ProdValue(context, (ProdValue) semanticObject); 
				return; 
			case FPMLPackage.PURE_BLOCK:
				sequence_PureBlock(context, (PureBlock) semanticObject); 
				return; 
			case FPMLPackage.PURE_FUNCTION:
				sequence_PureFunction(context, (PureFunction) semanticObject); 
				return; 
			case FPMLPackage.PURE_FUNCTION_BLOCK:
				sequence_PureFunctionBlock(context, (PureFunctionBlock) semanticObject); 
				return; 
			case FPMLPackage.STRING_TYPE:
				if (rule == grammarAccess.getAdtTypeRule()
						|| rule == grammarAccess.getValueTypeRule()
						|| rule == grammarAccess.getTypeRule()
						|| rule == grammarAccess.getStringTypeRule()) {
					sequence_StringType(context, (StringType) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getExpressionRule()
						|| rule == grammarAccess.getStringValueRule()
						|| rule == grammarAccess.getAdtValueRule()) {
					sequence_StringValue(context, (StringType) semanticObject); 
					return; 
				}
				else break;
			case FPMLPackage.SUM_TYPE:
				sequence_SumType(context, (SumType) semanticObject); 
				return; 
			case FPMLPackage.SUM_VALUE:
				sequence_SumValue(context, (SumValue) semanticObject); 
				return; 
			case FPMLPackage.UNIT_TYPE:
				if (rule == grammarAccess.getTypeRule()
						|| rule == grammarAccess.getUnitTypeRule()) {
					sequence_UnitType(context, (UnitType) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getExpressionRule()
						|| rule == grammarAccess.getUnitValueRule()) {
					sequence_UnitValue(context, (UnitType) semanticObject); 
					return; 
				}
				else break;
			case FPMLPackage.VALUE:
				sequence_Value(context, (Value) semanticObject); 
				return; 
			case FPMLPackage.VALUE_BLOCK:
				sequence_ValueBlock(context, (ValueBlock) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     AdtType returns AdtType
	 *
	 * Constraint:
	 *     (adtElement1=AdtType (adtElement2=SumType | adtElement2=ProdType))
	 */
	protected void sequence_AdtType(ISerializationContext context, AdtType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Argument returns Argument
	 *
	 * Constraint:
	 *     (type=ValueType name=ID)
	 */
	protected void sequence_Argument(ISerializationContext context, Argument semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, FPMLPackage.Literals.ARGUMENT__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FPMLPackage.Literals.ARGUMENT__TYPE));
			if (transientValues.isValueTransient(semanticObject, FPMLPackage.Literals.ARGUMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FPMLPackage.Literals.ARGUMENT__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getArgumentAccess().getTypeValueTypeParserRuleCall_0_0(), semanticObject.getType());
		feeder.accept(grammarAccess.getArgumentAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     FunctionBodyEffectFull returns CompositionFunctionBodyEffect
	 *     CompositionFunctionBodyEffect returns CompositionFunctionBodyEffect
	 *
	 * Constraint:
	 *     (functionChain+=[ChainElement|ID] functionChain+=[ChainElement|ID] functionChain+=[ChainElement|ID]*)
	 */
	protected void sequence_CompositionFunctionBodyEffect(ISerializationContext context, CompositionFunctionBodyEffect semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     FunctionBodyPure returns CompositionFunctionBodyPure
	 *     CompositionFunctionBodyPure returns CompositionFunctionBodyPure
	 *
	 * Constraint:
	 *     (initialElement=[InitialPureChainElement|ID] functionChain+=[PureFunction|ID] functionChain+=[PureFunction|ID]*)
	 */
	protected void sequence_CompositionFunctionBodyPure(ISerializationContext context, CompositionFunctionBodyPure semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     DataBlock returns DataBlock
	 *
	 * Constraint:
	 *     (elements+=Data* value=ValueBlock)
	 */
	protected void sequence_DataBlock(ISerializationContext context, DataBlock semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     AdtType returns DataType
	 *     ValueType returns DataType
	 *     Type returns DataType
	 *     DataType returns DataType
	 *
	 * Constraint:
	 *     type=[Data|ID]
	 */
	protected void sequence_DataType(ISerializationContext context, DataType semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, FPMLPackage.Literals.DATA_TYPE__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FPMLPackage.Literals.DATA_TYPE__TYPE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getDataTypeAccess().getTypeDataIDTerminalRuleCall_2_0_1(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Expression returns DataValue
	 *     DataValue returns DataValue
	 *     AdtValue returns DataValue
	 *
	 * Constraint:
	 *     (type=[Data|ID] value=AdtValue)
	 */
	protected void sequence_DataValue(ISerializationContext context, DataValue semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, FPMLPackage.Literals.DATA_TYPE__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FPMLPackage.Literals.DATA_TYPE__TYPE));
			if (transientValues.isValueTransient(semanticObject, FPMLPackage.Literals.DATA_VALUE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FPMLPackage.Literals.DATA_VALUE__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getDataValueAccess().getTypeDataIDTerminalRuleCall_1_0_1(), semanticObject.getType());
		feeder.accept(grammarAccess.getDataValueAccess().getValueAdtValueParserRuleCall_3_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Data returns Data
	 *
	 * Constraint:
	 *     (name=ID content=AdtType)
	 */
	protected void sequence_Data(ISerializationContext context, Data semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, FPMLPackage.Literals.DATA__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FPMLPackage.Literals.DATA__NAME));
			if (transientValues.isValueTransient(semanticObject, FPMLPackage.Literals.DATA__CONTENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FPMLPackage.Literals.DATA__CONTENT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getDataAccess().getNameIDTerminalRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getDataAccess().getContentAdtTypeParserRuleCall_2_0(), semanticObject.getContent());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     EffectFullArgument returns EffectFullArgument
	 *
	 * Constraint:
	 *     (type=Type name=ID?)
	 */
	protected void sequence_EffectFullArgument(ISerializationContext context, EffectFullArgument semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     EffectFullBlock returns EffectFullBlock
	 *
	 * Constraint:
	 *     (features+=EffectFullFunction* main=MainFunc)
	 */
	protected void sequence_EffectFullBlock(ISerializationContext context, EffectFullBlock semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     EffectFullFunction returns EffectFullFunction
	 *     ChainElement returns EffectFullFunction
	 *     Function returns EffectFullFunction
	 *
	 * Constraint:
	 *     (returnType=IOType name=ID arg=EffectFullArgument functionBody=FunctionBodyEffectFull)
	 */
	protected void sequence_EffectFullFunction(ISerializationContext context, EffectFullFunction semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, FPMLPackage.Literals.EFFECT_FULL_FUNCTION__RETURN_TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FPMLPackage.Literals.EFFECT_FULL_FUNCTION__RETURN_TYPE));
			if (transientValues.isValueTransient(semanticObject, FPMLPackage.Literals.CHAIN_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FPMLPackage.Literals.CHAIN_ELEMENT__NAME));
			if (transientValues.isValueTransient(semanticObject, FPMLPackage.Literals.EFFECT_FULL_FUNCTION__ARG) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FPMLPackage.Literals.EFFECT_FULL_FUNCTION__ARG));
			if (transientValues.isValueTransient(semanticObject, FPMLPackage.Literals.EFFECT_FULL_FUNCTION__FUNCTION_BODY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FPMLPackage.Literals.EFFECT_FULL_FUNCTION__FUNCTION_BODY));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getEffectFullFunctionAccess().getReturnTypeIOTypeParserRuleCall_1_0(), semanticObject.getReturnType());
		feeder.accept(grammarAccess.getEffectFullFunctionAccess().getNameIDTerminalRuleCall_2_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getEffectFullFunctionAccess().getArgEffectFullArgumentParserRuleCall_4_0(), semanticObject.getArg());
		feeder.accept(grammarAccess.getEffectFullFunctionAccess().getFunctionBodyFunctionBodyEffectFullParserRuleCall_8_0(), semanticObject.getFunctionBody());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     FunctionBodyPure returns EmptyFunctionBody
	 *     FunctionBodyEffectFull returns EmptyFunctionBody
	 *     EmptyFunctionBody returns EmptyFunctionBody
	 *
	 * Constraint:
	 *     {EmptyFunctionBody}
	 */
	protected void sequence_EmptyFunctionBody(ISerializationContext context, EmptyFunctionBody semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     IOType returns IOType
	 *
	 * Constraint:
	 *     type=Type
	 */
	protected void sequence_IOType(ISerializationContext context, IOType semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, FPMLPackage.Literals.IO_TYPE__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FPMLPackage.Literals.IO_TYPE__TYPE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getIOTypeAccess().getTypeTypeParserRuleCall_1_0(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Expression returns IntegerType
	 *     IntValue returns IntegerType
	 *     AdtValue returns IntegerType
	 *
	 * Constraint:
	 *     value=INT
	 */
	protected void sequence_IntValue(ISerializationContext context, IntegerType semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, FPMLPackage.Literals.INTEGER_TYPE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FPMLPackage.Literals.INTEGER_TYPE__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getIntValueAccess().getValueINTTerminalRuleCall_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     AdtType returns IntegerType
	 *     ValueType returns IntegerType
	 *     Type returns IntegerType
	 *     IntegerType returns IntegerType
	 *
	 * Constraint:
	 *     type='int'
	 */
	protected void sequence_IntegerType(ISerializationContext context, IntegerType semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, FPMLPackage.Literals.INTEGER_TYPE__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FPMLPackage.Literals.INTEGER_TYPE__TYPE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getIntegerTypeAccess().getTypeIntKeyword_1_0(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     MainFunc returns MainFunc
	 *
	 * Constraint:
	 *     (returnType=UnitType functionBody=FunctionBodyEffectFull)
	 */
	protected void sequence_MainFunc(ISerializationContext context, MainFunc semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, FPMLPackage.Literals.MAIN_FUNC__RETURN_TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FPMLPackage.Literals.MAIN_FUNC__RETURN_TYPE));
			if (transientValues.isValueTransient(semanticObject, FPMLPackage.Literals.MAIN_FUNC__FUNCTION_BODY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FPMLPackage.Literals.MAIN_FUNC__FUNCTION_BODY));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getMainFuncAccess().getReturnTypeUnitTypeParserRuleCall_1_0(), semanticObject.getReturnType());
		feeder.accept(grammarAccess.getMainFuncAccess().getFunctionBodyFunctionBodyEffectFullParserRuleCall_5_0(), semanticObject.getFunctionBody());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Model returns Model
	 *
	 * Constraint:
	 *     (elements+=PureBlock elements+=EffectFullBlock)
	 */
	protected void sequence_Model(ISerializationContext context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     PrimitivePrint returns PrimitivePrint
	 *
	 * Constraint:
	 *     name='print'
	 */
	protected void sequence_PrimitivePrint(ISerializationContext context, PrimitivePrint semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, FPMLPackage.Literals.CHAIN_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FPMLPackage.Literals.CHAIN_ELEMENT__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getPrimitivePrintAccess().getNamePrintKeyword_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ProdType returns ProdType
	 *
	 * Constraint:
	 *     adtElement=AdtType
	 */
	protected void sequence_ProdType(ISerializationContext context, ProdType semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, FPMLPackage.Literals.PROD_TYPE__ADT_ELEMENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FPMLPackage.Literals.PROD_TYPE__ADT_ELEMENT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getProdTypeAccess().getAdtElementAdtTypeParserRuleCall_1_0(), semanticObject.getAdtElement());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     AdtValue returns ProdValue
	 *     ProdValue returns ProdValue
	 *
	 * Constraint:
	 *     (prodAdtElement1=AdtValue prodAdtElement2=AdtValue)
	 */
	protected void sequence_ProdValue(ISerializationContext context, ProdValue semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, FPMLPackage.Literals.PROD_VALUE__PROD_ADT_ELEMENT1) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FPMLPackage.Literals.PROD_VALUE__PROD_ADT_ELEMENT1));
			if (transientValues.isValueTransient(semanticObject, FPMLPackage.Literals.PROD_VALUE__PROD_ADT_ELEMENT2) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FPMLPackage.Literals.PROD_VALUE__PROD_ADT_ELEMENT2));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getProdValueAccess().getProdAdtElement1AdtValueParserRuleCall_1_0(), semanticObject.getProdAdtElement1());
		feeder.accept(grammarAccess.getProdValueAccess().getProdAdtElement2AdtValueParserRuleCall_3_0(), semanticObject.getProdAdtElement2());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     PureBlock returns PureBlock
	 *
	 * Constraint:
	 *     (elements+=PureFunctionBlock elements+=DataBlock)
	 */
	protected void sequence_PureBlock(ISerializationContext context, PureBlock semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     PureFunctionBlock returns PureFunctionBlock
	 *
	 * Constraint:
	 *     features+=PureFunction+
	 */
	protected void sequence_PureFunctionBlock(ISerializationContext context, PureFunctionBlock semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     PureFunction returns PureFunction
	 *     ChainElement returns PureFunction
	 *     InitialPureChainElement returns PureFunction
	 *     Function returns PureFunction
	 *
	 * Constraint:
	 *     (returnType=ValueType name=ID arg=Argument functionBody=FunctionBodyPure)
	 */
	protected void sequence_PureFunction(ISerializationContext context, PureFunction semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, FPMLPackage.Literals.PURE_FUNCTION__RETURN_TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FPMLPackage.Literals.PURE_FUNCTION__RETURN_TYPE));
			if (transientValues.isValueTransient(semanticObject, FPMLPackage.Literals.CHAIN_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FPMLPackage.Literals.CHAIN_ELEMENT__NAME));
			if (transientValues.isValueTransient(semanticObject, FPMLPackage.Literals.PURE_FUNCTION__ARG) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FPMLPackage.Literals.PURE_FUNCTION__ARG));
			if (transientValues.isValueTransient(semanticObject, FPMLPackage.Literals.PURE_FUNCTION__FUNCTION_BODY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FPMLPackage.Literals.PURE_FUNCTION__FUNCTION_BODY));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getPureFunctionAccess().getReturnTypeValueTypeParserRuleCall_1_0(), semanticObject.getReturnType());
		feeder.accept(grammarAccess.getPureFunctionAccess().getNameIDTerminalRuleCall_2_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getPureFunctionAccess().getArgArgumentParserRuleCall_4_0(), semanticObject.getArg());
		feeder.accept(grammarAccess.getPureFunctionAccess().getFunctionBodyFunctionBodyPureParserRuleCall_8_0(), semanticObject.getFunctionBody());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     AdtType returns StringType
	 *     ValueType returns StringType
	 *     Type returns StringType
	 *     StringType returns StringType
	 *
	 * Constraint:
	 *     type='String'
	 */
	protected void sequence_StringType(ISerializationContext context, StringType semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, FPMLPackage.Literals.STRING_TYPE__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FPMLPackage.Literals.STRING_TYPE__TYPE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getStringTypeAccess().getTypeStringKeyword_1_0(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Expression returns StringType
	 *     StringValue returns StringType
	 *     AdtValue returns StringType
	 *
	 * Constraint:
	 *     value=STRING
	 */
	protected void sequence_StringValue(ISerializationContext context, StringType semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, FPMLPackage.Literals.STRING_TYPE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FPMLPackage.Literals.STRING_TYPE__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getStringValueAccess().getValueSTRINGTerminalRuleCall_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     SumType returns SumType
	 *
	 * Constraint:
	 *     adtElement=AdtType
	 */
	protected void sequence_SumType(ISerializationContext context, SumType semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, FPMLPackage.Literals.SUM_TYPE__ADT_ELEMENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FPMLPackage.Literals.SUM_TYPE__ADT_ELEMENT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSumTypeAccess().getAdtElementAdtTypeParserRuleCall_1_0(), semanticObject.getAdtElement());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     AdtValue returns SumValue
	 *     SumValue returns SumValue
	 *
	 * Constraint:
	 *     (sumAdtElement1=AdtValue | sumAdtElement2=AdtValue)
	 */
	protected void sequence_SumValue(ISerializationContext context, SumValue semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Type returns UnitType
	 *     UnitType returns UnitType
	 *
	 * Constraint:
	 *     type='Unit'
	 */
	protected void sequence_UnitType(ISerializationContext context, UnitType semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, FPMLPackage.Literals.UNIT_TYPE__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FPMLPackage.Literals.UNIT_TYPE__TYPE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getUnitTypeAccess().getTypeUnitKeyword_1_0(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Expression returns UnitType
	 *     UnitValue returns UnitType
	 *
	 * Constraint:
	 *     {UnitType}
	 */
	protected void sequence_UnitValue(ISerializationContext context, UnitType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ValueBlock returns ValueBlock
	 *
	 * Constraint:
	 *     elements+=Value+
	 */
	protected void sequence_ValueBlock(ISerializationContext context, ValueBlock semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Value returns Value
	 *     ChainElement returns Value
	 *     InitialPureChainElement returns Value
	 *
	 * Constraint:
	 *     (name=ID value=Expression)
	 */
	protected void sequence_Value(ISerializationContext context, Value semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, FPMLPackage.Literals.CHAIN_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FPMLPackage.Literals.CHAIN_ELEMENT__NAME));
			if (transientValues.isValueTransient(semanticObject, FPMLPackage.Literals.VALUE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FPMLPackage.Literals.VALUE__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getValueAccess().getNameIDTerminalRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getValueAccess().getValueExpressionParserRuleCall_2_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
}
