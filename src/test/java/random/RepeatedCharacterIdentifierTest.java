package random;

import org.junit.Test;
import java.util.Map;
import static org.junit.Assert.*;

public class RepeatedCharacterIdentifierTest {

    RepeatedCharacterIdentifier identifier = new RepeatedCharacterIdentifier();

    @Test
    public void testPositiveString() {
        String str = "hello";
        Map<Character, Integer> result = identifier.findRepeatedCharacters(str);
        assertEquals(1, result.size());
        assertTrue(result.containsKey('l'));
        assertEquals(2, (int) result.get('l'));
        //assertEquals(2, (int) result.get('e'));
    }



    @Test
    public void testNoRepeatedCharacters() {
        String str = "world";
        Map<Character, Integer> result = identifier.findRepeatedCharacters(str);
        assertTrue(result.isEmpty());
    }

    @Test
    public void testEmptyString() {
        String str = "";
        Map<Character, Integer> result = identifier.findRepeatedCharacters(str);
        assertTrue(result.isEmpty());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNullString() {
        identifier.findRepeatedCharacters(null);
    }
}

