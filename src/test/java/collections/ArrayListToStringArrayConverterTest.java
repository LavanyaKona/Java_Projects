package collections;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.*;

public class ArrayListToStringArrayConverterTest {

    @Test
    public void testConvertToStringArrayPositive() {
        List<String> stringList = new ArrayList<>(Arrays.asList("one", "two", "three"));
        String[] resultArray = ArrayListToStringArrayConverter.convertToStringArray(stringList);

        assertArrayEquals(new String[]{"one", "two", "three"}, resultArray);
    }

    @Test(expected = NullPointerException.class)
    public void testConvertToStringArrayNegative() {
        ArrayListToStringArrayConverter.convertToStringArray(null);
    }

    @Test
    public void testConvertToStringArrayZero() {
        List<String> emptyList = new ArrayList<>();
        String[] resultArray = ArrayListToStringArrayConverter.convertToStringArray(emptyList);

        assertEquals(0, resultArray.length);
    }

    @Test(expected = NullPointerException.class)
    public void testConvertToStringArrayNull() {
        ArrayListToStringArrayConverter.convertToStringArray(null);
    }
}
