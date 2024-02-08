package threads;

public class EvenPrinter extends Thread {
    public void run() {
        for (int i = 2; i <= 60; i += 2) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
        }
    }
}