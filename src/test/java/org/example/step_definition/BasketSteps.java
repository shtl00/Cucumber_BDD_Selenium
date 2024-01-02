package org.example.step_definition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.driver.DriverManager;
import org.example.pages.BasketPage;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class BasketSteps extends DriverManager {
    DriverManager driverManager = new DriverManager();
    BasketPage basketPage = new BasketPage();

    @Given("^I am on home page$")
    public void i_am_on_home_page() throws Throwable {
        driverManager.getCurrentUrl();

    }

    @And("^I  search product \"([^\"]*)\"$")
    public void i_search_product(String arg1) throws Throwable {
        basketPage.searchProduct();
        basketPage.clickOnSearchButton();
    }

    @When("^I click on \"([^\"]*)\" button$")
    public void i_click_on_button(String arg1) throws Throwable {
        basketPage.clickOnAddProduct();
    }

    @Then("^I should see \"([^\"]*)\"$")
    public void i_should_see(String checkOuts) throws Throwable {
        basketPage.clickOnBasket();
        basketPage.checkoutVisible();
        boolean isCheckoutButtonDisplayed = basketPage.checkoutVisible();
        assertThat(isCheckoutButtonDisplayed, is(true));


    }

    @And("^I go to \"([^\"]*)\" feature$")
    public void i_go_to_feature(String arg1) throws Throwable {

        basketPage.clickOnshoppingCart();
    }

    @When("^I click on \"([^\"]*)\" gift wrapping button$")
    public void i_click_on_gift_wrapping_button(String arg1) throws Throwable {

        basketPage.selectWrappingGiftOption();
        basketPage.noGiftWrappingOptionSelected();


    }

    @Then("^I should see \"([^\"]*)\"gift wrapping selected$")
    public void i_should_see_gift_wrapping_selected(String arg1) throws Throwable {
        basketPage.noGiftWrappingOptionSelected();
        basketPage.noGiftWrappingSelectedDisplayed();

    }

    @When("^I select\"([^\"]*)\" option$")
    public void i_select_option(String arg1) throws Throwable {

        basketPage.selectTermandConditions();
    }

    @Then("^I should able \"([^\"]*)\"in shopping cart$")
    public void i_should_able_in_shopping_cart(String arg1) throws Throwable {
        basketPage.clickOnCheckoutButton();

    }


}
