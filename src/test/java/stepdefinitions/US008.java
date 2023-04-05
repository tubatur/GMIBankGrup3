package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.PagesRT;
import utilities.ConfigReader;
import utilities.Driver;

public class US008 {
    PagesRT pagesRT = new PagesRT();
    Faker faker = new Faker();


    @When("The old password should not be used")
    public void theOldPasswordShouldNotBeUsed() {
        pagesRT.signInRegister.click();

    }

    @And("There should be at least {int} lowercase char for stronger password and see the level chart change accordingly")
    public void thereShouldBeAtLeastLowercaseCharForStrongerPasswordAndSeeTheLevelChartChangeAccordingly(int arg0) {
    }

    @And("There should be at least {int} uppercase char and see the level  chart change accordingly")
    public void thereShouldBeAtLeastUppercaseCharAndSeeTheLevelChartChangeAccordingly(int arg0) {
    }

    @And("There should be at least {int} digit  and see the level  chart change accordingly")
    public void thereShouldBeAtLeastDigitAndSeeTheLevelChartChangeAccordingly(int arg0) {
    }

    @And("There should be at least {int} special char and see the level bar change accordingly")
    public void thereShouldBeAtLeastSpecialCharAndSeeTheLevelBarChangeAccordingly(int arg0) {
    }

    @Then("The new passwoerd should be confirmed")
    public void theNewPasswoerdShouldBeConfirmed() {
    }
}
