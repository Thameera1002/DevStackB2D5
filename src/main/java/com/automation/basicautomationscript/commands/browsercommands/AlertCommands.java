package com.automation.basicautomationscript.commands.browsercommands;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertCommands {
    public static void main(String[] args) throws InterruptedException {
//        alertWithOK();
//        alertWithOkAndCancel();
        alertWithTextBox();
    }

    public static void alertWithOK() throws InterruptedException {
        WebDriver driver = WebDriverManager.chromedriver().create();
        driver.manage().window().maximize();
        driver.get("https://demo.automationtesting.in/Alerts.html");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[text()='Alert with OK ']")).click();
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("[class='btn btn-danger']")).click();
        Thread.sleep(3000);
        Alert alert = driver.switchTo().alert();
        System.out.println(alert.getText());
        alert.accept();
        Thread.sleep(3000);
    }

    public static void alertWithOkAndCancel() throws InterruptedException {
        WebDriver driver = WebDriverManager.chromedriver().create();
        driver.manage().window().maximize();
        driver.get("https://demo.automationtesting.in/Alerts.html");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']")).click();
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("[class='btn btn-primary']")).click();
        Thread.sleep(3000);
        Alert alert = driver.switchTo().alert();
        //alert.accept();
        alert.dismiss();
        System.out.println(driver.findElement(By.id("demo")).getText());

    }

    public static void alertWithTextBox() throws InterruptedException {
        WebDriver driver = WebDriverManager.chromedriver().create();
        driver.manage().window().maximize();
        driver.get("https://demo.automationtesting.in/Alerts.html");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[text()='Alert with Textbox ']")).click();
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("[class='btn btn-info']")).click();
        Thread.sleep(3000);
        Alert alert = driver.switchTo().alert();
        System.out.println(alert.getText());
        alert.sendKeys("Hello World");
        Thread.sleep(3000);
        alert.accept();
        System.out.println(driver.findElement(By.id("demo1")).getText());
    }
}
