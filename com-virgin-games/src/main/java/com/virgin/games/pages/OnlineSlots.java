package com.virgin.games.pages;

import com.virgin.games.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OnlineSlots extends Utility {
    private static final Logger log = LogManager.getLogger(OnlineSlots.class.getName());

    public OnlineSlots() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[contains(text(),'The Vault')]")
    WebElement theVault;
    @FindBy(xpath = "//h1[contains(text(),'Welcome to The Vault')]")
    WebElement welcomeText;

    public void clickOnTheVault() {
        clickOnElement(theVault);
    }
    public String getWelcomeText(){
        return getTextFromElement(welcomeText);
    }

}
