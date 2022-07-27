package org.example.grocery.products_page;

import org.example.grocery.Browser;

public class SaveProduct {

//    static String url = "http://localhost:4200/products";
//
//
//    public static void goTo() {
//        Browser.goTo(url);
//    }

    public static String isAt() {
        return BrowserProductsPage.checkURL();
    }

    public static void clickSaveButton() {
        BrowserProductsPage.goToSaveProductPage();
    }

    public static void saveProduct(String name, String price, String weight) {
        BrowserProductsPage.addProducts(name, price, weight);
    }
}
