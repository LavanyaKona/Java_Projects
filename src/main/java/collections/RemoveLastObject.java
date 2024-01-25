package collections;

import java.util.ArrayList;

public class RemoveLastObject {

    public static void removeLast(ArrayList<String> list) {
        if (list != null && list.size() > 0) {
            list.remove(list.size() - 1);
        }
    }
}
