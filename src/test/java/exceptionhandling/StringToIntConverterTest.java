package exceptionhandling;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringToIntConverterTest {

    @Test
    public void testValidIntegerString() {
        StringToIntConverter converter = new StringToIntConverter();
        String input = "23";
        int expected = 23;
        try {
            int result = converter.convertStringToInt(input);
            assertEquals(expected, result);
        } catch (NumberFormatException e) {
            fail("Exception thrown for a valid integer string: " + input);
        }
    }

    @Test
    public void testDecimalString() {
        StringToIntConverter converter = new StringToIntConverter();
        String input = "45.67";
        assertThrows(NumberFormatException.class, () -> converter.convertStringToInt(input));
    }

    @Test
    public void testNonNumericString() {
        StringToIntConverter converter = new StringToIntConverter();
        String input = "test";
        assertThrows(NumberFormatException.class, () -> converter.convertStringToInt(input));
    }

    @Test
    public void testAlphaNumericString() {
        StringToIntConverter converter = new StringToIntConverter();
        String input = "123f";
        assertThrows(NumberFormatException.class, () -> converter.convertStringToInt(input));
    }
}

