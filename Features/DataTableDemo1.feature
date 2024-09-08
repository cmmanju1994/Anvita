Feature: Login Functionality

  Scenario: Validating the login functionality using data tables
    Given user in on the login page
    When user enter password and username as below
      | anvita123@gmail.com |
      | test@123            |
    And hit login button
    Then login should be successful
