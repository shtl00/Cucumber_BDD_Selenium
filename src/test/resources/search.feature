Feature: search functionality
  As end user
  I want to search product
  So that i can view the search result

  Scenario:Search for product
    Given I am on homepage
    When I search for a poduct"Nike"
    Then I shoud be able to see the respective product
