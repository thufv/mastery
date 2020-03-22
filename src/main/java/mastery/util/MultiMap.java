package mastery.util;

import java.util.*;

public class MultiMap<K, V> {
    private Map<K, List<V>> map;

    public MultiMap() {
        map = new HashMap<>();
    }

    public void put(K key, V value) {
        if (map.containsKey(key)) {
            map.get(key).add(value);
        } else {
            var values = new ArrayList<V>();
            values.add(value);
            map.put(key, values);
        }
    }

    public List<V> get(K key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }

        return Collections.emptyList();
    }

    public Set<K> keySet() {
        return map.keySet();
    }
}
