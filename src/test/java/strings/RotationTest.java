package strings;

import org.junit.Test;
import strings.Rotation;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class RotationTest {

    @Test
    public void testAreRotations_successful() {
        assertTrue(Rotation.areRotations("abcde", "cdeab"));
    }

    @Test
    public void testAreRotations_nullInput() {
        assertFalse(Rotation.areRotations(null, "test"));
        assertFalse(Rotation.areRotations("test", null));
        assertFalse(Rotation.areRotations(null, null));
    }

    @Test
    public void testAreRotations_differentLength() {
        assertFalse(Rotation.areRotations("hello", "world"));
    }

    @Test
    public void testAreRotations_notRotations() {
        assertFalse(Rotation.areRotations("hello", "holla"));
    }

    @Test
    public void testAreRotations_zeroInput() {
        assertTrue(Rotation.areRotations("", ""));
    }
}
