package lesson5.seminar5;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    //4
    @Test
    void testIntegrationFindSiteByName() {
        System.setProperty("webdriver.chrome.driver",
                "D:/javaProjects/GB_UnitTests/chromedriver-win64/chromedriver-win64/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.google.com/");
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("Selenium");
        searchBox.submit();

        List<WebElement> elements = driver.findElements(By.cssSelector("div"));

        boolean findElement = false;

        for (WebElement element: elements) {
            if (element.getText().contains("selenium.dev")) {
                findElement = true;
                break;
            }
        }


        driver.quit();
        assertTrue(findElement);
    }
    //5.1.
    @Test
    void testIntegrationAuthorization() {
        System.setProperty("webdriver.chrome.driver",
                "D:/javaProjects/GB_UnitTests/chromedriver-win64/chromedriver-win64/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        WebElement login = driver.findElement(By.id("user-name"));
        login.sendKeys("standard_user");
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("secret_sauce");
        WebElement button = driver.findElement(By.id("login-button"));
        button.click();

        WebElement products = driver.findElement(By.className("title"));
        String productsText = products.getText();

        driver.quit();
        assertEquals("Products",productsText);
    }

    //5.2.

    //5.3.
}