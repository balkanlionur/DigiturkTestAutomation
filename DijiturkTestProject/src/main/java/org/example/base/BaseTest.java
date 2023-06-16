package org.example.base;


import  org.junit.Before;

import static org.junit.Assert.*;
import org.openqa.selenium.remote.ProtocolHandshake;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;
public class BaseTest {

    static WebDriver webDriver= null;

    @Before
    public void setUp(){


        String browser = "chrome";


        if (browser.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver","CromeDriver\\chromedriver.exe");
            ChromeOptions options = new ChromeOptions();
            options.addArguments("start-maximized");
            options.addArguments("disable-notifications");
            options.addArguments("disable-popup-blocking");
            setWebDriver(new ChromeDriver(options));
            getWebDriver().navigate().to("https://www.todtv.com.tr/hosgeldiniz");
        } else if (browser.equalsIgnoreCase("Firefox")) {
            System.setProperty("webdriver.gecko.driver", "FirefoxDriver\\geckodriver.exe");
            FirefoxOptions options = new FirefoxOptions();
            options.setProfile(new FirefoxProfile());
            WebDriver driver = new FirefoxDriver();
            driver.get("https://www.todtv.com.tr/hosgeldiniz");
        } else {
            throw new IllegalArgumentException("Desteklenmeyen tarayıcı: " + browser);
        }
    }

    public static WebDriver getWebDriver(){
        return webDriver;
    }
    public static void  setWebDriver(WebDriver webDriver){
        BaseTest.webDriver = webDriver;
    }

    public void tearDown(){
        getWebDriver().quit();
    }

}
