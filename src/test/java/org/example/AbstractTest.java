package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.junit.jupiter.api.Assertions.*;
import java.util.concurrent.TimeUnit;
public abstract class AbstractTest {
    private static WebDriver driver;
    private static Long time = 5l;

    @BeforeAll
    static void init(){
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        options.addArguments("--start-maximized");
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);

        }

        @BeforeEach
    void goTo(){
            Assertions.assertDoesNotThrow(() -> driver.navigate().to("https://3332222.ru/"), "Страница не доступна");

    }

    @AfterAll
    static void close(){
        driver.quit();
    }

    public static WebDriver getDriver(){return driver;}

}
