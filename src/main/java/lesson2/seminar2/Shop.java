package lesson2.seminar2;

import java.util.List;

public class Shop {
    private final List<Product> productsShop;

    // При создании магазина нужно передать ему список продуктов
    public Shop(List<Product> productsShop) {
        this.productsShop = productsShop;
    }

    // Метод для получения текущего списка продуктов
    public List<Product> getProductsShop() {
        return productsShop;
    }
}
