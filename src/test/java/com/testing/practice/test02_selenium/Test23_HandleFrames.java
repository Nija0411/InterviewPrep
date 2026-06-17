package com.testing.practice.test02_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test23_HandleFrames {

    @Test
    public void testFrames() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/iframe");

//        WebElement frameElement = driver.findElement(By.id("id"));
//        driver.switchTo().frame("name");
//        driver.switchTo().frame("id");
//        driver.switchTo().frame(frameElement);
//        driver.switchTo().frame(0);
//
//        driver.switchTo().parentFrame();
//        driver.switchTo().defaultContent();

        driver.switchTo().frame("mce_0_ifr");

        WebElement element = driver.findElement(By.xpath("//body[@id=\"tinymce\"]/p"));

        //Clear window
        element.sendKeys(Keys.CONTROL + "a");
        element.sendKeys(Keys.BACK_SPACE);

        //Or
        element.clear();

        element.sendKeys("Hello Java");

        driver.switchTo().defaultContent();

        driver.quit();
    }
}
