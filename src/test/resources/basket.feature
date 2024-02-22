Feature:user should add the project into basket


    Background:
    Given I am on home page
    And I  search product "Phones"
    And I click on "addproduct" button
    When I click on "basket"
    Then I should see "checkOuts"

    @NGW
    Scenario:
      Given I am on homepage
      And I go to "shoppingcart" feature
      When I click on "no" gift wrapping button
      Then I should see "No"gift wrapping selected

      Scenario:
        Given I am on homepage
        And I go to "shopping cart" feature
        When I select"terms and conditions" option
        Then I should able "checkout"in shopping cart




