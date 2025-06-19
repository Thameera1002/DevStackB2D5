package practical.pom.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DressResultPage {

    @FindBy(xpath = "//span[text()='Short']")
    private WebElement shortCheckBox;

    public void clickOnShortCheckBox() {
        shortCheckBox.click();
    }
}
