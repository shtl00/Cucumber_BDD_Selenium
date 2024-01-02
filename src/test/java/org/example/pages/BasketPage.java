package org.example.pages;

import org.example.driver.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BasketPage extends DriverManager {
    DriverManager driverManager = new DriverManager();

    @FindBy(id = "small-searchterms")
    public WebElement searchInputField;

    @FindBy(xpath = "//*[@id=\"small-search-box-form\"]/button")
    public WebElement clickOnSearch;

    @FindBy(xpath = "/html/body/div[6]/div[3]/div/div[2]/div/div[2]/div[3]/div/div[2]/div/div/div[1]/div/div[2]/div[3]/div[2]/button[1]")
    public WebElement addProduct;

    @FindBy(className = "cart-label")
    public WebElement basket;

    @FindBy(id = "checkout")
    public WebElement checkout;

    @FindBy(className = "cart-label")
    public WebElement shoppingCart;

    @FindBy(xpath = "/html/body/div[6]/div[3]/div/div/div/div[2]/div/form/div[2]/div[2]/dl/dd/select")
    public WebElement wrappingGift;
    @FindBy(xpath = "//*[@id=\"checkout_attribute_1\"]/option[1]")
    public WebElement noWrappingGift;

    @FindBy(css = ".selected-checkout-attributes")
    public WebElement noGiftWrappingVisible;

    @FindBy(className = "terms-of-service")
    public WebElement termsAndCondition;

    @FindBy(className = "checkout-buttons")
    public WebElement finalCheckout;

    public void searchProduct() {
        searchInputField.sendKeys("Phones");
    }

    public void clickOnSearchButton() {
        clickOnSearch.click();

    }

    public void clickOnAddProduct() {
        addProduct.click();
    }

    public void clickOnBasket() {
        basket.click();
    }

    public boolean checkoutVisible() {
        checkout.isDisplayed();
        return false;
    }

    public void clickOnshoppingCart() {
        shoppingCart.click();
    }

    public void selectWrappingGiftOption() throws InterruptedException {

        wrappingGift.click();
    }


    public void noGiftWrappingOptionSelected() {


        noWrappingGift.click();

    }

    public void noGiftWrappingSelectedDisplayed() {
        noGiftWrappingVisible.click();
    }

    public void selectTermandConditions() {
        termsAndCondition.click();

    }

    public void clickOnCheckoutButton() {
        finalCheckout.click();
    }


}
