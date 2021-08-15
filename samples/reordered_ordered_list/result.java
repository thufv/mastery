public class A {
  A() {
    int y = 1;
    int x = 1;
    x = x + y;
    y = x + y;
    x = x + x;
    y = y + y;
    x = y + x;
    y = y + x;
  }
}
