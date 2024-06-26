Feature: Search in google


  Background:
    Given user goes to google page
  @Samsung
  Scenario: TC01_samsungSearch
    When user searches for "samsung"
    Then tests the page title contains the word "samsung"
    And closes the page
  @Cucumber
  Scenario: TC02_samsungSearch
    When user searches for "cucumber"
    Then tests the page title contains the word "cucumber"
    And closes the page


  Scenario Outline: Scenario to search for different values and verify the result
    When user searches for "<searchKey>"
    Then tests the page title contains the word "<searchKey>"
    And closes the page
    Examples:
      | searchKey | searchKey |  |
      | cucumber  | cucumber  |  |
      | java      | java      |  |


