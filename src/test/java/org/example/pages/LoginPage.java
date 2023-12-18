package org.example.pages;

import org.example.driver.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends DriverManager {
    @FindBy(css=".page-title")
    public WebElement welcomeLoginText;

    @FindBy(id="Email")
    public WebElement emailInputField;

    @FindBy(id="Password")
    public WebElement passwordInputField;

    @FindBy(css=".login-button")
    public WebElement loginButtonOnLogin;

    @FindBy(css=".ico-logout")
    public WebElement logOutButton;



    public String getWelcomeTextOnLoginPage(){
       return welcomeLoginText.getText();
    }

    public void entreEmailAndPassword(String email,String password){
        emailInputField.clear();
        emailInputField.sendKeys(email);
        passwordInputField.clear();
        passwordInputField.sendKeys(password);
    }

    public void clickOnLoginButtonOnLogInPage(){
      loginButtonOnLogin.click();

    }

    public boolean checkLogOutButtonIsDisplayed(){
        return logOutButton.isDisplayed();
    }



}
