package org.example;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import static org.assertj.core.api.Assertions.*;

public class TestNG_Assertion {

    @Description("Verify the the title is visible")
    @Test
    public void test_selenium_assertion(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://chatgpt.com/");
        //TestNG assertions
        Assert.assertEquals(driver.getCurrentUrl(), "https://chatgpt.com/");

        //AssertJ assertions
        assertThat(driver.getCurrentUrl()).isNotBlank().isNotNull().isEqualTo("https://chatgpt.com/");

        //RestAssured assertions can't be used

        driver.quit();

    }
}
