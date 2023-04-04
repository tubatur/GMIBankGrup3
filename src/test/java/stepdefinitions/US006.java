package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.ConfigReader;
import utilities.Driver;

public class US006 {

    @Given("User goes to {string} page")
    public void userGoesToPage(String arg0) {
        Driver.getDriver().get(ConfigReader.getProperty("projectUrl"));
        Driver.waitBasic(2);
    }

    @When("There should be user info being populated when navigating to user info {string}")
    public void thereShouldBeUserInfoBeingPopulatedWhenNavigatingToUserInfo(String arg0) {
    }

    @And("There should be {int} languages available {string}")
    public void thereShouldBeLanguagesAvailable(int arg0, String arg1) {
    }

    @And("There should be an option to update firstname")
    public void thereShouldBeAnOptionToUpdateFirstname() {
    }

    @And("There should be an option to update lastname")
    public void thereShouldBeAnOptionToUpdateLastname() {
    }

    @Then("There should be an option to update email id adding {string} sign and {string} extension")
    public void thereShouldBeAnOptionToUpdateEmailIdAddingSignAndExtension(String arg0, String arg1) {
    }




}
