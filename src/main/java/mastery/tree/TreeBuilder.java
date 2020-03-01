package mastery.tree;

import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.misc.Pair;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import mastery.translator.ParsingStrategy;
import mastery.translator.TreeGenerator;
import mastery.translator.c.CParsingStrategy;
import mastery.translator.cs.CSharpParsingStrategy;
import mastery.translator.java.JavaParsingStrategy;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public final class TreeBuilder {
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
                return leaf == origin ? update : leaf;
            }

            @Override
            public Tree visitConstructor(Constructor constructor) {
                var updated = new ArrayList<Tree>();
                for (var child : constructor.children) {
                    updated.add(child.accept(this));
                }
                return new Constructor(constructor.label, constructor.name, updated);
            }

            @Override
            public Tree visitOrderedList(OrderedList ordered) {
                var updated = new ArrayList<Tree>();
                for (var child : ordered.children) {
                    updated.add(child.accept(this));
                }
                return new OrderedList(ordered.label, ordered.name, updated);
            }

            @Override
            public Tree visitUnorderedList(UnorderedList unordered) {
                var updated = new ArrayList<Tree>();
                for (var child : unordered.children) {
                    updated.add(child.accept(this));
                }
                return new UnorderedList(unordered.label, unordered.name, updated);
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
        ParsingStrategy strategy;
        if (language == "JAVA") {
            strategy = new JavaParsingStrategy();
        }
        else if (language == "C") {
            strategy = new CParsingStrategy();
        }
        else if (language == "C#") {
            strategy = new CSharpParsingStrategy();
        }
        else {
            throw new IllegalStateException("Why I don't know the language?");
        }

        Pair<Parser, ParserRuleContext> p = strategy.apply(srcFile);
        TreeGenerator generator = new TreeGenerator(p.a, p.b, strategy.getListNodeNames(), strategy.getOrderedListNodeNames(), strategy.getAlternativeLabels());
        
        Tree tree = generator.generate();
        return tree;
    }
}
