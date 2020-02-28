package mastery.tree;

import java.util.*;

public class TreeTraverse {
    public static Iterator<Tree> preOrderIterator(Tree root) {
        return new Iterator<>() {
            private Stack<Iterator<Tree>> stack = new Stack<>();

            {
                stack.push(Collections.singletonList(root).iterator());
            }

            @Override
            public boolean hasNext() {
                return !stack.empty();
            }

            @Override
            public Tree next() {
                if (stack.empty()) {
                    throw new NoSuchElementException();
                }

                var it = stack.peek();
                var node = it.next();

                // pop all reach-the-end iterators
                while (!it.hasNext()) {
                    stack.pop();
                    if (stack.empty()) break;
                    it = stack.peek();
                }

                if (!node.children.isEmpty()) {
                    stack.push(node.children.iterator());
                }

                return node;
            }
        };
    }

    public static Iterator<Tree> postOrderIterator(Tree tree) {
        return new Iterator<>() {
            private Queue<Tree> queue = new ArrayDeque<>();

            {
                push(tree);
            }

            @Override
            public boolean hasNext() {
                return !queue.isEmpty();
            }

            @Override
            public Tree next() {
                if (queue.isEmpty()) {
                    throw new NoSuchElementException();
                }

                return queue.remove();
            }

            private void push(Tree node) {
                node.children.forEach(this::push);
                queue.add(node);
            }
        };
    }
}
