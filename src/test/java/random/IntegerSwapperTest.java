package random;

import org.junit.Test;
import static org.junit.Assert.*;

public class IntegerSwapperTest {

    IntegerSwapper integerSwapper = new IntegerSwapper();

    @Test
    public void testPositiveValues() {
        int[] arr = {5, 10};
        integerSwapper.swapIntegers(arr);
        assertEquals(10, arr[0]);
        assertEquals(5, arr[1]);
    }

    @Test
    public void testNegativeValues() {
        int[] arr = {-5, -10};
        integerSwapper.swapIntegers(arr);
        assertEquals(-10, arr[0]);
        assertEquals(-5, arr[1]);
    }

    @Test
    public void testZeroValues() {
        int[] arr = {0, 0};
        integerSwapper.swapIntegers(arr);
        assertEquals(0, arr[0]);
        assertEquals(0, arr[1]);
    }
}
