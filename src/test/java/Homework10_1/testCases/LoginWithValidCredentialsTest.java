package Homework10_1.testCases;

import Homework10_1.pageObjectModels.LoginPage;
import Homework10_1.pageObjectModels.ProductListPage;
import org.junit.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LoginWithValidCredentialsTest {
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
    public void loginWithValidCredentials() {
        LoginPage loginPage = new LoginPage(driver);
        ProductListPage productListPage = new ProductListPage(driver);

        loginPage.goToPage();
        loginPage.login("standard_user", "secret_sauce");

        String expectedUrlAfterLogin = productListPage.url;
        String currentUrl = driver.getCurrentUrl();
        Assert.assertEquals(expectedUrlAfterLogin, currentUrl);
    }
}
