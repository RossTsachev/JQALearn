package Homework8;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class FirstTestCase {
    public static void main( String[] args ) {
        System.setProperty("webdriver.chrome.driver", "c:/Code/BrowserDrivers/chromedriver.exe");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        WebDriver driver = new ChromeDriver(options);

        driver.get("https://www.google.com");

        System.out.println("Page Title: " + driver.getTitle());
    }
}
