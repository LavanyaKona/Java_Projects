package streamnlambda;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CapitalizeAndSortTest {

    @Test
    public void testCapitalizeAndSort() {
        String[] input = {"Lavanya", "Hershey", "Mona", "Shivani"};
        String[] expected = {"Hershey", "Lavanya", "Mona", "Shivani"};

        String[] result = CapitalizeAndSort.capitalizeAndSort(input);

        assertArrayEquals(expected, result);
    }

    @Test
    public void testCapitalizeAndSortWithEmptyString() {
        String[] input = {""};
        String[] expected = {""};

        String[] result = CapitalizeAndSort.capitalizeAndSort(input);

        assertArrayEquals(expected, result);
    }

    @Test
    public void testCapitalizeAndSortWithNullString() {
        String[] input = {null};
        String[] expected = {null};

        String[] result = CapitalizeAndSort.capitalizeAndSort(input);

        assertArrayEquals(expected, result);
    }
}
