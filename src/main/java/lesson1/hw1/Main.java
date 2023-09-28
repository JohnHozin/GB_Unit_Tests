package lesson1.hw1;

import lesson1.hw1.Shop.Product;
import lesson1.hw1.Shop.Shop;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Product apple = new Product(25, "Apple");
        Product mango = new Product(50, "Mango");
        Product bread = new Product(15, "Bread");
        ArrayList<Product> products = new ArrayList<>();
        products.add(apple);
        products.add(mango);
        products.add(bread);

        Shop shop = new Shop(products);
        System.out.println(shop);
        shop.sortProductsByPrice();
        System.out.println(shop);
        System.out.println(shop.getMostExpensiveProduct());
    }
}