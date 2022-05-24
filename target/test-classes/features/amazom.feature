

Feature: Verify search funciotionality
@amazon
  Scenario:  Verify search funciotionality
    Given I am at amazon application
    When I search for apple watch
Then I see the product is displayed
    And I open first product
    Then I verify the title contains apple watch
    And I add product to the cart