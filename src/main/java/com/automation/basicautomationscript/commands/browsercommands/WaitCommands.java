package com.automation.basicautomationscript.commands.browsercommands;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class WaitCommands {
    public static void main(String[] args) {
        implicitWait();
    }

    public static void implicitWait() {
        WebDriver driver = WebDriverManager.chromedriver().create();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://demoqa.com/elements");
        driver.findElement(By.xpath("//span[text()='Text Box']")).click();
        System.out.println("clicked on text box");
    }
}
