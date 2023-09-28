package lesson1.hw1.Shop;

import java.util.Comparator;
import java.util.List;

public class Shop {
    private List<Product> products;

    public Shop(List<Product> products) {
        this.products = products;
    }

    public Shop() {
    }

    // Геттеры, сеттеры:
    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    // Метод должен вернуть отсортированный по возрастанию по цене список продуктов
    public List<Product> sortProductsByPrice() {
        if (!products.isEmpty()) {
            products.sort(Comparator.comparing(Product::getCost));
        }
        return products;
    }

    // Метод должен вернуть самый дорогой продукт
    public Product getMostExpensiveProduct() {
        if (!products.isEmpty()) {
            sortProductsByPrice();
        } else {
            throw new RuntimeException("Корзина пуста");
        }
        return products.get(products.size() - 1);
    }

    @Override
    public String toString() {
        return "Shop{" +
                "products=" + products +
                '}';
    }
}