package random;
import org.junit.Test;
import static org.junit.Assert.*;

public class PalindromeTest {

    Palindrome Palindrome = new Palindrome();

    @Test
    public void testPositivePalindrome() {
        assertTrue(Palindrome.isPalindrome("radar"));
        assertTrue(Palindrome.isPalindrome("madam"));
        assertTrue(Palindrome.isPalindrome("level"));
    }

    @Test
    public void testNegativePalindrome() {
        assertFalse(Palindrome.isPalindrome("hello"));
        assertFalse(Palindrome.isPalindrome("world"));
        assertFalse(Palindrome.isPalindrome("openai"));
    }

    @Test
    public void testZeroLengthPalindrome() {
        assertTrue(Palindrome.isPalindrome(""));
    }

    @Test
    public void testNullString() {
        assertFalse(Palindrome.isPalindrome(null));
    }
}

