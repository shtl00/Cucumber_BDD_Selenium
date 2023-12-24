Feature:user should add the project into basket
 @BSK
  Scenario:
   Given I am on home page
   And I  search product "Phones"
   And I click on "addproduct" button
   When I click on "basket"
   Then I should see "checkOuts"


