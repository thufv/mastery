package mastery.tree;

import mastery.translator.cs.CSharpCodeFormatStrategy;
import mastery.translator.c.CCodeFormatStrategy;
import mastery.translator.java.JavaCodeFormatStrategy;
import mastery.translator.CodeFormatStrategy;
import mastery.util.log.IndentPrinter;

public class TreePrinters {
    public static void textTree(Tree tree, IndentPrinter printer) {
        var sb = new StringBuilder();
        print(tree, sb, "", "");
        printer.println(sb.toString());
    }

    private static void print(Tree tree, StringBuilder sb, String inherited, String prompt) {
        sb.append(inherited);
        sb.append(prompt);
        // this node
        sb.append(tree.toString());
        sb.append(" height ").append(tree.height);
        sb.append(" hash ").append(tree.treeHash);
        sb.append('\n');

        if (!tree.children.isEmpty()) {
            var prefix = inherited;
            if (prompt.equals(CONSECUTIVE_PROMPT)) prefix += DASHED_PROMPT;
            else if (prompt.equals(LAST_PROMPT)) prefix += EMPTY_PROMPT;

            var it = tree.children.iterator();
            for (int i = 0; i < tree.children.size() - 1; i++) {
                print(it.next(), sb, prefix, CONSECUTIVE_PROMPT);
            }
            print(it.next(), sb, prefix, LAST_PROMPT);
        }
    }

    private static final String CONSECUTIVE_PROMPT = "├── ";
    private static final String LAST_PROMPT = "└── ";
    private static final String DASHED_PROMPT = "╎   ";
    private static final String EMPTY_PROMPT = "    ";

    public static void rawCode(Tree tree, IndentPrinter printer) {
        var sb = new StringBuilder();
        var tokenWalker = new Tree.PreOrderWalker() {
            @Override
            public void visitLeaf(Leaf leaf) {
                sb.append(leaf.code);
                sb.append(' ');
            }
        };

        tokenWalker.accept(tree);

        printer.println(sb.toString());
    }

    /**
     * Pretty code formatted according to syntax.
     * 
     * @param tree      
     * @param language
     * @return          The output as a string
     */
    public static String prettyCode(Tree tree, String language) {
        CodeFormatStrategy strategy;
        if (language.equals("JAVA")) {
            strategy = new JavaCodeFormatStrategy();
        } else if (language.equals("C")) {
            strategy = new CCodeFormatStrategy();
        }
        else if (language.equals("C#")) {
            strategy = new CSharpCodeFormatStrategy();
        }
        else {
            throw new IllegalStateException(language + " is not a valid language for me.");
        }

        var sb = new StringBuilder();
        var tokenWalker = new Tree.PreOrderWalker() {
            @Override
            public void visitLeaf(Leaf leaf) {
                sb.append(leaf.code);
                sb.append(' ');
            }
        };
        tokenWalker.accept(tree);

        String code = strategy.apply(sb.toString());
        return code;
    }
}
