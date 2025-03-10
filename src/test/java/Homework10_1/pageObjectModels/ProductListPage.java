package Homework10_1.pageObjectModels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductListPage {

    WebDriver driver;
    public String url = "https://www.saucedemo.com/inventory.html";
    By firstItemAddToCartButton = By.xpath("//div[@class='inventory_list']/div[@class='inventory_item'][1]//button");
    By firstItemNameContainer = By.xpath("//div[@class='inventory_list']/div[@class='inventory_item'][1]//div[@class='inventory_item_name ']");
    By firstItemPriceContainer = By.xpath("//div[@class='inventory_list']/div[@class='inventory_item'][1]//div[@class='inventory_item_price']");

    public ProductListPage(WebDriver driver) {
        this.driver = driver;
    }

    public void goToPage() {
        driver.get(url);
    }

    public void addFirstItemToCart() {
        driver.findElement(firstItemAddToCartButton).click();
    }

    public String getFirstItemName() {
        return driver.findElement(firstItemNameContainer).getText();
    }

    public String getFirstItemPrice() {
        return driver.findElement(firstItemPriceContainer).getText().replace("$", "");
    }
}
