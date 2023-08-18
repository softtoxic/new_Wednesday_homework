package com.virgin.games.steps;

import com.virgin.games.pages.CasinoPage;
import com.virgin.games.pages.HomePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.junit.Assert;

public class CasinoSteps {
    @And("^I click on casino link$")
    public void iClickOnCasinoLink() {
        new HomePage().clickOnCasino();
    }

    @And("^I click on Blackjack link$")
    public void iClickOnBlackjackLink() {
        new CasinoPage().clickOnBlackJackLink();
    }

    @Then("^I can see Blackjack text on Blackjack page \"([^\"]*)\"$")
    public void iCanSeeBlackjackTextOnBlackjackPage(String result) {
        Assert.assertEquals("Text not verified", result, new CasinoPage().getBlackjackText());
    }
}
