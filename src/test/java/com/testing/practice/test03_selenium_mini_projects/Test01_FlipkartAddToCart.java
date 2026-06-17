package com.testing.practice.test03_selenium_mini_projects;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;

public class Test01_FlipkartAddToCart {
    WebDriver driver;

    @AfterTest
    public void closeBrowser() {
        driver.quit();
    }

    @Test
    @Description("Navigate to Flipkart search for iPhone 16 and Add to cart")
    public void testFlipkart() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.flipkart.com/");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement searchBar = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder='Search for Products, Brands and More']")));
        searchBar.sendKeys("iPhone16");
        searchBar.sendKeys(Keys.ENTER);

        WebElement iphone16 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(text(),'Apple iPhone 16 (Teal, 128 GB)')]")));
        iphone16.click();

        String parentWindow = driver.getWindowHandle();

        Set<String> windowHandles = driver.getWindowHandles();
        for (String window : windowHandles) {
            if (!window.equals(parentWindow)) {
                driver.switchTo().window(window);
            }
        }

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(),'Add')]")));

        //Assertions
//        assertThat(driver.getCurrentUrl()).isEqualTo("https://www.flipkart.com/viewcart?exploreMode=true&preference=FLIPKART");


    }
}
