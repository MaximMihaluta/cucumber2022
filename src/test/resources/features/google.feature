@regression
Feature: Google feature test verification
  Here we can add some details to the test
  #to add comments
  #given, when, then
  @smoke
  Scenario: Google title verification
    Given I am at Google homepage
    When I verify that title is Google
@Google
  Scenario: Google search verification
    Given I am at Google homepage
   When I search for dark website
    Then I verify the title contains dark web