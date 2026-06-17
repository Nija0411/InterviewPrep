package com.testing.practice.test02_selenium.parallelExecution.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class TestExample {
    /*When we want to run different <test> blocks in parallel, usually:
    1. different browsers
    2. different environments
    3. different test groups */

    WebDriver driver;

    @Parameters("browser")
    @BeforeMethod
    public void openBrowser(String browser) {
        if (browser.equalsIgnoreCase("Chrome")) {
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("edge")) {
            driver = new EdgeDriver();
        }

        driver.manage().window().maximize();
    }

    @org.testng.annotations.Test
    public void loginTest() {
        driver.get("https://facebook.com");
    }

    @AfterMethod
    public void closeBrowser() {
        driver.quit();
    }
}


