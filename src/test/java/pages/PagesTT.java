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
}
