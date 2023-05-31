package PizzaMafiya;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Pizza {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        options.addArguments("--start-maximized");

        WebDriver driver = new ChromeDriver(options);

        driver.get("https://3332222.ru/");

        WebDriver webDetail1 = driver.findElement(By.xpath(".//div[@id='root']/aside/div/nav/ul/li[1]/a"));
        WebDriver webDetail2 = driver.findElement(By.xpath(".//div[@id='content']/footer/div[2]/nav/a[1]"));
        WebDriver webDetail3 = driver.findElement(By.xpath(".//div[@id='content']/footer/div[2]/nav/a[2]"));

        webDetail1.click();
        webDetail2.click();
        webDetail3.Click();

    }


}
