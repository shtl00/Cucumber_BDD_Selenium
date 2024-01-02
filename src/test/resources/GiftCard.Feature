Feature:
  As end user
  I want to buy gift card
  So ,i can buy products

  Scenario:
    Given I am on homepage
    And I click on"Gift cards"
    And I select"Position"
    When I select "Low to high" button
    Then I can see "Virtual Giftcard"

    Scenario:
      When I click on "Virtual Giftcard"
      And I entre following details
      | recipientname|RecipientEmail|YourName|YourEmail|Message|
      |     Tanishi   |  shtl90@gmail.com | Sheetal  | Parmar  |Good luck|
      Then I should add my giftcard to"add to cart"
