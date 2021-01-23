@Search-Cars
Feature: Acceptance testing to validate Search Cars Page is working.
  In order to validate that 
  the Search Cars page is working
  Doing the Acceptance Testing

  @Search-Cars-Positive
  Scenario: Validate Search Cars Page
    Given I am on the Home Page "https://www.just-eat.co.uk/" of Launch
    And I want food in "AR51 1AA"
    When I search for restaurants
    


    