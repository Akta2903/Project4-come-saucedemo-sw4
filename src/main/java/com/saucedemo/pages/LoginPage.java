package com.saucedemo.pages;

import com.saucedemo.utilities.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {

    By usernameField = By.id("user-name");
    By passwordField = By.name("password");
    By loginLink = By.id("login-button");


    public void enterUsername(String username)
    {
        sendTextToElement(usernameField,username);
    }

    public void enterPassword(String password)
    {
        sendTextToElement(passwordField,password);
    }

    public void clickOnLoginButton()

    {
        clickOnElement(loginLink);
    }










}
