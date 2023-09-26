package hw1.Shop;

import java.util.ArrayList;
import java.util.Comparator;

import static org.assertj.core.api.Assertions.*;

public class ShopTest {

    /*
   1. Напишите тесты, чтобы проверить, что магазин хранит верный список продуктов (правильное количество продуктов, верное содержимое корзины).
   2. Напишите тесты для проверки корректности работы метода getMostExpensiveProduct.
   3. Напишите тесты для проверки корректности работы метода sortProductsByPrice (проверьте правильность сортировки).
   */
    public static void main(String[] args) {
        Product apple = new Product(25, "Apple");
        Product mango = new Product(50, "Mango");
        Product bread = new Product(15, "Bread");
        ArrayList<Product> products = new ArrayList<>();
        products.add(apple);
        products.add(mango);
        products.add(bread);
        Shop shop = new Shop(products);

        assertThat(shop.getProducts())
                .contains(apple, mango, bread)
                .doesNotContain(new Product(30, "Orange"))
                .hasSize(3);

        assertThat(shop.getMostExpensiveProduct()).isEqualTo(mango);
        assertThatThrownBy(() -> new Shop().getMostExpensiveProduct()).isInstanceOf(RuntimeException.class);

        assertThat(shop.getProducts()).isSortedAccordingTo(Comparator.comparing(Product::getCost));

    }
}