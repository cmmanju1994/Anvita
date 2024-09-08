Feature: Register user functionality

  Scenario: Successful user registration
    Given user is on registration page
    When user enters details as below
      | FirstName | Anvita                  |
      | LastName  | Doni                    |
      | telephone |                 1452658 |
      | Email     | donianvita123@gmail.com |
      | Password  | Qwerrty123              |
    And user select privacy policy checkbox
    And user hit continue button
    Then account registration must be successful with msg "Your Account Has Been Created!"
