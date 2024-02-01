package random;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListReversal {

    public static ArrayList<Integer> reverseArrayList(ArrayList<Integer> list) {
        if (list == null) {
            throw new IllegalArgumentException("ArrayList cannot be null");
        }

        Collections.reverse(list);
        return list;
    }
}
