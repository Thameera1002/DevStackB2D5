package practical.pom.utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserFactory {
    private static BrowserFactory browserFactory;

    public BrowserFactory() {
    }

    public static BrowserFactory getBrowserFactory() {
        if (browserFactory == null) {
            browserFactory = new BrowserFactory();
        }
        return browserFactory;
    }

    ThreadLocal<WebDriver> webDriverThreadLocal = ThreadLocal.withInitial(()->{
        String browser = System.getProperty("browser", "chrome");
        WebDriver driver = switch (browser){
            case "chrome" -> WebDriverManager.chromedriver().create();
            case "firefox" -> WebDriverManager.firefoxdriver().create();
            default -> throw new RuntimeException("Unsupported browser: " + browser);
        };
        driver.manage().window().maximize();
        return driver;
    });

    public WebDriver getWebDriver() {
        return webDriverThreadLocal.get();
    }

    public void quitDriver() {
        if(getWebDriver() != null) {
            getWebDriver().quit();
        }
        webDriverThreadLocal.remove();
    }
}
