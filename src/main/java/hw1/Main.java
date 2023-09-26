package hw1;

import hw1.Shop.Product;
import hw1.Shop.Shop;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.*; // Импортируем классы библиотеки assertJ

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