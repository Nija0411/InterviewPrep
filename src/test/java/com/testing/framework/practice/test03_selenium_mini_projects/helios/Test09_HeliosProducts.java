package com.testing.framework.practice.test03_selenium_mini_projects.helios;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class Test09_HeliosProducts {

    /* Navigate to https://www.heliosmf.in/
       Capture all product names
       Print Regular Growth value
       Print Direct Growth value */

    @Test
    public void testHelios() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.heliosmf.in/");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,1000)");

        By fundLocator = By.xpath("//div[@class=\"fund\"]");

        List<WebElement> fundList = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(fundLocator));

        for (WebElement fund : fundList) {

            By productLocator = By.xpath(".//h2[contains(text(),'Helios')]");
            String productName = fund.findElement(productLocator).getText();

            By regulargrowthLocator = By.xpath(".//div[contains(text(),'Regular – Growth')]/parent::div/following-sibling::div/div");
            String regularGrowth = fund.findElement(regulargrowthLocator).getText();

            By directgrowthLocator = By.xpath(".//div[contains(text(),'Direct – Growth')]/parent::div/following-sibling::div/div");
            String directGrowth = fund.findElement(directgrowthLocator).getText();

            System.out.println("Product: " + productName);
            System.out.println("Regular Growth: " + regularGrowth);
            System.out.println("Direct Growth: " + directGrowth);
            System.out.println("==============================================");

        }
        driver.quit();
    }
}
