Feature: Fill Form and submit with scenario outline
  Background: User will open browser and go to Input Validation Examples page

    @ScenarioOutline
    Scenario Outline:
      Given Open diver and go to Input Validation Examples page
      When First step user will enter "<firstName>"
      And Second step user will enter "<lastName>"
      And Third step user will enter "<age>"
      And Fourth step user will enter "<country>"
      And Fifth user will enter "<notes>"
      And user will press submit button
      Then Error message will appear

      Examples:
        | firstName | lastName | age | country      | notes      |  |
        | Name3     | surname3 | 44  | Saudi Arabia | first line |  |
        | Name1     | surname1 | 22  | Saudi Arabia | note2      |  |
        | Name2     | surname2 | 66  | Saudi Arabia | note3      |  |


