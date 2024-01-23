package strings;

import java.util.Scanner;

public class VowelCount {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String input = sc.next();

        int count = countVowels(input);

        System.out.println("Total number of vowels in a string " + input + " is: " + count);
    }

    public static int countVowels(String input) {
        if (input == null) {
            return 0; // Return 0 for null input
        }

        input = input.toLowerCase(); // Apply toLowerCase and assign it back
        char[] characters = input.toCharArray();
        int count = 0;

        for (int i = 0; i < characters.length; i++) {
            char c = characters[i];
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
                count++;
        }

        return count;
    }
}
