package com.testing.practice.interviewDone.fynd;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Set;

public class TestFlipkart {

    @Test
    @Description("Navigate to Flipkart- search and add iphone16 to the cart")
    public void test() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.flipkart.com/");

        Actions actions = new Actions(driver);
        WebElement searchbar = driver.findElement(By.xpath("//input[@name='q']"));
        searchbar.click();


        searchbar.sendKeys("Iphone16");
        actions.sendKeys(Keys.ENTER).perform();

        String parentWindow = driver.getWindowHandle();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement iphone = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//a[contains(@href,'apple-iphone-16')])[1]")));
        iphone.click();

        Set<String> windows = driver.getWindowHandles();

        for (String window : windows) {
            if (!window.equals(parentWindow)) {
                driver.switchTo().window(window);
            }
        }

//        driver.get("https://www.flipkart.com/apple-iphone-16-teal-128-gb/p/itmce4bb3f55cc2f?pid=MOBH4DQFSY9ETDUU&lid=LSTMOBH4DQFSY9ETDUUI6AN3O&marketplace=FLIPKART&q=iphone+16&store=tyy%2F4io&srno=s_1_1&otracker=search&otracker1=search&fm=organic&iid=88dafa79-eab5-4d05-b318-109038b58bca.MOBH4DQFSY9ETDUU.SEARCH&ppt=hp&ppn=hp&ssid=38de6cbbk00000001763638873133&qH=9ea15d2374058112");
        WebElement addToCart = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(), 'Add to cart')]")));
        addToCart.click();

        driver.quit();

    }
}
