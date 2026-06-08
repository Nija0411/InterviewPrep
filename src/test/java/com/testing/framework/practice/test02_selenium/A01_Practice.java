package com.testing.framework.practice.test02_selenium;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class A01_Practice {

    @Test
    public void testProperties() throws IOException {
        String filePath = "\\src\\test\\java\\com\\testing\\framework\\practice\\test02_selenium\\data.properties";

        File file = new File(System.getProperty("user.dir") + filePath);

        FileInputStream fis = new FileInputStream(file);

        Properties properties = new Properties();
        properties.load(fis);

        WebDriver driver = new ChromeDriver();
        driver.get(properties.getProperty("url"));
    }


}






