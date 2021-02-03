public class Example {
  public static long fib(int n) {
    if (n <= 1)
      return n;
    else
      return fib(n - 1) + fib(n - 2);
  }
  public static long fac(int n) {
    long result = 1; 
<<<<<<< sample/independent_development_JDime/left.java
    for (int i = 1; i <= n; i++)
      result *= i; 
=======
    if (n > 1)
      for (int i = 2; i <= n; i++)
        result *= i; 
>>>>>>> sample/independent_development_JDime/right.java
    return result;
  }
  public static int square(int n) { return n * n; }
}
