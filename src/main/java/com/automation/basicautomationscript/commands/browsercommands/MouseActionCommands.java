package com.automation.basicautomationscript.commands.browsercommands;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;

public class MouseActionCommands {
    public static void main(String[] args) throws InterruptedException {
//        testDoubleClickAction();
//        testContextClickAction();
//        testSliderAction();
        testMouseHover();
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

    public static void testContextClickAction() throws InterruptedException {
        WebDriver driver = WebDriverManager.chromedriver().create();
        driver.manage().window().maximize();
        driver.get("https://www.lambdatest.com/selenium-playground/context-menu");
        WebElement rightClickBox = driver.findElement(By.id("hot-spot"));
        Actions actions = new Actions(driver);
        Thread.sleep(5000);
        actions.contextClick(rightClickBox).perform();
        Alert alert = driver.switchTo().alert();
        System.out.println(alert.getText());
        alert.accept();
    }

    public static void testSliderAction(){
        WebDriver driver = WebDriverManager.chromedriver().create();
        driver.manage().window().maximize();
        driver.get("https://www.lambdatest.com/selenium-playground/drag-drop-range-sliders-demo");
        WebElement slider = driver.findElement((By.cssSelector("input[value='5']")));
        WebElement value = driver.findElement((By.id("range")));
        System.out.println("Initial Value : "+value.getText());
        Point pointer = slider.getLocation();
        int x = pointer.getX();
        int y = pointer.getY();
        System.out.println("X coordination : "+x+"\nY coordination : "+y);
        Actions actions = new Actions(driver);
        actions.clickAndHold(slider).moveByOffset(5,0).release().build().perform();
        System.out.println("New Value : "+value.getText());
    }

    public static void testMouseHover(){
        WebDriver driver = WebDriverManager.chromedriver().create();
        driver.manage().window().maximize();
        driver.get("https://ecommerce-playground.lambdatest.io/");
        WebElement megaMenu = driver.findElement(By.xpath("//span[contains(text(),'Mega Menu')]"));
        Actions actions = new Actions(driver);
        actions.moveToElement(megaMenu).build().perform();
        WebElement apple = driver.findElement(By.linkText("Apple"));
        apple.click();
        System.out.println(driver.findElement(By.xpath("//h1[text()='Apple']")).getText());
    }
}
