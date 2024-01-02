package org.example.step_definition;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.driver.DriverManager;
import org.example.pages.GiftCardPage;

import java.util.List;
import java.util.Map;

public class GiftCardSteps extends DriverManager {
    DriverManager driverManager=new DriverManager();

    GiftCardPage giftCardPage= new GiftCardPage();


    @And("^I click on\"([^\"]*)\"$")
    public void i_click_on(String arg1) throws Throwable {
        giftCardPage.clickOnGiftCards();


    }

    @And("^I select\"([^\"]*)\"$")
    public void i_select(String arg1) throws Throwable {
        giftCardPage.clickOnPosition();

    }

    @When("^I select \"([^\"]*)\" button$")
    public void i_select_button(String arg1) throws Throwable {
        giftCardPage.selectLowToHigh();

    }

    @Then("^I can see \"([^\"]*)\"$")
    public void i_can_see(String arg1) throws Throwable {
        giftCardPage.clickOnVirtualGiftCard();

    }

    @When("^I entre following details$")
    public void i_entre_following_details(DataTable dataTable) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
        // E,K,V must be a scalar (String, Integer, Date, enum etc)


        List<Map<String, String>> myData = dataTable.asMaps(String.class, String.class);
        System.out.println(myData);
        try {
         giftCardPage.entreGiftCardDetails(
                 myData.get(0).get("recipientname"),
                    myData.get(0).get("RecipientEmail"),
                    myData.get(0).get("YourName"),
                    myData.get(0).get("yourEmail"),
                    myData.get(0).get("Message"));
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Then("^I should add my giftcard to\"([^\"]*)\"$")
    public void i_should_add_my_giftcard_to(String arg1) throws Throwable {
        giftCardPage.enreGiftCardAddToCart();

    }


}
