package mastery.translator.xml;

// Generated from XMLParser.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link XMLParser}.
 */
public interface XMLParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link XMLParser#document}.
	 * @param ctx the parse tree
	 */
	void enterDocument(XMLParser.DocumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link XMLParser#document}.
	 * @param ctx the parse tree
	 */
	void exitDocument(XMLParser.DocumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link XMLParser#prolog}.
	 * @param ctx the parse tree
	 */
	void enterProlog(XMLParser.PrologContext ctx);
	/**
	 * Exit a parse tree produced by {@link XMLParser#prolog}.
	 * @param ctx the parse tree
	 */
	void exitProlog(XMLParser.PrologContext ctx);
	/**
	 * Enter a parse tree produced by {@link XMLParser#optionProlog}.
	 * @param ctx the parse tree
	 */
	void enterOptionProlog(XMLParser.OptionPrologContext ctx);
	/**
	 * Exit a parse tree produced by {@link XMLParser#optionProlog}.
	 * @param ctx the parse tree
	 */
	void exitOptionProlog(XMLParser.OptionPrologContext ctx);
	/**
	 * Enter a parse tree produced by {@link XMLParser#content}.
	 * @param ctx the parse tree
	 */
	void enterContent(XMLParser.ContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link XMLParser#content}.
	 * @param ctx the parse tree
	 */
	void exitContent(XMLParser.ContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link XMLParser#someContent}.
	 * @param ctx the parse tree
	 */
	void enterSomeContent(XMLParser.SomeContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link XMLParser#someContent}.
	 * @param ctx the parse tree
	 */
	void exitSomeContent(XMLParser.SomeContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link XMLParser#someContents}.
	 * @param ctx the parse tree
	 */
	void enterSomeContents(XMLParser.SomeContentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link XMLParser#someContents}.
	 * @param ctx the parse tree
	 */
	void exitSomeContents(XMLParser.SomeContentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link XMLParser#element}.
	 * @param ctx the parse tree
	 */
	void enterElement(XMLParser.ElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link XMLParser#element}.
	 * @param ctx the parse tree
	 */
	void exitElement(XMLParser.ElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link XMLParser#longElement}.
	 * @param ctx the parse tree
	 */
	void enterLongElement(XMLParser.LongElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link XMLParser#longElement}.
	 * @param ctx the parse tree
	 */
	void exitLongElement(XMLParser.LongElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link XMLParser#shortElement}.
	 * @param ctx the parse tree
	 */
	void enterShortElement(XMLParser.ShortElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link XMLParser#shortElement}.
	 * @param ctx the parse tree
	 */
	void exitShortElement(XMLParser.ShortElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link XMLParser#reference}.
	 * @param ctx the parse tree
	 */
	void enterReference(XMLParser.ReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link XMLParser#reference}.
	 * @param ctx the parse tree
	 */
	void exitReference(XMLParser.ReferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link XMLParser#attribute}.
	 * @param ctx the parse tree
	 */
	void enterAttribute(XMLParser.AttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link XMLParser#attribute}.
	 * @param ctx the parse tree
	 */
	void exitAttribute(XMLParser.AttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link XMLParser#attributes}.
	 * @param ctx the parse tree
	 */
	void enterAttributes(XMLParser.AttributesContext ctx);
	/**
	 * Exit a parse tree produced by {@link XMLParser#attributes}.
	 * @param ctx the parse tree
	 */
	void exitAttributes(XMLParser.AttributesContext ctx);
	/**
	 * Enter a parse tree produced by {@link XMLParser#chardata}.
	 * @param ctx the parse tree
	 */
	void enterChardata(XMLParser.ChardataContext ctx);
	/**
	 * Exit a parse tree produced by {@link XMLParser#chardata}.
	 * @param ctx the parse tree
	 */
	void exitChardata(XMLParser.ChardataContext ctx);
	/**
	 * Enter a parse tree produced by {@link XMLParser#optionChardata}.
	 * @param ctx the parse tree
	 */
	void enterOptionChardata(XMLParser.OptionChardataContext ctx);
	/**
	 * Exit a parse tree produced by {@link XMLParser#optionChardata}.
	 * @param ctx the parse tree
	 */
	void exitOptionChardata(XMLParser.OptionChardataContext ctx);
	/**
	 * Enter a parse tree produced by {@link XMLParser#miscs}.
	 * @param ctx the parse tree
	 */
	void enterMiscs(XMLParser.MiscsContext ctx);
	/**
	 * Exit a parse tree produced by {@link XMLParser#miscs}.
	 * @param ctx the parse tree
	 */
	void exitMiscs(XMLParser.MiscsContext ctx);
	/**
	 * Enter a parse tree produced by {@link XMLParser#misc}.
	 * @param ctx the parse tree
	 */
	void enterMisc(XMLParser.MiscContext ctx);
	/**
	 * Exit a parse tree produced by {@link XMLParser#misc}.
	 * @param ctx the parse tree
	 */
	void exitMisc(XMLParser.MiscContext ctx);
}