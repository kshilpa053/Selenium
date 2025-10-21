package org.example;

import org.example.utils.CommonToAll;
import org.example.utils.WaitHelpers;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import javax.swing.*;
import java.util.List;

public class MakeMytripKeyactions extends CommonToAll {

    @Test
    public void keyactions(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.makemytrip.com/");
        driver.manage().window().maximize();

        WaitHelpers.waitForVisibility(driver, "//span[@data-cy='closeModal'])", 10);
        WebElement modal = driver.findElement(By.cssSelector("span[data-cy=\"closeModal\"]"));
        modal.click();

        new WaitHelpers().waitJVM(500);

        WebElement fromCity = driver.findElement(By.xpath("//input[@data-cy=\"fromCity\"]"));
        WebElement toCity = driver.findElement(By.xpath("//input[@data-cy=\"toCity\"]"));

        Actions actions = new Actions(driver);
        actions.moveToElement(fromCity).click().sendKeys("IXC").build().perform();

        List<WebElement> list_auto = driver.findElements(By.xpath("//li[@id=\"react-autowhatever-1-section-0-item-0\"]"));


            try{
                for (WebElement e : list_auto){
                    if(e.getText().contains("Chandigarh")){
                        e.click();
                    }
                }
            }
            catch (Exception e){
                e.printStackTrace();
                System.out.println("ok");
            }

    }

}
