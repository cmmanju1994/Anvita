Feature: World cup selection

  Background: 
    Given Player is good cricket

  Scenario: World cup player selection on basis of ipl
    And he scored more runs in ipl
    When player played good ipl season in the current year
    Then he will be selected

  Scenario: ipl  player selection on basis of ranaji
    And he scored more runs in ranaji
    When player played good ranaji season in the current year
    Then he will be selected
