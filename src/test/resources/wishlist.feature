Feature:
  As an end user
  I can add product in wishlist

  @WL
  Scenario:
    Given I am on homepage
    And I select on "Books"
    When I select "Pride and Prejudice"book to wishlist
    And I should be able to see "Wishlist" text
    And I click on  "add to cart" checkbox
    And I add quantity
    And I click on "add to cart" button
    Then I can should see "shoppingcart"










