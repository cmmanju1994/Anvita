Feature: Verify the login functionality of Opencart application

  Scenario Outline: Verify Login Functionality with valid multiple data
    Given user is on home page
    When user click on login link
    Then user navigated to login page
    When user enter username as "<username>" and password as "<password>" and "<expected>"
    And click on login button
    Then login should be succeful login and text "My Account" is being displayed

    Examples:
    |username|password|expected|
    |anvita123@gmail.com|test@123|valid|
    |anvita123@gmail.com|test@321|valid|
    |anvita123@gmail.com|test@789|valid|
    |anvita123@gmail.com|test@478|valid|
    