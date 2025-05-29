import com.propertyex.ReadWriteProperty;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class TestNGMain {
    WebDriver driver;
    ReadWriteProperty readWriteProperty = new ReadWriteProperty();

    @BeforeMethod
    public void beforeMethod() throws IOException {
        driver = WebDriverManager.chromedriver().create();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get(readWriteProperty.loadProperty("url"));
    }

    @Test
    public void test() throws InterruptedException {
        driver.findElement(By.id("gh-ac")).click();
        driver.findElement(By.id("gh-ac")).clear();
        driver.findElement(By.id("gh-ac")).sendKeys("iphone");
        Thread.sleep(2000);
        new Select(driver.findElement(By.id("gh-cat"))).selectByVisibleText("Cell Phones & Accessories");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[text()='Search']")).click();
        Thread.sleep(2000);
    }

    @AfterMethod
    public void afterMethod() {
        driver.quit();
    }
}
