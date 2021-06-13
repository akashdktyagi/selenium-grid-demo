package com.yantraQA;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.logging.LoggingPreferences;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;

public class TestBase {
    public  WebDriver driver;


    @After
    public void afterTest(){
        driver.quit();
    }

    @Before
    public void beforeTest() throws MalformedURLException {
        String nodeURL = "http:localhost:4444/wd/hub";
        DesiredCapabilities desiredCapabilities = DesiredCapabilities.chrome();
        LoggingPreferences prefs = new LoggingPreferences();
        prefs.enable(LogType.BROWSER, Level.ALL);
        prefs.enable(LogType.DRIVER, Level.ALL);
        prefs.enable(LogType.PERFORMANCE, Level.ALL);
        desiredCapabilities.setBrowserName("chrome");
        desiredCapabilities.setCapability(CapabilityType.LOGGING_PREFS,prefs);

        driver = new RemoteWebDriver(new URL(nodeURL),desiredCapabilities);
    }

}
