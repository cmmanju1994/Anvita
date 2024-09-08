Feature: Testing paralelle compatibility

  Background: 
    Given user is on google page

  Scenario: Searching oppo mobile
    When user enter mobile brand as "oppo"
    Then oppo appears

  Scenario: Searching apple mobile
    When user enter mobile brand as "apple"
    Then apple appears
