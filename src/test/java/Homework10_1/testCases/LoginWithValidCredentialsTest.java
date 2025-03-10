package Homework10_1.testCases;

import Homework10_1.pageObjectModels.LoginPage;
import Homework10_1.pageObjectModels.ProductListPage;
import org.junit.Assert;
import org.junit.Test;

public class LoginWithValidCredentialsTest extends BaseTest {

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
