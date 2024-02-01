package random;

import java.util.Arrays;

public class ArraySumCalculator {

    public static int calculateArraySum(int[] array) {
        if (array == null) {
            throw new IllegalArgumentException("Array cannot be null");
        }

        return Arrays.stream(array).sum();
    }
}

