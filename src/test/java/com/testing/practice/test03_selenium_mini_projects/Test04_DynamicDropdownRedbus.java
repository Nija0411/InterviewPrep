package com.testing.practice.test03_selenium_mini_projects;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class Test04_DynamicDropdownRedbus {

    WebDriver driver;

    @BeforeTest
    public void openBrowser() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.redbus.in/");
    }

    @AfterTest
    public void closeBrowser() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.quit();
    }

    @Test
    @Description("Test a dynamic dropdown handle")
    public void selectCity() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement source = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@role='button'])[1]")));
        source.click();
        source.sendKeys("Bang");

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Madiwala, Bangalore']"))).click();

        String srcDest = driver.findElement(By.xpath("(//div[@role='button'])[1]")).getText();
        System.out.println(srcDest);
    }
}
