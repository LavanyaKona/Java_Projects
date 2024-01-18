package loops;

public class Patterns {
    public static void main(String[] args) {
        int r = 5;
        for (int i = 0; i < r; i++) {

            for (int j = 0; j <= r - 2-i; j++) {
                System.out.print("+");
            }
            for (int k = 0; k < i+2; k++) {
                System.out.print("-");
            }
            System.out.println();
        }
    }
}
