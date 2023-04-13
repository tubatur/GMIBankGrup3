package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.junit.Ignore;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import pages.PagesMZ;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.List;

import static utilities.Driver.driver;

public class US013 {

    PagesMZ pagesMZ = new PagesMZ();

    Faker faker = new Faker();

    Select select;

    String actual;

    String expected;



    @When("Login to the systemm with employee account")
    public void loginToTheSystemmWithEmployeeAccount() {
        pagesMZ.accountMenu.click();
        pagesMZ.signIn.click();
        pagesMZ.username.sendKeys(ConfigReader.getProperty("employee")+ Keys.TAB);
        pagesMZ.password.sendKeys(ConfigReader.getProperty("employeepassword"));
        pagesMZ.signInButton.click();
        Driver.waitBasic(3);
    }

    @And("Click on  manage accounts tab under the my operations tab")
    public void clickOnManageAccountsTabUnderTheMyOperationsTab() {
        pagesMZ.myoperations.click();
        Driver.waitBasic(3);
        pagesMZ.manageaccounts.click();
        Driver.waitBasic(3);

    }

    @And("Click on Create a new Account")
    public void clickOnCreateANewAccount() {
        pagesMZ.createanewaccount.click();
        Driver.waitBasic(3);

    }

    @And("User should create a description for the new account and it cannot be blank")
    public void userShouldCreateADescriptionForTheNewAccountAndItCannotBeBlank() {
        pagesMZ.description.sendKeys(faker.lorem().sentence());

        Driver.waitBasic(3);

        JavascriptExecutor js = (JavascriptExecutor) driver;

        String script = js.executeScript("return document.getElementById('tp-account-description').value").toString();

        boolean aa=script.isBlank();

        Assert.assertFalse(aa);

        Driver.waitBasic(3);

    }

    @And("User should provide a balance for the first time account creation as Dollar")
    public void userShouldProvideABalanceForTheFirstTimeAccountCreationAsDollar() {
        pagesMZ.balance.sendKeys(faker.number().digits(3));
        Driver.waitBasic(3);

    }

    @And("User can select an account type as CHECKING, SAVING, CREDIT_CARD or INVESTING and Account status should be defined as ACTIVE, SUSPENDED or CLOSED")
    public void userCanSelectAnAccountTypeAsCHECKINGSAVINGCREDIT_CARDOrINVESTINGAndAccountStatusShouldBeDefinedAsACTIVESUSPENDEDOrCLOSED() {

       new Select( pagesMZ.accountType).selectByVisibleText("CREDIT_CARD");
       Driver.waitBasic(3);

       new Select( pagesMZ.accountStatusType).selectByVisibleText("SUESPENDED");
       Driver.waitBasic(3);

    }

    @And("User can select an employee from the drop-down")
    public void userCanSelectAnEmployeeFromTheDropDown() {
        Select stateDropdown=new Select(pagesMZ.employeedropdown);
        List<WebElement> stateList=stateDropdown.getOptions();
        Assert.assertEquals(1,stateList.size());
        Driver.waitBasic(3);

    }

    @Then("Save,Back and control to the Account list")
    public void backAndControlToTheAccountList() {
       pagesMZ.savebutton.click();
        Driver.waitBasic(3);
        Assert.assertTrue(pagesMZ.accounttittle.isDisplayed());

    }
}
