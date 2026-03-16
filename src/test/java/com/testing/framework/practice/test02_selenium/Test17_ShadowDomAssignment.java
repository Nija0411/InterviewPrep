package com.testing.framework.practice.test02_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Test17_ShadowDomAssignment {

    //https://www.youtube.com/watch?v=cN9pAD34sO8

    @Test
    public void shadowdomAssignment() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");

        WebDriver driver = new ChromeDriver(options);
        driver.get("https://letcode.in/shadow");

        /*normal element locator stratergy won't work with shadow elements
        driver.findElement(By.id("fname")).sendKeys("User123"); */

        //Step 1: Locate the shadow host
        WebElement host = driver.findElement(By.id("open-shadow"));

        //Step 2: Access the shadow root using host
        SearchContext shadowRoot = host.getShadowRoot();

        //Step 3: Locate the shadow element
        //xpath won't support in shadow DOM, css selector is recommended
        WebElement shadowElement = shadowRoot.findElement(By.cssSelector("#fname"));
        shadowElement.sendKeys("User123");


    }
}
