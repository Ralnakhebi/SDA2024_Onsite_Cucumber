Feature: Name of the feature file
  This is the description that i am adding to the feature file
Background: The name of background
  Given I open the browser
  And I am on the google homepage

  @myTage
  Scenario: The name of the scenario
    When I search for amazon on google
    Then I should see amazon on the results
    Then close the browser

  Scenario: The name of the scenario
    When I search for "java" on google
    Then I should see "java" on the results
    Then close the browser