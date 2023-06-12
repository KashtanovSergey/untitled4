package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Papajohns {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        options.addArguments("--start-maximized");

        WebDriver driver = new ChromeDriver(options);
        driver.get("https://papajohns.ru/sankt-peterburg");

        /*WebElement webElement1 = driver.findElement(By.xpath("//div[@id='pizza']"));*/
        WebElement webElement2 = driver.findElement(By.xpath("//*[@id='zakuski']]"));
        WebElement webElement3 = driver.findElement(By.xpath("//*[@id='napitki']]"));
        WebElement webElement4 = driver.findElement(By.xpath("//*[@id='sauce']]"));
        WebElement webElement5 = driver.findElement(By.xpath("//*[@id='deserty']]"));
        WebElement webElement6 = driver.findElement(By.xpath("//*[@id='hot']]"));
        WebElement webElement7 = driver.findElement(By.xpath("//*[@id='combo']]"));
        WebElement webElement8 = driver.findElement(By.xpath("//*[@id='other']]"));

        /*webElement1.click();*/
        webElement2.click();
        webElement3.click();
        webElement4.click();
        webElement5.click();
        webElement6.click();
        webElement7.click();
        webElement8.click();

    }
}
