package mastery.tree;

import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.Node;
import com.github.javaparser.ast.NodeList;
import com.github.javaparser.ast.visitor.Visitable;
import com.github.javaparser.printer.DefaultPrettyPrinter;
import com.github.javaparser.printer.configuration.DefaultPrinterConfiguration;
import mastery.tree.extensions.ConflictPrinterVisitor;
import mastery.util.Pair;
import mastery.util.log.IndentPrinter;
import org.apache.commons.lang3.StringUtils;

import java.io.*;
import java.util.Arrays;

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
                // sb.append(" dfsIndex ").append(leaf.dfsIndex);
                sb.append('\n');
            }

            @Override
            public void visitInternal(InternalNode internal, String... ctx) {
                String inherited = ctx[0];
                String prompt = ctx[1];

                sb.append(inherited).append(prompt);
                sb.append(internal.toString());
                // sb.append(" size ").append(internal.size);
                // sb.append(" interval [").append(internal.interval.l).append(", ").append(internal.interval.r).append("]");
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

    public static String rawCode(Tree tree) {
        return StringUtils.normalizeSpace(prettyCode(tree, "", ""));
    }

    public static String prettyCode(Tree tree, String leftFile, String rightFile) {
        Visitable node = TreeTransformer.restore(tree);
        CompilationUnit cu;
        if (node instanceof CompilationUnit) {
            cu = (CompilationUnit) node;
        } else {
            cu = new CompilationUnit();
            if (node instanceof Node) {
                ((Node) node).setParentNode(cu);
            } else if (node instanceof NodeList) {
                ((NodeList<?>) node).setParentNode(cu);
            } else {
                throw new IllegalStateException();
            }
        }
        cu.printer(new DefaultPrettyPrinter(
            config -> new ConflictPrinterVisitor(config, Pair.of(leftFile, rightFile)),
            new DefaultPrinterConfiguration()
        ));
        return node.toString();
    }

    public static String prettyCode(Tree tree, String leftFile, String rightFile, String formatter) {
        String code = prettyCode(tree, leftFile, rightFile);
        if (formatter == null) {
            return code;
        }

        StringBuilder formattedCode = new StringBuilder();
        try {
            // Use clang-format
            ProcessBuilder pb = new ProcessBuilder(Arrays.asList("clang-format", "-assume-filename=output.java", "-style=Google"));
            Process p = pb.start();

            OutputStream os = p.getOutputStream();
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(os));
            bw.append(code);
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
        return formattedCode.toString();
    }

    public static String prettyCode(Tree tree, String leftFile, String rightFile, String formatter, String language) {
        assert language.equals("JAVA");
        return prettyCode(tree, leftFile, rightFile, formatter);
    }
}
