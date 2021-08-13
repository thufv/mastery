public class Skinchanger {
    int f(int x, boolean b) {
        while (x < 10)
            if (b) x += 2;
            else x += 1;
        return x;
    }
}