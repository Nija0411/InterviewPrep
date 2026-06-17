package com.testing.practice.test02_selenium.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest {

    private WebDriver driver;
    private LoginPage loginPage;

    @BeforeTest
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://example.com/login");
        loginPage = new LoginPage(driver);
    }

    @Test
    public void testValidLogin() {
        loginPage.login("validUser", "validPassword");
        Assert.assertEquals(driver.getCurrentUrl(), "https://example.com/login");
        Assert.assertEquals(driver.getTitle(), "Login Page");

    }

    @Test
    public void testInvalidLogin() {
        loginPage.login("invalidUser", "invalidPassword");
        Assert.assertEquals(driver.getCurrentUrl(), "https://example.com/login");
        Assert.assertNotEquals(driver.getTitle(), "Login Page");
    }

    @AfterTest
    public void teardown() {
        driver.quit();
    }
}
