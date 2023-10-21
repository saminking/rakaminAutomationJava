package cucumber.stepDefinition;

import cucumber.pages.homePage;
import cucumber.pages.loginPage;
import cucumber.utility.driverConfig;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.assertEquals;

public class loginSteps {
    @Autowired
    loginPage loginpage;
    homePage homepage;


    @And("^user click login button$")
    public void userClickLoginButton() {
        loginpage.clickLoginButton();
    }

    @Then("^user directed to product menu$")
    public void userDirectedToProductMenu() {
        assertEquals(homePage.productPageTitle, "Products");
    }

    @When("user input user name {string}")
    public void userInputUserNameUserName(String userName) {
        loginpage.setUserNameInput(userName);
    }

    @And("user input password {string}")
    public void userInputPasswordPassword(String password) {
        loginpage.setPasswordInput(password);
    }

    @Given("user in login page")
    public void userInLoginPage() {
        loginpage.goToSauce();
    }

    @Then("error message shown")
    public void errorMessageShown() {
        assertEquals(loginpage.errorLockedShown(), "Epic sadface: Sorry, this user has been locked out.");
    }
}
