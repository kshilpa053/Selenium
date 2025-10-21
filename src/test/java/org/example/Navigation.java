package org.example;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Navigation {
    @Description("Open URL")
    @Test
    public void testNavigation(){

        WebDriver driver = new ChromeDriver();
        //driver.get("https://google.com");
        driver.navigate().to("https://chatgpt.com/");
        driver.navigate().back();
        driver.navigate().refresh();
        driver.navigate().forward();
        driver.quit();//Closes entire browser sessions and all tabs
        //driver.close();//Closes only the current tab


    }
}
