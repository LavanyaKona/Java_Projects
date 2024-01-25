package collections;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
public class RemoveLastObjectTest {

    @Test
    public void testRemoveLastPositive() {
        ArrayList<String> list = new ArrayList<>();
        list.add("Item1");
        list.add("Item2");
        list.add("Item3");

        int initialSize = list.size();
        RemoveLastObject.removeLast(list);

        assertEquals(initialSize - 1, list.size());
        assertFalse(list.contains("Item3"));
    }

    @Test
    public void testRemoveLastNegative() {
        ArrayList<String> list = new ArrayList<>();

        int initialSize = list.size();
        RemoveLastObject.removeLast(list);

        assertEquals(initialSize, list.size());
    }

    @Test
    public void testRemoveLastZero() {
        ArrayList<String> list = new ArrayList<>();

        int initialSize = list.size();
        RemoveLastObject.removeLast(list);

        assertEquals(initialSize, list.size());
    }
}
