package org.example.step_definition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.example.driver.DriverManager;
import org.example.pages.BasketPage;

public class BasketSteps extends DriverManager {
    DriverManager driverManager = new DriverManager();
    BasketPage basketPage=new BasketPage();
    @Given("^I am on home page$")
    public void i_am_on_home_page() throws Throwable {


    }

    @Given("^I  search product \"([^\"]*)\"$")
    public void i_search_product(String arg1) throws Throwable {
        basketPage.searchProduct();
        basketPage.clickOnSearchButton();
    }

    @Given("^I click on \"([^\"]*)\" button$")
    public void i_click_on_button(String arg1) throws Throwable {
        basketPage.clickOnAddProduct();



    }

    @Then("^I should see \"([^\"]*)\"$")
    public void i_should_see(String checkOuts) throws Throwable {
        basketPage.clickOnBasket();
        basketPage.checkoutVisible();

    }
}