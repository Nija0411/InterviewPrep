package com.testing.framework.practice.test02_selenium;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class Test21_TakeScreenshotClass {

    @Test
    public void testScreenshot() throws IOException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");

        TakesScreenshot screenshot = (TakesScreenshot) driver;
        File myFile = screenshot.getScreenshotAs(OutputType.FILE);
        File outputFile = new File("GoogleScreenshot.png");

        FileUtils.copyFile(myFile, outputFile);

        driver.quit();
    }
}
