package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.ComputerPage;
import com.nopcommerce.demo.pages.DesktopPage;
import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.RegisterPage;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RegisterPageTest extends BaseTest {
    HomePage homePage;
    ComputerPage computerPage;
    DesktopPage desktopPage;
    RegisterPage registerPage;

    @BeforeMethod(alwaysRun = true)
    public void inIt() {
        homePage = new HomePage();
        computerPage = new ComputerPage();
        desktopPage = new DesktopPage();
        registerPage = new RegisterPage();
    }
    @Test
    public void verifyUserShouldNavigateToRegisterPageSuccessfully(){
        registerPage.clickOnRegisterLink();
        String expectedResult = "Register";
        String actualResult = registerPage.getRegistrationText();
        Assert.assertEquals(expectedResult, actualResult, "Text not verified");
    }
    @Test
    public void verifyThatFirstNameLastNameEmailPasswordAndConfirmPasswordFieldsAreMandatory(){
        registerPage.clickOnRegisterLink();
        registerPage.clickOnRegisterButton();

        String expectedFirstName = "First name is required.";
        String actualFirstName = registerPage.getFirstNameError();
        Assert.assertEquals(expectedFirstName, actualFirstName, "Text not verified");

        String expectedLastName = "Last name is required.";
        String actualLastName = registerPage.getLastNameError();
        Assert.assertEquals(expectedLastName, actualLastName, "Text not verified");

        String expectedEmail = "Email is required.";
        String actualEmail = registerPage.getEmailError();
        Assert.assertEquals(expectedEmail, actualEmail, "Text not verified");

        String expectedPassword = "Password is required.";
        String actualPassword = registerPage.getPasswordError();
        Assert.assertEquals(expectedPassword, actualPassword, "Text not verified");

        String expectedConfPassword = "Password is required.";
        String actualConfPassword = registerPage.getConfPasswordError();
        Assert.assertEquals(expectedConfPassword, actualConfPassword, "Text not verified");
    }
    @Test
    public void VerifyThatUserShouldCreateAccountSuccessfully(){
        registerPage.clickOnRegisterLink();
        registerPage.clickOnFemaleBox();
        registerPage.enterFirstName("qqq");
        registerPage.enterLastName("www");
        registerPage.setDateOfBirthDay("12");
        registerPage.setDateOfBirthMonth("March");
        registerPage.setDateOfBirthYear("1939");
        registerPage.setEmail("abcdd@gmail.com");
        registerPage.setPassword("ddd@000");
        registerPage.setConfPassword("ddd@000");
        registerPage.clickOnRegisterButton();
        String expectedText = "Your registration completed";
        String actualText = registerPage.getCompletedMessage();
        Assert.assertEquals(expectedText, actualText, "Text not verified");
    }
}
