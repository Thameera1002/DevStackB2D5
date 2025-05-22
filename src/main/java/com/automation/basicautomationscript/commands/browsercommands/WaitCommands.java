package com.automation.basicautomationscript.commands.browsercommands;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WaitCommands {
    public static void main(String[] args) {
        //implicitWait();
        //explicitlyWait();
        fluentWait();
    }

    public static void implicitWait() {
        WebDriver driver = WebDriverManager.chromedriver().create();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://demoqa.com/elements");
        driver.findElement(By.xpath("//span[text()='Text Box']")).click();
        System.out.println("clicked on text box");
    }

    public static void explicitlyWait() {
        WebDriver driver = WebDriverManager.chromedriver().create();
        driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://demoqa.com/dynamic-properties");
        WebElement enableAfter = wait.until(ExpectedConditions.elementToBeClickable(By.id("enableAfter")));
        enableAfter.click();
        System.out.println("clicked on enable after");
    }

    public static void fluentWait() {
        WebDriver driver = WebDriverManager.chromedriver().create();
        driver.manage().window().maximize();

        FluentWait<WebDriver> wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(10))
                        .pollingEvery(Duration.ofSeconds(2))
                                .ignoring(NoSuchElementException.class);

        driver.get("https://demoqa.com/dynamic-properties");
        WebElement visibleAfter = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("visibleAfter")));
        visibleAfter.click();
        System.out.println(visibleAfter.getText());
    }
}
