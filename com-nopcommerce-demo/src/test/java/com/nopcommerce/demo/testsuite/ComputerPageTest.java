package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.BuildYourOwenComputerPage;
import com.nopcommerce.demo.pages.ComputerPage;
import com.nopcommerce.demo.pages.DesktopPage;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ComputerPageTest extends BaseTest {

    ComputerPage computerPage;
    DesktopPage desktopPage;
    BuildYourOwenComputerPage buildYourOwenComputerPage;

    @BeforeMethod(alwaysRun = true)
    public void inIt() {
        computerPage = new ComputerPage();
        desktopPage = new DesktopPage();
        buildYourOwenComputerPage = new BuildYourOwenComputerPage();
    }

    @Test
    public void verifyUserShouldNavigateToComputerPageSuccessfully() {
        computerPage.clickOnComputerTab();
        String expectedText = "Computers";
        String actualText = computerPage.getComputerText();
        Assert.assertEquals(expectedText, actualText, "Text not verified");
    }

    @Test
    public void verifyUserShouldNavigateToDesktopsPageSuccessfully() {
        computerPage.clickOnComputerTab();
        computerPage.clickOnDesktops();
        String expectedText = "Desktops";
        String actualText = desktopPage.getDesktopsText();
        Assert.assertEquals(expectedText, actualText, "Text not verified");
    }

    @Test
    @Parameters({"processor", "ram", "hdd", "os", "software"})
    public void VerifyThatUserShouldBuildYouOwnComputerAndAddThemToCartSuccessfully(@Optional String processor, @Optional String ram,
                                                                                  @Optional String hdd,@Optional String os,@Optional String software) throws InterruptedException {



        computerPage.clickOnComputerTab();
        Thread.sleep(1000);
        computerPage.clickOnDesktops();
        Thread.sleep(1000);
        buildYourOwenComputerPage.clickOnBuildComputer();
        Thread.sleep(3000);
        buildYourOwenComputerPage.selectProcessor(processor);
        Thread.sleep(3000);
        buildYourOwenComputerPage.selectRam(ram);
        Thread.sleep(3000);
        buildYourOwenComputerPage.selectHDD(hdd);
        Thread.sleep(3000);
        buildYourOwenComputerPage.selectOsRadio(os);
        Thread.sleep(3000);
        buildYourOwenComputerPage.selectSoftware(software);
        Thread.sleep(3000);
        buildYourOwenComputerPage.clickOnAddToCartButton();
        String expectedText = "The product has been added to your shopping cart";
        String actualText = buildYourOwenComputerPage.getTextFromCart();
        Assert.assertEquals(expectedText, actualText, "Text not verified");


    }
}
