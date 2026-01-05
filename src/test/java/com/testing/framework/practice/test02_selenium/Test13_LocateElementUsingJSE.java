package com.testing.framework.practice.test02_selenium;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test13_LocateElementUsingJSE {
    WebDriver driver;
    JavascriptExecutor jse;

    @BeforeTest
    public void openBrowser() {
        driver = new ChromeDriver();
        driver.get("https://www.seleniumeasy.com/test/");

        jse = (JavascriptExecutor) driver;
    }

    //Locate using class
    @Test
    public void testLocators() {
        // class="ParkWebLayout_domain__IKYAX"
        String seleniumEasy = (String) jse.executeScript("return document.querySelector('.ParkWebLayout_domain__IKYAX');");
        System.out.println(seleniumEasy);
    }

    //Locate using id
    @Test
    public void testId() {
        //id="getButtonBoxLink"
        jse.executeScript("return document.getElementById('getButtonBoxLink').click();");
    }
}
