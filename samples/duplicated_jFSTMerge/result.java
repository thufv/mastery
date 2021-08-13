public class Calc {
  public int fib(int n) {
    if (n <= 1)
      return n;
    else
      return fib(n - 1) + fib(n - 2);
  }
  public int doMath(int a, int b) {
    return a + b;
  }
  public int doMath(int a, int b) {
    return a * b;
  }
}
