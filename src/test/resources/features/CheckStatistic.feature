@Android
Feature: Add to do task

  @CheckStatistic
  Scenario: Check Statistic
    Given User is on to do list page
    When User tap button navigate up
    And User tap statistics
    Then User statistic is being shown