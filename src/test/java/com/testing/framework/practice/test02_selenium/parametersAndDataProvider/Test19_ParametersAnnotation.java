package com.testing.framework.practice.test02_selenium.parametersAndDataProvider;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test19_ParametersAnnotation {

    //@Parameters is used to pass configuration data from testng.xml to test methods,
    // mainly for browser, environment, or URL values.

    @Parameters("URL")
    @Test
    public void login(String url) {
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.quit();
    }

    @Parameters("URL")
    @Test
    public void login1(String url) {
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.quit();
    }


}
