package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.ConfigReader;
import utilities.Driver;

public class PagesRT {

    public PagesRT () {PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy(xpath="(//a[@aria-expanded='true'])[1]")
    public WebElement signInRegister;

    @FindBy(xpath="(//span[normalize-space()='Sign in'])[1]")
    public WebElement signIn;

    @FindBy(xpath="(//input[@id='username'])[1]")
    public WebElement username;

    @FindBy(xpath="(//input[@id='password'])[1]")
    public WebElement newPassword;

    @FindBy(xpath="(//span[contains(text(),'Sign in')])[3]")
    public WebElement signInButon;

    @FindBy(xpath="(//span[normalize-space()='rabia turpcu'])[1]")
    public WebElement userNameAndSurname;

    @FindBy(xpath="(//span[normalize-space()='User Info'])[1]")
    public WebElement userInfo;




}
