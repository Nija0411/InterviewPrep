package com.testing.practice.test03_selenium_mini_projects;

import io.qameta.allure.Description;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class Test07_Amazon {

    @Test
    @Description(" Open Amazon\n" +
            " * Search for mobiles\n" +
            " * Scroll twice\n" +
            " * Find the XPath of the 7th listed mobile (generic XPath that works even in a new tab).")
    public void testAmazon() throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");

        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.amazon.com/");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        try {
            WebElement continueButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']")));
            continueButton.click();
            System.out.println("Clicked and handled continue");
        } catch (TimeoutException e) {
            System.out.println("Continue button did not appear");
        }

        WebElement searchbar = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Search Amazon']")));
        searchbar.click();
        searchbar.sendKeys("Mobiles");
        searchbar.sendKeys(Keys.ENTER);

        JavascriptExecutor jse = (JavascriptExecutor) driver;

        //1 time scroll
        Thread.sleep(3000);
        jse.executeScript("window.scrollBy(0,500)");

        //2 time scroll
        Thread.sleep(3000);
        jse.executeScript("window.scrollBy(0,500)");

        By genericXpath = By.xpath("(//div[@data-cy=\"title-recipe\"])[7]");

        WebElement seventhMobile = wait.until(ExpectedConditions.elementToBeClickable(genericXpath));
        String mobileText = seventhMobile.getText();
        System.out.println(mobileText);

        driver.quit();
    }
}
