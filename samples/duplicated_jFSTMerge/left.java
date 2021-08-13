public class Calc {
    
    public int doMath(int a, int b)
    {
        return a + b;
    }
    
    public int fib(int n)
    {
        if (n <= 1) return n;
        else return fib(n - 1) + fib(n - 2);
    }
}