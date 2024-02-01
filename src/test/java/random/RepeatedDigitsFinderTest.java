package random;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class RepeatedDigitsFinderTest {

    private final RepeatedDigitsFinder digitsFinder = new RepeatedDigitsFinder();

    @Test
    public void testPositiveResponse() {
        List<Integer> repeatedDigits = digitsFinder.findRepeatedDigits(1122334455);
        assertEquals(5, repeatedDigits.size());
    }

    @Test
    public void testNegativeResponse() {
        List<Integer> repeatedDigits = digitsFinder.findRepeatedDigits(-123456);
        assertTrue(repeatedDigits.isEmpty());
    }

    @Test
    public void testZeroResponse() {
        List<Integer> repeatedDigits = digitsFinder.findRepeatedDigits(0);
        assertTrue(repeatedDigits.isEmpty());
    }

    @Test
    public void testNullResponse() {
        List<Integer> repeatedDigits = digitsFinder.findRepeatedDigits(0);
        assertTrue(repeatedDigits.isEmpty());
    }
}