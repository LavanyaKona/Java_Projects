package threads;

public class OddPrinter extends Thread {
    public void run() {
        for (int i = 1; i <= 59; i += 2) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
        }
    }
}