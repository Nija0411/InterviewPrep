package com.testing.practice.test02_selenium.xpathAndcssSelectors;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Test23_CSSSelectors {

    @Test
    public void test() {
        String url = "";

        //id
        By.cssSelector("#user-name");

        //class (use . if there is a space)
        By.cssSelector(".submit-button.btn_action");

        //attribute ([attribute='value']
        By.cssSelector("[type='submit']");
        By.cssSelector("[id='user-name']");

        //starts-with
        //[attribute^='value']
        By.cssSelector("[class^='submit-button']");

        //ends-with
        //[attribute$='value']
        By.cssSelector("[class$='btn_action']");

        //contains
        //[attribute*='value']
        By.cssSelector("[data-test*='button']");

        //parent to child
        By.cssSelector("div.form_group  input#password");
    }
}
