package mastery.merge;

import mastery.tree.Constructor;
import mastery.tree.Node;
import mastery.util.log.Log;

import java.util.ArrayList;

public class ConstructorMerge implements IMerge<Constructor> {
    @Override
    public Constructor apply(Constructor base, Constructor left, Constructor right) {
        Log.finest("constructor: %s", base.name);

        var targets = new ArrayList<Node>();
        for (int i = 0; i < base.arity; i++) {
            var b = base.children.get(i);
            var l = left.children.get(i);
            var r = right.children.get(i);
            if (b.matched && b.leftMatch == l && b.rightMatch == r) {
                targets.add(new Dispatcher().apply(b, l, r));
            } else assert false; // don't know how to do
        }

        return new Constructor(base.label, base.name, targets);
    }
}
