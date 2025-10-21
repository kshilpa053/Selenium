package org.example;

import org.example.utils.CommonToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ActionClass extends CommonToAll {

    @Test
    public void testActions(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.spicejet.com/");
        driver.manage().window().maximize();

        sleep(driver);

        WebElement fromInput = driver.findElement(By.xpath("//div[@data-testid=\"search-source-code\"]"));
        //WebElement fromInput = driver.findElement(By.xpath("//div[@data-testid=\"to=testID-origin\"]/div/div/input"));
        Actions actions = new Actions(driver);
        //move to element, click, sendkeys=BLR

        actions.moveToElement(fromInput).click().sendKeys("BLR").build().perform();

    }

    @Test
    public void testKeyboardaction(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://awesomeqa.com/practice.html");
        driver.manage().window().maximize();

        //Key Action
        WebElement firstName= driver.findElement(By.name("firstname"));
        Actions actions = new Actions(driver);

        actions.keyDown(Keys.SHIFT).sendKeys(firstName,"Testing").keyUp(Keys.SHIFT).build().perform();

        sleep(driver);
        closeBrowser(driver);
    }
}
