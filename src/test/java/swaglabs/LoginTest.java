package swaglabs;

import base.BaseTest;
import org.testing.appium.pages.LoginPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test(description = "Login to Swag Labs")
    void login() {
        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.login();
    }

}
