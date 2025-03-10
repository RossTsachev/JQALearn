package Homework10_1.testCases;

import Homework10_1.pageObjectModels.LoginPage;
import Homework10_1.pageObjectModels.ProductListPage;
import Homework10_1.pageObjectModels.CartPage;
import org.junit.Assert;
import org.junit.Test;

public class AddItemToCartTest extends BaseTest {

    @Test
    public void addItemToCart() {
        LoginPage loginPage = new LoginPage(driver);
        ProductListPage productListPage = new ProductListPage(driver);
        CartPage cartPage = new CartPage(driver);

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
