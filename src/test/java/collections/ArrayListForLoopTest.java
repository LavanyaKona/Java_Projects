package collections;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;

public class ArrayListForLoopTest {

    @Test
    public void testArrayListTraversal() {

        ArrayList<String> stocks = new ArrayList<>();
        stocks.add("AAPL");
        stocks.add("GOOGL");
        stocks.add("MSFT");
        stocks.add("AMZN");

        StringBuilder result = new StringBuilder();
        for (String stock : stocks) {
            result.append(stock).append(" ");
        }
        assertEquals("AAPL GOOGL MSFT AMZN", result.toString().trim());
    }

    @Test
    public void testArrayListTraversalNegative() {

        ArrayList<String> stocks = new ArrayList<>();
        stocks.add("AAPL");
        stocks.add("GOOGL");
        stocks.add("MSFT");
        stocks.add("AMZN");

        StringBuilder result = new StringBuilder();
        for (String stock : stocks) {
            result.append(stock).append(" ");
        }
        assertEquals("AAPL GOOGL MSFT AMZN", result.toString().trim());
    }

    @Test(expected = NullPointerException.class)
    public void testArrayListTraversalNull() {

        ArrayList<String> stocks = null;
        ArrayListForLoop.traverseArrayList(stocks);
    }

    @Test
    public void testArrayListTraversalZero() {

        ArrayList<String> stocks = new ArrayList<>();
        ArrayListForLoop.traverseArrayList(stocks);

    }
}
