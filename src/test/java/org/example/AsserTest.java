package org.example;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebElement;

import javax.swing.*;
import java.time.Duration;

import static org.example.AbstractTest.*;

public class AsserTest extends AbstractTest {
    @Test
    void myTest(){
        getDriver().findElement(By.xpath("//a[span='Хит']"));
    }
@Test
    void myActiontest() throws InstantiationException{
    new WebDriverWait(getDriver(), Duration.ofSeconds(10)).until(ExpectedConditions.urlContains("https://3332222.ru/"));
    Assertions.assertTrue(getDriver().getTitle().contains(""));

    Actions search = new Actions(getDriver());

    search.click(getDriver().findElement(By.xpath("//a[span='Хит']")))
            .pause(1000l)
            .click(getDriver().findElement(By.xpath("//a[span='Пицца']")))
            .build()
            .perform();

}

}
