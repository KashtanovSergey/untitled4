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

        WebElement webElement1 = driver.findElement(By.xpath("//a[@href='/spb/menu/vkusnii-chasi/']"));
        WebElement webElement2 = driver.findElement(By.xpath("//a[@href='/spb/menu/sety/']"));
        WebElement webElement3 = driver.findElement(By.xpath("//a[@href='/spb/menu/rolly/']"));
        WebElement webElement4 = driver.findElement(By.xpath("//a[@href='/spb/menu/zapechennye-rolly/']"));
        WebElement webElement5 = driver.findElement(By.xpath("//a[@href='/spb/menu/kitajskaja-lapsha-wok/']"));
        WebElement webElement6 = driver.findElement(By.xpath("//a[@href='/spb/menu/sushi/']"));
        WebElement webElement7 = driver.findElement(By.xpath("//a[@href='/spb/menu/vegetarianskie-blyuda/']"));
        WebElement webElement8 = driver.findElement(By.xpath("//a[@href='/spb/menu/pizza/']"));
        WebElement webElement9 = driver.findElement(By.xpath("//a[@href='/spb/menu/salaty/']"));
        WebElement webElement10 = driver.findElement(By.xpath("//a[@href='/spb/menu/supy-i-goryachee/']"));
        WebElement webElement11 = driver.findElement(By.xpath("//a[@href='/spb/menu/biznes-lanchi/']"));
        WebElement webElement12 = driver.findElement(By.xpath("//a[@href='/spb/menu/deserty/']"));
        WebElement webElement13 = driver.findElement(By.xpath("//a[@href='/spb/menu/dopolnitelno/']"));

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

        WebElement topMenu1 = driver.findElement(By.xpath("//a[@href='/spb/akcii/']"));
        WebElement topMenu2 = driver.findElement(By.xpath("//a[@href='/spb/menu/']"));
        WebElement topMenu3 = driver.findElement(By.xpath("//a[@href='/spb/addresses/']"));
        WebElement topMenu4 = driver.findElement(By.xpath("//a[@href='/spb/delivery/']"));
        WebElement topMenu5 = driver.findElement(By.xpath("//a[@href='/spb/vakansii/']"));


        topMenu1.click();
        topMenu2.click();
        topMenu3.click();
        topMenu4.click();
        topMenu5.click();
    };
}
