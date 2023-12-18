package org.example.pages;

import org.example.driver.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage extends DriverManager{
    DriverManager driverManager=new DriverManager();

    @FindBy(className="ico-register")
    public WebElement homepageRegistration;

    @FindBy(id="gender-female")
    public WebElement genderFemale;

    @FindBy(id="FirstName")
    public WebElement firstName;

    @FindBy(id="LastName")
    public WebElement lastname;

    @FindBy(id="Email")
    public WebElement emailId;

    @FindBy(id="Password")
    public WebElement password;

    @FindBy(id="ConfirmPassword")
    public WebElement confirmPassword;

    @FindBy(id="register-button")
    public WebElement registrationButton;

    @FindBy(className = "result")
    public WebElement registrationCompleted;

    public void clickHomePageRegistration(){
        homepageRegistration.click();}

    public void selectGenderRadioButton(){
        genderFemale.isSelected();}

    public void firstNameInputBox(){
        firstName.clear();
        firstName.sendKeys("sheetal");}
    public void lastNameInputBox(){
        lastname.clear();
        lastname.sendKeys("parmar");}

    public void emailIdInputField(){
        emailId.clear();
        emailId.sendKeys("shtl90@gmail.com");}
    public void passwordInputField(){
        password.clear();
        password.sendKeys("abcd123");}

    public void setConfirmPasswordInputField(){
        confirmPassword.clear();
        confirmPassword.sendKeys("abcd123");}
    public void lastRegistrationButton(){
        registrationButton.click();}

    public void confirmRegistrationCompletedText(){
        registrationCompleted.isDisplayed();
    }





}
