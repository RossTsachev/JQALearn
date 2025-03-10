package Homework10_2.testCases;

import Homework10_2.pageObjectModels.CartPage;
import Homework10_2.pageObjectModels.LoginPage;
import Homework10_2.pageObjectModels.ProductListPage;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;

public class AddItemToCartTest {
    WebDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "c:/Code/BrowserDrivers/chromedriver.exe");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        driver = new ChromeDriver(options);
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    @Test
    public void addItemToCart() {
        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
        ProductListPage productListPage = PageFactory.initElements(driver, ProductListPage.class);
        CartPage cartPage = PageFactory.initElements(driver, CartPage.class);

        loginPage.goToPage();
        loginPage.login("standard_user", "secret_sauce");

        productListPage.addFirstItemToCart();
        String expectedCartItemName = productListPage.getFirstItemName();
        String expectedCartItemPrice = productListPage.getFirstItemPrice();

        cartPage.goToPage();

        Assert.assertEquals(1, cartPage.getCartItemCount());
        Assert.assertEquals(expectedCartItemName, cartPage.getFirstItemName());
        Assert.assertEquals(expectedCartItemPrice, cartPage.getFirstItemPrice());

    }
}
