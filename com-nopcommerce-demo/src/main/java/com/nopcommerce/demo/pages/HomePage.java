package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class HomePage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//ul[@class='top-menu notmobile']")
    WebElement allMenu;
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Log in')]")
    WebElement loginLink;
    @CacheLookup
    @FindBy(xpath = "//a[@class='ico-register']")
    WebElement registerLink;
    @CacheLookup
    @FindBy(xpath = "//img[@alt='nopCommerce demo store']")
    WebElement nopcommerceLogo;
    @CacheLookup
    @FindBy(xpath = "//a[@class='ico-account']")
    WebElement myAccount;
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Log out')]")
    WebElement logout;
    public void clickOnLoginLink(){
        clickOnElement(loginLink);
    }
    public boolean isLogoutLinkDisplayed(){
        return logout.isDisplayed();
    }
    public void clickOnLogoutButton(){
        clickOnElement(logout);
    }
    public String getTextFromLogout(){
        return getTextFromElement(logout);
    }
    public String getTextFromLogin() {
        return getTextFromElement(loginLink);
    }
}

