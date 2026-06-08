package com.testing.framework.practice.interviewDone.synechron;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class Assessment_ans {

    @Test
    public void testLogin() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://login.com");

        List<WebElement> elements = driver.findElements(By.xpath("//button[@id=btn]"));

        boolean loginExist = false;
        for (WebElement element : elements) {
            String text = element.getText().trim();

            if (text.equalsIgnoreCase("Login")) {
                element.click();
                System.out.println("Login Found and clicked");
                break;
            } else {
                System.out.println("Login Not Found");
            }

        }

    }

}
