package com.testing.practice.test02_selenium.xpathAndcssSelectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class XpathPractice {

    @Test
    public void testXpathPractice() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com");

        //Locators (ID, Class, Name, Partial LinkText, LinkText, TagName, Xpath, CSS Selctor

        //By Attribute name
        By username = By.xpath("//input[@name='username']");
        By loginButtonType = By.xpath("//button[@type='submit']");

        //Using contains() & indexing
        By usernameContains = By.xpath("//input[contains(@class,'oxd-input')])[1]");



    }
}

