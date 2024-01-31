package random;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringRotationCheckerTest {

    private final StringRotationChecker rotationChecker = new StringRotationChecker();

    @Test
    public void testPositiveResponse() {
        assertTrue(rotationChecker.isRotation("hello", "lohel"));
    }

    @Test
    public void testNegativeResponse() {
        assertFalse(rotationChecker.isRotation("hello", "world"));
    }

    @Test
public void testNullResponse() {
    assertFalse(rotationChecker.isRotation(null, "hello"));
    assertFalse(rotationChecker.isRotation("hello", null));
    assertFalse(rotationChecker.isRotation(null, null));
}
}
