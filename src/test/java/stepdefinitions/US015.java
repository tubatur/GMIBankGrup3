package stepdefinitions;

import io.cucumber.java.en.And;
import org.junit.Assert;
import pages.PagesTT;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US015 {

    PagesTT pagesTT = new PagesTT();

    @And("User enters {string} User username as username")
    public void userEntersUserUsernameAsUsername(String arg0) {
        pagesTT.username.sendKeys(ConfigReader.getProperty("user"));
    }

    @And("User enters {string} User password as password")
    public void userEntersUserPasswordAsPassword(String arg0) {
       pagesTT.password.sendKeys(ConfigReader.getProperty("userpassword"));
    }

    @And("User sees user menu and is verified to be in the user account")
    public void userSeesUserMenuAndIsVerifiedToBeInTheUserAccount() {
        String expectedResult = "user 2023";
        String actualResult = pagesTT.user.getText();
        Assert.assertEquals(expectedResult, actualResult);
    }

    @And("User clicks Manage Accounts menu")
    public void userClicksManageAccountsMenu() {
        ReusableMethods.waitAndClick(pagesTT.manageAccounts);
    }

    @And("User verifies that he sees Balance as table header")
    public void userVerifiesThatHeSeesBalanceAsTableHeader() {
        String expectedResult = "Balance";
        String actualResult = pagesTT.balance.getText();
        Assert.assertEquals(expectedResult, actualResult);
    }

    @And("User verifies that he sees Account Type as table header")
    public void userVerifiesThatHeSeesAccountTypeAsTableHeader() {
        String expectedResult = "Account Type";
        String actualResult = pagesTT.accountType.getText();
        Assert.assertEquals(expectedResult, actualResult);
    }

    @And("User clicks View button")
    public void userClicksViewButton() {
        ReusableMethods.waitAndClick(pagesTT.view);
    }

    @And("User confirms to see the heading Account")
    public void userConfirmsToSeeTheHeadingAccount() {

        Driver.waitBasic(2);

        Assert.assertTrue(pagesTT.account.isDisplayed());
    }
    }

