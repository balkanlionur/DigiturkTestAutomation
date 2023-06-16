package org.example.page;

import org.example.base.BasePage;
import org.openqa.selenium.WebDriver;

import static org.example.constants.ConstantsHomePage.BUY_BUTTON;
import static org.junit.Assert.assertTrue;

public class WelcomePage extends BasePage {


    public WelcomePage(WebDriver driver) {
        super(driver);
    }

    public WelcomePage checkWelcome(WebDriver driver){
        try{
            assertTrue(driver.getTitle().equals("Ödüllü Filmler, Diziler, Süper Lig Maçları TOD TV'de!"));
            System.out.println("/welcome page");
        }
        catch(Throwable pageNavigationError){
            System.out.println("/welcome page error!! ");
        }
        return this;
    }

    public WelcomePage clickBuyButton(WebDriver driver){
        click(BUY_BUTTON);

        try{
            assertTrue(driver.getTitle().equals("TOD"));
            System.out.println("Click on the buy button. /satinal page");
        }
        catch(Throwable pageNavigationError){
            System.out.println("Buy button error!! ");
        }
        return this;

    }


}
