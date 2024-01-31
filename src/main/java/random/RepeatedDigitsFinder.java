package random;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RepeatedDigitsFinder {

    public List<Integer> findRepeatedDigits(int number) {
        if (number == 0) {
            return new ArrayList<>();
        }

        Set<Integer> seen = new HashSet<>();
        Set<Integer> repeated = new HashSet<>();

        // Convert number to positive
        number = Math.abs(number);

        while (number > 0) {
            int digit = number % 10;
            if (!seen.add(digit)) {
                repeated.add(digit);
            }
            number /= 10;
        }

        return new ArrayList<>(repeated);
    }
}
