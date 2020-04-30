@Android
Feature: Clear Completed To Do

  @ClearCompletedToDo
  Scenario: Clear Completed To Do
    Given User is on to do list page
    When User tap button options
    And User tap clear completed
    Then User completed task is cleared