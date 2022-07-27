package org.example.grocery.products_page;

import org.example.grocery.Browser;
import org.example.grocery.home_page.BrowserHomePage;
import org.openqa.selenium.*;
import org.tinylog.Logger;

import java.util.List;

public class BrowserProductsPage extends BrowserHomePage implements Browser  {

    public static int tableRowCounter() {
        List<WebElement> rowsTable = driver.findElements(By.id("product-list-body-row"));
//        Logger.info(rowsTable.size());
        //To calculate no of rows In table.
        return rowsTable.size();
    }

    public static void goToSaveProductPage() {
        WebElement saveProductLink = driver.findElement(By.linkText("Save Product"));
        saveProductLink.click();
    }


    public static void addProducts(String name, String price, String weight) {
        WebElement inputName = driver.findElement(By.xpath("/html/body/app-root/div/div[2]/app-save-product/div/div[1]/div[1]/p/input"));
        WebElement inputPrice = driver.findElement(By.xpath("/html/body/app-root/div/div[2]/app-save-product/div/div[1]/div[2]/p/input"));
        WebElement inputWeight = driver.findElement(By.xpath("/html/body/app-root/div/div[2]/app-save-product/div/div[1]/div[3]/p/input"));

        WebElement saveButton = driver.findElement(By.id("save-product-button-save"));
        WebElement backButton = driver.findElement(By.id("save-product-button-save"));




        inputName.click();
        inputName.sendKeys(name);

        inputPrice.click();
        inputPrice.sendKeys(price);

        inputWeight.click();
        inputWeight.sendKeys(weight);



        saveButton.click();

        driver.getCurrentUrl();

        try {
            Alert simpleAlert = driver.switchTo().alert();
            simpleAlert.accept();
        } catch (NoAlertPresentException | UnhandledAlertException noe) {
            backButton.click();
            Logger.error(noe.getMessage());

        }


    }



}
