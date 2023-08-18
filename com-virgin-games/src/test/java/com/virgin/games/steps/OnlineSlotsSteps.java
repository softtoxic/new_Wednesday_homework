package com.virgin.games.steps;

import com.virgin.games.pages.HomePage;
import com.virgin.games.pages.OnlineSlots;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;

public class OnlineSlotsSteps {
    @Given("^I am on homepage$")
    public void iAmOnHomepage() {
    }

    @And("^I accept cookies$")
    public void iAcceptCookies() {
        new HomePage().acceptCookies();
    }

    @And("^I click on online slots link$")
    public void iClickOnOnlineSlotsLink() {
        new HomePage().clickOnOnlineSlots();
    }

    @And("^I click on The vault$")
    public void iClickOnTheVault() {
new OnlineSlots().clickOnTheVault();
    }

    @Then("^I can see welcome text on The vault page \"([^\"]*)\"$")
    public void iCanSeeWelcomeTextOnTheVaultPage(String result)  {
        Assert.assertEquals("Welcome text not verified", result, new OnlineSlots().getWelcomeText());
    }
}
