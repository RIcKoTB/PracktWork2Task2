import com.example.pracktwork2.Cart;
import com.example.pracktwork2.Product;
import com.example.pracktwork2.ProductRepository;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestCart {

    @Test
    public void testAddProductToCart() {
        ProductRepository productRepository = new ProductRepository();
        Cart cart = new Cart();
        Product product = productRepository.getProductById(2);
        cart.addProduct(product);

        assertEquals(1, cart.getCartItems().size());
        assertTrue(cart.getCartItems().contains(product));
    }

    @Test
    public void testRemoveProductFromCart() {
        ProductRepository productRepository = new ProductRepository();
        Cart cart = new Cart();
        Product product = productRepository.getProductById(3);
        cart.addProduct(product);
        assertEquals(1, cart.getCartItems().size());

        cart.removeProduct(3);
        assertEquals(0, cart.getCartItems().size());
    }

    @Test
    public void testRemoveNonExistentProductFromCart() {
        ProductRepository productRepository = new ProductRepository();
        Cart cart = new Cart();
        Product product = productRepository.getProductById(4);
        cart.addProduct(product);
        assertEquals(1, cart.getCartItems().size());

        // Trying to remove a product with non-existent ID
        cart.removeProduct(5);
        assertEquals(1, cart.getCartItems().size());
    }
}
