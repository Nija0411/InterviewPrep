package com.testing.practice.test02_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class Test22_Checkbox {

    //Select and Deselect checkbox
    @Test
    public void testCheckbox() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://practice.expandtesting.com/checkboxes");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement checkBox = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("checkbox1")));

        //Select checkbox
        if (!checkBox.isSelected()) {
            checkBox.click();
        }

        //Deselect checkbox
        if (checkBox.isSelected()) {
            checkBox.click();
        }

    }
}
