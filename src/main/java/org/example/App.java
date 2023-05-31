package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        options.addArguments("--start-maximized");

        WebDriver driver = new ChromeDriver(options);

        driver.get("https://sushiwok.ru/spb/");

        WebElement webElement1 = driver.findElement(By.xpath(".//*[@id='root']/div/div[2]/div/div/a[1]"));
        WebElement webElement2 = driver.findElement(By.xpath(".//*[@id='root']/div/div[2]/div/div/a[2]"));
        WebElement webElement3 = driver.findElement(By.xpath(".//*[@id='root']/div/div[2]/div/div/a[3]"));
        WebElement webElement4 = driver.findElement(By.xpath(".//*[@id='root']/div/div[2]/div/div/a[4]"));

       webElement1.click();
       webElement2.click();
       webElement3.click();
       webElement4.click();

        WebElement topMenu1 = driver.findElement(By.xpath(".//div[@id='root']/div/div[3]/div/div[4]/div[2]/a[1]"));
        WebElement topMenu2 = driver.findElement(By.xpath(".//div[@id='root']/div/div[3]/div/div[4]/div[2]/a[2]"));
        WebElement topMenu3 = driver.findElement(By.xpath(".//div[@id='root']/div/div[3]/div/div[4]/div[2]/a[3]"));
        WebElement topMenu4 = driver.findElement(By.xpath(".//div[@id='root']/div/div[3]/div/div[4]/div[2]/a[4]"));
        WebElement topMenu5 = driver.findElement(By.xpath(".//div[@id='root']/div/div[3]/div/div[4]/div[2]/a[5]"));


        topMenu1.click();
        topMenu2.click();
        topMenu3.click();
        topMenu4.click();
        topMenu5.click();
    };
}
