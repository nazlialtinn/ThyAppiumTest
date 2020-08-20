package org.example;

import com.thoughtworks.gauge.AfterScenario;
import com.thoughtworks.gauge.BeforeScenario;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class BaseTest {
    public static AppiumDriver driver;

    @BeforeScenario
    public void setUp() throws MalformedURLException,Exception{
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("BROWSER_NAME", "Android");
        capabilities.setCapability("VERSION","8.0.0");
        capabilities.setCapability("deviceName","emulator-5554");
        capabilities.setCapability("platformName","Android");
        capabilities.setCapability("appPackage", "com.turkishairlines.mobile");
        capabilities.setCapability("appActivity", "com.turkishairlines.mobile.ui.main.MainActivity");
        capabilities.setCapability("autoGrantPermissions",true);
        capabilities.setCapability("autoDismissAlerts",true);

        driver = new AppiumDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
        driver.manage().timeouts().implicitlyWait(60L, TimeUnit.SECONDS);
    }

    public static AppiumDriver getDriver() {
        return driver;
    }

    @AfterScenario
    public void tearDown() throws Exception{
        getDriver().quit();
    }

}
