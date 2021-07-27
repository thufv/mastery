package mastery.tree;

import com.github.javaparser.StaticJavaParser;
import com.github.javaparser.ast.CompilationUnit;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import mastery.driver.Config.ParserConfig;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

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
        return tree.accept(new Tree.RichVisitor<>() {
            @Override
            public Tree visitLeaf(Leaf leaf) {
                return leaf == origin ? update : leaf.deepCopy();
            }

            @Override
            public Tree visitConstructor(Constructor constructor) {
                if (constructor == origin) {
                    return update;
                } else {
                    var updated = new ArrayList<Tree>();
                    for (var child : constructor.children) {
                        updated.add(child.accept(this));
                    }
                    return new Constructor(constructor, updated);
                }
            }

            @Override
            public Tree visitOrderedList(OrderedList ordered) {
                if (ordered == origin) {
                    return update;
                } else {
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
                } else {
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
     */
    public static Tree fromSource(String srcFile, ParserConfig config) throws IOException {
        String code = Files.readString(Paths.get(srcFile));
        CompilationUnit cu = StaticJavaParser.parse(code);
        return new TreeTransformer(config).generate(cu);
    }
}
