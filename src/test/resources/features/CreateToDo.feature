@Android
Feature: Create To Do

  @CreateToDo
  Scenario: Create To Do
    Given User is on to do list page
    When User tap button fab_add_task
    Then User is on new to do page
    And User input title and content
    Then User tap button fab_edit_task_done