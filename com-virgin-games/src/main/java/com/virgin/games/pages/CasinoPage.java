package com.virgin.games.pages;

import com.virgin.games.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CasinoPage extends Utility {
    private static final Logger log = LogManager.getLogger(CasinoPage.class.getName());

    public CasinoPage() {
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//body/div[@id='app']/div[@id='styledApp']/div[1]/section[3]/p[1]/a[2]")
    WebElement blackJackLink;
    @FindBy(xpath = "//h1[contains(text(),'Online Blackjack')]")
    WebElement onlineBlackJack;
    public void clickOnBlackJackLink(){
        clickOnElement(blackJackLink);
    }
    public String getBlackjackText(){
        return getTextFromElement(onlineBlackJack);
    }
}
