package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class BuildYourOwenComputerPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Build your own computer')]")
    WebElement owenText;
    @CacheLookup
    @FindBy(xpath = "//h2[@class='product-title']//a[normalize-space()='Build your own computer']")
    WebElement buildComputer;
    @CacheLookup
    @FindBy(xpath = "//p[@class='content']")
    WebElement display;
    @CacheLookup
    @FindBy(css = "#product_attribute_1")
    WebElement processor;
    @CacheLookup
    @FindBy(css = "#product_attribute_2")
    WebElement ram;
    @CacheLookup
    @FindBy(xpath = "//dd[@id='product_attribute_input_3']//ul[@class='option-list']")
    WebElement hddRadio;
    @CacheLookup
    @FindBy(xpath = "//dd[@id='product_attribute_input_4']//ul[@class='option-list']")
    WebElement osRadio;
    @CacheLookup
    @FindBy(xpath = "//dd[@id='product_attribute_input_5']//ul[@class='option-list']")
    WebElement checkBox;
    @CacheLookup
    @FindBy(id = "add-to-cart-button-1")
    WebElement addToCartButton;

    public void clickOnBuildComputer() {
        clickOnElement(buildComputer);
    }

    public void selectProcessor(String Processor) {
        selectByVisibleTextFromDropDown(processor, Processor);
    }

    public void selectRam(String Ram) {
        selectByVisibleTextFromDropDown(ram, Ram);
    }
    public void selectHDD(String Hdd) {
        clickOnElement(hddRadio);
    }
    public void selectOsRadio(String OsRadio){
       clickOnElement(osRadio);
    }
    public void selectSoftware(String Software){
        clickOnElement(checkBox);
    }
    public void clickOnAddToCartButton(){
        clickOnElement(addToCartButton);
    }
    public String getText(String HDD){
       selectByValueFromDropDown(hddRadio, HDD);
    return    getTextFromElement(hddRadio);

    }
    public String getTextFromCart(){
        return getTextFromElement(display);
    }

}
