package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class PagesMZ {
    public PagesMZ() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    //US005
    @FindBy(xpath="//li[@id='account-menu']")
    public WebElement accountMenu;

    @FindBy(xpath="//span[normalize-space()='Sign in']")
    public WebElement signIn;

    @FindBy(xpath="//input[@id='username']")
    public WebElement username;

    @FindBy(xpath="//input[@id='password']")
    public WebElement password;

    @FindBy(xpath="//button[@type='submit']")
    public WebElement signInButton;

    @FindBy(xpath="//strong[normalize-space()='Failed to sign in!']")
    public WebElement failedToSignIn;


    @FindBy(xpath="//a[@href='/account/reset/request']")
    public WebElement forgetpassword;

    @FindBy(xpath="//button[@type='submit']")
    public WebElement resetPasswordButton;

    @FindBy(xpath="//span[normalize-space()='Register a new account']")
    public WebElement registeranewaccount;

    @FindBy(xpath="//h1[@id='register-title']")
    public WebElement registrationtitel;


}
