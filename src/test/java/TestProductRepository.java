import com.example.pracktwork2.Product;
import com.example.pracktwork2.ProductRepository;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestProductRepository {

    @Test
    public void testGetAllProducts() {
        ProductRepository productRepository = new ProductRepository();
        assertEquals(5, productRepository.getAllProducts().size());
    }

    @Test
    public void testGetProductById() {
        ProductRepository productRepository = new ProductRepository();
        Product product = productRepository.getProductById(1);
        assertNotNull(product);
        assertEquals(1, product.getId());
    }

    @Test
    public void testGetProductByIdNonExistent() {
        ProductRepository productRepository = new ProductRepository();
        Product product = productRepository.getProductById(10);
        assertNull(product);
    }
}
