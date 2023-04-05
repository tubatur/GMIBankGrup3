package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.w3c.dom.html.HTMLInputElement;
import utilities.Driver;


public class PageRK {



    public PageRK() {PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath="(//a[@aria-haspopup='true'])[2]")
    public WebElement accountMenu;

    @FindBy(xpath = "//div[@tabindex='-1']//a[@class='dropdown-item active']")
    public WebElement registerButton;

    @FindBy(xpath = "(//input[@name='ssn']")
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
    public WebElement firstPasswordBox;

    @FindBy(xpath = "//input[@name='secondPassword']")
    public WebElement secondPasswordBox;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement registerSubmitButton;

    @FindBy(xpath = "//div[@class='invalid-feedback']")
    public WebElement errorMessage;

}
