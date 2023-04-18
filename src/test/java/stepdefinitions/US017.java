package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import pages.PagesTT;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.concurrent.TimeUnit;

public class US017 {

    PagesTT pagesTT = new PagesTT();
    @Given("User goes to the home page")
    public void userGoesToTheHomePage() {
        Driver.getDriver().get(ConfigReader.getProperty("projectUrl"));
    }

    @And("User enters {string} Administrator username as username")
    public void userEntersAdministratorUsernameAsUsername(String arg0) {
        pagesTT.username.sendKeys(ConfigReader.getProperty("administrator"));
    }

    @And("User enters {string} Administrator password as password")
    public void userEntersAdministratorPasswordAsPassword(String arg0) {
        pagesTT.password.sendKeys(ConfigReader.getProperty("adminpassword"));
    }

    @And("User clicks the Administration menu")
    public void userClicksTheAdministrationMenu() {
        ReusableMethods.waitAndClick(pagesTT.administration);
    }

    @And("User clicks User management menu")
    public void userClicksUserManagementMenu() {
        ReusableMethods.waitAndClick(pagesTT.userManagement);
    }

    @And("User verifies Deactivated for ROLE_USER profile")
    public void userVerifiesDeactivatedForROLE_USERProfile() {
        pagesTT.deactivatedROLE_USER.isEnabled();
    }

    @And("User verifies Deactivated for ROLE_EMPLOYEE profile")
    public void userVerifiesDeactivatedForROLE_EMPLOYEEProfile() {
        pagesTT.deactivatedROLE_EMPLOYEE.isEnabled();
    }

    @And("User verifies Deactivated for ROLE_MANAGER profile")
    public void userVerifiesDeactivatedForROLE_MANAGERProfile() {
        pagesTT.deactivatedROLE_MANAGER.isEnabled();
    }

    @And("User verifies Deactivated for ROLE_ADMIN profile")
    public void userVerifiesDeactivatedForROLE_ADMINProfile() {
       // JavascriptExecutor Scrool = (JavascriptExecutor) Driver.getDriver();
       // Scrool.executeScript("window.scrollBy(0,300)", "");
       // Driver.getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        pagesTT.deactivatedROLE_ADMIN.isEnabled();
    }

    @And("User clicks View button for ROLE_ADMIN profile")
    public void userClicksViewButtonForROLE_ADMINProfile() {
        ReusableMethods.waitAndClick(pagesTT.viewROLE_ADMIN);
    }

    @And("User verifies the output text")
    public void userVerifiesTheOutputText() {
        Assert.assertEquals("User",pagesTT.outputTextROLE_ADMIN.getText());
    }

    @And("User clicks the Back button")
    public void userClicksTheBackButton() {
        ReusableMethods.waitAndClick(pagesTT.back);
    }

    @And("User clicks Edit button for ROLE_MANAGER profile")
    public void userClicksEditButtonForROLE_MANAGERProfile() {
        ReusableMethods.waitAndClick(pagesTT.editROLE_MANAGER);
    }

    @And("User verifies the output text.")
    public void userVerifiesTheOutputCreateOrEditAUserText() {
        Assert.assertEquals("Create or edit a user",pagesTT.outputTextROLE_MANAGER.getText());
    }

    @And("User clicks Delete button for ROLE_EMPLOYEE profile")
    public void userClicksDeleteButtonForROLE_EMPLOYEEProfile() {
        ReusableMethods.waitAndClick(pagesTT.deleteROLE_EMPLOYEE);
    }

    @And("User verifies the output text..")
    public void userVerifiesTheOutputConfirmDeleteOperationText() {
        Assert.assertEquals("Confirm delete operation",pagesTT.outputTextROLE_EMPLOYEE.getText());
    }

    @Then("User confirms that they can click the delete key")
    public void userConfirmsThatTheyCanClickTheDeleteKey() {
        pagesTT.deleteButton.isEnabled();
    }
}
