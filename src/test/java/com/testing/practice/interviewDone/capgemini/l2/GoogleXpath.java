package com.testing.practice.interviewDone.capgemini.l2;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class GoogleXpath {

    //Navigate to google.com and give me the common xpath for both Google Search and I'm Feeling Lucky

    String url = "https:www.google.com";

    By commonXpath = By.xpath("//input[@value='Google Search' or @value='I'm Feeling Lucky']");
}
