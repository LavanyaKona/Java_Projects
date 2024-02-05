package streamnlambda;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.Objects;

public class CapitalizeAndSort {
    public static String[] capitalizeAndSort(String[] strings) {
        return Arrays.stream(strings)
                .map(str -> {
                    if (str == null) {
                        return null;
                    } else {
                        return str.isEmpty() ? str : Character.toUpperCase(str.charAt(0)) + str.substring(1);
                        }
                    })
                .sorted()
                .toArray(size -> new String[size]);
                    //String[]::new
        }
    }



