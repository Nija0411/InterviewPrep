package com.testing.framework.practice.test02_selenium.listeners;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Test21_ListenersDemo implements ITestListener {
    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println(result.getName() + " Test is failed");
    }

    @Override
    public void onTestStart(ITestResult result) {
        System.out.println(result.getName() + " Test started");
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println(result.getName() + " Test is passed");
    }
}
