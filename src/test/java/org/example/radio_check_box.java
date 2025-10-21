package org.example;

import org.example.utils.CommonToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class radio_check_box extends CommonToAll {

    @Test
    public void InputBox(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://awesomeqa.com/practice.html");

        WebElement firstname = driver.findElement(By.name("firstname"));
        firstname.sendKeys("testing");

        WebElement radiobox = driver.findElement(By.id("exp-1"));
        radiobox.click();

        WebElement checkbox = driver.findElement(By.name("profession"));
        checkbox.click();

        closeBrowser(driver);


    }
}
