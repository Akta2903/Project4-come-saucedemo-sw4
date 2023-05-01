package com.saucedemo.pages;

import com.saucedemo.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ProductPage extends Utility {
    By productText = By.xpath("//span[@class='title']");

    LoginPage loginPage =new LoginPage();


    public void enterUsername(String username)
    {
        loginPage.enterUsername(username);
    }

    public void enterPassword(String password)
    {
        loginPage.enterPassword(password);
    }

    public void clickOnLoginButton()
    {
        loginPage.clickOnLoginButton();
    }


    public String getProductPerPage()
    {
        List<WebElement> productElementList = driver.findElements(By.xpath("//div[@class='inventory_item']"));
        int size = productElementList.size();
        return String.valueOf(size);
    }




    public String getProductText( )
    {
        return getTextFromElement(productText);
    }



}
