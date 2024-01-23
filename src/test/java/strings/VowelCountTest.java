package strings;

import org.junit.Test;
import static org.junit.Assert.*;

public class VowelCountTest {

    @Test
    public void testCountVowels_successful() {
        int count = VowelCount.countVowels("aeiou");
        assertEquals(5, count);
    }

    @Test
    public void testCountVowels_nullInput() {
        int count = VowelCount.countVowels(null);
        assertEquals(0, count);
    }

    @Test
    public void testCountVowels_emptyInput() {
        int count = VowelCount.countVowels("");
        assertEquals(0, count);
    }

    @Test
    public void testCountVowels_mixedCase() {
        int count = VowelCount.countVowels("aEiOu");
        assertEquals(5, count);
    }

    @Test
    public void testCountVowels_noVowels() {
        int count = VowelCount.countVowels("bcdxyz");
        assertEquals(0, count);
    }
}
