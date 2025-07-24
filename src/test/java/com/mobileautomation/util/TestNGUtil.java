package com.mobileautomation.util;

import com.mobileautomation.pages.PageHome;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import java.net.MalformedURLException;
import java.net.URL;

public class TestNGUtil {
    protected WebDriver driver;
    public PageHome pageHome;

    @Parameters("platformName")
    @BeforeTest
    public void initCapabilities(String platformName) throws MalformedURLException {
        URL url = new URL("http://127.0.0.1:4723");
        if(platformName.equalsIgnoreCase("Android")){
            driver = new AndroidDriver(url,CapabilityOptions.getAndroidCapabilities());
        }else {
            driver = new IOSDriver(url,CapabilityOptions.getIOSCapabilities());
        }
    }

    @BeforeClass
    public void initApp(){
        pageHome = new PageHome(driver);
        PageFactory.initElements(new AppiumFieldDecorator(driver), pageHome);
    }
}
