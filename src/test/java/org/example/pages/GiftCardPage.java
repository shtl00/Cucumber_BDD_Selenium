package org.example.pages;

import org.example.driver.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GiftCardPage extends DriverManager {
    DriverManager driverManager = new DriverManager();

    @FindBy(xpath = "/html/body/div[6]/div[2]/ul[1]/li[7]/a")
    public WebElement giftCards;

    @FindBy(id = "products-orderby")
    public WebElement sortByPosition;

    @FindBy(css = "#products-orderby")
    public WebElement positionLowToHigh;

    @FindBy(xpath = "/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div[1]/div/div[2]/h2/a")
    public WebElement virtualGiftCard;


    @FindBy(xpath = "/html/body/div[6]/div[3]/div/div[2]/div/div/form/div[2]/div[1]/div[2]/div[5]/div[1]/input")
    public WebElement recipientName;

    @FindBy(id = "giftcard_43_RecipientEmail")
    public WebElement recipientEmail;

    @FindBy(id = "giftcard_43_SenderName")
    public WebElement name;

    @FindBy(id = "giftcard_43_SenderEmail")
    public WebElement email;

    @FindBy(id = "giftcard_43_Message")
    public WebElement message;
    @FindBy(id = "add-to-cart-button-43")
    public WebElement addToCartGift;
    @FindBy(xpath = "/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div[1]/div/div[2]/div[3]/div[2]/button[1]")
    public WebElement virtualGiftCardAdd;

    public void clickOnGiftCards() {
        giftCards.click();
    }

    public void clickOnPosition() {
        sortByPosition.click();
    }

    public void selectLowToHigh() {
        positionLowToHigh.click();
    }

    public void clickOnVirtualGiftCard() {

        virtualGiftCard.click();
    }
    public void entreGiftCardDetails(String Recipientname, String RecipientEmail, String YourName, String YourEmail, String Message) throws InterruptedException {
        recipientName.clear();
        recipientName.sendKeys(Recipientname);
        recipientEmail.clear();
        recipientEmail.sendKeys(RecipientEmail);
        name.clear();
        name.sendKeys(YourName);
        email.clear();
        email.sendKeys(YourEmail);
        message.clear();
        message.sendKeys(Message);
        driverManager.sleepBrowser(4000);

    }

    public void entreGiftCardAddToCart() {
        addToCartGift.click();
    }

    public void virtualGiftCardAddToCart() {
        virtualGiftCardAdd.click();
    }
}



