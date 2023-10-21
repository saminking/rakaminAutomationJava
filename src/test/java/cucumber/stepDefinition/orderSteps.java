package cucumber.stepDefinition;

import cucumber.pages.cartPage;
import cucumber.pages.checkoutPage;
import cucumber.pages.homePage;
import cucumber.pages.loginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;
import static org.junit.Assert.assertEquals;

public class orderSteps {
    @Autowired
    homePage homepage;
    checkoutPage checkoutpage;
    cartPage cartpage;
    loginPage loginpage;

    @Given("user in products page")
    public void userInProductsPage() {
        assertEquals(homepage.productTitle(), "Products");
    }

    @When("user add to cart product number one")
    public void userAddToCartProductNumber() {
        homepage.clickAddToCart();
    }

    @Then("user cart amount is increased to {string}")
    public void userCartAmountIsIncreasedTo(String amount) {
        assertEquals(homepage.itemAmountInCart(), amount);
    }

    @Given("user in cart page")
    public void userInCartPage() {
        homepage.goToCartMenu();
    }

    @When("user click check out button")
    public void userClickCheckOutButton() {
        cartpage.checkoutClick();
    }

    @Then("user directed to checkout page")
    public void userDirectedToCheckoutPage() {
        assertEquals(checkoutpage.getCheckoutTitle(), "Checkout: Your Information");
    }

    @Given("user in checkout page")
    public void userInCheckoutPage() {
        assertEquals(checkoutpage.getCheckoutTitle(), "Checkout: Your Information");
    }

    @When("user input first name {string}")
    public void userInputFirstNameBella(String first) {
        checkoutpage.setFirstNameInput(first);

    }

    @And("user input last name {string}")
    public void userInputLastNameSentosa(String last) {
        checkoutpage.setLastNameInput(last);

    }

    @And("user input zip code {string}")
    public void userInputZipCode(String zip) {
        checkoutpage.setZipInput(zip);
    }

    @When("user click continue button")
    public void userClickContinueButton() {
        checkoutpage.clickContinueChekout();
    }

    @Then("user directed to overview page")
    public void userDirectedToOverviewPage() {
        assertEquals(checkoutpage.getCheckoutOverviewTitle(), "Checkout: Overview");
    }

    @Given("user in overview page")
    public void userInOverviewPage() {
        assertEquals(checkoutpage.getCheckoutOverviewTitle(), "Checkout: Overview");
    }

    @When("user click finish")
    public void userClickFinish() {
        checkoutpage.clickFinishCheckout();
    }

    @Then("user directed to thank you page")
    public void userDirectedToThankYouPage() {
        assertEquals(checkoutpage.getCheckoutCompleteTitle(), "Checkout: Complete!");
        assertEquals(checkoutpage.getThankYouMessage(), "Thank you for your order!");
    }

    @When("user click hamburger menu")
    public void userClickHamburgerMenu() {
        homepage.clickHamburger();
    }

    @And("user click logout button")
    public void userClickLogoutButton() {
        homepage.clickLogout();
    }

    @Then("user logout")
    public void userLogout() {
        loginpage.loginMenuDisplayed();
    }
}
