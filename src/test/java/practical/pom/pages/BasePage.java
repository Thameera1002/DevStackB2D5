package practical.pom.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    protected WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public EbayHomePage initApp(){
        driver.get("https://www.ebay.com/");
        return PageFactory.initElements(driver, EbayHomePage.class);
    }
}
