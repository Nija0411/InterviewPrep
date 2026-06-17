package com.testing.practice.test02_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

public class Test24_BrokenLinks {

    @Test
    public void testBrokenLinks() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/broken");

        List<WebElement> allLinks = driver.findElements(By.tagName("a"));
        System.out.println("Total Links Found: " + allLinks.size());

        for (WebElement link : allLinks) {
            String url = link.getAttribute("href");
            if (url == null || url.isEmpty()) {
                System.out.println("URL isn't found");
                continue;
            }
            try {
                HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();
                connection.setRequestMethod("HEAD");
                connection.connect();
                int responseCode = connection.getResponseCode();
                if (responseCode >= 400) {
                    System.out.println("Link is broken: " + url + " " +responseCode);
                } else {
                    System.out.println("Link is valid: " + url);
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
