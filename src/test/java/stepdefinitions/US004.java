package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.PagesTT;
import utilities.ConfigReader;
import utilities.Driver;

public class US004 {

    PagesTT pagesTT = new PagesTT();
    @Given("I am on the login page")
    public void iAmOnTheLoginPage() {

        Driver.getDriver().get(ConfigReader.getProperty("projectUrl"));
    }

    @When("I clicked the profile icon")
    public void iClickedTheProfileIcon() {
        pagesTT.profileIcon.click();

    }

    @When("I clicked the sign in button")
    public void iClickedTheSignInButton() {
        pagesTT.signIn.click();
    }

    @When("I enter valid username and password")
    public void iEnterValidUsernameAndPassword() {
        pagesTT.username.sendKeys(ConfigReader.getProperty("adminUserName"));

        pagesTT.password.sendKeys(ConfigReader.getProperty("adminPassword"));

    }

    @When("I click the Sign in button")
    public void iClickTheSignInButton() {
        pagesTT.singIn2.click();

    }

    @Then("I should see the Admin Strator near the profile icon")
    public void iShouldSeeTheAdminStratorNearTheProfileIcon() {

        Assert.assertEquals("Admin Strator",pagesTT.adminStrator.getText());
    }

    @When("I enter invalid username and password")
    public void iEnterInvalidUsernameAndPassword() {
        pagesTT.username.sendKeys(ConfigReader.getProperty("adminUserName")+ 0);

        pagesTT.password.sendKeys(ConfigReader.getProperty("adminPassword"));
    }

    @Then("I should see the fail message")
    public void iShouldSeeTheFailMessage() {

        Assert.assertTrue("failed" , pagesTT.failText.isDisplayed());
    }
}
