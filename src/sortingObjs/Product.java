package sortingObjs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Product implements Comparable<Product> {

    private int id;
    private double weight;
    private double price;

    public Product(int id, double weight, double price) {
        this.id = id;
        this.weight = weight;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public double getWeight() {
        return weight;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public int compareTo(Product otherProduct) {
        if (this.price > otherProduct.price) {
            return 1;
        } else if (this.price < otherProduct.price) {
            return -1;
        }
        return 0;
    }

    public static void main(String[] args) {
        Product product1 = new Product(1, 2.5, 20.0);
        Product product2 = new Product(2, 1.8, 15.0);


        List<Product> productList = new ArrayList<>(Arrays.asList(product1, product2));

        System.out.println("CompareTo return value: "+product1.compareTo(product2));


    }
}
