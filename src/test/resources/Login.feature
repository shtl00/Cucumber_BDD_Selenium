@BK
Feature:Login functionality
  As a end user
  I wan to login to website
  So that i can check my account

Scenario:Validate login page
  Given I am on homepage
  When I click on login button
  Then I should see "Welcome, Please Sign In!"text on login page
  And the URl should contain with "/login"

  Scenario:Login with valid scenario
   Given I am on homepage
    When I click on login button
    And I entre valid Email "parmarsheetal@ymail.com" and Password "abcd123"
    And I click on login button on Login page
    Then I should see logout button is displayed

  Scenario Outline :Login with different details
    Given I am on homepage
    When I click on login button
    And I entre valid Email "<myEmail>" and Password "<myPassword>"
    And click on login button on Login page
    Then should see logout button is displayed

    Examples:
     |myEmail|myPassword|
    |     shtl90@gmail.com  | abcd123    |
    |     mayank26@gmail.com  |abcd123   |

