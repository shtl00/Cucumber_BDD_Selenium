package org.example.pages.Basket;

import org.example.driver.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.Map;

public class Page extends DriverManager {
    @FindBy(css ="#small-searchterms")
    public WebElement searchInputBox;

    @FindBy(css="button[type='submit']")
    public WebElement  searchButton;

    @FindBy(xpath= "/html/body/div[6]/div[3]/div/div[2]/div/div[2]/div[3]/div/div[2]/div/div/div[2]/div/div[2]/div[3]/div[2]/button[1]")
    public WebElement addToCartButtton;

    @FindBy(xpath="//*[@id=\"bar-notification\"]/div/p/a")
    public WebElement addToCartLink;

    //New scenario
    @FindBy(css="body > div:nth-child(6) > div:nth-child(1) > p:nth-child(1) > a:nth-child(1)")
    public WebElement clickOnShoppingCart;

    @FindBy(xpath="/html/body/div[6]/div[3]/div/div/div/div[1]/h1")
    public WebElement shoppingCartText;

    @FindBy(xpath="/html/body/div[6]/div[3]/div/div/div/div[2]/div/form/div[1]/table/tbody/tr/td[5]/input")
    public WebElement updateQty;

    @FindBy(css="#updatecart")
    public WebElement updateShoppingCart;

    @FindBy(css="#termsofservice")
    public WebElement conditions;

    @FindBy(css="#checkout")
    public WebElement checkoutButton;

    //checkout as guest

    @FindBy(className="button-1.checkout-as-guest-button")
    public WebElement guestCheckout;

    @FindBy(xpath ="title")
    public WebElement billingAddress;

    @FindBy(name ="BillingNewAddress.FirstName")
    public WebElement firstName;

    @FindBy(name ="BillingNewAddress.LastName")
    public WebElement lastName;

    @FindBy(name="BillingNewAddress.Email")
    public WebElement emailId;

    @FindBy(name ="#BillingNewAddress_CountryId")
    public WebElement country;

    @FindBy(css="#BillingNewAddress_CountryId")
    public WebElement unitedKingdom;

    @FindBy(name="BillingNewAddress.City")
    public WebElement city;

    @FindBy(xpath="BillingNewAddress.Address1")
    public WebElement address1;

    @FindBy(xpath="//*[@id=\"BillingNewAddress_ZipPostalCode\"]")
    public WebElement postCode;

    @FindBy(xpath="//*[@id=\"BillingNewAddress_PhoneNumber\"]")
    public WebElement phoneNumber;

    @FindBy(xpath="//*[@id=\"billing-buttons-container\"]/button[4]")
    public WebElement continueButton;



    public void searchInBox(){
        searchInputBox.click();
        searchInputBox.clear();
        searchInputBox.sendKeys("Jewelry");
    }
    public void clickOnSearchButton(){
        searchButton.click();
    }

    public void clickOnAddToCartButton(){
        addToCartButtton.click();
    }
    public boolean addToCartLinkVisible(){
        addToCartLink.click();
        addToCartLink.isDisplayed();
        return true;
    }
    // new scenario methods
    public void clickOnShoppingCartButton(){
        clickOnShoppingCart.click();
    }
    public boolean shoppingCartTextDisplayed(){
        shoppingCartText.isDisplayed();
        return true;
    }
    public void clickOnAddToQtyInputBox(){
        updateQty.click();
        updateQty.clear();
        updateQty.sendKeys("2");
    }

    public void clickOnUpdateShoppingCartButton(){
        updateShoppingCart.click();
    }

    public boolean clickOnTermsAndConditionsCheckBox(){
        conditions.click();
        conditions.isSelected();
        return true;
    }

    public void clickOnCheckOutButton(){
        checkoutButton.click();
    }

    // data table guest checkout

    public void clickOnGuestCheckout(){
        guestCheckout.click();
    }

    public boolean billingAdressIsDisplayed(){
        billingAddress.isDisplayed();
        return true;
    }

    public boolean entreBillingAddressDetails(String firstname, String lastname, String Email, String Country, String City , String address1, String postalcode, String phonenumber, CharSequence Phonenumber, CharSequence Address1, List<Map<String, String>> myData) throws InterruptedException {
        firstName.clear();
        firstName.sendKeys(firstname);
        lastName.clear();
        lastName.sendKeys(lastname);
        emailId.clear();
        emailId.click();
        country.click();
        unitedKingdom.isSelected();
        city.sendKeys(City);
        this.address1.sendKeys(Address1);
        postCode.sendKeys(postalcode);
        phoneNumber.sendKeys(Phonenumber);


        return true;
    }

}
