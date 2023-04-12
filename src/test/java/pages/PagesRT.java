package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.ConfigReader;
import utilities.Driver;

public class PagesRT {

    public PagesRT () {
        PageFactory.initElements(Driver.getDriver(),this);}


}
