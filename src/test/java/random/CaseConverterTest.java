package random;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CaseConverterTest {

    @Test
    public void testConvertCase_Positive() {
        String input = "Hello World";
        String expectedOutput = "hELLO wORLD";

        String result = CaseConverter.convertCase(input);

        assertEquals(expectedOutput, result);
    }

    @Test
    public void testConvertCase_Negative() {
        String input = "tHIS iS a tEST sTRING";
        String expectedOutput = "This Is A Test String";

        String result = CaseConverter.convertCase(input);

        assertEquals(expectedOutput, result);
    }

    @Test
    public void testConvertCase_Zero() {
        String input = "";
        String expectedOutput = "";

        String result = CaseConverter.convertCase(input);

        assertEquals(expectedOutput, result);
    }

    @Test
    public void testConvertCase_Null() {
        assertThrows(IllegalArgumentException.class, () -> {
            CaseConverter.convertCase(null);
        });
    }
}

