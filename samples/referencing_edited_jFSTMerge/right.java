public class Calc {
    public int doMath(int a, int b)
    {
        return a + b;
    }
    public int composed(int a, int b)
    {
        return doMath(a, b) * 6;
    }
}