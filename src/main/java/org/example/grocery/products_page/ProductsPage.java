package org.example.grocery.products_page;

import org.example.grocery.Browser;
import org.example.grocery.home_page.BrowserHomePage;

public class ProductsPage {

    static String url = "http://localhost:4200/products";


    public static void goTo() {
        Browser.goTo(url);
    }

    public static String isAt() {
        return BrowserProductsPage.checkURL();
    }

    public static int countTableRows() {
        return BrowserProductsPage.tableRowCounter();
    }
}
