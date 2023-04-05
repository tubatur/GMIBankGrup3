package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.PageRK;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.Random;

public class US002 {

    PageRK pageRK = new PageRK();
    Random random = new Random();
    int randomNum = random.nextInt(1000000000);

    String formattedSSN = String.format("%09d", randomNum);
    String SSNWithDashes = formattedSSN.substring(0, 3) + "-"
            + formattedSSN.substring(3, 5) + "-" + formattedSSN.substring(5);

    Faker faker = new Faker();
    private PageRK pageRk;
    @Given("User goes to {string}  homepage")
    public void userGoesToHomepage(String arg0) {
        Driver.getDriver().get("https://gmibank.com/");
        Driver.waitBasic(1);
    }

    @When("By clicking on the register option on the home screen and entering the necessary information")
    public void byClickingOnTheRegisterOptionOnTheHomeScreenAndEnteringTheNecessaryInformation() {
        Driver.waitBasic(5);
        pageRK.accountMenu.click();
    }

    @And("After the information is entered, the Register button is clicked.")
    public void afterTheInformationIsEnteredTheRegisterButtonIsClicked() {
        pageRK.registerButton.click();
        pageRK.SSNBox.click();
        pageRK.SSNBox.sendKeys(SSNWithDashes);
        pageRK.firstNameBox.sendKeys(faker.name().firstName());
        pageRK.lastNameBox.sendKeys(faker.name().lastName());
        pageRK.addressBox.sendKeys(faker.address().fullAddress());
        pageRK.phoneBox.sendKeys(faker.phoneNumber().phoneNumber());
        pageRK.userNameBox.sendKeys(faker.name().username());

        String randomInvalidEmail = ReusableMethods.getRandomInvalidEmail(new Faker());

        pageRK.emailBox.sendKeys(randomInvalidEmail);

        pageRK.firstPasswordBox.sendKeys(ConfigReader.getProperty("fakePassword"));
        pageRK.secondPasswordBox.sendKeys(ConfigReader.getProperty("fakePassword"));
        pageRK.registerButton.click();
    }

    @Then("the error message is confirmed due to inappropriately formatted information or blank space remaining.")
    public void theErrorMessageIsConfirmedDueToInappropriatelyFormattedInformationOrBlankSpaceRemaining() {
        Assert.assertTrue(ReusableMethods.errorMessage(1).isDisplayed());
    }
}
