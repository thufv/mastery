package mastery.tree;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.dom.AST;
import org.eclipse.jdt.core.dom.ASTNode;
import org.eclipse.jdt.core.dom.ASTParser;
import org.eclipse.jdt.core.dom.CompilationUnit;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Map;

public final class TreeBuilders {
    /**
     * Build a tree from JSON.
     *
     * @param file JSON file name
     * @return the tree
     */
    public static Tree fromJSON(String file) throws FileNotFoundException {
        FileReader reader = new FileReader(file);
        var object = JsonParser.parseReader(reader).getAsJsonObject();
        return fromJSONObject(object);
    }

    /**
     * Build a tree from a JSON object.
     *
     * @param object JSON object
     * @return the tree
     */
    public static Tree fromJSONObject(JsonObject object) {
        int label = object.get("label").getAsInt();
        String name = object.get("name").getAsString();
        String kind = object.get("kind").getAsString();
        if (kind.equals("leaf")) {
            return new Leaf(label, name, object.get("code").getAsString());
        }

        var children = new ArrayList<Tree>();
        for (var o : object.get("children").getAsJsonArray()) {
            children.add(fromJSONObject(o.getAsJsonObject()));
        }

        if (kind.equals("node")) {
            return new Constructor(label, name, children);
        }

        if (kind.equals("orderedlist")) {
            return new OrderedList(label, name, children);
        }

        if (kind.equals("unorderedlist")) {
            return new UnorderedList(label, name, children);
        }

        throw new IllegalStateException("unknown kind in JSON: " + kind);
    }

    /**
     * Update a tree by replacing `origin` with `update`.
     *
     * @param tree   old tree
     * @param origin node to be replaced
     * @param update replacer
     * @return updated tree
     */
    public static Tree fromUpdate(Tree tree, Tree origin, Tree update) {
        return tree.accept(new Tree.RichVisitor<Tree>() {
            @Override
            public Tree visitLeaf(Leaf leaf) {
                return leaf == origin ? update : leaf.deepCopy();
            }

            @Override
            public Tree visitConstructor(Constructor constructor) {
                if (constructor == origin) {
                    return update;
                }
                else {
                    var updated = new ArrayList<Tree>();
                    for (var child : constructor.children) {
                        updated.add(child.accept(this));
                    }
                    return new Constructor(constructor.label, constructor.name, updated);
                }
            }

            @Override
            public Tree visitOrderedList(OrderedList ordered) {
                if (ordered == origin) {
                    return update;
                }
                else {
                    var updated = new ArrayList<Tree>();
                    for (var child : ordered.children) {
                        updated.add(child.accept(this));
                    }
                    return new OrderedList(ordered.label, ordered.name, updated);
                }
            }

            @Override
            public Tree visitUnorderedList(UnorderedList unordered) {
                if (unordered == origin) {
                    return update;
                }
                else {
                    var updated = new ArrayList<Tree>();
                    for (var child : unordered.children) {
                        updated.add(child.accept(this));
                    }
                    return new UnorderedList(unordered.label, unordered.name, updated);
                }
            }

            @Override
            public Tree visitConflict(Conflict conflict) {
                return conflict;
            }
        });
    }

    /**
     * Build a tree from source file.
     *
     * @param srcFile
     * @param language
     * @return the tree
     */
    public static Tree fromSource(String srcFile, String language) throws IOException {
        if (!language.equals("JAVA")) {
            throw new UnsupportedOperationException("Language other than Java is not supported.");
        }

        ASTParser parser = ASTParser.newParser(AST.JLS_Latest);
        parser.setKind(ASTParser.K_COMPILATION_UNIT);

        Map<String, String> pOptions = JavaCore.getOptions();
        pOptions.put(JavaCore.COMPILER_COMPLIANCE, JavaCore.VERSION_1_8);
        pOptions.put(JavaCore.COMPILER_CODEGEN_TARGET_PLATFORM, JavaCore.VERSION_1_8);
        pOptions.put(JavaCore.COMPILER_SOURCE, JavaCore.VERSION_1_8);
        pOptions.put(JavaCore.COMPILER_DOC_COMMENT_SUPPORT, JavaCore.ENABLED);
        parser.setCompilerOptions(pOptions);

        String sourceCode = Files.readString(Paths.get(srcFile));
        parser.setSource(sourceCode.toCharArray());
        CompilationUnit root = (CompilationUnit) parser.createAST(null);
        if ((root.getFlags() & ASTNode.MALFORMED) != 0) {
            throw new IllegalStateException("Syntax Error");
        }

        TreeTransformer transformer = new TreeTransformer(sourceCode);
        return transformer.generate(root);
    }
}
