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

    @FindBy(css = "li[id='account-menu'] a[class='dropdown-toggle nav-link'] span")
    public WebElement user;

    @FindBy(xpath = "//span[normalize-space()='Manage Accounts']")
    public WebElement manageAccounts;

    @FindBy(xpath = "//span[normalize-space()='Balance']")
    public WebElement balance;

    @FindBy(xpath = "//span[normalize-space()='Account Type']")
    public WebElement accountType;

    @FindBy(xpath = "//body[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[9]/div[1]/a[1]")
    public WebElement view;

    @FindBy(xpath = "//span[normalize-space()='Account']")
    public WebElement account;



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


    @FindBy(css = "li[id='admin-menu'] a[class='dropdown-toggle nav-link'] span")
    public WebElement administration;

    @FindBy(xpath = "//span[normalize-space()='User management']")
    public WebElement userManagement;

    @FindBy(css = "tr[id='abidincokyoruldu'] button[type='button'] span")
    public WebElement deactivatedROLE_USER;

    @FindBy(css = "tr[id='mocak'] button[type='button'] span")
    public WebElement deactivatedROLE_EMPLOYEE;

    @FindBy(css = "tr[id='benny'] button[type='button'] span")
    public WebElement deactivatedROLE_MANAGER;

    @FindBy(xpath = "//tr[@id='michael']//span[contains(text(),'Deactivated')]")
    public WebElement deactivatedROLE_ADMIN;

    @FindBy(xpath = "//a[@href='/admin/user-management/michael']//span[@class='d-none d-md-inline']//span[contains(text(),'View')]")
    public WebElement viewROLE_ADMIN;

    @FindBy(css = "div[class='view-routes'] div div h2 span")
    public WebElement outputTextROLE_ADMIN;

    @FindBy(css = "span[class='d-none d-md-inline'] span")
    public WebElement back;

    @FindBy(xpath = "//a[@href='/admin/user-management/benny/edit']//span[@class='d-none d-md-inline']//span[contains(text(),'Edit')]")
    public WebElement editROLE_MANAGER;

    @FindBy(css = "div[class='col-md-8'] h1 span")
    public WebElement outputTextROLE_MANAGER;

    @FindBy(xpath = "//a[@href='/admin/user-management/mocak/delete']//span[@class='d-none d-md-inline']//span[contains(text(),'Delete')]")
    public WebElement deleteROLE_EMPLOYEE;

    @FindBy(xpath = "//span[normalize-space()='Confirm delete operation']")
    public WebElement outputTextROLE_EMPLOYEE;

    @FindBy(xpath = "//button[@type='button']//span[contains(text(),'Delete')]")
    public WebElement deleteButton;




















}
