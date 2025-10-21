package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class seleniumImplicitWait {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        //Implicit  wait never use
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

        driver.get("https://app.vwo.com");
    }
}
