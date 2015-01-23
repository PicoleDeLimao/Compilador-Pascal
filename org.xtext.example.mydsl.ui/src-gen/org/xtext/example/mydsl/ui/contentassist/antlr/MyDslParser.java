/*
* generated by Xtext
*/
package org.xtext.example.mydsl.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import org.xtext.example.mydsl.services.MyDslGrammarAccess;

public class MyDslParser extends AbstractContentAssistParser {
	
	@Inject
	private MyDslGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected org.xtext.example.mydsl.ui.contentassist.antlr.internal.InternalMyDslParser createParser() {
		org.xtext.example.mydsl.ui.contentassist.antlr.internal.InternalMyDslParser result = new org.xtext.example.mydsl.ui.contentassist.antlr.internal.InternalMyDslParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getGreetingAccess().getAlternatives(), "rule__Greeting__Alternatives");
					put(grammarAccess.getNumberAccess().getAlternatives_0(), "rule__Number__Alternatives_0");
					put(grammarAccess.getNumberAccess().getAlternatives_2(), "rule__Number__Alternatives_2");
					put(grammarAccess.getNumberAccess().getAlternatives_3_0(), "rule__Number__Alternatives_3_0");
					put(grammarAccess.getNumberAccess().getAlternatives_3_1(), "rule__Number__Alternatives_3_1");
					put(grammarAccess.getSIGNED_REAL_NUMBERAccess().getAlternatives_0(), "rule__SIGNED_REAL_NUMBER__Alternatives_0");
					put(grammarAccess.getREAL_NUMBERAccess().getAlternatives(), "rule__REAL_NUMBER__Alternatives");
					put(grammarAccess.getREAL_NUMBERAccess().getAlternatives_0_3_0(), "rule__REAL_NUMBER__Alternatives_0_3_0");
					put(grammarAccess.getREAL_NUMBERAccess().getAlternatives_1_1(), "rule__REAL_NUMBER__Alternatives_1_1");
					put(grammarAccess.getDIGIT_SEQUENCEAccess().getAlternatives_0(), "rule__DIGIT_SEQUENCE__Alternatives_0");
					put(grammarAccess.getGreetingAccess().getGroup_0(), "rule__Greeting__Group_0__0");
					put(grammarAccess.getNumberAccess().getGroup(), "rule__Number__Group__0");
					put(grammarAccess.getNumberAccess().getGroup_3(), "rule__Number__Group_3__0");
					put(grammarAccess.getSIGNED_REAL_NUMBERAccess().getGroup(), "rule__SIGNED_REAL_NUMBER__Group__0");
					put(grammarAccess.getREAL_NUMBERAccess().getGroup_0(), "rule__REAL_NUMBER__Group_0__0");
					put(grammarAccess.getREAL_NUMBERAccess().getGroup_0_3(), "rule__REAL_NUMBER__Group_0_3__0");
					put(grammarAccess.getREAL_NUMBERAccess().getGroup_1(), "rule__REAL_NUMBER__Group_1__0");
					put(grammarAccess.getDIGIT_SEQUENCEAccess().getGroup(), "rule__DIGIT_SEQUENCE__Group__0");
					put(grammarAccess.getModelAccess().getGreetingsAssignment(), "rule__Model__GreetingsAssignment");
					put(grammarAccess.getGreetingAccess().getNameAssignment_0_1(), "rule__Greeting__NameAssignment_0_1");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			org.xtext.example.mydsl.ui.contentassist.antlr.internal.InternalMyDslParser typedParser = (org.xtext.example.mydsl.ui.contentassist.antlr.internal.InternalMyDslParser) parser;
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
	
	public MyDslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}