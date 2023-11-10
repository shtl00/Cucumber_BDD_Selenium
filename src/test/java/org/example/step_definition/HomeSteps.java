package org.example.step_definition;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.example.driver.DriverManager;
import org.example.pages.HomePage;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.endsWith;
import static org.hamcrest.Matchers.is;

public class HomeSteps extends DriverManager {
    DriverManager driverManager=new DriverManager();
    HomePage homepage=new HomePage();


    @Given("^I am on homepage$")
    public void i_am_on_homepage() throws Throwable {
        String myActualUrl= driverManager.getCurrentUrl();
        System.out.println(myActualUrl);
        assertThat(myActualUrl, is(endsWith("nopcommerce.com/")));
    }

        @When("^I click on login button$")
    public void i_click_on_login_button() throws Throwable {
        homepage.clickOnLoginButton();


        }
}
