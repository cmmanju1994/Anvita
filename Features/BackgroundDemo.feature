Feature: Verify Background

  Background: 
    Given I am in home

  Scenario: Validate how background keyword behaves in cucumber
    And I will be improving
    When I come outside i will go for walk
    Then I will use cycle

  Scenario: Validate background
    And I will be improving
    When I come outside i will go for run
    Then I will use bike
    
    Scenario:validate background once again
    Given I am not at home
    When i went out
    Then i will play
    
    
