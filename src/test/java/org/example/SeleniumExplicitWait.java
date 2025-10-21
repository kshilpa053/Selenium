package org.example;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.sql.Driver;
import java.time.Duration;

public class SeleniumExplicitWait {
    @Description("TC = Verify that with invalid login, error message is ")
    @Severity(SeverityLevel.BLOCKER)
    @Owner("Shilpa")
    @Test

    public void test_vwo_login_invalid(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://app.vwo.com");
        //driver.manage().window().maximize();//Maximize the window

        WebElement email_input_box = driver.findElement(By.id("login-username"));
        email_input_box.sendKeys("admin@admin.com");

        WebElement password_input_box = driver.findElement(By.name("password"));
        password_input_box.sendKeys("1222");

        WebElement button_submit = driver.findElement(By.id("js-login-btn"));
        button_submit.click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("notification-box-description")));

//        try{
//            Thread.sleep(3000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }

        WebElement error_message = driver.findElement(By.className("notification-box-description"));
        System.out.println(error_message.getText());

        Assert.assertEquals(error_message.getText(),"Your email, password, IP address or location did not match");

        try{
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.quit();

        //*[@id="login-username"]
        //<input type="email" class="text-input W(100%)" name="username"
        // placeholder="Enter email ID" id="login-username"
        // data-qa="hocewoqisi" data-gtm-form-interact-field-id="1">

        //unique id - name -classname-tagname-linkTest/partial(a tag)- css selector- xpath
        // if it dynamic or changes we try to avoid

        //custom attributes added by QA = data-qa test-id data-test-id data=cy="from-city (cypress)

    }




}
