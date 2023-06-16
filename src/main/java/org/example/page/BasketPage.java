package org.example.page;

import org.example.base.BasePage;
import org.openqa.selenium.WebDriver;

import static org.example.constants.ConstantsHomePage.BASKET;
import static org.example.constants.ConstantsHomePage.BASKET_NEXT_BUTTON;
import static org.junit.Assert.assertTrue;

public class BasketPage extends BasePage {


    public BasketPage(WebDriver driver) {
        super(driver);
    }

    public BasketPage checkbasket(WebDriver driver){

         getText(BASKET);
        try{
            String basket = driver.findElement(BASKET).getText();
            assertTrue(basket.contains("(Avantajlı Sezonluk Süper Lig"));
            System.out.println("The Package in the Basket /sepet page");
        }
        catch(Throwable pageNavigationError){
            System.out.println("The Basket error!! ");
        }
        return this;
    }

    public BasketPage clickNextButton(WebDriver driver){

        click(BASKET_NEXT_BUTTON);
        try{
            String basket = driver.findElement(BASKET_NEXT_BUTTON).getText();
            assertTrue(basket.contains("Giriş Yap"));
            System.out.println("The Package in the Basket /kullanici/kayit page");
        }
        catch(Throwable pageNavigationError){
            System.out.println("The Next Button Error!! ");
        }
        return this;
    }

}
