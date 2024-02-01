package random;

import java.util.HashMap;
import java.util.TreeMap;

public class HashMapSorter {

    public static TreeMap<Integer, String> sortHashMap(HashMap<Integer, String> hashMap) {
        if (hashMap == null) {
            throw new IllegalArgumentException("HashMap cannot be null");
        }

        TreeMap<Integer, String> sortedMap = new TreeMap<>(hashMap);
        return sortedMap;
    }
}

