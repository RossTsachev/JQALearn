package Homework10_2.testCases;

import Homework10_2.helpers.BrowserFactory;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

public abstract class BaseTest {
    WebDriver driver;

    @Before
    public void setUp() {
        driver = BrowserFactory.getBrowser("Chrome");
    }

    @After
    public void tearDown() {
        BrowserFactory.closeBrowser();
    }
}
