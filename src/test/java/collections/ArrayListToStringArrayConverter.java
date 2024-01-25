package collections;

import java.util.List;

public class ArrayListToStringArrayConverter {

    public static String[] convertToStringArray(List<String> stringList) {
        if (stringList == null) {
            throw new NullPointerException("Input list cannot be null");
        }

        return stringList.toArray(new String[0]);
    }
}
