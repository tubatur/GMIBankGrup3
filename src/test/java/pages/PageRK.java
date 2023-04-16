package pages;

import org.bouncycastle.jcajce.provider.asymmetric.X509;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;


public class PageRK {


    public PageRK() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//a[@aria-haspopup='true'])[2]")
    public WebElement accountMenu;

    @FindBy(xpath = "(//span[text()='Register'])[1]")
    public WebElement registerButton;

    @FindBy(xpath = "//*[@id=\"entity-menu\"]/a")
    public WebElement myOperationsMenu;


    @FindBy(xpath = "//span[normalize-space()='Manage Accounts']")
    public WebElement manageAccount;

    @FindBy(xpath = "//*[@id=\"entity-menu\"]/div/a[2]")
    public WebElement transferMoney;


    @FindBy(xpath = "//select[@id='fromAccountId']")
    public WebElement fromBox;


    @FindBy(xpath = "//select[@id='toAccountId']")
    public WebElement toBox;


    @FindBy(xpath = "//input[@id='balance']")
    public WebElement balanceBox;


    @FindBy(xpath = "//textarea[@id='description']")
    public WebElement descriptionBox;

    @FindBy(xpath = "//button[@id='make-transfer']")
    public WebElement makeTransferButton;

    @FindBy(xpath = "//*[@id=\"app-view-container\"]/div[1]/div/div/div/form/div[4]/div/div")
    public WebElement invalidFeedback;

    @FindBy(xpath = "//span[normalize-space()='Create a new Account']")
    public WebElement newAccount;

    @FindBy(xpath = "//input[@id='tp-account-description']")
    public WebElement description;

    @FindBy(xpath = "//input[@id='tp-account-balance']")
    public WebElement balance;


    @FindBy(xpath = "//input[@id='tp-account-createDate']")
    public WebElement createDateBox;

    @FindBy(xpath = "//input[@id='tp-account-closedDate']")
    public WebElement closeDateBox;

    @FindBy(xpath = "//span[normalize-space()='Save']")
    public WebElement saveButton ;

    @FindBy(xpath = "(//div[@role='alert'])[1]")
    public WebElement alertMessage;


    @FindBy(xpath="//span[normalize-space()='Sign in']")
    public WebElement signIn;

    @FindBy(xpath="//input[@id='username']")
    public WebElement username;

    @FindBy(xpath="//input[@id='password']")
    public WebElement password;

    @FindBy(xpath="//button[@type='submit']")
    public WebElement signInButton;

    @FindBy(xpath = "//input[@name='ssn']")
    public WebElement SSNBox;

    @FindBy(xpath = "//input[@name='firstname']")
    public WebElement firstNameBox;

    @FindBy(xpath = "//input[@name='lastname']")
    public WebElement lastNameBox;

    @FindBy(xpath = "//input[@name='address']")
    public WebElement addressBox;

    @FindBy(xpath = "//input[@name='mobilephone']")
    public WebElement phoneBox;

    @FindBy(xpath = "//input[@name='username']")
    public WebElement userNameBox;

    @FindBy(xpath = "//input[@name='email']")
    public WebElement emailBox;

    @FindBy(xpath = "//input[@name='firstPassword']")
    public WebElement newPasswordBox;

    @FindBy(xpath = "//input[@name='secondPassword']")
    public WebElement newPasswordConfirmationBox;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement registerSubmitButton;

    @FindBy(xpath = "//div[@class='invalid-feedback']")
    public WebElement errorMessageEmail;

    @FindBy(xpath = "//div[@class='invalid-feedback']")
    public WebElement errorMessageSSN;

    @FindBy(xpath = "//div[@class='invalid-feedback']")
    public WebElement errorMessageFirstName;

    @FindBy(xpath = "//div[@class='invalid-feedback']")
    public WebElement errorMessageNewPassword;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[9]")
    public WebElement errorMessageNewPasswordConfirmation;

    @FindBy(xpath = "//input[@name='search-ssn']")
    public WebElement searchSSN;

    @FindBy(xpath = "//input[@name='firstName']")
    public WebElement firstName;


    @FindBy(xpath = "//input[@name='lastName']")
    public WebElement lastName;

    @FindBy(xpath = "//input[@name='middleInitial']")
    public WebElement middleInitial;

    @FindBy(xpath = "//input[@name='email']")
    public WebElement email;

    @FindBy(xpath = "//input[@name='mobilePhoneNumber']")
    public WebElement phoneNumber;

    @FindBy(xpath = "//input[@name='mobilePhoneNumber']")
    public WebElement mobilePhoneNumber;

    @FindBy(xpath = "//*[@id=\"tp-customer-phoneNumber\"]")
    public WebElement phoneNumberC;

    @FindBy(xpath = "//input[@name='zipCode']")
    public WebElement zipCode;

    @FindBy(xpath = "//input[@name='address']")
    public WebElement address;

    @FindBy(xpath = "//input[@id='tp-customer-city']")
    public WebElement city;

    @FindBy(xpath = "//input[@name='ssn']")
    public WebElement ssn;

    @FindBy(xpath = "//input[@name='createDate']")
    public WebElement createDate;

    @FindBy(xpath = "//input[@name='zelleEnrolled']")
    public WebElement zelleEnrolled;
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement save;

    @FindBy(xpath = "(//a[@aria-haspopup='true'])[2]")
    public WebElement myOperationsButton;

    @FindBy(xpath = "//span[normalize-space()='Manage Customers']")
    public WebElement manageCustomer;

    @FindBy(xpath = "//a[@class='btn btn-primary float-right jh-create-entity']")
    public WebElement createCustomer;


    @FindBy(xpath = "//option[@value='131776']")
    public WebElement mfy;


}