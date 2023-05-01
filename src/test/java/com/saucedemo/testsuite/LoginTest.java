package com.saucedemo.testsuite;

import com.saucedemo.pages.LoginPage;
import com.saucedemo.pages.ProductPage;
import com.saucedemo.propertyreader.PropertyReader;
import com.saucedemo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    LoginPage loginPage = new LoginPage();
    ProductPage productPage = new ProductPage();
    String username = PropertyReader.getInstance().getProperty("usernameField");
    String password = PropertyReader.getInstance().getProperty("passwordField");
    //ProductPage productPage = new ProductPage();
    @Test
    public void userShouldLoginSuccessfullyWithValid()
    {

        loginPage.enterUsername(username);
        loginPage.enterPassword(password);
        loginPage.clickOnLoginButton();
        Assert.assertEquals(productPage.getProductText(),"Products");




    }

}
