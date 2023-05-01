package com.saucedemo.testsuite;

import com.saucedemo.pages.ProductPage;
import com.saucedemo.propertyreader.PropertyReader;
import com.saucedemo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ProductTest extends BaseTest {

    ProductPage productPage = new ProductPage();
    String username = PropertyReader.getInstance().getProperty("usernameField");
    String password = PropertyReader.getInstance().getProperty("passwordField");


    @Test
    public void verifyThatSixProductsAreDisplayedOnPage()
    {
        productPage.enterUsername(username);
        productPage.enterPassword(password);
        productPage.clickOnLoginButton();
        String productPerPage = "6";
        Assert.assertEquals(productPage.getProductPerPage(),productPerPage);
    }
}
