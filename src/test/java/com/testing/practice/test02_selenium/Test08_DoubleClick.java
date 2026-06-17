package com.testing.practice.test02_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Test08_DoubleClick {

    @Test
    public void testDoubleClick() {
        WebDriver driver = new ChromeDriver();

        WebElement element = driver.findElement(By.id("id"));

        Actions actions = new Actions(driver);
        actions.doubleClick(element).perform();
    }
}
