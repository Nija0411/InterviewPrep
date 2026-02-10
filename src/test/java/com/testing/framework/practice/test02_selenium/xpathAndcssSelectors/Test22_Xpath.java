package com.testing.framework.practice.test02_selenium.xpathAndcssSelectors;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Test22_Xpath {

    @Test
    public void test() {
        String url = "https://www.facebook.com/";

        //parent to child
        By.xpath("//form[starts-with(@data-testid,\"royal_\")]/div/a");

        //child to ancestor/parent
        // Navigates upward from the input element to find its parent form (ancestor)
        //ancestor:: returns all matching ancestors, not just one.
        By.xpath("//input[@id='email']/ancestor::form");

        // following-sibling
        // Selects all sibling elements that appear AFTER the current element
        // (these are NOT child elements and can be multiple matching tags)
        String url1 = "https://www.saucedemo.com/";
        By.xpath("//div[contains(@class,'form_group')]/following-sibling::input");

        // preceding-sibling
        // Selects all sibling elements that appear BEFORE the current element
        // (reverse of following-sibling and NOT child elements)
        By.xpath("//input[@id='login-button']/preceding-sibling::div");

    }
}
