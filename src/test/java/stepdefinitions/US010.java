package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.JavascriptExecutor;
import pages.PagesTT;
import utilities.ConfigReader;
import utilities.Driver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class US010 {

    PagesTT pagesTT = new PagesTT();
    Faker faker = new Faker();

    @Given("User goes to {string} web page.")
    public void userGoesToWebPage(String arg0) {
        Driver.getDriver().get(ConfigReader.getProperty("projectUrl"));
    }

    @When("User clicks the profile icon")
    public void userClicksTheProfileIcon() {
        pagesTT.profileIcon.click();
    }

    @And("User clicks the sign in button")
    public void userClicksTheSignInButton() {
        pagesTT.signIn.click();
    }

    @And("User enters {string} Manager username as username")
    public void userEntersManagerUsernameAsUsername(String arg0) {
        pagesTT.username.sendKeys(ConfigReader.getProperty("manager"));
    }

    @And("User enters {string} Manager password as password")
    public void userEntersManagerPasswordAsPassword(String arg0) {
       pagesTT.password.sendKeys(ConfigReader.getProperty("managerpassword"));
    }

    @And("User clicks the SignIn 2 button")
    public void userClicksTheSignIn2Button() {
        pagesTT.singIn2.click();
    }

    @And("User clicks My Operations menu")
    public void userClicksMyOperationsMenu() {
        pagesTT.myOperations.click();
    }

    @And("User clicks Manage Customers menu")
    public void userClicksManageCustomersMenu() {
        pagesTT.manageCustomers.click();
    }

    @And("User clicks Edit button")
    public void userClicksEditButton() {
        pagesTT.edit.click();
    }

    @And("User scrolls mouse down")
    public void userScrollsMouseDown() {
        JavascriptExecutor Scrool = (JavascriptExecutor) Driver.getDriver();
        Scrool.executeScript("window.scrollBy(0,300)", "");
        Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

        @And("User clicks on address")
        public void userClicksOnAddress () {
        pagesTT.address.click();
        }

        @And("Address as street and number should be provided")
        public void addressAsStreetAndNumberShouldBeProvided () {
            pagesTT.address.sendKeys(faker.address().streetAddressNumber());
        }

       @And("User clicks on city")
       public void userClicksOnCity() {
        pagesTT.city.click();

        }

        @And("City should be provided")
         public void cityShouldBeProvided() {
        pagesTT.city.sendKeys(faker.address().cityName());

    }

        @And("User clicks on Country")
        public void userClicksOnCountry() {
        pagesTT.country.click();
    }

        @And("Country should be typed")
        public void countryShouldBeTyped () {
        pagesTT.country.sendKeys(faker.address().country());
        }

        @And("User clicks on State")
        public void userClicksOnState() {
        pagesTT.state.click();
        }

        @And("State should be provided as US state")
        public void stateShouldBeProvidedAsUSState () {
        pagesTT.state.sendKeys("US");

        }
}




