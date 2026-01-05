package com.testing.framework.practice.test02_selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test03_Alerts {

    @Test
    public void testAlerts() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.flipkart.com/");

        driver.findElement(By.id("id")).click();

        Alert alert = driver.switchTo().alert();
        alert.accept();
        alert.dismiss();
        alert.sendKeys("Hii");

        driver.quit();
    }
}
