package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.junit.Ignore;
import org.openqa.selenium.Keys;
import pages.PagesMZ;
import utilities.ConfigReader;
import utilities.Driver;

import static utilities.Driver.driver;

public class US005 {

    PagesMZ pagesMZ = new PagesMZ();

    Faker faker = new Faker();

    String actual;

    String expected;

    @Ignore
    @Given("User goes to {string} web page") //Hook Class kullanilirsa gerek olmadigi icin atladim
    public void userGoesToWebPage(String arg0) {
       Driver.getDriver().get(ConfigReader.getProperty("projectUrl"));
       Driver.waitBasic(3);
    }

    @When("User cannot login with invalid username validating the error message")
    public void userCannotLoginWithInvalidUsernameValidatingTheErrorMessage() {
        pagesMZ.accountMenu.click();
        pagesMZ.signIn.click();
        pagesMZ.username.sendKeys(faker.name().username()+ Keys.TAB);
        pagesMZ.password.sendKeys(ConfigReader.getProperty("userpassword"));
        pagesMZ.signInButton.click();

        expected="Failed to sign in!";
        actual= String.valueOf(pagesMZ.failedToSignIn);

        Assert.assertTrue(actual.contains(expected));

        Driver.waitBasic(2);

        driver.navigate().to(ConfigReader.getProperty("projectUrl"));

        Driver.waitBasic(2);

    }

    @And("User cannot login with invalid password validating the error message")
    public void userCannotLoginWithInvalidPasswordValidatingTheErrorMessage() {
        pagesMZ.accountMenu.click();
        pagesMZ.signIn.click();
        pagesMZ.username.sendKeys(ConfigReader.getProperty("user")+Keys.TAB);
        pagesMZ.password.sendKeys(faker.internet().password());
        pagesMZ.signInButton.click();

        expected="Failed to sign in!";
        actual= String.valueOf(pagesMZ.failedToSignIn);

        Assert.assertTrue(actual.contains(expected));

        Driver.waitBasic(2);

        driver.navigate().back();

        Driver.waitBasic(2);

    }

    @And("User cannot login with invalid username and password validating the error message")
    public void userCannotLoginWithInvalidUsernameAndPasswordValidatingTheErrorMessage() {
        pagesMZ.accountMenu.click();
        pagesMZ.signIn.click();
        pagesMZ.username.sendKeys(faker.name().username());
        pagesMZ.password.sendKeys(faker.internet().password());
        pagesMZ.signInButton.click();

        expected="Failed to sign in!";
        actual= String.valueOf(pagesMZ.failedToSignIn);

        Assert.assertTrue(actual.contains(expected));

        Driver.waitBasic(2);

        driver.navigate().back();

        Driver.waitBasic(2);
    }

    @And("User with invalid credentials should be given an option to reset their password")
    public void userWithInvalidCredentialsShouldBeGivenAnOptionToResetTheirPassword() {
        pagesMZ.accountMenu.click();
        pagesMZ.signIn.click();
        pagesMZ.username.sendKeys(ConfigReader.getProperty("user")+Keys.TAB);
        pagesMZ.password.sendKeys(faker.internet().password());
        pagesMZ.signInButton.click();
        Driver.waitBasic(2);

        pagesMZ.forgetpassword.click();
        Driver.waitBasic(2);

        Assert.assertTrue(pagesMZ.resetPasswordButton.isDisplayed());
        Driver.waitBasic(2);

        driver.navigate().to(ConfigReader.getProperty("projectUrl"));

        Driver.waitBasic(2);
    }

    @Then("User should be given the option to navigate to registration page if they did not register yet")
    public void userShouldBeGivenTheOptionToNavigateToRegistrationPageIfTheyDidNotRegisterYet() {
        pagesMZ.accountMenu.click();
        pagesMZ.signIn.click();
        pagesMZ.username.sendKeys(faker.name().username());
        pagesMZ.registeranewaccount.click();
        Driver.waitBasic(2);
        Assert.assertEquals(pagesMZ.registrationtitel.getText(),"Registration");

    }
}
