package Homework10_2.testCases;

import Homework10_1.pageObjectModels.LoginPage;
import Homework10_1.pageObjectModels.ProductListPage;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;

public class LoginWithValidCredentialsTest extends BaseTest {

    @Test
    public void loginWithValidCredentials() {
        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
        ProductListPage productListPage = PageFactory.initElements(driver, ProductListPage.class);

        loginPage.goToPage();
        loginPage.login("standard_user", "secret_sauce");

        String expectedUrlAfterLogin = productListPage.url;
        String currentUrl = driver.getCurrentUrl();
        Assert.assertEquals(expectedUrlAfterLogin, currentUrl);
    }
}
