package org.selenium.task_automation_practice.factory.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class BrowserService {

    public static WebDriver driver;
    public static WebDriverWait wait;

    public void chromeDriverInit(String url){
        try {
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setBrowserName("chrome");

            driver = new RemoteWebDriver(new URL("http://localhost:4444"), capabilities);
            wait = new WebDriverWait(driver, Duration.ofSeconds(60));
            driver.get(url);
            driver.manage().window().maximize();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

    }

    public void quit(){
        driver.quit();
    }
}