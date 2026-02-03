package com.testing.framework.practice.test02_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Test17_ShadowDomAssignment {

    @Test
    public void shadowdomAssignment() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");

        WebDriver driver = new ChromeDriver(options);
        driver.get("https://jatin99.github.io/ShadowDomAssignment/");

        By inputTextBoxLocator = By.cssSelector("input#email");
        WebElement inputBox = driver.findElement(inputTextBoxLocator);
        inputBox.sendKeys("Hello");

        By divHeaderLocator = By.cssSelector("div.header");
        WebElement divHeader = driver.findElement(divHeaderLocator);
        System.out.println(divHeader.getText());

        By usernameLocator = By.cssSelector("input[name='username']");
        WebElement userName = driver.findElement(usernameLocator);
        userName.sendKeys("12345");

        WebElement combinedClassed = driver.findElement(By.cssSelector("div.main.header"));
        System.out.println(combinedClassed.getText());
    }
}
