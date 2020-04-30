@Android
Feature: Check To Do Checkbox

  @CheckTodo
  Scenario: Check To Do Checkbox
    Given User is on to do list page
    When User check the task checkbox
    Then User task is checked