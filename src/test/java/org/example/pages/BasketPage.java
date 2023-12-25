package org.example.pages;

import org.example.driver.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BasketPage extends DriverManager {
    DriverManager driverManager=new DriverManager();

    @FindBy(id="small-searchterms")
    public WebElement searchInputField;

    @FindBy(xpath ="//*[@id=\"small-search-box-form\"]/button")
    public WebElement clickOnSearch;

    @FindBy(xpath="/html/body/div[6]/div[3]/div/div[2]/div/div[2]/div[3]/div/div[2]/div/div/div[1]/div/div[2]/div[3]/div[2]/button[1]")
    public WebElement addProduct;

    @FindBy(className = "cart-label")
    public WebElement basket;

    @FindBy(id="checkout")
    public WebElement checkout;

    public void searchProduct(){
        searchInputField.sendKeys("Phones");
    }
    public void clickOnSearchButton(){
        clickOnSearch.click();

    }
    public void clickOnAddProduct(){
        addProduct.click();
    }
    public void clickOnBasket(){
        basket.click();
    }
    public void checkoutVisible(){
        checkout.isDisplayed();
    }




}
