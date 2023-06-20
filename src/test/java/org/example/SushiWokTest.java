package org.example;


import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebElement;
import org.junit.jupiter.api.Test;
import javax.swing.*;
import java.time.Duration;

public class SushiWokTest extends AbstractTest {
    /*@Test
    void myTest(){
        getDriver().findElement(By.xpath("//a[span='Хит']"));
    }*/
@Test
    void myActiontest() throws InstantiationException{
    new WebDriverWait(getDriver(), Duration.ofSeconds(10)).until(ExpectedConditions.urlContains("https://sushiwok.ru/spb/"));


    Actions search = new Actions(getDriver());

    search.click(getDriver().findElement(By.xpath("//a[@href='/spb/menu/sety/']")))
            .click(getDriver().findElement(By.xpath("//a[@href='/spb/menu/sety/vkusnij-prazdnik-1-kg/']//div[@class='container-cart-button']")))
            .click(getDriver().findElement(By.xpath("//a[@href='/spb/menu/sety/drim-tim/']//div[@class='container-cart-button']")))
            .click(getDriver().findElement(By.xpath("//a[@href='/spb/menu/sety/big-fish-sum/']//div[@class='container-cart-button']")))
            .click(getDriver().findElement(By.xpath("//a[@class='main-menu__item main-menu__cart']")))
            .pause(2000)
            .build()
            .perform();

}

}
