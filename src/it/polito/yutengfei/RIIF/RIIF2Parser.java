// Generated from /usr/Intellij/ANtlr4WorkSpace/RIIF2_V1/RIIF2.g4 by ANTLR 4.5.3
package it.polito.yutengfei.RIIF;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class RIIF2Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, COMPONENT=42, END_COMPONENT=43, ENVIRONMENT=44, 
		END_ENVIRONMENT=45, REQUIREMENT=46, END_REQUIREMENT=47, CHILD_COMPONENT=48, 
		FAIL_MODE=49, EXTENDS=50, ASSIGN=51, ASSERT=52, INPUT=53, OUTPUT=54, PARAMETER=55, 
		CONSTANT=56, TYPE_FLOAT=57, TYPE_INTEGER=58, TYPE_STRING=59, TYPE_ENUM=60, 
		FUNC_AGG_SINGLE=61, FUNC_GT_N_FAIL=62, FUNC_LOG=63, FUNC_EXP=64, TEMPLATE=65, 
		END_TEMPLATE=66, IMPOSE=67, ABSTRACT=68, IMPLEMENTS=69, SELF=70, SET=71, 
		TYPE_TABLE=72, PLATFORM=73, StringLiteral=74, FloatingPointLiteral=75, 
		DecimalLiteral=76, Ident=77, HierIdent=78, AttrIdent=79, AssocDecl=80, 
		AssocInstanceIdent=81, AssocHierIdent=82, AssocAttrIdent=83, WS=84, COMMENT=85, 
		LINE_COMMENT=86;
	public static final int
		RULE_program = 0, RULE_declaration = 1, RULE_templateDecl = 2, RULE_templateBodyElement = 3, 
		RULE_abstractDecl = 4, RULE_abstractConstanceDecl = 5, RULE_abstractParameterDecl = 6, 
		RULE_abstractAttributeDecl = 7, RULE_abstractPlatformDecl = 8, RULE_imposeAssignment = 9, 
		RULE_componentDecl = 10, RULE_componentBodyElement = 11, RULE_setTemplate = 12, 
		RULE_environmentDecl = 13, RULE_environmentBodyElements = 14, RULE_requirementDecl = 15, 
		RULE_parameterDecl = 16, RULE_envParameterDecl = 17, RULE_constanceDecl = 18, 
		RULE_childComponentDecl = 19, RULE_failModeDecl = 20, RULE_assignment = 21, 
		RULE_assertion = 22, RULE_expression = 23, RULE_primary = 24, RULE_funcCall = 25, 
		RULE_funcName = 26, RULE_funcArg = 27, RULE_literal = 28, RULE_complexType = 29, 
		RULE_vector = 30, RULE_primitiveType = 31, RULE_enumType = 32;
	public static final String[] ruleNames = {
		"program", "declaration", "templateDecl", "templateBodyElement", "abstractDecl", 
		"abstractConstanceDecl", "abstractParameterDecl", "abstractAttributeDecl", 
		"abstractPlatformDecl", "imposeAssignment", "componentDecl", "componentBodyElement", 
		"setTemplate", "environmentDecl", "environmentBodyElements", "requirementDecl", 
		"parameterDecl", "envParameterDecl", "constanceDecl", "childComponentDecl", 
		"failModeDecl", "assignment", "assertion", "expression", "primary", "funcCall", 
		"funcName", "funcArg", "literal", "complexType", "vector", "primitiveType", 
		"enumType"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "':'", "':='", "'='", "','", "'<'", "'>'", "'+'", "'-'", 
		"'~'", "'!'", "'*'", "'/'", "'%'", "'<='", "'>='", "'=='", "'!='", "'&'", 
		"'^'", "'|'", "'&&'", "'||'", "'?'", "'+='", "'-='", "'*='", "'/='", "'&='", 
		"'|='", "'^='", "'>>='", "'>>>='", "'<<='", "'%='", "'('", "')'", "'['", 
		"']'", "'{'", "'}'", "'component'", "'endcomponent'", "'environment'", 
		"'endenvironment'", "'requirement'", "'endrequirement'", "'child_component'", 
		"'fail_mode'", "'extends'", "'assign'", "'assert'", "'input'", "'output'", 
		"'parameter'", "'constant'", "'float'", "'integer'", "'string'", "'enum'", 
		"'agg_single_fail'", "'agg_gt_n_fail'", "'LOG'", "'EXP'", "'template'", 
		"'endtemplate'", "'impose'", "'abstract'", "'implements'", "'self'", "'set'", 
		"'table'", "'platform'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, "COMPONENT", "END_COMPONENT", "ENVIRONMENT", 
		"END_ENVIRONMENT", "REQUIREMENT", "END_REQUIREMENT", "CHILD_COMPONENT", 
		"FAIL_MODE", "EXTENDS", "ASSIGN", "ASSERT", "INPUT", "OUTPUT", "PARAMETER", 
		"CONSTANT", "TYPE_FLOAT", "TYPE_INTEGER", "TYPE_STRING", "TYPE_ENUM", 
		"FUNC_AGG_SINGLE", "FUNC_GT_N_FAIL", "FUNC_LOG", "FUNC_EXP", "TEMPLATE", 
		"END_TEMPLATE", "IMPOSE", "ABSTRACT", "IMPLEMENTS", "SELF", "SET", "TYPE_TABLE", 
		"PLATFORM", "StringLiteral", "FloatingPointLiteral", "DecimalLiteral", 
		"Ident", "HierIdent", "AttrIdent", "AssocDecl", "AssocInstanceIdent", 
		"AssocHierIdent", "AssocAttrIdent", "WS", "COMMENT", "LINE_COMMENT"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "RIIF2.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public RIIF2Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(RIIF2Parser.EOF, 0); }
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(66);
				declaration();
				}
				}
				setState(69); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 42)) & ~0x3f) == 0 && ((1L << (_la - 42)) & ((1L << (COMPONENT - 42)) | (1L << (ENVIRONMENT - 42)) | (1L << (REQUIREMENT - 42)) | (1L << (TEMPLATE - 42)))) != 0) );
			setState(71);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationContext extends ParserRuleContext {
		public ComponentDeclContext componentDecl() {
			return getRuleContext(ComponentDeclContext.class,0);
		}
		public EnvironmentDeclContext environmentDecl() {
			return getRuleContext(EnvironmentDeclContext.class,0);
		}
		public RequirementDeclContext requirementDecl() {
			return getRuleContext(RequirementDeclContext.class,0);
		}
		public TemplateDeclContext templateDecl() {
			return getRuleContext(TemplateDeclContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).exitDeclaration(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declaration);
		try {
			setState(77);
			switch (_input.LA(1)) {
			case COMPONENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(73);
				componentDecl();
				}
				break;
			case ENVIRONMENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(74);
				environmentDecl();
				}
				break;
			case REQUIREMENT:
				enterOuterAlt(_localctx, 3);
				{
				setState(75);
				requirementDecl();
				}
				break;
			case TEMPLATE:
				enterOuterAlt(_localctx, 4);
				{
				setState(76);
				templateDecl();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TemplateDeclContext extends ParserRuleContext {
		public TerminalNode TEMPLATE() { return getToken(RIIF2Parser.TEMPLATE, 0); }
		public List<TerminalNode> Ident() { return getTokens(RIIF2Parser.Ident); }
		public TerminalNode Ident(int i) {
			return getToken(RIIF2Parser.Ident, i);
		}
		public TerminalNode END_TEMPLATE() { return getToken(RIIF2Parser.END_TEMPLATE, 0); }
		public TerminalNode EXTENDS() { return getToken(RIIF2Parser.EXTENDS, 0); }
		public List<TemplateBodyElementContext> templateBodyElement() {
			return getRuleContexts(TemplateBodyElementContext.class);
		}
		public TemplateBodyElementContext templateBodyElement(int i) {
			return getRuleContext(TemplateBodyElementContext.class,i);
		}
		public TemplateDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templateDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).enterTemplateDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).exitTemplateDecl(this);
		}
	}

	public final TemplateDeclContext templateDecl() throws RecognitionException {
		TemplateDeclContext _localctx = new TemplateDeclContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_templateDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			match(TEMPLATE);
			setState(80);
			match(Ident);
			setState(83);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(81);
				match(EXTENDS);
				setState(82);
				match(Ident);
				}
			}

			setState(85);
			match(T__0);
			setState(89);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 49)) & ~0x3f) == 0 && ((1L << (_la - 49)) & ((1L << (FAIL_MODE - 49)) | (1L << (IMPOSE - 49)) | (1L << (ABSTRACT - 49)))) != 0)) {
				{
				{
				setState(86);
				templateBodyElement();
				}
				}
				setState(91);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(92);
			match(END_TEMPLATE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TemplateBodyElementContext extends ParserRuleContext {
		public AbstractDeclContext abstractDecl() {
			return getRuleContext(AbstractDeclContext.class,0);
		}
		public ImposeAssignmentContext imposeAssignment() {
			return getRuleContext(ImposeAssignmentContext.class,0);
		}
		public TemplateBodyElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templateBodyElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).enterTemplateBodyElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).exitTemplateBodyElement(this);
		}
	}

	public final TemplateBodyElementContext templateBodyElement() throws RecognitionException {
		TemplateBodyElementContext _localctx = new TemplateBodyElementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_templateBodyElement);
		try {
			setState(96);
			switch (_input.LA(1)) {
			case FAIL_MODE:
			case ABSTRACT:
				enterOuterAlt(_localctx, 1);
				{
				setState(94);
				abstractDecl();
				}
				break;
			case IMPOSE:
				enterOuterAlt(_localctx, 2);
				{
				setState(95);
				imposeAssignment();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AbstractDeclContext extends ParserRuleContext {
		public AbstractConstanceDeclContext abstractConstanceDecl() {
			return getRuleContext(AbstractConstanceDeclContext.class,0);
		}
		public AbstractParameterDeclContext abstractParameterDecl() {
			return getRuleContext(AbstractParameterDeclContext.class,0);
		}
		public AbstractAttributeDeclContext abstractAttributeDecl() {
			return getRuleContext(AbstractAttributeDeclContext.class,0);
		}
		public AbstractPlatformDeclContext abstractPlatformDecl() {
			return getRuleContext(AbstractPlatformDeclContext.class,0);
		}
		public FailModeDeclContext failModeDecl() {
			return getRuleContext(FailModeDeclContext.class,0);
		}
		public AbstractDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abstractDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).enterAbstractDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).exitAbstractDecl(this);
		}
	}

	public final AbstractDeclContext abstractDecl() throws RecognitionException {
		AbstractDeclContext _localctx = new AbstractDeclContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_abstractDecl);
		try {
			setState(103);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(98);
				abstractConstanceDecl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(99);
				abstractParameterDecl();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(100);
				abstractAttributeDecl();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(101);
				abstractPlatformDecl();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(102);
				failModeDecl();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AbstractConstanceDeclContext extends ParserRuleContext {
		public TerminalNode ABSTRACT() { return getToken(RIIF2Parser.ABSTRACT, 0); }
		public TerminalNode CONSTANT() { return getToken(RIIF2Parser.CONSTANT, 0); }
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public TerminalNode Ident() { return getToken(RIIF2Parser.Ident, 0); }
		public TerminalNode AssocInstanceIdent() { return getToken(RIIF2Parser.AssocInstanceIdent, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AbstractConstanceDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abstractConstanceDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).enterAbstractConstanceDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).exitAbstractConstanceDecl(this);
		}
	}

	public final AbstractConstanceDeclContext abstractConstanceDecl() throws RecognitionException {
		AbstractConstanceDeclContext _localctx = new AbstractConstanceDeclContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_abstractConstanceDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			match(ABSTRACT);
			setState(106);
			match(CONSTANT);
			setState(107);
			_la = _input.LA(1);
			if ( !(_la==Ident || _la==AssocInstanceIdent) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(108);
			match(T__1);
			setState(109);
			primitiveType();
			setState(112);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(110);
				match(T__2);
				setState(111);
				expression(0);
				}
			}

			setState(114);
			match(T__0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AbstractParameterDeclContext extends ParserRuleContext {
		public TerminalNode ABSTRACT() { return getToken(RIIF2Parser.ABSTRACT, 0); }
		public TerminalNode PARAMETER() { return getToken(RIIF2Parser.PARAMETER, 0); }
		public ComplexTypeContext complexType() {
			return getRuleContext(ComplexTypeContext.class,0);
		}
		public TerminalNode Ident() { return getToken(RIIF2Parser.Ident, 0); }
		public TerminalNode AssocInstanceIdent() { return getToken(RIIF2Parser.AssocInstanceIdent, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AbstractParameterDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abstractParameterDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).enterAbstractParameterDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).exitAbstractParameterDecl(this);
		}
	}

	public final AbstractParameterDeclContext abstractParameterDecl() throws RecognitionException {
		AbstractParameterDeclContext _localctx = new AbstractParameterDeclContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_abstractParameterDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			match(ABSTRACT);
			setState(117);
			match(PARAMETER);
			setState(118);
			_la = _input.LA(1);
			if ( !(_la==Ident || _la==AssocInstanceIdent) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(119);
			match(T__1);
			setState(120);
			complexType();
			setState(123);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(121);
				match(T__2);
				setState(122);
				expression(0);
				}
			}

			setState(125);
			match(T__0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AbstractAttributeDeclContext extends ParserRuleContext {
		public TerminalNode ABSTRACT() { return getToken(RIIF2Parser.ABSTRACT, 0); }
		public TerminalNode AttrIdent() { return getToken(RIIF2Parser.AttrIdent, 0); }
		public TerminalNode AssocAttrIdent() { return getToken(RIIF2Parser.AssocAttrIdent, 0); }
		public AbstractAttributeDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abstractAttributeDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).enterAbstractAttributeDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).exitAbstractAttributeDecl(this);
		}
	}

	public final AbstractAttributeDeclContext abstractAttributeDecl() throws RecognitionException {
		AbstractAttributeDeclContext _localctx = new AbstractAttributeDeclContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_abstractAttributeDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			match(ABSTRACT);
			setState(128);
			_la = _input.LA(1);
			if ( !(_la==AttrIdent || _la==AssocAttrIdent) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(129);
			match(T__0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AbstractPlatformDeclContext extends ParserRuleContext {
		public TerminalNode ABSTRACT() { return getToken(RIIF2Parser.ABSTRACT, 0); }
		public TerminalNode PLATFORM() { return getToken(RIIF2Parser.PLATFORM, 0); }
		public TerminalNode Ident() { return getToken(RIIF2Parser.Ident, 0); }
		public AbstractPlatformDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abstractPlatformDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).enterAbstractPlatformDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).exitAbstractPlatformDecl(this);
		}
	}

	public final AbstractPlatformDeclContext abstractPlatformDecl() throws RecognitionException {
		AbstractPlatformDeclContext _localctx = new AbstractPlatformDeclContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_abstractPlatformDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			match(ABSTRACT);
			setState(132);
			match(PLATFORM);
			setState(133);
			match(Ident);
			setState(134);
			match(T__0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImposeAssignmentContext extends ParserRuleContext {
		public TerminalNode IMPOSE() { return getToken(RIIF2Parser.IMPOSE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Ident() { return getToken(RIIF2Parser.Ident, 0); }
		public TerminalNode AttrIdent() { return getToken(RIIF2Parser.AttrIdent, 0); }
		public TerminalNode HierIdent() { return getToken(RIIF2Parser.HierIdent, 0); }
		public TerminalNode AssocInstanceIdent() { return getToken(RIIF2Parser.AssocInstanceIdent, 0); }
		public TerminalNode AssocAttrIdent() { return getToken(RIIF2Parser.AssocAttrIdent, 0); }
		public TerminalNode AssocHierIdent() { return getToken(RIIF2Parser.AssocHierIdent, 0); }
		public VectorContext vector() {
			return getRuleContext(VectorContext.class,0);
		}
		public ImposeAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_imposeAssignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).enterImposeAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).exitImposeAssignment(this);
		}
	}

	public final ImposeAssignmentContext imposeAssignment() throws RecognitionException {
		ImposeAssignmentContext _localctx = new ImposeAssignmentContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_imposeAssignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			match(IMPOSE);
			setState(137);
			_la = _input.LA(1);
			if ( !(((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (Ident - 77)) | (1L << (HierIdent - 77)) | (1L << (AttrIdent - 77)) | (1L << (AssocInstanceIdent - 77)) | (1L << (AssocHierIdent - 77)) | (1L << (AssocAttrIdent - 77)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(139);
			_la = _input.LA(1);
			if (_la==T__37) {
				{
				setState(138);
				vector();
				}
			}

			setState(141);
			match(T__3);
			setState(142);
			expression(0);
			setState(143);
			match(T__0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComponentDeclContext extends ParserRuleContext {
		public TerminalNode COMPONENT() { return getToken(RIIF2Parser.COMPONENT, 0); }
		public List<TerminalNode> Ident() { return getTokens(RIIF2Parser.Ident); }
		public TerminalNode Ident(int i) {
			return getToken(RIIF2Parser.Ident, i);
		}
		public TerminalNode END_COMPONENT() { return getToken(RIIF2Parser.END_COMPONENT, 0); }
		public TerminalNode EXTENDS() { return getToken(RIIF2Parser.EXTENDS, 0); }
		public TerminalNode IMPLEMENTS() { return getToken(RIIF2Parser.IMPLEMENTS, 0); }
		public List<ComponentBodyElementContext> componentBodyElement() {
			return getRuleContexts(ComponentBodyElementContext.class);
		}
		public ComponentBodyElementContext componentBodyElement(int i) {
			return getRuleContext(ComponentBodyElementContext.class,i);
		}
		public ComponentDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_componentDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).enterComponentDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).exitComponentDecl(this);
		}
	}

	public final ComponentDeclContext componentDecl() throws RecognitionException {
		ComponentDeclContext _localctx = new ComponentDeclContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_componentDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			match(COMPONENT);
			setState(146);
			match(Ident);
			setState(156);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(147);
				match(EXTENDS);
				setState(148);
				match(Ident);
				setState(153);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(149);
					match(T__4);
					setState(150);
					match(Ident);
					}
					}
					setState(155);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(167);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(158);
				match(IMPLEMENTS);
				setState(159);
				match(Ident);
				setState(164);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(160);
					match(T__4);
					setState(161);
					match(Ident);
					}
					}
					setState(166);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(169);
			match(T__0);
			setState(173);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 48)) & ~0x3f) == 0 && ((1L << (_la - 48)) & ((1L << (CHILD_COMPONENT - 48)) | (1L << (FAIL_MODE - 48)) | (1L << (ASSIGN - 48)) | (1L << (ASSERT - 48)) | (1L << (PARAMETER - 48)) | (1L << (CONSTANT - 48)) | (1L << (SET - 48)))) != 0)) {
				{
				{
				setState(170);
				componentBodyElement();
				}
				}
				setState(175);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(176);
			match(END_COMPONENT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComponentBodyElementContext extends ParserRuleContext {
		public ParameterDeclContext parameterDecl() {
			return getRuleContext(ParameterDeclContext.class,0);
		}
		public ConstanceDeclContext constanceDecl() {
			return getRuleContext(ConstanceDeclContext.class,0);
		}
		public ChildComponentDeclContext childComponentDecl() {
			return getRuleContext(ChildComponentDeclContext.class,0);
		}
		public FailModeDeclContext failModeDecl() {
			return getRuleContext(FailModeDeclContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public SetTemplateContext setTemplate() {
			return getRuleContext(SetTemplateContext.class,0);
		}
		public AssertionContext assertion() {
			return getRuleContext(AssertionContext.class,0);
		}
		public ComponentBodyElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_componentBodyElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).enterComponentBodyElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).exitComponentBodyElement(this);
		}
	}

	public final ComponentBodyElementContext componentBodyElement() throws RecognitionException {
		ComponentBodyElementContext _localctx = new ComponentBodyElementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_componentBodyElement);
		try {
			setState(185);
			switch (_input.LA(1)) {
			case PARAMETER:
				enterOuterAlt(_localctx, 1);
				{
				setState(178);
				parameterDecl();
				}
				break;
			case CONSTANT:
				enterOuterAlt(_localctx, 2);
				{
				setState(179);
				constanceDecl();
				}
				break;
			case CHILD_COMPONENT:
				enterOuterAlt(_localctx, 3);
				{
				setState(180);
				childComponentDecl();
				}
				break;
			case FAIL_MODE:
				enterOuterAlt(_localctx, 4);
				{
				setState(181);
				failModeDecl();
				}
				break;
			case ASSIGN:
				enterOuterAlt(_localctx, 5);
				{
				setState(182);
				assignment();
				}
				break;
			case SET:
				enterOuterAlt(_localctx, 6);
				{
				setState(183);
				setTemplate();
				}
				break;
			case ASSERT:
				enterOuterAlt(_localctx, 7);
				{
				setState(184);
				assertion();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SetTemplateContext extends ParserRuleContext {
		public TerminalNode SET() { return getToken(RIIF2Parser.SET, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Ident() { return getToken(RIIF2Parser.Ident, 0); }
		public TerminalNode AttrIdent() { return getToken(RIIF2Parser.AttrIdent, 0); }
		public TerminalNode HierIdent() { return getToken(RIIF2Parser.HierIdent, 0); }
		public TerminalNode AssocInstanceIdent() { return getToken(RIIF2Parser.AssocInstanceIdent, 0); }
		public TerminalNode AssocAttrIdent() { return getToken(RIIF2Parser.AssocAttrIdent, 0); }
		public TerminalNode AssocHierIdent() { return getToken(RIIF2Parser.AssocHierIdent, 0); }
		public SetTemplateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setTemplate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).enterSetTemplate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).exitSetTemplate(this);
		}
	}

	public final SetTemplateContext setTemplate() throws RecognitionException {
		SetTemplateContext _localctx = new SetTemplateContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_setTemplate);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			match(SET);
			setState(188);
			_la = _input.LA(1);
			if ( !(((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (Ident - 77)) | (1L << (HierIdent - 77)) | (1L << (AttrIdent - 77)) | (1L << (AssocInstanceIdent - 77)) | (1L << (AssocHierIdent - 77)) | (1L << (AssocAttrIdent - 77)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(189);
			match(T__3);
			setState(190);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnvironmentDeclContext extends ParserRuleContext {
		public TerminalNode ENVIRONMENT() { return getToken(RIIF2Parser.ENVIRONMENT, 0); }
		public TerminalNode Ident() { return getToken(RIIF2Parser.Ident, 0); }
		public TerminalNode END_ENVIRONMENT() { return getToken(RIIF2Parser.END_ENVIRONMENT, 0); }
		public List<EnvironmentBodyElementsContext> environmentBodyElements() {
			return getRuleContexts(EnvironmentBodyElementsContext.class);
		}
		public EnvironmentBodyElementsContext environmentBodyElements(int i) {
			return getRuleContext(EnvironmentBodyElementsContext.class,i);
		}
		public EnvironmentDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_environmentDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).enterEnvironmentDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).exitEnvironmentDecl(this);
		}
	}

	public final EnvironmentDeclContext environmentDecl() throws RecognitionException {
		EnvironmentDeclContext _localctx = new EnvironmentDeclContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_environmentDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			match(ENVIRONMENT);
			setState(193);
			match(Ident);
			setState(194);
			match(T__0);
			setState(198);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ASSIGN) | (1L << INPUT) | (1L << OUTPUT))) != 0)) {
				{
				{
				setState(195);
				environmentBodyElements();
				}
				}
				setState(200);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(201);
			match(END_ENVIRONMENT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnvironmentBodyElementsContext extends ParserRuleContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public EnvParameterDeclContext envParameterDecl() {
			return getRuleContext(EnvParameterDeclContext.class,0);
		}
		public EnvironmentBodyElementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_environmentBodyElements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).enterEnvironmentBodyElements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).exitEnvironmentBodyElements(this);
		}
	}

	public final EnvironmentBodyElementsContext environmentBodyElements() throws RecognitionException {
		EnvironmentBodyElementsContext _localctx = new EnvironmentBodyElementsContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_environmentBodyElements);
		try {
			setState(205);
			switch (_input.LA(1)) {
			case ASSIGN:
				enterOuterAlt(_localctx, 1);
				{
				setState(203);
				assignment();
				}
				break;
			case INPUT:
			case OUTPUT:
				enterOuterAlt(_localctx, 2);
				{
				setState(204);
				envParameterDecl();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RequirementDeclContext extends ParserRuleContext {
		public TerminalNode REQUIREMENT() { return getToken(RIIF2Parser.REQUIREMENT, 0); }
		public TerminalNode Ident() { return getToken(RIIF2Parser.Ident, 0); }
		public TerminalNode END_REQUIREMENT() { return getToken(RIIF2Parser.END_REQUIREMENT, 0); }
		public List<AssertionContext> assertion() {
			return getRuleContexts(AssertionContext.class);
		}
		public AssertionContext assertion(int i) {
			return getRuleContext(AssertionContext.class,i);
		}
		public RequirementDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_requirementDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).enterRequirementDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).exitRequirementDecl(this);
		}
	}

	public final RequirementDeclContext requirementDecl() throws RecognitionException {
		RequirementDeclContext _localctx = new RequirementDeclContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_requirementDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			match(REQUIREMENT);
			setState(208);
			match(Ident);
			setState(209);
			match(T__0);
			setState(213);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ASSERT) {
				{
				{
				setState(210);
				assertion();
				}
				}
				setState(215);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(216);
			match(END_REQUIREMENT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParameterDeclContext extends ParserRuleContext {
		public TerminalNode PARAMETER() { return getToken(RIIF2Parser.PARAMETER, 0); }
		public ComplexTypeContext complexType() {
			return getRuleContext(ComplexTypeContext.class,0);
		}
		public TerminalNode Ident() { return getToken(RIIF2Parser.Ident, 0); }
		public TerminalNode AssocDecl() { return getToken(RIIF2Parser.AssocDecl, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ParameterDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).enterParameterDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).exitParameterDecl(this);
		}
	}

	public final ParameterDeclContext parameterDecl() throws RecognitionException {
		ParameterDeclContext _localctx = new ParameterDeclContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_parameterDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			match(PARAMETER);
			setState(219);
			_la = _input.LA(1);
			if ( !(_la==Ident || _la==AssocDecl) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(220);
			match(T__1);
			setState(221);
			complexType();
			setState(224);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(222);
				match(T__2);
				setState(223);
				expression(0);
				}
			}

			setState(226);
			match(T__0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnvParameterDeclContext extends ParserRuleContext {
		public TerminalNode PARAMETER() { return getToken(RIIF2Parser.PARAMETER, 0); }
		public ComplexTypeContext complexType() {
			return getRuleContext(ComplexTypeContext.class,0);
		}
		public TerminalNode INPUT() { return getToken(RIIF2Parser.INPUT, 0); }
		public TerminalNode OUTPUT() { return getToken(RIIF2Parser.OUTPUT, 0); }
		public TerminalNode Ident() { return getToken(RIIF2Parser.Ident, 0); }
		public TerminalNode AssocDecl() { return getToken(RIIF2Parser.AssocDecl, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public EnvParameterDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_envParameterDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).enterEnvParameterDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).exitEnvParameterDecl(this);
		}
	}

	public final EnvParameterDeclContext envParameterDecl() throws RecognitionException {
		EnvParameterDeclContext _localctx = new EnvParameterDeclContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_envParameterDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			_la = _input.LA(1);
			if ( !(_la==INPUT || _la==OUTPUT) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(229);
			match(PARAMETER);
			setState(230);
			_la = _input.LA(1);
			if ( !(_la==Ident || _la==AssocDecl) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(231);
			match(T__1);
			setState(232);
			complexType();
			setState(235);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(233);
				match(T__2);
				setState(234);
				expression(0);
				}
			}

			setState(237);
			match(T__0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstanceDeclContext extends ParserRuleContext {
		public TerminalNode CONSTANT() { return getToken(RIIF2Parser.CONSTANT, 0); }
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public TerminalNode Ident() { return getToken(RIIF2Parser.Ident, 0); }
		public TerminalNode AssocDecl() { return getToken(RIIF2Parser.AssocDecl, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ConstanceDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constanceDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).enterConstanceDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).exitConstanceDecl(this);
		}
	}

	public final ConstanceDeclContext constanceDecl() throws RecognitionException {
		ConstanceDeclContext _localctx = new ConstanceDeclContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_constanceDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			match(CONSTANT);
			setState(240);
			_la = _input.LA(1);
			if ( !(_la==Ident || _la==AssocDecl) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(241);
			match(T__1);
			setState(242);
			primitiveType();
			setState(245);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(243);
				match(T__2);
				setState(244);
				expression(0);
				}
			}

			setState(247);
			match(T__0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ChildComponentDeclContext extends ParserRuleContext {
		public TerminalNode CHILD_COMPONENT() { return getToken(RIIF2Parser.CHILD_COMPONENT, 0); }
		public List<TerminalNode> Ident() { return getTokens(RIIF2Parser.Ident); }
		public TerminalNode Ident(int i) {
			return getToken(RIIF2Parser.Ident, i);
		}
		public TerminalNode AssocDecl() { return getToken(RIIF2Parser.AssocDecl, 0); }
		public VectorContext vector() {
			return getRuleContext(VectorContext.class,0);
		}
		public ChildComponentDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_childComponentDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).enterChildComponentDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).exitChildComponentDecl(this);
		}
	}

	public final ChildComponentDeclContext childComponentDecl() throws RecognitionException {
		ChildComponentDeclContext _localctx = new ChildComponentDeclContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_childComponentDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			match(CHILD_COMPONENT);
			setState(250);
			match(Ident);
			setState(251);
			_la = _input.LA(1);
			if ( !(_la==Ident || _la==AssocDecl) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(253);
			_la = _input.LA(1);
			if (_la==T__37) {
				{
				setState(252);
				vector();
				}
			}

			setState(255);
			match(T__0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FailModeDeclContext extends ParserRuleContext {
		public TerminalNode FAIL_MODE() { return getToken(RIIF2Parser.FAIL_MODE, 0); }
		public TerminalNode Ident() { return getToken(RIIF2Parser.Ident, 0); }
		public TerminalNode AssocDecl() { return getToken(RIIF2Parser.AssocDecl, 0); }
		public FailModeDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_failModeDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).enterFailModeDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).exitFailModeDecl(this);
		}
	}

	public final FailModeDeclContext failModeDecl() throws RecognitionException {
		FailModeDeclContext _localctx = new FailModeDeclContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_failModeDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(257);
			match(FAIL_MODE);
			setState(258);
			_la = _input.LA(1);
			if ( !(_la==Ident || _la==AssocDecl) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(259);
			match(T__0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode ASSIGN() { return getToken(RIIF2Parser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Ident() { return getToken(RIIF2Parser.Ident, 0); }
		public TerminalNode HierIdent() { return getToken(RIIF2Parser.HierIdent, 0); }
		public TerminalNode AttrIdent() { return getToken(RIIF2Parser.AttrIdent, 0); }
		public TerminalNode AssocInstanceIdent() { return getToken(RIIF2Parser.AssocInstanceIdent, 0); }
		public TerminalNode AssocAttrIdent() { return getToken(RIIF2Parser.AssocAttrIdent, 0); }
		public TerminalNode AssocHierIdent() { return getToken(RIIF2Parser.AssocHierIdent, 0); }
		public VectorContext vector() {
			return getRuleContext(VectorContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).exitAssignment(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_assignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
			match(ASSIGN);
			setState(262);
			_la = _input.LA(1);
			if ( !(((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (Ident - 77)) | (1L << (HierIdent - 77)) | (1L << (AttrIdent - 77)) | (1L << (AssocInstanceIdent - 77)) | (1L << (AssocHierIdent - 77)) | (1L << (AssocAttrIdent - 77)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(264);
			_la = _input.LA(1);
			if (_la==T__37) {
				{
				setState(263);
				vector();
				}
			}

			setState(266);
			match(T__3);
			setState(267);
			expression(0);
			setState(268);
			match(T__0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssertionContext extends ParserRuleContext {
		public TerminalNode ASSERT() { return getToken(RIIF2Parser.ASSERT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode AttrIdent() { return getToken(RIIF2Parser.AttrIdent, 0); }
		public AssertionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assertion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).enterAssertion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).exitAssertion(this);
		}
	}

	public final AssertionContext assertion() throws RecognitionException {
		AssertionContext _localctx = new AssertionContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_assertion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(270);
			match(ASSERT);
			{
			setState(271);
			match(AttrIdent);
			}
			setState(272);
			_la = _input.LA(1);
			if ( !(_la==T__5 || _la==T__6) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(273);
			expression(0);
			setState(274);
			match(T__0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 46;
		enterRecursionRule(_localctx, 46, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
			switch (_input.LA(1)) {
			case T__35:
			case FUNC_AGG_SINGLE:
			case FUNC_GT_N_FAIL:
			case FUNC_LOG:
			case FUNC_EXP:
			case SELF:
			case StringLiteral:
			case FloatingPointLiteral:
			case DecimalLiteral:
			case Ident:
			case HierIdent:
			case AttrIdent:
			case AssocInstanceIdent:
			case AssocHierIdent:
			case AssocAttrIdent:
				{
				setState(277);
				primary();
				}
				break;
			case T__7:
			case T__8:
				{
				setState(278);
				_la = _input.LA(1);
				if ( !(_la==T__7 || _la==T__8) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(279);
				expression(14);
				}
				break;
			case T__9:
			case T__10:
				{
				setState(280);
				_la = _input.LA(1);
				if ( !(_la==T__9 || _la==T__10) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(281);
				expression(13);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(333);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(331);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(284);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(285);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__12) | (1L << T__13))) != 0)) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(286);
						expression(13);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(287);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(288);
						_la = _input.LA(1);
						if ( !(_la==T__7 || _la==T__8) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(289);
						expression(12);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(290);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(298);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
						case 1:
							{
							setState(291);
							match(T__5);
							setState(292);
							match(T__5);
							}
							break;
						case 2:
							{
							setState(293);
							match(T__6);
							setState(294);
							match(T__6);
							setState(295);
							match(T__6);
							}
							break;
						case 3:
							{
							setState(296);
							match(T__6);
							setState(297);
							match(T__6);
							}
							break;
						}
						setState(300);
						expression(11);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(301);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(302);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__14) | (1L << T__15))) != 0)) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(303);
						expression(10);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(304);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(305);
						_la = _input.LA(1);
						if ( !(_la==T__16 || _la==T__17) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(306);
						expression(9);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(307);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(308);
						match(T__18);
						setState(309);
						expression(8);
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(310);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(311);
						match(T__19);
						setState(312);
						expression(7);
						}
						break;
					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(313);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(314);
						match(T__20);
						setState(315);
						expression(6);
						}
						break;
					case 9:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(316);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(317);
						match(T__21);
						setState(318);
						expression(5);
						}
						break;
					case 10:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(319);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(320);
						match(T__22);
						setState(321);
						expression(4);
						}
						break;
					case 11:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(322);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(323);
						match(T__23);
						setState(324);
						expression(0);
						setState(325);
						match(T__1);
						setState(326);
						expression(3);
						}
						break;
					case 12:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(328);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(329);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34))) != 0)) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(330);
						expression(1);
						}
						break;
					}
					} 
				}
				setState(335);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class PrimaryContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SELF() { return getToken(RIIF2Parser.SELF, 0); }
		public TerminalNode Ident() { return getToken(RIIF2Parser.Ident, 0); }
		public TerminalNode HierIdent() { return getToken(RIIF2Parser.HierIdent, 0); }
		public TerminalNode AttrIdent() { return getToken(RIIF2Parser.AttrIdent, 0); }
		public TerminalNode AssocInstanceIdent() { return getToken(RIIF2Parser.AssocInstanceIdent, 0); }
		public TerminalNode AssocAttrIdent() { return getToken(RIIF2Parser.AssocAttrIdent, 0); }
		public TerminalNode AssocHierIdent() { return getToken(RIIF2Parser.AssocHierIdent, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public FuncCallContext funcCall() {
			return getRuleContext(FuncCallContext.class,0);
		}
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).enterPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).exitPrimary(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_primary);
		try {
			setState(349);
			switch (_input.LA(1)) {
			case T__35:
				enterOuterAlt(_localctx, 1);
				{
				setState(336);
				match(T__35);
				setState(337);
				expression(0);
				setState(338);
				match(T__36);
				}
				break;
			case SELF:
				enterOuterAlt(_localctx, 2);
				{
				setState(340);
				match(SELF);
				}
				break;
			case Ident:
				enterOuterAlt(_localctx, 3);
				{
				setState(341);
				match(Ident);
				}
				break;
			case HierIdent:
				enterOuterAlt(_localctx, 4);
				{
				setState(342);
				match(HierIdent);
				}
				break;
			case AttrIdent:
				enterOuterAlt(_localctx, 5);
				{
				setState(343);
				match(AttrIdent);
				}
				break;
			case AssocInstanceIdent:
				enterOuterAlt(_localctx, 6);
				{
				setState(344);
				match(AssocInstanceIdent);
				}
				break;
			case AssocAttrIdent:
				enterOuterAlt(_localctx, 7);
				{
				setState(345);
				match(AssocAttrIdent);
				}
				break;
			case AssocHierIdent:
				enterOuterAlt(_localctx, 8);
				{
				setState(346);
				match(AssocHierIdent);
				}
				break;
			case StringLiteral:
			case FloatingPointLiteral:
			case DecimalLiteral:
				enterOuterAlt(_localctx, 9);
				{
				setState(347);
				literal();
				}
				break;
			case FUNC_AGG_SINGLE:
			case FUNC_GT_N_FAIL:
			case FUNC_LOG:
			case FUNC_EXP:
				enterOuterAlt(_localctx, 10);
				{
				setState(348);
				funcCall();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FuncCallContext extends ParserRuleContext {
		public FuncNameContext funcName() {
			return getRuleContext(FuncNameContext.class,0);
		}
		public List<FuncArgContext> funcArg() {
			return getRuleContexts(FuncArgContext.class);
		}
		public FuncArgContext funcArg(int i) {
			return getRuleContext(FuncArgContext.class,i);
		}
		public FuncCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).enterFuncCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).exitFuncCall(this);
		}
	}

	public final FuncCallContext funcCall() throws RecognitionException {
		FuncCallContext _localctx = new FuncCallContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_funcCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(351);
			funcName();
			setState(352);
			match(T__35);
			setState(353);
			funcArg();
			setState(356);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(354);
				match(T__4);
				setState(355);
				funcArg();
				}
			}

			setState(358);
			match(T__36);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FuncNameContext extends ParserRuleContext {
		public TerminalNode FUNC_LOG() { return getToken(RIIF2Parser.FUNC_LOG, 0); }
		public TerminalNode FUNC_EXP() { return getToken(RIIF2Parser.FUNC_EXP, 0); }
		public TerminalNode FUNC_AGG_SINGLE() { return getToken(RIIF2Parser.FUNC_AGG_SINGLE, 0); }
		public TerminalNode FUNC_GT_N_FAIL() { return getToken(RIIF2Parser.FUNC_GT_N_FAIL, 0); }
		public FuncNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).enterFuncName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).exitFuncName(this);
		}
	}

	public final FuncNameContext funcName() throws RecognitionException {
		FuncNameContext _localctx = new FuncNameContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_funcName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(360);
			_la = _input.LA(1);
			if ( !(((((_la - 61)) & ~0x3f) == 0 && ((1L << (_la - 61)) & ((1L << (FUNC_AGG_SINGLE - 61)) | (1L << (FUNC_GT_N_FAIL - 61)) | (1L << (FUNC_LOG - 61)) | (1L << (FUNC_EXP - 61)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FuncArgContext extends ParserRuleContext {
		public VectorContext vector() {
			return getRuleContext(VectorContext.class,0);
		}
		public TerminalNode Ident() { return getToken(RIIF2Parser.Ident, 0); }
		public TerminalNode HierIdent() { return getToken(RIIF2Parser.HierIdent, 0); }
		public TerminalNode AttrIdent() { return getToken(RIIF2Parser.AttrIdent, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FuncArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcArg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).enterFuncArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).exitFuncArg(this);
		}
	}

	public final FuncArgContext funcArg() throws RecognitionException {
		FuncArgContext _localctx = new FuncArgContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_funcArg);
		int _la;
		try {
			setState(365);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(362);
				_la = _input.LA(1);
				if ( !(((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (Ident - 77)) | (1L << (HierIdent - 77)) | (1L << (AttrIdent - 77)))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(363);
				vector();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(364);
				expression(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode StringLiteral() { return getToken(RIIF2Parser.StringLiteral, 0); }
		public TerminalNode DecimalLiteral() { return getToken(RIIF2Parser.DecimalLiteral, 0); }
		public TerminalNode FloatingPointLiteral() { return getToken(RIIF2Parser.FloatingPointLiteral, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).exitLiteral(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(367);
			_la = _input.LA(1);
			if ( !(((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (StringLiteral - 74)) | (1L << (FloatingPointLiteral - 74)) | (1L << (DecimalLiteral - 74)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComplexTypeContext extends ParserRuleContext {
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public EnumTypeContext enumType() {
			return getRuleContext(EnumTypeContext.class,0);
		}
		public TerminalNode Ident() { return getToken(RIIF2Parser.Ident, 0); }
		public ComplexTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_complexType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).enterComplexType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).exitComplexType(this);
		}
	}

	public final ComplexTypeContext complexType() throws RecognitionException {
		ComplexTypeContext _localctx = new ComplexTypeContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_complexType);
		try {
			setState(372);
			switch (_input.LA(1)) {
			case TYPE_FLOAT:
			case TYPE_INTEGER:
			case TYPE_STRING:
			case TYPE_TABLE:
				enterOuterAlt(_localctx, 1);
				{
				setState(369);
				primitiveType();
				}
				break;
			case TYPE_ENUM:
				enterOuterAlt(_localctx, 2);
				{
				setState(370);
				enumType();
				}
				break;
			case Ident:
				enterOuterAlt(_localctx, 3);
				{
				setState(371);
				match(Ident);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VectorContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public VectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).enterVector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).exitVector(this);
		}
	}

	public final VectorContext vector() throws RecognitionException {
		VectorContext _localctx = new VectorContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_vector);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(374);
			match(T__37);
			setState(375);
			expression(0);
			setState(376);
			match(T__1);
			setState(377);
			expression(0);
			setState(378);
			match(T__38);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimitiveTypeContext extends ParserRuleContext {
		public TerminalNode TYPE_FLOAT() { return getToken(RIIF2Parser.TYPE_FLOAT, 0); }
		public TerminalNode TYPE_INTEGER() { return getToken(RIIF2Parser.TYPE_INTEGER, 0); }
		public TerminalNode TYPE_STRING() { return getToken(RIIF2Parser.TYPE_STRING, 0); }
		public TerminalNode TYPE_TABLE() { return getToken(RIIF2Parser.TYPE_TABLE, 0); }
		public PrimitiveTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).enterPrimitiveType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).exitPrimitiveType(this);
		}
	}

	public final PrimitiveTypeContext primitiveType() throws RecognitionException {
		PrimitiveTypeContext _localctx = new PrimitiveTypeContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_primitiveType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(380);
			_la = _input.LA(1);
			if ( !(((((_la - 57)) & ~0x3f) == 0 && ((1L << (_la - 57)) & ((1L << (TYPE_FLOAT - 57)) | (1L << (TYPE_INTEGER - 57)) | (1L << (TYPE_STRING - 57)) | (1L << (TYPE_TABLE - 57)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumTypeContext extends ParserRuleContext {
		public TerminalNode TYPE_ENUM() { return getToken(RIIF2Parser.TYPE_ENUM, 0); }
		public List<TerminalNode> Ident() { return getTokens(RIIF2Parser.Ident); }
		public TerminalNode Ident(int i) {
			return getToken(RIIF2Parser.Ident, i);
		}
		public EnumTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).enterEnumType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).exitEnumType(this);
		}
	}

	public final EnumTypeContext enumType() throws RecognitionException {
		EnumTypeContext _localctx = new EnumTypeContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_enumType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(382);
			match(TYPE_ENUM);
			setState(383);
			match(T__39);
			setState(384);
			match(Ident);
			setState(389);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(385);
				match(T__4);
				setState(386);
				match(Ident);
				}
				}
				setState(391);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(392);
			match(T__40);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 23:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 12);
		case 1:
			return precpred(_ctx, 11);
		case 2:
			return precpred(_ctx, 10);
		case 3:
			return precpred(_ctx, 9);
		case 4:
			return precpred(_ctx, 8);
		case 5:
			return precpred(_ctx, 7);
		case 6:
			return precpred(_ctx, 6);
		case 7:
			return precpred(_ctx, 5);
		case 8:
			return precpred(_ctx, 4);
		case 9:
			return precpred(_ctx, 3);
		case 10:
			return precpred(_ctx, 2);
		case 11:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3X\u018d\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\3\2\6\2F\n\2\r\2\16\2G\3\2\3\2\3\3\3\3\3\3\3\3\5\3P\n\3\3"+
		"\4\3\4\3\4\3\4\5\4V\n\4\3\4\3\4\7\4Z\n\4\f\4\16\4]\13\4\3\4\3\4\3\5\3"+
		"\5\5\5c\n\5\3\6\3\6\3\6\3\6\3\6\5\6j\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5"+
		"\7s\n\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b~\n\b\3\b\3\b\3\t\3\t\3"+
		"\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\5\13\u008e\n\13\3\13\3\13\3"+
		"\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u009a\n\f\f\f\16\f\u009d\13\f\5\f"+
		"\u009f\n\f\3\f\3\f\3\f\3\f\7\f\u00a5\n\f\f\f\16\f\u00a8\13\f\5\f\u00aa"+
		"\n\f\3\f\3\f\7\f\u00ae\n\f\f\f\16\f\u00b1\13\f\3\f\3\f\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\5\r\u00bc\n\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17"+
		"\7\17\u00c7\n\17\f\17\16\17\u00ca\13\17\3\17\3\17\3\20\3\20\5\20\u00d0"+
		"\n\20\3\21\3\21\3\21\3\21\7\21\u00d6\n\21\f\21\16\21\u00d9\13\21\3\21"+
		"\3\21\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00e3\n\22\3\22\3\22\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\5\23\u00ee\n\23\3\23\3\23\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\5\24\u00f8\n\24\3\24\3\24\3\25\3\25\3\25\3\25\5\25\u0100\n"+
		"\25\3\25\3\25\3\26\3\26\3\26\3\26\3\27\3\27\3\27\5\27\u010b\n\27\3\27"+
		"\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\5\31\u011d\n\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\5\31\u012d\n\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\7\31\u014e\n\31\f\31"+
		"\16\31\u0151\13\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3"+
		"\32\3\32\3\32\5\32\u0160\n\32\3\33\3\33\3\33\3\33\3\33\5\33\u0167\n\33"+
		"\3\33\3\33\3\34\3\34\3\35\3\35\3\35\5\35\u0170\n\35\3\36\3\36\3\37\3\37"+
		"\3\37\5\37\u0177\n\37\3 \3 \3 \3 \3 \3 \3!\3!\3\"\3\"\3\"\3\"\3\"\7\""+
		"\u0186\n\"\f\"\16\"\u0189\13\"\3\"\3\"\3\"\2\3\60#\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@B\2\22\4\2OOSS\4\2QQUU\4\2"+
		"OQSU\4\2OORR\3\2\678\3\2\b\t\3\2\n\13\3\2\f\r\3\2\16\20\4\2\b\t\21\22"+
		"\3\2\23\24\4\2\6\6\33%\3\2?B\3\2OQ\3\2LN\4\2;=JJ\u01aa\2E\3\2\2\2\4O\3"+
		"\2\2\2\6Q\3\2\2\2\bb\3\2\2\2\ni\3\2\2\2\fk\3\2\2\2\16v\3\2\2\2\20\u0081"+
		"\3\2\2\2\22\u0085\3\2\2\2\24\u008a\3\2\2\2\26\u0093\3\2\2\2\30\u00bb\3"+
		"\2\2\2\32\u00bd\3\2\2\2\34\u00c2\3\2\2\2\36\u00cf\3\2\2\2 \u00d1\3\2\2"+
		"\2\"\u00dc\3\2\2\2$\u00e6\3\2\2\2&\u00f1\3\2\2\2(\u00fb\3\2\2\2*\u0103"+
		"\3\2\2\2,\u0107\3\2\2\2.\u0110\3\2\2\2\60\u011c\3\2\2\2\62\u015f\3\2\2"+
		"\2\64\u0161\3\2\2\2\66\u016a\3\2\2\28\u016f\3\2\2\2:\u0171\3\2\2\2<\u0176"+
		"\3\2\2\2>\u0178\3\2\2\2@\u017e\3\2\2\2B\u0180\3\2\2\2DF\5\4\3\2ED\3\2"+
		"\2\2FG\3\2\2\2GE\3\2\2\2GH\3\2\2\2HI\3\2\2\2IJ\7\2\2\3J\3\3\2\2\2KP\5"+
		"\26\f\2LP\5\34\17\2MP\5 \21\2NP\5\6\4\2OK\3\2\2\2OL\3\2\2\2OM\3\2\2\2"+
		"ON\3\2\2\2P\5\3\2\2\2QR\7C\2\2RU\7O\2\2ST\7\64\2\2TV\7O\2\2US\3\2\2\2"+
		"UV\3\2\2\2VW\3\2\2\2W[\7\3\2\2XZ\5\b\5\2YX\3\2\2\2Z]\3\2\2\2[Y\3\2\2\2"+
		"[\\\3\2\2\2\\^\3\2\2\2][\3\2\2\2^_\7D\2\2_\7\3\2\2\2`c\5\n\6\2ac\5\24"+
		"\13\2b`\3\2\2\2ba\3\2\2\2c\t\3\2\2\2dj\5\f\7\2ej\5\16\b\2fj\5\20\t\2g"+
		"j\5\22\n\2hj\5*\26\2id\3\2\2\2ie\3\2\2\2if\3\2\2\2ig\3\2\2\2ih\3\2\2\2"+
		"j\13\3\2\2\2kl\7F\2\2lm\7:\2\2mn\t\2\2\2no\7\4\2\2or\5@!\2pq\7\5\2\2q"+
		"s\5\60\31\2rp\3\2\2\2rs\3\2\2\2st\3\2\2\2tu\7\3\2\2u\r\3\2\2\2vw\7F\2"+
		"\2wx\79\2\2xy\t\2\2\2yz\7\4\2\2z}\5<\37\2{|\7\5\2\2|~\5\60\31\2}{\3\2"+
		"\2\2}~\3\2\2\2~\177\3\2\2\2\177\u0080\7\3\2\2\u0080\17\3\2\2\2\u0081\u0082"+
		"\7F\2\2\u0082\u0083\t\3\2\2\u0083\u0084\7\3\2\2\u0084\21\3\2\2\2\u0085"+
		"\u0086\7F\2\2\u0086\u0087\7K\2\2\u0087\u0088\7O\2\2\u0088\u0089\7\3\2"+
		"\2\u0089\23\3\2\2\2\u008a\u008b\7E\2\2\u008b\u008d\t\4\2\2\u008c\u008e"+
		"\5> \2\u008d\u008c\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u008f\3\2\2\2\u008f"+
		"\u0090\7\6\2\2\u0090\u0091\5\60\31\2\u0091\u0092\7\3\2\2\u0092\25\3\2"+
		"\2\2\u0093\u0094\7,\2\2\u0094\u009e\7O\2\2\u0095\u0096\7\64\2\2\u0096"+
		"\u009b\7O\2\2\u0097\u0098\7\7\2\2\u0098\u009a\7O\2\2\u0099\u0097\3\2\2"+
		"\2\u009a\u009d\3\2\2\2\u009b\u0099\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u009f"+
		"\3\2\2\2\u009d\u009b\3\2\2\2\u009e\u0095\3\2\2\2\u009e\u009f\3\2\2\2\u009f"+
		"\u00a9\3\2\2\2\u00a0\u00a1\7G\2\2\u00a1\u00a6\7O\2\2\u00a2\u00a3\7\7\2"+
		"\2\u00a3\u00a5\7O\2\2\u00a4\u00a2\3\2\2\2\u00a5\u00a8\3\2\2\2\u00a6\u00a4"+
		"\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00aa\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a9"+
		"\u00a0\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00af\7\3"+
		"\2\2\u00ac\u00ae\5\30\r\2\u00ad\u00ac\3\2\2\2\u00ae\u00b1\3\2\2\2\u00af"+
		"\u00ad\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b2\3\2\2\2\u00b1\u00af\3\2"+
		"\2\2\u00b2\u00b3\7-\2\2\u00b3\27\3\2\2\2\u00b4\u00bc\5\"\22\2\u00b5\u00bc"+
		"\5&\24\2\u00b6\u00bc\5(\25\2\u00b7\u00bc\5*\26\2\u00b8\u00bc\5,\27\2\u00b9"+
		"\u00bc\5\32\16\2\u00ba\u00bc\5.\30\2\u00bb\u00b4\3\2\2\2\u00bb\u00b5\3"+
		"\2\2\2\u00bb\u00b6\3\2\2\2\u00bb\u00b7\3\2\2\2\u00bb\u00b8\3\2\2\2\u00bb"+
		"\u00b9\3\2\2\2\u00bb\u00ba\3\2\2\2\u00bc\31\3\2\2\2\u00bd\u00be\7I\2\2"+
		"\u00be\u00bf\t\4\2\2\u00bf\u00c0\7\6\2\2\u00c0\u00c1\5\60\31\2\u00c1\33"+
		"\3\2\2\2\u00c2\u00c3\7.\2\2\u00c3\u00c4\7O\2\2\u00c4\u00c8\7\3\2\2\u00c5"+
		"\u00c7\5\36\20\2\u00c6\u00c5\3\2\2\2\u00c7\u00ca\3\2\2\2\u00c8\u00c6\3"+
		"\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00cb\3\2\2\2\u00ca\u00c8\3\2\2\2\u00cb"+
		"\u00cc\7/\2\2\u00cc\35\3\2\2\2\u00cd\u00d0\5,\27\2\u00ce\u00d0\5$\23\2"+
		"\u00cf\u00cd\3\2\2\2\u00cf\u00ce\3\2\2\2\u00d0\37\3\2\2\2\u00d1\u00d2"+
		"\7\60\2\2\u00d2\u00d3\7O\2\2\u00d3\u00d7\7\3\2\2\u00d4\u00d6\5.\30\2\u00d5"+
		"\u00d4\3\2\2\2\u00d6\u00d9\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d7\u00d8\3\2"+
		"\2\2\u00d8\u00da\3\2\2\2\u00d9\u00d7\3\2\2\2\u00da\u00db\7\61\2\2\u00db"+
		"!\3\2\2\2\u00dc\u00dd\79\2\2\u00dd\u00de\t\5\2\2\u00de\u00df\7\4\2\2\u00df"+
		"\u00e2\5<\37\2\u00e0\u00e1\7\5\2\2\u00e1\u00e3\5\60\31\2\u00e2\u00e0\3"+
		"\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e5\7\3\2\2\u00e5"+
		"#\3\2\2\2\u00e6\u00e7\t\6\2\2\u00e7\u00e8\79\2\2\u00e8\u00e9\t\5\2\2\u00e9"+
		"\u00ea\7\4\2\2\u00ea\u00ed\5<\37\2\u00eb\u00ec\7\5\2\2\u00ec\u00ee\5\60"+
		"\31\2\u00ed\u00eb\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef"+
		"\u00f0\7\3\2\2\u00f0%\3\2\2\2\u00f1\u00f2\7:\2\2\u00f2\u00f3\t\5\2\2\u00f3"+
		"\u00f4\7\4\2\2\u00f4\u00f7\5@!\2\u00f5\u00f6\7\5\2\2\u00f6\u00f8\5\60"+
		"\31\2\u00f7\u00f5\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9"+
		"\u00fa\7\3\2\2\u00fa\'\3\2\2\2\u00fb\u00fc\7\62\2\2\u00fc\u00fd\7O\2\2"+
		"\u00fd\u00ff\t\5\2\2\u00fe\u0100\5> \2\u00ff\u00fe\3\2\2\2\u00ff\u0100"+
		"\3\2\2\2\u0100\u0101\3\2\2\2\u0101\u0102\7\3\2\2\u0102)\3\2\2\2\u0103"+
		"\u0104\7\63\2\2\u0104\u0105\t\5\2\2\u0105\u0106\7\3\2\2\u0106+\3\2\2\2"+
		"\u0107\u0108\7\65\2\2\u0108\u010a\t\4\2\2\u0109\u010b\5> \2\u010a\u0109"+
		"\3\2\2\2\u010a\u010b\3\2\2\2\u010b\u010c\3\2\2\2\u010c\u010d\7\6\2\2\u010d"+
		"\u010e\5\60\31\2\u010e\u010f\7\3\2\2\u010f-\3\2\2\2\u0110\u0111\7\66\2"+
		"\2\u0111\u0112\7Q\2\2\u0112\u0113\t\7\2\2\u0113\u0114\5\60\31\2\u0114"+
		"\u0115\7\3\2\2\u0115/\3\2\2\2\u0116\u0117\b\31\1\2\u0117\u011d\5\62\32"+
		"\2\u0118\u0119\t\b\2\2\u0119\u011d\5\60\31\20\u011a\u011b\t\t\2\2\u011b"+
		"\u011d\5\60\31\17\u011c\u0116\3\2\2\2\u011c\u0118\3\2\2\2\u011c\u011a"+
		"\3\2\2\2\u011d\u014f\3\2\2\2\u011e\u011f\f\16\2\2\u011f\u0120\t\n\2\2"+
		"\u0120\u014e\5\60\31\17\u0121\u0122\f\r\2\2\u0122\u0123\t\b\2\2\u0123"+
		"\u014e\5\60\31\16\u0124\u012c\f\f\2\2\u0125\u0126\7\b\2\2\u0126\u012d"+
		"\7\b\2\2\u0127\u0128\7\t\2\2\u0128\u0129\7\t\2\2\u0129\u012d\7\t\2\2\u012a"+
		"\u012b\7\t\2\2\u012b\u012d\7\t\2\2\u012c\u0125\3\2\2\2\u012c\u0127\3\2"+
		"\2\2\u012c\u012a\3\2\2\2\u012d\u012e\3\2\2\2\u012e\u014e\5\60\31\r\u012f"+
		"\u0130\f\13\2\2\u0130\u0131\t\13\2\2\u0131\u014e\5\60\31\f\u0132\u0133"+
		"\f\n\2\2\u0133\u0134\t\f\2\2\u0134\u014e\5\60\31\13\u0135\u0136\f\t\2"+
		"\2\u0136\u0137\7\25\2\2\u0137\u014e\5\60\31\n\u0138\u0139\f\b\2\2\u0139"+
		"\u013a\7\26\2\2\u013a\u014e\5\60\31\t\u013b\u013c\f\7\2\2\u013c\u013d"+
		"\7\27\2\2\u013d\u014e\5\60\31\b\u013e\u013f\f\6\2\2\u013f\u0140\7\30\2"+
		"\2\u0140\u014e\5\60\31\7\u0141\u0142\f\5\2\2\u0142\u0143\7\31\2\2\u0143"+
		"\u014e\5\60\31\6\u0144\u0145\f\4\2\2\u0145\u0146\7\32\2\2\u0146\u0147"+
		"\5\60\31\2\u0147\u0148\7\4\2\2\u0148\u0149\5\60\31\5\u0149\u014e\3\2\2"+
		"\2\u014a\u014b\f\3\2\2\u014b\u014c\t\r\2\2\u014c\u014e\5\60\31\3\u014d"+
		"\u011e\3\2\2\2\u014d\u0121\3\2\2\2\u014d\u0124\3\2\2\2\u014d\u012f\3\2"+
		"\2\2\u014d\u0132\3\2\2\2\u014d\u0135\3\2\2\2\u014d\u0138\3\2\2\2\u014d"+
		"\u013b\3\2\2\2\u014d\u013e\3\2\2\2\u014d\u0141\3\2\2\2\u014d\u0144\3\2"+
		"\2\2\u014d\u014a\3\2\2\2\u014e\u0151\3\2\2\2\u014f\u014d\3\2\2\2\u014f"+
		"\u0150\3\2\2\2\u0150\61\3\2\2\2\u0151\u014f\3\2\2\2\u0152\u0153\7&\2\2"+
		"\u0153\u0154\5\60\31\2\u0154\u0155\7\'\2\2\u0155\u0160\3\2\2\2\u0156\u0160"+
		"\7H\2\2\u0157\u0160\7O\2\2\u0158\u0160\7P\2\2\u0159\u0160\7Q\2\2\u015a"+
		"\u0160\7S\2\2\u015b\u0160\7U\2\2\u015c\u0160\7T\2\2\u015d\u0160\5:\36"+
		"\2\u015e\u0160\5\64\33\2\u015f\u0152\3\2\2\2\u015f\u0156\3\2\2\2\u015f"+
		"\u0157\3\2\2\2\u015f\u0158\3\2\2\2\u015f\u0159\3\2\2\2\u015f\u015a\3\2"+
		"\2\2\u015f\u015b\3\2\2\2\u015f\u015c\3\2\2\2\u015f\u015d\3\2\2\2\u015f"+
		"\u015e\3\2\2\2\u0160\63\3\2\2\2\u0161\u0162\5\66\34\2\u0162\u0163\7&\2"+
		"\2\u0163\u0166\58\35\2\u0164\u0165\7\7\2\2\u0165\u0167\58\35\2\u0166\u0164"+
		"\3\2\2\2\u0166\u0167\3\2\2\2\u0167\u0168\3\2\2\2\u0168\u0169\7\'\2\2\u0169"+
		"\65\3\2\2\2\u016a\u016b\t\16\2\2\u016b\67\3\2\2\2\u016c\u016d\t\17\2\2"+
		"\u016d\u0170\5> \2\u016e\u0170\5\60\31\2\u016f\u016c\3\2\2\2\u016f\u016e"+
		"\3\2\2\2\u01709\3\2\2\2\u0171\u0172\t\20\2\2\u0172;\3\2\2\2\u0173\u0177"+
		"\5@!\2\u0174\u0177\5B\"\2\u0175\u0177\7O\2\2\u0176\u0173\3\2\2\2\u0176"+
		"\u0174\3\2\2\2\u0176\u0175\3\2\2\2\u0177=\3\2\2\2\u0178\u0179\7(\2\2\u0179"+
		"\u017a\5\60\31\2\u017a\u017b\7\4\2\2\u017b\u017c\5\60\31\2\u017c\u017d"+
		"\7)\2\2\u017d?\3\2\2\2\u017e\u017f\t\21\2\2\u017fA\3\2\2\2\u0180\u0181"+
		"\7>\2\2\u0181\u0182\7*\2\2\u0182\u0187\7O\2\2\u0183\u0184\7\7\2\2\u0184"+
		"\u0186\7O\2\2\u0185\u0183\3\2\2\2\u0186\u0189\3\2\2\2\u0187\u0185\3\2"+
		"\2\2\u0187\u0188\3\2\2\2\u0188\u018a\3\2\2\2\u0189\u0187\3\2\2\2\u018a"+
		"\u018b\7+\2\2\u018bC\3\2\2\2\"GOU[bir}\u008d\u009b\u009e\u00a6\u00a9\u00af"+
		"\u00bb\u00c8\u00cf\u00d7\u00e2\u00ed\u00f7\u00ff\u010a\u011c\u012c\u014d"+
		"\u014f\u015f\u0166\u016f\u0176\u0187";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}