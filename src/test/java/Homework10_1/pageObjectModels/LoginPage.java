package Homework10_1.pageObjectModels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    WebDriver driver;
    public String url = "https://www.saucedemo.com/";
    By userName = By.id("user-name");
    By password = By.name("password");
    By loginButton = By.cssSelector("#login-button");
    By errorMessageContainer = By.className("error-message-container");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void goToPage() {
        driver.get(url);
    }

    public void login(String user, String pass) {
        driver.findElement(userName).sendKeys(user);
        driver.findElement(password).sendKeys(pass);
        driver.findElement(loginButton).click();
    }

    public String getUserNameInputClass() {
        return driver.findElement(userName).getAttribute("class");
    }

    public String getPasswordInputClass() {
        return driver.findElement(password).getAttribute("class");
    }

    public String getErrorMessage() {
        return driver.findElement(errorMessageContainer).getText();
    }
}
