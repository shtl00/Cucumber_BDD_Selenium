package org.example.pages.Basket;

import org.example.driver.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ApparelPage extends DriverManager {

    @FindBy(css="body > div:nth-child(7) > div:nth-child(2) > ul:nth-child(1) > li:nth-child(3) > a:nth-child(1)")
    public WebElement apparelButton;

    @FindBy(xpath="/html/body/div[6]/div[2]/ul[1]/li[3]/ul/li[2]/a")
    public WebElement clothingButton;

    @FindBy(xpath = "/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div[2]/div/div[2]/h2/a")
    public WebElement levisJeans;

    @FindBy(className = "button-2 product-box-add-to-cart-button")
    public WebElement addToCart ;

}
