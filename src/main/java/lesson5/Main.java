package lesson5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "D:/javaProjects/GB_UnitTests/chromedriver-win64/chromedriver-win64/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
//        driver.get("http://www.google.com/");
        driver.get("https://www.ya.ru/");
//        WebElement searchBox = driver.findElement(By.name("q"));
        WebElement searchBox = driver.findElement(By.name("text"));
        searchBox.sendKeys("GeekBrains");
        searchBox.submit();

    }
}
