package Homework10_2.testCases;

import Homework10_2.pageObjectModels.CartPage;
import Homework10_2.pageObjectModels.LoginPage;
import Homework10_2.pageObjectModels.ProductListPage;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;

public class AddItemToCartTest extends BaseTest {

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
