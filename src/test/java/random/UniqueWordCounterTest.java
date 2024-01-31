package random;

import org.junit.Test;

import java.util.Map;

import static org.junit.Assert.*;

public class UniqueWordCounterTest {

    private final UniqueWordCounter wordCounter = new UniqueWordCounter();

    @Test
    public void testPositiveResponse() {
        String input = "hello world hello world";
        Map<String, Integer> result = wordCounter.countUniqueWords(input);

        assertEquals(2, result.size());
        assertEquals(2, (int) result.get("hello"));
        assertEquals(2, (int) result.get("world"));
    }

    @Test
    public void testNegativeResponse() {
        String input = "hello hello world world";
        Map<String, Integer> result = wordCounter.countUniqueWords(input);

        assertEquals(2, result.size());
        assertEquals(2, (int) result.get("hello"));
        assertEquals(2, (int) result.get("world"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNullResponse() {
        wordCounter.countUniqueWords(null);
    }
}

