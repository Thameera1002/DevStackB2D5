package com.automation.basicautomationscript.commands.browsercommands;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MouseActionCommands {
    public static void main(String[] args) {
        testDoubleClickAction();
    }

    public static void testDoubleClickAction() {
        WebDriver driver = WebDriverManager.chromedriver().create();
        driver.manage().window().maximize();
        driver.get("https://unixpapa.com/js/testmouse.html");
        WebElement clickHereToTest = driver.findElement(By.linkText("click here to test"));
        Actions actions = new Actions(driver);
        actions.doubleClick(clickHereToTest).perform();

        WebElement textarea = driver.findElement(By.tagName("textarea"));
        String value = textarea.getAttribute("value");
        System.out.println(value);
    }
}
