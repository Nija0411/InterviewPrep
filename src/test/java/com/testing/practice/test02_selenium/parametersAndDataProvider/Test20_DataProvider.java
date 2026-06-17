package com.testing.practice.test02_selenium.parametersAndDataProvider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Test20_DataProvider {

    @Test(dataProvider = "dataSupplier")
    public void login(String username, String pswd) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://app.vwo.com/#/login");
        driver.findElement(By.id("login-username")).sendKeys(username);
        driver.findElement(By.id("login-password")).sendKeys(pswd);
        driver.quit();
    }

    @DataProvider(name = "dataSupplier")
    public Object[][] dataSupplier() {
        Object data[][] = {{"Test01", "test01"}, {"Test02", "test02"}, {"Test03", "test03"}};
        return data;
    }
}
