package mastery.util;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.function.Function;

public final class WeightedQueue<E> extends PriorityQueue<E> {
    private Function<E, Integer> weightGetter;

    public WeightedQueue(Function<E, Integer> weightGetter) {
        super(Comparator.comparing(weightGetter::apply).reversed());
        this.weightGetter = weightGetter;
    }

    public int maxWeight() {
        return weightGetter.apply(element());
    }

    public List<E> removeMax() {
        var elems = new ArrayList<E>();
        int weight = maxWeight();
        while (!isEmpty() && maxWeight() == weight) {
            elems.add(remove());
        }
        return elems;
    }
}
