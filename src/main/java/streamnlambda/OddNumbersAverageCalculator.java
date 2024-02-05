package streamnlambda;

import java.util.Arrays;

public class OddNumbersAverageCalculator {

    public static double calculateAverageOfOddSquares(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            throw new IllegalArgumentException("Input array is null or empty");
        }

        return Arrays.stream(numbers)
                .filter(n -> n % 2 != 0)
                .map(n -> n * n)
                .average()
                .orElse(0);
    }
}

