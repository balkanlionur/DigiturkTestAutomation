package org.example.base;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import javax.swing.*;

import static org.junit.Assert.*;
public class BasePage {

    WebDriver driver = null;
    WebDriverWait wait = null;


    public BasePage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver,60);
    }

    public WebElement findElement(By by){
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(by));
        return driver.findElement(by);
    }

    public void sendKeys(By by,String text) {
        findElement(by).sendKeys(text);
    }

    public void click(By by){
        wait.until(ExpectedConditions.elementToBeClickable(by));
        findElement(by).click();
    }

    public void hoverElement(By by){
        Actions actions = new Actions(driver);
        actions.moveToElement(findElement(by)).build().perform();
    }

    public String getText(By by){
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(by));
        return findElement(by).getText();
    }

}
