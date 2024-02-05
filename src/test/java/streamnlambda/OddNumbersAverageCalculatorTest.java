package streamnlambda;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class OddNumbersAverageCalculatorTest {

    @Test
    public void testPositiveNumbers() {
        int[] numbers = {1, 2, 3, 4, 5};
        double expected = (1*1 + 3*3 + 5*5) / 3.0;
        double result = OddNumbersAverageCalculator.calculateAverageOfOddSquares(numbers);
        assertEquals(expected, result);
    }

    @Test
    public void testNegativeNumbers() {
        int[] numbers = {-3, -2, -1, 0, 1, 2, 3};
        double expected = (-3*-3 + -1*-1 + 1*1 + 3*3) / 4.0;
        double result = OddNumbersAverageCalculator.calculateAverageOfOddSquares(numbers);
        assertEquals(expected, result);
    }

    @Test
    public void testZeroNumbers() {
        int[] numbers = {0, 0, 0};
        double result = OddNumbersAverageCalculator.calculateAverageOfOddSquares(numbers);
        assertEquals(0, result);
    }

    @Test
    public void testNullInput() {
        int[] numbers = null;
        assertThrows(IllegalArgumentException.class, () -> {
            OddNumbersAverageCalculator.calculateAverageOfOddSquares(numbers);
        });
    }
}

