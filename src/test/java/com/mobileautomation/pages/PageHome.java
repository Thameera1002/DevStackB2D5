package com.mobileautomation.pages;

import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageHome extends BasePage{
    public PageHome(WebDriver driver) {
        super(driver);
    }

    @AndroidFindBy(accessibility = "Login")
    private WebElement nav_loginIcon;
}
