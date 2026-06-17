package com.testing.practice.test02_selenium.grouping;

public class Test {

    @org.testng.annotations.Test(groups = {"smoke"})
    public void testLogin() {
        System.out.println("Login");
    }

    @org.testng.annotations.Test(groups = {"regression"})
    public void testSearch() {
        System.out.println("Search");
    }

    @org.testng.annotations.Test(groups = {"smoke", "regression"})
    public void testLogout() {
        System.out.println("Logout");
    }
}
