package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class PagesTT {

    public PagesTT(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(css = "li[id='account-menu'] a[class='dropdown-toggle nav-link']")
    public WebElement profileIcon;
    @FindBy(css = "a[id='login-item'] span")
    public WebElement signIn;
    @FindBy(xpath = "//input[@id='username']")
    public WebElement username;
    @FindBy(xpath = "//input[@id='password']")
    public WebElement password;
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement singIn2;
    @FindBy(xpath = "//span[normalize-space()='Admin Strator']")
    public WebElement adminStrator;
    @FindBy(css = "div[role='alert'] span strong")
    public WebElement failText;
    @FindBy(css = "button[class='btn btn-secondary'] span")
    public WebElement cancel;


    @FindBy(css = "li[id='entity-menu'] a[class='dropdown-toggle nav-link'] span")
    public WebElement myOperations;

    @FindBy(xpath = "//span[normalize-space()='Manage Customers']")
    public WebElement manageCustomers;

    @FindBy(css = "a[href='/tp-customer/9595/edit?page=1&sort=id,asc']")
    public WebElement edit;

    @FindBy(xpath = "//input[@id='tp-customer-address']")
    public WebElement address;

    @FindBy(xpath = "//input[@id='tp-customer-city']")
    public WebElement city;

    @FindBy(xpath = "//select[@id='tp-customer-country']")
    public WebElement country;

    @FindBy(xpath = "//input[@id='tp-customer-state']")
    public WebElement state;











}
