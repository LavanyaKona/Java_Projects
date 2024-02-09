package threads;

import org.junit.Test;

public class DeadlockTest {
    @Test
    public void testDeadlock() {
        ResourceHolder resourceHolder = new ResourceHolder();

        Thread thread1 = new Thread(() -> {
            synchronized (resourceHolder.getResource1()) {
                System.out.println("Thread 1: Holding resource 1...");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Thread 1: Waiting for resource 2...");
                synchronized (resourceHolder.getResource2()) {
                    System.out.println("Thread 1: Holding resource 1 and resource 2...");
                }
            }
        });

        Thread thread2 = new Thread(() -> {
            synchronized (resourceHolder.getResource2()) {
                System.out.println("Thread 2: Holding resource 2...");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Thread 2: Waiting for resource 1...");
                synchronized (resourceHolder.getResource1()) {
                    System.out.println("Thread 2: Holding resource 2 and resource 1...");
                }
            }
        });

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
