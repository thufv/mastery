package mastery.util;

public class Pair<T, U> {
    public T first;
    public U second;

    protected Pair(T first, U second) {
        this.first = first;
        this.second = second;
    }

    public static <T, U> Pair<T, U> of(T first, U second) {
        return new Pair<>(first, second);
    }
}
