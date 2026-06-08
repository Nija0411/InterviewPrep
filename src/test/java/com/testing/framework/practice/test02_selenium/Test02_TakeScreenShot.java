package com.testing.framework.practice.test02_selenium;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class Test02_TakeScreenShot {

    @Test
    public void testTakeScreenshot() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.flipkart.com/");



        String folder = System.getProperty("user.dir") + "\\Screenshots";
        new File(folder).mkdir();

        String destination = folder + "\\FlipkartHomePage.png";

        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
            FileHandler.copy(screenshot, new File(destination));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}
