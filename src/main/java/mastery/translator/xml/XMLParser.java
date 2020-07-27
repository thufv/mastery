package mastery.translator.xml;

// Generated from XMLParser.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class XMLParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		COMMENT=1, CDATA=2, DTD=3, EntityRef=4, CharRef=5, SEA_WS=6, OPEN=7, XMLDeclOpen=8, 
		TEXT=9, CLOSE=10, SPECIAL_CLOSE=11, SLASH_CLOSE=12, SLASH=13, EQUALS=14, 
		STRING=15, Name=16, S=17, PI=18;
	public static final int
		RULE_document = 0, RULE_prolog = 1, RULE_optionProlog = 2, RULE_content = 3, 
		RULE_someContent = 4, RULE_someContents = 5, RULE_element = 6, RULE_longElement = 7, 
		RULE_shortElement = 8, RULE_reference = 9, RULE_attribute = 10, RULE_attributes = 11, 
		RULE_chardata = 12, RULE_optionChardata = 13, RULE_miscs = 14, RULE_misc = 15;
	public static final String[] ruleNames = {
		"document", "prolog", "optionProlog", "content", "someContent", "someContents", 
		"element", "longElement", "shortElement", "reference", "attribute", "attributes", 
		"chardata", "optionChardata", "miscs", "misc"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, null, "'<'", null, null, "'>'", null, 
		"'/>'", "'/'", "'='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "COMMENT", "CDATA", "DTD", "EntityRef", "CharRef", "SEA_WS", "OPEN", 
		"XMLDeclOpen", "TEXT", "CLOSE", "SPECIAL_CLOSE", "SLASH_CLOSE", "SLASH", 
		"EQUALS", "STRING", "Name", "S", "PI"
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
	public String getGrammarFileName() { return "XMLParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public XMLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class DocumentContext extends ParserRuleContext {
		public OptionPrologContext optionProlog() {
			return getRuleContext(OptionPrologContext.class,0);
		}
		public List<MiscsContext> miscs() {
			return getRuleContexts(MiscsContext.class);
		}
		public MiscsContext miscs(int i) {
			return getRuleContext(MiscsContext.class,i);
		}
		public ElementContext element() {
			return getRuleContext(ElementContext.class,0);
		}
		public DocumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_document; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XMLParserListener ) ((XMLParserListener)listener).enterDocument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XMLParserListener ) ((XMLParserListener)listener).exitDocument(this);
		}
	}

	public final DocumentContext document() throws RecognitionException {
		DocumentContext _localctx = new DocumentContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_document);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			optionProlog();
			setState(33);
			miscs();
			setState(34);
			element();
			setState(35);
			miscs();
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

	public static class PrologContext extends ParserRuleContext {
		public TerminalNode XMLDeclOpen() { return getToken(XMLParser.XMLDeclOpen, 0); }
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public TerminalNode SPECIAL_CLOSE() { return getToken(XMLParser.SPECIAL_CLOSE, 0); }
		public PrologContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prolog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XMLParserListener ) ((XMLParserListener)listener).enterProlog(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XMLParserListener ) ((XMLParserListener)listener).exitProlog(this);
		}
	}

	public final PrologContext prolog() throws RecognitionException {
		PrologContext _localctx = new PrologContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_prolog);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			match(XMLDeclOpen);
			setState(38);
			attributes();
			setState(39);
			match(SPECIAL_CLOSE);
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

	public static class OptionPrologContext extends ParserRuleContext {
		public PrologContext prolog() {
			return getRuleContext(PrologContext.class,0);
		}
		public OptionPrologContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optionProlog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XMLParserListener ) ((XMLParserListener)listener).enterOptionProlog(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XMLParserListener ) ((XMLParserListener)listener).exitOptionProlog(this);
		}
	}

	public final OptionPrologContext optionProlog() throws RecognitionException {
		OptionPrologContext _localctx = new OptionPrologContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_optionProlog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==XMLDeclOpen) {
				{
				setState(41);
				prolog();
				}
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

	public static class ContentContext extends ParserRuleContext {
		public OptionChardataContext optionChardata() {
			return getRuleContext(OptionChardataContext.class,0);
		}
		public SomeContentsContext someContents() {
			return getRuleContext(SomeContentsContext.class,0);
		}
		public ContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_content; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XMLParserListener ) ((XMLParserListener)listener).enterContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XMLParserListener ) ((XMLParserListener)listener).exitContent(this);
		}
	}

	public final ContentContext content() throws RecognitionException {
		ContentContext _localctx = new ContentContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_content);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			optionChardata();
			setState(45);
			someContents();
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

	public static class SomeContentContext extends ParserRuleContext {
		public OptionChardataContext optionChardata() {
			return getRuleContext(OptionChardataContext.class,0);
		}
		public ElementContext element() {
			return getRuleContext(ElementContext.class,0);
		}
		public ReferenceContext reference() {
			return getRuleContext(ReferenceContext.class,0);
		}
		public TerminalNode CDATA() { return getToken(XMLParser.CDATA, 0); }
		public TerminalNode PI() { return getToken(XMLParser.PI, 0); }
		public TerminalNode COMMENT() { return getToken(XMLParser.COMMENT, 0); }
		public SomeContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_someContent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XMLParserListener ) ((XMLParserListener)listener).enterSomeContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XMLParserListener ) ((XMLParserListener)listener).exitSomeContent(this);
		}
	}

	public final SomeContentContext someContent() throws RecognitionException {
		SomeContentContext _localctx = new SomeContentContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_someContent);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN:
				{
				setState(47);
				element();
				}
				break;
			case EntityRef:
			case CharRef:
				{
				setState(48);
				reference();
				}
				break;
			case CDATA:
				{
				setState(49);
				match(CDATA);
				}
				break;
			case PI:
				{
				setState(50);
				match(PI);
				}
				break;
			case COMMENT:
				{
				setState(51);
				match(COMMENT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(54);
			optionChardata();
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

	public static class SomeContentsContext extends ParserRuleContext {
		public List<SomeContentContext> someContent() {
			return getRuleContexts(SomeContentContext.class);
		}
		public SomeContentContext someContent(int i) {
			return getRuleContext(SomeContentContext.class,i);
		}
		public SomeContentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_someContents; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XMLParserListener ) ((XMLParserListener)listener).enterSomeContents(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XMLParserListener ) ((XMLParserListener)listener).exitSomeContents(this);
		}
	}

	public final SomeContentsContext someContents() throws RecognitionException {
		SomeContentsContext _localctx = new SomeContentsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_someContents);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(56);
					someContent();
					}
					} 
				}
				setState(61);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
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

	public static class ElementContext extends ParserRuleContext {
		public LongElementContext longElement() {
			return getRuleContext(LongElementContext.class,0);
		}
		public ShortElementContext shortElement() {
			return getRuleContext(ShortElementContext.class,0);
		}
		public ElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XMLParserListener ) ((XMLParserListener)listener).enterElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XMLParserListener ) ((XMLParserListener)listener).exitElement(this);
		}
	}

	public final ElementContext element() throws RecognitionException {
		ElementContext _localctx = new ElementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_element);
		try {
			setState(64);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(62);
				longElement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(63);
				shortElement();
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

	public static class LongElementContext extends ParserRuleContext {
		public List<TerminalNode> Name() { return getTokens(XMLParser.Name); }
		public TerminalNode Name(int i) {
			return getToken(XMLParser.Name, i);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public ContentContext content() {
			return getRuleContext(ContentContext.class,0);
		}
		public LongElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_longElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XMLParserListener ) ((XMLParserListener)listener).enterLongElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XMLParserListener ) ((XMLParserListener)listener).exitLongElement(this);
		}
	}

	public final LongElementContext longElement() throws RecognitionException {
		LongElementContext _localctx = new LongElementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_longElement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			match(OPEN);
			setState(67);
			match(Name);
			setState(68);
			attributes();
			setState(69);
			match(CLOSE);
			setState(70);
			content();
			setState(71);
			match(OPEN);
			setState(72);
			match(SLASH);
			setState(73);
			match(Name);
			setState(74);
			match(CLOSE);
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

	public static class ShortElementContext extends ParserRuleContext {
		public TerminalNode Name() { return getToken(XMLParser.Name, 0); }
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public ShortElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shortElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XMLParserListener ) ((XMLParserListener)listener).enterShortElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XMLParserListener ) ((XMLParserListener)listener).exitShortElement(this);
		}
	}

	public final ShortElementContext shortElement() throws RecognitionException {
		ShortElementContext _localctx = new ShortElementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_shortElement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			match(OPEN);
			setState(77);
			match(Name);
			setState(78);
			attributes();
			setState(79);
			match(SLASH_CLOSE);
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

	public static class ReferenceContext extends ParserRuleContext {
		public TerminalNode EntityRef() { return getToken(XMLParser.EntityRef, 0); }
		public TerminalNode CharRef() { return getToken(XMLParser.CharRef, 0); }
		public ReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XMLParserListener ) ((XMLParserListener)listener).enterReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XMLParserListener ) ((XMLParserListener)listener).exitReference(this);
		}
	}

	public final ReferenceContext reference() throws RecognitionException {
		ReferenceContext _localctx = new ReferenceContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_reference);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			_la = _input.LA(1);
			if ( !(_la==EntityRef || _la==CharRef) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
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

	public static class AttributeContext extends ParserRuleContext {
		public TerminalNode Name() { return getToken(XMLParser.Name, 0); }
		public TerminalNode STRING() { return getToken(XMLParser.STRING, 0); }
		public AttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XMLParserListener ) ((XMLParserListener)listener).enterAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XMLParserListener ) ((XMLParserListener)listener).exitAttribute(this);
		}
	}

	public final AttributeContext attribute() throws RecognitionException {
		AttributeContext _localctx = new AttributeContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_attribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			match(Name);
			setState(84);
			match(EQUALS);
			setState(85);
			match(STRING);
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

	public static class AttributesContext extends ParserRuleContext {
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public AttributesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XMLParserListener ) ((XMLParserListener)listener).enterAttributes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XMLParserListener ) ((XMLParserListener)listener).exitAttributes(this);
		}
	}

	public final AttributesContext attributes() throws RecognitionException {
		AttributesContext _localctx = new AttributesContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_attributes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Name) {
				{
				{
				setState(87);
				attribute();
				}
				}
				setState(92);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class ChardataContext extends ParserRuleContext {
		public TerminalNode TEXT() { return getToken(XMLParser.TEXT, 0); }
		public TerminalNode SEA_WS() { return getToken(XMLParser.SEA_WS, 0); }
		public ChardataContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chardata; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XMLParserListener ) ((XMLParserListener)listener).enterChardata(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XMLParserListener ) ((XMLParserListener)listener).exitChardata(this);
		}
	}

	public final ChardataContext chardata() throws RecognitionException {
		ChardataContext _localctx = new ChardataContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_chardata);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			_la = _input.LA(1);
			if ( !(_la==SEA_WS || _la==TEXT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
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

	public static class OptionChardataContext extends ParserRuleContext {
		public ChardataContext chardata() {
			return getRuleContext(ChardataContext.class,0);
		}
		public OptionChardataContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optionChardata; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XMLParserListener ) ((XMLParserListener)listener).enterOptionChardata(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XMLParserListener ) ((XMLParserListener)listener).exitOptionChardata(this);
		}
	}

	public final OptionChardataContext optionChardata() throws RecognitionException {
		OptionChardataContext _localctx = new OptionChardataContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_optionChardata);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEA_WS || _la==TEXT) {
				{
				setState(95);
				chardata();
				}
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

	public static class MiscsContext extends ParserRuleContext {
		public List<MiscContext> misc() {
			return getRuleContexts(MiscContext.class);
		}
		public MiscContext misc(int i) {
			return getRuleContext(MiscContext.class,i);
		}
		public MiscsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_miscs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XMLParserListener ) ((XMLParserListener)listener).enterMiscs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XMLParserListener ) ((XMLParserListener)listener).exitMiscs(this);
		}
	}

	public final MiscsContext miscs() throws RecognitionException {
		MiscsContext _localctx = new MiscsContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_miscs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << SEA_WS) | (1L << PI))) != 0)) {
				{
				{
				setState(98);
				misc();
				}
				}
				setState(103);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class MiscContext extends ParserRuleContext {
		public TerminalNode COMMENT() { return getToken(XMLParser.COMMENT, 0); }
		public TerminalNode PI() { return getToken(XMLParser.PI, 0); }
		public TerminalNode SEA_WS() { return getToken(XMLParser.SEA_WS, 0); }
		public MiscContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_misc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XMLParserListener ) ((XMLParserListener)listener).enterMisc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XMLParserListener ) ((XMLParserListener)listener).exitMisc(this);
		}
	}

	public final MiscContext misc() throws RecognitionException {
		MiscContext _localctx = new MiscContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_misc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << SEA_WS) | (1L << PI))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\24m\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3\2\3\2\3\2"+
		"\3\2\3\3\3\3\3\3\3\3\3\4\5\4-\n\4\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\5\6"+
		"\67\n\6\3\6\3\6\3\7\7\7<\n\7\f\7\16\7?\13\7\3\b\3\b\5\bC\n\b\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3"+
		"\f\3\f\3\r\7\r[\n\r\f\r\16\r^\13\r\3\16\3\16\3\17\5\17c\n\17\3\20\7\20"+
		"f\n\20\f\20\16\20i\13\20\3\21\3\21\3\21\2\2\22\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\36 \2\5\3\2\6\7\4\2\b\b\13\13\5\2\3\3\b\b\24\24\2f\2\"\3"+
		"\2\2\2\4\'\3\2\2\2\6,\3\2\2\2\b.\3\2\2\2\n\66\3\2\2\2\f=\3\2\2\2\16B\3"+
		"\2\2\2\20D\3\2\2\2\22N\3\2\2\2\24S\3\2\2\2\26U\3\2\2\2\30\\\3\2\2\2\32"+
		"_\3\2\2\2\34b\3\2\2\2\36g\3\2\2\2 j\3\2\2\2\"#\5\6\4\2#$\5\36\20\2$%\5"+
		"\16\b\2%&\5\36\20\2&\3\3\2\2\2\'(\7\n\2\2()\5\30\r\2)*\7\r\2\2*\5\3\2"+
		"\2\2+-\5\4\3\2,+\3\2\2\2,-\3\2\2\2-\7\3\2\2\2./\5\34\17\2/\60\5\f\7\2"+
		"\60\t\3\2\2\2\61\67\5\16\b\2\62\67\5\24\13\2\63\67\7\4\2\2\64\67\7\24"+
		"\2\2\65\67\7\3\2\2\66\61\3\2\2\2\66\62\3\2\2\2\66\63\3\2\2\2\66\64\3\2"+
		"\2\2\66\65\3\2\2\2\678\3\2\2\289\5\34\17\29\13\3\2\2\2:<\5\n\6\2;:\3\2"+
		"\2\2<?\3\2\2\2=;\3\2\2\2=>\3\2\2\2>\r\3\2\2\2?=\3\2\2\2@C\5\20\t\2AC\5"+
		"\22\n\2B@\3\2\2\2BA\3\2\2\2C\17\3\2\2\2DE\7\t\2\2EF\7\22\2\2FG\5\30\r"+
		"\2GH\7\f\2\2HI\5\b\5\2IJ\7\t\2\2JK\7\17\2\2KL\7\22\2\2LM\7\f\2\2M\21\3"+
		"\2\2\2NO\7\t\2\2OP\7\22\2\2PQ\5\30\r\2QR\7\16\2\2R\23\3\2\2\2ST\t\2\2"+
		"\2T\25\3\2\2\2UV\7\22\2\2VW\7\20\2\2WX\7\21\2\2X\27\3\2\2\2Y[\5\26\f\2"+
		"ZY\3\2\2\2[^\3\2\2\2\\Z\3\2\2\2\\]\3\2\2\2]\31\3\2\2\2^\\\3\2\2\2_`\t"+
		"\3\2\2`\33\3\2\2\2ac\5\32\16\2ba\3\2\2\2bc\3\2\2\2c\35\3\2\2\2df\5 \21"+
		"\2ed\3\2\2\2fi\3\2\2\2ge\3\2\2\2gh\3\2\2\2h\37\3\2\2\2ig\3\2\2\2jk\t\4"+
		"\2\2k!\3\2\2\2\t,\66=B\\bg";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}