package org.example.pages;

import org.example.driver.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WishListPage extends DriverManager {
    DriverManager driverManager = new DriverManager();

    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[normalize-space()='Books']")
    public WebElement books;

    @FindBy(xpath = "/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div[3]/div/div[2]/h2/a")
    public WebElement prideAndPrejudie;
    @FindBy(id = "add-to-wishlist-button-39")
    public WebElement addToWishList;

    @FindBy(css = ".wishlist-label")
    public WebElement wishList;
@FindBy(xpath="//*[@id=\"bar-notification\"]/div/p/a")
public WebElement Wishlist;
    @FindBy(css = ".page-title")
    public WebElement wishListText;

    @FindBy(name="addtocart")
    public WebElement checkbox;

    @FindBy(className = "qty-input")
    public WebElement addQuantity;

    @FindBy(xpath ="/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/form/div[2]/button[2]")
    public WebElement addToCart;

    @FindBy(xpath = "/html/body/div[6]/div[3]/div/div/div/div[1]/h1")
    public WebElement shoppingcart;




    public void clickOnBooks() {
        books.click();
    }

    public void clickOnPrideAndPrijudice() {
        prideAndPrejudie.click();
    }

    public void clickOnAddToWishList() {
        addToWishList.click();
    }

    public void clickOnWishList() {
        wishList.click();
    }

    public void clickOnWishListLink(){
        wishList.click();
    }

    public boolean wishLisTextDisplayed() {
        wishListText.isDisplayed();
        return true;
    }

    public void clickOnCheckBox(){

        checkbox.click();
    }
    public void clickOnAddQuantity(){
        addQuantity.click();
        addQuantity.clear();

        addQuantity.sendKeys("2");
    }
    public void clickOnAddToCart(){
        addToCart.click();
        addToCart.click();
    }
    public boolean shoppingcartTextDisplayed(){
        shoppingcart.isDisplayed();
        return true;
    }
}

