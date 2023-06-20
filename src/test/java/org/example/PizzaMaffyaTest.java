package org.example;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;


import java.time.Duration;

public class PizzaMaffyaTest extends AbstractTest{
    /*@Test
    public void goTo(){
        Assertions.assertDoesNotThrow(()-> driver.navigate().to("https://3332222.ru/"));
    }*/
    @Test
    void myActiontest() throws InstantiationException{
        new WebDriverWait(getDriver(), Duration.ofSeconds(10)).until(ExpectedConditions.urlContains("https://3332222.ru/"));

        Actions search = new Actions(getDriver());

        search.click(getDriver().findElement(By.xpath("//a[span='Наборы']")))
                .click(getDriver().findElement(By.xpath("//a[@href='/menu/nabory/italyanskij-nabor/']//*[@class=\"red-btn cart new-btn\"]")))
                .click(getDriver().findElement(By.xpath("//a[@href='/menu/nabory/rimskie-kanikuli/']//*[@class='red-btn cart new-btn']")))
                .click(getDriver().findElement(By.xpath("//a[@href='/menu/nabory/slavnie-parni-cheese/']//*[@class='red-btn cart new-btn']")))
                .click(getDriver().findElement(By.xpath("//a[@href='/menu/nabory/korporativnij-cheese/']//*[@class='red-btn cart new-btn']")))
                .pause(2000)
                .build()
                .perform();
    }
}
