@Regression
Feature: Verify the login functionality of Opencart application

  Background: 
    Given user is on home page

  @Smoke
  Scenario: Verify Login Functionality with valid credentials
    When user click on login link
    Then user navigated to login page
    When user enter username as "anvita123@gmail.com" and password as "test@123"
    And click on login button
    Then login should be succeful login and text "My Account" is being displayed

  @Sanity
  Scenario: Verify Login Functionality with invalid credentials
    When user click on login link
    Then user navigated to login page
    When user enter username as "anvita123@gmail.com" and password as "test"
    And click on login button
    Then login should not be succeful and warning messeage displayed as "Warning: No match for E-Mail Address and/or Password."
