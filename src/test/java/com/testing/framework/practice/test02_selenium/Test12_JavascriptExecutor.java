package com.testing.framework.practice.test02_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class Test12_JavascriptExecutor {

    WebDriver driver;

    @BeforeTest
    public void openBrowser() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    //Create alert on Webpage using JavascriptExecutor
    @Test
    public void test() {
        driver.get("https://www.google.com/");

        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("alert('Hello Google')");
    }

    //Scroll down by JavascriptExecutor
    @Test
    public void testScroll() {

        driver.get("https://www.w3schools.com/java/");

        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,1000)");
    }

    //Perform click() operation using JavascriptExecutor
    @Test
    public void testClick() {

        driver.get("https://www.w3schools.com/java/");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        WebElement homeLink = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("❮ Home")));

        JavascriptExecutor jse = (JavascriptExecutor) driver;

        //arguments[0] bcz we are selecting first argument
        jse.executeScript("arguments[0].click()", homeLink);

        //for 2nd argument
        // jse.executeScript("arguments[1].click()",homeLink,homeLink1);
    }
}
