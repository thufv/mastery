package mastery.merger;

import mastery.tree.*;

public abstract class MergeScenario {
    public static MergeScenario of(Leaf base, Leaf left, Leaf right) {
        return new Leaves(base, left, right);
    }

    public static MergeScenario of(Constructor base, Constructor left, Constructor right) {
        return new Constructors(base, left, right);
    }

    public static MergeScenario of(OrderedList base, OrderedList left, OrderedList right) {
        return new OrderedLists(base, left, right);
    }

    public static MergeScenario of(UnorderedList base, UnorderedList left, UnorderedList right) {
        return new UnorderedLists(base, left, right);
    }

    public abstract Tree getBase();

    public abstract Tree getLeft();

    public abstract Tree getRight();

    public abstract <T> T accept(Visitor<T> visitor);

    public interface Visitor<T> {
        T visitLeaves(Leaf base, Leaf left, Leaf right);

        T visitConstructors(Constructor base, Constructor left, Constructor right);

        T visitOrderedLists(OrderedList base, OrderedList left, OrderedList right);

        T visitUnorderedLists(UnorderedList base, UnorderedList left, UnorderedList right);
    }

    private static class Leaves extends MergeScenario {
        private final Leaf base;
        private final Leaf left;
        private final Leaf right;

        private Leaves(Leaf base, Leaf left, Leaf right) {
            this.base = base;
            this.left = left;
            this.right = right;
        }

        @Override
        public final Tree getBase() {
            return base;
        }

        @Override
        public final Tree getLeft() {
            return left;
        }

        @Override
        public final Tree getRight() {
            return right;
        }

        @Override
        public <T> T accept(Visitor<T> visitor) {
            return visitor.visitLeaves(base, left, right);
        }
    }

    private static class Constructors extends MergeScenario {
        private final Constructor base;
        private final Constructor left;
        private final Constructor right;

        private Constructors(Constructor base, Constructor left, Constructor right) {
            this.base = base;
            this.left = left;
            this.right = right;
        }

        @Override
        public final Tree getBase() {
            return base;
        }

        @Override
        public final Tree getLeft() {
            return left;
        }

        @Override
        public final Tree getRight() {
            return right;
        }

        @Override
        public <T> T accept(Visitor<T> visitor) {
            return visitor.visitConstructors(base, left, right);
        }
    }

    private static class OrderedLists extends MergeScenario {
        private final OrderedList base;
        private final OrderedList left;
        private final OrderedList right;

        private OrderedLists(OrderedList base, OrderedList left, OrderedList right) {
            this.base = base;
            this.left = left;
            this.right = right;
        }

        @Override
        public final Tree getBase() {
            return base;
        }

        @Override
        public final Tree getLeft() {
            return left;
        }

        @Override
        public final Tree getRight() {
            return right;
        }

        @Override
        public <T> T accept(Visitor<T> visitor) {
            return visitor.visitOrderedLists(base, left, right);
        }
    }

    private static class UnorderedLists extends MergeScenario {
        private final UnorderedList base;
        private final UnorderedList left;
        private final UnorderedList right;

        private UnorderedLists(UnorderedList base, UnorderedList left, UnorderedList right) {
            this.base = base;
            this.left = left;
            this.right = right;
        }

        @Override
        public final Tree getBase() {
            return base;
        }

        @Override
        public final Tree getLeft() {
            return left;
        }

        @Override
        public final Tree getRight() {
            return right;
        }

        @Override
        public <T> T accept(Visitor<T> visitor) {
            return visitor.visitUnorderedLists(base, left, right);
        }
    }
}
