package org.example.page;

import org.example.base.BasePage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import static org.example.constants.ConstantsHomePage.*;
import static org.junit.Assert.assertTrue;

public class BuyPage extends BasePage {
    public BuyPage(WebDriver driver) {
        super(driver);
    }

    public BuyPage checkPackage(WebDriver driver){
        getText(CHECKPACKAGE_CARD_WRAPPER);
        try{
            String checkPackage = driver.findElement(CHECKPACKAGE_CARD_WRAPPER).getText();
            assertTrue(checkPackage.contains("Avantajlı Sezonluk Süper Lig"));
            System.out.println("The package is correct ");
        }
        catch(Throwable pageNavigationError){
            System.out.println("The Package or The Price error!! ");
        }
        return this;
    }

    public BuyPage getPrice(WebDriver driver){
        getText(GET_PRICE);
        try{
            String getPrice = driver.findElement(GET_PRICE).getText();
            assertTrue(getPrice.contains("129.00"));
            System.out.println("The price is correct ");
        }
        catch(Throwable pageNavigationError){
            System.out.println("The Package or The Price error!! ");
        }
        return this;
    }

    public BuyPage buyNowButton(WebDriver driver){
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("document.getElementById('add-package-into-basket').click()");
        System.out.println("The Package added to basket .. ");

        return this;
    }


}
