package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.w3c.dom.html.HTMLInputElement;
import utilities.Driver;


public class PageRK {

    @FindBy(xpath = "(//a[@aria-haspopup='true'])[2]")
    public WebElement accountMenu;

    @FindBy(xpath = "(//span[text()='Register'])[1]")
    public WebElement registerButton;

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
}
