package com.testing.practice.test02_selenium.xpathAndcssSelectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test21_Xpath {
    WebDriver driver;

    @BeforeMethod
    public void openBrowser() {
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
    }

    @Test
    public void test() {
        //Absolute xpath
        By.xpath("/html/body/div/div/div[2]/div[1]/div/div/form/div[1]/input");

        //Relative xpath
        By.xpath("//input[@id='user-name']");

        //xpath with contains()
        By.xpath("//input[contains(@id,'user-name')]");
        By.xpath("//input[contains(@type,'text')]");

        //xpath with starts-with()
        By.xpath("//input[starts-with(@class,'input_error')]");

        //xpath with text() refer facebook.com
        By.xpath("//button[text()='Log in']");

        //combine xpath
        By.xpath("//button[text()='Log in'and @type='submit']");



    }
}
