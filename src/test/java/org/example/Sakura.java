package org.example;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Sakura extends AbstractTest{
  /*  @Test
    void goTo(){
        Assertions.assertDoesNotThrow(() -> driver.navigate().to("https://ilovesakura.ru/spb"));

    }*/

    @Test
    void myActiontest() throws InstantiationException{
        new WebDriverWait(getDriver(), Duration.ofSeconds(10)).until(ExpectedConditions.urlContains("https://ilovesakura.ru/spb"));

        Actions search = new Actions(getDriver());

    }
}
