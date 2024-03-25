Feature: Name of the feature file
  This is the description that i am adding to the feature file


  Scenario: The name of the scenario
    Given I open the browser
    And I am on the google homepage
    When I search for amazon on google
    Then I should see amazon on the results
    Then close the browser

  Scenario: The name of the scenario
    Given I open the browser
    And I am on the google homepage
    When I search for "java" on google
    Then I should see "java" on the results
    Then close the browser