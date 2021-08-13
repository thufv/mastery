import java.util.LinkedList;
public class Stack<T> implements Cloneable {
  private LinkedList<T> items = new LinkedList<T>();
  public void push(T item) {
    items.addFirst(item);
  }
  public T pop() {
    if (items.size() > 0)
      return items.removeFirst();
    else
      return null;
  }
  public int size() {
    return items.size();
  }
  public T top() {
    return items.getFirst();
  }
}
