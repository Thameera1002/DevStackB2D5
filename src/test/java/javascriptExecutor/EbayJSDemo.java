package javascriptExecutor;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class EbayJSDemo {

    WebDriver driver;

    @BeforeMethod
    public void beforeMethod() {
        driver = WebDriverManager.chromedriver().create();
        driver.manage().window().maximize();
        driver.get("https://www.ebay.com/");
    }

    @Test
    public void ebayJSDemo() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        driver.findElement(By.id("gh-ac")).click();
        driver.findElement(By.id("gh-ac")).clear();
        driver.findElement(By.id("gh-ac")).sendKeys("iphone");
        Thread.sleep(3000);
        new Select(driver.findElement(By.id("gh-cat"))).selectByVisibleText("Cell Phones & Accessories");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//span[text()='Search']")).click();
        Thread.sleep(3000);
        boolean resultSetDisplay = driver.findElement(By.cssSelector("[class='srp-results srp-list clearfix']")).isDisplayed();
        Assert.assertTrue(resultSetDisplay);

    }

    @AfterMethod
    public void afterMethod() {
        driver.quit();
    }
}
