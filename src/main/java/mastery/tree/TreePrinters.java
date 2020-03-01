package mastery.tree;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

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
     * @param formatter
     * @return          The output as a string
     */
    public static String prettyCode(Tree tree, String formatter) {
        var sb = new StringBuilder();
        var tokenWalker = new Tree.PreOrderWalker() {
        @Override
        public void visitLeaf(Leaf leaf) {
            sb.append(leaf.code);
            sb.append(' ');
        }
        @Override
        public void visitConflict(Conflict conflict) {
            sb.append("\n");
        }
        };
        tokenWalker.accept(tree);
        String rawCode = sb.toString();
        String formattedCode = "";

        if (formatter == null) {
            formattedCode = rawCode;
        }
        else {
            try {
                // Use clang-format
                ProcessBuilder pb = new ProcessBuilder(formatter);
                Process p = pb.start();

                OutputStream os = p.getOutputStream();
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(os));
                bw.append(rawCode);
                bw.flush();
                bw.close();

                InputStream is = p.getInputStream();
                BufferedReader br = new BufferedReader(new InputStreamReader(is));
                String line = null;
                while ((line = br.readLine()) != null) {
                    formattedCode += line + "\n";
                }
                br.close();
                int r = p.waitFor(); // Let the process finish.
                assert (r == 0);
            } catch (Exception e) {
                System.out.println("An error occurs when formatting.");
                e.printStackTrace();
            }
        }

        return formattedCode;
    }
}
