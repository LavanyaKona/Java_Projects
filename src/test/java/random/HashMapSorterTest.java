package random;

import org.junit.jupiter.api.Test;
import java.util.HashMap;
import java.util.TreeMap;
import static org.junit.jupiter.api.Assertions.*;

public class HashMapSorterTest {

    @Test
    public void testSortHashMap_Positive() {
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "One");
        hashMap.put(2, "Two");
        hashMap.put(3, "Three");

        TreeMap<Integer, String> sortedMap = HashMapSorter.sortHashMap(hashMap);

        assertEquals("One", sortedMap.get(1));
        assertEquals("Two", sortedMap.get(2));
        assertEquals("Three", sortedMap.get(3));
    }

    @Test
    public void testSortHashMap_Negative() {
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(-1, "Minus One");
        hashMap.put(-2, "Minus Two");
        hashMap.put(-3, "Minus Three");

        TreeMap<Integer, String> sortedMap = HashMapSorter.sortHashMap(hashMap);

        assertEquals("Minus One", sortedMap.get(-1));
        assertEquals("Minus Two", sortedMap.get(-2));
        assertEquals("Minus Three", sortedMap.get(-3));
    }

    @Test
    public void testSortHashMap_Zero() {
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(0, "Zero");

        TreeMap<Integer, String> sortedMap = HashMapSorter.sortHashMap(hashMap);

        assertEquals("Zero", sortedMap.get(0));
    }

    @Test
    public void testSortHashMap_Null() {
        assertThrows(IllegalArgumentException.class, () -> {
            HashMapSorter.sortHashMap(null);
        });
    }
}

