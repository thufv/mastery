import java.io.Flushable;
import java.io.Serializable;
import java.util.LinkedList;

public class Stack<T> implements Cloneable<>, Flushable<>, Serializable<> {
  public void flush() {}

  private static final long serialVersionUID = 42;
}
