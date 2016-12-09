/*
 * generated by Xtext 2.10.0
 */
package it.unibo.ide.contentassist.antlr;

import com.google.inject.Inject;
import it.unibo.ide.contentassist.antlr.internal.InternalFPMLParser;
import it.unibo.services.FPMLGrammarAccess;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

public class FPMLParser extends AbstractContentAssistParser {

	@Inject
	private FPMLGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalFPMLParser createParser() {
		InternalFPMLParser result = new InternalFPMLParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getFunctionAccess().getAlternatives(), "rule__Function__Alternatives");
					put(grammarAccess.getPureFunctionAccess().getAlternatives(), "rule__PureFunction__Alternatives");
					put(grammarAccess.getEffectFullFunctionAccess().getAlternatives(), "rule__EffectFullFunction__Alternatives");
					put(grammarAccess.getPrimitiveFunctionAccess().getAlternatives(), "rule__PrimitiveFunction__Alternatives");
					put(grammarAccess.getEffectFullPrimitiveAccess().getAlternatives(), "rule__EffectFullPrimitive__Alternatives");
					put(grammarAccess.getEffectFullBodyContentAccess().getAlternatives(), "rule__EffectFullBodyContent__Alternatives");
					put(grammarAccess.getArgumentAccess().getAlternatives(), "rule__Argument__Alternatives");
					put(grammarAccess.getFunctionBodyPureAccess().getAlternatives(), "rule__FunctionBodyPure__Alternatives");
					put(grammarAccess.getFunctionBodyEffectFullAccess().getAlternatives(), "rule__FunctionBodyEffectFull__Alternatives");
					put(grammarAccess.getCompositionFunctionBodyPureAccess().getAlternatives(), "rule__CompositionFunctionBodyPure__Alternatives");
					put(grammarAccess.getCompositionFunctionBodyPureFactorAccess().getAlternatives(), "rule__CompositionFunctionBodyPureFactor__Alternatives");
					put(grammarAccess.getCompositionFunctionBodyEffectAccess().getAlternatives(), "rule__CompositionFunctionBodyEffect__Alternatives");
					put(grammarAccess.getCompositionFunctionBodyEffectFullFactorAccess().getAlternatives(), "rule__CompositionFunctionBodyEffectFullFactor__Alternatives");
					put(grammarAccess.getValueTypeAccess().getAlternatives(), "rule__ValueType__Alternatives");
					put(grammarAccess.getTypeAccess().getAlternatives(), "rule__Type__Alternatives");
					put(grammarAccess.getEffectFullTypeAccess().getAlternatives(), "rule__EffectFullType__Alternatives");
					put(grammarAccess.getPureAlgebraicTypeAccess().getPureAdtElement2Alternatives_2_0(), "rule__PureAlgebraicType__PureAdtElement2Alternatives_2_0");
					put(grammarAccess.getEffectFullAlgebraicTypeAccess().getEffectFullAdtElement2Alternatives_2_0(), "rule__EffectFullAlgebraicType__EffectFullAdtElement2Alternatives_2_0");
					put(grammarAccess.getEffectFullExpressionAccess().getAlternatives(), "rule__EffectFullExpression__Alternatives");
					put(grammarAccess.getEffectFullLambdaAccess().getAlternatives(), "rule__EffectFullLambda__Alternatives");
					put(grammarAccess.getExpressionAccess().getAlternatives(), "rule__Expression__Alternatives");
					put(grammarAccess.getPureLambdaAccess().getAlternatives(), "rule__PureLambda__Alternatives");
					put(grammarAccess.getPureSumValueAccess().getAlternatives(), "rule__PureSumValue__Alternatives");
					put(grammarAccess.getEffectFullSumValueAccess().getAlternatives(), "rule__EffectFullSumValue__Alternatives");
					put(grammarAccess.getPrimitivePureFunctionAccess().getAlternatives(), "rule__PrimitivePureFunction__Alternatives");
					put(grammarAccess.getPlusAccess().getTypeAlternatives_2_0(), "rule__Plus__TypeAlternatives_2_0");
					put(grammarAccess.getApplyFFactorAccess().getAlternatives(), "rule__ApplyFFactor__Alternatives");
					put(grammarAccess.getEqualsAccess().getTypeAlternatives_2_0(), "rule__Equals__TypeAlternatives_2_0");
					put(grammarAccess.getPrimitiveEffectFullFunctionAccess().getAlternatives(), "rule__PrimitiveEffectFullFunction__Alternatives");
					put(grammarAccess.getPrimitiveEffectFullValueAccess().getAlternatives(), "rule__PrimitiveEffectFullValue__Alternatives");
					put(grammarAccess.getApplyFIOFactorAccess().getAlternatives(), "rule__ApplyFIOFactor__Alternatives");
					put(grammarAccess.getModelAccess().getGroup(), "rule__Model__Group__0");
					put(grammarAccess.getPureBlockAccess().getGroup(), "rule__PureBlock__Group__0");
					put(grammarAccess.getPureFunctionBlockAccess().getGroup(), "rule__PureFunctionBlock__Group__0");
					put(grammarAccess.getPureDataBlockAccess().getGroup(), "rule__PureDataBlock__Group__0");
					put(grammarAccess.getPureValueBlockAccess().getGroup(), "rule__PureValueBlock__Group__0");
					put(grammarAccess.getEffectFullBlockAccess().getGroup(), "rule__EffectFullBlock__Group__0");
					put(grammarAccess.getEffectFullDataBlockAccess().getGroup(), "rule__EffectFullDataBlock__Group__0");
					put(grammarAccess.getEffectFullValueBlockAccess().getGroup(), "rule__EffectFullValueBlock__Group__0");
					put(grammarAccess.getEffectFullFunctionBlockAccess().getGroup(), "rule__EffectFullFunctionBlock__Group__0");
					put(grammarAccess.getPureDataAccess().getGroup(), "rule__PureData__Group__0");
					put(grammarAccess.getPureValueAccess().getGroup(), "rule__PureValue__Group__0");
					put(grammarAccess.getEffectFullDataAccess().getGroup(), "rule__EffectFullData__Group__0");
					put(grammarAccess.getEffectFullValueAccess().getGroup(), "rule__EffectFullValue__Group__0");
					put(grammarAccess.getPureFunctionDefinitionAccess().getGroup(), "rule__PureFunctionDefinition__Group__0");
					put(grammarAccess.getPureFunctionDefinitionAccess().getGroup_5(), "rule__PureFunctionDefinition__Group_5__0");
					put(grammarAccess.getEffectFullFunctionDefinitionAccess().getGroup(), "rule__EffectFullFunctionDefinition__Group__0");
					put(grammarAccess.getEffectFullFunctionDefinitionAccess().getGroup_5(), "rule__EffectFullFunctionDefinition__Group_5__0");
					put(grammarAccess.getMainFuncAccess().getGroup(), "rule__MainFunc__Group__0");
					put(grammarAccess.getEffectFullArgumentAccess().getGroup(), "rule__EffectFullArgument__Group__0");
					put(grammarAccess.getPureArgumentAccess().getGroup(), "rule__PureArgument__Group__0");
					put(grammarAccess.getEmptyFunctionBodyAccess().getGroup(), "rule__EmptyFunctionBody__Group__0");
					put(grammarAccess.getCompositionFunctionBodyPureAccess().getGroup_0(), "rule__CompositionFunctionBodyPure__Group_0__0");
					put(grammarAccess.getCompositionFunctionBodyPureAccess().getGroup_1(), "rule__CompositionFunctionBodyPure__Group_1__0");
					put(grammarAccess.getCompositionFunctionBodyPureAccess().getGroup_2(), "rule__CompositionFunctionBodyPure__Group_2__0");
					put(grammarAccess.getCompositionFunctionBodyPureFactorAccess().getGroup_0(), "rule__CompositionFunctionBodyPureFactor__Group_0__0");
					put(grammarAccess.getCompositionFunctionBodyPureFactorAccess().getGroup_1(), "rule__CompositionFunctionBodyPureFactor__Group_1__0");
					put(grammarAccess.getCompositionFunctionBodyPureFactorAccess().getGroup_2(), "rule__CompositionFunctionBodyPureFactor__Group_2__0");
					put(grammarAccess.getCompositionFunctionBodyEffectAccess().getGroup_0(), "rule__CompositionFunctionBodyEffect__Group_0__0");
					put(grammarAccess.getCompositionFunctionBodyEffectAccess().getGroup_1(), "rule__CompositionFunctionBodyEffect__Group_1__0");
					put(grammarAccess.getCompositionFunctionBodyEffectAccess().getGroup_2(), "rule__CompositionFunctionBodyEffect__Group_2__0");
					put(grammarAccess.getCompositionFunctionBodyEffectFullFactorAccess().getGroup_0(), "rule__CompositionFunctionBodyEffectFullFactor__Group_0__0");
					put(grammarAccess.getCompositionFunctionBodyEffectFullFactorAccess().getGroup_1(), "rule__CompositionFunctionBodyEffectFullFactor__Group_1__0");
					put(grammarAccess.getCompositionFunctionBodyEffectFullFactorAccess().getGroup_2(), "rule__CompositionFunctionBodyEffectFullFactor__Group_2__0");
					put(grammarAccess.getIOTypeAccess().getGroup(), "rule__IOType__Group__0");
					put(grammarAccess.getIntegerTypeAccess().getGroup(), "rule__IntegerType__Group__0");
					put(grammarAccess.getStringTypeAccess().getGroup(), "rule__StringType__Group__0");
					put(grammarAccess.getBooleanTypeAccess().getGroup(), "rule__BooleanType__Group__0");
					put(grammarAccess.getUnitTypeAccess().getGroup(), "rule__UnitType__Group__0");
					put(grammarAccess.getDataTypeAccess().getGroup(), "rule__DataType__Group__0");
					put(grammarAccess.getEffectFullDataTypeAccess().getGroup(), "rule__EffectFullDataType__Group__0");
					put(grammarAccess.getPureFunctionTypeAccess().getGroup(), "rule__PureFunctionType__Group__0");
					put(grammarAccess.getEffectFullFunctionTypeAccess().getGroup(), "rule__EffectFullFunctionType__Group__0");
					put(grammarAccess.getPureAlgebraicTypeAccess().getGroup(), "rule__PureAlgebraicType__Group__0");
					put(grammarAccess.getPureSumTypeFactorAccess().getGroup(), "rule__PureSumTypeFactor__Group__0");
					put(grammarAccess.getPureProdTypeFactorAccess().getGroup(), "rule__PureProdTypeFactor__Group__0");
					put(grammarAccess.getEffectFullAlgebraicTypeAccess().getGroup(), "rule__EffectFullAlgebraicType__Group__0");
					put(grammarAccess.getEffectFullSumTypeFactorAccess().getGroup(), "rule__EffectFullSumTypeFactor__Group__0");
					put(grammarAccess.getEffectFullProdTypeFactorAccess().getGroup(), "rule__EffectFullProdTypeFactor__Group__0");
					put(grammarAccess.getEffectFullExpressionAccess().getGroup_0(), "rule__EffectFullExpression__Group_0__0");
					put(grammarAccess.getEffectFullExpressionAccess().getGroup_1(), "rule__EffectFullExpression__Group_1__0");
					put(grammarAccess.getEffectFullExpressionAccess().getGroup_2(), "rule__EffectFullExpression__Group_2__0");
					put(grammarAccess.getEffectFullExpressionAccess().getGroup_3(), "rule__EffectFullExpression__Group_3__0");
					put(grammarAccess.getEffectFullExpressionAccess().getGroup_4(), "rule__EffectFullExpression__Group_4__0");
					put(grammarAccess.getEffectFullExpressionAccess().getGroup_5(), "rule__EffectFullExpression__Group_5__0");
					put(grammarAccess.getUnitValueAccess().getGroup(), "rule__UnitValue__Group__0");
					put(grammarAccess.getEffectFullValueRefAccess().getGroup(), "rule__EffectFullValueRef__Group__0");
					put(grammarAccess.getEffectFullLambdaAccess().getGroup_0(), "rule__EffectFullLambda__Group_0__0");
					put(grammarAccess.getEffectFullLambdaAccess().getGroup_1(), "rule__EffectFullLambda__Group_1__0");
					put(grammarAccess.getIntValueAccess().getGroup(), "rule__IntValue__Group__0");
					put(grammarAccess.getStringValueAccess().getGroup(), "rule__StringValue__Group__0");
					put(grammarAccess.getBooleanValueAccess().getGroup(), "rule__BooleanValue__Group__0");
					put(grammarAccess.getDataValueAccess().getGroup(), "rule__DataValue__Group__0");
					put(grammarAccess.getEffectFullDataValueAccess().getGroup(), "rule__EffectFullDataValue__Group__0");
					put(grammarAccess.getPureValueRefAccess().getGroup(), "rule__PureValueRef__Group__0");
					put(grammarAccess.getPureLambdaAccess().getGroup_0(), "rule__PureLambda__Group_0__0");
					put(grammarAccess.getPureLambdaAccess().getGroup_1(), "rule__PureLambda__Group_1__0");
					put(grammarAccess.getPureProdValueAccess().getGroup(), "rule__PureProdValue__Group__0");
					put(grammarAccess.getPureSumValueAccess().getGroup_0(), "rule__PureSumValue__Group_0__0");
					put(grammarAccess.getPureSumValueAccess().getGroup_1(), "rule__PureSumValue__Group_1__0");
					put(grammarAccess.getEffectFullProdValueAccess().getGroup(), "rule__EffectFullProdValue__Group__0");
					put(grammarAccess.getEffectFullSumValueAccess().getGroup_0(), "rule__EffectFullSumValue__Group_0__0");
					put(grammarAccess.getEffectFullSumValueAccess().getGroup_1(), "rule__EffectFullSumValue__Group_1__0");
					put(grammarAccess.getIntToStringAccess().getGroup(), "rule__IntToString__Group__0");
					put(grammarAccess.getIntPowAccess().getGroup(), "rule__IntPow__Group__0");
					put(grammarAccess.getPlusAccess().getGroup(), "rule__Plus__Group__0");
					put(grammarAccess.getMinusAccess().getGroup(), "rule__Minus__Group__0");
					put(grammarAccess.getTimesAccess().getGroup(), "rule__Times__Group__0");
					put(grammarAccess.getModAccess().getGroup(), "rule__Mod__Group__0");
					put(grammarAccess.getLeftPairAccess().getGroup(), "rule__LeftPair__Group__0");
					put(grammarAccess.getRightPairAccess().getGroup(), "rule__RightPair__Group__0");
					put(grammarAccess.getApplyFAccess().getGroup(), "rule__ApplyF__Group__0");
					put(grammarAccess.getApplyFFactorAccess().getGroup_1(), "rule__ApplyFFactor__Group_1__0");
					put(grammarAccess.getEqualsAccess().getGroup(), "rule__Equals__Group__0");
					put(grammarAccess.getMinorEqualsAccess().getGroup(), "rule__MinorEquals__Group__0");
					put(grammarAccess.getMajorEqualsAccess().getGroup(), "rule__MajorEquals__Group__0");
					put(grammarAccess.getMinorAccess().getGroup(), "rule__Minor__Group__0");
					put(grammarAccess.getMajorAccess().getGroup(), "rule__Major__Group__0");
					put(grammarAccess.getLogicAndAccess().getGroup(), "rule__LogicAnd__Group__0");
					put(grammarAccess.getLogicOrAccess().getGroup(), "rule__LogicOr__Group__0");
					put(grammarAccess.getExtractPureAccess().getGroup(), "rule__ExtractPure__Group__0");
					put(grammarAccess.getPrimitivePrintAccess().getGroup(), "rule__PrimitivePrint__Group__0");
					put(grammarAccess.getLeftPairIOAccess().getGroup(), "rule__LeftPairIO__Group__0");
					put(grammarAccess.getRightPairIOAccess().getGroup(), "rule__RightPairIO__Group__0");
					put(grammarAccess.getPrimitiveRandomAccess().getGroup(), "rule__PrimitiveRandom__Group__0");
					put(grammarAccess.getPrimitiveReturnAccess().getGroup(), "rule__PrimitiveReturn__Group__0");
					put(grammarAccess.getPrimitiveTimeAccess().getGroup(), "rule__PrimitiveTime__Group__0");
					put(grammarAccess.getApplyFIOAccess().getGroup(), "rule__ApplyFIO__Group__0");
					put(grammarAccess.getApplyFIOFactorAccess().getGroup_2(), "rule__ApplyFIOFactor__Group_2__0");
					put(grammarAccess.getExtractEffectFullAccess().getGroup(), "rule__ExtractEffectFull__Group__0");
					put(grammarAccess.getModelAccess().getElementsAssignment_0(), "rule__Model__ElementsAssignment_0");
					put(grammarAccess.getModelAccess().getElementsAssignment_1(), "rule__Model__ElementsAssignment_1");
					put(grammarAccess.getPureBlockAccess().getElementsAssignment_2(), "rule__PureBlock__ElementsAssignment_2");
					put(grammarAccess.getPureBlockAccess().getElementsAssignment_3(), "rule__PureBlock__ElementsAssignment_3");
					put(grammarAccess.getPureFunctionBlockAccess().getFeaturesAssignment_2(), "rule__PureFunctionBlock__FeaturesAssignment_2");
					put(grammarAccess.getPureDataBlockAccess().getElementsAssignment_2(), "rule__PureDataBlock__ElementsAssignment_2");
					put(grammarAccess.getPureDataBlockAccess().getValueAssignment_3(), "rule__PureDataBlock__ValueAssignment_3");
					put(grammarAccess.getPureValueBlockAccess().getElementsAssignment_2(), "rule__PureValueBlock__ElementsAssignment_2");
					put(grammarAccess.getEffectFullBlockAccess().getElementsAssignment_2(), "rule__EffectFullBlock__ElementsAssignment_2");
					put(grammarAccess.getEffectFullBlockAccess().getElementsAssignment_3(), "rule__EffectFullBlock__ElementsAssignment_3");
					put(grammarAccess.getEffectFullDataBlockAccess().getElementsAssignment_2(), "rule__EffectFullDataBlock__ElementsAssignment_2");
					put(grammarAccess.getEffectFullDataBlockAccess().getValueAssignment_3(), "rule__EffectFullDataBlock__ValueAssignment_3");
					put(grammarAccess.getEffectFullValueBlockAccess().getElementsAssignment_2(), "rule__EffectFullValueBlock__ElementsAssignment_2");
					put(grammarAccess.getEffectFullFunctionBlockAccess().getFeaturesAssignment_2(), "rule__EffectFullFunctionBlock__FeaturesAssignment_2");
					put(grammarAccess.getEffectFullFunctionBlockAccess().getMainAssignment_3(), "rule__EffectFullFunctionBlock__MainAssignment_3");
					put(grammarAccess.getPureDataAccess().getNameAssignment_0(), "rule__PureData__NameAssignment_0");
					put(grammarAccess.getPureDataAccess().getContentAssignment_2(), "rule__PureData__ContentAssignment_2");
					put(grammarAccess.getPureValueAccess().getNameAssignment_1(), "rule__PureValue__NameAssignment_1");
					put(grammarAccess.getPureValueAccess().getValueAssignment_3(), "rule__PureValue__ValueAssignment_3");
					put(grammarAccess.getEffectFullDataAccess().getNameAssignment_0(), "rule__EffectFullData__NameAssignment_0");
					put(grammarAccess.getEffectFullDataAccess().getContentAssignment_2(), "rule__EffectFullData__ContentAssignment_2");
					put(grammarAccess.getEffectFullValueAccess().getNameAssignment_1(), "rule__EffectFullValue__NameAssignment_1");
					put(grammarAccess.getEffectFullValueAccess().getValueAssignment_3(), "rule__EffectFullValue__ValueAssignment_3");
					put(grammarAccess.getPureFunctionDefinitionAccess().getReturnTypeAssignment_1(), "rule__PureFunctionDefinition__ReturnTypeAssignment_1");
					put(grammarAccess.getPureFunctionDefinitionAccess().getNameAssignment_2(), "rule__PureFunctionDefinition__NameAssignment_2");
					put(grammarAccess.getPureFunctionDefinitionAccess().getArgAssignment_4(), "rule__PureFunctionDefinition__ArgAssignment_4");
					put(grammarAccess.getPureFunctionDefinitionAccess().getHigherOrderArgAssignment_5_1(), "rule__PureFunctionDefinition__HigherOrderArgAssignment_5_1");
					put(grammarAccess.getPureFunctionDefinitionAccess().getFunctionBodyAssignment_9(), "rule__PureFunctionDefinition__FunctionBodyAssignment_9");
					put(grammarAccess.getEffectFullFunctionDefinitionAccess().getReturnTypeAssignment_1(), "rule__EffectFullFunctionDefinition__ReturnTypeAssignment_1");
					put(grammarAccess.getEffectFullFunctionDefinitionAccess().getNameAssignment_2(), "rule__EffectFullFunctionDefinition__NameAssignment_2");
					put(grammarAccess.getEffectFullFunctionDefinitionAccess().getArgAssignment_4(), "rule__EffectFullFunctionDefinition__ArgAssignment_4");
					put(grammarAccess.getEffectFullFunctionDefinitionAccess().getHigherOrderArgAssignment_5_1(), "rule__EffectFullFunctionDefinition__HigherOrderArgAssignment_5_1");
					put(grammarAccess.getEffectFullFunctionDefinitionAccess().getFunctionBodyAssignment_9(), "rule__EffectFullFunctionDefinition__FunctionBodyAssignment_9");
					put(grammarAccess.getMainFuncAccess().getReturnTypeAssignment_1(), "rule__MainFunc__ReturnTypeAssignment_1");
					put(grammarAccess.getMainFuncAccess().getFunctionBodyAssignment_5(), "rule__MainFunc__FunctionBodyAssignment_5");
					put(grammarAccess.getAdditionalPureArgumentAccess().getArg2Assignment(), "rule__AdditionalPureArgument__Arg2Assignment");
					put(grammarAccess.getAdditionalEffectFullArgumentAccess().getArg2Assignment(), "rule__AdditionalEffectFullArgument__Arg2Assignment");
					put(grammarAccess.getEffectFullArgumentAccess().getTypeAssignment_0(), "rule__EffectFullArgument__TypeAssignment_0");
					put(grammarAccess.getEffectFullArgumentAccess().getNameAssignment_1(), "rule__EffectFullArgument__NameAssignment_1");
					put(grammarAccess.getPureArgumentAccess().getTypeAssignment_0(), "rule__PureArgument__TypeAssignment_0");
					put(grammarAccess.getPureArgumentAccess().getNameAssignment_1(), "rule__PureArgument__NameAssignment_1");
					put(grammarAccess.getCompositionFunctionBodyPureAccess().getReferenceElementAssignment_0_0(), "rule__CompositionFunctionBodyPure__ReferenceElementAssignment_0_0");
					put(grammarAccess.getCompositionFunctionBodyPureAccess().getFunctionChainAssignment_0_1(), "rule__CompositionFunctionBodyPure__FunctionChainAssignment_0_1");
					put(grammarAccess.getCompositionFunctionBodyPureAccess().getPrimitiveElementAssignment_1_0(), "rule__CompositionFunctionBodyPure__PrimitiveElementAssignment_1_0");
					put(grammarAccess.getCompositionFunctionBodyPureAccess().getFunctionChainAssignment_1_1(), "rule__CompositionFunctionBodyPure__FunctionChainAssignment_1_1");
					put(grammarAccess.getCompositionFunctionBodyPureAccess().getExpressionElementAssignment_2_0(), "rule__CompositionFunctionBodyPure__ExpressionElementAssignment_2_0");
					put(grammarAccess.getCompositionFunctionBodyPureAccess().getFunctionChainAssignment_2_1(), "rule__CompositionFunctionBodyPure__FunctionChainAssignment_2_1");
					put(grammarAccess.getCompositionFunctionBodyPureFactorAccess().getReferenceElementAssignment_0_1(), "rule__CompositionFunctionBodyPureFactor__ReferenceElementAssignment_0_1");
					put(grammarAccess.getCompositionFunctionBodyPureFactorAccess().getPrimitiveElementAssignment_1_1(), "rule__CompositionFunctionBodyPureFactor__PrimitiveElementAssignment_1_1");
					put(grammarAccess.getCompositionFunctionBodyPureFactorAccess().getExpressionElementAssignment_2_1(), "rule__CompositionFunctionBodyPureFactor__ExpressionElementAssignment_2_1");
					put(grammarAccess.getCompositionFunctionBodyEffectAccess().getReferenceElementAssignment_0_0(), "rule__CompositionFunctionBodyEffect__ReferenceElementAssignment_0_0");
					put(grammarAccess.getCompositionFunctionBodyEffectAccess().getFunctionChainAssignment_0_1(), "rule__CompositionFunctionBodyEffect__FunctionChainAssignment_0_1");
					put(grammarAccess.getCompositionFunctionBodyEffectAccess().getPrimitiveElementAssignment_1_0(), "rule__CompositionFunctionBodyEffect__PrimitiveElementAssignment_1_0");
					put(grammarAccess.getCompositionFunctionBodyEffectAccess().getFunctionChainAssignment_1_1(), "rule__CompositionFunctionBodyEffect__FunctionChainAssignment_1_1");
					put(grammarAccess.getCompositionFunctionBodyEffectAccess().getExpressionElementAssignment_2_0(), "rule__CompositionFunctionBodyEffect__ExpressionElementAssignment_2_0");
					put(grammarAccess.getCompositionFunctionBodyEffectAccess().getFunctionChainAssignment_2_1(), "rule__CompositionFunctionBodyEffect__FunctionChainAssignment_2_1");
					put(grammarAccess.getCompositionFunctionBodyEffectFullFactorAccess().getReferenceElementAssignment_0_1(), "rule__CompositionFunctionBodyEffectFullFactor__ReferenceElementAssignment_0_1");
					put(grammarAccess.getCompositionFunctionBodyEffectFullFactorAccess().getPrimitiveElementAssignment_1_1(), "rule__CompositionFunctionBodyEffectFullFactor__PrimitiveElementAssignment_1_1");
					put(grammarAccess.getCompositionFunctionBodyEffectFullFactorAccess().getExpressionElementAssignment_2_1(), "rule__CompositionFunctionBodyEffectFullFactor__ExpressionElementAssignment_2_1");
					put(grammarAccess.getIOTypeAccess().getTypeAssignment_1(), "rule__IOType__TypeAssignment_1");
					put(grammarAccess.getIntegerTypeAccess().getTypeAssignment_1(), "rule__IntegerType__TypeAssignment_1");
					put(grammarAccess.getStringTypeAccess().getTypeAssignment_1(), "rule__StringType__TypeAssignment_1");
					put(grammarAccess.getBooleanTypeAccess().getTypeAssignment_1(), "rule__BooleanType__TypeAssignment_1");
					put(grammarAccess.getUnitTypeAccess().getTypeAssignment_1(), "rule__UnitType__TypeAssignment_1");
					put(grammarAccess.getDataTypeAccess().getTypeAssignment_2(), "rule__DataType__TypeAssignment_2");
					put(grammarAccess.getEffectFullDataTypeAccess().getTypeAssignment_2(), "rule__EffectFullDataType__TypeAssignment_2");
					put(grammarAccess.getPureFunctionTypeAccess().getArgTypeAssignment_3(), "rule__PureFunctionType__ArgTypeAssignment_3");
					put(grammarAccess.getPureFunctionTypeAccess().getReturnTypeAssignment_5(), "rule__PureFunctionType__ReturnTypeAssignment_5");
					put(grammarAccess.getEffectFullFunctionTypeAccess().getArgTypeAssignment_3(), "rule__EffectFullFunctionType__ArgTypeAssignment_3");
					put(grammarAccess.getEffectFullFunctionTypeAccess().getReturnTypeAssignment_5(), "rule__EffectFullFunctionType__ReturnTypeAssignment_5");
					put(grammarAccess.getPureAlgebraicTypeAccess().getPureAdtElement1Assignment_1(), "rule__PureAlgebraicType__PureAdtElement1Assignment_1");
					put(grammarAccess.getPureAlgebraicTypeAccess().getPureAdtElement2Assignment_2(), "rule__PureAlgebraicType__PureAdtElement2Assignment_2");
					put(grammarAccess.getPureSumTypeFactorAccess().getAdtElementAssignment_1(), "rule__PureSumTypeFactor__AdtElementAssignment_1");
					put(grammarAccess.getPureProdTypeFactorAccess().getAdtElementAssignment_1(), "rule__PureProdTypeFactor__AdtElementAssignment_1");
					put(grammarAccess.getEffectFullAlgebraicTypeAccess().getEffectFullAdtElement1Assignment_1(), "rule__EffectFullAlgebraicType__EffectFullAdtElement1Assignment_1");
					put(grammarAccess.getEffectFullAlgebraicTypeAccess().getEffectFullAdtElement2Assignment_2(), "rule__EffectFullAlgebraicType__EffectFullAdtElement2Assignment_2");
					put(grammarAccess.getEffectFullSumTypeFactorAccess().getAdtElementAssignment_1(), "rule__EffectFullSumTypeFactor__AdtElementAssignment_1");
					put(grammarAccess.getEffectFullProdTypeFactorAccess().getAdtElementAssignment_1(), "rule__EffectFullProdTypeFactor__AdtElementAssignment_1");
					put(grammarAccess.getEffectFullExpressionAccess().getInnerValueAssignment_0_3(), "rule__EffectFullExpression__InnerValueAssignment_0_3");
					put(grammarAccess.getEffectFullExpressionAccess().getInnerValueAssignment_1_3(), "rule__EffectFullExpression__InnerValueAssignment_1_3");
					put(grammarAccess.getEffectFullExpressionAccess().getPureFunctionAssignment_2_3(), "rule__EffectFullExpression__PureFunctionAssignment_2_3");
					put(grammarAccess.getEffectFullExpressionAccess().getPurePrimitiveAssignment_3_3(), "rule__EffectFullExpression__PurePrimitiveAssignment_3_3");
					put(grammarAccess.getEffectFullExpressionAccess().getEffectFullFunctionAssignment_4_3(), "rule__EffectFullExpression__EffectFullFunctionAssignment_4_3");
					put(grammarAccess.getEffectFullExpressionAccess().getEffectFullPrimitiveAssignment_5_3(), "rule__EffectFullExpression__EffectFullPrimitiveAssignment_5_3");
					put(grammarAccess.getEffectFullFunctionValueAccess().getValueAssignment(), "rule__EffectFullFunctionValue__ValueAssignment");
					put(grammarAccess.getEffectFullValueRefAccess().getValueAssignment_3(), "rule__EffectFullValueRef__ValueAssignment_3");
					put(grammarAccess.getEffectFullLambdaAccess().getArgAssignment_0_3(), "rule__EffectFullLambda__ArgAssignment_0_3");
					put(grammarAccess.getEffectFullLambdaAccess().getFunctionBodyAssignment_0_7(), "rule__EffectFullLambda__FunctionBodyAssignment_0_7");
					put(grammarAccess.getEffectFullLambdaAccess().getFunctionBodyAssignment_1_6(), "rule__EffectFullLambda__FunctionBodyAssignment_1_6");
					put(grammarAccess.getIntValueAccess().getValueAssignment_1(), "rule__IntValue__ValueAssignment_1");
					put(grammarAccess.getStringValueAccess().getValueAssignment_1(), "rule__StringValue__ValueAssignment_1");
					put(grammarAccess.getBooleanValueAccess().getValueAssignment_1(), "rule__BooleanValue__ValueAssignment_1");
					put(grammarAccess.getFunctionValueAccess().getValueAssignment(), "rule__FunctionValue__ValueAssignment");
					put(grammarAccess.getDataValueAccess().getTypeAssignment_1(), "rule__DataValue__TypeAssignment_1");
					put(grammarAccess.getDataValueAccess().getValueAssignment_3(), "rule__DataValue__ValueAssignment_3");
					put(grammarAccess.getEffectFullDataValueAccess().getTypeAssignment_1(), "rule__EffectFullDataValue__TypeAssignment_1");
					put(grammarAccess.getEffectFullDataValueAccess().getValueAssignment_3(), "rule__EffectFullDataValue__ValueAssignment_3");
					put(grammarAccess.getPureValueRefAccess().getValueAssignment_3(), "rule__PureValueRef__ValueAssignment_3");
					put(grammarAccess.getPureLambdaAccess().getArgAssignment_0_3(), "rule__PureLambda__ArgAssignment_0_3");
					put(grammarAccess.getPureLambdaAccess().getFunctionBodyAssignment_0_7(), "rule__PureLambda__FunctionBodyAssignment_0_7");
					put(grammarAccess.getPureLambdaAccess().getFunctionBodyAssignment_1_6(), "rule__PureLambda__FunctionBodyAssignment_1_6");
					put(grammarAccess.getPureProdValueAccess().getProdAdtElement1Assignment_2(), "rule__PureProdValue__ProdAdtElement1Assignment_2");
					put(grammarAccess.getPureProdValueAccess().getProdAdtElement2Assignment_4(), "rule__PureProdValue__ProdAdtElement2Assignment_4");
					put(grammarAccess.getPureSumValueAccess().getSumAdtElement1Assignment_0_3(), "rule__PureSumValue__SumAdtElement1Assignment_0_3");
					put(grammarAccess.getPureSumValueAccess().getSumAdtElement2Assignment_1_3(), "rule__PureSumValue__SumAdtElement2Assignment_1_3");
					put(grammarAccess.getEffectFullProdValueAccess().getProdAdtElement1Assignment_2(), "rule__EffectFullProdValue__ProdAdtElement1Assignment_2");
					put(grammarAccess.getEffectFullProdValueAccess().getProdAdtElement2Assignment_4(), "rule__EffectFullProdValue__ProdAdtElement2Assignment_4");
					put(grammarAccess.getEffectFullSumValueAccess().getSumAdtElement1Assignment_0_3(), "rule__EffectFullSumValue__SumAdtElement1Assignment_0_3");
					put(grammarAccess.getEffectFullSumValueAccess().getSumAdtElement2Assignment_1_3(), "rule__EffectFullSumValue__SumAdtElement2Assignment_1_3");
					put(grammarAccess.getPlusAccess().getTypeAssignment_2(), "rule__Plus__TypeAssignment_2");
					put(grammarAccess.getLeftPairAccess().getTypeAssignment_2(), "rule__LeftPair__TypeAssignment_2");
					put(grammarAccess.getRightPairAccess().getTypeAssignment_2(), "rule__RightPair__TypeAssignment_2");
					put(grammarAccess.getApplyFAccess().getFunctionTypeAssignment_2(), "rule__ApplyF__FunctionTypeAssignment_2");
					put(grammarAccess.getApplyFAccess().getValueAssignment_3(), "rule__ApplyF__ValueAssignment_3");
					put(grammarAccess.getApplyFFactorAccess().getValueReferenceAssignment_0(), "rule__ApplyFFactor__ValueReferenceAssignment_0");
					put(grammarAccess.getApplyFFactorAccess().getValueExpressionAssignment_1_1(), "rule__ApplyFFactor__ValueExpressionAssignment_1_1");
					put(grammarAccess.getEqualsAccess().getTypeAssignment_2(), "rule__Equals__TypeAssignment_2");
					put(grammarAccess.getExtractPureAccess().getDataAssignment_2(), "rule__ExtractPure__DataAssignment_2");
					put(grammarAccess.getLeftPairIOAccess().getTypeAssignment_2(), "rule__LeftPairIO__TypeAssignment_2");
					put(grammarAccess.getRightPairIOAccess().getTypeAssignment_2(), "rule__RightPairIO__TypeAssignment_2");
					put(grammarAccess.getPrimitiveReturnAccess().getTypeAssignment_2(), "rule__PrimitiveReturn__TypeAssignment_2");
					put(grammarAccess.getApplyFIOAccess().getFunctionTypeAssignment_2(), "rule__ApplyFIO__FunctionTypeAssignment_2");
					put(grammarAccess.getApplyFIOAccess().getValueAssignment_3(), "rule__ApplyFIO__ValueAssignment_3");
					put(grammarAccess.getApplyFIOFactorAccess().getValueReferenceAssignment_0(), "rule__ApplyFIOFactor__ValueReferenceAssignment_0");
					put(grammarAccess.getApplyFIOFactorAccess().getValuePrimitiveAssignment_1(), "rule__ApplyFIOFactor__ValuePrimitiveAssignment_1");
					put(grammarAccess.getApplyFIOFactorAccess().getValueExpressionAssignment_2_1(), "rule__ApplyFIOFactor__ValueExpressionAssignment_2_1");
					put(grammarAccess.getExtractEffectFullAccess().getDataAssignment_2(), "rule__ExtractEffectFull__DataAssignment_2");
				}
			};
		}
		return nameMappings.get(element);
	}

	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			InternalFPMLParser typedParser = (InternalFPMLParser) parser;
			typedParser.entryRuleModel();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public FPMLGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(FPMLGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
