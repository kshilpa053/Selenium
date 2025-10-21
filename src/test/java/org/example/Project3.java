package org.example;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.example.utils.CommonToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Project3 extends CommonToAll {
    @Description("Verify the email address is incorrect")
    @Owner("shilpa")
    @Test
    public void verify_email_address(){

        WebDriver driver = new ChromeDriver();
        openBrowser(driver, "https://app.vwo.com");
//        driver.get("https://app.vwo.com");
//        driver.manage().window().maximize();

//        try{
//            Thread.sleep(3000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
        sleep(driver);

        //WebElement trail_box = driver.findElement(By.partialLinkText("free trial"));
        WebElement trail_box = findElementByPartialText(driver, "trial");
        trail_box.click();
//        try{
//            Thread.sleep(3000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
        sleep(driver);

//        System.out.println(driver.getCurrentUrl());
//        Assert.assertTrue(driver.getCurrentUrl().contains("free-trial"));
//
//
//        try{
//            Thread.sleep(3000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }

        WebElement email = driver.findElement(By.id("page-v1-step1-email"));
        email.sendKeys("ssfw@ocoo");

       WebElement radio_button = driver.findElement(By.id("page-free-trial-step1-cu-gdpr-consent-checkbox"));
       radio_button.click();


//        try{
//            Thread.sleep(3000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
        sleep(driver);

        WebElement create_button = driver.findElement(By.tagName("button"));
        create_button.click();

         sleep(driver);

        WebElement error = driver.findElement(By.className("invalid-reason"));
        System.out.println(error.getText());

        Assert.assertEquals(error.getText(), "The email address you entered is incorrect.");

        closeBrowser(driver);
    }

}
