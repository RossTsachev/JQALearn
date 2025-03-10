package Homework10_1.testCases;

import Homework10_1.pageObjectModels.LoginPage;
import org.junit.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LoginWithInvalidCredentialsTest {
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
    public void loginWithInvalidCredentials() {
        LoginPage loginPage = new LoginPage(driver);

        loginPage.goToPage();
        loginPage.login("standard_user", "wrong_password");

        String expectedUrlAfterLogin = loginPage.url;
        String currentUrl = driver.getCurrentUrl();
        Assert.assertEquals(expectedUrlAfterLogin, currentUrl);

        Assert.assertTrue(loginPage.getUserNameInputClass().contains("error"));
        Assert.assertTrue(loginPage.getPasswordInputClass().contains("error"));

        String expectedErrorMessage = "Epic sadface: Username and password do not match any user in this service";
        Assert.assertEquals(expectedErrorMessage, loginPage.getErrorMessage());
    }
}
