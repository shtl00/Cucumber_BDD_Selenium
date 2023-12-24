package org.example.step_definition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.driver.DriverManager;
import org.example.pages.WishListPage;

public class WhishListSteps extends DriverManager {
    DriverManager driverManager = new DriverManager();
    WishListPage wishListPage = new WishListPage();

    @And("^I select on \"([^\"]*)\"$")
    public void i_select_on(String arg1) throws Throwable {
        wishListPage.clickOnBooks();

    }
    @When("^I select \"([^\"]*)\"book to wishlist$")
    public void i_select_book_to_wishlist(String arg1) throws Throwable {
        wishListPage.clickOnPrideAndPrijudice();
        wishListPage.clickOnAddToWishList();
    }

    @Then("^I should be able to see \"([^\"]*)\" button in wishlist$")
    public void i_should_be_able_to_see_button_in_wishlist(String arg1) throws Throwable {
        wishListPage.clickOnWishList();
        wishListPage.addToCartButton();

    }

}
