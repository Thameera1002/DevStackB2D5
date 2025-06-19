package practical.pom.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MobileResultPage {

    @FindBy(xpath = "//span[text()='Apple']")
    private WebElement appleCheckBox;

    public void clickAppleCheckBox() {
        appleCheckBox.click();
    }
}
