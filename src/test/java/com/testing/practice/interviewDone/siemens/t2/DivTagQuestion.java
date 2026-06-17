package com.testing.practice.interviewDone.siemens.t2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class DivTagQuestion {

    @Test
    public void testDiv() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");

        List<WebElement> divs = driver.findElements(By.tagName("Div"));
        System.out.println(divs.size());

        driver.quit();
    }
}
