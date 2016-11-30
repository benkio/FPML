/*
 * generated by Xtext 2.10.0
 */
package it.unibo.serializer;

import com.google.inject.Inject;
import it.unibo.services.FPMLGrammarAccess;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public class FPMLSyntacticSequencer extends AbstractSyntacticSequencer {

	protected FPMLGrammarAccess grammarAccess;
	protected AbstractElementAlias match_EffectFullAdtValue___IOKeyword_1_0_LeftSquareBracketKeyword_1_1__a;
	protected AbstractElementAlias match_EffectFullExpression___IOKeyword_0_0_LeftSquareBracketKeyword_0_1__a;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (FPMLGrammarAccess) access;
		match_EffectFullAdtValue___IOKeyword_1_0_LeftSquareBracketKeyword_1_1__a = new GroupAlias(true, true, new TokenAlias(false, false, grammarAccess.getEffectFullAdtValueAccess().getIOKeyword_1_0()), new TokenAlias(false, false, grammarAccess.getEffectFullAdtValueAccess().getLeftSquareBracketKeyword_1_1()));
		match_EffectFullExpression___IOKeyword_0_0_LeftSquareBracketKeyword_0_1__a = new GroupAlias(true, true, new TokenAlias(false, false, grammarAccess.getEffectFullExpressionAccess().getIOKeyword_0_0()), new TokenAlias(false, false, grammarAccess.getEffectFullExpressionAccess().getLeftSquareBracketKeyword_0_1()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		return "";
	}
	
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if (match_EffectFullAdtValue___IOKeyword_1_0_LeftSquareBracketKeyword_1_1__a.equals(syntax))
				emit_EffectFullAdtValue___IOKeyword_1_0_LeftSquareBracketKeyword_1_1__a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_EffectFullExpression___IOKeyword_0_0_LeftSquareBracketKeyword_0_1__a.equals(syntax))
				emit_EffectFullExpression___IOKeyword_0_0_LeftSquareBracketKeyword_0_1__a(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     ('IO' '[')*
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) '(' prodAdtElement1=EffectFullAdtValue
	 *     (rule start) (ambiguity) '()' (rule start)
	 *     (rule start) (ambiguity) 'IO' '(' '(' prodAdtElement1=PureAdtValue
	 *     (rule start) (ambiguity) 'IO' '(' 'Left' '(' sumAdtElement1=PureAdtValue
	 *     (rule start) (ambiguity) 'IO' '(' 'Right' '(' sumAdtElement2=PureAdtValue
	 *     (rule start) (ambiguity) 'IO' '(' type=[PureData|ID]
	 *     (rule start) (ambiguity) 'IO' '(' value=INT
	 *     (rule start) (ambiguity) 'IO' '(' value=PureLambda
	 *     (rule start) (ambiguity) 'IO' '(' value=STRING
	 *     (rule start) (ambiguity) 'IO' '(' value=[PureValue|ID]
	 *     (rule start) (ambiguity) 'Left' '(' sumAdtElement1=EffectFullAdtValue
	 *     (rule start) (ambiguity) 'Right' '(' sumAdtElement2=EffectFullAdtValue
	 *     (rule start) (ambiguity) value=EffectFullLambda
	 *     (rule start) (ambiguity) value=[EffectFullValue|ID]
	 */
	protected void emit_EffectFullAdtValue___IOKeyword_1_0_LeftSquareBracketKeyword_1_1__a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('IO' '[')*
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) '()' (rule start)
	 *     (rule start) (ambiguity) 'IO' '(' type=[PureData|ID]
	 *     (rule start) (ambiguity) 'IO' '(' value=INT
	 *     (rule start) (ambiguity) 'IO' '(' value=PureLambda
	 *     (rule start) (ambiguity) 'IO' '(' value=STRING
	 *     (rule start) (ambiguity) type=[EffectFullData|ID]
	 *     (rule start) (ambiguity) value=EffectFullLambda
	 */
	protected void emit_EffectFullExpression___IOKeyword_0_0_LeftSquareBracketKeyword_0_1__a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
