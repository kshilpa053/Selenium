package org.example;

import org.example.utils.CommonToAll;
import org.example.utils.WaitHelpers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class SVG extends CommonToAll {
    @Test
    public void flipkartsvg(){

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.flipkart.com/search");

        WebElement inputbox = driver.findElement(By.xpath("//input[@placeholder=\"Search for products, brands and more\"]"));
        inputbox.sendKeys("macmini");
        List<WebElement> SVGElements = driver.findElements(By.xpath("//*[name()=\"svg\"]"));
        SVGElements.get(0).click();

        WaitHelpers waitHelpers = new WaitHelpers();
        waitHelpers.waitForVisibility(driver,"//div[contains(@data-id,\"CPU\") or contains(@data-id,\"MP\")]/div/a[2]", 5);

        List<WebElement> titlesResults = driver.findElements(By.xpath("//div[contains(@data-id,\"CPU\") or contains(@data-id,\"MP\")]/div/a[2]"));
        for(WebElement title : titlesResults){
            System.out.println(title.getText());
        }

        WebElement nextbutton = driver.findElement(By.xpath("//a[normalize-space()=\"Next\"]"));
        nextbutton.click();
        while(nextbutton.isDisplayed()){
            WebElement nextbutton2 = driver.findElement(By.xpath("//a[normalize-space()=\"Next\"]"));
            nextbutton2.click();

            WaitHelpers waitHelpers2 = new WaitHelpers();
            waitHelpers2.waitForVisibility(driver,"//div[contains(@data-id,\"CPU\") or contains(@data-id,\"MP\")]/div/a[2]", 20);

            List<WebElement> titlesResults2 = driver.findElements(By.xpath("//div[contains(@data-id,\"CPU\") or contains(@data-id,\"MP\")]/div/a[2]"));
            for(WebElement title : titlesResults2){
                System.out.println(title.getText());
            }

        }

        closeBrowser(driver);


}

}
