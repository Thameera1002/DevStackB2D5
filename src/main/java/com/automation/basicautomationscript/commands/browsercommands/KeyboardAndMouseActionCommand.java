package com.automation.basicautomationscript.commands.browsercommands;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class KeyboardAndMouseActionCommand {
    public static void main(String[] args) throws InterruptedException {
        keyboardMouseCombinedAction();
    }

    public static void keyboardMouseCombinedAction() throws InterruptedException {
        WebDriver driver = WebDriverManager.chromedriver().create();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/droppable");
        WebElement draggable = driver.findElement(By.id("draggable"));
        WebElement droppable = driver.findElement(By.id("droppable"));

        Actions actions = new Actions(driver);
        actions.keyDown(Keys.SHIFT)
                .clickAndHold(draggable)
                .moveToElement(droppable)
                .release()
                .keyUp(Keys.SHIFT)
                .perform();

        Thread.sleep(5000);
        String text = droppable.getText();
        assert text.contains("Dropped!") :"Drag and drop failed !";
    }
}
