package org.example.step_definition;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.driver.DriverManager;
import org.example.pages.LoginPage;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.equalToIgnoringCase;
import static org.hamcrest.core.Is.is;

public class LoginSteps extends DriverManager {
    LoginPage loginpage=new LoginPage();
    DriverManager driverManager=new DriverManager();
    @Then("^I should see \"([^\"]*)\"text on login page$")
    public void i_should_see_text_on_login_page(String expectedText) throws Throwable {
        System.out.println(expectedText);
       String myActualWelcomeText=  loginpage.getWelcomeTextOnLoginPage();
        System.out.println(myActualWelcomeText);

        assertThat (myActualWelcomeText, is(equalToIgnoringCase(expectedText)));
    }

    @Then("^the URl should contain with \"([^\"]*)\"$")
    public void the_URl_should_contain_with(String expectedUrlText) throws Throwable {

        String myActualCurrentUrl = driverManager.getCurrentUrl();
        System.out.println(myActualCurrentUrl);
        assertThat(myActualCurrentUrl, containsString(expectedUrlText));

    }

    @When("^I entre valid Email \"([^\"]*)\" and Password \"([^\"]*)\"$")
    public void i_entre_valid_Email_and_Password(String email, String password) throws Throwable {
        loginpage.entreEmailAndPassword(email,password );

    }

    @When("^I click on login button on Login page$")
    public void i_click_on_login_button_on_Login_page() throws Throwable {
        loginpage.clickOnLoginButtonOnLogInPage();

    }

    @Then("^I should see logout button is displayed$")
    public void i_should_see_logout_button_is_displayed() throws Throwable {
        boolean isLogOutButtonDisplayed =loginpage.checkLogOutButtonIsDisplayed();
        assertThat(isLogOutButtonDisplayed, is(true));
    }
}
