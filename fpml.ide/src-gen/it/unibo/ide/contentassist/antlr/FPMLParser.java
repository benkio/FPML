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
					put(grammarAccess.getAdtTypeAccess().getAlternatives(), "rule__AdtType__Alternatives");
					put(grammarAccess.getAdtTypeAccess().getAdtElement2Alternatives_1_2_0(), "rule__AdtType__AdtElement2Alternatives_1_2_0");
					put(grammarAccess.getChainElementAccess().getAlternatives(), "rule__ChainElement__Alternatives");
					put(grammarAccess.getInitialPureChainElementAccess().getAlternatives(), "rule__InitialPureChainElement__Alternatives");
					put(grammarAccess.getFunctionBodyPureAccess().getAlternatives(), "rule__FunctionBodyPure__Alternatives");
					put(grammarAccess.getFunctionBodyEffectFullAccess().getAlternatives(), "rule__FunctionBodyEffectFull__Alternatives");
					put(grammarAccess.getCompositionFunctionBodyPureAccess().getAlternatives(), "rule__CompositionFunctionBodyPure__Alternatives");
					put(grammarAccess.getCompositionFunctionBodyPureFactorAccess().getAlternatives(), "rule__CompositionFunctionBodyPureFactor__Alternatives");
					put(grammarAccess.getCompositionFunctionBodyEffectAccess().getAlternatives(), "rule__CompositionFunctionBodyEffect__Alternatives");
					put(grammarAccess.getCompositionFunctionBodyEffectFullFactorAccess().getAlternatives(), "rule__CompositionFunctionBodyEffectFullFactor__Alternatives");
					put(grammarAccess.getCompositionFunctionBodyEffectFullFactorAccess().getPrimitiveElementAlternatives_1_1_0(), "rule__CompositionFunctionBodyEffectFullFactor__PrimitiveElementAlternatives_1_1_0");
					put(grammarAccess.getValueTypeAccess().getAlternatives(), "rule__ValueType__Alternatives");
					put(grammarAccess.getTypeAccess().getAlternatives(), "rule__Type__Alternatives");
					put(grammarAccess.getExpressionAccess().getAlternatives(), "rule__Expression__Alternatives");
					put(grammarAccess.getAdtValueAccess().getAlternatives(), "rule__AdtValue__Alternatives");
					put(grammarAccess.getSumValueAccess().getAlternatives(), "rule__SumValue__Alternatives");
					put(grammarAccess.getPrimitivePureFunctionAccess().getAlternatives(), "rule__PrimitivePureFunction__Alternatives");
					put(grammarAccess.getModelAccess().getGroup(), "rule__Model__Group__0");
					put(grammarAccess.getPureBlockAccess().getGroup(), "rule__PureBlock__Group__0");
					put(grammarAccess.getPureFunctionBlockAccess().getGroup(), "rule__PureFunctionBlock__Group__0");
					put(grammarAccess.getDataBlockAccess().getGroup(), "rule__DataBlock__Group__0");
					put(grammarAccess.getValueBlockAccess().getGroup(), "rule__ValueBlock__Group__0");
					put(grammarAccess.getEffectFullBlockAccess().getGroup(), "rule__EffectFullBlock__Group__0");
					put(grammarAccess.getDataAccess().getGroup(), "rule__Data__Group__0");
					put(grammarAccess.getValueAccess().getGroup(), "rule__Value__Group__0");
					put(grammarAccess.getAdtTypeAccess().getGroup_1(), "rule__AdtType__Group_1__0");
					put(grammarAccess.getSumTypeAccess().getGroup(), "rule__SumType__Group__0");
					put(grammarAccess.getProdTypeAccess().getGroup(), "rule__ProdType__Group__0");
					put(grammarAccess.getPureFunctionDefinitionAccess().getGroup(), "rule__PureFunctionDefinition__Group__0");
					put(grammarAccess.getEffectFullFunctionDefinitionAccess().getGroup(), "rule__EffectFullFunctionDefinition__Group__0");
					put(grammarAccess.getMainFuncAccess().getGroup(), "rule__MainFunc__Group__0");
					put(grammarAccess.getEffectFullArgumentAccess().getGroup(), "rule__EffectFullArgument__Group__0");
					put(grammarAccess.getArgumentAccess().getGroup(), "rule__Argument__Group__0");
					put(grammarAccess.getEmptyFunctionBodyAccess().getGroup(), "rule__EmptyFunctionBody__Group__0");
					put(grammarAccess.getCompositionFunctionBodyPureAccess().getGroup_0(), "rule__CompositionFunctionBodyPure__Group_0__0");
					put(grammarAccess.getCompositionFunctionBodyPureAccess().getGroup_1(), "rule__CompositionFunctionBodyPure__Group_1__0");
					put(grammarAccess.getCompositionFunctionBodyPureFactorAccess().getGroup_0(), "rule__CompositionFunctionBodyPureFactor__Group_0__0");
					put(grammarAccess.getCompositionFunctionBodyPureFactorAccess().getGroup_1(), "rule__CompositionFunctionBodyPureFactor__Group_1__0");
					put(grammarAccess.getCompositionFunctionBodyEffectAccess().getGroup_0(), "rule__CompositionFunctionBodyEffect__Group_0__0");
					put(grammarAccess.getCompositionFunctionBodyEffectAccess().getGroup_1(), "rule__CompositionFunctionBodyEffect__Group_1__0");
					put(grammarAccess.getCompositionFunctionBodyEffectFullFactorAccess().getGroup_0(), "rule__CompositionFunctionBodyEffectFullFactor__Group_0__0");
					put(grammarAccess.getCompositionFunctionBodyEffectFullFactorAccess().getGroup_1(), "rule__CompositionFunctionBodyEffectFullFactor__Group_1__0");
					put(grammarAccess.getReturnPureFunctionAccess().getGroup(), "rule__ReturnPureFunction__Group__0");
					put(grammarAccess.getReturnEffectFullFunctionAccess().getGroup(), "rule__ReturnEffectFullFunction__Group__0");
					put(grammarAccess.getIOTypeAccess().getGroup(), "rule__IOType__Group__0");
					put(grammarAccess.getIntegerTypeAccess().getGroup(), "rule__IntegerType__Group__0");
					put(grammarAccess.getStringTypeAccess().getGroup(), "rule__StringType__Group__0");
					put(grammarAccess.getUnitTypeAccess().getGroup(), "rule__UnitType__Group__0");
					put(grammarAccess.getDataTypeAccess().getGroup(), "rule__DataType__Group__0");
					put(grammarAccess.getPureFunctionTypeAccess().getGroup(), "rule__PureFunctionType__Group__0");
					put(grammarAccess.getEffectFullFunctionTypeAccess().getGroup(), "rule__EffectFullFunctionType__Group__0");
					put(grammarAccess.getIntValueAccess().getGroup(), "rule__IntValue__Group__0");
					put(grammarAccess.getStringValueAccess().getGroup(), "rule__StringValue__Group__0");
					put(grammarAccess.getUnitValueAccess().getGroup(), "rule__UnitValue__Group__0");
					put(grammarAccess.getDataValueAccess().getGroup(), "rule__DataValue__Group__0");
					put(grammarAccess.getValueRefAccess().getGroup(), "rule__ValueRef__Group__0");
					put(grammarAccess.getPureLambdaAccess().getGroup(), "rule__PureLambda__Group__0");
					put(grammarAccess.getEffectFullLambdaAccess().getGroup(), "rule__EffectFullLambda__Group__0");
					put(grammarAccess.getProdValueAccess().getGroup(), "rule__ProdValue__Group__0");
					put(grammarAccess.getSumValueAccess().getGroup_0(), "rule__SumValue__Group_0__0");
					put(grammarAccess.getSumValueAccess().getGroup_1(), "rule__SumValue__Group_1__0");
					put(grammarAccess.getIntToStringAccess().getGroup(), "rule__IntToString__Group__0");
					put(grammarAccess.getIntPowAccess().getGroup(), "rule__IntPow__Group__0");
					put(grammarAccess.getPrimitivePrintAccess().getGroup(), "rule__PrimitivePrint__Group__0");
					put(grammarAccess.getModelAccess().getElementsAssignment_0(), "rule__Model__ElementsAssignment_0");
					put(grammarAccess.getModelAccess().getElementsAssignment_1(), "rule__Model__ElementsAssignment_1");
					put(grammarAccess.getPureBlockAccess().getElementsAssignment_2(), "rule__PureBlock__ElementsAssignment_2");
					put(grammarAccess.getPureBlockAccess().getElementsAssignment_3(), "rule__PureBlock__ElementsAssignment_3");
					put(grammarAccess.getPureFunctionBlockAccess().getFeaturesAssignment_2(), "rule__PureFunctionBlock__FeaturesAssignment_2");
					put(grammarAccess.getDataBlockAccess().getElementsAssignment_2(), "rule__DataBlock__ElementsAssignment_2");
					put(grammarAccess.getDataBlockAccess().getValueAssignment_3(), "rule__DataBlock__ValueAssignment_3");
					put(grammarAccess.getValueBlockAccess().getElementsAssignment_2(), "rule__ValueBlock__ElementsAssignment_2");
					put(grammarAccess.getEffectFullBlockAccess().getFeaturesAssignment_2(), "rule__EffectFullBlock__FeaturesAssignment_2");
					put(grammarAccess.getEffectFullBlockAccess().getMainAssignment_3(), "rule__EffectFullBlock__MainAssignment_3");
					put(grammarAccess.getDataAccess().getNameAssignment_0(), "rule__Data__NameAssignment_0");
					put(grammarAccess.getDataAccess().getContentAssignment_2(), "rule__Data__ContentAssignment_2");
					put(grammarAccess.getValueAccess().getNameAssignment_0(), "rule__Value__NameAssignment_0");
					put(grammarAccess.getValueAccess().getValueAssignment_2(), "rule__Value__ValueAssignment_2");
					put(grammarAccess.getAdtTypeAccess().getAdtElement1Assignment_1_1(), "rule__AdtType__AdtElement1Assignment_1_1");
					put(grammarAccess.getAdtTypeAccess().getAdtElement2Assignment_1_2(), "rule__AdtType__AdtElement2Assignment_1_2");
					put(grammarAccess.getSumTypeAccess().getAdtElementAssignment_1(), "rule__SumType__AdtElementAssignment_1");
					put(grammarAccess.getProdTypeAccess().getAdtElementAssignment_1(), "rule__ProdType__AdtElementAssignment_1");
					put(grammarAccess.getPureFunctionDefinitionAccess().getReturnTypeAssignment_1(), "rule__PureFunctionDefinition__ReturnTypeAssignment_1");
					put(grammarAccess.getPureFunctionDefinitionAccess().getNameAssignment_2(), "rule__PureFunctionDefinition__NameAssignment_2");
					put(grammarAccess.getPureFunctionDefinitionAccess().getArgAssignment_4(), "rule__PureFunctionDefinition__ArgAssignment_4");
					put(grammarAccess.getPureFunctionDefinitionAccess().getFunctionBodyAssignment_8(), "rule__PureFunctionDefinition__FunctionBodyAssignment_8");
					put(grammarAccess.getEffectFullFunctionDefinitionAccess().getReturnTypeAssignment_1(), "rule__EffectFullFunctionDefinition__ReturnTypeAssignment_1");
					put(grammarAccess.getEffectFullFunctionDefinitionAccess().getNameAssignment_2(), "rule__EffectFullFunctionDefinition__NameAssignment_2");
					put(grammarAccess.getEffectFullFunctionDefinitionAccess().getArgAssignment_4(), "rule__EffectFullFunctionDefinition__ArgAssignment_4");
					put(grammarAccess.getEffectFullFunctionDefinitionAccess().getFunctionBodyAssignment_8(), "rule__EffectFullFunctionDefinition__FunctionBodyAssignment_8");
					put(grammarAccess.getMainFuncAccess().getReturnTypeAssignment_1(), "rule__MainFunc__ReturnTypeAssignment_1");
					put(grammarAccess.getMainFuncAccess().getFunctionBodyAssignment_5(), "rule__MainFunc__FunctionBodyAssignment_5");
					put(grammarAccess.getEffectFullArgumentAccess().getTypeAssignment_0(), "rule__EffectFullArgument__TypeAssignment_0");
					put(grammarAccess.getEffectFullArgumentAccess().getNameAssignment_1(), "rule__EffectFullArgument__NameAssignment_1");
					put(grammarAccess.getArgumentAccess().getTypeAssignment_0(), "rule__Argument__TypeAssignment_0");
					put(grammarAccess.getArgumentAccess().getNameAssignment_1(), "rule__Argument__NameAssignment_1");
					put(grammarAccess.getCompositionFunctionBodyPureAccess().getReferenceElementAssignment_0_0(), "rule__CompositionFunctionBodyPure__ReferenceElementAssignment_0_0");
					put(grammarAccess.getCompositionFunctionBodyPureAccess().getFunctionChainAssignment_0_1(), "rule__CompositionFunctionBodyPure__FunctionChainAssignment_0_1");
					put(grammarAccess.getCompositionFunctionBodyPureAccess().getReturnFunctionAssignment_0_2(), "rule__CompositionFunctionBodyPure__ReturnFunctionAssignment_0_2");
					put(grammarAccess.getCompositionFunctionBodyPureAccess().getPrimitiveElementAssignment_1_0(), "rule__CompositionFunctionBodyPure__PrimitiveElementAssignment_1_0");
					put(grammarAccess.getCompositionFunctionBodyPureAccess().getFunctionChainAssignment_1_1(), "rule__CompositionFunctionBodyPure__FunctionChainAssignment_1_1");
					put(grammarAccess.getCompositionFunctionBodyPureAccess().getReturnFunctionAssignment_1_2(), "rule__CompositionFunctionBodyPure__ReturnFunctionAssignment_1_2");
					put(grammarAccess.getCompositionFunctionBodyPureFactorAccess().getReferenceElementAssignment_0_1(), "rule__CompositionFunctionBodyPureFactor__ReferenceElementAssignment_0_1");
					put(grammarAccess.getCompositionFunctionBodyPureFactorAccess().getPrimitiveElementAssignment_1_1(), "rule__CompositionFunctionBodyPureFactor__PrimitiveElementAssignment_1_1");
					put(grammarAccess.getCompositionFunctionBodyEffectAccess().getReferenceElementAssignment_0_0(), "rule__CompositionFunctionBodyEffect__ReferenceElementAssignment_0_0");
					put(grammarAccess.getCompositionFunctionBodyEffectAccess().getFunctionChainAssignment_0_1(), "rule__CompositionFunctionBodyEffect__FunctionChainAssignment_0_1");
					put(grammarAccess.getCompositionFunctionBodyEffectAccess().getReturnFunctionAssignment_0_2(), "rule__CompositionFunctionBodyEffect__ReturnFunctionAssignment_0_2");
					put(grammarAccess.getCompositionFunctionBodyEffectAccess().getPrimitiveElementAssignment_1_0(), "rule__CompositionFunctionBodyEffect__PrimitiveElementAssignment_1_0");
					put(grammarAccess.getCompositionFunctionBodyEffectAccess().getFunctionChainAssignment_1_1(), "rule__CompositionFunctionBodyEffect__FunctionChainAssignment_1_1");
					put(grammarAccess.getCompositionFunctionBodyEffectAccess().getReturnFunctionAssignment_1_2(), "rule__CompositionFunctionBodyEffect__ReturnFunctionAssignment_1_2");
					put(grammarAccess.getCompositionFunctionBodyEffectFullFactorAccess().getReferenceElementAssignment_0_1(), "rule__CompositionFunctionBodyEffectFullFactor__ReferenceElementAssignment_0_1");
					put(grammarAccess.getCompositionFunctionBodyEffectFullFactorAccess().getPrimitiveElementAssignment_1_1(), "rule__CompositionFunctionBodyEffectFullFactor__PrimitiveElementAssignment_1_1");
					put(grammarAccess.getReturnPureFunctionAccess().getLambdaFunctionBodyAssignment_2(), "rule__ReturnPureFunction__LambdaFunctionBodyAssignment_2");
					put(grammarAccess.getReturnEffectFullFunctionAccess().getLambdaFunctionBodyAssignment_2(), "rule__ReturnEffectFullFunction__LambdaFunctionBodyAssignment_2");
					put(grammarAccess.getIOTypeAccess().getTypeAssignment_1(), "rule__IOType__TypeAssignment_1");
					put(grammarAccess.getIntegerTypeAccess().getTypeAssignment_1(), "rule__IntegerType__TypeAssignment_1");
					put(grammarAccess.getStringTypeAccess().getTypeAssignment_1(), "rule__StringType__TypeAssignment_1");
					put(grammarAccess.getUnitTypeAccess().getTypeAssignment_1(), "rule__UnitType__TypeAssignment_1");
					put(grammarAccess.getDataTypeAccess().getTypeAssignment_2(), "rule__DataType__TypeAssignment_2");
					put(grammarAccess.getPureFunctionTypeAccess().getArgTypeAssignment_3(), "rule__PureFunctionType__ArgTypeAssignment_3");
					put(grammarAccess.getPureFunctionTypeAccess().getReturnTypeAssignment_5(), "rule__PureFunctionType__ReturnTypeAssignment_5");
					put(grammarAccess.getEffectFullFunctionTypeAccess().getArgTypeAssignment_3(), "rule__EffectFullFunctionType__ArgTypeAssignment_3");
					put(grammarAccess.getEffectFullFunctionTypeAccess().getReturnTypeAssignment_5(), "rule__EffectFullFunctionType__ReturnTypeAssignment_5");
					put(grammarAccess.getIntValueAccess().getValueAssignment_1(), "rule__IntValue__ValueAssignment_1");
					put(grammarAccess.getStringValueAccess().getValueAssignment_1(), "rule__StringValue__ValueAssignment_1");
					put(grammarAccess.getFunctionValueAccess().getValueAssignment(), "rule__FunctionValue__ValueAssignment");
					put(grammarAccess.getDataValueAccess().getTypeAssignment_1(), "rule__DataValue__TypeAssignment_1");
					put(grammarAccess.getDataValueAccess().getValueAssignment_3(), "rule__DataValue__ValueAssignment_3");
					put(grammarAccess.getValueRefAccess().getValueAssignment_1(), "rule__ValueRef__ValueAssignment_1");
					put(grammarAccess.getPureLambdaAccess().getArgAssignment_1(), "rule__PureLambda__ArgAssignment_1");
					put(grammarAccess.getPureLambdaAccess().getFunctionBodyAssignment_4(), "rule__PureLambda__FunctionBodyAssignment_4");
					put(grammarAccess.getEffectFullLambdaAccess().getArgAssignment_1(), "rule__EffectFullLambda__ArgAssignment_1");
					put(grammarAccess.getEffectFullLambdaAccess().getFunctionBodyAssignment_4(), "rule__EffectFullLambda__FunctionBodyAssignment_4");
					put(grammarAccess.getProdValueAccess().getProdAdtElement1Assignment_1(), "rule__ProdValue__ProdAdtElement1Assignment_1");
					put(grammarAccess.getProdValueAccess().getProdAdtElement2Assignment_3(), "rule__ProdValue__ProdAdtElement2Assignment_3");
					put(grammarAccess.getSumValueAccess().getSumAdtElement1Assignment_0_2(), "rule__SumValue__SumAdtElement1Assignment_0_2");
					put(grammarAccess.getSumValueAccess().getSumAdtElement2Assignment_1_2(), "rule__SumValue__SumAdtElement2Assignment_1_2");
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
