package com.testing.practice.test03_selenium_mini_projects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Set;

public class Test08_Amazon {

    @Test
    public void testAmazon() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.amazon.in/");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        WebElement searchTextBox = wait.until(ExpectedConditions.elementToBeClickable(By.id("twotabsearchtextbox")));
        searchTextBox.click();
        searchTextBox.sendKeys("Lenovo Laptop");
        searchTextBox.sendKeys(Keys.ENTER);

        WebElement lenovoLaptop = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(@class,'a-link-normal')]//span[starts-with(text(),'IdeaPad Slim 3 Ryzen 3 7320U 15.6')]")));
        lenovoLaptop.click();

        String parent = driver.getWindowHandle();
        Set<String> windows = driver.getWindowHandles();
        for (String window : windows) {
            if (!window.equals(parent)) {
                driver.switchTo().window(parent);
                break;
            }
        }

//        WebElement text = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("productTitle")));
//        System.out.println("Product Description: " + text.getText());

        WebElement symbol = driver.findElement(By.xpath("//span[contains(@class,'priceToPay')]//span[@class='a-price-symbol']"));
        WebElement price = driver.findElement(By.xpath("(//span[contains(@class,'priceToPay')]//span[@class='a-price-whole']"));
        System.out.println("Price: " + symbol.getText() + price.getText());

    }
}