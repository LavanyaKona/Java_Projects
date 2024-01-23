package strings;

import java.util.Scanner;

public class Rotation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter String1");
        String s1 = sc.next();

        System.out.println("Enter String2");
        String s2 = sc.next();

        if (s1.length() == s2.length()) {
            System.out.print(areRotations(s1, s2));
        }
    }

    public static boolean areRotations(String s1, String s2) {
        if (s1 == null || s2 == null) {
            return false;
        }

        if (s1.length() != s2.length()) {
            return false;
        }

        String concat = s1 + s1;

        return concat.contains(s2);
    }
}
