package collections;

import java.util.ArrayList;

public class ArrayListForLoop {


    public static void traverseArrayList(ArrayList<String> stocks) {
        for (int i = 0; i < stocks.size(); i++) {
            String stock = stocks.get(i);
            System.out.println(stock);
        }
    }
    public static void main(String[] args) {
        ArrayList<String> stocks = new ArrayList<>();
        stocks.add("AAPL");
        stocks.add("GOOGL");
        stocks.add("MSFT");
        stocks.add("AMZN");

        traverseArrayList(stocks);
    }
}
