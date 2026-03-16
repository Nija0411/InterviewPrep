package com.testing.framework.practice.test02_selenium;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class A02_Practice implements ITestListener {

    //This class is for my practice

    @Override
    public void onTestStart(ITestResult result) {
        System.out.println(result.getName() + " Test is started");
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println(result.getName() + " Test is passed");
    }

    public void onTestFailure(ITestResult result) {
        System.out.println(result.getName() + " Test is failed");
    }
}
