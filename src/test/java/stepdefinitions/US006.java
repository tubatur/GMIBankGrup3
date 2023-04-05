package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Ignore;
import org.openqa.selenium.Keys;
import pages.PagesRT;
import utilities.ConfigReader;
import utilities.Driver;

public class US006 {

 PagesRT pageRT = new PagesRT();
 Faker faker = new Faker();


    @Given("User goes to {string} page")
    public void userGoesToPage(String arg0) {
        Driver.getDriver().get(ConfigReader.getProperty("projectUrl"));
        Driver.waitBasic(2);
    }

    @When("There should be user info being populated when navigating to user info {string}")

    public void thereShouldBeUserInfoBeingPopulatedWhenNavigatingToUserInfo(String arg0) {

    pageRT.signInRegister.click();
    pageRT.signIn.click();
    pageRT.username.sendKeys("user2023"+Keys.TAB);
    pageRT.newPassword.sendKeys("User.Name23");
    pageRT.signInButon.click();
    pageRT.userNameAndSurname.click();
    pageRT.userInfo.click();


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
