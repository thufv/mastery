package mastery.translator;

import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import mastery.tree.Leaf;
import mastery.tree.Tree;
import mastery.tree.Constructor;
import mastery.tree.UnorderedList;
import mastery.tree.OrderedList;

import org.antlr.v4.runtime.tree.ErrorNode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * Generate a AST (represented as JSON) from source code.
 */
public class TreeGenerator implements ParseTreeVisitor<Tree> {
    private ParserRuleContext context;
    private Parser parser;
    // use to store names of List-Node and ordered list node names
    private final HashSet<String> ListNodeNames;
    private final HashSet<String> OrderedListNodeNames;
    // number of grammar rules and size of vocabulary of grammar
    private final int rulesNum;
    // all alternative labels
    private final List<String> alternativeLabels;
    private final HashSet<String> stopLabels;

    /**
     * Constructor.
     *
     * @param ctx context
     */
    public TreeGenerator(Parser parser, ParserRuleContext ctx, HashSet<String> ListNodeNames,
            HashSet<String> OrderedListNodeNames, List<String> alternativeLabels, HashSet<String> stopLabels) {
        this.parser = parser;
        this.context = ctx;
        this.ListNodeNames = ListNodeNames;
        this.OrderedListNodeNames = OrderedListNodeNames;
        this.alternativeLabels = alternativeLabels;
        this.stopLabels = stopLabels;

        this.rulesNum = parser.getRuleNames().length;
    }

    /**
     * Generate a AST (represented as JSON).
     *
     * @return the AST
     */
    public Tree generate() {
        Tree tree = context.accept(this);
        return tree;
    }

    /**
     * Generate a specificial ID for each non-terminal node
     *
     * @return int ID
     */
    public int getNonTerminalLabelId(int ruleIndex, String name) {
        int LabelId = ruleIndex + 1;

        if (alternativeLabels.indexOf(name) != -1)
            LabelId = 1 + rulesNum + alternativeLabels.indexOf(name);

        return LabelId;
    }

    /**
     * Generate a specificial ID for each terminal node
     *
     * @return int ID
     */
    public int getTerminalLabelId(int TerminalIndex) {
        int LabelId = 1 + rulesNum + alternativeLabels.size() + TerminalIndex;
        return LabelId;
    }

    /**
     * Generate a specificial ID for error node
     *
     * @return int ID
     */
    public int getErrorLabelId() {
        return 0;
    }

    /**
     * Get name of a rule node. If it's a rule with alternative label, then the
     * alternative label is accepted as the output name. Else we accept the name of
     * nonterminal symbol.
     * 
     * @return name
     */
    public String getName(RuleNode node) {
        String tooLongName = node.getRuleContext().getClass().getName();
        int dollarPos = tooLongName.indexOf("$");
        String alternativeName = tooLongName.substring(dollarPos + 1, tooLongName.length() - 7);
        char lowerCaseInitial = Character.toLowerCase(alternativeName.charAt(0));
        return lowerCaseInitial + alternativeName.substring(1);
    }

    @Override
    public Tree visit(ParseTree tree) {
        assert false;
        return null;
    }

    @Override
    public Tree visitChildren(RuleNode node) {
        String name = getName(node);
        Integer label = getNonTerminalLabelId(node.getRuleContext().getRuleIndex(), name);

        int n = node.getChildCount();

        List<Tree> children = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            ParseTree child = node.getChild(i);
            Tree o = child.accept(this);

            // check if the child is terminal node <EOF>
            if (o == null) continue;
            // EOF is not welcomed
            if (o instanceof Leaf && ((Leaf)o).code.equals("<EOF>")) continue;

            children.add(o);
        }

        if (ListNodeNames.contains(name)) { // means it is a list
            if (OrderedListNodeNames.contains(name))
                return new OrderedList(label, name, children);
            else
                return new UnorderedList(label, name, children);
        } else { // means it is a node
            return new Constructor(label, name, children, stopLabels.contains(name));
        }
    }

    @Override
    public Tree visitTerminal(TerminalNode node) {
        Token t = node.getSymbol();
        // if the child is terminal node <EOF> return null to ignore
        if (t.getType() == Token.EOF)
            return null;
        
        Integer label = getTerminalLabelId(t.getType());
        String name = parser.getVocabulary().getSymbolicName(t.getType());
        String code = t.getText();
        byte[] data = new byte[0];
        try {
            data = code.getBytes("ASCII");
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(1);
        }
        code = new String(data);

        return new Leaf(label, name, code);
    }

    @Override
    public Tree visitErrorNode(ErrorNode node) {
        throw new IllegalStateException("Error AST node.");
    }
}
