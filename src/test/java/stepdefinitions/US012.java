package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.junit.Ignore;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import pages.PagesMZ;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.List;

public class US012 {

    PagesMZ pagesMZ = new PagesMZ();

    Faker faker = new Faker();

    String actual;

    String expected;


    @When("Login to the system with employee account")
    public void loginToTheSystemWithEmployeeAccount()  {
        pagesMZ.accountMenu.click();
        pagesMZ.signIn.click();
        pagesMZ.username.sendKeys(ConfigReader.getProperty("employee")+ Keys.TAB);
        pagesMZ.password.sendKeys(ConfigReader.getProperty("employeepassword"));
        pagesMZ.signInButton.click();

        Driver.waitBasic(2);

    }

    @And("Click on  manage customers tab under the my operations tab")
    public void clickOnManageCustomersTabUnderTheMyOperationsTab()  {
        pagesMZ.myoperations.click();
        Driver.waitBasic(1);
        pagesMZ.managecustomers.click();
        Driver.waitBasic(2);
    }

    @And("Test that the customer has First Name  Last Name  Middle Initial  Email  Mobile Phone Number  Phone Number  Address  Create Date information")
    public void testThatTheCustomerHasFirstNameLastNameMiddleInitialEmailMobilePhoneNumberPhoneNumberAddressCreateDateInformation() {
        List<WebElement> customersinfo =pagesMZ.custumerswebtablesheader;

        for (WebElement veri : customersinfo) {
            Assert.assertTrue(veri.getText().contains("First Name"));
            Assert.assertTrue(veri.getText().contains("Last Name"));
            Assert.assertTrue(veri.getText().contains("Middle Initial"));
            Assert.assertTrue(veri.getText().contains("Email"));
            Assert.assertTrue(veri.getText().contains("Mobile Phone Number"));
            Assert.assertTrue(veri.getText().contains("Phone Number"));
            Assert.assertTrue(veri.getText().contains("Address"));
            Assert.assertTrue(veri.getText().contains("Create Date"));
        }
        Driver.waitBasic(2);
    }

    @And("Test that there is a View{string}Edit buttons in the {string} tab and test that there is an  button at the bottom after pressing this button")
    public void testThatThereIsAViewEditButtonsInTheTabAndTestThatThereIsAnButtonAtTheBottomAfterPressingThisButton(String arg0, String arg1) {
        Assert.assertTrue(pagesMZ.viewilkeleman.isDisplayed());
        Assert.assertTrue(pagesMZ.editilkeleman.isDisplayed());
        Driver.waitBasic(2);
    }

    @And("Test that the Edit button appears at the bottom of the page that appears when I click the {string} button for any customer in the {string} tab")
    public void testThatTheEditButtonAppearsAtTheBottomOfThePageThatAppearsWhenIClickTheButtonForAnyCustomerInTheTab(String arg0, String arg1) {
        pagesMZ.viewilkeleman.click();
        Assert.assertTrue(pagesMZ.editiceleman.isDisplayed());
        Driver.waitBasic(2);
    }

    @And("Test that the Create or edit a Customer title appears after clicking the {string} button inside the customer page")
    public void testThatTheCreateOrEditACustomerTitleAppearsAfterClickingTheButtonInsideTheCustomerPage(String arg0) {
        pagesMZ.editiceleman.click();
        Assert.assertEquals("Create or edit a Customer",pagesMZ.createoredittitle.getText());
        Driver.waitBasic(2);
    }

    @Then("Again, on the Manage Customers page, test that the text that appears when the Delete button is pressed for any customer includes the message sure you want to delete")
    public void againOnTheManageCustomersPageTestThatTheTextThatAppearsWhenTheDeleteButtonIsPressedForAnyCustomerIncludesTheMessageSureYouWantToDelete() {
        Driver.getDriver().navigate().back();
        Driver.waitBasic(2);
        pagesMZ.deleteilkeleman.click();
        Driver.waitBasic(2);
        Assert.assertTrue(pagesMZ.deletesuremessage.getText().contains("sure you want to delete"));
    }
}
