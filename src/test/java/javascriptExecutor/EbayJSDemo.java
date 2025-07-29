package javascriptExecutor;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
        //Just assume that below sendkeys is not working with standard method
        //driver.findElement(By.id("gh-ac")).sendKeys("iphone");

        //So, we create webelement which we need to type
        WebElement searchText = driver.findElement(By.id("gh-ac"));
        //using arguments[0].value='<inout_value>' , type on that web element
        js.executeScript("arguments[0].value='iphone'",searchText);

        Thread.sleep(3000);
        new Select(driver.findElement(By.id("gh-cat"))).selectByVisibleText("Cell Phones & Accessories");
        Thread.sleep(3000);
        //Just assume that below button click is not working with standard method
        //driver.findElement(By.xpath("//span[text()='Search']")).click();

        //So, we create webelement which we need to click
        WebElement searchButton = driver.findElement(By.xpath("//span[text()='Search']"));
        //using "arguments[0].click()" , click on that web element
        js.executeScript("arguments[0].click()", searchButton);

        Thread.sleep(3000);
        boolean resultSetDisplay = driver.findElement(By.cssSelector("[class='srp-results srp-list clearfix']")).isDisplayed();
        Assert.assertTrue(resultSetDisplay);

    }

    @AfterMethod
    public void afterMethod() {
        driver.quit();
    }
}
