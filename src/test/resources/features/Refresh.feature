@Android
Feature: Refresh To Do List

  @Refresh
  Scenario: Refresh To Do List
    Given User is on to do list page
    When User tap button options
    And User tap refresh
    Then User to do list is refreshed