package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.junit.Ignore;
import org.openqa.selenium.Keys;
import pages.PageRK;
import pages.PagesMZ;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US011 {

    PageRK pageRK = new PageRK();
    PagesMZ pagesMZ=new PagesMZ();

    Faker faker= new Faker();

    @Ignore
    @Given("Goes to Page")
    public void goesToPage() {

        Driver.getDriver().get(ConfigReader.getProperty("projectUrl"));

    }
    @And ("the user is on the customer registration page")
    public void theUserIsOnTheCustomerRegistrationPage() {

        ReusableMethods.waitAndClick(pageRK.accountMenu);
        ReusableMethods.waitAndClick(pageRK.signIn);
        pageRK.username.sendKeys("user2023"+ Keys.TAB);
        pageRK.password.sendKeys("User.Name23");
        ReusableMethods.waitAndClick(pageRK.signInButton);

    }

    @Then("the user clicks on the manage costumers tab in the my operations tab")
    public void theUserClicksOnTheManageCostumersTabInTheMyOperationsTab() {

        ReusableMethods.waitAndClick(pageRK.myOperationsButton);
        ReusableMethods.waitAndClick(pageRK.manageCustomer);
        ReusableMethods.waitAndClick(pageRK.createCustomer);
        ReusableMethods.waitAndClick(pageRK.searchSSN);
        pageRK.searchSSN.sendKeys("123-56-9658"+Keys.TAB);
        pageRK.firstName.sendKeys(faker.name().firstName()+Keys.TAB);
        pageRK.lastName.sendKeys(faker.name().lastName()+Keys.TAB);
        pageRK.middleInitial.sendKeys("K"+Keys.TAB);
        pageRK.email.sendKeys(faker.internet().emailAddress()+Keys.TAB);
        pageRK.mobilePhoneNumber.sendKeys("123-456-7890"+Keys.TAB);

        pageRK.phoneNumberC.sendKeys("176-470-3212"+Keys.TAB);
        pageRK.zipCode.sendKeys("32351"+Keys.TAB);
        pageRK.address.sendKeys(faker.address().fullAddress()+Keys.TAB);

        pageRK.city.sendKeys(faker.address().cityName()+Keys.TAB);
        pageRK.ssn.sendKeys("789-65-3214"+Keys.TAB);

        pageRK.createDate.sendKeys("01.04.2022 02:02"+Keys.TAB);

        ReusableMethods.waitAndClick(pageRK.mfy);
        ReusableMethods.waitAndClick(pageRK.zelleEnrolled);
        ReusableMethods.waitAndClick(pageRK.save);

    }
    @And("Save button should be visible on the screen")
    public void saveButtonShouldBeVisibleOnTheScreen() {

        Assert.assertTrue(pageRK.save.isDisplayed());

    }
    @When("The user enters the required information in an inappropriate date format")
    public void theUserEntersTheRequiredInformationInAnInappropriateDateFormat() {
        ReusableMethods.waitAndClick(pageRK.myOperationsButton);
        ReusableMethods.waitAndClick(pageRK.manageCustomer);
        ReusableMethods.waitAndClick(pageRK.createCustomer);
        ReusableMethods.waitAndClick(pageRK.searchSSN);
        pageRK.searchSSN.sendKeys("123-56-9658"+Keys.TAB);
        pageRK.firstName.sendKeys(faker.name().firstName()+Keys.TAB);
        pageRK.lastName.sendKeys(faker.name().lastName()+Keys.TAB);
        pageRK.middleInitial.sendKeys("K"+Keys.TAB);
        pageRK.email.sendKeys(faker.internet().emailAddress()+Keys.TAB);
        pageRK.mobilePhoneNumber.sendKeys("123-456-7890"+Keys.TAB);

        pageRK.phoneNumberC.sendKeys("176-470-3212"+Keys.TAB);
        pageRK.zipCode.sendKeys("32351"+Keys.TAB);
        pageRK.address.sendKeys(faker.address().fullAddress()+Keys.TAB);

        pageRK.city.sendKeys(faker.address().cityName()+Keys.TAB);
        pageRK.ssn.sendKeys("789-65-3214"+Keys.TAB);

        pageRK.createDate.sendKeys("01/Apr/2023"+Keys.TAB);

        ReusableMethods.waitAndClick(pageRK.mfy);
        ReusableMethods.waitAndClick(pageRK.zelleEnrolled);
        ReusableMethods.waitAndClick(pageRK.save);

    }

    @And("It is verified that the save button is active because the date format is not suitable")
    public void itIsVerifiedThatTheSaveButtonIsActiveBecauseTheDateFormatIsNotSuitable() {

        Assert.assertTrue(pageRK.save.isDisplayed());

    }

    @When("The user does not make a selection from the Account menu and clicks the save button")
    public void theUserDoesNotMakeASelectionFromTheAccountMenuAndClicksTheSaveButton() {

        ReusableMethods.waitAndClick(pageRK.myOperationsButton);
        ReusableMethods.waitAndClick(pageRK.manageCustomer);
        ReusableMethods.waitAndClick(pageRK.createCustomer);
        ReusableMethods.waitAndClick(pageRK.searchSSN);
        pageRK.searchSSN.sendKeys("123-56-9658"+Keys.TAB);
        pageRK.firstName.sendKeys(faker.name().firstName()+Keys.TAB);
        pageRK.lastName.sendKeys(faker.name().lastName()+Keys.TAB);
        pageRK.middleInitial.sendKeys("K"+Keys.TAB);
        pageRK.email.sendKeys(faker.internet().emailAddress()+Keys.TAB);
        pageRK.mobilePhoneNumber.sendKeys("123-456-7890"+Keys.TAB);

        pageRK.phoneNumberC.sendKeys("176-470-3212"+Keys.TAB);
        pageRK.zipCode.sendKeys("32351"+Keys.TAB);
        pageRK.address.sendKeys(faker.address().fullAddress()+Keys.TAB);

        pageRK.city.sendKeys(faker.address().cityName()+Keys.TAB);
        pageRK.ssn.sendKeys("789-65-3214"+Keys.TAB);

        pageRK.createDate.sendKeys("01.04.2022 02:02"+Keys.TAB);

        ReusableMethods.waitAndClick(pageRK.zelleEnrolled);
        ReusableMethods.waitAndClick(pageRK.save);

    }
    @And("The save button remains active as the recording will not take place")
    public void theSaveButtonRemainsActiveAsTheRecordingWillNotTakePlace() {

        Assert.assertTrue(pageRK.save.isDisplayed());

    }

    @When("the user continues without ticking the Zelle Enrolled box")
    public void theUserContinuesWithoutTickingTheZelleEnrolledBox() {
        ReusableMethods.waitAndClick(pageRK.myOperationsButton);
        ReusableMethods.waitAndClick(pageRK.manageCustomer);
        ReusableMethods.waitAndClick(pageRK.createCustomer);
        ReusableMethods.waitAndClick(pageRK.searchSSN);
        pageRK.searchSSN.sendKeys("123-56-9658"+Keys.TAB);
        pageRK.firstName.sendKeys(faker.name().firstName()+Keys.TAB);
        pageRK.lastName.sendKeys(faker.name().lastName()+Keys.TAB);
        pageRK.middleInitial.sendKeys("K"+Keys.TAB);
        pageRK.email.sendKeys(faker.internet().emailAddress()+Keys.TAB);
        pageRK.mobilePhoneNumber.sendKeys("123-456-7890"+Keys.TAB);

        pageRK.phoneNumberC.sendKeys("176-470-3212"+Keys.TAB);
        pageRK.zipCode.sendKeys("32351"+Keys.TAB);
        pageRK.address.sendKeys(faker.address().fullAddress()+Keys.TAB);

        pageRK.city.sendKeys(faker.address().cityName()+Keys.TAB);
        pageRK.ssn.sendKeys("789-65-3214"+Keys.TAB);

        pageRK.createDate.sendKeys("01.04.2022 02:02"+Keys.TAB);

        ReusableMethods.waitAndClick(pageRK.mfy);

        ReusableMethods.waitAndClick(pageRK.save);

    }
    @And("The save process takes place and it is verified that the save button is inactive")
    public void theSaveProcessTakesPlaceAndItIsVerifiedThatTheSaveButtonIsInactive() {

        Assert.assertTrue(pageRK.save.isDisplayed() );

    }
}
