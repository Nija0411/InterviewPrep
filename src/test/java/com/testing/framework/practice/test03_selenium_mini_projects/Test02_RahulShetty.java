package com.testing.framework.practice.test03_selenium_mini_projects;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class Test02_RahulShetty {

    @Test
    @Description("Test Broken Links")
    public void testBrokenLinks() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/?utm_source=chatgpt.com");

        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println("Total Links Found: " + links.size());

        for (WebElement link : links) {
            String url = link.getAttribute("href");

            if (url == null || url.isEmpty()) {
                System.out.println("URL NOT FOUND");
                continue;
            }
            try {
                HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();
                connection.connect();
                int responseCode = connection.getResponseCode();
                if (responseCode >= 400) {
                    System.out.println(url + " IS BROKEN (response code is:  )" + responseCode);
                } else
                    System.out.println(url + " IS VALID (response code is: )" + responseCode);
            } catch (IOException e) {
                System.out.println(url + "EXCEPTION OCCURED");
            }

        }

        driver.quit();
    }
}
