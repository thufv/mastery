package mastery.tree;

import java.util.*;

public class TraverseUtil {
    public static Iterator<Node> preOrderIterator(Node tree) {
        return new Iterator<>() {
            private Stack<Iterator<Node>> stack = new Stack<>();

            {
                stack.push(Collections.singletonList(tree).iterator());
            }

            @Override
            public boolean hasNext() {
                return !stack.empty();
            }

            @Override
            public Node next() {
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

    public static Iterator<Node> postOrderIterator(Node tree) {
        return new Iterator<>() {
            private Queue<Node> queue = new ArrayDeque<>();

            {
                push(tree);
            }

            @Override
            public boolean hasNext() {
                return !queue.isEmpty();
            }

            @Override
            public Node next() {
                if (queue.isEmpty()) {
                    throw new NoSuchElementException();
                }

                return queue.remove();
            }

            private void push(Node node) {
                node.children.forEach(this::push);
                queue.add(node);
            }
        };
    }
}
