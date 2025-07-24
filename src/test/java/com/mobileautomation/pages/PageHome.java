package com.mobileautomation.pages;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class PageHome extends BasePage{
    public PageHome(WebDriver driver) {
        super(driver);
    }

    @AndroidFindBy(accessibility = "Login")
    private WebElement nav_loginIcon;

    public PageLogin clickOnLoginNavIcon(){
        nav_loginIcon.click();
        PageLogin pgLogin = new PageLogin(driver);
        PageFactory.initElements(new AppiumFieldDecorator(driver), pgLogin);
        return pgLogin;
    }
}
