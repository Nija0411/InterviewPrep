package com.testing.practice.test03_selenium_mini_projects.countryDropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {

    @org.testng.annotations.Test
    public void testCountryDD() {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");

        WebDriver driver = new ChromeDriver(options);
        driver.get("https://example.com");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        Map<String, List<String>> map = new HashMap<>();

        WebElement countryDropD = wait.until(ExpectedConditions.elementToBeClickable(By.id("country")));
//        WebElement stateDropD = wait.until(ExpectedConditions.elementToBeClickable(By.id("state")));

        By stateDropD = By.id("state");

        Select cSelect = new Select(countryDropD);
        List<WebElement> countries = cSelect.getOptions();

        for (WebElement country : countries) {
            String countryName = country.getText();
            if (countryName.isEmpty() || countryName.equalsIgnoreCase("Select")) {
                continue;
            }
            cSelect.selectByVisibleText(countryName);

            wait.until(ExpectedConditions.elementToBeClickable(stateDropD));
            Select sSelect = new Select(driver.findElement(stateDropD));
            List<WebElement> states = sSelect.getOptions();

            List<String> stateList = new ArrayList<>();

            for (WebElement state : states) {
                stateList.add(state.getText());
            }
            Assert.assertTrue(stateList.size() > 0, "States missing for " + countryName);
            map.put(countryName, stateList);
        }
        System.out.println(map);
    }
}
