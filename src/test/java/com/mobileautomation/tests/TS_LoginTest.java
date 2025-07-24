package com.mobileautomation.tests;

import com.mobileautomation.pages.PageLogin;
import com.mobileautomation.util.TestNGUtil;
import org.testng.annotations.Test;

public class TS_LoginTest extends TestNGUtil {

    @Test
    public void loginTest(){
        PageLogin pageLogin = pageHome.clickOnLoginNavIcon();
        pageLogin.fillUserName("testuser@testmail.com");
        pageLogin.fillPassword("12345678");
        pageLogin.clickLogin();
    }
}
