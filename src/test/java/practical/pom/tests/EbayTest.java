package practical.pom.tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import practical.pom.pages.BasePage;
import practical.pom.pages.DressResultPage;
import practical.pom.pages.EbayHomePage;
import practical.pom.pages.MobileResultPage;

public class EbayTest extends BaseTest{

    @Test
    public void searchMobilePhoneTest() throws InterruptedException {
        BasePage basePage = PageFactory.initElements(driver, BasePage.class);
        EbayHomePage ebayHomePage = basePage.initApp();
        Thread.sleep(1000);
        ebayHomePage.typeOnSearchField("mobile phones");
        ebayHomePage.selectCategory(" Cell Phones & Accessories");
        Thread.sleep(1000);
        MobileResultPage mobileResultPage = ebayHomePage.clickOnSearchButton();
        Thread.sleep(1000);
        mobileResultPage.clickAppleCheckBox();
    }

    @Test
    public void searchDressTest() throws InterruptedException {
        BasePage basePage = PageFactory.initElements(driver, BasePage.class);
        EbayHomePage ebayHomePage = basePage.initApp();
        Thread.sleep(1000);
        ebayHomePage.typeOnSearchField("dresses");
        ebayHomePage.selectCategory(" Clothing, Shoes & Accessories");
        Thread.sleep(1000);
        DressResultPage dressResultPage = ebayHomePage.clickOnSearchButton();
        Thread.sleep(1000);
        dressResultPage.clickOnShortCheckBox();
    }
}
