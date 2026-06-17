package com.testing.practice.test02_selenium.xpathAndcssSelectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class Test24_PartialLinkText {

    @Test
    public void test() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.tutorialspoint.com/selenium/practice/links.php");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement created = wait.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText("Creat")));
        created.click();

        driver.quit();

    }

}
