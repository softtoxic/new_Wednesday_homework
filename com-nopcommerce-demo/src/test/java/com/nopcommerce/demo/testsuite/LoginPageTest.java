package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.LoginPage;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseTest {
    HomePage homePage;
    LoginPage loginPage;

    @BeforeMethod(alwaysRun = true)
    public void inIt() {
        homePage = new HomePage();
        loginPage = new LoginPage();
    }

    @Test
    public void userShouldNavigateToLoginPageSuccessFully() throws InterruptedException {
        Thread.sleep(1000);
        loginPage.clickOnLoginLink();
        String expectedText = "Welcome, Please Sign In!";
        String actualText = loginPage.getWelcomeText();
        Assert.assertEquals(actualText, expectedText, "Login page not displayed");
    }

    @Test
    public void verifyTheErrorMessageWithInValidCredentials() throws InterruptedException {
        Thread.sleep(1000);
        loginPage.clickOnLoginLink();
        Thread.sleep(1000);
        loginPage.enterEmail("abcd@gmail.com");
        Thread.sleep(1000);
        loginPage.enterPassword("abcd@000");
        Thread.sleep(1000);
        loginPage.clickOnLogin();
        String expectedText = "Login was unsuccessful. Please correct the errors and try again.\n" +
                "The credentials provided are incorrect";
        String actualText = loginPage.getUnsuccessfulMessage();
        Assert.assertEquals(actualText, expectedText, "The credentials provided are incorrect");
    }

    @Test
    public void verifyThatUserShouldLogInSuccessFullyWithValidCredentials() throws InterruptedException {
        Thread.sleep(1000);
        loginPage.clickOnLoginLink();
        Thread.sleep(1000);
        loginPage.enterEmail("abcxyz@gmail.com");
        Thread.sleep(1000);
        loginPage.enterPassword("abc@000");
        Thread.sleep(1000);
        loginPage.clickOnLogin();
        Thread.sleep(1000);
        homePage.isLogoutLinkDisplayed();
        String actualResult = homePage.getTextFromLogout();
        String expectedResult ="Log out" ;
        Assert.assertEquals(expectedResult, actualResult, "Text not verified");
    }

    @Test
    public void VerifyThatUserShouldLogOutSuccessFully() throws InterruptedException {
        Thread.sleep(1000);
        loginPage.clickOnLoginLink();
        Thread.sleep(1000);
        loginPage.enterEmail("abcxyz@gmail.com");
        Thread.sleep(1000);
        loginPage.enterPassword("abc@000");
        Thread.sleep(1000);
        loginPage.clickOnLogin();
        Thread.sleep(1000);
        homePage.clickOnLogoutButton();
        Thread.sleep(2000);
        String expectedText = "Log in";
        String actualText = homePage.getTextFromLogin();
        Assert.assertEquals(expectedText, actualText, "Text not verified");

    }
}
