package grocery.products_page;

import org.example.grocery.home_page.HomePage;
import org.example.grocery.products_page.Product;
import org.example.grocery.products_page.ProductsPage;
import org.example.grocery.products_page.SaveProduct;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class ProductsPageUnitTest {
    @BeforeAll
    static void goToURL() {
        ProductsPage.goTo();
    }

    @Test
    public  void canGoToSpecifiedURL() {
        Assertions.assertEquals("http://localhost:4200/products", ProductsPage.isAt());
    }

    @Test
    public  void canCountTableRows() {
        Assertions.assertEquals(3, ProductsPage.countTableRows());
    }


}
