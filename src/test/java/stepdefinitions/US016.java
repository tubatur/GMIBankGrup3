package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.PageRK;
import utilities.ConfigReader;
import utilities.ReusableMethods;

public class US016 {

    PageRK pageRK = new PageRK();

    @When("The user fills in the required fields for money transfer")
    public void theUserFillsInTheRequiredFieldsForMoneyTransfer() {

        ReusableMethods.waitAndClick(pageRK.accountMenu);
        ReusableMethods.waitAndClick(pageRK.signIn);
        pageRK.username.sendKeys(ConfigReader.getProperty("UserRK1") + Keys.TAB);
        pageRK.password.sendKeys(ConfigReader.getProperty("PasswordRK1"));
        ReusableMethods.waitAndClick(pageRK.signInButton);

        ReusableMethods.waitAndClick(pageRK.myOperationsMenu);

        ReusableMethods.waitAndClick(pageRK.transferMoney);
        ReusableMethods.waitAndClick(pageRK.fromBox);
        ReusableMethods.waitAndClick(pageRK.toBox);
        ReusableMethods.waitAndClick(pageRK.balanceBox);
        pageRK.balanceBox.sendKeys("100" + Keys.TAB);
        pageRK.descriptionBox.sendKeys("Money transfer" + Keys.TAB);
        ReusableMethods.waitAndClick(pageRK.makeTransferButton);
    }

    @And("The user does not see an error message on the screen after the transfer takes place")
    public void theUserDoesNotSeeAnErrorMessageOnTheScreenAfterTheTransferTakesPlace() {


        if (pageRK.makeTransferButton.isDisplayed()) {
            Assert.fail("Uyarı mesajı görüntülendi!");
        } else {
            Assert.assertTrue(true);
        }
    }
}



