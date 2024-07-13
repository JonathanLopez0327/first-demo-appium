package base;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;

public class BaseTest {
    AppiumDriver driver;

    public BaseTest() {}

    @BeforeTest
    public void setUp() throws URISyntaxException, MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("appium:automationName", "UiAutomator2");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("appium:platformVersion", "15");
        capabilities.setCapability("appium:deviceName", "Pixel 8 Pro API 35");
        capabilities.setCapability("appium:appActivity", "com.swaglabsmobileapp.MainActivity");
        capabilities.setCapability("appium:appPackage", "com.swaglabsmobileapp");

        driver = new AppiumDriver(new URI("http://127.0.0.1:4723/wd/hub").toURL(), capabilities);
    }

    public AppiumDriver getDriver() {
        return driver;
    }

    @AfterTest
    public void tearDown() {
        if (null != driver) {
            driver.quit();
        }
    }
}
