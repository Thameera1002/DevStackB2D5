package practical.pom.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class EbayHomePage{

    @FindBy(id = "gh-ac")
    private WebElement searchField;

    @FindBy(id = "gh-cat")
    private WebElement selectCategory;

    @FindBy(id = "gh-search-btn")
    private WebElement searchButton;


    public void typeOnSearchField(String searchText){
        searchField.sendKeys(searchText);
    }

    public void selectCategory(String category){
        new Select(selectCategory).selectByVisibleText(category);
    }

    public void clickOnSearchButton(){
        searchButton.click();
    }

}
