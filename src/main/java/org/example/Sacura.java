package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
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
    }
}
