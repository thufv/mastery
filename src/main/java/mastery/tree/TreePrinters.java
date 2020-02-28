package mastery.tree;

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
                sb.append(leaf.value);
                sb.append(' ');
            }
        };

        tokenWalker.accept(tree);
        printer.println(sb.toString());
    }
}
