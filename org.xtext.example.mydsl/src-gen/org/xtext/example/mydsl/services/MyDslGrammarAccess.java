/*
* generated by Xtext
*/
package org.xtext.example.mydsl.services;

import com.google.inject.Singleton;
import com.google.inject.Inject;

import java.util.List;

import org.eclipse.xtext.*;
import org.eclipse.xtext.service.GrammarProvider;
import org.eclipse.xtext.service.AbstractElementFinder.*;

import org.eclipse.xtext.common.services.TerminalsGrammarAccess;

@Singleton
public class MyDslGrammarAccess extends AbstractGrammarElementFinder {
	
	
	public class ModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Model");
		private final Assignment cGreetingsAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cGreetingsGreetingParserRuleCall_0 = (RuleCall)cGreetingsAssignment.eContents().get(0);
		
		//Model:
		//	greetings+=Greeting*;
		public ParserRule getRule() { return rule; }

		//greetings+=Greeting*
		public Assignment getGreetingsAssignment() { return cGreetingsAssignment; }

		//Greeting
		public RuleCall getGreetingsGreetingParserRuleCall_0() { return cGreetingsGreetingParserRuleCall_0; }
	}

	public class GreetingElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Greeting");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cAlternatives.eContents().get(0);
		private final Keyword cHelloKeyword_0_0 = (Keyword)cGroup_0.eContents().get(0);
		private final Assignment cNameAssignment_0_1 = (Assignment)cGroup_0.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_0_1_0 = (RuleCall)cNameAssignment_0_1.eContents().get(0);
		private final Keyword cExclamationMarkKeyword_0_2 = (Keyword)cGroup_0.eContents().get(2);
		private final RuleCall cNumberParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//Greeting:
		//	"Hello" name=ID "!" | number;
		public ParserRule getRule() { return rule; }

		//"Hello" name=ID "!" | number
		public Alternatives getAlternatives() { return cAlternatives; }

		//"Hello" name=ID "!"
		public Group getGroup_0() { return cGroup_0; }

		//"Hello"
		public Keyword getHelloKeyword_0_0() { return cHelloKeyword_0_0; }

		//name=ID
		public Assignment getNameAssignment_0_1() { return cNameAssignment_0_1; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_0_1_0() { return cNameIDTerminalRuleCall_0_1_0; }

		//"!"
		public Keyword getExclamationMarkKeyword_0_2() { return cExclamationMarkKeyword_0_2; }

		//number
		public RuleCall getNumberParserRuleCall_1() { return cNumberParserRuleCall_1; }
	}

	public class NumberElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "number");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Alternatives cAlternatives_0 = (Alternatives)cGroup.eContents().get(0);
		private final Keyword cDigitZeroKeyword_0_0 = (Keyword)cAlternatives_0.eContents().get(0);
		private final Keyword cDigitOneKeyword_0_1 = (Keyword)cAlternatives_0.eContents().get(1);
		private final Keyword cDigitTwoKeyword_0_2 = (Keyword)cAlternatives_0.eContents().get(2);
		private final Keyword cDigitThreeKeyword_0_3 = (Keyword)cAlternatives_0.eContents().get(3);
		private final Keyword cDigitFourKeyword_0_4 = (Keyword)cAlternatives_0.eContents().get(4);
		private final Keyword cDigitFiveKeyword_0_5 = (Keyword)cAlternatives_0.eContents().get(5);
		private final Keyword cDigitSixKeyword_0_6 = (Keyword)cAlternatives_0.eContents().get(6);
		private final Keyword cDigitSevenKeyword_0_7 = (Keyword)cAlternatives_0.eContents().get(7);
		private final Keyword cDigitEightKeyword_0_8 = (Keyword)cAlternatives_0.eContents().get(8);
		private final Keyword cDigitNineKeyword_0_9 = (Keyword)cAlternatives_0.eContents().get(9);
		private final Keyword cFullStopKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Alternatives cAlternatives_2 = (Alternatives)cGroup.eContents().get(2);
		private final Keyword cDigitZeroKeyword_2_0 = (Keyword)cAlternatives_2.eContents().get(0);
		private final Keyword cDigitOneKeyword_2_1 = (Keyword)cAlternatives_2.eContents().get(1);
		private final Keyword cDigitTwoKeyword_2_2 = (Keyword)cAlternatives_2.eContents().get(2);
		private final Keyword cDigitThreeKeyword_2_3 = (Keyword)cAlternatives_2.eContents().get(3);
		private final Keyword cDigitFourKeyword_2_4 = (Keyword)cAlternatives_2.eContents().get(4);
		private final Keyword cDigitFiveKeyword_2_5 = (Keyword)cAlternatives_2.eContents().get(5);
		private final Keyword cDigitSixKeyword_2_6 = (Keyword)cAlternatives_2.eContents().get(6);
		private final Keyword cDigitSevenKeyword_2_7 = (Keyword)cAlternatives_2.eContents().get(7);
		private final Keyword cDigitEightKeyword_2_8 = (Keyword)cAlternatives_2.eContents().get(8);
		private final Keyword cDigitNineKeyword_2_9 = (Keyword)cAlternatives_2.eContents().get(9);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Alternatives cAlternatives_3_0 = (Alternatives)cGroup_3.eContents().get(0);
		private final Keyword cEKeyword_3_0_0 = (Keyword)cAlternatives_3_0.eContents().get(0);
		private final Keyword cEKeyword_3_0_1 = (Keyword)cAlternatives_3_0.eContents().get(1);
		private final Alternatives cAlternatives_3_1 = (Alternatives)cGroup_3.eContents().get(1);
		private final Keyword cDigitZeroKeyword_3_1_0 = (Keyword)cAlternatives_3_1.eContents().get(0);
		private final Keyword cDigitOneKeyword_3_1_1 = (Keyword)cAlternatives_3_1.eContents().get(1);
		private final Keyword cDigitTwoKeyword_3_1_2 = (Keyword)cAlternatives_3_1.eContents().get(2);
		private final Keyword cDigitThreeKeyword_3_1_3 = (Keyword)cAlternatives_3_1.eContents().get(3);
		private final Keyword cDigitFourKeyword_3_1_4 = (Keyword)cAlternatives_3_1.eContents().get(4);
		private final Keyword cDigitFiveKeyword_3_1_5 = (Keyword)cAlternatives_3_1.eContents().get(5);
		private final Keyword cDigitSixKeyword_3_1_6 = (Keyword)cAlternatives_3_1.eContents().get(6);
		private final Keyword cDigitSevenKeyword_3_1_7 = (Keyword)cAlternatives_3_1.eContents().get(7);
		private final Keyword cDigitEightKeyword_3_1_8 = (Keyword)cAlternatives_3_1.eContents().get(8);
		private final Keyword cDigitNineKeyword_3_1_9 = (Keyword)cAlternatives_3_1.eContents().get(9);
		
		//number:
		//	("0" | "1" | "2" | "3" | "4" | "5" | "6" | "7" | "8" | "9")+ "." ("0" | "1" | "2" | "3" | "4" | "5" | "6" | "7" | "8"
		//	| "9")+ (("E" | "e") ("0" | "1" | "2" | "3" | "4" | "5" | "6" | "7" | "8" | "9")+)?;
		public ParserRule getRule() { return rule; }

		//("0" | "1" | "2" | "3" | "4" | "5" | "6" | "7" | "8" | "9")+ "." ("0" | "1" | "2" | "3" | "4" | "5" | "6" | "7" | "8" |
		//"9")+ (("E" | "e") ("0" | "1" | "2" | "3" | "4" | "5" | "6" | "7" | "8" | "9")+)?
		public Group getGroup() { return cGroup; }

		//("0" | "1" | "2" | "3" | "4" | "5" | "6" | "7" | "8" | "9")+
		public Alternatives getAlternatives_0() { return cAlternatives_0; }

		//"0"
		public Keyword getDigitZeroKeyword_0_0() { return cDigitZeroKeyword_0_0; }

		//"1"
		public Keyword getDigitOneKeyword_0_1() { return cDigitOneKeyword_0_1; }

		//"2"
		public Keyword getDigitTwoKeyword_0_2() { return cDigitTwoKeyword_0_2; }

		//"3"
		public Keyword getDigitThreeKeyword_0_3() { return cDigitThreeKeyword_0_3; }

		//"4"
		public Keyword getDigitFourKeyword_0_4() { return cDigitFourKeyword_0_4; }

		//"5"
		public Keyword getDigitFiveKeyword_0_5() { return cDigitFiveKeyword_0_5; }

		//"6"
		public Keyword getDigitSixKeyword_0_6() { return cDigitSixKeyword_0_6; }

		//"7"
		public Keyword getDigitSevenKeyword_0_7() { return cDigitSevenKeyword_0_7; }

		//"8"
		public Keyword getDigitEightKeyword_0_8() { return cDigitEightKeyword_0_8; }

		//"9"
		public Keyword getDigitNineKeyword_0_9() { return cDigitNineKeyword_0_9; }

		//"."
		public Keyword getFullStopKeyword_1() { return cFullStopKeyword_1; }

		//("0" | "1" | "2" | "3" | "4" | "5" | "6" | "7" | "8" | "9")+
		public Alternatives getAlternatives_2() { return cAlternatives_2; }

		//"0"
		public Keyword getDigitZeroKeyword_2_0() { return cDigitZeroKeyword_2_0; }

		//"1"
		public Keyword getDigitOneKeyword_2_1() { return cDigitOneKeyword_2_1; }

		//"2"
		public Keyword getDigitTwoKeyword_2_2() { return cDigitTwoKeyword_2_2; }

		//"3"
		public Keyword getDigitThreeKeyword_2_3() { return cDigitThreeKeyword_2_3; }

		//"4"
		public Keyword getDigitFourKeyword_2_4() { return cDigitFourKeyword_2_4; }

		//"5"
		public Keyword getDigitFiveKeyword_2_5() { return cDigitFiveKeyword_2_5; }

		//"6"
		public Keyword getDigitSixKeyword_2_6() { return cDigitSixKeyword_2_6; }

		//"7"
		public Keyword getDigitSevenKeyword_2_7() { return cDigitSevenKeyword_2_7; }

		//"8"
		public Keyword getDigitEightKeyword_2_8() { return cDigitEightKeyword_2_8; }

		//"9"
		public Keyword getDigitNineKeyword_2_9() { return cDigitNineKeyword_2_9; }

		//(("E" | "e") ("0" | "1" | "2" | "3" | "4" | "5" | "6" | "7" | "8" | "9")+)?
		public Group getGroup_3() { return cGroup_3; }

		//"E" | "e"
		public Alternatives getAlternatives_3_0() { return cAlternatives_3_0; }

		//"E"
		public Keyword getEKeyword_3_0_0() { return cEKeyword_3_0_0; }

		//"e"
		public Keyword getEKeyword_3_0_1() { return cEKeyword_3_0_1; }

		//("0" | "1" | "2" | "3" | "4" | "5" | "6" | "7" | "8" | "9")+
		public Alternatives getAlternatives_3_1() { return cAlternatives_3_1; }

		//"0"
		public Keyword getDigitZeroKeyword_3_1_0() { return cDigitZeroKeyword_3_1_0; }

		//"1"
		public Keyword getDigitOneKeyword_3_1_1() { return cDigitOneKeyword_3_1_1; }

		//"2"
		public Keyword getDigitTwoKeyword_3_1_2() { return cDigitTwoKeyword_3_1_2; }

		//"3"
		public Keyword getDigitThreeKeyword_3_1_3() { return cDigitThreeKeyword_3_1_3; }

		//"4"
		public Keyword getDigitFourKeyword_3_1_4() { return cDigitFourKeyword_3_1_4; }

		//"5"
		public Keyword getDigitFiveKeyword_3_1_5() { return cDigitFiveKeyword_3_1_5; }

		//"6"
		public Keyword getDigitSixKeyword_3_1_6() { return cDigitSixKeyword_3_1_6; }

		//"7"
		public Keyword getDigitSevenKeyword_3_1_7() { return cDigitSevenKeyword_3_1_7; }

		//"8"
		public Keyword getDigitEightKeyword_3_1_8() { return cDigitEightKeyword_3_1_8; }

		//"9"
		public Keyword getDigitNineKeyword_3_1_9() { return cDigitNineKeyword_3_1_9; }
	}

	public class SIGNED_REAL_NUMBERElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "SIGNED_REAL_NUMBER");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Alternatives cAlternatives_0 = (Alternatives)cGroup.eContents().get(0);
		private final Keyword cPlusSignKeyword_0_0 = (Keyword)cAlternatives_0.eContents().get(0);
		private final Keyword cHyphenMinusKeyword_0_1 = (Keyword)cAlternatives_0.eContents().get(1);
		private final RuleCall cREAL_NUMBERParserRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		
		//SIGNED_REAL_NUMBER:
		//	("+" | "-") REAL_NUMBER;
		public ParserRule getRule() { return rule; }

		//("+" | "-") REAL_NUMBER
		public Group getGroup() { return cGroup; }

		//"+" | "-"
		public Alternatives getAlternatives_0() { return cAlternatives_0; }

		//"+"
		public Keyword getPlusSignKeyword_0_0() { return cPlusSignKeyword_0_0; }

		//"-"
		public Keyword getHyphenMinusKeyword_0_1() { return cHyphenMinusKeyword_0_1; }

		//REAL_NUMBER
		public RuleCall getREAL_NUMBERParserRuleCall_1() { return cREAL_NUMBERParserRuleCall_1; }
	}

	public class REAL_NUMBERElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "REAL_NUMBER");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cAlternatives.eContents().get(0);
		private final RuleCall cUNSIGNED_DIGIT_SEQUENCEParserRuleCall_0_0 = (RuleCall)cGroup_0.eContents().get(0);
		private final Keyword cFullStopKeyword_0_1 = (Keyword)cGroup_0.eContents().get(1);
		private final RuleCall cUNSIGNED_DIGIT_SEQUENCEParserRuleCall_0_2 = (RuleCall)cGroup_0.eContents().get(2);
		private final Group cGroup_0_3 = (Group)cGroup_0.eContents().get(3);
		private final Alternatives cAlternatives_0_3_0 = (Alternatives)cGroup_0_3.eContents().get(0);
		private final Keyword cEKeyword_0_3_0_0 = (Keyword)cAlternatives_0_3_0.eContents().get(0);
		private final Keyword cEKeyword_0_3_0_1 = (Keyword)cAlternatives_0_3_0.eContents().get(1);
		private final RuleCall cDIGIT_SEQUENCEParserRuleCall_0_3_1 = (RuleCall)cGroup_0_3.eContents().get(1);
		private final Group cGroup_1 = (Group)cAlternatives.eContents().get(1);
		private final RuleCall cUNSIGNED_DIGIT_SEQUENCEParserRuleCall_1_0 = (RuleCall)cGroup_1.eContents().get(0);
		private final Alternatives cAlternatives_1_1 = (Alternatives)cGroup_1.eContents().get(1);
		private final Keyword cEKeyword_1_1_0 = (Keyword)cAlternatives_1_1.eContents().get(0);
		private final Keyword cEKeyword_1_1_1 = (Keyword)cAlternatives_1_1.eContents().get(1);
		private final RuleCall cDIGIT_SEQUENCEParserRuleCall_1_2 = (RuleCall)cGroup_1.eContents().get(2);
		
		//REAL_NUMBER:
		//	UNSIGNED_DIGIT_SEQUENCE "." UNSIGNED_DIGIT_SEQUENCE? (("E" | "e") DIGIT_SEQUENCE)? | UNSIGNED_DIGIT_SEQUENCE ("E" |
		//	"e") DIGIT_SEQUENCE;
		public ParserRule getRule() { return rule; }

		//UNSIGNED_DIGIT_SEQUENCE "." UNSIGNED_DIGIT_SEQUENCE? (("E" | "e") DIGIT_SEQUENCE)? | UNSIGNED_DIGIT_SEQUENCE ("E" | "e")
		//DIGIT_SEQUENCE
		public Alternatives getAlternatives() { return cAlternatives; }

		//UNSIGNED_DIGIT_SEQUENCE "." UNSIGNED_DIGIT_SEQUENCE? (("E" | "e") DIGIT_SEQUENCE)?
		public Group getGroup_0() { return cGroup_0; }

		//UNSIGNED_DIGIT_SEQUENCE
		public RuleCall getUNSIGNED_DIGIT_SEQUENCEParserRuleCall_0_0() { return cUNSIGNED_DIGIT_SEQUENCEParserRuleCall_0_0; }

		//"."
		public Keyword getFullStopKeyword_0_1() { return cFullStopKeyword_0_1; }

		//UNSIGNED_DIGIT_SEQUENCE?
		public RuleCall getUNSIGNED_DIGIT_SEQUENCEParserRuleCall_0_2() { return cUNSIGNED_DIGIT_SEQUENCEParserRuleCall_0_2; }

		//(("E" | "e") DIGIT_SEQUENCE)?
		public Group getGroup_0_3() { return cGroup_0_3; }

		//"E" | "e"
		public Alternatives getAlternatives_0_3_0() { return cAlternatives_0_3_0; }

		//"E"
		public Keyword getEKeyword_0_3_0_0() { return cEKeyword_0_3_0_0; }

		//"e"
		public Keyword getEKeyword_0_3_0_1() { return cEKeyword_0_3_0_1; }

		//DIGIT_SEQUENCE
		public RuleCall getDIGIT_SEQUENCEParserRuleCall_0_3_1() { return cDIGIT_SEQUENCEParserRuleCall_0_3_1; }

		//UNSIGNED_DIGIT_SEQUENCE ("E" | "e") DIGIT_SEQUENCE
		public Group getGroup_1() { return cGroup_1; }

		//UNSIGNED_DIGIT_SEQUENCE
		public RuleCall getUNSIGNED_DIGIT_SEQUENCEParserRuleCall_1_0() { return cUNSIGNED_DIGIT_SEQUENCEParserRuleCall_1_0; }

		//"E" | "e"
		public Alternatives getAlternatives_1_1() { return cAlternatives_1_1; }

		//"E"
		public Keyword getEKeyword_1_1_0() { return cEKeyword_1_1_0; }

		//"e"
		public Keyword getEKeyword_1_1_1() { return cEKeyword_1_1_1; }

		//DIGIT_SEQUENCE
		public RuleCall getDIGIT_SEQUENCEParserRuleCall_1_2() { return cDIGIT_SEQUENCEParserRuleCall_1_2; }
	}

	public class UNSIGNED_DIGIT_SEQUENCEElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "UNSIGNED_DIGIT_SEQUENCE");
		private final RuleCall cDIGITTerminalRuleCall = (RuleCall)rule.eContents().get(1);
		
		//UNSIGNED_DIGIT_SEQUENCE:
		//	DIGIT+;
		public ParserRule getRule() { return rule; }

		//DIGIT+
		public RuleCall getDIGITTerminalRuleCall() { return cDIGITTerminalRuleCall; }
	}

	public class DIGIT_SEQUENCEElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "DIGIT_SEQUENCE");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Alternatives cAlternatives_0 = (Alternatives)cGroup.eContents().get(0);
		private final Keyword cPlusSignKeyword_0_0 = (Keyword)cAlternatives_0.eContents().get(0);
		private final Keyword cHyphenMinusKeyword_0_1 = (Keyword)cAlternatives_0.eContents().get(1);
		private final RuleCall cUNSIGNED_DIGIT_SEQUENCEParserRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		
		//DIGIT_SEQUENCE:
		//	("+" | "-")? UNSIGNED_DIGIT_SEQUENCE;
		public ParserRule getRule() { return rule; }

		//("+" | "-")? UNSIGNED_DIGIT_SEQUENCE
		public Group getGroup() { return cGroup; }

		//("+" | "-")?
		public Alternatives getAlternatives_0() { return cAlternatives_0; }

		//"+"
		public Keyword getPlusSignKeyword_0_0() { return cPlusSignKeyword_0_0; }

		//"-"
		public Keyword getHyphenMinusKeyword_0_1() { return cHyphenMinusKeyword_0_1; }

		//UNSIGNED_DIGIT_SEQUENCE
		public RuleCall getUNSIGNED_DIGIT_SEQUENCEParserRuleCall_1() { return cUNSIGNED_DIGIT_SEQUENCEParserRuleCall_1; }
	}
	
	
	private final ModelElements pModel;
	private final GreetingElements pGreeting;
	private final NumberElements pNumber;
	private final SIGNED_REAL_NUMBERElements pSIGNED_REAL_NUMBER;
	private final REAL_NUMBERElements pREAL_NUMBER;
	private final UNSIGNED_DIGIT_SEQUENCEElements pUNSIGNED_DIGIT_SEQUENCE;
	private final DIGIT_SEQUENCEElements pDIGIT_SEQUENCE;
	private final TerminalRule tDIGIT;
	
	private final Grammar grammar;

	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public MyDslGrammarAccess(GrammarProvider grammarProvider,
		TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pModel = new ModelElements();
		this.pGreeting = new GreetingElements();
		this.pNumber = new NumberElements();
		this.pSIGNED_REAL_NUMBER = new SIGNED_REAL_NUMBERElements();
		this.pREAL_NUMBER = new REAL_NUMBERElements();
		this.pUNSIGNED_DIGIT_SEQUENCE = new UNSIGNED_DIGIT_SEQUENCEElements();
		this.pDIGIT_SEQUENCE = new DIGIT_SEQUENCEElements();
		this.tDIGIT = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "DIGIT");
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.xtext.example.mydsl.MyDsl".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	
	public Grammar getGrammar() {
		return grammar;
	}
	

	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//Model:
	//	greetings+=Greeting*;
	public ModelElements getModelAccess() {
		return pModel;
	}
	
	public ParserRule getModelRule() {
		return getModelAccess().getRule();
	}

	//Greeting:
	//	"Hello" name=ID "!" | number;
	public GreetingElements getGreetingAccess() {
		return pGreeting;
	}
	
	public ParserRule getGreetingRule() {
		return getGreetingAccess().getRule();
	}

	//number:
	//	("0" | "1" | "2" | "3" | "4" | "5" | "6" | "7" | "8" | "9")+ "." ("0" | "1" | "2" | "3" | "4" | "5" | "6" | "7" | "8"
	//	| "9")+ (("E" | "e") ("0" | "1" | "2" | "3" | "4" | "5" | "6" | "7" | "8" | "9")+)?;
	public NumberElements getNumberAccess() {
		return pNumber;
	}
	
	public ParserRule getNumberRule() {
		return getNumberAccess().getRule();
	}

	//SIGNED_REAL_NUMBER:
	//	("+" | "-") REAL_NUMBER;
	public SIGNED_REAL_NUMBERElements getSIGNED_REAL_NUMBERAccess() {
		return pSIGNED_REAL_NUMBER;
	}
	
	public ParserRule getSIGNED_REAL_NUMBERRule() {
		return getSIGNED_REAL_NUMBERAccess().getRule();
	}

	//REAL_NUMBER:
	//	UNSIGNED_DIGIT_SEQUENCE "." UNSIGNED_DIGIT_SEQUENCE? (("E" | "e") DIGIT_SEQUENCE)? | UNSIGNED_DIGIT_SEQUENCE ("E" |
	//	"e") DIGIT_SEQUENCE;
	public REAL_NUMBERElements getREAL_NUMBERAccess() {
		return pREAL_NUMBER;
	}
	
	public ParserRule getREAL_NUMBERRule() {
		return getREAL_NUMBERAccess().getRule();
	}

	//UNSIGNED_DIGIT_SEQUENCE:
	//	DIGIT+;
	public UNSIGNED_DIGIT_SEQUENCEElements getUNSIGNED_DIGIT_SEQUENCEAccess() {
		return pUNSIGNED_DIGIT_SEQUENCE;
	}
	
	public ParserRule getUNSIGNED_DIGIT_SEQUENCERule() {
		return getUNSIGNED_DIGIT_SEQUENCEAccess().getRule();
	}

	//DIGIT_SEQUENCE:
	//	("+" | "-")? UNSIGNED_DIGIT_SEQUENCE;
	public DIGIT_SEQUENCEElements getDIGIT_SEQUENCEAccess() {
		return pDIGIT_SEQUENCE;
	}
	
	public ParserRule getDIGIT_SEQUENCERule() {
		return getDIGIT_SEQUENCEAccess().getRule();
	}

	//terminal DIGIT:
	//	"0".."9";
	public TerminalRule getDIGITRule() {
		return tDIGIT;
	} 

	//terminal ID:
	//	"^"? ("a".."z" | "A".."Z" | "_") ("a".."z" | "A".."Z" | "_" | "0".."9")*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	} 

	//terminal INT returns ecore::EInt:
	//	"0".."9"+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	} 

	//terminal STRING:
	//	"\"" ("\\" . / * 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' * / | !("\\" | "\""))* "\"" | "\'" ("\\" .
	//	/ * 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' * / | !("\\" | "\'"))* "\'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	} 

	//terminal ML_COMMENT:
	//	"/ *"->"* /";
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	} 

	//terminal SL_COMMENT:
	//	"//" !("\n" | "\r")* ("\r"? "\n")?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	} 

	//terminal WS:
	//	(" " | "\t" | "\r" | "\n")+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	} 

	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	} 
}
