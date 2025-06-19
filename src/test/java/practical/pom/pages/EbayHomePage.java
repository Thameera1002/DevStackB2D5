package practical.pom.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class EbayHomePage extends BasePage {

    @FindBy(id = "gh-ac")
    private WebElement searchField;

    @FindBy(id = "gh-cat")
    private WebElement selectCategory;

    @FindBy(id = "gh-search-btn")
    private WebElement searchButton;

    public EbayHomePage(WebDriver driver) {
        super(driver);
    }


    public void typeOnSearchField(String searchText){
        searchField.sendKeys(searchText);
    }

    public void selectCategory(String category){
        new Select(selectCategory).selectByVisibleText(category);
    }

    public MobileResultPage clickOnSearchButton(){
        searchButton.click();
        return PageFactory.initElements(driver, MobileResultPage.class);
    }

}
