package com.testing.framework.practice.test02_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Test14_TreeSet {

    //Get the values from the dropdown and print them in Ascending order Using TreeSet
    @Test
    public void testDropdown() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/select-menu");


        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='Select Title']"))).click();

        List<WebElement> dropdownOptions = driver.findElements(By.xpath("//div[starts-with(@id,'react-select-3-option-0')]"));
        Set<String> sortedOptions = new TreeSet<>();

        for (WebElement option : dropdownOptions) {
            sortedOptions.add(option.getText());
        }

        System.out.println("Values in Ascending Order");
        for (String value : sortedOptions) {
            System.out.println(value);
        }
    }
}
