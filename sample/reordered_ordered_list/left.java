
public class A {
    A() {
        int x = 1;
        int y = 1;
        x = x + y;
        y = x + y;
        x = x + x;
        y = y + y;
        x = y + x;
        y = y + x;
    }
}