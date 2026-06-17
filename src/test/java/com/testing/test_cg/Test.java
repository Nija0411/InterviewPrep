package com.testing.test_cg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

/**
 * Page Object Model for the Login page.
 * This replaces the previous test class and provides locators and helper
 * methods for User ID and Password fields. Update locator values to match
 * your application's HTML.
 */
public class Test {

    private final WebDriver driver;
    private final WebDriverWait wait;

    // TODO: Update these locators to match the real application's attributes
    private final By userIdLocator = By.id("userid");
    private final By passwordLocator = By.id("password");
    private final By loginButtonLocator = By.id("login");

    public Test(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    // Element accessors with waits
    public WebElement getUserIdField() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(userIdLocator));
        return driver.findElement(userIdLocator);
    }

    public WebElement getPasswordField() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(passwordLocator));
        return driver.findElement(passwordLocator);
    }

    public WebElement getLoginButton() {
        wait.until(ExpectedConditions.elementToBeClickable(loginButtonLocator));
        return driver.findElement(loginButtonLocator);
    }

    // Actions
    public void enterUserId(String userId) {
        WebElement el = getUserIdField();
        el.clear();
        el.sendKeys(userId);
    }

    public void enterPassword(String password) {
        WebElement el = getPasswordField();
        el.clear();
        el.sendKeys(password);
    }

    public void clickLogin() {
        getLoginButton().click();
    }

    public void login(String userId, String password) {
        enterUserId(userId);
        enterPassword(password);
        clickLogin();
    }
}

