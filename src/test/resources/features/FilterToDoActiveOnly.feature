@Android
Feature: Filter To Do Active Only

  @FilterTodoActiveOnly
  Scenario: Filter To Do Active Only
    Given User is on to do list page
    When User tap button filter
    And User tap active selector
    Then User go to to do active only page