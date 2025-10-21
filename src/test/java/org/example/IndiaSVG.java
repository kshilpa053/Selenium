package org.example;

import org.example.utils.CommonToAll;
import org.example.utils.WaitHelpers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class IndiaSVG extends CommonToAll {
    @Test
    public void tripura(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amcharts.com/svg-maps/?map=india");

        WaitHelpers waitHelpers = new WaitHelpers();
        //waitHelpers.waitJVM(3000);
        waitHelpers.waitForVisibility(driver,"//*[name()=\"svg\"]/*[name()=\"g\"][7]/*[name()=\"g\"]/*[name()=\"g\"]/*[name()=\"path\"]",5);

        List<WebElement> states = driver.findElements(By.xpath("//*[name()=\"svg\"]/*[name()=\"g\"][7]/*[name()=\"g\"]/*[name()=\"g\"]/*[name()=\"path\"]"));
        for (WebElement state : states){
            System.out.println(state.getDomAttribute("aria-label"));
        }

        closeBrowser(driver);
    }
}
