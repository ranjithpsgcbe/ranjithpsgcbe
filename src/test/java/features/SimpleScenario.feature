@Test
Feature: QA Engineer Pre-assessment


  Scenario: Validate Subtract of two numbers
    Given I open a browser
    When I navigate to Online Calculator page
    Then I Subtract of two numbers
    And Verify the "Subtract" Screenshot


  Scenario: Validate Division of two numbers
    Given I open a browser
    When I navigate to Online Calculator page
    And I Divide two numbers
    And Verify the "Division" Screenshot


  Scenario: Validate CE
    Given I open a browser
    When I navigate to Online Calculator page
    And I Enter CE Button
    And Verify the "CE" Screenshot


  Scenario: Validate Nagative Scenario
    Given I open a browser
    When I navigate to Online Calculator page
    And I Validate Negative Scenario
    And Verify the "Negative" Screenshot