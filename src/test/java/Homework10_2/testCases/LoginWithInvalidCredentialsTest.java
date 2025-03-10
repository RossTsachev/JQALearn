package Homework10_2.testCases;

import Homework10_1.pageObjectModels.LoginPage;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;

public class LoginWithInvalidCredentialsTest extends BaseTest {

    @Test
    public void loginWithInvalidCredentials() {
        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);

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
