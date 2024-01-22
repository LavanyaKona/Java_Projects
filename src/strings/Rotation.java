package strings;

import java.util.Scanner;

public class Rotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter String1");
        String s1 = sc.next();

        System.out.println("Enter String2");
        String s2 = sc.next();

        if(s1.length()==s2.length())
        {
            String concat=s1+s1;

            System.out.print(concat.contains(s2));
        }
    }
}
