package practical.pom.tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import practical.pom.pages.BasePage;
import practical.pom.pages.EbayHomePage;
import practical.pom.pages.MobileResultPage;

public class EbayTest extends BaseTest{

    @Test
    public void searchMobilePhoneTest(){
        BasePage basePage = PageFactory.initElements(driver, BasePage.class);
        EbayHomePage ebayHomePage = basePage.initApp();
        ebayHomePage.typeOnSearchField("mobile phones");
        ebayHomePage.selectCategory(" Cell Phones & Accessories");
        MobileResultPage mobileResultPage = ebayHomePage.clickOnSearchButton();
        mobileResultPage.clickAppleCheckBox();
    }
}
