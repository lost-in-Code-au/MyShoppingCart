/**
 * Created by Reece Jones on 23/07/2017.
 */

import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;
import static org.junit.Assert.*;

/**
 * Created by Whitepaw on 21/07/2017.
 */
public class CartTest {


    private Cart cart;

    @Before
    public void setUp() throws Exception {
        cart = new Cart();
    }

    @Test
    public void testCartCanAddItem() {
        cart.addItem(0);
        assertEquals(1, cart.size());
    }

    @Test
    public void testCreatedItemHasName() {
        cart.addItem(0);
        String name = cart.getItemName(0);
        assertEquals("Alderaan", name);
    }

    @Test
    public void testItemhasPrice() {
        cart.addItem(0);
        double price = cart.getItemPrice(0);
        assertEquals(30000000.00, price, 2);
    }

    @Test
    public void testCartHasTotal() {
        cart.addItem(0);
        cart.addItem(1);
        cart.addItem(2);
        double total = cart.getTotalOfCart();
        assertEquals(61000000.00, total, 2);
    }
}