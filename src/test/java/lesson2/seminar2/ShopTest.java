package lesson2.seminar2;

import lesson2.seminar2.Cart;
import lesson2.seminar2.Shop;
import org.junit.jupiter.api.Test;

import static lesson2.seminar2.Main.getStoreItems;
import static org.assertj.core.api.Assertions.*;

public class ShopTest {
    @Test
    public void testTotalPriceCart() {
        Shop shop = new Shop(getStoreItems());
        Cart cart = new Cart(shop);

        cart.addProductToCartByID(1);
        cart.addProductToCartByID(2);
        cart.addProductToCartByID(3);

        assertThat(cart.getTotalPrice()).isEqualTo(620);
    }
}
