package com.testing.framework.practice.interviewDone.kantar;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class Test {

    //Navigate to amazon.com and asked to locate element Fresh and Today's deal with text
    //Script: Create loginTest, and validate successful and failed TC and take a screenshot for failed login page

    /*Requirement
    Navigate, Perform login
    If login successful → print "Login Successful"
    If login fails → take screenshot
    */

    @org.testng.annotations.Test
    public void testLogin() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://practice.expandtesting.com/login");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("username"))).sendKeys("practice");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("password"))).sendKeys("SuperSecretPassword");
        wait.until(ExpectedConditions.elementToBeClickable(By.id("submit-login"))).click();

        try {
            String loginText = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='flash']"))).getText();
            Assert.assertTrue(loginText.contains("You logged into a secure area!"));
            System.out.println("Login Successful");
        } catch (AssertionError e) {
            System.out.println("Login Failed: Taking Screenshot");

            File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            String folder = System.getProperty("user.dir") + "\\Screenshots";
            new File(folder).mkdir();

            String destination = folder + "\\login_failed.png";

            try {
                FileHandler.copy(screenshot, new File(destination));
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }

        }
        driver.quit();
    }
}
