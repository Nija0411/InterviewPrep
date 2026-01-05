package com.testing.framework.practice.test03_selenium_mini_projects.swagLabs;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;

import java.time.Duration;

import static org.assertj.core.api.Assertions.assertThat;

public class LoginPage {

    WebDriver driver;

    @BeforeClass
    public void manageDriver() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
    }

    @AfterClass
    public void closeBrowser() {
        driver.quit();
    }

    @Test
    public void testLogin() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement username = wait.until(ExpectedConditions.elementToBeClickable(By.id("user-name")));
        username.click();
        username.sendKeys("error_user");

        WebElement password = wait.until(ExpectedConditions.elementToBeClickable(By.id("password")));
        password.click();
        password.sendKeys("secret_sauce");

        WebElement loginButton = driver.findElement(By.xpath("//input[@id='login-button']"));
        loginButton.click();

        assertThat(driver.getCurrentUrl()).isEqualTo("https://www.saucedemo.com/inventory.html");
        assertThat(driver.getTitle()).isEqualTo("Swag Labs");

    }

    @Test(dependsOnMethods = "testLogin")
    @Description("Verify Product Page and Add To Cart Option")
    public void testHomePage() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement item1 = driver.findElement(By.xpath("//button[contains(@id,'sauce-labs-backpack')]"));
        item1.click();

        WebElement item2 = driver.findElement(By.xpath("//button[contains(@id,'add-to-cart-sauce-labs-onesie')]"));
        item2.click();


        driver.findElement(By.className("shopping_cart_link")).click();

//        assertThat(driver.getCurrentUrl()).isEqualTo("https://www.saucedemo.com/cart.html");
//        assertThat(driver.getTitle()).isEqualTo("Your Cart");
    }

    @Test(dependsOnMethods = "testHomePage")
    public void testYourCart() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        wait.until(ExpectedConditions.urlContains("cart.html"));

        WebElement removeBtn = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("remove-sauce-labs-backpack")));
        removeBtn.click();

        WebElement checkout = wait.until(ExpectedConditions.elementToBeClickable(By.id("checkout")));
        checkout.click();

        WebElement firstName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("first-name")));
        firstName.click();
        firstName.sendKeys("test");

        WebElement lastName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("last-name")));
        lastName.click();
        lastName.sendKeys("test");

        WebElement postCode = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("postal-code")));
        postCode.click();
        postCode.sendKeys("515151");

        driver.findElement(By.id("continue")).click();

        wait.until(ExpectedConditions.elementToBeClickable(By.id("finish")));
    }
}
