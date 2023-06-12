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
        WebElement webElement9 = driver.findElement(By.xpath("//a[span='Горячее']"));
        WebElement webElement10 = driver.findElement(By.xpath("//a[span='Супы']"));
        WebElement webElement11 = driver.findElement(By.xpath("//a[span='Салаты и закуски']"));
        WebElement webElement12 = driver.findElement(By.xpath("//a[span='Десерты']"));
        WebElement webElement13 = driver.findElement(By.xpath("//a[span='Напитки']"));
        WebElement webElement14 = driver.findElement(By.xpath("//a[span='Дополнительно']"));
        webElement1.click();
        webElement2.click();
        webElement3.click();
        webElement4.click();
        webElement5.click();
        webElement6.click();
        webElement7.click();
        webElement8.click();
        webElement9.click();
        webElement10.click();
        webElement11.click();
        webElement12.click();
        webElement13.click();
        webElement14.click();

        // ***нижнее меню***
        WebElement bottomMenu1 = driver.findElement(By.xpath("//a[@href='/about/']"));
        WebElement bottomMenu2 = driver.findElement(By.xpath("//a[@href='/reviews/']"));
        WebElement bottomMenu3 = driver.findElement(By.xpath("//a[@href='/vacancies/']"));

        bottomMenu1.click();
        bottomMenu2.click();
        bottomMenu3.click();

    }

}
