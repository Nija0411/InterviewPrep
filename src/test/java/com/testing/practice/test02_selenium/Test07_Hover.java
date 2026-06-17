package com.testing.practice.test02_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Test07_Hover {
    @Test
    public void testHover() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.flipkart.com/");

        WebElement searchbar = driver.findElement(By.xpath("//input[@name='q']"));

        Actions actions = new Actions(driver);
        actions.moveToElement(searchbar).click();

        driver.quit();
    }
}
