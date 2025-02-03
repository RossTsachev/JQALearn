package Homework9;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.util.List;

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
    public void testAddition() {
        // Go to site
        driver.get("https://www.saucedemo.com/");

        // Login with username and pasword
        WebElement userName = driver.findElement(By.id("user-name"));
        userName.sendKeys("standard_user");

        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("secret_sauce");

        WebElement loginButton = driver.findElement(By.cssSelector("#login-button"));
        loginButton.click();

        // Add the first item of the list to the cart
        WebElement addToCartFirstItemButton = driver.findElement(By.xpath("//div[@class='inventory_list']/div[@class='inventory_item'][1]//button"));
        addToCartFirstItemButton.click();

        // Go to the shopping cart
        driver.get("https://www.saucedemo.com/cart.html");

        // Get the all the items in the shopping cart
        List<WebElement> cartItems = driver.findElements(By.xpath("//div[@class='cart_list']/div[@class='cart_item']"));

        Assert.assertEquals(1, cartItems.size());
    }
}
