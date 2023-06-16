package org.example.page;

import org.example.base.BasePage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import static java.awt.SystemColor.text;
import static org.example.constants.ConstantsHomePage.*;
import static org.junit.Assert.assertTrue;

public class UserPage extends BasePage {

    public UserPage(WebDriver driver) {
        super(driver);
    }

    public UserPage sendFirstName(){
        sendKeys(FIRSTNAME, "ONUR");
        return this;
    }
    public UserPage sendLastName(){
        sendKeys(LASTNAME, "BALKANLI");

        return this;
    }
    public UserPage sendTCNum(){
        click(TC_NUM);
        sendKeys(TC_NUM, "22637105972");
        return this;
    }
    public UserPage sendBirthday(){
        sendKeys(BIRTHDAY, "04081992");
        return this;
    }
    public UserPage sendEmail(){
        sendKeys(EMAIL, "onur.balkanli@hotmail.com");
        return this;
    }
    public UserPage sendPhone(){
        click(PHONE);
        sendKeys(PHONE, "5376718191");
        return this;
    }
    public UserPage clickNextButton(WebDriver driver){
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("document.getElementById('bc-btn-register-submit').click()");
        System.out.println("Register .. ");
        return this;
    }


}
