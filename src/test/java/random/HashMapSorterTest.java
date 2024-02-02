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
        hashMap.put(3, "Three");
        hashMap.put(2, "Two");

        TreeMap<Integer, String> sortedMap = HashMapSorter.sortHashMap(hashMap);

        TreeMap<Integer, String> expectedSortedMap = new TreeMap<>();
        expectedSortedMap.put(1, "One");
        expectedSortedMap.put(2, "Two");
        expectedSortedMap.put(3, "Three");

        assertEquals(expectedSortedMap, sortedMap);
    }

    @Test
    public void testSortHashMap_Negative() {
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(-1, "Minus One");
        hashMap.put(-2, "Minus Two");
        hashMap.put(-3, "Minus Three");

        TreeMap<Integer, String> sortedMap = HashMapSorter.sortHashMap(hashMap);

        TreeMap<Integer, String> expectedSortedMap = new TreeMap<>();
        expectedSortedMap.put(-3, "Minus Three");
        expectedSortedMap.put(-2, "Minus Two");
        expectedSortedMap.put(-1, "Minus One");

        assertEquals(expectedSortedMap, sortedMap);
    }

    @Test
    public void testSortHashMap_Zero() {
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(0, "Zero");

        TreeMap<Integer, String> sortedMap = HashMapSorter.sortHashMap(hashMap);

        TreeMap<Integer, String> expectedSortedMap = new TreeMap<>();
        expectedSortedMap.put(0, "Zero");

        assertEquals(expectedSortedMap, sortedMap);
    }

    @Test
    public void testSortHashMap_Null() {
        assertThrows(IllegalArgumentException.class, () -> {
            HashMapSorter.sortHashMap(null);
        });
    }
}
