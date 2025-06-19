package practical.pom.tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import practical.pom.utils.BrowserFactory;

public class BaseTest {
    protected WebDriver driver;

    protected BrowserFactory browserFactory = BrowserFactory.getBrowserFactory();

    @BeforeMethod
    public void init(){
        driver = browserFactory.getWebDriver();
    }

    @AfterMethod
    public void tearDown(){
        browserFactory.quitDriver();
    }
}
