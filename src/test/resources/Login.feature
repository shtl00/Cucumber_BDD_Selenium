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