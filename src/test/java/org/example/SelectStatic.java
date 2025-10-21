package org.example;

import org.example.utils.CommonToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.Random;

public class SelectStatic extends CommonToAll {
    @Test
    public void dropdown(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/dropdown");
        driver.manage().window().maximize();
        WebElement elementSelect = driver.findElement(By.id("dropdown"));
        //Select class can be used only if select tag is present
        Select select = new Select(elementSelect);
        select.selectByVisibleText("Option 2");
        //select.selectByIndex(1);

        //Random random = new Random(2);
        closeBrowser(driver);

    }


}
