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
		RULE_abstractDecl = 4, RULE_abstractFailModeDecl = 5, RULE_abstractConstanceDecl = 6, 
		RULE_abstractParameterDecl = 7, RULE_abstractAttributeDecl = 8, RULE_abstractPlatformDecl = 9, 
		RULE_imposeAssignment = 10, RULE_componentDecl = 11, RULE_componentBodyElement = 12, 
		RULE_setTemplate = 13, RULE_environmentDecl = 14, RULE_environmentBodyElements = 15, 
		RULE_requirementDecl = 16, RULE_parameterDecl = 17, RULE_envParameterDecl = 18, 
		RULE_constanceDecl = 19, RULE_childComponentDecl = 20, RULE_failModeDecl = 21, 
		RULE_assignment = 22, RULE_assertion = 23, RULE_expression = 24, RULE_primary = 25, 
		RULE_listConstructor = 26, RULE_arrayConstructor = 27, RULE_constructorType = 28, 
		RULE_funcCall = 29, RULE_funcName = 30, RULE_funcArg = 31, RULE_literal = 32, 
		RULE_complexType = 33, RULE_vector = 34, RULE_primitiveType = 35, RULE_enumType = 36;
	public static final String[] ruleNames = {
		"program", "declaration", "templateDecl", "templateBodyElement", "abstractDecl", 
		"abstractFailModeDecl", "abstractConstanceDecl", "abstractParameterDecl", 
		"abstractAttributeDecl", "abstractPlatformDecl", "imposeAssignment", "componentDecl", 
		"componentBodyElement", "setTemplate", "environmentDecl", "environmentBodyElements", 
		"requirementDecl", "parameterDecl", "envParameterDecl", "constanceDecl", 
		"childComponentDecl", "failModeDecl", "assignment", "assertion", "expression", 
		"primary", "listConstructor", "arrayConstructor", "constructorType", "funcCall", 
		"funcName", "funcArg", "literal", "complexType", "vector", "primitiveType", 
		"enumType"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "':'", "':='", "'='", "','", "'<'", "'>'", "'+'", "'-'", 
		"'~'", "'!'", "'*'", "'/'", "'%'", "'<='", "'>='", "'=='", "'!='", "'&'", 
		"'^'", "'|'", "'&&'", "'||'", "'?'", "'+='", "'-='", "'*='", "'/='", "'&='", 
		"'|='", "'^='", "'>>='", "'>>>='", "'<<='", "'%='", "'('", "')'", "'{'", 
		"'}'", "'['", "']'", "'component'", "'endcomponent'", "'environment'", 
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
			setState(75); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(74);
				declaration();
				}
				}
				setState(77); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 42)) & ~0x3f) == 0 && ((1L << (_la - 42)) & ((1L << (COMPONENT - 42)) | (1L << (ENVIRONMENT - 42)) | (1L << (REQUIREMENT - 42)) | (1L << (TEMPLATE - 42)))) != 0) );
			setState(79);
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
			setState(85);
			switch (_input.LA(1)) {
			case COMPONENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(81);
				componentDecl();
				}
				break;
			case ENVIRONMENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(82);
				environmentDecl();
				}
				break;
			case REQUIREMENT:
				enterOuterAlt(_localctx, 3);
				{
				setState(83);
				requirementDecl();
				}
				break;
			case TEMPLATE:
				enterOuterAlt(_localctx, 4);
				{
				setState(84);
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
			setState(87);
			match(TEMPLATE);
			setState(88);
			match(Ident);
			setState(91);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(89);
				match(EXTENDS);
				setState(90);
				match(Ident);
				}
			}

			setState(93);
			match(T__0);
			setState(97);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 49)) & ~0x3f) == 0 && ((1L << (_la - 49)) & ((1L << (FAIL_MODE - 49)) | (1L << (IMPOSE - 49)) | (1L << (ABSTRACT - 49)))) != 0)) {
				{
				{
				setState(94);
				templateBodyElement();
				}
				}
				setState(99);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(100);
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
			setState(104);
			switch (_input.LA(1)) {
			case FAIL_MODE:
			case ABSTRACT:
				enterOuterAlt(_localctx, 1);
				{
				setState(102);
				abstractDecl();
				}
				break;
			case IMPOSE:
				enterOuterAlt(_localctx, 2);
				{
				setState(103);
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
		public AbstractFailModeDeclContext abstractFailModeDecl() {
			return getRuleContext(AbstractFailModeDeclContext.class,0);
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
			setState(112);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(106);
				abstractConstanceDecl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(107);
				abstractParameterDecl();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(108);
				abstractAttributeDecl();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(109);
				abstractPlatformDecl();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(110);
				abstractFailModeDecl();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(111);
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

	public static class AbstractFailModeDeclContext extends ParserRuleContext {
		public TerminalNode ABSTRACT() { return getToken(RIIF2Parser.ABSTRACT, 0); }
		public TerminalNode FAIL_MODE() { return getToken(RIIF2Parser.FAIL_MODE, 0); }
		public TerminalNode Ident() { return getToken(RIIF2Parser.Ident, 0); }
		public AbstractFailModeDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abstractFailModeDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).enterAbstractFailModeDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).exitAbstractFailModeDecl(this);
		}
	}

	public final AbstractFailModeDeclContext abstractFailModeDecl() throws RecognitionException {
		AbstractFailModeDeclContext _localctx = new AbstractFailModeDeclContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_abstractFailModeDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			match(ABSTRACT);
			setState(115);
			match(FAIL_MODE);
			setState(116);
			match(Ident);
			setState(117);
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

	public static class AbstractConstanceDeclContext extends ParserRuleContext {
		public TerminalNode ABSTRACT() { return getToken(RIIF2Parser.ABSTRACT, 0); }
		public TerminalNode CONSTANT() { return getToken(RIIF2Parser.CONSTANT, 0); }
		public TerminalNode Ident() { return getToken(RIIF2Parser.Ident, 0); }
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ListConstructorContext listConstructor() {
			return getRuleContext(ListConstructorContext.class,0);
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
		enterRule(_localctx, 12, RULE_abstractConstanceDecl);
		int _la;
		try {
			setState(135);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(119);
				match(ABSTRACT);
				setState(120);
				match(CONSTANT);
				setState(121);
				match(Ident);
				setState(122);
				match(T__1);
				setState(123);
				primitiveType();
				setState(126);
				_la = _input.LA(1);
				if (_la==T__2) {
					{
					setState(124);
					match(T__2);
					setState(125);
					expression(0);
					}
				}

				setState(128);
				match(T__0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(130);
				match(ABSTRACT);
				setState(131);
				match(CONSTANT);
				setState(132);
				match(Ident);
				setState(133);
				match(T__2);
				setState(134);
				listConstructor();
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

	public static class AbstractParameterDeclContext extends ParserRuleContext {
		public TerminalNode ABSTRACT() { return getToken(RIIF2Parser.ABSTRACT, 0); }
		public TerminalNode PARAMETER() { return getToken(RIIF2Parser.PARAMETER, 0); }
		public TerminalNode Ident() { return getToken(RIIF2Parser.Ident, 0); }
		public ComplexTypeContext complexType() {
			return getRuleContext(ComplexTypeContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ListConstructorContext listConstructor() {
			return getRuleContext(ListConstructorContext.class,0);
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
		enterRule(_localctx, 14, RULE_abstractParameterDecl);
		int _la;
		try {
			setState(153);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(137);
				match(ABSTRACT);
				setState(138);
				match(PARAMETER);
				setState(139);
				match(Ident);
				setState(140);
				match(T__1);
				setState(141);
				complexType();
				setState(144);
				_la = _input.LA(1);
				if (_la==T__2) {
					{
					setState(142);
					match(T__2);
					setState(143);
					expression(0);
					}
				}

				setState(146);
				match(T__0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(148);
				match(ABSTRACT);
				setState(149);
				match(PARAMETER);
				setState(150);
				match(Ident);
				setState(151);
				match(T__2);
				setState(152);
				listConstructor();
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
		enterRule(_localctx, 16, RULE_abstractAttributeDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			match(ABSTRACT);
			setState(156);
			_la = _input.LA(1);
			if ( !(_la==AttrIdent || _la==AssocAttrIdent) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(157);
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
		enterRule(_localctx, 18, RULE_abstractPlatformDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			match(ABSTRACT);
			setState(160);
			match(PLATFORM);
			setState(161);
			match(Ident);
			setState(162);
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
		public TerminalNode Ident() { return getToken(RIIF2Parser.Ident, 0); }
		public TerminalNode AttrIdent() { return getToken(RIIF2Parser.AttrIdent, 0); }
		public TerminalNode HierIdent() { return getToken(RIIF2Parser.HierIdent, 0); }
		public TerminalNode AssocInstanceIdent() { return getToken(RIIF2Parser.AssocInstanceIdent, 0); }
		public TerminalNode AssocAttrIdent() { return getToken(RIIF2Parser.AssocAttrIdent, 0); }
		public TerminalNode AssocHierIdent() { return getToken(RIIF2Parser.AssocHierIdent, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ListConstructorContext listConstructor() {
			return getRuleContext(ListConstructorContext.class,0);
		}
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
		enterRule(_localctx, 20, RULE_imposeAssignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			match(IMPOSE);
			setState(165);
			_la = _input.LA(1);
			if ( !(((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (Ident - 77)) | (1L << (HierIdent - 77)) | (1L << (AttrIdent - 77)) | (1L << (AssocInstanceIdent - 77)) | (1L << (AssocHierIdent - 77)) | (1L << (AssocAttrIdent - 77)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(167);
			_la = _input.LA(1);
			if (_la==T__39) {
				{
				setState(166);
				vector();
				}
			}

			setState(169);
			match(T__3);
			setState(172);
			switch (_input.LA(1)) {
			case T__7:
			case T__8:
			case T__9:
			case T__10:
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
				setState(170);
				expression(0);
				}
				break;
			case T__37:
				{
				setState(171);
				listConstructor();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(174);
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
		enterRule(_localctx, 22, RULE_componentDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			match(COMPONENT);
			setState(177);
			match(Ident);
			setState(187);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(178);
				match(EXTENDS);
				setState(179);
				match(Ident);
				setState(184);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(180);
					match(T__4);
					setState(181);
					match(Ident);
					}
					}
					setState(186);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(198);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(189);
				match(IMPLEMENTS);
				setState(190);
				match(Ident);
				setState(195);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(191);
					match(T__4);
					setState(192);
					match(Ident);
					}
					}
					setState(197);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(200);
			match(T__0);
			setState(204);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 48)) & ~0x3f) == 0 && ((1L << (_la - 48)) & ((1L << (CHILD_COMPONENT - 48)) | (1L << (FAIL_MODE - 48)) | (1L << (ASSIGN - 48)) | (1L << (ASSERT - 48)) | (1L << (PARAMETER - 48)) | (1L << (CONSTANT - 48)) | (1L << (SET - 48)))) != 0)) {
				{
				{
				setState(201);
				componentBodyElement();
				}
				}
				setState(206);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(207);
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
		enterRule(_localctx, 24, RULE_componentBodyElement);
		try {
			setState(216);
			switch (_input.LA(1)) {
			case PARAMETER:
				enterOuterAlt(_localctx, 1);
				{
				setState(209);
				parameterDecl();
				}
				break;
			case CONSTANT:
				enterOuterAlt(_localctx, 2);
				{
				setState(210);
				constanceDecl();
				}
				break;
			case CHILD_COMPONENT:
				enterOuterAlt(_localctx, 3);
				{
				setState(211);
				childComponentDecl();
				}
				break;
			case FAIL_MODE:
				enterOuterAlt(_localctx, 4);
				{
				setState(212);
				failModeDecl();
				}
				break;
			case ASSIGN:
				enterOuterAlt(_localctx, 5);
				{
				setState(213);
				assignment();
				}
				break;
			case SET:
				enterOuterAlt(_localctx, 6);
				{
				setState(214);
				setTemplate();
				}
				break;
			case ASSERT:
				enterOuterAlt(_localctx, 7);
				{
				setState(215);
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
		public TerminalNode Ident() { return getToken(RIIF2Parser.Ident, 0); }
		public TerminalNode AttrIdent() { return getToken(RIIF2Parser.AttrIdent, 0); }
		public TerminalNode HierIdent() { return getToken(RIIF2Parser.HierIdent, 0); }
		public TerminalNode AssocInstanceIdent() { return getToken(RIIF2Parser.AssocInstanceIdent, 0); }
		public TerminalNode AssocAttrIdent() { return getToken(RIIF2Parser.AssocAttrIdent, 0); }
		public TerminalNode AssocHierIdent() { return getToken(RIIF2Parser.AssocHierIdent, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ListConstructorContext listConstructor() {
			return getRuleContext(ListConstructorContext.class,0);
		}
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
		enterRule(_localctx, 26, RULE_setTemplate);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			match(SET);
			setState(219);
			_la = _input.LA(1);
			if ( !(((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (Ident - 77)) | (1L << (HierIdent - 77)) | (1L << (AttrIdent - 77)) | (1L << (AssocInstanceIdent - 77)) | (1L << (AssocHierIdent - 77)) | (1L << (AssocAttrIdent - 77)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(220);
			match(T__3);
			setState(223);
			switch (_input.LA(1)) {
			case T__7:
			case T__8:
			case T__9:
			case T__10:
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
				setState(221);
				expression(0);
				}
				break;
			case T__37:
				{
				setState(222);
				listConstructor();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(225);
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
		enterRule(_localctx, 28, RULE_environmentDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			match(ENVIRONMENT);
			setState(228);
			match(Ident);
			setState(229);
			match(T__0);
			setState(233);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ASSIGN) | (1L << INPUT) | (1L << OUTPUT))) != 0)) {
				{
				{
				setState(230);
				environmentBodyElements();
				}
				}
				setState(235);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(236);
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
		enterRule(_localctx, 30, RULE_environmentBodyElements);
		try {
			setState(240);
			switch (_input.LA(1)) {
			case ASSIGN:
				enterOuterAlt(_localctx, 1);
				{
				setState(238);
				assignment();
				}
				break;
			case INPUT:
			case OUTPUT:
				enterOuterAlt(_localctx, 2);
				{
				setState(239);
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
		enterRule(_localctx, 32, RULE_requirementDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			match(REQUIREMENT);
			setState(243);
			match(Ident);
			setState(244);
			match(T__0);
			setState(248);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ASSERT) {
				{
				{
				setState(245);
				assertion();
				}
				}
				setState(250);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(251);
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
		public TerminalNode Ident() { return getToken(RIIF2Parser.Ident, 0); }
		public ComplexTypeContext complexType() {
			return getRuleContext(ComplexTypeContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode AssocDecl() { return getToken(RIIF2Parser.AssocDecl, 0); }
		public ListConstructorContext listConstructor() {
			return getRuleContext(ListConstructorContext.class,0);
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
		enterRule(_localctx, 34, RULE_parameterDecl);
		int _la;
		try {
			setState(269);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(253);
				match(PARAMETER);
				setState(254);
				match(Ident);
				setState(255);
				match(T__1);
				setState(256);
				complexType();
				setState(259);
				_la = _input.LA(1);
				if (_la==T__2) {
					{
					setState(257);
					match(T__2);
					setState(258);
					expression(0);
					}
				}

				setState(261);
				match(T__0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(263);
				match(PARAMETER);
				setState(264);
				match(AssocDecl);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(265);
				match(PARAMETER);
				setState(266);
				match(Ident);
				setState(267);
				match(T__2);
				setState(268);
				listConstructor();
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
		enterRule(_localctx, 36, RULE_envParameterDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			_la = _input.LA(1);
			if ( !(_la==INPUT || _la==OUTPUT) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(272);
			match(PARAMETER);
			setState(273);
			_la = _input.LA(1);
			if ( !(_la==Ident || _la==AssocDecl) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(274);
			match(T__1);
			setState(275);
			complexType();
			setState(278);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(276);
				match(T__2);
				setState(277);
				expression(0);
				}
			}

			setState(280);
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
		public TerminalNode Ident() { return getToken(RIIF2Parser.Ident, 0); }
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode AssocDecl() { return getToken(RIIF2Parser.AssocDecl, 0); }
		public ListConstructorContext listConstructor() {
			return getRuleContext(ListConstructorContext.class,0);
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
		enterRule(_localctx, 38, RULE_constanceDecl);
		int _la;
		try {
			setState(298);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(282);
				match(CONSTANT);
				setState(283);
				match(Ident);
				setState(284);
				match(T__1);
				setState(285);
				primitiveType();
				setState(288);
				_la = _input.LA(1);
				if (_la==T__2) {
					{
					setState(286);
					match(T__2);
					setState(287);
					expression(0);
					}
				}

				setState(290);
				match(T__0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(292);
				match(CONSTANT);
				setState(293);
				match(AssocDecl);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(294);
				match(CONSTANT);
				setState(295);
				match(Ident);
				setState(296);
				match(T__2);
				setState(297);
				listConstructor();
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
		enterRule(_localctx, 40, RULE_childComponentDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(300);
			match(CHILD_COMPONENT);
			setState(301);
			match(Ident);
			setState(302);
			_la = _input.LA(1);
			if ( !(_la==Ident || _la==AssocDecl) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(304);
			_la = _input.LA(1);
			if (_la==T__39) {
				{
				setState(303);
				vector();
				}
			}

			setState(306);
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
		enterRule(_localctx, 42, RULE_failModeDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(308);
			match(FAIL_MODE);
			setState(309);
			_la = _input.LA(1);
			if ( !(_la==Ident || _la==AssocDecl) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(310);
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
		public TerminalNode Ident() { return getToken(RIIF2Parser.Ident, 0); }
		public TerminalNode HierIdent() { return getToken(RIIF2Parser.HierIdent, 0); }
		public TerminalNode AttrIdent() { return getToken(RIIF2Parser.AttrIdent, 0); }
		public TerminalNode AssocInstanceIdent() { return getToken(RIIF2Parser.AssocInstanceIdent, 0); }
		public TerminalNode AssocAttrIdent() { return getToken(RIIF2Parser.AssocAttrIdent, 0); }
		public TerminalNode AssocHierIdent() { return getToken(RIIF2Parser.AssocHierIdent, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ListConstructorContext listConstructor() {
			return getRuleContext(ListConstructorContext.class,0);
		}
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
		enterRule(_localctx, 44, RULE_assignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(312);
			match(ASSIGN);
			setState(313);
			_la = _input.LA(1);
			if ( !(((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (Ident - 77)) | (1L << (HierIdent - 77)) | (1L << (AttrIdent - 77)) | (1L << (AssocInstanceIdent - 77)) | (1L << (AssocHierIdent - 77)) | (1L << (AssocAttrIdent - 77)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(315);
			_la = _input.LA(1);
			if (_la==T__39) {
				{
				setState(314);
				vector();
				}
			}

			setState(317);
			match(T__3);
			setState(320);
			switch (_input.LA(1)) {
			case T__7:
			case T__8:
			case T__9:
			case T__10:
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
				setState(318);
				expression(0);
				}
				break;
			case T__37:
				{
				setState(319);
				listConstructor();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(322);
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
		enterRule(_localctx, 46, RULE_assertion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(324);
			match(ASSERT);
			{
			setState(325);
			match(AttrIdent);
			}
			setState(326);
			_la = _input.LA(1);
			if ( !(_la==T__5 || _la==T__6) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(327);
			expression(0);
			setState(328);
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
		int _startState = 48;
		enterRecursionRule(_localctx, 48, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(336);
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
				setState(331);
				primary();
				}
				break;
			case T__7:
			case T__8:
				{
				setState(332);
				_la = _input.LA(1);
				if ( !(_la==T__7 || _la==T__8) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(333);
				expression(14);
				}
				break;
			case T__9:
			case T__10:
				{
				setState(334);
				_la = _input.LA(1);
				if ( !(_la==T__9 || _la==T__10) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(335);
				expression(13);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(387);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(385);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(338);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(339);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__12) | (1L << T__13))) != 0)) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(340);
						expression(13);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(341);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(342);
						_la = _input.LA(1);
						if ( !(_la==T__7 || _la==T__8) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(343);
						expression(12);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(344);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(352);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
						case 1:
							{
							setState(345);
							match(T__5);
							setState(346);
							match(T__5);
							}
							break;
						case 2:
							{
							setState(347);
							match(T__6);
							setState(348);
							match(T__6);
							setState(349);
							match(T__6);
							}
							break;
						case 3:
							{
							setState(350);
							match(T__6);
							setState(351);
							match(T__6);
							}
							break;
						}
						setState(354);
						expression(11);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(355);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(356);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__14) | (1L << T__15))) != 0)) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(357);
						expression(10);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(358);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(359);
						_la = _input.LA(1);
						if ( !(_la==T__16 || _la==T__17) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(360);
						expression(9);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(361);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(362);
						match(T__18);
						setState(363);
						expression(8);
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(364);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(365);
						match(T__19);
						setState(366);
						expression(7);
						}
						break;
					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(367);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(368);
						match(T__20);
						setState(369);
						expression(6);
						}
						break;
					case 9:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(370);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(371);
						match(T__21);
						setState(372);
						expression(5);
						}
						break;
					case 10:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(373);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(374);
						match(T__22);
						setState(375);
						expression(4);
						}
						break;
					case 11:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(376);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(377);
						match(T__23);
						setState(378);
						expression(0);
						setState(379);
						match(T__1);
						setState(380);
						expression(3);
						}
						break;
					case 12:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(382);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(383);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34))) != 0)) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(384);
						expression(1);
						}
						break;
					}
					} 
				}
				setState(389);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
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
		enterRule(_localctx, 50, RULE_primary);
		try {
			setState(403);
			switch (_input.LA(1)) {
			case T__35:
				enterOuterAlt(_localctx, 1);
				{
				setState(390);
				match(T__35);
				setState(391);
				expression(0);
				setState(392);
				match(T__36);
				}
				break;
			case SELF:
				enterOuterAlt(_localctx, 2);
				{
				setState(394);
				match(SELF);
				}
				break;
			case Ident:
				enterOuterAlt(_localctx, 3);
				{
				setState(395);
				match(Ident);
				}
				break;
			case HierIdent:
				enterOuterAlt(_localctx, 4);
				{
				setState(396);
				match(HierIdent);
				}
				break;
			case AttrIdent:
				enterOuterAlt(_localctx, 5);
				{
				setState(397);
				match(AttrIdent);
				}
				break;
			case AssocInstanceIdent:
				enterOuterAlt(_localctx, 6);
				{
				setState(398);
				match(AssocInstanceIdent);
				}
				break;
			case AssocAttrIdent:
				enterOuterAlt(_localctx, 7);
				{
				setState(399);
				match(AssocAttrIdent);
				}
				break;
			case AssocHierIdent:
				enterOuterAlt(_localctx, 8);
				{
				setState(400);
				match(AssocHierIdent);
				}
				break;
			case StringLiteral:
			case FloatingPointLiteral:
			case DecimalLiteral:
				enterOuterAlt(_localctx, 9);
				{
				setState(401);
				literal();
				}
				break;
			case FUNC_AGG_SINGLE:
			case FUNC_GT_N_FAIL:
			case FUNC_LOG:
			case FUNC_EXP:
				enterOuterAlt(_localctx, 10);
				{
				setState(402);
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

	public static class ListConstructorContext extends ParserRuleContext {
		public List<ArrayConstructorContext> arrayConstructor() {
			return getRuleContexts(ArrayConstructorContext.class);
		}
		public ArrayConstructorContext arrayConstructor(int i) {
			return getRuleContext(ArrayConstructorContext.class,i);
		}
		public ListConstructorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listConstructor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).enterListConstructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).exitListConstructor(this);
		}
	}

	public final ListConstructorContext listConstructor() throws RecognitionException {
		ListConstructorContext _localctx = new ListConstructorContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_listConstructor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(405);
			match(T__37);
			setState(406);
			arrayConstructor();
			setState(411);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(407);
				match(T__4);
				setState(408);
				arrayConstructor();
				}
				}
				setState(413);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(414);
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

	public static class ArrayConstructorContext extends ParserRuleContext {
		public List<ConstructorTypeContext> constructorType() {
			return getRuleContexts(ConstructorTypeContext.class);
		}
		public ConstructorTypeContext constructorType(int i) {
			return getRuleContext(ConstructorTypeContext.class,i);
		}
		public ArrayConstructorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayConstructor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).enterArrayConstructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).exitArrayConstructor(this);
		}
	}

	public final ArrayConstructorContext arrayConstructor() throws RecognitionException {
		ArrayConstructorContext _localctx = new ArrayConstructorContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_arrayConstructor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(416);
			match(T__39);
			setState(417);
			constructorType();
			setState(422);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(418);
				match(T__4);
				setState(419);
				constructorType();
				}
				}
				setState(424);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(425);
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

	public static class ConstructorTypeContext extends ParserRuleContext {
		public ListConstructorContext listConstructor() {
			return getRuleContext(ListConstructorContext.class,0);
		}
		public ArrayConstructorContext arrayConstructor() {
			return getRuleContext(ArrayConstructorContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ConstructorTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).enterConstructorType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).exitConstructorType(this);
		}
	}

	public final ConstructorTypeContext constructorType() throws RecognitionException {
		ConstructorTypeContext _localctx = new ConstructorTypeContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_constructorType);
		try {
			setState(430);
			switch (_input.LA(1)) {
			case T__37:
				enterOuterAlt(_localctx, 1);
				{
				setState(427);
				listConstructor();
				}
				break;
			case T__39:
				enterOuterAlt(_localctx, 2);
				{
				setState(428);
				arrayConstructor();
				}
				break;
			case T__7:
			case T__8:
			case T__9:
			case T__10:
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
				enterOuterAlt(_localctx, 3);
				{
				setState(429);
				expression(0);
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
		enterRule(_localctx, 58, RULE_funcCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(432);
			funcName();
			setState(433);
			match(T__35);
			setState(434);
			funcArg();
			setState(437);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(435);
				match(T__4);
				setState(436);
				funcArg();
				}
			}

			setState(439);
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
		enterRule(_localctx, 60, RULE_funcName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(441);
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
		enterRule(_localctx, 62, RULE_funcArg);
		int _la;
		try {
			setState(446);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(443);
				_la = _input.LA(1);
				if ( !(((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (Ident - 77)) | (1L << (HierIdent - 77)) | (1L << (AttrIdent - 77)))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(444);
				vector();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(445);
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
		enterRule(_localctx, 64, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(448);
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
		enterRule(_localctx, 66, RULE_complexType);
		try {
			setState(453);
			switch (_input.LA(1)) {
			case TYPE_FLOAT:
			case TYPE_INTEGER:
			case TYPE_STRING:
			case TYPE_TABLE:
				enterOuterAlt(_localctx, 1);
				{
				setState(450);
				primitiveType();
				}
				break;
			case TYPE_ENUM:
				enterOuterAlt(_localctx, 2);
				{
				setState(451);
				enumType();
				}
				break;
			case Ident:
				enterOuterAlt(_localctx, 3);
				{
				setState(452);
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
		enterRule(_localctx, 68, RULE_vector);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(455);
			match(T__39);
			setState(456);
			expression(0);
			setState(457);
			match(T__1);
			setState(458);
			expression(0);
			setState(459);
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
		enterRule(_localctx, 70, RULE_primitiveType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(461);
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
		enterRule(_localctx, 72, RULE_enumType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(463);
			match(TYPE_ENUM);
			setState(464);
			match(T__37);
			setState(465);
			match(Ident);
			setState(470);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(466);
				match(T__4);
				setState(467);
				match(Ident);
				}
				}
				setState(472);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(473);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 24:
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3X\u01de\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\3\2\6\2N\n\2\r\2\16\2O\3\2\3\2\3\3"+
		"\3\3\3\3\3\3\5\3X\n\3\3\4\3\4\3\4\3\4\5\4^\n\4\3\4\3\4\7\4b\n\4\f\4\16"+
		"\4e\13\4\3\4\3\4\3\5\3\5\5\5k\n\5\3\6\3\6\3\6\3\6\3\6\3\6\5\6s\n\6\3\7"+
		"\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u0081\n\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\5\b\u008a\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0093\n"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u009c\n\t\3\n\3\n\3\n\3\n\3\13\3\13"+
		"\3\13\3\13\3\13\3\f\3\f\3\f\5\f\u00aa\n\f\3\f\3\f\3\f\5\f\u00af\n\f\3"+
		"\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u00b9\n\r\f\r\16\r\u00bc\13\r\5\r\u00be"+
		"\n\r\3\r\3\r\3\r\3\r\7\r\u00c4\n\r\f\r\16\r\u00c7\13\r\5\r\u00c9\n\r\3"+
		"\r\3\r\7\r\u00cd\n\r\f\r\16\r\u00d0\13\r\3\r\3\r\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\5\16\u00db\n\16\3\17\3\17\3\17\3\17\3\17\5\17\u00e2\n\17"+
		"\3\17\3\17\3\20\3\20\3\20\3\20\7\20\u00ea\n\20\f\20\16\20\u00ed\13\20"+
		"\3\20\3\20\3\21\3\21\5\21\u00f3\n\21\3\22\3\22\3\22\3\22\7\22\u00f9\n"+
		"\22\f\22\16\22\u00fc\13\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\5\23"+
		"\u0106\n\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u0110\n\23\3"+
		"\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u0119\n\24\3\24\3\24\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\5\25\u0123\n\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\5\25\u012d\n\25\3\26\3\26\3\26\3\26\5\26\u0133\n\26\3\26\3\26\3"+
		"\27\3\27\3\27\3\27\3\30\3\30\3\30\5\30\u013e\n\30\3\30\3\30\3\30\5\30"+
		"\u0143\n\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\5\32\u0153\n\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\5\32\u0163\n\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\7\32\u0184\n\32"+
		"\f\32\16\32\u0187\13\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3"+
		"\33\3\33\3\33\3\33\5\33\u0196\n\33\3\34\3\34\3\34\3\34\7\34\u019c\n\34"+
		"\f\34\16\34\u019f\13\34\3\34\3\34\3\35\3\35\3\35\3\35\7\35\u01a7\n\35"+
		"\f\35\16\35\u01aa\13\35\3\35\3\35\3\36\3\36\3\36\5\36\u01b1\n\36\3\37"+
		"\3\37\3\37\3\37\3\37\5\37\u01b8\n\37\3\37\3\37\3 \3 \3!\3!\3!\5!\u01c1"+
		"\n!\3\"\3\"\3#\3#\3#\5#\u01c8\n#\3$\3$\3$\3$\3$\3$\3%\3%\3&\3&\3&\3&\3"+
		"&\7&\u01d7\n&\f&\16&\u01da\13&\3&\3&\3&\2\3\62\'\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJ\2\21\4\2QQUU\4\2OQS"+
		"U\3\2\678\4\2OORR\3\2\b\t\3\2\n\13\3\2\f\r\3\2\16\20\4\2\b\t\21\22\3\2"+
		"\23\24\4\2\6\6\33%\3\2?B\3\2OQ\3\2LN\4\2;=JJ\u0205\2M\3\2\2\2\4W\3\2\2"+
		"\2\6Y\3\2\2\2\bj\3\2\2\2\nr\3\2\2\2\ft\3\2\2\2\16\u0089\3\2\2\2\20\u009b"+
		"\3\2\2\2\22\u009d\3\2\2\2\24\u00a1\3\2\2\2\26\u00a6\3\2\2\2\30\u00b2\3"+
		"\2\2\2\32\u00da\3\2\2\2\34\u00dc\3\2\2\2\36\u00e5\3\2\2\2 \u00f2\3\2\2"+
		"\2\"\u00f4\3\2\2\2$\u010f\3\2\2\2&\u0111\3\2\2\2(\u012c\3\2\2\2*\u012e"+
		"\3\2\2\2,\u0136\3\2\2\2.\u013a\3\2\2\2\60\u0146\3\2\2\2\62\u0152\3\2\2"+
		"\2\64\u0195\3\2\2\2\66\u0197\3\2\2\28\u01a2\3\2\2\2:\u01b0\3\2\2\2<\u01b2"+
		"\3\2\2\2>\u01bb\3\2\2\2@\u01c0\3\2\2\2B\u01c2\3\2\2\2D\u01c7\3\2\2\2F"+
		"\u01c9\3\2\2\2H\u01cf\3\2\2\2J\u01d1\3\2\2\2LN\5\4\3\2ML\3\2\2\2NO\3\2"+
		"\2\2OM\3\2\2\2OP\3\2\2\2PQ\3\2\2\2QR\7\2\2\3R\3\3\2\2\2SX\5\30\r\2TX\5"+
		"\36\20\2UX\5\"\22\2VX\5\6\4\2WS\3\2\2\2WT\3\2\2\2WU\3\2\2\2WV\3\2\2\2"+
		"X\5\3\2\2\2YZ\7C\2\2Z]\7O\2\2[\\\7\64\2\2\\^\7O\2\2][\3\2\2\2]^\3\2\2"+
		"\2^_\3\2\2\2_c\7\3\2\2`b\5\b\5\2a`\3\2\2\2be\3\2\2\2ca\3\2\2\2cd\3\2\2"+
		"\2df\3\2\2\2ec\3\2\2\2fg\7D\2\2g\7\3\2\2\2hk\5\n\6\2ik\5\26\f\2jh\3\2"+
		"\2\2ji\3\2\2\2k\t\3\2\2\2ls\5\16\b\2ms\5\20\t\2ns\5\22\n\2os\5\24\13\2"+
		"ps\5\f\7\2qs\5,\27\2rl\3\2\2\2rm\3\2\2\2rn\3\2\2\2ro\3\2\2\2rp\3\2\2\2"+
		"rq\3\2\2\2s\13\3\2\2\2tu\7F\2\2uv\7\63\2\2vw\7O\2\2wx\7\3\2\2x\r\3\2\2"+
		"\2yz\7F\2\2z{\7:\2\2{|\7O\2\2|}\7\4\2\2}\u0080\5H%\2~\177\7\5\2\2\177"+
		"\u0081\5\62\32\2\u0080~\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u0082\3\2\2"+
		"\2\u0082\u0083\7\3\2\2\u0083\u008a\3\2\2\2\u0084\u0085\7F\2\2\u0085\u0086"+
		"\7:\2\2\u0086\u0087\7O\2\2\u0087\u0088\7\5\2\2\u0088\u008a\5\66\34\2\u0089"+
		"y\3\2\2\2\u0089\u0084\3\2\2\2\u008a\17\3\2\2\2\u008b\u008c\7F\2\2\u008c"+
		"\u008d\79\2\2\u008d\u008e\7O\2\2\u008e\u008f\7\4\2\2\u008f\u0092\5D#\2"+
		"\u0090\u0091\7\5\2\2\u0091\u0093\5\62\32\2\u0092\u0090\3\2\2\2\u0092\u0093"+
		"\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0095\7\3\2\2\u0095\u009c\3\2\2\2\u0096"+
		"\u0097\7F\2\2\u0097\u0098\79\2\2\u0098\u0099\7O\2\2\u0099\u009a\7\5\2"+
		"\2\u009a\u009c\5\66\34\2\u009b\u008b\3\2\2\2\u009b\u0096\3\2\2\2\u009c"+
		"\21\3\2\2\2\u009d\u009e\7F\2\2\u009e\u009f\t\2\2\2\u009f\u00a0\7\3\2\2"+
		"\u00a0\23\3\2\2\2\u00a1\u00a2\7F\2\2\u00a2\u00a3\7K\2\2\u00a3\u00a4\7"+
		"O\2\2\u00a4\u00a5\7\3\2\2\u00a5\25\3\2\2\2\u00a6\u00a7\7E\2\2\u00a7\u00a9"+
		"\t\3\2\2\u00a8\u00aa\5F$\2\u00a9\u00a8\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa"+
		"\u00ab\3\2\2\2\u00ab\u00ae\7\6\2\2\u00ac\u00af\5\62\32\2\u00ad\u00af\5"+
		"\66\34\2\u00ae\u00ac\3\2\2\2\u00ae\u00ad\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0"+
		"\u00b1\7\3\2\2\u00b1\27\3\2\2\2\u00b2\u00b3\7,\2\2\u00b3\u00bd\7O\2\2"+
		"\u00b4\u00b5\7\64\2\2\u00b5\u00ba\7O\2\2\u00b6\u00b7\7\7\2\2\u00b7\u00b9"+
		"\7O\2\2\u00b8\u00b6\3\2\2\2\u00b9\u00bc\3\2\2\2\u00ba\u00b8\3\2\2\2\u00ba"+
		"\u00bb\3\2\2\2\u00bb\u00be\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bd\u00b4\3\2"+
		"\2\2\u00bd\u00be\3\2\2\2\u00be\u00c8\3\2\2\2\u00bf\u00c0\7G\2\2\u00c0"+
		"\u00c5\7O\2\2\u00c1\u00c2\7\7\2\2\u00c2\u00c4\7O\2\2\u00c3\u00c1\3\2\2"+
		"\2\u00c4\u00c7\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c9"+
		"\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c8\u00bf\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9"+
		"\u00ca\3\2\2\2\u00ca\u00ce\7\3\2\2\u00cb\u00cd\5\32\16\2\u00cc\u00cb\3"+
		"\2\2\2\u00cd\u00d0\3\2\2\2\u00ce\u00cc\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf"+
		"\u00d1\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d1\u00d2\7-\2\2\u00d2\31\3\2\2\2"+
		"\u00d3\u00db\5$\23\2\u00d4\u00db\5(\25\2\u00d5\u00db\5*\26\2\u00d6\u00db"+
		"\5,\27\2\u00d7\u00db\5.\30\2\u00d8\u00db\5\34\17\2\u00d9\u00db\5\60\31"+
		"\2\u00da\u00d3\3\2\2\2\u00da\u00d4\3\2\2\2\u00da\u00d5\3\2\2\2\u00da\u00d6"+
		"\3\2\2\2\u00da\u00d7\3\2\2\2\u00da\u00d8\3\2\2\2\u00da\u00d9\3\2\2\2\u00db"+
		"\33\3\2\2\2\u00dc\u00dd\7I\2\2\u00dd\u00de\t\3\2\2\u00de\u00e1\7\6\2\2"+
		"\u00df\u00e2\5\62\32\2\u00e0\u00e2\5\66\34\2\u00e1\u00df\3\2\2\2\u00e1"+
		"\u00e0\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e4\7\3\2\2\u00e4\35\3\2\2"+
		"\2\u00e5\u00e6\7.\2\2\u00e6\u00e7\7O\2\2\u00e7\u00eb\7\3\2\2\u00e8\u00ea"+
		"\5 \21\2\u00e9\u00e8\3\2\2\2\u00ea\u00ed\3\2\2\2\u00eb\u00e9\3\2\2\2\u00eb"+
		"\u00ec\3\2\2\2\u00ec\u00ee\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ee\u00ef\7/"+
		"\2\2\u00ef\37\3\2\2\2\u00f0\u00f3\5.\30\2\u00f1\u00f3\5&\24\2\u00f2\u00f0"+
		"\3\2\2\2\u00f2\u00f1\3\2\2\2\u00f3!\3\2\2\2\u00f4\u00f5\7\60\2\2\u00f5"+
		"\u00f6\7O\2\2\u00f6\u00fa\7\3\2\2\u00f7\u00f9\5\60\31\2\u00f8\u00f7\3"+
		"\2\2\2\u00f9\u00fc\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb"+
		"\u00fd\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fd\u00fe\7\61\2\2\u00fe#\3\2\2\2"+
		"\u00ff\u0100\79\2\2\u0100\u0101\7O\2\2\u0101\u0102\7\4\2\2\u0102\u0105"+
		"\5D#\2\u0103\u0104\7\5\2\2\u0104\u0106\5\62\32\2\u0105\u0103\3\2\2\2\u0105"+
		"\u0106\3\2\2\2\u0106\u0107\3\2\2\2\u0107\u0108\7\3\2\2\u0108\u0110\3\2"+
		"\2\2\u0109\u010a\79\2\2\u010a\u0110\7R\2\2\u010b\u010c\79\2\2\u010c\u010d"+
		"\7O\2\2\u010d\u010e\7\5\2\2\u010e\u0110\5\66\34\2\u010f\u00ff\3\2\2\2"+
		"\u010f\u0109\3\2\2\2\u010f\u010b\3\2\2\2\u0110%\3\2\2\2\u0111\u0112\t"+
		"\4\2\2\u0112\u0113\79\2\2\u0113\u0114\t\5\2\2\u0114\u0115\7\4\2\2\u0115"+
		"\u0118\5D#\2\u0116\u0117\7\5\2\2\u0117\u0119\5\62\32\2\u0118\u0116\3\2"+
		"\2\2\u0118\u0119\3\2\2\2\u0119\u011a\3\2\2\2\u011a\u011b\7\3\2\2\u011b"+
		"\'\3\2\2\2\u011c\u011d\7:\2\2\u011d\u011e\7O\2\2\u011e\u011f\7\4\2\2\u011f"+
		"\u0122\5H%\2\u0120\u0121\7\5\2\2\u0121\u0123\5\62\32\2\u0122\u0120\3\2"+
		"\2\2\u0122\u0123\3\2\2\2\u0123\u0124\3\2\2\2\u0124\u0125\7\3\2\2\u0125"+
		"\u012d\3\2\2\2\u0126\u0127\7:\2\2\u0127\u012d\7R\2\2\u0128\u0129\7:\2"+
		"\2\u0129\u012a\7O\2\2\u012a\u012b\7\5\2\2\u012b\u012d\5\66\34\2\u012c"+
		"\u011c\3\2\2\2\u012c\u0126\3\2\2\2\u012c\u0128\3\2\2\2\u012d)\3\2\2\2"+
		"\u012e\u012f\7\62\2\2\u012f\u0130\7O\2\2\u0130\u0132\t\5\2\2\u0131\u0133"+
		"\5F$\2\u0132\u0131\3\2\2\2\u0132\u0133\3\2\2\2\u0133\u0134\3\2\2\2\u0134"+
		"\u0135\7\3\2\2\u0135+\3\2\2\2\u0136\u0137\7\63\2\2\u0137\u0138\t\5\2\2"+
		"\u0138\u0139\7\3\2\2\u0139-\3\2\2\2\u013a\u013b\7\65\2\2\u013b\u013d\t"+
		"\3\2\2\u013c\u013e\5F$\2\u013d\u013c\3\2\2\2\u013d\u013e\3\2\2\2\u013e"+
		"\u013f\3\2\2\2\u013f\u0142\7\6\2\2\u0140\u0143\5\62\32\2\u0141\u0143\5"+
		"\66\34\2\u0142\u0140\3\2\2\2\u0142\u0141\3\2\2\2\u0143\u0144\3\2\2\2\u0144"+
		"\u0145\7\3\2\2\u0145/\3\2\2\2\u0146\u0147\7\66\2\2\u0147\u0148\7Q\2\2"+
		"\u0148\u0149\t\6\2\2\u0149\u014a\5\62\32\2\u014a\u014b\7\3\2\2\u014b\61"+
		"\3\2\2\2\u014c\u014d\b\32\1\2\u014d\u0153\5\64\33\2\u014e\u014f\t\7\2"+
		"\2\u014f\u0153\5\62\32\20\u0150\u0151\t\b\2\2\u0151\u0153\5\62\32\17\u0152"+
		"\u014c\3\2\2\2\u0152\u014e\3\2\2\2\u0152\u0150\3\2\2\2\u0153\u0185\3\2"+
		"\2\2\u0154\u0155\f\16\2\2\u0155\u0156\t\t\2\2\u0156\u0184\5\62\32\17\u0157"+
		"\u0158\f\r\2\2\u0158\u0159\t\7\2\2\u0159\u0184\5\62\32\16\u015a\u0162"+
		"\f\f\2\2\u015b\u015c\7\b\2\2\u015c\u0163\7\b\2\2\u015d\u015e\7\t\2\2\u015e"+
		"\u015f\7\t\2\2\u015f\u0163\7\t\2\2\u0160\u0161\7\t\2\2\u0161\u0163\7\t"+
		"\2\2\u0162\u015b\3\2\2\2\u0162\u015d\3\2\2\2\u0162\u0160\3\2\2\2\u0163"+
		"\u0164\3\2\2\2\u0164\u0184\5\62\32\r\u0165\u0166\f\13\2\2\u0166\u0167"+
		"\t\n\2\2\u0167\u0184\5\62\32\f\u0168\u0169\f\n\2\2\u0169\u016a\t\13\2"+
		"\2\u016a\u0184\5\62\32\13\u016b\u016c\f\t\2\2\u016c\u016d\7\25\2\2\u016d"+
		"\u0184\5\62\32\n\u016e\u016f\f\b\2\2\u016f\u0170\7\26\2\2\u0170\u0184"+
		"\5\62\32\t\u0171\u0172\f\7\2\2\u0172\u0173\7\27\2\2\u0173\u0184\5\62\32"+
		"\b\u0174\u0175\f\6\2\2\u0175\u0176\7\30\2\2\u0176\u0184\5\62\32\7\u0177"+
		"\u0178\f\5\2\2\u0178\u0179\7\31\2\2\u0179\u0184\5\62\32\6\u017a\u017b"+
		"\f\4\2\2\u017b\u017c\7\32\2\2\u017c\u017d\5\62\32\2\u017d\u017e\7\4\2"+
		"\2\u017e\u017f\5\62\32\5\u017f\u0184\3\2\2\2\u0180\u0181\f\3\2\2\u0181"+
		"\u0182\t\f\2\2\u0182\u0184\5\62\32\3\u0183\u0154\3\2\2\2\u0183\u0157\3"+
		"\2\2\2\u0183\u015a\3\2\2\2\u0183\u0165\3\2\2\2\u0183\u0168\3\2\2\2\u0183"+
		"\u016b\3\2\2\2\u0183\u016e\3\2\2\2\u0183\u0171\3\2\2\2\u0183\u0174\3\2"+
		"\2\2\u0183\u0177\3\2\2\2\u0183\u017a\3\2\2\2\u0183\u0180\3\2\2\2\u0184"+
		"\u0187\3\2\2\2\u0185\u0183\3\2\2\2\u0185\u0186\3\2\2\2\u0186\63\3\2\2"+
		"\2\u0187\u0185\3\2\2\2\u0188\u0189\7&\2\2\u0189\u018a\5\62\32\2\u018a"+
		"\u018b\7\'\2\2\u018b\u0196\3\2\2\2\u018c\u0196\7H\2\2\u018d\u0196\7O\2"+
		"\2\u018e\u0196\7P\2\2\u018f\u0196\7Q\2\2\u0190\u0196\7S\2\2\u0191\u0196"+
		"\7U\2\2\u0192\u0196\7T\2\2\u0193\u0196\5B\"\2\u0194\u0196\5<\37\2\u0195"+
		"\u0188\3\2\2\2\u0195\u018c\3\2\2\2\u0195\u018d\3\2\2\2\u0195\u018e\3\2"+
		"\2\2\u0195\u018f\3\2\2\2\u0195\u0190\3\2\2\2\u0195\u0191\3\2\2\2\u0195"+
		"\u0192\3\2\2\2\u0195\u0193\3\2\2\2\u0195\u0194\3\2\2\2\u0196\65\3\2\2"+
		"\2\u0197\u0198\7(\2\2\u0198\u019d\58\35\2\u0199\u019a\7\7\2\2\u019a\u019c"+
		"\58\35\2\u019b\u0199\3\2\2\2\u019c\u019f\3\2\2\2\u019d\u019b\3\2\2\2\u019d"+
		"\u019e\3\2\2\2\u019e\u01a0\3\2\2\2\u019f\u019d\3\2\2\2\u01a0\u01a1\7)"+
		"\2\2\u01a1\67\3\2\2\2\u01a2\u01a3\7*\2\2\u01a3\u01a8\5:\36\2\u01a4\u01a5"+
		"\7\7\2\2\u01a5\u01a7\5:\36\2\u01a6\u01a4\3\2\2\2\u01a7\u01aa\3\2\2\2\u01a8"+
		"\u01a6\3\2\2\2\u01a8\u01a9\3\2\2\2\u01a9\u01ab\3\2\2\2\u01aa\u01a8\3\2"+
		"\2\2\u01ab\u01ac\7+\2\2\u01ac9\3\2\2\2\u01ad\u01b1\5\66\34\2\u01ae\u01b1"+
		"\58\35\2\u01af\u01b1\5\62\32\2\u01b0\u01ad\3\2\2\2\u01b0\u01ae\3\2\2\2"+
		"\u01b0\u01af\3\2\2\2\u01b1;\3\2\2\2\u01b2\u01b3\5> \2\u01b3\u01b4\7&\2"+
		"\2\u01b4\u01b7\5@!\2\u01b5\u01b6\7\7\2\2\u01b6\u01b8\5@!\2\u01b7\u01b5"+
		"\3\2\2\2\u01b7\u01b8\3\2\2\2\u01b8\u01b9\3\2\2\2\u01b9\u01ba\7\'\2\2\u01ba"+
		"=\3\2\2\2\u01bb\u01bc\t\r\2\2\u01bc?\3\2\2\2\u01bd\u01be\t\16\2\2\u01be"+
		"\u01c1\5F$\2\u01bf\u01c1\5\62\32\2\u01c0\u01bd\3\2\2\2\u01c0\u01bf\3\2"+
		"\2\2\u01c1A\3\2\2\2\u01c2\u01c3\t\17\2\2\u01c3C\3\2\2\2\u01c4\u01c8\5"+
		"H%\2\u01c5\u01c8\5J&\2\u01c6\u01c8\7O\2\2\u01c7\u01c4\3\2\2\2\u01c7\u01c5"+
		"\3\2\2\2\u01c7\u01c6\3\2\2\2\u01c8E\3\2\2\2\u01c9\u01ca\7*\2\2\u01ca\u01cb"+
		"\5\62\32\2\u01cb\u01cc\7\4\2\2\u01cc\u01cd\5\62\32\2\u01cd\u01ce\7+\2"+
		"\2\u01ceG\3\2\2\2\u01cf\u01d0\t\20\2\2\u01d0I\3\2\2\2\u01d1\u01d2\7>\2"+
		"\2\u01d2\u01d3\7(\2\2\u01d3\u01d8\7O\2\2\u01d4\u01d5\7\7\2\2\u01d5\u01d7"+
		"\7O\2\2\u01d6\u01d4\3\2\2\2\u01d7\u01da\3\2\2\2\u01d8\u01d6\3\2\2\2\u01d8"+
		"\u01d9\3\2\2\2\u01d9\u01db\3\2\2\2\u01da\u01d8\3\2\2\2\u01db\u01dc\7)"+
		"\2\2\u01dcK\3\2\2\2,OW]cjr\u0080\u0089\u0092\u009b\u00a9\u00ae\u00ba\u00bd"+
		"\u00c5\u00c8\u00ce\u00da\u00e1\u00eb\u00f2\u00fa\u0105\u010f\u0118\u0122"+
		"\u012c\u0132\u013d\u0142\u0152\u0162\u0183\u0185\u0195\u019d\u01a8\u01b0"+
		"\u01b7\u01c0\u01c7\u01d8";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}