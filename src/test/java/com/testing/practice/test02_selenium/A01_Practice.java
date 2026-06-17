package com.testing.practice.test02_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class A01_Practice {

    @Test
    public void testDropdowns() {
        WebDriver driver = new ChromeDriver();
        driver.get("");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        Map<String, List<String>> map = new HashMap<>();
        WebElement countryDrop = wait.until(ExpectedConditions.elementToBeClickable(By.id("country")));
        WebElement stateDrop = wait.until(ExpectedConditions.elementToBeClickable(By.id("state")));

        Select cSelect = new Select(countryDrop);
        List<WebElement> countries = cSelect.getOptions();

        for (WebElement country : countries) {
            String countryName = country.getText();
            cSelect.selectByVisibleText(countryName);

            stateDrop = wait.until(ExpectedConditions.elementToBeClickable(stateDrop));
            Select sSelect = new Select(stateDrop);
            List<WebElement> states = sSelect.getOptions();

            List<String> stateList = new ArrayList<>();
            for (WebElement state : states) {
                stateList.add(state.getText());
            }

            map.put(countryName, stateList);

        }
        System.out.println(map);

    }
}
