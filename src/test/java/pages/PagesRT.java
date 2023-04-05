package pages;

import org.openqa.selenium.support.PageFactory;
import utilities.ConfigReader;
import utilities.Driver;

public class PagesRT {

    public PagesRT () {
        PageFactory.initElements(Driver.getDriver(),this);


    }
}
