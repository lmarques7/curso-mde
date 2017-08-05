/*
 * generated by Xtext 2.12.0
 */
package br.org.cursomde.ide.contentassist.antlr;

import br.org.cursomde.ide.contentassist.antlr.internal.InternalMathParser;
import br.org.cursomde.services.MathGrammarAccess;
import com.google.inject.Inject;
import java.util.HashMap;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class MathParser extends AbstractContentAssistParser {

	@Inject
	private MathGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalMathParser createParser() {
		InternalMathParser result = new InternalMathParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getExpressaoAccess().getAlternatives(), "rule__Expressao__Alternatives");
					put(grammarAccess.getSinalMatematicoAccess().getAlternatives(), "rule__SinalMatematico__Alternatives");
					put(grammarAccess.getProblemaAccess().getGroup(), "rule__Problema__Group__0");
					put(grammarAccess.getArmazenaAccess().getGroup(), "rule__Armazena__Group__0");
					put(grammarAccess.getOperacaoAccess().getGroup(), "rule__Operacao__Group__0");
					put(grammarAccess.getProblemaAccess().getNameAssignment_1(), "rule__Problema__NameAssignment_1");
					put(grammarAccess.getProblemaAccess().getExpressoesAssignment_2(), "rule__Problema__ExpressoesAssignment_2");
					put(grammarAccess.getArmazenaAccess().getTermoAssignment_1(), "rule__Armazena__TermoAssignment_1");
					put(grammarAccess.getOperacaoAccess().getSinalAssignment_0(), "rule__Operacao__SinalAssignment_0");
					put(grammarAccess.getOperacaoAccess().getTermoAssignment_1(), "rule__Operacao__TermoAssignment_1");
				}
			};
		}
		return nameMappings.get(element);
	}
			
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public MathGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(MathGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
