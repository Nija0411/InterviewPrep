package com.testing.practice.interviewDone.accolite;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class Amazon {

    @Test
    public void testAmazon() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.amazon.in/");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement searchbar = wait.until(ExpectedConditions.elementToBeClickable(By.id("twotabsearchtextbox")));
        searchbar.click();
        searchbar.sendKeys("Lenovo Laptop");
        searchbar.sendKeys(Keys.ENTER);

        WebElement lenovo = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@role='listitem'])[5]")));
        lenovo.click();

        WebElement description = driver.findElement(By.id("title"));
        System.out.println(description.getText());

        WebElement price = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[contains(text(),'35,980') and @class=\"a-price-whole\"])[6]")));
        System.out.println(price.getText());

    }
}
