package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ComputerPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[normalize-space()='Computers']")
    WebElement computerTab;
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Computers')]")
    WebElement computerText;
    @CacheLookup
    @FindBy(xpath = "//li[@class='inactive']//a[normalize-space()='Desktops']")
    WebElement desktopsLink;

    @CacheLookup
    @FindBy(xpath = "//li[@class='inactive']//a[normalize-space()='Notebooks']")
    WebElement notebooksLink;
    @CacheLookup
    @FindBy(xpath = "//li[@class='inactive']//a[normalize-space()='Software']")
    WebElement softwareLink;
 public void clickOnComputerTab(){
     clickOnElement(computerTab);
 }
 public String getComputerText(){
     return getTextFromElement(computerText);
 }
 public void clickOnDesktops(){
     clickOnElement(desktopsLink);
 }

}
