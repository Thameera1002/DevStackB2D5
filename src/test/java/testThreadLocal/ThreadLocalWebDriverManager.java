package testThreadLocal;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.NoSuchDriverException;

public class ThreadLocalWebDriverManager {
    private static ThreadLocal<WebDriver> threadLocalDriver = new ThreadLocal<>();

    public static void createDriver(String browser) {
        WebDriver driver = null;
        switch (browser) {
            case "chrome":
                driver = WebDriverManager.chromiumdriver().create();
                break;
            case "firefox":
                driver = WebDriverManager.firefoxdriver().create();
                break;
            default:
                throw new NoSuchDriverException("Unsupported browser: " + browser);
        }
        threadLocalDriver.set(driver);
    }

    public static WebDriver getDriver() {
        return threadLocalDriver.get();
    }

    public static void closeDriver() {
        if (getDriver() != null) {
            getDriver().quit();
            threadLocalDriver.remove();
        }
    }
}
