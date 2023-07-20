package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends Utility {
    @CacheLookup
    @FindBy(id = "Email")
    WebElement email;
    @CacheLookup
    @FindBy(id = "Password")
    WebElement password;
    @CacheLookup
    @FindBy(xpath = "//a[@class='ico-login']")
    WebElement loginLink;
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Welcome, Please Sign In!')]")
    WebElement welcomeText;
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Log in')]")
    WebElement loginButton;
    @CacheLookup
    @FindBy(xpath = "//div[@class='message-error validation-summary-errors']")
    WebElement unsuccessfulMessage;

    public void clickOnLoginLink() {
        clickOnElement(loginLink);
    }

    public void enterEmail(String EmailID) {
        sendTextToElement(email, EmailID);
    }

    public void enterPassword(String Password) {
        sendTextToElement(password, Password);
    }

    public void clickOnLogin() {
        clickOnElement(loginButton);
    }

    public String getWelcomeText() {
        return getTextFromElement(welcomeText);
    }

    public String getUnsuccessfulMessage() {
        return getTextFromElement(unsuccessfulMessage);
    }


}
