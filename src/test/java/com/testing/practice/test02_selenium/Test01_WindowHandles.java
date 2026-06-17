package com.testing.practice.test02_selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.Set;

public class Test01_WindowHandles {

    @Test
    public void testWindow(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/?zx=1763530469675&no_sw_cr=1");
        String parentWindow = driver.getWindowHandle();
        System.out.println(parentWindow);

        Set<String> windows = driver.getWindowHandles();

        for(String window:windows){
            driver.switchTo().window(window);
        }
        //Switch to parent
        driver.switchTo().window(parentWindow);
    }
}
