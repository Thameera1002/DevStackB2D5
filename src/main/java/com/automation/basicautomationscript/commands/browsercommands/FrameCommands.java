package com.automation.basicautomationscript.commands.browsercommands;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FrameCommands {
    public static void main(String[] args) throws InterruptedException {
        singleFrameTest();
    }

    public static void singleFrameTest() throws InterruptedException {
        WebDriver driver = WebDriverManager.chromedriver().create();
        driver.manage().window().maximize();
        driver.get("https://demo.automationtesting.in/Frames.html");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[text()='Single Iframe ']")).click();
        Thread.sleep(3000);
        driver.switchTo().frame("singleframe");
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("input")).sendKeys("test");
        Thread.sleep(3000);
        driver.switchTo().defaultContent();
        Thread.sleep(3000);
        System.out.println(driver.getTitle());
    }
}
