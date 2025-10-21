package org.example;

import com.google.j2objc.annotations.Weak;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class fileupload {
    @Test
    public void fileupload(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://awesomeqa.com/selenium/upload.html");

        WebElement upload = driver.findElement(By.id("fileToUpload"));
        String userdir = System.getProperty("user.dir");
 //D:\IdeaProjects\Selenium\src\test\java\org\example\test
        // String path = userdir + "src/test/java/org/example/test";
        upload.sendKeys(userdir);
        driver.findElement(By.name("submit")).click();


    }

}
