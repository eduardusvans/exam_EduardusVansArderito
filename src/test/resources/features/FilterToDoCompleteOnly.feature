@Android
Feature: Filter To Do Complete Only

  @FilterToDoCompleteOnly
  Scenario: Filter To Do Complete Only
    Given User is on to do list page
    When User tap button filter
    And User tap complete selector
    Then User go to to do complete only page