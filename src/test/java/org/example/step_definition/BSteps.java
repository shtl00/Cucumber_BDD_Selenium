package org.example.step_definition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.driver.DriverManager;
import org.example.pages.Basket.Page;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class BSteps extends DriverManager {
    DriverManager driverManager=new DriverManager();
    Page bp=new Page();


    @Given("^I am on home page$")
    public void i_am_on_home_page() throws Throwable {
        driverManager.getCurrentUrl();

    }

    @And("^I  search product \"([^\"]*)\"$")
    public void i_search_product(String arg1) throws Throwable {
       bp.searchInBox();
    bp.clickOnSearchButton();
    }

    @When("^I click on \"([^\"]*)\" button$")
    public void i_click_on_button(String arg1) throws Throwable {
       bp.clickOnAddToCartButton();
       bp.addToCartLinkVisible();
    }

    @Then("^I should see \"([^\"]*)\"$")
    public void i_should_see(String checkOuts) throws Throwable {
        bp.clickOnShoppingCartButton();
        bp.addToCartLinkVisible();
        boolean isCheckoutButtonDisplayed = bp.addToCartLinkVisible();
        assertThat(isCheckoutButtonDisplayed, is(true));


    }

    @And("^I go to \"([^\"]*)\" feature$")
    public void i_go_to_feature(String arg1) throws Throwable {

      bp.clickOnShoppingCartButton();
      bp.shoppingCartTextDisplayed();
    }

    @When("^I click on \"([^\"]*)\" gift wrapping button$")
    public void i_click_on_gift_wrapping_button(String arg1) throws Throwable {
        bp.clickOnAddToQtyInputBox();
       bp.clickOnUpdateShoppingCartButton();
    }

    @Then("^I should see \"([^\"]*)\"gift wrapping selected$")
    public void i_should_see_gift_wrapping_selected(String arg1) throws Throwable {


    }

    @When("^I select\"([^\"]*)\" option$")
    public void i_select_option(String arg1) throws Throwable {
        bp.clickOnTermsAndConditionsCheckBox();


    }

    @Then("^I should able \"([^\"]*)\"in shopping cart$")
    public void i_should_able_in_shopping_cart(String arg1) throws Throwable {
        bp.clickOnCheckOutButton();


    }

}
