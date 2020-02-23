package mastery.merge;

import mastery.tree.*;
import mastery.util.log.Log;

public class Dispatcher implements IMerge<Node> {
    @Override
    public Node apply(Node base, Node left, Node right) {
        base.merged = true;
        left.merged = true;
        right.merged = true;
        Log.finer("merge (%s, %s, %s)", base, left, right);

        if (left.treeHash == base.treeHash) { // Trivial case 1: base = left
            Log.finest("trivial: base = left, thus target = right");
            return right;
        }

        if (right.treeHash == base.treeHash) { // Trivial case 2: base = right
            Log.finest("trivial: base = right, thus target = left");
            return left;
        }

        if (left.treeHash == right.treeHash) { // Trivial case 3: left = right
            Log.finest("trivial: left = right, thus target = left = right");
            return left;
        }

        if (base.isConstructor() && left.isConstructor() && right.isConstructor() &&
                base.label == left.label && base.label == right.label) { // Recursive case 1: constructor
            return new ConstructorMerge().apply((Constructor) base, (Constructor) left, (Constructor) right);
        }

        if (base.isOrderedList() && left.isOrderedList() && right.isOrderedList() &&
                base.label == left.label && base.label == right.label) { // Recursive case 2: ordered list
            return new OrderedMerge().apply((OrderedList) base, (OrderedList) left, (OrderedList) right);
        }

        if (base.isUnorderedList() && left.isUnorderedList() && right.isUnorderedList() &&
                base.label == left.label && base.label == right.label) { // Recursive case 3: unordered list
            return new UnorderedMerge().apply((UnorderedList) base, (UnorderedList) left, (UnorderedList) right);
        }

        // Case 4: conflicting changes
        return new ConflictingNode(base, left, right);
    }
}
