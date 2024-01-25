package collections;

import java.util.ArrayList;

public class ArrayListEnhFor {
        public static void traverseArrayList(ArrayList<String> stocks) {
            for (String stock : stocks) {
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
