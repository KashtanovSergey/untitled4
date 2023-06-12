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
public class SushiWok
{
    public static void main( String[] args )
    {

        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        options.addArguments("--start-maximized");

        WebDriver driver = new ChromeDriver(options);

        driver.get("https://sushiwok.ru/spb/");

        WebElement webElement1 = driver.findElement(By.xpath("//div[span='Вкусные часы!']"));
        WebElement webElement2 = driver.findElement(By.xpath(".//div[span='Меню от Шефа']"));
        WebElement webElement3 = driver.findElement(By.xpath(".//div[span='Наборы и комбо']"));
        WebElement webElement4 = driver.findElement(By.xpath(".//div[span='Роллы']"));
        WebElement webElement5 = driver.findElement(By.xpath(".//div[span='Запеченные роллы']"));
        WebElement webElement6 = driver.findElement(By.xpath(".//div[span='Wok']"));
        WebElement webElement7 = driver.findElement(By.xpath(".//div[span='Суши']"));
        WebElement webElement8 = driver.findElement(By.xpath(".//div[span='Пицца']"));
        WebElement webElement9 = driver.findElement(By.xpath("//div[span='Вегетарианское меню']"));
        WebElement webElement10 = driver.findElement(By.xpath(".//div[span='Салаты и закуски']"));
        WebElement webElement11 = driver.findElement(By.xpath(".//div[span='Супы и горячее']"));
        WebElement webElement12 = driver.findElement(By.xpath(".//div[span='Бизнес-ланчи']"));
        WebElement webElement13 = driver.findElement(By.xpath(".//div[span='Десерты и напитки']"));
        WebElement webElement14 = driver.findElement(By.xpath(".//div[span='Дополнительно']"));

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

        WebElement topMenu1 = driver.findElement(By.xpath("//*[@href='/msk/akcii/']"));
        WebElement topMenu2 = driver.findElement(By.xpath("//*[@href='/msk/menu/']"));
        WebElement topMenu3 = driver.findElement(By.xpath("//*[@href='/msk/addresses/']"));
        WebElement topMenu4 = driver.findElement(By.xpath("//*[@href='/msk/delivery/']"));
        WebElement topMenu5 = driver.findElement(By.xpath("//*[@rel='noreferrer']"));
        WebElement topMenu6 = driver.findElement(By.xpath("//*[@href='/msk/vakansii/']"));


        topMenu1.click();
        topMenu2.click();
        topMenu3.click();
        topMenu4.click();
        topMenu5.click();
        topMenu6.click();
    };
}
