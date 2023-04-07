package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

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

    //US012 Ekleme(ilk 5 Findby burada da kullanildi)

    @FindBy(xpath="//span[normalize-space()='My Operations']")
    public WebElement myoperations;

    @FindBy(xpath="//a[@href='/tp-customer']")
    public WebElement managecustomers;

    @FindBy(xpath="//table[@class='table']//thead")
    public List<WebElement> custumerswebtablesheader;

    @FindBy(xpath="//tbody/tr[1]/td[10]/div[1]/a[1]")
    public WebElement viewilkeleman;
    @FindBy(xpath="//tbody/tr[1]/td[10]/div[1]/a[2]")
    public WebElement editilkeleman;
    @FindBy(xpath="//tbody/tr[1]/td[10]/div[1]/a[3]")
    public WebElement deleteilkeleman;
    @FindBy(xpath="//span[contains(text(),'Edit')]")
    public WebElement editiceleman;

    @FindBy(className="col-md-8")
    public WebElement createoredittitle;

    @FindBy(xpath="//div[@id='gmibankfrontendApp.tPCustomer.delete.question']")
    public WebElement deletesuremessage;

    //US013 Ekleme(Ilk 5 Findby ve myoperations buradada kullanildi

    @FindBy(xpath = "//span[normalize-space()='Manage Accounts']")
    public WebElement manageaccounts;

    @FindBy(xpath = "//span[normalize-space()='Create a new Account']")
    public WebElement createanewaccount;

    @FindBy(xpath = "//input[@id='tp-account-description']")
    public WebElement description;

    @FindBy(xpath = "//input[@id='tp-account-balance']")
    public WebElement balance;

    @FindBy(xpath ="//select[@id='tp-account-accountType']")
    public WebElement accountType;

    @FindBy(id = "tp-account-accountStatusType")
    public WebElement accountStatusType;

    @FindBy(xpath = "//select[@id='tp-account-employee']")
    public WebElement employeedropdown;

    @FindBy(xpath = "//button[@id='save-entity']")
    public WebElement savebutton;

    @FindBy(xpath ="//span[normalize-space()='Accounts']")
    public WebElement accounttittle;


}
