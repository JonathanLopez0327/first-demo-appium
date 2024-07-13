package org.testing.appium.pages;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;

public class LoginPage {
    AppiumDriver driver;
    private AppiumBy usernameField = new AppiumBy.ByAccessibilityId("test-Username");
    private AppiumBy passwordField = new AppiumBy.ByAccessibilityId("test-Password");
    private AppiumBy loginButton = new AppiumBy.ByAccessibilityId("test-LOGIN");

    public LoginPage(AppiumDriver driver) {
        this.driver = driver;
    }

    private void writeInUsernameField() {
        driver.findElement(usernameField).sendKeys("standard_user");
    }

    private void writeInPasswordField() {
        driver.findElement(passwordField).sendKeys("secret_sauce");
    }

    private void clickOnLoginButton() {
        driver.findElement(loginButton).click();
    }

    public void login() {
        writeInUsernameField();
        writeInPasswordField();
        clickOnLoginButton();
        sleep(5);
    }

    private void sleep(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
