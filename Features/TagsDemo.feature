Feature: Validating tags

  @Sanity
  Scenario: Validation of tags
    Given This is scenario 1

  @Smoke  @Regression
  Scenario: Validation of tags again
    Given It is also tags validation

  @Smoke @Sanity
  Scenario: Behaviour of tags
    Given tags behaviour

  @Regression
  Scenario Outline: Tags again
    Given I am "<name>"  and "<surname>"

    Examples: 
      | name      | surname |
      | Manjunath | Doni    |
      | Anvita    | Doni    |
      | Kiran     | Bedi    |
