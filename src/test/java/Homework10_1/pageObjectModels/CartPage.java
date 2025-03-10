package Homework10_1.pageObjectModels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {

    WebDriver driver;
    public String url = "https://www.saucedemo.com/cart.html";
    By cartItems = By.xpath("//div[@class='cart_list']/div[@class='cart_item']");
    By firstItemName = By.xpath("//div[@class='cart_item'][1]/div[@class='cart_item_label']/a");
    By firstItemPrice = By.xpath("//div[@class='cart_item'][1]//div[@class='inventory_item_price']");


    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    public void goToPage() {
        driver.get(url);
    }

    public int getCartItemCount() {
        return driver.findElements(cartItems).size();
    }

    public String getFirstItemName() {
        return driver.findElement(firstItemName).getText();
    }

    public String getFirstItemPrice() {
        return driver.findElement(firstItemPrice).getText().replace("$", "");
    }
}
