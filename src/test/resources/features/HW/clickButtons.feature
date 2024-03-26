Feature: Fill Form and submit with scenario outline
  Background: User will open browser and go to Simple Dynamic Buttons page
    Given go to Simple Dynamic Buttons page

  @R
  Scenario:
    When Click on "start" Button
    When Click on "One" Button
    When Click on "Two" Button
    When Click on "Three" Button
    Then verify message will appear
