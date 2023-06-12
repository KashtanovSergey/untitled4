package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Sacura {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        ChromeOptions optionsn = new ChromeOptions();
        optionsn.addArguments("--incognito");
        optionsn.addArguments("----start-maximized");

        WebDriver driver = new ChromeDriver(optionsn);
        driver.get("https://ilovesakura.ru/spb");

        WebElement webElement1 = driver.findElement(By.xpath("//a[@href='/spb/menu/nabory']"));
        WebElement webElement2 = driver.findElement(By.xpath("//a[@href='/spb/menu/korejskaya-kukhnya']"));
        WebElement webElement3 = driver.findElement(By.xpath("//a[@href='/spb/menu/rolly']"));
        WebElement webElement4 = driver.findElement(By.xpath("//a[@href='/spb/menu/zapechennye-rolly']"));
        WebElement webElement5 = driver.findElement(By.xpath("//a[@href='/spb/menu/sushi']"));
        WebElement webElement6 = driver.findElement(By.xpath("//a[@href='/spb/menu/picca']"));
        WebElement webElement7 = driver.findElement(By.xpath("//a[@href='/spb/menu/wok']"));
        WebElement webElement8 = driver.findElement(By.xpath("//a[@href='/spb/menu/biznes-lanch_new']"));
        WebElement webElement9 = driver.findElement(By.xpath("//a[@href='/spb/menu/streetfood']"));
        WebElement webElement10 = driver.findElement(By.xpath("//a[@href='/spb/menu/goryachee']"));
        WebElement webElement11 = driver.findElement(By.xpath("//a[@href='/spb/menu/zakuski']"));
        WebElement webElement12 = driver.findElement(By.xpath("//a[@href='/spb/menu/supy']"));
        WebElement webElement13 = driver.findElement(By.xpath("//a[@href='/spb/menu/ramen-up']"));
        WebElement webElement14 = driver.findElement(By.xpath("//a[@href='/spb/menu/deserty']"));
        WebElement webElement15 = driver.findElement(By.xpath("//a[@href='/spb/menu/wok']"));
        WebElement webElement16 = driver.findElement(By.xpath("//a[@href='/spb/menu/napitki']"));
        WebElement webElement17 = driver.findElement(By.xpath("//a[@href='/spb/menu/pirogi']"));
        WebElement webElement18 = driver.findElement(By.xpath("//a[@href='/spb/menu/sousy']"));
        WebElement webElement19 = driver.findElement(By.xpath("//a[@href='/spb/about']"));
        WebElement webElement20 = driver.findElement(By.xpath("//a[@href='/spb/reviews']"));
        WebElement webElement21 = driver.findElement(By.xpath("//a[@href='/spb/vacancies']"));

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
        webElement15.click();
        webElement16.click();
        webElement17.click();
        webElement18.click();
        webElement19.click();
        webElement20.click();
        webElement21.click();

        //***верхнее меню***

        WebElement topMenu1 = driver.findElement(By.xpath("//a[@href='/spb/akcii']"));
        WebElement topMenu2 = driver.findElement(By.xpath("//a[@href='/spb/dostavka']"));

        topMenu1.click();
        topMenu2.click();



    }
}
