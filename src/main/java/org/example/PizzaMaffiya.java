package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class PizzaMaffiya {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        options.addArguments("----start-maximized");

        WebDriver driver = new ChromeDriver(options);
        driver.get("https://3332222.ru/");

        WebElement webElement1 = driver.findElement(By.xpath("//a[span='Хит']"));
        WebElement webElement2 = driver.findElement(By.xpath("//a[span='Пицца']"));
        WebElement webElement3 = driver.findElement(By.xpath("//a[span='Наборы']"));
        WebElement webElement4 = driver.findElement(By.xpath("//a[span='Роллы']"));
        WebElement webElement5 = driver.findElement(By.xpath("//a[span='WOK']"));
        WebElement webElement6 = driver.findElement(By.xpath("//a[span='Наборы']"));
        WebElement webElement7 = driver.findElement(By.xpath("//a[span='Настольные игры']"));
        WebElement webElement8 = driver.findElement(By.xpath("//a[span='Обеды']"));

        webElement1.click();
        webElement2.click();
        webElement3.click();
        webElement4.click();
        webElement5.click();
        webElement6.click();
        webElement7.click();
        webElement8.click();
    }

}
