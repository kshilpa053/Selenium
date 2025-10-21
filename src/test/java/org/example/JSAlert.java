package org.example;

import org.example.utils.CommonToAll;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class JSAlert extends CommonToAll {
////button[@onclick="jsAlert()"]
    @Test
    public void JSalert(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.manage().window().maximize();
        //WebElement elementSelect = driver.findElement(By.cssSelector("button[onclick=\"jsAlert()\"]"));
        //WebElement elementConfirm = driver.findElement(By.xpath("//button[@onclick=\"jsConfirm()\"]"));
        //button[@onclick="jsPrompt()"]
        WebElement elementPrompt = driver.findElement(By.xpath("//button[@onclick=\"jsPrompt()\"]"));
        //elementSelect.click();
        //elementConfirm.click();
        elementPrompt.click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        wait.until(ExpectedConditions.alertIsPresent());

        Alert alert = driver.switchTo().alert();
        //alert.sendKeys("shilpa");
        //alert.accept();
        alert.dismiss();

////button[@onclick="jsConfirm()"]

        String result = driver.findElement(By.id("result")).getText();
//        Assert.assertEquals(result, "You successfully clicked an alert");
//        Assert.assertEquals(result, "You clicked: Ok");
//        Assert.assertEquals(result, "You clicked: Cancel");
      // Assert.assertEquals(result, "You entered: shilpa");
       Assert.assertEquals(result, "You entered: null");
closeBrowser(driver);
    }


}
