package testThreadLocal;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseTest {


    @BeforeMethod
    public void init(){
        ThreadLocalWebDriverManager.createDriver("chrome");
    }

    @AfterMethod
    public void tearDown(){
        ThreadLocalWebDriverManager.closeDriver();
    }
}
