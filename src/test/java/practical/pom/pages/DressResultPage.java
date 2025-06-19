package practical.pom.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DressResultPage extends BasePage {

    @FindBy(xpath = "//span[text()='Short']")
    private WebElement shortCheckBox;

    public DressResultPage(WebDriver driver) {
        super(driver);
    }

    public void clickOnShortCheckBox() {
        shortCheckBox.click();
    }
}
