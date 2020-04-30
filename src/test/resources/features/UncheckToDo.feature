@Android
Feature: Uncheck To Do Checkbox

  @UncheckToDo
  Scenario: Uncheck To Do Checkbox
    Given User is on to do list page
    When User uncheck the task checkbox
    Then User task is unchecked