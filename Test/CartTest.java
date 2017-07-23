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
    public void testCreatedItemHasName() {
        cart.addItem(0);
        String name = cart.getItemName(0);
        assertEquals("Alderaan", name);
    }

//    @Test
//    public void testItemhasPrice() {
//        cart.addItem();
//    }
}