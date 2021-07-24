package mastery.tree;

import com.github.javaparser.ast.Node;
import com.github.javaparser.ast.NodeList;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.visitor.Visitable;
import com.github.javaparser.ast.type.WildcardType;
import com.github.javaparser.printer.DefaultPrettyPrinter;
import com.github.javaparser.printer.configuration.DefaultPrinterConfiguration;

import mastery.tree.extensions.ConflictPrinterVisitor;
import mastery.util.Pair;
import mastery.util.log.IndentPrinter;
import mastery.tree.TreeTransformer.RestorationVisitor;

import java.io.*;
import java.util.Arrays;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;

public class TreePrinters {
    public static void textTree(Tree tree, IndentPrinter printer) {
        var textTreePrinter = new Tree.Visitor<String>() {
            private static final String CONSECUTIVE_PROMPT = "├── ";
            private static final String LAST_PROMPT = "└── ";
            private static final String DASHED_PROMPT = "╎   ";
            private static final String EMPTY_PROMPT = "    ";

            private StringBuilder sb = new StringBuilder();

            public String get() {
                return sb.toString();
            }

            @Override
            public void visitLeaf(Leaf leaf, String... ctx) {
                String inherited = ctx[0];
                String prompt = ctx[1];

                sb.append(inherited).append(prompt);
                sb.append(leaf.name).append(" '").append(leaf.code).append("'");
                sb.append(" dfsIndex ").append(leaf.dfsIndex);
                sb.append('\n');
            }

            @Override
            public void visitInternal(InternalNode internal, String... ctx) {
                String inherited = ctx[0];
                String prompt = ctx[1];

                sb.append(inherited).append(prompt);
                sb.append(internal.toString());
                sb.append(" size ").append(internal.size);
                sb.append(" interval [").append(internal.interval.l).append(", ").append(internal.interval.r).append("]");
                sb.append('\n');

                if (!internal.children.isEmpty()) {
                    var prefix = inherited;
                    if (prompt.equals(CONSECUTIVE_PROMPT)) prefix += DASHED_PROMPT;
                    else if (prompt.equals(LAST_PROMPT)) prefix += EMPTY_PROMPT;

                    var it = internal.children.iterator();
                    for (int i = 0; i < internal.children.size() - 1; i++) {
                        it.next().accept(this, prefix, CONSECUTIVE_PROMPT);
                    }
                    it.next().accept(this, prefix, LAST_PROMPT);
                }
            }

            @Override
            public void visitConflict(Conflict conflict, String... ctx) {
                String inherited = ctx[0];
                String prompt = ctx[1];

                sb.append(inherited).append(prompt);
                sb.append("<conflict>");
                sb.append('\n');

                var prefix = inherited;
                if (prompt.equals(CONSECUTIVE_PROMPT)) prefix += DASHED_PROMPT;
                else if (prompt.equals(LAST_PROMPT)) prefix += EMPTY_PROMPT;

                // print left
                sb.append(prefix).append(CONSECUTIVE_PROMPT);
                sb.append("<left>").append('\n');
                if (!conflict.left.isEmpty()) {
                    var prefix1 = prefix + DASHED_PROMPT;
                    var it = conflict.left.iterator();
                    for (int i = 0; i < conflict.left.size() - 1; i++) {
                        it.next().accept(this, prefix1, CONSECUTIVE_PROMPT);
                    }
                    it.next().accept(this, prefix1, LAST_PROMPT);
                }

                // print right
                sb.append(prefix).append(LAST_PROMPT);
                sb.append("<right>").append('\n');
                if (!conflict.right.isEmpty()) {
                    var prefix1 = prefix + EMPTY_PROMPT;
                    var it = conflict.right.iterator();
                    for (int i = 0; i < conflict.right.size() - 1; i++) {
                        it.next().accept(this, prefix1, CONSECUTIVE_PROMPT);
                    }
                    it.next().accept(this, prefix1, LAST_PROMPT);
                }
            }
        };

        tree.accept(textTreePrinter, "", "");
        printer.println(textTreePrinter.get());
    }

    // for unit test
    public static void rawTree(Tree tree, IndentPrinter printer) {
        var textTreePrinter = new Tree.Visitor<String>() {
            private static final String CONSECUTIVE_PROMPT = "├── ";
            private static final String LAST_PROMPT = "└── ";
            private static final String DASHED_PROMPT = "╎   ";
            private static final String EMPTY_PROMPT = "    ";

            private StringBuilder sb = new StringBuilder();

            public String get() {
                return sb.toString();
            }

            @Override
            public void visitLeaf(Leaf leaf, String... ctx) {
                String inherited = ctx[0];
                String prompt = ctx[1];

                sb.append(inherited).append(prompt);
                sb.append(leaf.name).append(" '").append(leaf.code).append("'");
                sb.append('\n');
            }

            @Override
            public void visitInternal(InternalNode internal, String... ctx) {
                String inherited = ctx[0];
                String prompt = ctx[1];

                sb.append(inherited).append(prompt);
                sb.append(internal.toString());
                sb.append('\n');

                if (!internal.children.isEmpty()) {
                    var prefix = inherited;
                    if (prompt.equals(CONSECUTIVE_PROMPT)) prefix += DASHED_PROMPT;
                    else if (prompt.equals(LAST_PROMPT)) prefix += EMPTY_PROMPT;

                    var it = internal.children.iterator();
                    for (int i = 0; i < internal.children.size() - 1; i++) {
                        it.next().accept(this, prefix, CONSECUTIVE_PROMPT);
                    }
                    it.next().accept(this, prefix, LAST_PROMPT);
                }
            }

            @Override
            public void visitConflict(Conflict conflict, String... ctx) {
                String inherited = ctx[0];
                String prompt = ctx[1];

                sb.append(inherited).append(prompt);
                sb.append("<conflict>");
                sb.append('\n');

                var prefix = inherited;
                if (prompt.equals(CONSECUTIVE_PROMPT)) prefix += DASHED_PROMPT;
                else if (prompt.equals(LAST_PROMPT)) prefix += EMPTY_PROMPT;

                // print left
                sb.append(prefix).append(CONSECUTIVE_PROMPT);
                sb.append("<left>").append('\n');
                if (!conflict.left.isEmpty()) {
                    var prefix1 = prefix + DASHED_PROMPT;
                    var it = conflict.left.iterator();
                    for (int i = 0; i < conflict.left.size() - 1; i++) {
                        it.next().accept(this, prefix1, CONSECUTIVE_PROMPT);
                    }
                    it.next().accept(this, prefix1, LAST_PROMPT);
                }

                // print right
                sb.append(prefix).append(LAST_PROMPT);
                sb.append("<right>").append('\n');
                if (!conflict.right.isEmpty()) {
                    var prefix1 = prefix + EMPTY_PROMPT;
                    var it = conflict.right.iterator();
                    for (int i = 0; i < conflict.right.size() - 1; i++) {
                        it.next().accept(this, prefix1, CONSECUTIVE_PROMPT);
                    }
                    it.next().accept(this, prefix1, LAST_PROMPT);
                }
            }
        };

        tree.accept(textTreePrinter, "", "");
        printer.println(textTreePrinter.get());
    }

    @SuppressWarnings("unchecked")
    public static String rawCode(Tree tree) {
        String s;
        if (tree instanceof Leaf) {
            s = ((Leaf)tree).code;
        } else {
            // For child, the "type" passed could actually be anyone.
            // Here we choose WildcardType, a rare one, as placeholder.
            Visitable result = tree.accept(new RestorationVisitor(), WildcardType.class);
            assert result instanceof Node || result instanceof NodeList;
            if (result instanceof Node) s = ((Node) result).toString();
            else {
                assert result instanceof NodeList;
                s = ((NodeList<Node>) result).toString();
            }
        }
        return StringUtils.normalizeSpace(s);
    }

    /**
     * Pretty code formatted according to syntax.
     * Require the argument tree is the entire source code.
     *
     * @return The output as a string
     */
    public static String prettyCode(Tree tree, String formatter, String language, String leftFile, String rightFile) {
        CompilationUnit cu = (CompilationUnit) TreeTransformer.restore(tree);
        cu.printer(new DefaultPrettyPrinter(
            config -> new ConflictPrinterVisitor(config, Pair.of(leftFile, rightFile)),
            new DefaultPrinterConfiguration()
        ));
        String rawCode = cu.toString();
        StringBuilder formattedCode = new StringBuilder();

        if (formatter == null) {
            formattedCode = new StringBuilder(rawCode);
        } else {
            try {
                // Use clang-format
                ProcessBuilder pb = new ProcessBuilder(Arrays.asList(formatter, "-assume-filename=" + "output." + fileExtension.get(language), "-style=Google"));
                Process p = pb.start();

                OutputStream os = p.getOutputStream();
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(os));
                bw.append(rawCode);
                bw.flush();
                bw.close();

                InputStream is = p.getInputStream();
                BufferedReader br = new BufferedReader(new InputStreamReader(is));
                String line;
                while ((line = br.readLine()) != null)
                    formattedCode.append(line).append("\n");
                br.close();
                int r = p.waitFor(); // Let the process finish.
                assert (r == 0);
            } catch (Exception e) {
                System.out.println("An error occurs when formatting.");
                e.printStackTrace();
            }
        }

        return formattedCode.toString();
    }
    public static Map<String, String> fileExtension = Map.of(
        "JAVA", "java",
        "C#", "cs",
        "C", "c"
    );
}
