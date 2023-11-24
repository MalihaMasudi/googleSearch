Feature: Google Search functionality
  Scenario: Searching on Google
    Given I am on the Google homepage
    When I enter "Cucumber" in the search bar
    And I click the search button
    Then I should see search results