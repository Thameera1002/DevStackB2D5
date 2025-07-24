package com.mobileautomation.pages;

import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageLogin extends BasePage{
    public PageLogin(WebDriver driver) {
        super(driver);
    }

    @AndroidFindBy(accessibility = "input-email")
    private WebElement tf_userName;

    @AndroidFindBy(accessibility = "input-password")
    private WebElement tf_password;

    @AndroidFindBy(accessibility = "button-LOGIN")
    private WebElement btn_login;
}
