package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Register')]")
    WebElement registerText;
    @CacheLookup
    @FindBy(xpath = "//a[@class='ico-register']")
    WebElement registerLink;
    @CacheLookup
    @FindBy(id = "register-button")
    WebElement registerButton;
    @CacheLookup
    @FindBy(id = "gender-male")
    WebElement maleRadio;
    @CacheLookup
    @FindBy(id = "gender-female")
    WebElement femaleRadio;
    @CacheLookup
    @FindBy(id = "FirstName")
    WebElement firstName;
    @CacheLookup
    @FindBy(id = "LastName")
    WebElement lastName;
    @CacheLookup
    @FindBy(name = "DateOfBirthDay")
    WebElement DateOfBirthDay;
    @CacheLookup
    @FindBy(name = "DateOfBirthMonth")
    WebElement DateOfBirthMonth;
    @CacheLookup
    @FindBy(name = "DateOfBirthYear")
    WebElement DateOfBirthYear;
    @CacheLookup
    @FindBy(id = "Email")
    WebElement email;
    @CacheLookup
    @FindBy(id = "Password")
    WebElement password;
    @CacheLookup
    @FindBy(id = "ConfirmPassword")
    WebElement confPassword;

    @CacheLookup
    @FindBy(id = "FirstName-error")
    WebElement firstNameRequired;
    @CacheLookup
    @FindBy(id = "LastName-error")
    WebElement lastNameRequired;
    @CacheLookup
    @FindBy(id = "Email-error")
    WebElement emailRequired;
    @CacheLookup
    @FindBy(id = "Password-error")
    WebElement passwordRequired;
    @CacheLookup
    @FindBy(xpath = "//div[@class='result']")
    WebElement completedMessage;
    @CacheLookup
    @FindBy(id = "ConfirmPassword-error")
    WebElement confPasswordRequired;
    @CacheLookup
    @FindBy()
    WebElement continueButton;

    public void clickOnRegisterLink(){
        clickOnElement(registerLink);
    }
    public String getFirstNameError(){
        return getTextFromElement(firstNameRequired);
    }
    public String getLastNameError(){
        return getTextFromElement(lastNameRequired);
    }
    public String getEmailError(){
        return getTextFromElement(emailRequired);
    }
    public String getPasswordError(){
        return getTextFromElement(passwordRequired);
    }
    public String getConfPasswordError(){
        return getTextFromElement(confPasswordRequired);
    }
    public void clickOnFemaleBox(){
        clickOnElement(femaleRadio);
    }
    public void enterFirstName(String FirstName){
        sendTextToElement(firstName, FirstName);
    }
    public void enterLastName(String LastName){
        sendTextToElement(lastName, LastName);
    }
    public void setDateOfBirthDay(String day){
        selectByVisibleTextFromDropDown(DateOfBirthDay, day);
    }
    public void setDateOfBirthMonth(String month){
        selectByVisibleTextFromDropDown(DateOfBirthMonth, month);
    }
    public void setDateOfBirthYear(String year){
        selectByVisibleTextFromDropDown(DateOfBirthYear, year);
    }
    public void setEmail(String EmailId){
        sendTextToElement(email, EmailId);
    }
    public void setPassword(String Password){
        sendTextToElement(password, Password);
    }
    public void setConfPassword(String ConfPassword){
        sendTextToElement(confPassword, ConfPassword);
    }
    public void clickOnRegisterButton(){
        clickOnElement(registerButton);
    }
    public String getRegistrationText(){
        return getTextFromElement(registerText);
    }
    public String getCompletedMessage(){
        return getTextFromElement(completedMessage);
    }

}
