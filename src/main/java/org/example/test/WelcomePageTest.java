package org.example.test;

import org.example.base.BaseTest;
import org.example.page.BasketPage;
import org.example.page.BuyPage;
import org.example.page.UserPage;
import org.example.page.WelcomePage;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.remote.ProtocolHandshake;

import static org.junit.Assert.assertTrue;

public class WelcomePageTest extends BaseTest {


    WelcomePage welcomePage;
    BuyPage buyPage;
    BasketPage basketPage;

    UserPage userPage;

    @Before
    public void before(){
        welcomePage = new WelcomePage(getWebDriver());
        buyPage = new BuyPage(getWebDriver());
        basketPage = new BasketPage(getWebDriver());
        userPage = new UserPage(getWebDriver());
    }

    @Test

    public void test(){
        welcomePage.checkWelcome(getWebDriver());
        welcomePage.clickBuyButton(getWebDriver());

        buyPage.checkPackage(getWebDriver());
        buyPage.getPrice(getWebDriver());
        buyPage.buyNowButton(getWebDriver());

        basketPage.checkbasket(getWebDriver());
        basketPage.clickNextButton(getWebDriver());

        userPage.sendFirstName();
        userPage.sendLastName();
        userPage.sendTCNum();
        userPage.sendBirthday();
        userPage.sendEmail();
        userPage.sendPhone();
        userPage.clickNextButton(getWebDriver());

    }

    @After
    public void after(){
        //tearDown();

    }



}
