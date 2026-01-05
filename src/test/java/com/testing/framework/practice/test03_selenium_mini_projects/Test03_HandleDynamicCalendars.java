package com.testing.framework.practice.test03_selenium_mini_projects;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class Test03_HandleDynamicCalendars {

    @Test
    @Description("Handle Calendars - Select future date")
    public void handleCalendar() {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.redbus.in/");

        driver.findElement(By.xpath("//div[starts-with(@class,'dateInputWrapper')]")).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ul[starts-with(@class,'datesWrap')]")));

        // Stable month-year xpath
        String currentMonthYear = driver.findElement(By.xpath("//p[starts-with(@class,'monthYear')]")).getText();

        // Navigate until target month-year appears
        while (!currentMonthYear.equals("November 2026")) {

            driver.findElement(By.xpath("(//i[@role='button'])[2]")).click();

            // wait for month to update
            wait.until(ExpectedConditions.textToBePresentInElementLocated(
                    By.xpath("//p[starts-with(@class,'monthYear')]"), ""
            ));

            currentMonthYear = driver.findElement(By.xpath("//p[starts-with(@class,'monthYear')]")).getText();
        }

        // Select 4th date
        driver.findElement(By.xpath("(//ul[starts-with(@class,'datesWrap')]/li[contains(@class,'date')])[4]")).click();

        // Print selected month (stable xpath)
        String finalMonth = driver.findElement(By.xpath("//p[starts-with(@class,'monthYear')]")).getText();
        System.out.println("Selected Month = " + finalMonth);

        driver.quit();
    }

}
