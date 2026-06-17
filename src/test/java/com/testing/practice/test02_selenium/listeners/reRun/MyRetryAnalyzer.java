package com.testing.practice.test02_selenium.listeners.reRun;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

//https://testng.org/#_rerunning_failed_tests

public class MyRetryAnalyzer implements IRetryAnalyzer {

    int retryCount = 0;
    int maxRetryCount = 3;

    @Override
    public boolean retry(ITestResult iTestResult) {
        if (retryCount < maxRetryCount) {
            retryCount++;
            return true; //retry the test
        }
        return false; //stop retrying
    }
}
