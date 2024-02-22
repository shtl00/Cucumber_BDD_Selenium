Feature:
  As end user
  I want to buy gift card
  So ,i can buy products

 Background:
    Given I am on homepage
    And I click on"Gift cards"
    And I select"Position"
    When I select "Low to high" button
    Then I can see "Virtual Giftcard"

    Scenario:

      And I entre following details
      |Recipientname|RecipientEmail|YourName|YourEmail|Message|
        |Tanishi   |  shtl90@gmail.com | Sheetal  |sparmar@ymail.com  |Good luck|
      Then I should add my giftcard to"add to cart"
