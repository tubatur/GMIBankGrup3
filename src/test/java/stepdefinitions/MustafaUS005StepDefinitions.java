package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.ConfigReader;
import utilities.Driver;

public class MustafaUS005StepDefinitions {
    @Given("User goes to {string} web page")
    public void userGoesToWebPage(String arg0) {
    }

    @When("User cannot login with invalid username validating the error message")
    public void userCannotLoginWithInvalidUsernameValidatingTheErrorMessage() {
    }

    @And("User cannot login with invalid password validating the error message")
    public void userCannotLoginWithInvalidPasswordValidatingTheErrorMessage() {
    }

    @And("User cannot login with invalid username and password validating the error message")
    public void userCannotLoginWithInvalidUsernameAndPasswordValidatingTheErrorMessage() {
    }

    @And("User with invalid credentials should be given an option to reset their password")
    public void userWithInvalidCredentialsShouldBeGivenAnOptionToResetTheirPassword() {
    }

    @Then("User should be given the option to navigate to registration page if they did not register yet")
    public void userShouldBeGivenTheOptionToNavigateToRegistrationPageIfTheyDidNotRegisterYet() {
    }
}
