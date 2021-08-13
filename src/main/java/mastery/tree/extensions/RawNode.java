package mastery.tree.extensions;

import com.github.javaparser.ast.Node;
import com.github.javaparser.ast.visitor.GenericVisitor;
import com.github.javaparser.ast.visitor.VoidVisitor;
import com.github.javaparser.metamodel.JavaParserMetaModel;
import com.github.javaparser.metamodel.SimpleNameMetaModel;

public class RawNode extends Node {
    private final String value;

    public RawNode(String value) {
        super(null);
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public <R, A> R accept(GenericVisitor<R, A> v, A arg) {
        throw new UnsupportedOperationException();
    }

    @Override
    public <A> void accept(VoidVisitor<A> v, A arg) {
        if (v instanceof ConflictPrinterVisitor) {
            ((ConflictPrinterVisitor) v).visitRaw(this);
        } else {
            throw new UnsupportedOperationException();
        }
    }

    /**
     * Only for constructing a conflict node.
     */
    @Override
    public SimpleNameMetaModel getMetaModel() {
        return JavaParserMetaModel.simpleNameMetaModel;
    }
}
