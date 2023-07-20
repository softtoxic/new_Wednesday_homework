package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class DesktopPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Desktops')]")
    WebElement desktopsText;
    @CacheLookup
    @FindBy()
    WebElement sortBy;
    @CacheLookup
    @FindBy()
    WebElement display;
    @CacheLookup
    @FindBy()
    WebElement productList;
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Build your own computer')]")
    WebElement buildComputer;

    public String getDesktopsText(){
        return getTextFromElement(desktopsText);
    }
    public void clickOnBuildComputer(){
        clickOnElement(buildComputer);
    }
}
