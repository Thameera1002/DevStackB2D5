package com.automation.basicautomationscript.commands.browsercommands;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BrowserCommands {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverManager.chromedriver().create();
        driver.manage().window().maximize();
        driver.get("https://www.google.com");
        driver.findElement(By.xpath("//a[text()='Privacy']")).click();
        Thread.sleep(2000);
        String currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl);
        String title = driver.getTitle();
        System.out.println(title);
        driver.close();
    }
}
