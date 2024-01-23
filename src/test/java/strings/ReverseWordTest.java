package strings;

import org.junit.Test;
import strings.ReverseWord;

import static org.junit.Assert.assertArrayEquals;

public class ReverseWordTest {

    @Test
    public void testReverseWords_successful() {
        String[] input = {"Hello", "World"};
        String[] expectedOutput = {"olleH", "dlroW"};

        String[] result = ReverseWord.reverseWords(input);

        assertArrayEquals(expectedOutput, result);
    }

    @Test
    public void testReverseWords_nullInput() {
        String[] input = null;
        String[] expectedOutput = {};

        String[] result = ReverseWord.reverseWords(input);

        assertArrayEquals(expectedOutput, result);
    }

    @Test
    public void testReverseWords_emptyInput() {
        String[] input = {};
        String[] expectedOutput = {};

        String[] result = ReverseWord.reverseWords(input);

        assertArrayEquals(expectedOutput, result);
    }

    @Test
    public void testReverseWords_zeroInput() {
        String[] input = {"0"};
        String[] expectedOutput = {"0"};

        String[] result = ReverseWord.reverseWords(input);

        assertArrayEquals(expectedOutput, result);
    }

    @Test
    public void testReverseWords_unexpectedInput() {
        String[] input = {"This", "is", "a", "test"};
        String[] expectedOutput = {"sihT", "si", "a", "tset"};

        String[] result = ReverseWord.reverseWords(input);

        assertArrayEquals(expectedOutput, result);
    }
}
