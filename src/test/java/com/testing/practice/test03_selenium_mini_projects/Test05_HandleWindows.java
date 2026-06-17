package com.testing.practice.test03_selenium_mini_projects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.Set;

public class Test05_HandleWindows {

    @Test
    public void testWindowHandle() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");

        String parentWindow = driver.getWindowHandle();

        driver.findElement(By.id("newWindowsBtn")).click();

        //Most preferred when you have multiple windows/ or second use indexing
        String expectedTitle = "HYR Tutorials";

        Set<String> windowHandles = driver.getWindowHandles();
        for (String window : windowHandles) {
            driver.switchTo().window(window);
            if (driver.getTitle().contains(expectedTitle)) {
                break;
            }
        }
        driver.quit();
    }
}
