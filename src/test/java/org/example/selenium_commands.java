package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class selenium_commands {
    public static void main(String[] args) {
        WebDriver d1 = new ChromeDriver();
        d1.get("https://chatgpt.com/");
        d1.manage().window().maximize();
        //d1.manage().window().minimize();
        d1.quit();


    }
}
