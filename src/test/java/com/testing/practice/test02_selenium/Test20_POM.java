package com.testing.practice.test02_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class Test20_POM {

    WebDriver driver;
    WebDriverWait wait;


    //======================== Setup ==============================
    @BeforeMethod
    public void browserSetup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    @AfterMethod
    public void closeTest() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }

    //======================== Locate Elements ==============================
    By usernameField = By.id("user-name");
    By passwordField = By.id("password");
    By loginButton = By.id("login-button");
    By errorMsg = By.xpath("//div[contains(@class,'error-message')]");

    //======================== Page Actions ==============================
    public void enterUsername(String username) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(usernameField)).sendKeys(username);
    }

    public void enterPassword(String pswd) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(passwordField)).sendKeys(pswd);
    }

    public void clickLogin() {
        wait.until(ExpectedConditions.elementToBeClickable(loginButton)).click();
    }

    //======================== Business Method ==============================
    public void login(String username, String password) {
        enterUsername(username);
        enterPassword(password);
        clickLogin();
    }

    public String getErrorMsg() {
        return driver.findElement(errorMsg).getText();
    }

    //======================== TCs ==============================
    @Test
    public void validLoginTest() {
        login("standard_user", "secret_sauce");
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.saucedemo.com/inventory.html");
        Assert.assertEquals(driver.getTitle(), "Swag Labs");
    }

    @Test
    public void invalidLoginTest() {
        login("standard_user", "password");
        Assert.assertEquals(getErrorMsg(), "Epic sadface: Username and password do not match any user in this service");
    }
}
