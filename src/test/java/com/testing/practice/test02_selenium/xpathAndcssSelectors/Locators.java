package com.testing.practice.test02_selenium.xpathAndcssSelectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Locators {

    @Test
    public void testLocators() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");

        //By ID
        By id = By.id("id=\"user-name\"");

        //class="submit-button btn_action" -- 2 classes r there locate using any 1
        By className = By.className("submit-button");

        By name = By.name("name=\"password\"");

        By tagName = By.tagName("button");

        // <a href="https://example.com/login">Login</a>
        By linkText = By.linkText("Login");
        By partialLinkText = By.partialLinkText("Log");

    }
}
