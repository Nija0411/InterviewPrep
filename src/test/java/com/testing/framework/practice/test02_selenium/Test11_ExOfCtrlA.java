package com.testing.framework.practice.test02_selenium;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Test11_ExOfCtrlA {

    @Test
    public void usingAlert() {
        WebDriver driver = new ChromeDriver();

        Alert alert = driver.switchTo().alert();

        alert.sendKeys(Keys.chord(Keys.CONTROL, "a"));
        alert.sendKeys("Hi");
    }

    @Test
    public void usingActions() {
        WebDriver driver = new ChromeDriver();

        Actions actions = new Actions(driver);

        actions.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();

        //right click on specific element
        WebElement element = null;
        actions.contextClick(element).build().perform();

        //anywhere
        actions.contextClick().perform();

        //left click on a specific element
        WebElement element1 = driver.findElement(By.id("myID"));
        actions.click(element1).perform();

        //move to element
        actions.moveToElement(element1).click().perform();

        //double click
        actions.doubleClick().perform();

        actions.doubleClick(element1).perform();


    }
}
