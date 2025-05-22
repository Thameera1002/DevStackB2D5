package com.automation.basicautomationscript.commands.browsercommands;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Set;

public class WindowCommands {
    public static void main(String[] args) throws InterruptedException {
        newTabbedWindow();
    }

    public static void newTabbedWindow() throws InterruptedException {
        WebDriver driver = WebDriverManager.chromedriver().create();
        driver.manage().window().maximize();
        driver.get("https://demo.automationtesting.in/Windows.html");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[text()='Open New Tabbed Windows ']")).click();
        Thread.sleep(3000);

        //Store the parent window
        String parentWindow = driver.getWindowHandle();
        System.out.println("Parent Window: " + parentWindow);

        driver.findElement(By.xpath("//button[text()='    click   ']")).click();
        Thread.sleep(3000);
        System.out.println(driver.getTitle());

        Set<String> allWindows = driver.getWindowHandles();
        for (String window : allWindows) {
            if (!window.equals(parentWindow)) {
                driver.switchTo().window(window);
                break;
            }
        }
        Thread.sleep(3000);
        System.out.println(driver.getTitle());
        Thread.sleep(3000);
        driver.switchTo().window(parentWindow);
        Thread.sleep(3000);
        System.out.println(driver.getTitle());
    }
}
