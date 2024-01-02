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

    @FindBy(css = ".page-title")
    public WebElement wishListText;



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

    public boolean wishLisTextDisplayed() {
        wishListText.isDisplayed();
        return true;
    }
}

