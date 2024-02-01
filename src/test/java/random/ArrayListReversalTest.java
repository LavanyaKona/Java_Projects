package random;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;

public class ArrayListReversalTest {

    @Test
    public void testReverseArrayList_Positive() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        ArrayList<Integer> reversedList = ArrayListReversal.reverseArrayList(list);

        assertEquals(3, reversedList.get(0));
        assertEquals(2, reversedList.get(1));
        assertEquals(1, reversedList.get(2));
    }

    @Test
    public void testReverseArrayList_Negative() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(-1);
        list.add(-2);
        list.add(-3);

        ArrayList<Integer> reversedList = ArrayListReversal.reverseArrayList(list);

        assertEquals(-3, reversedList.get(0));
        assertEquals(-2, reversedList.get(1));
        assertEquals(-1, reversedList.get(2));
    }

    @Test
    public void testReverseArrayList_Zero() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);

        ArrayList<Integer> reversedList = ArrayListReversal.reverseArrayList(list);

        assertEquals(0, reversedList.get(0));
    }

    @Test
    public void testReverseArrayList_Null() {
        assertThrows(IllegalArgumentException.class, () -> {
            ArrayListReversal.reverseArrayList(null);
        });
    }
}

