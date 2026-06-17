package com.testing.practice.test02_selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class Test03_Alerts {

    //Wait pop-up and accept
    @Test
    public void testAlerts() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/alerts");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.findElement(By.id("timerAlertButton")).click();

        wait.until(ExpectedConditions.alertIsPresent()).accept();

    }

    //Cancel Alert
    @Test
    public void testConfirmAlerts() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/alerts");

        driver.findElement(By.id("confirmButton")).click();
        Alert alert = driver.switchTo().alert();
        alert.dismiss();
    }

    //prompt
    @Test
    public void testPromptAlerts() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/alerts");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.findElement(By.id("promtButton")).click();
//        Alert alert = driver.switchTo().alert();
//        alert.sendKeys("Hello");
//        alert.accept();

        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        alert.sendKeys("Hello");
        alert.accept();
    }

}
