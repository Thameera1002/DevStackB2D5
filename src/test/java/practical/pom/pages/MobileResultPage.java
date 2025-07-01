package practical.pom.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MobileResultPage extends BasePage {

    @FindBy(xpath = "//span[text()='Apple..']")
    private WebElement appleCheckBox;

    public MobileResultPage(WebDriver driver) {
        super(driver);
    }

    public void clickAppleCheckBox() {
        appleCheckBox.click();
    }
}
