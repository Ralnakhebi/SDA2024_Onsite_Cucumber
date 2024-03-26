Feature: Fill Form and submit with scenario outline
  Background: User will open browser and go to Simple Dynamic Buttons page

  Scenario:
    Given Open diver and go to
    And Input Validation Examples page
    When First step user will enter "<firstName>"
    And Second step user will enter "<lastName>"
    And Third step user will enter "<age>"
    And Fourth step user will enter "<country>"
    And Fifth user will enter "<notes>"
    And user will press submit button
    Then Error message will appear