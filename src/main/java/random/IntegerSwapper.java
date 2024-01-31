package random;

public class IntegerSwapper {
    public void swapIntegers(int[] arr) {
        if (arr == null || arr.length < 2)
            return;

        int a = arr[0];
        int b = arr[1];

        System.out.println("Before swapping: a = " + a + ", b = " + b);

        a = a + b;
        b = a - b;
        a = a - b;

        arr[0] = a;
        arr[1] = b;

        System.out.println("After swapping: a = " + a + ", b = " + b);
    }
}


