Feature: online slots page test
  As a user i want to navigate to The vault page

  @sanity @regression
  Scenario: Verify user should navigate to The vault page successfully
    Given I am on homepage
    And I accept cookies
    And I click on online slots link
    And I click on The vault
    Then I can see welcome text on The vault page "Welcome to The Vault"










