package com.testing.practice.test02_selenium;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class Test15_TakeScreenshot {
    @Test
    public void testScreenshot() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.w3schools.com/java/");

        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

        String folder = System.getProperty("user.dir") + "\\Screenshots";
        new File(folder).mkdir();

        String destination = folder + "\\w3schools.png";

        try {
            FileHandler.copy(screenshot, new File(destination));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
