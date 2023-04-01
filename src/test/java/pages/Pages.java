package pages;

import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Pages {
    public Pages() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


}
