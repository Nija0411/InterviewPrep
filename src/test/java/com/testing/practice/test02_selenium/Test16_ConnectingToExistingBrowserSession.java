package com.testing.practice.test02_selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Test16_ConnectingToExistingBrowserSession {

    //How do you use an existing browser session for automation?
    //By launching the chrome in debugger mode

    @Test
    public void connectExistingBrowserSession() {
//        ChromeOptions options = new ChromeOptions();
//        options.setExperimentalOption("debuggerAddress", "127.0.0.1:9222");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com");
        driver.get("https://www.instagram.com/");
        driver.get("https://www.facebook.com/");
        driver.get("https://www.youtube.com/");
    }
}
