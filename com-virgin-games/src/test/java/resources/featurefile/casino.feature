Feature: Live casino test
  As a user i want to navigate to computer page

  @smoke @regression
  Scenario: Verify user should navigate to Live Blackjack page successfully
    Given I am on homepage
    And I accept cookies
    And I click on casino link
    And I click on Blackjack link
    Then I can see Blackjack text on Blackjack page "Online Blackjack"

