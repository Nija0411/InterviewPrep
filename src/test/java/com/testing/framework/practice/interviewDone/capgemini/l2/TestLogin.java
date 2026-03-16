package com.testing.framework.practice.interviewDone.capgemini.l2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestLogin {

    //Navigate to facebook.com
    // Provide login creds
    // Allow the browser to be changed at runtime (e.g., Chrome or Firefox).
    WebDriver driver;

    @Test
    public void testLogin() {

        String browser = "chrome";

        if (browser.equalsIgnoreCase("chrome")) {
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("firefox")) {
            driver = new FirefoxDriver();
        }

        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        //Login
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='email']"))).sendKeys("User1");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='pass']"))).sendKeys("Password");
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@role=\"none\"])[1]"))).click();
    }
}
