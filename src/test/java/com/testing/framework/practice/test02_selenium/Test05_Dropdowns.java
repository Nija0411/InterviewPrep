package com.testing.framework.practice.test02_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Test05_Dropdowns {

    @Test
    public void testDropdown() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/#google_vignette");

        //If multiple dropdowns present on UI, go with id, xpath lacators
        WebElement dropdown = driver.findElement(By.tagName("select"));

        Select select = new Select(dropdown);
        select.selectByValue("ALA");

        select.selectByValue("Value");
        select.selectByIndex(1);
        select.selectByVisibleText("");


        driver.quit();
    }
}
