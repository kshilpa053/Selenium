package org.example;

import io.qameta.allure.Description;
import org.example.utils.CommonToAll;
import org.example.utils.WaitHelpers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Project4 extends CommonToAll {

    @Description
    @Test
    public void testCloseModal() {
        WebDriver driver = new ChromeDriver();
        //WebDriver driver = new EdgeDriver();
        driver.navigate().to("https://www.makemytrip.com/");
        System.out.println(driver.getTitle());

        sleep(driver);

        new WaitHelpers().waitForVisibility(driver,"//span[@data-cy=\"closeModal\"]",5);

        WebElement closeModal = driver.findElement(By.xpath("//span[@data-cy='closeModal']"));
       // WebElement closeModal = driver.findElement(By.className("commonModal__close"));
        closeModal.click();

        closeBrowser(driver);

    }
}
