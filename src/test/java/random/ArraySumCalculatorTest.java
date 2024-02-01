package random;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ArraySumCalculatorTest {

    @Test
    public void testCalculateArraySum_Positive() {
        int[] array = {1, 2, 3, 4, 5};

        int sum = ArraySumCalculator.calculateArraySum(array);

        assertEquals(15, sum);
    }

    @Test
    public void testCalculateArraySum_Negative() {
        int[] array = {-1, -2, -3, -4, -5};

        int sum = ArraySumCalculator.calculateArraySum(array);

        assertEquals(-15, sum);
    }

    @Test
    public void testCalculateArraySum_Zero() {
        int[] array = {0, 0, 0, 0, 0};

        int sum = ArraySumCalculator.calculateArraySum(array);

        assertEquals(0, sum);
    }

    @Test
    public void testCalculateArraySum_Null() {
        assertThrows(IllegalArgumentException.class, () -> {
            ArraySumCalculator.calculateArraySum(null);
        });
    }
}
