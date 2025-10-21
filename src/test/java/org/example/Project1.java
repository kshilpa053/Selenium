package org.example;

import io.qameta.allure.Description;
import io.qameta.allure.Link;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Project1 {
    @Description("TC1 verify that a particular text exists on the katalon")
    @Link("https://bugz.atlassian.net/browse/VP-1")
    @Test
    public void test_verify_text_katalon() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://katalon-demo-cura.herokuapp.com/");
        Assert.assertEquals(driver.getTitle(), "CURA Healthcare Service");
        Assert.assertEquals(driver.getCurrentUrl(), "https://katalon-demo-cura.herokuapp.com/");
        System.out.println(driver.getPageSource());
        if (driver.getPageSource().contains("CURA Healthcare Service")) {
            Assert.assertTrue(true);
        } else {
            System.out.println("Test fail");
            Assert.fail();
        }
        driver.quit();
    }
}
