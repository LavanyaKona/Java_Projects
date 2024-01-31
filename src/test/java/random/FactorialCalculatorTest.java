package random;

import org.junit.Test;
import static org.junit.Assert.*;

public class FactorialCalculatorTest {

    FactorialCalculator factorialCalculator = new FactorialCalculator();

    @Test
    public void testPositiveNumber() {
        assertEquals(120, factorialCalculator.calculateFactorial(5));
        assertEquals(1, factorialCalculator.calculateFactorial(1));
        assertEquals(1, factorialCalculator.calculateFactorial(0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNegativeNumber() {
        factorialCalculator.calculateFactorial(-5);
    }

    @Test
    public void testZero() {
        assertEquals(1, factorialCalculator.calculateFactorial(0));
    }
}

