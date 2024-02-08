package threads;
import org.junit.Test;
public class EvenOddPrinterTest {

    @Test
    public void testEvenOddPrinter() {
        EvenPrinter evenPrinter = new EvenPrinter();
        OddPrinter oddPrinter = new OddPrinter();

        evenPrinter.setName("EvenThread");
        oddPrinter.setName("OddThread");

        evenPrinter.start();
        oddPrinter.start();

        try {
            evenPrinter.join();
            oddPrinter.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
