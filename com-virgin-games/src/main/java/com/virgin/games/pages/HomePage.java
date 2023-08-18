package com.virgin.games.pages;

import com.virgin.games.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//label[contains(text(),'Accept')]")
    WebElement cookies;
    @FindBy(xpath = "//span[contains(text(),'Online Slots')]")
    WebElement onlineSlots;
    @FindBy(xpath = "//body/div[@id='app']/div[@id='styledApp']/div[1]/div[1]/ul[1]/li[3]/a[1]/span[1]")
    WebElement casino;

    public void acceptCookies() {
        clickOnElement(cookies);
    }

    public void clickOnOnlineSlots() {
        clickOnElement(onlineSlots);
    }
    public void clickOnCasino(){
        clickOnElement(casino);
    }

}
