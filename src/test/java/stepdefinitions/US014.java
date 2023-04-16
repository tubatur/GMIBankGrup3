package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import pages.PageRK;
import utilities.ReusableMethods;


public class US014 {
    PageRK pageRK = new PageRK();
    Faker faker = new Faker();


    @When("Go to the account creation page")
    public void goToTheAccountCreationPage() {
        ReusableMethods.waitAndClick(pageRK.accountMenu);
        ReusableMethods.waitAndClick(pageRK.signIn);
        pageRK.username.sendKeys("user2023"+ Keys.TAB);
        pageRK.password.sendKeys("User.Name23");
        ReusableMethods.waitAndClick(pageRK.signInButton);

        ReusableMethods.waitAndClick(pageRK.myOperationsMenu);
        ReusableMethods.waitAndClick(pageRK.manageAccount);
        ReusableMethods.waitAndClick(pageRK.newAccount);

    }

    @And("Required information is filled and the creation date is entered as an old date")
    public void requiredInformationIsFilledAndTheCreationDateIsEnteredAsAnOldDate() {
        ReusableMethods.waitAndClick(pageRK.description);
        pageRK.description.sendKeys("send to money"+Keys.TAB);
        pageRK.balance.sendKeys("100"+Keys.TAB+Keys.TAB+Keys.TAB);
        pageRK.createDateBox.sendKeys("10.10.2010 10:10"+Keys.TAB);
        pageRK.closeDateBox.sendKeys("08.08.2008 08:08"+Keys.TAB);
        ReusableMethods.waitAndClick(pageRK.saveButton);

    }

    @Then("It is verified that your transaction did not occur because the date is outdated")
    public void itIsVerifiedThatYourTransactionDidNotOccurBecauseTheDateIsOutdated() {


        if (pageRK.alertMessage.isDisplayed()) {
            Assert.fail("Uyarı mesajı görüntülendi!");
        } else {
            Assert.assertTrue(true);
        }
    }
}
