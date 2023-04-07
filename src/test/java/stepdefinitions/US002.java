package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.checkerframework.checker.units.qual.K;
import org.junit.Assert;
import org.junit.Ignore;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.PageRK;
import pages.PagesMZ;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.Random;

public class US002 {

    PageRK pageRK = new PageRK();

    Faker faker = new Faker();

    Actions actions = new Actions(Driver.getDriver());

    @Given("User goes to {string}  homepage")
    public void user_goes_to_homepage(String string) {
        Driver.getDriver().get(ConfigReader.getProperty("projectUrl"));

//invalid email
    }
    @When("Entering the necessary information")
    public void entering_the_necessary_information() {

        ReusableMethods.waitAndClick(pageRK.accountMenu);
        ReusableMethods.waitAndClick(pageRK.registerButton);

        ReusableMethods.waitAndClick(pageRK.emailBox);

        pageRK.emailBox.sendKeys(ReusableMethods.getRandomInvalidEmail(faker)+Keys.TAB);

    }
    @Then("The error message - email is confirmed due to inappropriately formatted information or blank space remaining.")
    public void the_error_message_email_is_confirmed_due_to_inappropriately_formatted_information_or_blank_space_remaining() {


        Driver.waitBasic(3);

        Assert.assertTrue(pageRK.errorMessageEmail.isDisplayed());

    }
    @Then("After the information is entered, the RegisterSubmit button is clicked.")
    public void after_the_information_is_entered_the_register_submit_button_is_clicked() {

        ReusableMethods.waitAndClick(pageRK.registerSubmitButton);
    }
    //invalid SSN
    @When("The page is refreshed and registration with the invalid SSN is performed")
    public void thePageIsRefreshedAndRegistrationWithTheInvalidSSNIsPerformed() {

        ReusableMethods.waitAndClick(pageRK.accountMenu);
        ReusableMethods.waitAndClick(pageRK.registerButton);

        ReusableMethods.waitAndClick(pageRK.SSNBox);

        pageRK.SSNBox.sendKeys("invalidSSNRK"+Keys.TAB);

    }
    @And("The error message is confirmed due to inappropriately formatted information or blank space remaining")
    public void theErrorMessageIsConfirmedDueToInappropriatelyFormattedInformationOrBlankSpaceRemaining() {

        Driver.waitBasic(2);
        Assert.assertTrue(pageRK.errorMessageSSN.isDisplayed());
    }

    @And("After the information is entered, the RegisterSubmit button is clicked")
    public void afterTheInformationIsEnteredTheRegisterSubmitButtonIsClicked() {

        ReusableMethods.waitAndClick(pageRK.registerSubmitButton);
    }


    // invalid password
    @When("If a password with an inappropriate format is entered during the registration process")
    public void ifAPasswordWithAnInappropriateFormatIsEnteredDuringTheRegistrationProcess() {

        ReusableMethods.waitAndClick(pageRK.accountMenu);
        ReusableMethods.waitAndClick(pageRK.registerButton);

        ReusableMethods.waitAndClick(pageRK.newPasswordBox);

        pageRK.SSNBox.sendKeys("inValidPasswordRK"+Keys.TAB);

    }

    @And("Confirms the error message on the screen that the wrong password was entered")
    public void confirmsTheErrorMessageOnTheScreenThatTheWrongPasswordWasEntered() {

        Driver.waitBasic(2);

        Assert.assertTrue(pageRK.errorMessageNewPassword.isDisplayed());


    }
    // bos birakilan kutu
    @When("First name box is left blank and other fields are filled")
    public void firstNameBoxIsLeftBlankAndOtherFieldsAreFilled() {

        ReusableMethods.waitAndClick(pageRK.accountMenu);
        ReusableMethods.waitAndClick(pageRK.registerButton);

        ReusableMethods.waitAndClick(pageRK.firstNameBox);

        pageRK.firstNameBox.sendKeys(""+Keys.TAB);

    }

    @And("A warning message appears indicating that the required field is empty.")
    public void aWarningMessageAppearsIndicatingThatTheRequiredFieldIsEmpty() {

        Assert.assertTrue(pageRK.errorMessageFirstName.isDisplayed());
    }
}
