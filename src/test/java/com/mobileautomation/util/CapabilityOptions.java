package com.mobileautomation.util;

import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.ios.options.XCUITestOptions;

import java.io.File;
import java.util.Objects;

public class CapabilityOptions {

    public static UiAutomator2Options getAndroidCapabilities() {
        File file = new File(Objects.requireNonNull(CapabilityOptions.class)
                .getClassLoader()
                .getResource("android.wdio.native.app.v1.0.8.apk")
                .getFile()
        );
        UiAutomator2Options options = new UiAutomator2Options();
        options.setPlatformName("Android");
        options.setPlatformVersion("15");
        options.setAutomationName("UiAutomator2");
        options.setDeviceName("Test Device");
        options.setAppPackage("com.wdiodemoapp");
        options.setAppActivity(".MainActivity");
        return options;
    }

    public static XCUITestOptions getIOSCapabilities() {
        XCUITestOptions options = new XCUITestOptions();
        //set the configs
        return options;
    }
}
