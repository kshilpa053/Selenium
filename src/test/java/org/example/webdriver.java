package org.example;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import  org.openqa.selenium.edge.EdgeDriver;

public class webdriver {
    public static void main(String[] args) {
        WebDriver Driver = new ChromeDriver();
        Driver.get("https://chatgpt.com/");
        System.out.println(Driver.getTitle());
        System.out.println(Driver.getCurrentUrl());
        System.out.println(Driver.getPageSource());

        Driver.quit();

    }
}
