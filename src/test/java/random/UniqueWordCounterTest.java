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

        assertEquals(0, result.size());
    }

    @Test
    public void testNegativeResponse() {
        String input = "hello world world";
        Map<String, Integer> result = wordCounter.countUniqueWords(input);

        assertEquals(1, result.size());
    }

}

