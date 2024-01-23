package strings;

import org.junit.Test;
import strings.Anagram;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class AnagramTest {

    @Test
    public void testAreAnagrams_successful() {
        assertTrue(Anagram.areAnagrams("listen", "silent"));
    }

    @Test
    public void testAreAnagrams_nullInput() {
        assertFalse(Anagram.areAnagrams(null, "test"));
        assertFalse(Anagram.areAnagrams("test", null));
        assertFalse(Anagram.areAnagrams(null, null));
    }

    @Test
    public void testAreAnagrams_differentLength() {
        assertFalse(Anagram.areAnagrams("hello", "world"));
    }

    @Test
    public void testAreAnagrams_notAnagrams() {
        assertFalse(Anagram.areAnagrams("hello", "holla"));
    }

    @Test
    public void testAreAnagrams_zeroInput() {
        assertTrue(Anagram.areAnagrams("", ""));
    }
}
