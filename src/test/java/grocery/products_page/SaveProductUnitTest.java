package grocery.products_page;

import org.example.grocery.products_page.Product;
import org.example.grocery.products_page.ProductsPage;
import org.example.grocery.products_page.SaveProduct;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.tinylog.Logger;

public class SaveProductUnitTest {

    @BeforeAll
    static void goToURL() {
        ProductsPage.goTo();
    }



    @Test
    public  void canGoToSaveProductPage() {
        SaveProduct.clickSaveButton();
        Assertions.assertEquals("http://localhost:4200/save-product", SaveProduct.isAt());
    }

    @Test
    public  void canSaveProduct() {
        int initialTableSize = ProductsPage.countTableRows();

        SaveProduct.clickSaveButton();

        Product product = new Product("Name", "12", "12");

        SaveProduct.saveProduct(product.getName(), product.getPrice(), product.getWeight());


        Logger.info(initialTableSize);

//        ProductsPage.goTo();
//
        Assertions.assertEquals(initialTableSize + 1, ProductsPage.countTableRows());


    }
}
