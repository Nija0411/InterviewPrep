package com.testing.framework.practice.test02_selenium;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class Test10_PropertyReader {

    @Test
    @Description("Write a code to read data from property file")
    public void readData() throws IOException {


        String filePath = "\\src\\test\\java\\com\\testing\\framework\\practice\\test02_selenium\\data.properties";
        File file = new File(System.getProperty("user.dir") + filePath);

        FileInputStream fis = new FileInputStream(file);

        Properties properties = new Properties();
        properties.load(fis);

        WebDriver driver = new ChromeDriver();
        driver.get(properties.getProperty("url"));

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement userName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
        userName.sendKeys(properties.getProperty("username"));

        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys(properties.getProperty("password"));

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.quit();

    }
}
